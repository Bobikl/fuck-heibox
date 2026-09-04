package com.bytedance.realx.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import com.max.hbutils.utils.o;

/* JADX INFO: loaded from: classes6.dex */
public class RXPowerMonitorAndroid {
    private static String TAG = "RXPowerMonitorAndroid";
    private static Intent batteryStatus;
    private static IntentFilter ifilter;
    private static PowerManager powerManager;
    private static Context context = ContextUtils.getApplicationContext();
    private static float batteryVolt = -1.0f;
    private static BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.bytedance.realx.base.RXPowerMonitorAndroid.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context2, Intent intent) {
            if (RXPowerMonitorAndroid.batteryStatus == null) {
                Intent unused = RXPowerMonitorAndroid.batteryStatus = new Intent();
            }
            int unused2 = RXPowerMonitorAndroid.charge_status = intent.getIntExtra("status", -1);
            int unused3 = RXPowerMonitorAndroid.battery_temperature = RXPowerMonitorAndroid.batteryStatus.getIntExtra("temperature", -1);
        }
    };
    private static int mCpuCoreCount = -1;
    private static int charge_status = -1;
    private static int battery_temperature = -1;
    private static BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");

    static {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        ifilter = intentFilter;
        batteryStatus = context.registerReceiver(mBroadcastReceiver, intentFilter);
        powerManager = (PowerManager) context.getSystemService("power");
    }

    public static int getBatteryCurrentCapacity() {
        try {
            int longProperty = ((int) ((BatteryManager) context.getSystemService("batterymanager")).getLongProperty(1)) / 1000;
            if (longProperty < 0) {
                return -1;
            }
            return longProperty;
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static int getBatteryDesignCapacity() {
        try {
            return (int) Math.round(((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", new Class[0]).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(context), new Object[0])).doubleValue());
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int getBatteryLevel() {
        BatteryManager batteryManager2 = batteryManager;
        if (batteryManager2 != null) {
            return batteryManager2.getIntProperty(4);
        }
        return -1;
    }

    public static int getBatteryMaxCapacity() {
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static int getBatterySaveStatus() {
        ?? IsPowerSaveMode = -1;
        IsPowerSaveMode = -1;
        try {
            String str = Build.MANUFACTURER;
            if (str.equalsIgnoreCase("Xiaomi")) {
                IsPowerSaveMode = Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN");
            } else if (str.equalsIgnoreCase(o.f73558d)) {
                IsPowerSaveMode = Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4 ? 1 : 0;
            } else {
                PowerManager powerManager2 = powerManager;
                if (powerManager2 != null) {
                    IsPowerSaveMode = powerManager2.isPowerSaveMode();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return IsPowerSaveMode;
    }

    public static int getBatteryTemperature() {
        return battery_temperature / 10;
    }

    public static int getChargeStatus() {
        BatteryManager batteryManager2;
        int intProperty = (Build.VERSION.SDK_INT < 26 || (batteryManager2 = batteryManager) == null) ? charge_status : batteryManager2.getIntProperty(6);
        return (intProperty == 5 || intProperty == 2) ? 1 : 0;
    }

    public static int getScreenBrightness() {
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            return -1;
        }
        return (int) ((((double) Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1)) / 255.0d) * 100.0d);
    }

    public static int getVoltage() {
        return -1;
    }
}
