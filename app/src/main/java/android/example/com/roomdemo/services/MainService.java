package android.example.com.roomdemo.services;

import android.example.com.roomdemo.R;
import android.example.com.roomdemo.dao.AppDatabase;
import android.example.com.roomdemo.models.CurrentObservation;
import android.example.com.roomdemo.models.Forecast;
import android.example.com.roomdemo.models.Forecastday_;
import android.example.com.roomdemo.models.Simpleforecast;
import android.example.com.roomdemo.models.WeatherInfo;
import android.example.com.roomdemo.models.WeatherInfoModel;
import android.example.com.roomdemo.presenter.MainPresenter;
import android.example.com.webservicemanager.managers.NetworkRequestManager;
import android.example.com.webservicemanager.response.NetworkResponseHandler;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Ashwani on 30-07-2017.
 */

public class MainService implements NetworkResponseHandler {
    MainPresenter mainPresenter;
    NetworkRequestManager networkRequestManager;

    public MainService(MainPresenter mainPresenter) {
        this.mainPresenter = mainPresenter;
        this.networkRequestManager = new NetworkRequestManager(this);
    }

    public void getWeatherInfo(String latlong) {
        networkRequestManager.getWeatherInfo(latlong);
    }

    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        ObjectMapper mappper = new ObjectMapper();
        WeatherInfoModel weatherInfoModel = null;
        try{
            weatherInfoModel = mappper.readValue(response.body(), WeatherInfoModel.class);
            mapWithDataModel(weatherInfoModel);
        }catch(IOException e){
            mainPresenter.onError(mainPresenter.getContext().getResources().getString(R.string.parsing_error));
            e.printStackTrace();
        }
    }

    private void mapWithDataModel(WeatherInfoModel weatherInfoModel) {

        if(weatherInfoModel != null){
            WeatherInfo weatherInfo = new WeatherInfo();
            String cityName = "";
            String weatherConditionIconUrl ="";
            String CurrentTemp = "";
            String humidity = "";
            String feelsLike = "";
            String dayHighTemp = "";
            String dayLowTemp = "";
            CurrentObservation currentObservation = weatherInfoModel.getCurrentObservation();
            if(currentObservation != null){
                weatherConditionIconUrl = currentObservation.getIconUrl();
                CurrentTemp = String.valueOf(currentObservation.getTempC());
                humidity = currentObservation.getRelativeHumidity();
                feelsLike = currentObservation.getFeelslikeC();
                cityName = currentObservation.getDisplayLocation().getCity();
            }
            Forecast forcast = weatherInfoModel.getForecast();
            if(forcast != null){
                Simpleforecast simepleForcast = forcast.getSimpleforecast();
                if(simepleForcast != null){
                    List<Forecastday_> forecastdayList = simepleForcast.getForecastday();
                    if(!forecastdayList.isEmpty()){
                        dayHighTemp = forecastdayList.get(0).getHigh().getCelsius();
                        dayLowTemp = forecastdayList.get(0).getLow().getCelsius();
                    }
                }
            }
            weatherInfo.setWeatherConditionIconUrl(weatherConditionIconUrl);
            weatherInfo.setCityName(cityName);
            weatherInfo.setCurrentTemp(CurrentTemp);
            weatherInfo.setDayHighTemp(dayHighTemp);
            weatherInfo.setDayLowTemp(dayLowTemp);
            weatherInfo.setHumidity(humidity);
            weatherInfo.setFeelsLike(feelsLike);
            persistWeatherInformation(weatherInfo);
            mainPresenter.onSuccess(cityName);
        }
    }

    private void persistWeatherInformation(WeatherInfo weatherInfo) {
        AppDatabase appDatabase = AppDatabase.getAppDatabase(mainPresenter.getContext());
        appDatabase.weatherDao().insert(weatherInfo);
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        mainPresenter.onError(mainPresenter.getContext().getResources().getString(R.string.request_error));
    }
    //Todo: use this callback interface
    public interface ServiceCallBack{
        void onSuccess(String cityName);
        void onError(String s);
    }
}
