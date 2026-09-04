package com.ss.bytertc.engine.utils;

import android.app.ActivityManager;
import android.content.Context;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CommonUtils {
    public static boolean isInForeground(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }
}
