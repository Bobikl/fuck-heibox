package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f61023a = {1, 6, 7, 9};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f61024b = {0, 2, 3, 4, 5};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, String> f61025c = new a();

    public static final class a extends HashMap<Integer, String> {
        a() {
            put(1, d4.d.f108135c);
            put(2, d4.d.f108135c);
            put(4, d4.d.f108135c);
            put(7, d4.d.f108135c);
            put(11, d4.d.f108135c);
            put(3, d4.d.f108136d);
            put(8, d4.d.f108136d);
            put(9, d4.d.f108136d);
            put(10, d4.d.f108136d);
            put(15, d4.d.f108136d);
            put(5, d4.d.f108136d);
            put(6, d4.d.f108136d);
            put(12, d4.d.f108136d);
            put(14, d4.d.f108136d);
            put(13, d4.d.f108137e);
            if (Build.VERSION.SDK_INT >= 29) {
                put(20, "5G");
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private static NetworkInfo a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th2) {
            v.b("hmsSdk", "cannot get network state, ensure permission android.permission.ACCESS_NETWORK_STATE in the manifest: " + th2.getMessage());
            return null;
        }
    }

    private static String a(int i10) {
        Map<Integer, String> map = f61025c;
        String str = map.containsKey(Integer.valueOf(i10)) ? map.get(Integer.valueOf(i10)) : "unknown";
        if (!"unknown".equals(str) || Build.VERSION.SDK_INT < 25) {
            return str;
        }
        if (i10 != 16) {
            return i10 != 17 ? "unknown" : d4.d.f108136d;
        }
        return d4.d.f108135c;
    }

    private static boolean a(NetworkInfo networkInfo) {
        return (networkInfo == null || Arrays.binarySearch(f61024b, networkInfo.getType()) == -1) ? false : true;
    }

    public static String b(Context context) {
        if (context == null) {
            return "unknown";
        }
        try {
            NetworkInfo networkInfoA = a(context);
            if (!b(networkInfoA)) {
                return "none";
            }
            if (c(networkInfoA)) {
                return "WIFI";
            }
            if (a(networkInfoA)) {
                return a(networkInfoA.getSubtype());
            }
            return "unknown";
        } catch (Throwable unused) {
        }
    }

    private static boolean b(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected();
    }

    private static boolean c(NetworkInfo networkInfo) {
        return (networkInfo == null || Arrays.binarySearch(f61023a, networkInfo.getType()) == -1) ? false : true;
    }
}
