package com.michaelmagdy.sharedprefdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameEdt = findViewById(R.id.name_edt);
        EditText ageEdt = findViewById(R.id.age_edt);
        TextView displayTxt = findViewById(R.id.display_txt);
        Button saveBtn = findViewById(R.id.save_btn);
        Button readBtn = findViewById(R.id.read_btn);

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",
                MODE_PRIVATE);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                String name = nameEdt.getText().toString();
                String ageS = ageEdt.getText().toString();
                if (name.isEmpty() || ageS.isEmpty()){
                    Toast.makeText(MainActivity.this, "all fields are required", Toast.LENGTH_SHORT).show();
                } else {
                    editor.putString("name", name);
                    editor.putInt("age", Integer.valueOf(ageS));
                    editor.commit();
                    Toast.makeText(MainActivity.this, "data saved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        readBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = sharedPreferences.getString("name", null);
                int ageI = sharedPreferences.getInt("age", 0);

                displayTxt.setText("name is : " + name + "\n" +
                        "age is : " + String.valueOf(ageI));
            }
        });
    }
}