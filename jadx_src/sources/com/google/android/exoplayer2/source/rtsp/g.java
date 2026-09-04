package com.google.android.exoplayer2.source.rtsp;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: compiled from: RtpExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g implements com.google.android.exoplayer2.extractor.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r8.e f48728d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f48731g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.m f48734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f48735k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.b0("lock")
    private boolean f48738n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f48729e = new com.google.android.exoplayer2.util.e0(h.f48745m);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f48730f = new com.google.android.exoplayer2.util.e0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f48732h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j f48733i = new j();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile long f48736l = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile int f48737m = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.b0("lock")
    private long f48739o = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.b0("lock")
    private long f48740p = com.google.android.exoplayer2.j.f46377b;

    public g(k kVar, int i10) {
        this.f48731g = i10;
        this.f48728d = (r8.e) com.google.android.exoplayer2.util.a.g(new r8.a().a(kVar));
    }

    private static long c(long j10) {
        return j10 - 30;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void a(long j10, long j11) {
        synchronized (this.f48732h) {
            this.f48739o = j10;
            this.f48740p = j11;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void b(com.google.android.exoplayer2.extractor.m mVar) {
        this.f48728d.b(mVar, this.f48731g);
        mVar.n();
        mVar.t(new com.google.android.exoplayer2.extractor.b0.b(com.google.android.exoplayer2.j.f46377b));
        this.f48734j = mVar;
    }

    public boolean d() {
        return this.f48735k;
    }

    public void e() {
        synchronized (this.f48732h) {
            this.f48738n = true;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public boolean f(com.google.android.exoplayer2.extractor.l lVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public int g(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        com.google.android.exoplayer2.util.a.g(this.f48734j);
        int i10 = lVar.read(this.f48729e.d(), 0, h.f48745m);
        if (i10 == -1) {
            return -1;
        }
        if (i10 == 0) {
            return 0;
        }
        this.f48729e.S(0);
        this.f48729e.R(i10);
        h hVarB = h.b(this.f48729e);
        if (hVarB == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jC = c(jElapsedRealtime);
        this.f48733i.f(hVarB, jElapsedRealtime);
        h hVarG = this.f48733i.g(jC);
        if (hVarG == null) {
            return 0;
        }
        if (!this.f48735k) {
            if (this.f48736l == com.google.android.exoplayer2.j.f46377b) {
                this.f48736l = hVarG.f48758h;
            }
            if (this.f48737m == -1) {
                this.f48737m = hVarG.f48757g;
            }
            this.f48728d.c(this.f48736l, this.f48737m);
            this.f48735k = true;
        }
        synchronized (this.f48732h) {
            if (!this.f48738n) {
                do {
                    this.f48730f.P(hVarG.f48761k);
                    this.f48728d.d(this.f48730f, hVarG.f48758h, hVarG.f48757g, hVarG.f48755e);
                    hVarG = this.f48733i.g(jC);
                } while (hVarG != null);
            } else if (this.f48739o != com.google.android.exoplayer2.j.f46377b && this.f48740p != com.google.android.exoplayer2.j.f46377b) {
                this.f48733i.i();
                this.f48728d.a(this.f48739o, this.f48740p);
                this.f48738n = false;
                this.f48739o = com.google.android.exoplayer2.j.f46377b;
                this.f48740p = com.google.android.exoplayer2.j.f46377b;
            }
        }
        return 0;
    }

    public void h(int i10) {
        this.f48737m = i10;
    }

    public void i(long j10) {
        this.f48736l = j10;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public void release() {
    }
}
