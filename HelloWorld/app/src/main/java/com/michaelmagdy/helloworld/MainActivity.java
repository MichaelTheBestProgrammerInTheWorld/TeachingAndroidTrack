package com.michaelmagdy.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameEdt = findViewById(R.id.name_edt);
        EditText jobEdt = findViewById(R.id.job_edt);
        NumberPicker agePick = findViewById(R.id.age_picker);
        RadioGroup sexGroup = findViewById(R.id.sex_radio);
        Spinner eduSpinner = findViewById(R.id.edu_spinner);
        Button submitBtn = findViewById(R.id.submit_btn);

        agePick.setMinValue(18);
        agePick.setMaxValue(60);
        String[] education = {"High school", "Undergraduate", "Graduate", "Post graduate"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, education);
        eduSpinner.setAdapter(adapter);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name, job, age, sex, edu;
                name = nameEdt.getText().toString();
                job = jobEdt.getText().toString();
                age = String.valueOf(agePick.getValue());
                int radioBtnId = sexGroup.getCheckedRadioButtonId();
                RadioButton sexBtn = findViewById(R.id.male_btn);
                sex = sexBtn.getText().toString();
                edu = eduSpinner.getSelectedItem().toString();
//                Toast.makeText(MainActivity.this, name + " " + age + " " +
//                        job + " " + sex + " " + edu, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, UserInfoActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("job", job);
                intent.putExtra("age", age);
                intent.putExtra("sex", sex);
                intent.putExtra("edu", edu);
                startActivity(intent);
            }
        });

    }

    void initialize(){


    }

}