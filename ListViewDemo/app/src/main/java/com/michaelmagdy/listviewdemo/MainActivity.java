package com.michaelmagdy.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);
        ArrayList<String> country = new ArrayList<>();
        country.add("Egypt");
        country.add("Sudan");
        country.add("Lybia");
        country.add("Tunisia");
        country.add("Morocco");
        country.add("Saudi Arabia");
        country.add("Palestine");
        country.add("Syria");
        country.add("Lebanon");
        country.add("Kuwait");
        country.add("Sudan");
        country.add("Sudan");
        country.add("Sudan");
        country.add("Egypt");
        country.add("Sudan");
        country.add("Lybia");
        country.add("Tunisia");
        country.add("Morocco");
        country.add("Saudi Arabia");
        country.add("Palestine");
        country.add("Syria");
        country.add("Lebanon");
        country.add("Kuwait");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, country);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(MainActivity.this, country.get(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, CustomListActivity.class);
                startActivity(intent);
            }
        });
    }
}