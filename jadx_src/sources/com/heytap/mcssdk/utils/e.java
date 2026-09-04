package com.heytap.mcssdk.utils;

import android.util.Log;

/* JADX INFO: compiled from: LogUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f59958a = "mcssdk---";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f59959b = "MCS";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f59960c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f59961d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f59962e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f59963f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f59964g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f59965h = "-->";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f59966i = true;

    public static void A(String str) {
        if (f59963f && f59966i) {
            Log.w(f59958a, f59959b + f59965h + str);
        }
    }

    public static void B(String str, String str2) {
        if (f59963f && f59966i) {
            Log.w(str, f59959b + f59965h + str2);
        }
    }

    public static void a(String str) {
        if (f59962e && f59966i) {
            Log.d(f59958a, f59959b + f59965h + str);
        }
    }

    public static void b(String str, String str2) {
        if (f59962e && f59966i) {
            Log.d(str, f59959b + f59965h + str2);
        }
    }

    public static void c(Exception exc) {
        if (!f59964g || exc == null) {
            return;
        }
        Log.e(f59958a, exc.getMessage());
    }

    public static void d(String str) {
        if (f59964g && f59966i) {
            Log.e(f59958a, f59959b + f59965h + str);
        }
    }

    public static void e(String str, String str2) {
        if (f59964g && f59966i) {
            Log.e(str, f59959b + f59965h + str2);
        }
    }

    public static void f(String str, Throwable th2) {
        if (f59964g) {
            Log.e(str, th2.toString());
        }
    }

    public static String g() {
        return f59965h;
    }

    public static String h() {
        return f59959b;
    }

    public static void i(String str) {
        if (f59961d && f59966i) {
            Log.i(f59958a, f59959b + f59965h + str);
        }
    }

    public static void j(String str, String str2) {
        if (f59961d && f59966i) {
            Log.i(str, f59959b + f59965h + str2);
        }
    }

    public static boolean k() {
        return f59962e;
    }

    public static boolean l() {
        return f59966i;
    }

    public static boolean m() {
        return f59964g;
    }

    public static boolean n() {
        return f59961d;
    }

    public static boolean o() {
        return f59960c;
    }

    public static boolean p() {
        return f59963f;
    }

    public static void q(boolean z10) {
        f59962e = z10;
    }

    public static void r(boolean z10) {
        f59966i = z10;
        if (z10) {
            f59960c = true;
            f59962e = true;
            f59961d = true;
            f59963f = true;
            f59964g = true;
            return;
        }
        f59960c = false;
        f59962e = false;
        f59961d = false;
        f59963f = false;
        f59964g = false;
    }

    public static void s(boolean z10) {
        f59964g = z10;
    }

    public static void t(boolean z10) {
        f59961d = z10;
    }

    public static void u(String str) {
        f59965h = str;
    }

    public static void v(String str) {
        f59959b = str;
    }

    public static void w(boolean z10) {
        f59960c = z10;
    }

    public static void x(boolean z10) {
        f59963f = z10;
    }

    public static void y(String str) {
        if (f59960c && f59966i) {
            Log.v(f59958a, f59959b + f59965h + str);
        }
    }

    public static void z(String str, String str2) {
        if (f59960c && f59966i) {
            Log.v(str, f59959b + f59965h + str2);
        }
    }
}
