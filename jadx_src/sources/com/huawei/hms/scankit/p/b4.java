package com.huawei.hms.scankit.p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: HiAnalyticsLogUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f61566a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f61567b;

    public static String a() {
        return Build.VERSION.RELEASE;
    }

    public static String a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0) {
            return "Unknown";
        }
        String subtypeName = activeNetworkInfo.getSubtypeName();
        switch (((TelephonyManager) context.getSystemService(g0.a.f118921e)).getNetworkType()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return d4.d.f108135c;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return d4.d.f108136d;
            case 13:
                return d4.d.f108137e;
            default:
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? d4.d.f108136d : subtypeName;
        }
    }

    public static String a(Context context, boolean z10) {
        return new a1(context, z10).a();
    }

    public static String b() {
        return "";
    }

    public static String b(Context context) {
        return ((TelephonyManager) context.getSystemService(g0.a.f118921e)).getNetworkOperator();
    }

    public static String c() {
        return Build.MODEL;
    }

    public static String d() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, r4.a.f138781a);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        } catch (RuntimeException | InvocationTargetException | Exception unused2) {
            return "";
        }
    }
}
