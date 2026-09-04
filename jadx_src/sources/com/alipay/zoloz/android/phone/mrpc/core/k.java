package com.alipay.zoloz.android.phone.mrpc.core;

/* JADX INFO: compiled from: HttpUrlResponse.java */
/* JADX INFO: loaded from: classes6.dex */
public class k extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f39726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f39728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f39729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HttpUrlHeader f39730h;

    public k(HttpUrlHeader httpUrlHeader, int i10, String str, byte[] bArr) {
        this.f39730h = httpUrlHeader;
        this.f39725c = i10;
        this.f39726d = str;
        this.f39758a = bArr;
    }

    public String e() {
        return this.f39729g;
    }

    public int f() {
        return this.f39725c;
    }

    public long g() {
        return this.f39727e;
    }

    public HttpUrlHeader h() {
        return this.f39730h;
    }

    public String i() {
        return this.f39726d;
    }

    public long j() {
        return this.f39728f;
    }

    public void k(String str) {
        this.f39729g = str;
    }

    public void l(long j10) {
        this.f39727e = j10;
    }

    public void m(HttpUrlHeader httpUrlHeader) {
        this.f39730h = httpUrlHeader;
    }

    public void n(long j10) {
        this.f39728f = j10;
    }
}
