package com.ss.bytertc.base.utils;

import android.content.Context;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class RtcContextUtils {
    private static final String TAG = "ContextUtils";
    private static Context applicationContext;

    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }

    @CalledByNative
    public static void initialize(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
        }
        ContextUtils.initialize(context.getApplicationContext());
    }
}
