package com.ss.bytertc.base.media.screen;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class ScreenServiceManager {
    private static final String TAG = "ScreenServiceManager";

    @CalledByNative
    ScreenServiceManager() {
    }

    @CalledByNative
    public void stopService() {
        if (Build.VERSION.SDK_INT > 28 && RXScreenCaptureService.serviceStarted.get()) {
            Context applicationContext = ContextUtils.getApplicationContext();
            applicationContext.startForegroundService(RXScreenCaptureService.getServiceIntent(applicationContext, 9, null));
            Log.i(TAG, "stopService");
        }
    }
}
