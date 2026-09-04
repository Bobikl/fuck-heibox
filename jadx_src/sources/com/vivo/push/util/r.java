package com.vivo.push.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: NetUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public final class r {
    public static NetworkInfo a(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e10) {
            p.a("NetUtils", e10);
            return null;
        }
    }
}
