package com.xiaomi.push;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class hc implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f107250a = "wcc-ml-test10.bj";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f107251b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f534a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private hf f535a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f536a = hb.f519a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f537b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f107252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f107253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f107254e;

    public hc(Map<String, Integer> map, int i10, String str, hf hfVar) {
        a(map, i10, str, hfVar);
    }

    public static final String a() {
        String str = f107251b;
        if (str != null) {
            return str;
        }
        if (aa.m141a()) {
            return "sandbox.xmpush.xiaomi.com";
        }
        return aa.b() ? "10.38.162.35" : "app.chat.xiaomi.net";
    }

    public static final void a(String str) {
        if (aa.b()) {
            return;
        }
        f107251b = str;
    }

    private void a(Map<String, Integer> map, int i10, String str, hf hfVar) {
        this.f534a = i10;
        this.f107252c = str;
        this.f535a = hfVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public int m445a() {
        return this.f534a;
    }

    public void a(boolean z10) {
        this.f536a = z10;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m446a() {
        return this.f536a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] mo447a() {
        return null;
    }

    public String b() {
        return this.f107254e;
    }

    public void b(String str) {
        this.f107254e = str;
    }

    public String c() {
        if (this.f107253d == null) {
            this.f107253d = a();
        }
        return this.f107253d;
    }

    public void c(String str) {
        this.f107253d = str;
    }
}
