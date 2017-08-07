package android.example.com.webservicemanager.managers;

import android.example.com.webservicemanager.constants.Constants;
import android.example.com.webservicemanager.retrofit.WeatherApiInterface;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Ashwani on 30-07-2017.
 */

public class WeatherServiceManager {
    private static Retrofit retrofit = null;
    private static WeatherServiceManager weatherServiceManager;

    private WeatherApiInterface weatherApiInterface = null;

    private WeatherServiceManager(){
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        weatherApiInterface = retrofit.create(WeatherApiInterface.class);
    }

    public static WeatherServiceManager getInstance(){
        if(weatherServiceManager == null){
            weatherServiceManager = new WeatherServiceManager();
        }
        return weatherServiceManager;
    }

    public WeatherApiInterface getWeatherApiInterface(){
        return weatherApiInterface;
    }

}
