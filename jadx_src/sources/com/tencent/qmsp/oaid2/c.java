package com.tencent.qmsp.oaid2;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f101560a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f101561b = "2g.outt";

    public static void a(String str) {
        if (f101560a) {
            Log.d(f101561b, str);
        }
    }

    public static void b(String str) {
        if (f101560a) {
            Log.e(f101561b, str);
        }
    }

    public static void c(String str) {
        if (f101560a) {
            Log.i(f101561b, str);
        }
    }
}
