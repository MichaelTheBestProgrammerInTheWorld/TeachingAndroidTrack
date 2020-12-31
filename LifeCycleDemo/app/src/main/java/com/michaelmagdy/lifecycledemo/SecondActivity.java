package com.michaelmagdy.lifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("life_cycle", "SecondActivity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("life_cycle", "SecondActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("life_cycle", "SecondActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("life_cycle", "SecondActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("life_cycle", "SecondActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("life_cycle", "SecondActivity onDestroy");
    }
}