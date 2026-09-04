package com.tencent.beacon.base.net;

/* JADX INFO: compiled from: NetFailure.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f98940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f98942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f98943e;

    public e(String str, String str2, int i10, String str3) {
        this.f98939a = str;
        this.f98940b = str2;
        this.f98941c = i10;
        this.f98942d = str3;
    }

    public e(String str, String str2, int i10, String str3, Throwable th2) {
        this.f98939a = str;
        this.f98940b = str2;
        this.f98941c = i10;
        this.f98942d = str3;
        this.f98943e = th2;
    }

    public String toString() {
        return "NetFailure{requestType='" + this.f98939a + "', attaCode='" + this.f98940b + "', responseCode=" + this.f98941c + ", msg='" + this.f98942d + "', exception=" + this.f98943e + '}';
    }
}
