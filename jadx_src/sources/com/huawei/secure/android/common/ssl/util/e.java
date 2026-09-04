package com.huawei.secure.android.common.ssl.util;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63054a = "SecurityComp10200303: ";

    private static String a(String str) {
        return f63054a + str;
    }

    public static void a(String str, String str2) {
    }

    public static void a(String str, String str2, Throwable th2) {
        Log.e(a(str), str2, th2);
    }

    public static void b(String str, String str2) {
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        Log.i(a(str), str2);
    }

    public static void d(String str, String str2) {
        Log.v(a(str), str2);
    }

    public static void e(String str, String str2) {
        Log.w(a(str), str2);
    }
}
