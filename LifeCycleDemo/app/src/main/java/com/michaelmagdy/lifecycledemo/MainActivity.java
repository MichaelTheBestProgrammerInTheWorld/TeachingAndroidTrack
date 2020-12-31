package com.michaelmagdy.lifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        Log.d("life_cycle", "MainActivity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("life_cycle", "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("life_cycle", "MainActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("life_cycle", "MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("life_cycle", "MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("life_cycle", "MainActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("life_cycle", "MainActivity onRestart");
    }
}