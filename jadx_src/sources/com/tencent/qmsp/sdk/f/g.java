package com.tencent.qmsp.sdk.f;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f101940a = "Qp.Log";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f101941b = false;

    public static void a(String str, int i10, String str2) {
        if (f101941b) {
            Log.d(str, str2);
        }
    }

    public static void a(boolean z10) {
        f101941b = z10;
    }

    public static void b(String str, int i10, String str2) {
        if (f101941b) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, int i10, String str2) {
        if (f101941b) {
            Log.v(str, str2);
        }
    }

    public static void d(String str, int i10, String str2) {
        if (f101941b) {
            Log.w(str, str2);
        }
    }
}
