package com.google.android.exoplayer2.decoder;

/* JADX INFO: compiled from: DecoderCounters.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f44521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44522k;

    private void b(long j10, int i10) {
        this.f44521j += j10;
        this.f44522k += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public void d(g gVar) {
        this.f44512a += gVar.f44512a;
        this.f44513b += gVar.f44513b;
        this.f44514c += gVar.f44514c;
        this.f44515d += gVar.f44515d;
        this.f44516e += gVar.f44516e;
        this.f44517f += gVar.f44517f;
        this.f44518g += gVar.f44518g;
        this.f44519h = Math.max(this.f44519h, gVar.f44519h);
        this.f44520i += gVar.f44520i;
        b(gVar.f44521j, gVar.f44522k);
    }
}
