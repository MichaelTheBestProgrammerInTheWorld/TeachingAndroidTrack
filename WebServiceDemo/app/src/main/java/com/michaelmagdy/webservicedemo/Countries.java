package com.michaelmagdy.webservicedemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Countries {
    @Expose
    @SerializedName("Date")
    private String Date;
    @Expose
    @SerializedName("TotalRecovered")
    private int TotalRecovered;
    @Expose
    @SerializedName("NewRecovered")
    private int NewRecovered;
    @Expose
    @SerializedName("TotalDeaths")
    private int TotalDeaths;
    @Expose
    @SerializedName("NewDeaths")
    private int NewDeaths;
    @Expose
    @SerializedName("TotalConfirmed")
    private int TotalConfirmed;
    @Expose
    @SerializedName("NewConfirmed")
    private int NewConfirmed;
    @Expose
    @SerializedName("Slug")
    private String Slug;
    @Expose
    @SerializedName("CountryCode")
    private String CountryCode;
    @Expose
    @SerializedName("Country")
    private String Country;

    public String getDate() {
        return Date;
    }

    public int getTotalRecovered() {
        return TotalRecovered;
    }

    public int getNewRecovered() {
        return NewRecovered;
    }

    public int getTotalDeaths() {
        return TotalDeaths;
    }

    public int getNewDeaths() {
        return NewDeaths;
    }

    public int getTotalConfirmed() {
        return TotalConfirmed;
    }

    public int getNewConfirmed() {
        return NewConfirmed;
    }

    public String getSlug() {
        return Slug;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public String getCountry() {
        return Country;
    }
}
