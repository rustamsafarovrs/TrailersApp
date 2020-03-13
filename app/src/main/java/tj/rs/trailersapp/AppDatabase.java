package tj.rs.trailersapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * Created by Rustam Safarov (RS) on 12.03.2020.
 * (c) 2020 RS DevTeam. All rights reserved!
 */
@Database(entities = {MovieEntity.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MovieDao movieDao();
}