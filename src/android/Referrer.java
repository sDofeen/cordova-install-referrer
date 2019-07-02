package com.sdofeen.cordova.plugins.referrer;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Referrer extends CordovaPlugin {
    public static String data = "";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        callbackContext.success(Referrer.data);

        return true;
    }
}
