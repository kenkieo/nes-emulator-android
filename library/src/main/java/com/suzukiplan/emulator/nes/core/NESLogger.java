package com.suzukiplan.emulator.nes.core;

import android.util.Log;

public final class NESLogger {
    private static final String TAG = "nes-view";

    /**
     * output logging flag (you can set true while debugging)
     */
    public static boolean enabled = false;

    public static void d(String text) {
        if (!enabled) return;
        Log.d(TAG, text);
    }

    public static void w(String text) {
        if (!enabled) return;
        Log.w(TAG, text);
    }

    public static void e(String text) {
        if (!enabled) return;
        Log.e(TAG, text);
    }

    public static void printStackTrace(Exception e) {
        if (!enabled) return;
        e.printStackTrace();
    }
}
