package com.alipay.mobile.android.verify.logger;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39364a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39365b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39366c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39367d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39368e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f39369f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static h f39370g = new i();

    private f() {
    }

    public static void a(c cVar) {
        f39370g.h(cVar);
    }

    public static void b() {
        f39370g.l();
    }

    public static void c(Object obj) {
        f39370g.g(obj);
    }

    public static void d(String str, Object... objArr) {
        f39370g.b(str, objArr);
    }

    public static void e(String str, Object... objArr) {
        f39370g.k(null, str, objArr);
    }

    public static void f(Throwable th2, String str, Object... objArr) {
        f39370g.k(th2, str, objArr);
    }

    public static void g(String str, Object... objArr) {
        f39370g.a(str, objArr);
    }

    public static void h(String str) {
        f39370g.f(str);
    }

    public static void i(int i10, String str, String str2, Throwable th2) {
        f39370g.log(i10, str, str2, th2);
    }

    public static void j(h hVar) {
        f39370g = hVar;
    }

    public static h k(String str) {
        return f39370g.i(str);
    }

    public static void l(String str, Object... objArr) {
        f39370g.m(str, objArr);
    }

    public static void m(String str, Object... objArr) {
        f39370g.d(str, objArr);
    }

    public static void n(String str, Object... objArr) {
        f39370g.e(str, objArr);
    }

    public static void o(String str) {
        f39370g.j(str);
    }
}
