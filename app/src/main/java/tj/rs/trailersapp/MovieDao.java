package tj.rs.trailersapp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by Rustam Safarov (RS) on 12.03.2020.
 * (c) 2020 RS DevTeam. All rights reserved!
 */
@Dao
public interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] insertMoview(List<MovieEntity> movies);

    @Query("SELECT * FROM `MovieEntity`")
    List<MovieEntity> getMoviesByPage();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertMovie(MovieEntity movie);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    int updateMovie(MovieEntity movie);

    @Query("SELECT * FROM `MovieEntity` where id = :id")
    MovieEntity getMovieById(Long id);

    @Query("SELECT * FROM `MovieEntity` where id = :id")
    Flowable<MovieEntity> getMovieDetailById(Long id);

    @Query("SELECT * FROM `MovieEntity` where page = :page")
    List<MovieEntity> getMoviesByPage(Long page);
}
