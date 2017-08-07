package android.example.com.roomdemo.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Ashwani on 05-08-2017.
 */
@Entity(tableName = "weather")
public class WeatherInfo {
    @PrimaryKey(autoGenerate = true)
    private int uid;
    @ColumnInfo(name = "city_name")
    private String cityName;
    @ColumnInfo(name = "icn")
    private String weatherConditionIconUrl;
    @ColumnInfo(name = "current_temp")
    private String CurrentTemp;
    @ColumnInfo(name = "day_high")
    private String dayHighTemp;
    @ColumnInfo(name = "day_low")
    private String dayLowTemp;
    @ColumnInfo(name = "humidity")
    private String humidity;
    @ColumnInfo(name = "feels_like")
    private String feelsLike;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeatherConditionIconUrl() {
        return weatherConditionIconUrl;
    }

    public void setWeatherConditionIconUrl(String weatherConditionIconUrl) {
        this.weatherConditionIconUrl = weatherConditionIconUrl;
    }

    public String getCurrentTemp() {
        return CurrentTemp;
    }

    public void setCurrentTemp(String currentTemp) {
        CurrentTemp = currentTemp;
    }

    public String getDayHighTemp() {
        return dayHighTemp;
    }

    public void setDayHighTemp(String dayHighTemp) {
        this.dayHighTemp = dayHighTemp;
    }

    public String getDayLowTemp() {
        return dayLowTemp;
    }

    public void setDayLowTemp(String dayLowTemp) {
        this.dayLowTemp = dayLowTemp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(String feelsLike) {
        this.feelsLike = feelsLike;
    }
}
