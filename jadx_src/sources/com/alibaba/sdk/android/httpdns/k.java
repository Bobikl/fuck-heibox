package com.alibaba.sdk.android.httpdns;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class k implements Thread.UncaughtExceptionHandler {
    private void b(Throwable th2) {
        com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
        if (bVarA != null) {
            bVarA.k(th2.getMessage());
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        try {
            Log.e("HttpDnsSDK", "Catch an uncaught exception, " + thread.getName() + ", error message: " + th2.getMessage());
            b(th2);
            th2.printStackTrace();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
