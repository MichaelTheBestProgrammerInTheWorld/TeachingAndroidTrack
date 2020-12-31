package com.michaelmagdy.listviewdemo;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<String> {

    ArrayList<String> title, description;
    Activity context;

    public CustomListAdapter(@NonNull Activity context, int resource,
                             ArrayList<String> title, ArrayList<String> description) {
        super(context, resource, title);

        this.title = title;
        this.description = description;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = context.getLayoutInflater().inflate(R.layout.list_item, null, true);

        TextView titleTxt = view.findViewById(R.id.text_title);
        TextView descriptionTxt = view.findViewById(R.id.text_description);

        titleTxt.setText(title.get(position));
        descriptionTxt.setText(description.get(position));

        return view;
    }
}
