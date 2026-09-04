package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.j;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class AnalyticsConfig {
    public static boolean CATCH_EXCEPTION = false;
    public static boolean CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    public static boolean CLEAR_EKV_BL = false;
    public static boolean CLEAR_EKV_WL = false;
    public static final String DEBUG_KEY = "debugkey";
    public static final String DEBUG_MODE_PERIOD = "sendaging";
    public static String GPU_RENDERER = "";
    public static String GPU_VENDER = "";
    public static final String RTD_PERIOD = "period";
    public static final String RTD_SP_FILE = "um_rtd_conf";
    public static final String RTD_START_TIME = "startTime";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static double[] f104321a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f104322b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f104323c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f104324d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f104325e = 0;
    public static boolean enable = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Object f104326f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f104327g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f104328h = "";
    public static long kContinueSessionMillis = 30000;
    public static String mWrapperType;
    public static String mWrapperVersion;

    static void a(Context context, int i10) {
        f104325e = i10;
        com.umeng.common.b.a(context).a(f104325e);
    }

    static void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            UMLog.aq(j.A, 0, "\\|");
        } else {
            f104324d = str;
            com.umeng.common.b.a(context).a(f104324d);
        }
    }

    static void a(String str) {
        f104323c = str;
    }

    public static String getAppkey(Context context) {
        return UMUtils.getAppkey(context);
    }

    public static String getChannel(Context context) {
        return UMUtils.getChannel(context);
    }

    public static String getGameSdkVersion(Context context) {
        try {
            Class<?> cls = Class.forName("com.umeng.analytics.game.GameSdkVersion");
            return (String) cls.getDeclaredField("SDK_VERSION").get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static double[] getLocation() {
        return f104321a;
    }

    public static String getRealTimeDebugKey() {
        String str;
        synchronized (f104326f) {
            str = f104328h;
        }
        return str;
    }

    public static String getSecretKey(Context context) {
        if (TextUtils.isEmpty(f104324d)) {
            f104324d = com.umeng.common.b.a(context).c();
        }
        return f104324d;
    }

    public static int getVerticalType(Context context) {
        if (f104325e == 0) {
            f104325e = com.umeng.common.b.a(context).d();
        }
        return f104325e;
    }

    public static boolean isRealTimeDebugMode() {
        boolean z10;
        synchronized (f104326f) {
            z10 = f104327g;
        }
        return z10;
    }

    public static void turnOffRealTimeDebug() {
        synchronized (f104326f) {
            f104327g = false;
            f104328h = "";
        }
    }

    public static void turnOnRealTimeDebug(Map<String, String> map) {
        synchronized (f104326f) {
            f104327g = true;
            if (map != null && map.containsKey("debugkey")) {
                f104328h = map.get("debugkey");
            }
        }
    }
}
