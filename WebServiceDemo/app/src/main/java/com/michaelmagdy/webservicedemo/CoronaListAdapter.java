package com.michaelmagdy.webservicedemo;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CoronaListAdapter extends ArrayAdapter<Countries> {

    List<Countries> countriesList;
    Activity context;

    public CoronaListAdapter(@NonNull Activity context, int resource, List<Countries> countriesList) {
        super(context, resource, countriesList);

        this.context = context;
        this.countriesList = countriesList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = context.getLayoutInflater().inflate(R.layout.list_item, null, true);

        TextView countryTxt = view.findViewById(R.id.country_txt);
        TextView casesTxt = view.findViewById(R.id.cases_txt);
        TextView deathsTxt = view.findViewById(R.id.deaths_txt);

        Countries country = countriesList.get(position);
        countryTxt.setText(country.getCountry());

        casesTxt.setText("New Cases : " + country.getNewConfirmed() + "\n" +
                "Total cases : " + country.getTotalConfirmed());

        deathsTxt.setText("New Deaths : " + country.getNewDeaths() + "\n" +
                "Total Deaths : " + country.getTotalDeaths());

        return view;
    }
}
