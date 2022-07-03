
package com.example.matchessimulator;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.matchessimulator.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

import data.MatchesApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MatchesApi matchesApi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        setupHttpClient();
        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();

    }

    private void setupHttpClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://cesarvales.github.io/matches-simulator-api/")
                .addConverterFactory(GsonConverterFactory.create()).build()
                ;
        matchesApi = retrofit.create(MatchesApi.class);
    }

    private void setupFloatingActionButton() {
    }

    private void setupMatchesRefresh() {

    }


    private void  setupMatchesList() {

        matchesApi.getMatches().enqueue(new Callback<List<match>>() {
            @Override
            public void onResponse(Call<List<match>> call, Response<List<match>> response) {
                if (response.isSuccessful()) {
                    List<match> matches =  response.body();
                    Log.i("Simulator","Worked" + matches.size());
                } else {
                    showErrorMsg();
                }

            }

            @Override
            public void onFailure(Call<List<match>> call, Throwable t) {
                showErrorMsg();
            }
        });
    }

    private void showErrorMsg() {
        Snackbar.make(binding.fabSimulate,R.string.erro_api,Snackbar.LENGTH_SHORT).show();
    }


}
