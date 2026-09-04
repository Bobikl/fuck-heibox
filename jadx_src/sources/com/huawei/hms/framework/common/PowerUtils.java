package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes7.dex */
public class PowerUtils {
    private static final String TAG = "PowerUtils";

    public static final class PowerMode {
        static final int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        static final int POWER_SAVER_MODE = 4;
        static final String SMART_MODE_STATUS = "SmartModeStatus";
    }

    public static boolean isAppIdleMode(Context context) {
        if (context == null) {
            Logger.i(TAG, "isAppIdleMode Context is null!");
            return false;
        }
        String packageName = context.getPackageName();
        Object systemService = context.getSystemService("usagestats");
        if (systemService instanceof UsageStatsManager) {
            UsageStatsManager usageStatsManager = (UsageStatsManager) systemService;
            if (usageStatsManager != null) {
                return usageStatsManager.isAppInactive(packageName);
            }
            Logger.i(TAG, "isAppIdleMode statsManager is null!");
        }
        return false;
    }

    public static boolean isDozeIdleMode(Context context) {
        if (context == null) {
            Logger.i(TAG, "isDozeIdleMode Context is null!");
            return false;
        }
        Object systemService = ContextCompat.getSystemService(context, "power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            Logger.i(TAG, "isDozeIdleMode powerManager is null!");
            return false;
        }
        try {
            return powerManager.isDeviceIdleMode();
        } catch (RuntimeException e10) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e10);
            return false;
        }
    }

    public static boolean isInteractive(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            if (systemService instanceof PowerManager) {
                try {
                    return ((PowerManager) systemService).isInteractive();
                } catch (RuntimeException e10) {
                    Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e10.getClass().getSimpleName() + e10.getMessage());
                }
            }
        }
        return false;
    }

    public static boolean isWhilteList(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            String packageName = context.getPackageName();
            if (powerManager != null) {
                try {
                    return powerManager.isIgnoringBatteryOptimizations(packageName);
                } catch (RuntimeException e10) {
                    Logger.e(TAG, "dealType rethrowFromSystemServer:", e10);
                }
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
        if (context == null) {
            Logger.i(TAG, "readDataSaverMode manager is null!");
            return 0;
        }
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            Logger.i(TAG, "readDataSaverMode Context is null!");
            return 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return 0;
        }
        if (!connectivityManager.isActiveNetworkMetered()) {
            Logger.v(TAG, "ConnectType is not Mobile Network!");
            return 0;
        }
        if (i10 >= 24) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
        return 0;
    }

    public static int readPowerSaverMode(Context context) {
        if (context == null) {
            Logger.i(TAG, "readPowerSaverMode Context is null!");
            return 0;
        }
        int systemInt = SettingUtil.getSystemInt(context.getContentResolver(), "SmartModeStatus", 0);
        if (systemInt == 0) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null) {
                try {
                    return powerManager.isPowerSaveMode() ? 4 : 0;
                } catch (RuntimeException e10) {
                    Logger.e(TAG, "dealType rethrowFromSystemServer:", e10);
                }
            }
        }
        return systemInt;
    }
}
