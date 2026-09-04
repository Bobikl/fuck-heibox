package com.google.android.exoplayer2;

/* JADX INFO: compiled from: MediaPeriodInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.f0.a f47048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f47054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f47055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f47056i;

    o2(com.google.android.exoplayer2.source.f0.a aVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        com.google.android.exoplayer2.util.a.a(!z13 || z11);
        com.google.android.exoplayer2.util.a.a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        com.google.android.exoplayer2.util.a.a(z14);
        this.f47048a = aVar;
        this.f47049b = j10;
        this.f47050c = j11;
        this.f47051d = j12;
        this.f47052e = j13;
        this.f47053f = z10;
        this.f47054g = z11;
        this.f47055h = z12;
        this.f47056i = z13;
    }

    public o2 a(long j10) {
        return j10 == this.f47050c ? this : new o2(this.f47048a, this.f47049b, j10, this.f47051d, this.f47052e, this.f47053f, this.f47054g, this.f47055h, this.f47056i);
    }

    public o2 b(long j10) {
        return j10 == this.f47049b ? this : new o2(this.f47048a, j10, this.f47050c, this.f47051d, this.f47052e, this.f47053f, this.f47054g, this.f47055h, this.f47056i);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o2.class != obj.getClass()) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.f47049b == o2Var.f47049b && this.f47050c == o2Var.f47050c && this.f47051d == o2Var.f47051d && this.f47052e == o2Var.f47052e && this.f47053f == o2Var.f47053f && this.f47054g == o2Var.f47054g && this.f47055h == o2Var.f47055h && this.f47056i == o2Var.f47056i && com.google.android.exoplayer2.util.u0.c(this.f47048a, o2Var.f47048a);
    }

    public int hashCode() {
        return ((((((((((((((((bb.c.b.f30674h7 + this.f47048a.hashCode()) * 31) + ((int) this.f47049b)) * 31) + ((int) this.f47050c)) * 31) + ((int) this.f47051d)) * 31) + ((int) this.f47052e)) * 31) + (this.f47053f ? 1 : 0)) * 31) + (this.f47054g ? 1 : 0)) * 31) + (this.f47055h ? 1 : 0)) * 31) + (this.f47056i ? 1 : 0);
    }
}
