package com.michaelmagdy.notificationsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button notifyBtn;
    public static final String CHANNEL_ID = "notification_channel_one";
    public static final int NOTIFICATION_ID = 101;
    NotificationManager notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notifyBtn = findViewById(R.id.notification_btn);
        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        createNotificationChannel();

        notifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendNotification();
            }
        });
    }

    private void createNotificationChannel(){

        NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "this is notification channel",
                NotificationManager.IMPORTANCE_HIGH);

        notificationManager.createNotificationChannel(channel);
    }

    private void sendNotification(){


        Notification notification = new Notification.Builder(this, CHANNEL_ID)
                .setContentTitle("YAT")
                .setContentText("This is Android course notification")
                .setSmallIcon(android.R.drawable.btn_star)
                .setChannelId(CHANNEL_ID)
                .build();

        notificationManager.notify(NOTIFICATION_ID, notification);

    }
}