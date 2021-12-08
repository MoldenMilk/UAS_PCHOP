package com.pbp.uas_pchop.Display;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.pbp.uas_pchop.Preferences.UserPreferences;
import com.pbp.uas_pchop.R;

public class ProfileFrag extends Fragment {
    int id;
    private TextInputEditText username_et, email_et, password_et;
    private ImageView ivProfil;
    private MaterialButton btnSave;
    private UserPreferences userPreferences;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        username_et = root.findViewById(R.id.username_et);
        email_et = root.findViewById(R.id.email_et);
        password_et = root.findViewById(R.id.password_et);
        userPreferences = new UserPreferences(getContext());

        return root;
    }
}