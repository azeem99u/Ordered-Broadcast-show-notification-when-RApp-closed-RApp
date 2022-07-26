package com.example.android.orderedbrrappnotificationanduiexp;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import androidx.annotation.RequiresApi;


public class App extends Application {
    public static final String CHANNEL_ID = "BR_notification";
    NotificationChannel channel;
    NotificationManager manager;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();
        channel = new NotificationChannel(CHANNEL_ID,"channel1", NotificationManager.IMPORTANCE_HIGH);
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.createNotificationChannel(channel);
    }
}
