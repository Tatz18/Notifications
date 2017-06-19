package arnab.com.notifications;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Arnab on 6/19/2017.
 */

public class NotificationView extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        nm.cancel(getIntent().getExtras().getInt("notificationID"));


    }
}
