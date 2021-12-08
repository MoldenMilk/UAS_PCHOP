package com.pbp.uas_pchop.Display;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.pbp.uas_pchop.LoginActivity;
import com.pbp.uas_pchop.Model.User;
import com.pbp.uas_pchop.Preferences.UserPreferences;
import com.pbp.uas_pchop.R;

public class HomeFrag extends Fragment {
    private MaterialButton btnLogout, btnSport, btnClothes, btnGames, btnKitchen;
    private User user;
    private UserPreferences userPreferences;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        userPreferences = new UserPreferences(getContext());
        btnLogout =root.findViewById(R.id.btnLogout);
        btnSport = root.findViewById(R.id.btnSport);
        btnClothes = root.findViewById(R.id.btnClothes);
        btnGames = root.findViewById(R.id.btnGames);
        btnKitchen = root.findViewById(R.id.btnKitchen);
        user = userPreferences.getUserLogin();
        checkLogin();

        btnSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TampilSport.class);
                startActivity(intent);
            }
        });
        btnClothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TampilClothes.class);
                startActivity(intent);
            }
        });
        btnGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TampilGames.class);
                startActivity(intent);
            }
        });
        btnKitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TampilKitchen.class);
                startActivity(intent);
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

        return root;
    }

    private void checkLogin(){
        if(!userPreferences.checkLogin()){
            startActivity(new Intent(getContext(), LoginActivity.class));
            getActivity().finish();
        }else {
            Toast.makeText(getContext(), "Welcome back !", Toast.LENGTH_SHORT).show();
        }
    }
}