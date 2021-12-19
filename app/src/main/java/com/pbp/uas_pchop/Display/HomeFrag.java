package com.pbp.uas_pchop.Display;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.pbp.uas_pchop.LoginActivity;
import com.pbp.uas_pchop.Model.User;
import com.pbp.uas_pchop.Preferences.UserPreferences;
import com.pbp.uas_pchop.R;
import com.pbp.uas_pchop.databinding.FragmentHomeBinding;

public class HomeFrag extends Fragment {
    private MaterialButton btnLogout;
    private User user;
    private UserPreferences userPreferences;
    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        userPreferences = new UserPreferences(getContext());
        btnLogout =binding.getRoot().findViewById(R.id.btnLogout);
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
}