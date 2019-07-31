package com.nordicsemi.nrfUARTv2;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ReconnectService extends IntentService {
    private static final String TAG = "ReconnectService";

    public static Intent newIntent(Context context) {
        return new Intent(context, ReconnectService.class);
    }

    public ReconnectService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "Received an intent: " + intent);
    }
}
