package com.pbp.uas_pchop.display;

import static android.app.Activity.RESULT_OK;
import static androidx.core.content.ContextCompat.checkSelfPermission;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.provider.MediaStore;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.pbp.uas_pchop.LoginActivity;
import com.pbp.uas_pchop.model.User;
import com.pbp.uas_pchop.preferences.UserPreferences;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.databinding.FragmentHomeBinding;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class HomeFrag extends Fragment {
    private static final int PERMISSION_REQUEST_CAMERA = 100;
    private static final int CAMERA_REQUEST = 0;
    private static final int GALLERY_PICTURE = 1;
    private Bitmap bitmap = null;
    private String baString;
    private MaterialButton btnLogout, btnCam;
    private User user;
    private UserPreferences userPreferences;
    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        userPreferences = new UserPreferences(getContext());
        btnLogout =binding.getRoot().findViewById(R.id.btnLogout);
        btnCam = binding.getRoot().findViewById(R.id.btnCam);
        user = userPreferences.getUserLogin();
        checkLogin();

        binding.cvSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.action_navigation_home_to_navigation_sport);
            }
        });
        binding.cvClothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.action_navigation_home_to_navigation_clothes);
            }
        });
        binding.cvGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.action_navigation_home_to_navigation_games);
            }
        });
        binding.cvKitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.action_navigation_home_to_navigation_kitchen);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userPreferences.logout();
                Toast.makeText(getContext(), "BYE. HOPE NOT SEE U AGAIN", Toast.LENGTH_SHORT).show();
                checkLogin();
            }
        });

        btnCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater = LayoutInflater.from(binding.getRoot().getContext());
                View selectMediaView = layoutInflater
                        .inflate(R.layout.layout_select_media, null);

                final AlertDialog alertDialog = new AlertDialog
                        .Builder(selectMediaView.getContext()).create();

                Button btnKamera = selectMediaView.findViewById(R.id.btn_kamera);
                Button btnGaleri = selectMediaView.findViewById(R.id.btn_galeri);

                btnKamera.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        if (checkSelfPermission(getContext(), Manifest.permission.CAMERA) ==
                                PackageManager.PERMISSION_DENIED) {
                            String[] permission = {Manifest.permission.CAMERA};
                            requestPermissions(permission, PERMISSION_REQUEST_CAMERA);
                        } else {
                            // Membuka kamera
                            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                            startActivityForResult(intent, CAMERA_REQUEST);
                        }

                        alertDialog.dismiss();
                    }
                });

                btnGaleri.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Membuka galeri
                        Intent intent = new Intent(Intent.ACTION_PICK,
                                MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        startActivityForResult(intent, GALLERY_PICTURE);

                        alertDialog.dismiss();
                    }
                });

                alertDialog.setView(selectMediaView);
                alertDialog.show();
            }
        });

        return binding.getRoot();
    }

    private void checkLogin(){
        if(!userPreferences.checkLogin()){
            startActivity(new Intent(getContext(), LoginActivity.class));
            getActivity().finish();
        }else {
            Toast.makeText(getContext(), "Welcome back !", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == PERMISSION_REQUEST_CAMERA) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Membuka kamera
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_REQUEST);
            } else {
                Toast.makeText(getContext(), "Permission denied.",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data == null)
            return;

        if (resultCode == RESULT_OK && requestCode == GALLERY_PICTURE) {
            Uri selectedImage = data.getData();

            try {
                InputStream inputStream = getContext().getContentResolver().openInputStream(selectedImage);
                bitmap = BitmapFactory.decodeStream(inputStream);
            } catch (Exception e) {
                Toast.makeText(getContext(), e.getMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        } else if (resultCode == RESULT_OK && requestCode == CAMERA_REQUEST) {
            bitmap = (Bitmap) data.getExtras().get("data");
        }

        bitmap = getResizedBitmap(bitmap, 512);
        baString = bitmapToBase64(bitmap);
    }

    private Bitmap getResizedBitmap(Bitmap bitmap, int maxSize) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();

        float bitmapRatio = (float) width / (float) height;

        if (bitmapRatio > 1) {
            width = maxSize;
            height = (int) (width / bitmapRatio);
        } else {
            height = maxSize;
            width = (int) (height * bitmapRatio);
        }

        return Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    private String bitmapToBase64(Bitmap bitmap) {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bao);
        byte[] ba = bao.toByteArray();
        baString = Base64.encodeToString(ba, Base64.DEFAULT);
        return baString;
    }
}