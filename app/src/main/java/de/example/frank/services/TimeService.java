package de.example.frank.services;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TimeService extends Service {
    public TimeService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    /**
     * Called by the system when the service is first created.  Do not call this method directly.
     */
    @Override
    public void onCreate() {
        super.onCreate();
        AlarmManager aM = ((AlarmManager)getSystemService(ALARM_SERVICE));
        Intent intent = new Intent(this, AlarmReceiver.class);
        intent.setAction(Intent.EXTRA_ALARM_COUNT);

        PendingIntent op = PendingIntent.getBroadcast(this,0,intent,0);

        aM.setRepeating(AlarmManager.ELAPSED_REALTIME,10000,60000,op);

    }

    /**
     * Called by the system to notify a Service that it is no longer used and is being removed.  The
     * service should clean up any resources it holds (threads, registered
     * receivers, etc) at this point.  Upon return, there will be no more calls
     * in to this Service object and it is effectively dead.  Do not call this method directly.
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
