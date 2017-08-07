package android.example.com.webservicemanager.response;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Ashwani on 30-07-2017.
 */

public interface NetworkResponseHandler extends Callback<String> {
    @Override
    void onResponse(Call<String> call, Response<String> response);

    @Override
    void onFailure(Call<String> call, Throwable t);
}
