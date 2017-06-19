package arnab.com.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int notificationID=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        displayNotification();
    }

    public void displayNotification() {
        Intent i=new Intent(this, Notification.class);
        i.putExtra("notification",notificationID);
        PendingIntent pendingIntent= PendingIntent.getActivity(this,0,i,0);

        NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

        NotificationCompat.Builder notifBuilder;

        notifBuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Meeting Reminder")
                .setContentText("Reminder : Meeting in 5 min");
        nm.notify(notificationID,notifBuilder.build());
    }
}
