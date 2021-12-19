package com.pbp.uas_pchop.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.pbp.uas_pchop.dao.UserDao;
import com.pbp.uas_pchop.model.User;

@Database(entities = {User.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
