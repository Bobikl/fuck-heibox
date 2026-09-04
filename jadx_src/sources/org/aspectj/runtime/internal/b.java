package org.aspectj.runtime.internal;

/* JADX INFO: compiled from: CFlowCounter.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static org.aspectj.runtime.internal.cflowstack.d f137698b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.aspectj.runtime.internal.cflowstack.a f137699a = f137698b.a();

    static {
        h();
    }

    private static String b(String str, String str2) {
        try {
            return System.getProperty(str, str2);
        } catch (SecurityException unused) {
            return str2;
        }
    }

    private static org.aspectj.runtime.internal.cflowstack.d c() {
        return new org.aspectj.runtime.internal.cflowstack.e();
    }

    private static org.aspectj.runtime.internal.cflowstack.d d() {
        return new org.aspectj.runtime.internal.cflowstack.f();
    }

    public static String e() {
        return f137698b.getClass().getName();
    }

    private static void h() {
        String strB = b("aspectj.runtime.cflowstack.usethreadlocal", "unspecified");
        boolean z10 = false;
        if (!strB.equals("unspecified") ? strB.equals("yes") || strB.equals("true") : System.getProperty("java.class.version", "0.0").compareTo("46.0") >= 0) {
            z10 = true;
        }
        if (z10) {
            f137698b = c();
        } else {
            f137698b = d();
        }
    }

    public void a() {
        this.f137699a.a();
        if (this.f137699a.d()) {
            return;
        }
        this.f137699a.b();
    }

    public void f() {
        this.f137699a.c();
    }

    public boolean g() {
        return this.f137699a.d();
    }
}
