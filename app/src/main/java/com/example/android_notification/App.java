package com.example.android_notification;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class App extends Application {
    public static final String CHANNEL_1_ID= "channel1";
    public static final String CHANNEL_2_ID = "channe";

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();

        CreateNotificationChannel();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void CreateNotificationChannel() {
        NotificationChannel channel1 = new NotificationChannel(
                CHANNEL_1_ID,
                "channe l",
                NotificationManager.IMPORTANCE_LOW
        );
        channel1.setDescription("This is channel 1");


        NotificationChannel channel2 = new NotificationChannel(
                CHANNEL_2_ID,
                "channe 2",
                NotificationManager.IMPORTANCE_HIGH
        );
        channel2.setDescription("This is channel 2");

        //reference to notification manager
        NotificationManager manager = getSystemService(NotificationManager.class);
        manager.createNotificationChannel(channel1);
        manager.createNotificationChannel(channel2);


    }
}
