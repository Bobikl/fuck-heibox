package com.apm.lite.k;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class q {
    public static void a(Object obj) {
        if (com.apm.lite.e.o().isDebugMode()) {
            Log.i("npth", String.valueOf(obj));
        }
    }

    public static void b(String str) {
        if (com.apm.lite.e.o().isDebugMode()) {
            Log.w("npth", str);
        }
    }

    public static void c(String str, Object obj) {
        if (com.apm.lite.e.o().isDebugMode()) {
            Log.i("npth", str + " " + obj);
        }
    }

    public static void d(String str, Object obj, Throwable th2) {
        if (com.apm.lite.e.o().isDebugMode()) {
            Log.e("npth", str + " " + obj, th2);
        }
    }

    public static void e(String str, Throwable th2) {
        if (com.apm.lite.e.o().isDebugMode()) {
            Log.e("npth", str + " NPTH Catch Error", th2);
        }
    }

    public static void f(Throwable th2) {
        if (com.apm.lite.e.o().isDebugMode()) {
            Log.e("npth", "NPTH Catch Error", th2);
        }
    }

    public static void g(Throwable th2) {
        if (com.apm.lite.e.o().isDebugMode()) {
            Log.w("npth", "NPTH Catch Error", th2);
        }
    }
}
