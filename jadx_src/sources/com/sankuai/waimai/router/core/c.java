package com.sankuai.waimai.router.core;

import androidx.annotation.p0;

/* JADX INFO: compiled from: Debugger.java */
/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f96488a = "WMRouter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private static a f96489b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f96490c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f96491d = false;

    /* JADX INFO: compiled from: Debugger.java */
    public interface a {
        void a(String str, Object... objArr);

        void b(String str, Object... objArr);

        void c(String str, Object... objArr);

        void d(String str, Object... objArr);

        void e(String str, Object... objArr);

        void f(Throwable th2);

        void g(Throwable th2);

        void h(Throwable th2);
    }

    public static void a(String str, Object... objArr) {
        a aVar = f96489b;
        if (aVar != null) {
            aVar.b(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        a aVar = f96489b;
        if (aVar != null) {
            aVar.c(str, objArr);
        }
    }

    public static void c(Throwable th2) {
        a aVar = f96489b;
        if (aVar != null) {
            aVar.h(th2);
        }
    }

    public static void d(String str, Object... objArr) {
        a aVar = f96489b;
        if (aVar != null) {
            aVar.e(str, objArr);
        }
    }

    public static void e(Throwable th2) {
        a aVar = f96489b;
        if (aVar != null) {
            aVar.g(th2);
        }
    }

    public static void f(String str, Object... objArr) {
        a aVar = f96489b;
        if (aVar != null) {
            aVar.a(str, objArr);
        }
    }

    public static boolean g() {
        return f96490c;
    }

    public static boolean h() {
        return f96491d;
    }

    public static boolean i() {
        return f96489b != null;
    }

    public static void j(boolean z10) {
        f96490c = z10;
    }

    public static void k(boolean z10) {
        f96491d = z10;
    }

    public static void l(a aVar) {
        f96489b = aVar;
    }

    public static void m(String str, Object... objArr) {
        a aVar = f96489b;
        if (aVar != null) {
            aVar.d(str, objArr);
        }
    }

    public static void n(Throwable th2) {
        a aVar = f96489b;
        if (aVar != null) {
            aVar.f(th2);
        }
    }
}
