package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class br {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f106888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f106889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f106890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f106891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f106892e = System.currentTimeMillis();

    public int a() {
        return jx.m633a() ? 1 : 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m193a() {
        return this.f106888a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m194a() {
        this.f106890c++;
    }

    public void a(long j10) {
        this.f106888a = j10;
    }

    public long b() {
        return this.f106889b;
    }

    public void b(long j10) {
        this.f106889b += j10;
    }

    public long c() {
        return this.f106890c;
    }

    public void c(long j10) {
        this.f106891d += j10;
    }

    public long d() {
        return this.f106891d;
    }
}
