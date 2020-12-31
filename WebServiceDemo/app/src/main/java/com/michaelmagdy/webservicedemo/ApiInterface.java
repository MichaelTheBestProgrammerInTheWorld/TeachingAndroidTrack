package com.michaelmagdy.webservicedemo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {


    @GET("summary")
    Call<CoronaVirusModel> getCoronaVirus();
}
