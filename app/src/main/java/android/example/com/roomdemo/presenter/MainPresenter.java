package android.example.com.roomdemo.presenter;

import android.content.Context;
import android.example.com.roomdemo.contracts.Contract;
import android.example.com.roomdemo.services.MainService;

/**
 * Created by Ashwani on 30-07-2017.
 */

public class MainPresenter implements Contract.presenter, MainService.ServiceCallBack {

    private final Contract.view mView;
    private final MainService mMainService;
    private Context context;

    public MainPresenter(Contract.view view, Context context){
        this.mView = view;
        this.mMainService = new MainService(this);
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public void getWeatherInfo(String latlong) {
        mMainService.getWeatherInfo(latlong);

    }

    @Override
    public void onSuccess(String cityName) {
        mView.onSucess(cityName);
    }

    @Override
    public void onError(String s) {
        mView.onError(s);
    }
}
