package com.pbp.uas_pchop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.pbp.uas_pchop.DB.DatabaseClient;
import com.pbp.uas_pchop.Model.User;
import com.pbp.uas_pchop.Preferences.UserPreferences;

public class RegisterActivity extends AppCompatActivity {
    private EditText etUsername, etEmail, etPassword;
    private MaterialButton btnSignup;
    private UserPreferences userPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userPreferences = new UserPreferences(RegisterActivity.this);

        etUsername = findViewById(R.id.etUsername);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSignup = findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateForm()){
                    register(etUsername.getText().toString().trim(), etEmail.getText().toString().trim(), etPassword.getText().toString().trim());
                }
            }
        });
    }

    private void register(String username,String email, String password){

        class RegisterUser extends AsyncTask<Void, Void, Void> {

            @Override
            protected Void doInBackground(Void... voids) {
                User user = new User();
                user.setUsername(username);
                user.setEmail(email);
                user.setPassword(password);

                DatabaseClient.getInstance(RegisterActivity.this)
                        .getDatabase()
                        .userDao()
                        .registerUser(user);

                return null;
            }

            @Override
            protected void onPostExecute(Void unused) {
                super.onPostExecute(unused);
                Toast.makeText(RegisterActivity.this, "Berhasil mendaftar", Toast.LENGTH_SHORT).show();
                clearField();
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
            }

        }

        RegisterUser registerUser = new RegisterUser();
        registerUser.execute();
    }

    private void clearField(){
        etUsername.setText("");
        etEmail.setText("");
        etPassword.setText("");
    }

    private boolean validateForm(){
        /* Check username & password is empty or not */
        if(etUsername.getText().toString().trim().isEmpty() || etEmail.getText().toString().trim().isEmpty() || etPassword.getText().toString().trim().isEmpty()){
            Toast.makeText(RegisterActivity.this,"Field tidak boleh Kosong",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}