package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f38186a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f38187b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f38188c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f38189d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f38190e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Map<String, String> f38191f = new HashMap();

    public static synchronized String a(String str) {
        String str2 = "apdidTokenCache" + str;
        if (f38191f.containsKey(str2)) {
            String str3 = f38191f.get(str2);
            if (e6.a.f(str3)) {
                return str3;
            }
        }
        return "";
    }

    public static synchronized void a() {
    }

    public static synchronized void a(b bVar) {
        if (bVar != null) {
            f38186a = bVar.f38172a;
            f38187b = bVar.f38173b;
            f38188c = bVar.f38174c;
        }
    }

    public static synchronized void a(c cVar) {
        if (cVar != null) {
            f38186a = cVar.f38175a;
            f38187b = cVar.f38176b;
            f38189d = cVar.f38178d;
            f38190e = cVar.f38179e;
            f38188c = cVar.f38177c;
        }
    }

    public static synchronized void a(String str, String str2) {
        String str3 = "apdidTokenCache" + str;
        if (f38191f.containsKey(str3)) {
            f38191f.remove(str3);
        }
        f38191f.put(str3, str2);
    }

    public static synchronized boolean a(Context context, String str) {
        long jA;
        boolean z10;
        try {
            jA = h.a(context);
            if (jA < 0) {
                jA = 86400000;
            }
        } catch (Throwable unused) {
        }
        try {
            z10 = Math.abs(System.currentTimeMillis() - h.h(context, str)) < jA;
        } catch (Throwable th2) {
            com.alipay.apmobilesecuritysdk.c.a.a(th2);
        }
        return z10;
    }

    public static synchronized String b() {
        return f38186a;
    }

    public static void b(String str) {
        f38186a = str;
    }

    public static synchronized String c() {
        return f38187b;
    }

    public static void c(String str) {
        f38187b = str;
    }

    public static synchronized String d() {
        return f38189d;
    }

    public static void d(String str) {
        f38188c = str;
    }

    public static synchronized String e() {
        return f38190e;
    }

    public static void e(String str) {
        f38189d = str;
    }

    public static synchronized String f() {
        return f38188c;
    }

    public static void f(String str) {
        f38190e = str;
    }

    public static synchronized c g() {
        return new c(f38186a, f38187b, f38188c, f38189d, f38190e);
    }

    public static void h() {
        f38191f.clear();
        f38186a = "";
        f38187b = "";
        f38189d = "";
        f38190e = "";
        f38188c = "";
    }
}
