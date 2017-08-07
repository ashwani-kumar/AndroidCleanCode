package android.example.com.webservicemanager.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by Ashwani on 30-07-2017.
 */

public interface WeatherApiInterface {
    @GET
    Call<String> getWeatherDetails(@Url String url);
}
