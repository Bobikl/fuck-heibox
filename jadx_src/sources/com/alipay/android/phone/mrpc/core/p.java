package com.alipay.android.phone.mrpc.core;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f38129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f38130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f38131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HttpUrlHeader f38132h;

    public p(HttpUrlHeader httpUrlHeader, int i10, String str, byte[] bArr) {
        this.f38132h = httpUrlHeader;
        this.f38127c = i10;
        this.f38128d = str;
        this.f38153a = bArr;
    }

    public final HttpUrlHeader a() {
        return this.f38132h;
    }

    public final void a(long j10) {
        this.f38129e = j10;
    }

    public final void a(String str) {
        this.f38131g = str;
    }

    public final void b(long j10) {
        this.f38130f = j10;
    }
}
