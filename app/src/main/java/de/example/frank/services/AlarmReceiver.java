package de.example.frank.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    public AlarmReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.EXTRA_ALARM_COUNT.equals(intent.getAction())) {
            Toast.makeText(context, "regelmäßige Aufgabe", Toast.LENGTH_LONG).show();
            System.out.println("Bitteschön");
        }
    }
}
