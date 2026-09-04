package com.tencent.qmsp.sdk.base;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f101736a = "2g.outt";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f101737b = false;

    public static void a(String str) {
        if (f101737b) {
            Log.d(f101736a, str);
        }
    }

    public static void a(boolean z10) {
        f101737b = z10;
    }

    public static void b(String str) {
        if (f101737b) {
            Log.e(f101736a, str);
        }
    }

    public static void c(String str) {
        if (f101737b) {
            Log.i(f101736a, str);
        }
    }
}
