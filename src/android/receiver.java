package cordova-plugin-install-referrer;

import android.os.Bundle;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cordova-plugin-install-referrer.referrer;

public class receiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String rawReferrerString = intent.getStringExtra("referrer");

        if(rawReferrerString != null) {
            referrer.ref = rawReferrerString;
        } else {
	    	referrer.ref = "";
		}

    }

}
