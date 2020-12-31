package com.michaelmagdy.webservicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView dateTxt;
    ListView countriesListView;
    CoronaListAdapter coronaListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateTxt = findViewById(R.id.date_txt);
        countriesListView = findViewById(R.id.corona_list);


        getCoronaCountries();
    }

    private void getCoronaCountries() {

        ApiClient.getApiClient().getApiInterface().getCoronaVirus()
                .enqueue(new Callback<CoronaVirusModel>() {
                    @Override
                    public void onResponse(Call<CoronaVirusModel> call, Response<CoronaVirusModel> response) {

                        //when network request succeseed and api response is obtained
                        CoronaVirusModel coronaVirusModel = response.body();
                        if (coronaVirusModel != null){

                            List<Countries> countries = coronaVirusModel.getCountries();
                            coronaListAdapter = new CoronaListAdapter(MainActivity.this,
                                    R.layout.list_item, countries);
                            countriesListView.setAdapter(coronaListAdapter);
                            dateTxt.setText("Last Updated at : " + coronaVirusModel.getDate());

                        } else {
                            Toast.makeText(MainActivity.this, "response is null", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<CoronaVirusModel> call, Throwable t) {

                        //when network request fail
                        Log.d("onNetworkFail", t.getMessage());
                        Toast.makeText(MainActivity.this, "request failed " + t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }
}