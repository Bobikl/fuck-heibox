package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: Log.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f51529a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f51530b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f51531c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f51532d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f51533e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f51534f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f51535g = true;

    private u() {
    }

    @Pure
    private static String a(String str, @androidx.annotation.p0 Throwable th2) {
        String strG = g(th2);
        if (TextUtils.isEmpty(strG)) {
            return str;
        }
        String strValueOf = String.valueOf(str);
        String strReplace = strG.replace("\n", "\n  ");
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 4 + String.valueOf(strReplace).length());
        sb2.append(strValueOf);
        sb2.append("\n  ");
        sb2.append(strReplace);
        sb2.append('\n');
        return sb2.toString();
    }

    @Pure
    public static void b(String str, String str2) {
        if (f51534f == 0) {
            Log.d(str, str2);
        }
    }

    @Pure
    public static void c(String str, String str2, @androidx.annotation.p0 Throwable th2) {
        b(str, a(str2, th2));
    }

    @Pure
    public static void d(String str, String str2) {
        if (f51534f <= 3) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void e(String str, String str2, @androidx.annotation.p0 Throwable th2) {
        d(str, a(str2, th2));
    }

    @Pure
    public static int f() {
        return f51534f;
    }

    @androidx.annotation.p0
    @Pure
    public static String g(@androidx.annotation.p0 Throwable th2) {
        if (th2 == null) {
            return null;
        }
        if (j(th2)) {
            return "UnknownHostException (no network)";
        }
        return !f51535g ? th2.getMessage() : Log.getStackTraceString(th2).trim().replace("\t", "    ");
    }

    @Pure
    public static void h(String str, String str2) {
        if (f51534f <= 1) {
            Log.i(str, str2);
        }
    }

    @Pure
    public static void i(String str, String str2, @androidx.annotation.p0 Throwable th2) {
        h(str, a(str2, th2));
    }

    @Pure
    private static boolean j(@androidx.annotation.p0 Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void k(int i10) {
        f51534f = i10;
    }

    public static void l(boolean z10) {
        f51535g = z10;
    }

    @Pure
    public static void m(String str, String str2) {
        if (f51534f <= 2) {
            Log.w(str, str2);
        }
    }

    @Pure
    public static void n(String str, String str2, @androidx.annotation.p0 Throwable th2) {
        m(str, a(str2, th2));
    }
}
