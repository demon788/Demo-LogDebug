package com.example.logdemo;

import android.util.Log;

/**
 * Created by Admin on 07-Apr-18.
 */

public class LogDebug {
    private static final String TAG = "SUPER AWESOME APP";
    public static void d(String messenger){
        Log.d(TAG,messenger);
    }
}
