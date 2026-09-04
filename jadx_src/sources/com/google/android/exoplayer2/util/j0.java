package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.b3;

/* JADX INFO: compiled from: StandaloneMediaClock.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j0 implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f51440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f51442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f51443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b3 f51444f = b3.f44367e;

    public j0(e eVar) {
        this.f51440b = eVar;
    }

    public void a(long j10) {
        this.f51442d = j10;
        if (this.f51441c) {
            this.f51443e = this.f51440b.b();
        }
    }

    public void b() {
        if (this.f51441c) {
            return;
        }
        this.f51443e = this.f51440b.b();
        this.f51441c = true;
    }

    public void c() {
        if (this.f51441c) {
            a(s());
            this.f51441c = false;
        }
    }

    @Override // com.google.android.exoplayer2.util.w
    public void e(b3 b3Var) {
        if (this.f51441c) {
            a(s());
        }
        this.f51444f = b3Var;
    }

    @Override // com.google.android.exoplayer2.util.w
    public b3 g() {
        return this.f51444f;
    }

    @Override // com.google.android.exoplayer2.util.w
    public long s() {
        long j10 = this.f51442d;
        if (!this.f51441c) {
            return j10;
        }
        long jB = this.f51440b.b() - this.f51443e;
        b3 b3Var = this.f51444f;
        return j10 + (b3Var.f44371b == 1.0f ? u0.U0(jB) : b3Var.c(jB));
    }
}
