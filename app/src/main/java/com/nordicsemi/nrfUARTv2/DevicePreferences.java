package com.nordicsemi.nrfUARTv2;

import android.content.Context;
import android.preference.PreferenceManager;

public class DevicePreferences {
    private static final String LAST_CONNECTED_DEVICE = "lastDevice"; // used as key in pair

    public static String getLastDevice(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(LAST_CONNECTED_DEVICE, null);
    }

    public static void setLastDevice(Context context, String device) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(LAST_CONNECTED_DEVICE, device)
                .apply();
    }


}
