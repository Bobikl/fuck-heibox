package com.vivo.push.util;

import android.content.Context;

/* JADX INFO: compiled from: LogUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f106688a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f106689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f106690c;

    static {
        b();
    }

    public static int a(String str, String str2) {
        return f106688a.a(str, str2);
    }

    public static int a(String str, String str2, Throwable th2) {
        return f106688a.a(str, str2, th2);
    }

    public static int a(String str, Throwable th2) {
        return f106688a.a(str, th2);
    }

    public static String a(Throwable th2) {
        return f106688a.a(th2);
    }

    public static void a(Context context, String str) {
        f106688a.a(context, str);
    }

    public static void a(boolean z10) {
        b();
        f106690c = z10;
    }

    public static boolean a() {
        return f106689b && f106690c;
    }

    public static int b(String str, String str2) {
        return f106688a.b(str, str2);
    }

    public static int b(String str, String str2, Throwable th2) {
        return f106688a.b(str, str2, th2);
    }

    private static void b() {
        f106689b = z.b("persist.sys.log.ctrl", "no").equals("yes");
    }

    public static void b(Context context, String str) {
        f106688a.b(context, str);
    }

    public static int c(String str, String str2) {
        return f106688a.c(str, str2);
    }

    public static void c(Context context, String str) {
        f106688a.c(context, str);
    }

    public static int d(String str, String str2) {
        return f106688a.d(str, str2);
    }

    public static int e(String str, String str2) {
        return f106688a.e(str, str2);
    }
}
