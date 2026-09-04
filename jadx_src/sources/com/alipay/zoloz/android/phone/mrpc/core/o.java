package com.alipay.zoloz.android.phone.mrpc.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import org.apache.http.HttpHost;

/* JADX INFO: compiled from: NetworkUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39751a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39752b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39753c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39754d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39755e = 13;

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo a(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static int b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    public static int c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 3;
        }
        if (type == 0) {
            return e(activeNetworkInfo) ? 2 : 1;
        }
        return 0;
    }

    public static HttpHost d(Context context) {
        NetworkInfo networkInfoA = a(context);
        if (networkInfoA != null && networkInfoA.isAvailable()) {
            String defaultHost = Proxy.getDefaultHost();
            int defaultPort = Proxy.getDefaultPort();
            if (defaultHost != null) {
                return new HttpHost(defaultHost, defaultPort);
            }
        }
        return null;
    }

    private static boolean e(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return false;
        }
        int subtype = networkInfo.getSubtype();
        if (subtype != 3 && subtype != 13 && subtype != 5 && subtype != 6) {
            switch (subtype) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean f(Context context) {
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
        if (allNetworkInfo == null) {
            return false;
        }
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnectedOrConnecting()) {
                return true;
            }
        }
        return false;
    }
}
