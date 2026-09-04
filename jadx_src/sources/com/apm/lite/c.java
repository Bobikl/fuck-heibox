package com.apm.lite;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f39875a;

    private c() {
    }

    public static c a() {
        if (f39875a == null) {
            synchronized (c.class) {
                if (f39875a == null) {
                    f39875a = new c();
                }
            }
        }
        return f39875a;
    }

    public static void b(String str, Throwable th2) {
    }

    public static void c(Throwable th2, String str) {
    }
}
