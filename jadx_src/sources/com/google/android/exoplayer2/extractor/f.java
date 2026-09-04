package com.google.android.exoplayer2.extractor;

/* JADX INFO: compiled from: ConstantBitrateSeekMap.java */
/* JADX INFO: loaded from: classes7.dex */
public class f implements b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f44877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f44878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f44879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f44880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f44881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f44882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f44883j;

    public f(long j10, long j11, int i10, int i11) {
        this(j10, j11, i10, i11, false);
    }

    public f(long j10, long j11, int i10, int i11, boolean z10) {
        this.f44877d = j10;
        this.f44878e = j11;
        this.f44879f = i11 == -1 ? 1 : i11;
        this.f44881h = i10;
        this.f44883j = z10;
        if (j10 == -1) {
            this.f44880g = -1L;
            this.f44882i = com.google.android.exoplayer2.j.f46377b;
        } else {
            this.f44880g = j10 - j11;
            this.f44882i = f(j10, j11, i10);
        }
    }

    private long a(long j10) {
        long j11 = (j10 * ((long) this.f44881h)) / 8000000;
        int i10 = this.f44879f;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f44880g;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f44878e + Math.max(jMin, 0L);
    }

    private static long f(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    public long b(long j10) {
        return f(j10, this.f44878e, this.f44881h);
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public b0.a d(long j10) {
        if (this.f44880g == -1 && !this.f44883j) {
            return new b0.a(new c0(0L, this.f44878e));
        }
        long jA = a(j10);
        long jB = b(jA);
        c0 c0Var = new c0(jB, jA);
        if (this.f44880g != -1 && jB < j10) {
            int i10 = this.f44879f;
            if (((long) i10) + jA < this.f44877d) {
                long j11 = jA + ((long) i10);
                return new b0.a(c0Var, new c0(b(j11), j11));
            }
        }
        return new b0.a(c0Var);
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public boolean e() {
        return this.f44880g != -1 || this.f44883j;
    }

    @Override // com.google.android.exoplayer2.extractor.b0
    public long i() {
        return this.f44882i;
    }
}
