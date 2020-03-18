package tj.rs.trailersapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.room.Room;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by Rustam Safarov (RS) on 13.03.2020.
 * (c) 2020 RS DevTeam. All rights reserved!
 */
public class DbModule {
    @Provides
    @Singleton
    AppDatabase provideDatabase(@NonNull Application application) {
        return Room.databaseBuilder(application,
                AppDatabase.class, "Entertainment.db")
                .allowMainThreadQueries().build();
    }

    @Provides
    @Singleton
    MovieDao provideMaMovieDao(@NonNull AppDatabase appDatabase) {
        return appDatabase.movieDao();
    }
}
