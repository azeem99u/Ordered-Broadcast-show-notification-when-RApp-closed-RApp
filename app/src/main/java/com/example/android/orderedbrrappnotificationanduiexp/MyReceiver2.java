package com.example.android.orderedbrrappnotificationanduiexp;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

public class MyReceiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (isOrderedBroadcast()){
            Notification notification = new  NotificationCompat.Builder(context,App.CHANNEL_ID)
                    .setContentTitle("BR Notification")
                    .setContentText("APP is closed")
                    .setSmallIcon(R.mipmap.ic_launcher).build();

            NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(124,notification);
        }

    }
}
