package com.michaelmagdy.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        ListView customList = findViewById(R.id.custom_list_view);
        ArrayList<String> title = new ArrayList<>();
        title.add("this is title 1");
        title.add("this is title 2");
        title.add("this is title 3");
        title.add("this is title 4");
        title.add("this is title 5");
        title.add("this is title 6");
        ArrayList<String> description = new ArrayList<>();
        description.add("this is description 1");
        description.add("this is description 2");
        description.add("this is description 3");
        description.add("this is description 4");
        description.add("this is description 5");
        description.add("this is description 6");

        CustomListAdapter customListAdapter =
                new CustomListAdapter(this, R.layout.list_item, title, description);
        customList.setAdapter(customListAdapter);

    }
}