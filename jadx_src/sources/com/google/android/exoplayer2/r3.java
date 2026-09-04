package com.google.android.exoplayer2;

/* JADX INFO: compiled from: SeekParameters.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r3 f47343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r3 f47344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r3 f47345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r3 f47346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r3 f47347g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47349b;

    static {
        r3 r3Var = new r3(0L, 0L);
        f47343c = r3Var;
        f47344d = new r3(Long.MAX_VALUE, Long.MAX_VALUE);
        f47345e = new r3(Long.MAX_VALUE, 0L);
        f47346f = new r3(0L, Long.MAX_VALUE);
        f47347g = r3Var;
    }

    public r3(long j10, long j11) {
        com.google.android.exoplayer2.util.a.a(j10 >= 0);
        com.google.android.exoplayer2.util.a.a(j11 >= 0);
        this.f47348a = j10;
        this.f47349b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f47348a;
        if (j13 == 0 && this.f47349b == 0) {
            return j10;
        }
        long jT1 = com.google.android.exoplayer2.util.u0.t1(j10, j13, Long.MIN_VALUE);
        long jB = com.google.android.exoplayer2.util.u0.b(j10, this.f47349b, Long.MAX_VALUE);
        boolean z10 = jT1 <= j11 && j11 <= jB;
        boolean z11 = jT1 <= j12 && j12 <= jB;
        if (z10 && z11) {
            return Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12;
        }
        if (z10) {
            return j11;
        }
        return z11 ? j12 : jT1;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r3.class != obj.getClass()) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return this.f47348a == r3Var.f47348a && this.f47349b == r3Var.f47349b;
    }

    public int hashCode() {
        return (((int) this.f47348a) * 31) + ((int) this.f47349b);
    }
}
