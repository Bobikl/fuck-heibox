package com.tencent.qmsp.sdk.f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes4.dex */
public class f {
    public static NetworkInfo a(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th2) {
            g.b("Qp.NU", 0, th2.toString());
            return null;
        }
    }

    public static boolean b(Context context) {
        NetworkInfo networkInfoA;
        return (context == null || (networkInfoA = a(context)) == null || networkInfoA.getType() != 1) ? false : true;
    }
}
