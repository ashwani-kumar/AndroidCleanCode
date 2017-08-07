package android.example.com.roomdemo.contracts;

/**
 * Created by Ashwani on 30-07-2017.
 */

public interface Contract {

    interface view {
        void onSucess(String cityName);
        void onError(String errorMsg);
    }

    interface presenter {
        void getWeatherInfo(String latlong);
    }
}
