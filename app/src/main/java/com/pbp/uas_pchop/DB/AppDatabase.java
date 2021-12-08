package com.pbp.uas_pchop.DB;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.pbp.uas_pchop.DAO.UserDao;
import com.pbp.uas_pchop.Model.User;

@Database(entities = {User.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
