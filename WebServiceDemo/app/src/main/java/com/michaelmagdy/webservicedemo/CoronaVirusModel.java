package com.michaelmagdy.webservicedemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CoronaVirusModel {


    @Expose
    @SerializedName("Date")
    private String Date;
    @Expose
    @SerializedName("Countries")
    private List<Countries> Countries;
    @Expose
    @SerializedName("Global")
    private Global Global;

    public String getDate() {
        return Date;
    }

    public List<Countries> getCountries() {
        return Countries;
    }

    public Global getGlobal() {
        return Global;
    }
}




    /*
    {
  "Glo
      "Coubal": {
    "NewConfirmed": 100282,
    "TotalConfirmed": 1162857,
    "NewDeaths": 5658,
    "TotalDeaths": 63263,
    "NewRecovered": 15405,
    "TotalRecovered": 230845
  },
  "Countries": [
    {ntry": "ALA Aland Islands",
      "CountryCode": "AX",
      "Slug": "ala-aland-islands",
      "NewConfirmed": 0,
      "TotalConfirmed": 0,
      "NewDeaths": 0,
      "TotalDeaths": 0,
      "NewRecovered": 0,
      "TotalRecovered": 0,
      "Date": "2020-04-05T06:37:00Z"
    },
    {
      "Country": "Afghanistan",
      "CountryCode": "AF",
      "Slug": "afghanistan",
      "NewConfirmed": 18,
      "TotalConfirmed": 299,
      "NewDeaths": 1,
      "TotalDeaths": 7,
      "NewRecovered": 0,
      "TotalRecovered": 10,
      "Date": "2020-04-05T06:37:00Z"
    },

     */
