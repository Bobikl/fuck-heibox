package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.common.primitives.Longs;

/* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k implements f2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f46479t = 0.97f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f46480u = 1.03f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f46481v = 1000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f46482w = 0.1f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f46483x = 500;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final float f46484y = 0.999f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f46485z = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f46486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f46487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f46488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f46489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f46490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f46491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f46492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f46493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f46494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f46495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f46496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f46497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f46498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f46499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f46500o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f46501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f46502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f46503r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f46504s;

    /* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f46505a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f46506b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f46507c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f46508d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f46509e = com.google.android.exoplayer2.util.u0.U0(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f46510f = com.google.android.exoplayer2.util.u0.U0(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f46511g = 0.999f;

        public k a() {
            return new k(this.f46505a, this.f46506b, this.f46507c, this.f46508d, this.f46509e, this.f46510f, this.f46511g);
        }

        public b b(float f10) {
            com.google.android.exoplayer2.util.a.a(f10 >= 1.0f);
            this.f46506b = f10;
            return this;
        }

        public b c(float f10) {
            com.google.android.exoplayer2.util.a.a(0.0f < f10 && f10 <= 1.0f);
            this.f46505a = f10;
            return this;
        }

        public b d(long j10) {
            com.google.android.exoplayer2.util.a.a(j10 > 0);
            this.f46509e = com.google.android.exoplayer2.util.u0.U0(j10);
            return this;
        }

        public b e(float f10) {
            com.google.android.exoplayer2.util.a.a(f10 >= 0.0f && f10 < 1.0f);
            this.f46511g = f10;
            return this;
        }

        public b f(long j10) {
            com.google.android.exoplayer2.util.a.a(j10 > 0);
            this.f46507c = j10;
            return this;
        }

        public b g(float f10) {
            com.google.android.exoplayer2.util.a.a(f10 > 0.0f);
            this.f46508d = f10 / 1000000.0f;
            return this;
        }

        public b h(long j10) {
            com.google.android.exoplayer2.util.a.a(j10 >= 0);
            this.f46510f = com.google.android.exoplayer2.util.u0.U0(j10);
            return this;
        }
    }

    private k(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f46486a = f10;
        this.f46487b = f11;
        this.f46488c = j10;
        this.f46489d = f12;
        this.f46490e = j11;
        this.f46491f = j12;
        this.f46492g = f13;
        this.f46493h = j.f46377b;
        this.f46494i = j.f46377b;
        this.f46496k = j.f46377b;
        this.f46497l = j.f46377b;
        this.f46500o = f10;
        this.f46499n = f11;
        this.f46501p = 1.0f;
        this.f46502q = j.f46377b;
        this.f46495j = j.f46377b;
        this.f46498m = j.f46377b;
        this.f46503r = j.f46377b;
        this.f46504s = j.f46377b;
    }

    private void f(long j10) {
        long j11 = this.f46503r + (this.f46504s * 3);
        if (this.f46498m > j11) {
            float fU0 = com.google.android.exoplayer2.util.u0.U0(this.f46488c);
            this.f46498m = Longs.s(j11, this.f46495j, this.f46498m - (((long) ((this.f46501p - 1.0f) * fU0)) + ((long) ((this.f46499n - 1.0f) * fU0))));
            return;
        }
        long jT = com.google.android.exoplayer2.util.u0.t(j10 - ((long) (Math.max(0.0f, this.f46501p - 1.0f) / this.f46489d)), this.f46498m, j11);
        this.f46498m = jT;
        long j12 = this.f46497l;
        if (j12 == j.f46377b || jT <= j12) {
            return;
        }
        this.f46498m = j12;
    }

    private void g() {
        long j10 = this.f46493h;
        if (j10 != j.f46377b) {
            long j11 = this.f46494i;
            if (j11 != j.f46377b) {
                j10 = j11;
            }
            long j12 = this.f46496k;
            if (j12 != j.f46377b && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f46497l;
            if (j13 != j.f46377b && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f46495j == j10) {
            return;
        }
        this.f46495j = j10;
        this.f46498m = j10;
        this.f46503r = j.f46377b;
        this.f46504s = j.f46377b;
        this.f46502q = j.f46377b;
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f46503r;
        if (j13 == j.f46377b) {
            this.f46503r = j12;
            this.f46504s = 0L;
        } else {
            long jMax = Math.max(j12, h(j13, j12, this.f46492g));
            this.f46503r = jMax;
            this.f46504s = h(this.f46504s, Math.abs(j12 - jMax), this.f46492g);
        }
    }

    @Override // com.google.android.exoplayer2.f2
    public void a(i2.g gVar) {
        this.f46493h = com.google.android.exoplayer2.util.u0.U0(gVar.f46335b);
        this.f46496k = com.google.android.exoplayer2.util.u0.U0(gVar.f46336c);
        this.f46497l = com.google.android.exoplayer2.util.u0.U0(gVar.f46337d);
        float f10 = gVar.f46338e;
        if (f10 == -3.4028235E38f) {
            f10 = this.f46486a;
        }
        this.f46500o = f10;
        float f11 = gVar.f46339f;
        if (f11 == -3.4028235E38f) {
            f11 = this.f46487b;
        }
        this.f46499n = f11;
        g();
    }

    @Override // com.google.android.exoplayer2.f2
    public float b(long j10, long j11) {
        if (this.f46493h == j.f46377b) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f46502q != j.f46377b && SystemClock.elapsedRealtime() - this.f46502q < this.f46488c) {
            return this.f46501p;
        }
        this.f46502q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f46498m;
        if (Math.abs(j12) < this.f46490e) {
            this.f46501p = 1.0f;
        } else {
            this.f46501p = com.google.android.exoplayer2.util.u0.r((this.f46489d * j12) + 1.0f, this.f46500o, this.f46499n);
        }
        return this.f46501p;
    }

    @Override // com.google.android.exoplayer2.f2
    public long c() {
        return this.f46498m;
    }

    @Override // com.google.android.exoplayer2.f2
    public void d() {
        long j10 = this.f46498m;
        if (j10 == j.f46377b) {
            return;
        }
        long j11 = j10 + this.f46491f;
        this.f46498m = j11;
        long j12 = this.f46497l;
        if (j12 != j.f46377b && j11 > j12) {
            this.f46498m = j12;
        }
        this.f46502q = j.f46377b;
    }

    @Override // com.google.android.exoplayer2.f2
    public void e(long j10) {
        this.f46494i = j10;
        g();
    }
}
