package com.tencent.liteav.base.system;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Debug;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.t;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav")
public class LiteavSystemInfo {
    private static final int APP_SYSTEM_METHOD_DEFAULT_GET_INTERVAL_MS = 1000;
    private static final String EXT_KEY_APP_BACKGROUND = "isAppBackground";
    private static final String EXT_KEY_APP_NAME = "appName";
    private static final String EXT_KEY_APP_PACKAGE_NAME = "appPackageName";
    private static final String EXT_KEY_APP_VERSION = "appVersion";
    private static final String EXT_KEY_BUILD_BOARD = "buildBoard";
    private static final String EXT_KEY_BUILD_BRAND = "buildBrand";
    private static final String EXT_KEY_BUILD_HARDWARE = "buildHardware";
    private static final String EXT_KEY_BUILD_MANUFACTURER = "buildManufacturer";
    private static final String EXT_KEY_BUILD_MODEL = "buildModel";
    private static final String EXT_KEY_BUILD_VERSION = "buildVersion";
    private static final String EXT_KEY_BUILD_VERSION_INT = "buildVersionInt";
    private static final int GET_APP_MEMORY_INTERVAL_MS = 15000;
    private static final int NETWORK_TYPE_2G = 4;
    private static final int NETWORK_TYPE_3G = 3;
    private static final int NETWORK_TYPE_4G = 2;
    private static final int NETWORK_TYPE_5G = 6;
    private static final int NETWORK_TYPE_UNKNOWN = 0;
    private static final int NETWORK_TYPE_WIFI = 1;
    private static final int NETWORK_TYPE_WIRED = 5;
    private static final String TAG = "LiteavBaseSystemInfo";
    private static final t<String> sModel = new t<>(j.a());
    private static final t<String> sBrand = new t<>(k.a());
    private static final t<String> sManufacturer = new t<>(l.a());
    private static final t<String> sHardware = new t<>(m.a());
    private static final t<String> sSystemOSVersion = new t<>(n.a());
    private static final t<Integer> sSystemOSVersionInt = new t<>(o.a());
    private static final t<String> sBoard = new t<>(p.a());
    private static final t<String> sAppPackageName = new t<>(d.a());
    private static final t<String> sAppName = new t<>(e.a());
    private static final t<String> sAppVersion = new t<>(f.a());
    private static final t<String> sUUID = new t<>(g.a());
    private static final t<String[]> sCpuABIs = new t<>(h.a());
    private static AtomicBoolean sIsGettingMemoryUsage = new AtomicBoolean(false);
    private static AtomicInteger sLastMemoryUsage = new AtomicInteger(0);
    private static final com.tencent.liteav.base.b.a sMemoryUsageThrottler = new com.tencent.liteav.base.b.a(15000);
    private static int sLastNetworkType = 0;
    private static final com.tencent.liteav.base.b.a sNetworkTypeThrottler = new com.tencent.liteav.base.b.a(1000);
    private static int sLastGateway = 0;
    private static final com.tencent.liteav.base.b.a sGatewayThrottler = new com.tencent.liteav.base.b.a(1000);
    private static boolean sLastMicPermission = false;
    private static final com.tencent.liteav.base.b.a sMicPermissionThrottler = new com.tencent.liteav.base.b.a(1000);

    public static synchronized int getAppBackgroundState() {
        return com.tencent.liteav.base.util.j.a().b() ? 1 : 0;
    }

    public static synchronized int getAppMemoryUsage() {
        if (sMemoryUsageThrottler.a()) {
            getAppMemoryUsageFromSystem();
        }
        return sLastMemoryUsage.get();
    }

    private static void getAppMemoryUsageFromSystem() {
        if (sIsGettingMemoryUsage.get()) {
            return;
        }
        sIsGettingMemoryUsage.set(true);
        AsyncTask.execute(c.a());
    }

    public static String getAppName() {
        return sAppName.a();
    }

    public static String getAppPackageName() {
        return sAppPackageName.a();
    }

    public static synchronized int getAppThreadSize() {
        ThreadGroup threadGroup;
        threadGroup = Thread.currentThread().getThreadGroup();
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        return threadGroup.activeCount();
    }

    public static String getAppVersion() {
        return sAppVersion.a();
    }

    public static synchronized boolean getAudioRecordPermission() {
        if (sMicPermissionThrottler.a()) {
            sLastMicPermission = getAudioRecordPermissionFromSystem();
        }
        return sLastMicPermission;
    }

    private static boolean getAudioRecordPermissionFromSystem() {
        Context applicationContext = ContextUtils.getApplicationContext();
        return applicationContext != null && applicationContext.checkPermission("android.permission.RECORD_AUDIO", Process.myPid(), Process.myUid()) == 0;
    }

    public static String getBoard() {
        return sBoard.a();
    }

    public static String getBrand() {
        return sBrand.a();
    }

    public static String getDeviceUuid() {
        return sUUID.a();
    }

    public static synchronized int getGateway() {
        if (sGatewayThrottler.a()) {
            sLastGateway = getGatewayFromSystem();
        }
        return sLastGateway;
    }

