package com.bytedance.realx.base;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes6.dex */
public class RXPerformanceMonitorAndroid {
    private static final float ERROR_RESULT = 0.0f;
    private static Context context;
    private static PowerManager powerManager;
    private static final FileFilter CPU_IDLE_STATE_FILTER = new FileFilter() { // from class: com.bytedance.realx.base.RXPerformanceMonitorAndroid.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("state")) {
                return false;
            }
            for (int i10 = 5; i10 < name.length(); i10++) {
                if (name.charAt(i10) < '0' || name.charAt(i10) > '9') {
                    return false;
                }
            }
            return true;
        }
    };
    private static int mCpuCoreCount = -1;
    private static int mCpuIdleStateCount = -1;

    static {
        Context applicationContext = ContextUtils.getApplicationContext();
        context = applicationContext;
        powerManager = (PowerManager) applicationContext.getSystemService("power");
    }

    private static int getCpuIdleStateCount() {
        try {
            return new File("/sys/devices/system/cpu/cpu0/cpuidle/").listFiles(CPU_IDLE_STATE_FILTER).length;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getCurrentPidMemorySize() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            if (activityManager == null) {
                return 0;
            }
            return activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean getIfRoomsDevice() {
        return "a3382".equals(Build.MODEL.toLowerCase());
    }

    public static int getThermalState() {
        PowerManager powerManager2;
        if (Build.VERSION.SDK_INT < 29 || (powerManager2 = powerManager) == null) {
            return 4;
        }
        int currentThermalStatus = powerManager2.getCurrentThermalStatus();
        switch (currentThermalStatus) {
            case 0:
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
            case 6:
                return 3;
            default:
                return currentThermalStatus;
        }
    }

    public static int getThreadCount() {
        return Thread.activeCount();
    }

    public static void setPowerManger(PowerManager powerManager2) {
        powerManager = powerManager2;
    }
}
