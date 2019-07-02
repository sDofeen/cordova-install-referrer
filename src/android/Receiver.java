package com.sdofeen.cordova.plugins.referrer;

import android.os.Bundle;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sdofeen.cordova.plugins.referrer.Referrer;

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String rawReferrerString = intent.getStringExtra("referrer");

        if (rawReferrerString != null) {
            referrer.data = rawReferrerString;
        } else {
	    	referrer.data = "";
		}
    }
}