    private static int getGatewayFromSystem() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            return ((WifiManager) applicationContext.getSystemService("wifi")).getDhcpInfo().gateway;
        } catch (Throwable th2) {
            Log.e(TAG, "getGateway error " + th2.getMessage(), new Object[0]);
            return 0;
        }
    }

    public static String getHardware() {
        return sHardware.a();
    }

    public static String getManufacturer() {
        return sManufacturer.a();
    }

    public static String getModel() {
        return sModel.a();
    }

    public static synchronized int getNetworkType() {
        if (sNetworkTypeThrottler.a()) {
            sLastNetworkType = getNetworkTypeFromSystem();
        }
        return sLastNetworkType;
    }

    private static int getNetworkTypeFromSystem() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService(g0.a.f118921e);
        NetworkInfo activeNetworkInfo = null;
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e10) {
            Log.e(TAG, "getNetworkType error occurred.", e10);
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 9) {
            return 5;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 1;
        }
        if (activeNetworkInfo.getType() != 0) {
            return 0;
        }
        try {
            int networkType = telephonyManager.getNetworkType();
            switch (networkType) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 4;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 3;
                case 13:
                    return 2;
                default:
                    return (getSystemOSVersionInt() < 29 || networkType != 20) ? 2 : 6;
            }
        } catch (Exception e11) {
            Log.e(TAG, "getNetworkType error occurred.", e11);
            return 2;
        }
        Log.e(TAG, "getNetworkType error occurred.", e11);
        return 2;
    }

    public static synchronized String getProperty(String str) {
        String property;
        try {
            property = System.getProperty(str);
            try {
                Log.i(TAG, "Get " + str + " property is " + property, new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                Log.e(TAG, "Get property failed. ".concat(String.valueOf(th)), new Object[0]);
            }
        } catch (Throwable th3) {
            th = th3;
            property = null;
        }
        return property;
    }

    public static int[] getScreenSizeInPixels() {
        int[] iArr = {0, 0};
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            Log.e(TAG, "Context is null.", new Object[0]);
            return iArr;
        }
        try {
            WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
            if (windowManager == null) {
                Log.e(TAG, "WindowManager is null.", new Object[0]);
                return iArr;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            iArr[0] = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            iArr[1] = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            return iArr;
        } catch (Throwable th2) {
            Log.e(TAG, "Get display from window service failed. ".concat(String.valueOf(th2)), new Object[0]);
            return iArr;
        }
    }

    public static String[] getSupportABIs() {
        return sCpuABIs.a();
    }

    public static String getSystemOSVersion() {
        return sSystemOSVersion.a();
    }

    public static int getSystemOSVersionInt() {
        return sSystemOSVersionInt.a().intValue();
    }

    public static synchronized String getSystemProperty(String str) {
        String str2;
        str2 = null;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (objInvoke != null) {
                String str3 = (String) objInvoke;
                try {
                    Log.i(TAG, "Get " + str + " property is " + str3, new Object[0]);
                    str2 = str3;
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str3;
                    Log.e(TAG, "Get system property failed. ".concat(String.valueOf(th)), new Object[0]);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return str2;
    }

    static /* synthetic */ void lambda$getAppMemoryUsageFromSystem$9() {
        int totalPss;
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            totalPss = memoryInfo.getTotalPss();
        } catch (Exception e10) {
            Log.e(TAG, "Get App memory usage failed." + e10.getMessage(), new Object[0]);
            totalPss = 0;
        }
        sLastMemoryUsage.set(totalPss / 1024);
        sIsGettingMemoryUsage.set(false);
    }

    public static synchronized void listenAppBackgroundState() {
        com.tencent.liteav.base.util.j.a().a(i.a());
    }

    private static native void nativeOnAppBackgroundStateChanged(int i10);

    public static void onAppBackgroundStateChanged(boolean z10) {
        nativeOnAppBackgroundStateChanged(z10 ? 1 : 0);
    }

    public static boolean setExtID(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            str.hashCode();
            switch (str) {
                case "isAppBackground":
                    try {
                        com.tencent.liteav.base.util.j.a(Integer.parseInt(str2) == 1);
                        return true;
                    } catch (Exception e10) {
                        Log.e(TAG, "set app background state failed. ".concat(String.valueOf(e10)), new Object[0]);
                        break;
                    }
                    break;
                case "buildVersion":
                    sSystemOSVersion.a(str2);
                    return true;
                case "appName":
                    sAppName.a(str2);
                    return true;
                case "buildManufacturer":
                    sManufacturer.a(str2);
                    return true;
                case "buildBoard":
                    sBoard.a(str2);
                    return true;
                case "buildBrand":
                    sBrand.a(str2);
                    return true;
                case "buildModel":
                    sModel.a(str2);
                    return true;
                case "appPackageName":
                    sAppPackageName.a(str2);
                    return true;
                case "buildHardware":
                    sHardware.a(str2);
                    return true;
                case "buildVersionInt":
                    try {
                        sSystemOSVersionInt.a(Integer.valueOf(Integer.parseInt(str2)));
                        break;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    return true;
                case "appVersion":
                    sAppVersion.a(str2);
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }
}
