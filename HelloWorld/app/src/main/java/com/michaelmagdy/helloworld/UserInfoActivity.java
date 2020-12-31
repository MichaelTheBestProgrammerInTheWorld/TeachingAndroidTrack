package com.michaelmagdy.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String job = intent.getStringExtra("job");
        String age = intent.getStringExtra("age");
        String sex = intent.getStringExtra("sex");
        String edu = intent.getStringExtra("edu");

        TextView textView = findViewById(R.id.data_txt);
        textView.setText("Name is : " + name + "\n" +
                "Job is : " + job + "\n" +
                "Age is : " + age + "\n" +
                "sex is : " + sex +
                "Education is : " + edu);
    }
}