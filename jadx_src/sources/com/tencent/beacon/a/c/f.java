package com.tencent.beacon.a.c;

/* JADX INFO: compiled from: PrivateInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f98811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98812b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f98813c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f98814d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f98815e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f98816f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f98817g = "unset";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f98818h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f98819i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f98820j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f98821k = "";

    private f() {
    }

    public static f e() {
        if (f98811a == null) {
            synchronized (f.class) {
                if (f98811a == null) {
                    f98811a = new f();
                }
            }
        }
        return f98811a;
    }

    public String a() {
        return this.f98812b;
    }

    public void a(String str) {
        this.f98812b = str;
    }

    public String b() {
        return this.f98813c;
    }

    public void b(String str) {
        this.f98813c = str;
    }

    public String c() {
        return this.f98814d;
    }

    public void c(String str) {
        this.f98814d = str;
    }

    public String d() {
        return this.f98815e;
    }

    public void d(String str) {
        this.f98815e = str;
    }

    public void e(String str) {
        this.f98818h = str;
    }

    public String f() {
        return this.f98818h;
    }

    public void f(String str) {
        this.f98816f = str;
    }

    public String g() {
        return this.f98816f;
    }

    public void g(String str) {
        this.f98817g = str;
    }

    public String h() {
        return this.f98817g;
    }

    public void h(String str) {
        this.f98821k = str;
    }

    public String i() {
        return this.f98821k;
    }

    public void i(String str) {
        this.f98819i = str;
    }

    public String j() {
        return this.f98819i;
    }

    public void j(String str) {
        this.f98820j = str;
    }

    public String k() {
        return this.f98820j;
    }
}
