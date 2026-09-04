package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: SegmentBase.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    final i f47934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f47935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f47936c;

    /* JADX INFO: compiled from: SegmentBase.java */
    public static abstract class a extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f47937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f47938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        final List<d> f47939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f47940g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f47941h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @j1
        final long f47942i;

        public a(@p0 i iVar, long j10, long j11, long j12, long j13, @p0 List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f47937d = j12;
            this.f47938e = j13;
            this.f47939f = list;
            this.f47942i = j14;
            this.f47940g = j15;
            this.f47941h = j16;
        }

        public long c(long j10, long j11) {
            long jG = g(j10);
            return jG != -1 ? jG : (int) (i((j11 - this.f47941h) + this.f47942i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f47940g;
                if (j12 != com.google.android.exoplayer2.j.f46377b) {
                    return Math.max(e(), i((j11 - this.f47941h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f47937d;
        }

        public long f(long j10, long j11) {
            if (this.f47939f != null) {
                return com.google.android.exoplayer2.j.f46377b;
            }
            long jD = d(j10, j11) + c(j10, j11);
            return (j(jD) + h(jD, j10)) - this.f47942i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List<d> list = this.f47939f;
            if (list != null) {
                return (list.get((int) (j10 - this.f47937d)).f47948b * 1000000) / this.f47935b;
            }
            long jG = g(j11);
            return (jG == -1 || j10 != (e() + jG) - 1) ? (this.f47938e * 1000000) / this.f47935b : j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long jE = e();
            long jG = g(j11);
            if (jG == 0) {
                return jE;
            }
            if (this.f47939f == null) {
                long j12 = this.f47937d + (j10 / ((this.f47938e * 1000000) / this.f47935b));
                if (j12 < jE) {
                    return jE;
                }
                return jG == -1 ? j12 : Math.min(j12, (jE + jG) - 1);
            }
            long j13 = (jG + jE) - 1;
            long j14 = jE;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                long j16 = j(j15);
                if (j16 < j10) {
                    j14 = j15 + 1;
                } else {
                    if (j16 <= j10) {
                        return j15;
                    }
                    j13 = j15 - 1;
                }
            }
            return j14 == jE ? j14 : j13;
        }

        public final long j(long j10) {
            List<d> list = this.f47939f;
            return u0.j1(list != null ? list.get((int) (j10 - this.f47937d)).f47947a - this.f47936c : (j10 - this.f47937d) * this.f47938e, 1000000L, this.f47935b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f47939f != null;
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static final class b extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        final List<i> f47943j;

        public b(i iVar, long j10, long j11, long j12, long j13, @p0 List<d> list, long j14, @p0 List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f47943j = list2;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.k.a
        public long g(long j10) {
            return this.f47943j.size();
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.k.a
        public i k(j jVar, long j10) {
            return this.f47943j.get((int) (j10 - this.f47937d));
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.k.a
        public boolean l() {
            return true;
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static final class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        final n f47944j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        final n f47945k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final long f47946l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, @p0 List<d> list, long j15, @p0 n nVar, @p0 n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f47944j = nVar;
            this.f47945k = nVar2;
            this.f47946l = j13;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.k
        @p0
        public i a(j jVar) {
            n nVar = this.f47944j;
            if (nVar == null) {
                return super.a(jVar);
            }
            a2 a2Var = jVar.f47923c;
            return new i(nVar.a(a2Var.f43582b, 0L, a2Var.f43589i, 0L), 0L, -1L);
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.k.a
        public long g(long j10) {
            List<d> list = this.f47939f;
            if (list != null) {
                return list.size();
            }
            long j11 = this.f47946l;
            if (j11 != -1) {
                return (j11 - this.f47937d) + 1;
            }
            if (j10 != com.google.android.exoplayer2.j.f46377b) {
                return com.google.common.math.b.c(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f47935b)), BigInteger.valueOf(this.f47938e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.k.a
        public i k(j jVar, long j10) {
            List<d> list = this.f47939f;
            long j11 = list != null ? list.get((int) (j10 - this.f47937d)).f47947a : (j10 - this.f47937d) * this.f47938e;
            n nVar = this.f47945k;
            a2 a2Var = jVar.f47923c;
            return new i(nVar.a(a2Var.f43582b, j10, a2Var.f43589i, j11), 0L, -1L);
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f47947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f47948b;

        public d(long j10, long j11) {
            this.f47947a = j10;
            this.f47948b = j11;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f47947a == dVar.f47947a && this.f47948b == dVar.f47948b;
        }

        public int hashCode() {
            return (((int) this.f47947a) * 31) + ((int) this.f47948b);
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static class e extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f47949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f47950e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(@p0 i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f47949d = j12;
            this.f47950e = j13;
        }

        @p0
        public i c() {
            long j10 = this.f47950e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f47949d, j10);
        }
    }

    public k(@p0 i iVar, long j10, long j11) {
        this.f47934a = iVar;
        this.f47935b = j10;
        this.f47936c = j11;
    }

    @p0
    public i a(j jVar) {
        return this.f47934a;
    }

    public long b() {
        return u0.j1(this.f47936c, 1000000L, this.f47935b);
    }
}
