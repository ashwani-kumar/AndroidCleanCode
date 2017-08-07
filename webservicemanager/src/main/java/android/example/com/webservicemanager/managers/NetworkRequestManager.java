package android.example.com.webservicemanager.managers;

import android.example.com.webservicemanager.constants.Constants;
import android.example.com.webservicemanager.response.NetworkResponseHandler;
import android.example.com.webservicemanager.retrofit.WeatherApiInterface;

import retrofit2.Call;

/**
 * Created by Ashwani on 30-07-2017.
 */

public class NetworkRequestManager {
    private NetworkResponseHandler networkResponseHandler;

    public NetworkRequestManager(NetworkResponseHandler networkResponseHandler){
        this.networkResponseHandler = networkResponseHandler;
    }

    public void getWeatherInfo(String latlong){
        String url = Constants.WUNDERGROUND_API_PART +Constants.WUNDERGROUND_API_KEY+ Constants.WUNDERGROUND_QUESRY_PART + latlong + Constants.JSON_FILE_EXTENSION;
        WeatherApiInterface weatherApiInterface = WeatherServiceManager.getInstance().getWeatherApiInterface();
        if(weatherApiInterface != null){
            Call<String> call = weatherApiInterface.getWeatherDetails(url);
            call.enqueue(networkResponseHandler);
        }
    }
}
