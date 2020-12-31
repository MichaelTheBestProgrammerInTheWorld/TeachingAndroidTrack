package com.michaelmagdy.filedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText fileNameEdt = findViewById(R.id.file_name_edt);
        EditText fileContentEdt = findViewById(R.id.file_content_edt);
        Button writeBtn = findViewById(R.id.save_btn);
        Button readBtn = findViewById(R.id.read_btn);
        TextView contentTxt = findViewById(R.id.content_txt);

        writeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fileName = fileNameEdt.getText().toString();
                String fileContent = fileContentEdt.getText().toString();

                FileOutputStream fileOutputStream;


                try {
                    fileOutputStream = openFileOutput(fileName, MODE_PRIVATE);
                    fileOutputStream.write(fileContent.getBytes());
                    fileOutputStream.close();

                    Toast.makeText(MainActivity.this, "saved successfully", Toast.LENGTH_SHORT).show();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        readBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fileName = fileNameEdt.getText().toString();
                StringBuffer stringBuffer = new StringBuffer();

                try {
                    BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                            openFileInput(fileName)
                    ));
                    String inputString;
                    while ((inputString = inputReader.readLine()) != null) {
                        stringBuffer.append(inputString + "\n");
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                contentTxt.setText(stringBuffer.toString());
            }
        });
    }
}