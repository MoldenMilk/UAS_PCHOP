package com.pbp.uas_pchop.Preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.pbp.uas_pchop.Model.User;

public class UserPreferences {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    public static final String IS_LOGIN = "isLogin";
    public static final String KEY_ID = "id";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_USERNAME = "username";
    public static final String KEY_PASSWORD = "password";

    public UserPreferences(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences("userPreferences", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void setUser(int id,String email, String username, String password){

        editor.putBoolean(IS_LOGIN, true);
        editor.putInt(KEY_ID,id);
        editor.putString(KEY_EMAIL,email);
        editor.putString(KEY_USERNAME,username);
        editor.putString(KEY_PASSWORD,password);

        editor.commit();
    }

    public User getUserLogin(){
        String email,username,password;
        int id;

        id = sharedPreferences.getInt(KEY_ID,0);
        email = sharedPreferences.getString(KEY_EMAIL,null);
        username = sharedPreferences.getString(KEY_USERNAME,null);
        password = sharedPreferences.getString(KEY_PASSWORD,null);

        return new User(id,email,username,password);
    }

    public boolean checkLogin(){
        return sharedPreferences.getBoolean(IS_LOGIN, false);
    }

    public void logout(){
        editor.clear();
        editor.commit();
    }
}
