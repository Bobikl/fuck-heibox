package com.google.android.exoplayer2.extractor;

import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: BinarySearchSeeker.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f44796e = 262144;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0374a f44797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f44798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    protected c f44799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f44800d;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class C0374a implements b0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f44801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f44802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f44803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f44804g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f44805h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f44806i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f44807j;

        public C0374a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f44801d = dVar;
            this.f44802e = j10;
            this.f44803f = j11;
            this.f44804g = j12;
            this.f44805h = j13;
            this.f44806i = j14;
            this.f44807j = j15;
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public b0.a d(long j10) {
            return new b0.a(new c0(j10, c.h(this.f44801d.a(j10), this.f44803f, this.f44804g, this.f44805h, this.f44806i, this.f44807j)));
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public boolean e() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.b0
        public long i() {
            return this.f44802e;
        }

        public long k(long j10) {
            return this.f44801d.a(j10);
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class b implements d {
        @Override // com.google.android.exoplayer2.extractor.a.d
        public long a(long j10) {
            return j10;
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f44808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f44809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f44810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f44811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f44812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f44813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f44814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f44815h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f44808a = j10;
            this.f44809b = j11;
            this.f44811d = j12;
            this.f44812e = j13;
            this.f44813f = j14;
            this.f44814g = j15;
            this.f44810c = j16;
            this.f44815h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return u0.t(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f44814g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f44813f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f44815h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f44808a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f44809b;
        }

        private void n() {
            this.f44815h = h(this.f44809b, this.f44811d, this.f44812e, this.f44813f, this.f44814g, this.f44810c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f44812e = j10;
            this.f44814g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f44811d = j10;
            this.f44813f = j11;
            n();
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface d {
        long a(long j10);
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f44816d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f44817e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f44818f = -2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f44819g = -3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final e f44820h = new e(-3, com.google.android.exoplayer2.j.f46377b, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f44821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f44822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f44823c;

        private e(int i10, long j10, long j11) {
            this.f44821a = i10;
            this.f44822b = j10;
            this.f44823c = j11;
        }

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, com.google.android.exoplayer2.j.f46377b, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface f {
        e a(l lVar, long j10) throws IOException;

        void b();
    }

    protected a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f44798b = fVar;
        this.f44800d = i10;
        this.f44797a = new C0374a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f44797a.k(j10), this.f44797a.f44803f, this.f44797a.f44804g, this.f44797a.f44805h, this.f44797a.f44806i, this.f44797a.f44807j);
    }

    public final b0 b() {
        return this.f44797a;
    }

    public int c(l lVar, z zVar) throws IOException {
        while (true) {
            c cVar = (c) com.google.android.exoplayer2.util.a.k(this.f44799c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f44800d) {
                e(false, j10);
                return g(lVar, j10, zVar);
            }
            if (!i(lVar, jK)) {
                return g(lVar, jK, zVar);
            }
            lVar.o();
            e eVarA = this.f44798b.a(lVar, cVar.m());
            int i10 = eVarA.f44821a;
            if (i10 == -3) {
                e(false, jK);
                return g(lVar, jK, zVar);
            }
            if (i10 == -2) {
                cVar.p(eVarA.f44822b, eVarA.f44823c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(lVar, eVarA.f44823c);
                    e(true, eVarA.f44823c);
                    return g(lVar, eVarA.f44823c, zVar);
                }
                cVar.o(eVarA.f44822b, eVarA.f44823c);
            }
        }
    }

    public final boolean d() {
        return this.f44799c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f44799c = null;
        this.f44798b.b();
        f(z10, j10);
    }

    protected void f(boolean z10, long j10) {
    }

    protected final int g(l lVar, long j10, z zVar) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        zVar.f46218a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f44799c;
        if (cVar == null || cVar.l() != j10) {
            this.f44799c = a(j10);
        }
    }

    protected final boolean i(l lVar, long j10) throws IOException {
        long position = j10 - lVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        lVar.t((int) position);
        return true;
    }
}
