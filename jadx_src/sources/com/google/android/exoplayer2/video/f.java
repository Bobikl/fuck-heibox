package com.google.android.exoplayer2.video;

import androidx.annotation.j1;
import java.util.Arrays;

/* JADX INFO: compiled from: FixedFrameRateEstimator.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f51742g = 15;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @j1
    static final long f51743h = 1000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51747d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51749f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f51744a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f51745b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f51748e = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: compiled from: FixedFrameRateEstimator.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f51750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f51751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f51752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f51753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f51754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f51755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f51756g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f51757h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f51754e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f51755f / j10;
        }

        public long b() {
            return this.f51755f;
        }

        public boolean d() {
            long j10 = this.f51753d;
            if (j10 == 0) {
                return false;
            }
            return this.f51756g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f51753d > 15 && this.f51757h == 0;
        }

        public void f(long j10) {
            long j11 = this.f51753d;
            if (j11 == 0) {
                this.f51750a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f51750a;
                this.f51751b = j12;
                this.f51755f = j12;
                this.f51754e = 1L;
            } else {
                long j13 = j10 - this.f51752c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f51751b) <= 1000000) {
                    this.f51754e++;
                    this.f51755f += j13;
                    boolean[] zArr = this.f51756g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f51757h--;
                    }
                } else {
                    boolean[] zArr2 = this.f51756g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f51757h++;
                    }
                }
            }
            this.f51753d++;
            this.f51752c = j10;
        }

        public void g() {
            this.f51753d = 0L;
            this.f51754e = 0L;
            this.f51755f = 0L;
            this.f51757h = 0;
            Arrays.fill(this.f51756g, false);
        }
    }

    public long a() {
        return e() ? this.f51744a.a() : com.google.android.exoplayer2.j.f46377b;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f51744a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f51749f;
    }

    public long d() {
        return e() ? this.f51744a.b() : com.google.android.exoplayer2.j.f46377b;
    }

    public boolean e() {
        return this.f51744a.e();
    }

    public void f(long j10) {
        this.f51744a.f(j10);
        if (this.f51744a.e() && !this.f51747d) {
            this.f51746c = false;
        } else if (this.f51748e != com.google.android.exoplayer2.j.f46377b) {
            if (!this.f51746c || this.f51745b.d()) {
                this.f51745b.g();
                this.f51745b.f(this.f51748e);
            }
            this.f51746c = true;
            this.f51745b.f(j10);
        }
        if (this.f51746c && this.f51745b.e()) {
            a aVar = this.f51744a;
            this.f51744a = this.f51745b;
            this.f51745b = aVar;
            this.f51746c = false;
            this.f51747d = false;
        }
        this.f51748e = j10;
        this.f51749f = this.f51744a.e() ? 0 : this.f51749f + 1;
    }

    public void g() {
        this.f51744a.g();
        this.f51745b.g();
        this.f51746c = false;
        this.f51748e = com.google.android.exoplayer2.j.f46377b;
        this.f51749f = 0;
    }
}
