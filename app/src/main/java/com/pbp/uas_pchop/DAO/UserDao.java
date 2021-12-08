package com.pbp.uas_pchop.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.pbp.uas_pchop.Model.User;

@Dao
public interface UserDao {
    @Query("SELECT * FROM users WHERE username=:username AND password=:password")
    User attemptLogin(String username, String password);

    @Insert
    void registerUser(User user);
}
