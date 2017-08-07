package android.example.com.roomdemo.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.example.com.roomdemo.models.WeatherInfo;

import java.util.List;

/**
 * Created by Ashwani on 05-08-2017.
 */

@Dao
public interface WeatherInfoDao {

    @Query("SELECT * FROM weather")
    List<WeatherInfo> getAll();

    @Query("SELECT COUNT(*) from weather")
    int countWeatherInfos();

    @Query("SELECT * FROM weather where city_name LIKE  :cityName")
    WeatherInfo findByName(String cityName);

    @Insert
    void insertAll(WeatherInfo... weatherinfos);

    @Insert
    void insert(WeatherInfo weatherinfo);

    @Delete
    void delete(WeatherInfo weatherinfo);
}
