package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: StreamReader.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f45654n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f45655o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f45656p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f45657q = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f45659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f45660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f45661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f45662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f45663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f45664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f45665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f45666i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f45668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f45669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f45670m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f45658a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f45667j = new b();

    /* JADX INFO: compiled from: StreamReader.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a2 f45671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f45672b;

        b() {
        }
    }

    /* JADX INFO: compiled from: StreamReader.java */
    public static final class c implements g {
        private c() {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.g
        public long a(l lVar) {
            return -1L;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.g
        public b0 b() {
            return new b0.b(com.google.android.exoplayer2.j.f46377b);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.g
        public void c(long j10) {
        }
    }

    @mk.d({"trackOutput", "extractorOutput"})
    private void a() {
        com.google.android.exoplayer2.util.a.k(this.f45659b);
        u0.k(this.f45660c);
    }

    @mk.e(expression = {"setupData.format"}, result = true)
    private boolean h(l lVar) throws IOException {
        while (this.f45658a.d(lVar)) {
            this.f45668k = lVar.getPosition() - this.f45663f;
            if (!i(this.f45658a.c(), this.f45663f, this.f45667j)) {
                return true;
            }
            this.f45663f = lVar.getPosition();
        }
        this.f45665h = 3;
        return false;
    }

    @mk.m({"trackOutput"})
    private int j(l lVar) throws IOException {
        if (!h(lVar)) {
            return -1;
        }
        a2 a2Var = this.f45667j.f45671a;
        this.f45666i = a2Var.A;
        if (!this.f45670m) {
            this.f45659b.d(a2Var);
            this.f45670m = true;
        }
        g gVar = this.f45667j.f45672b;
        if (gVar != null) {
            this.f45661d = gVar;
        } else if (lVar.getLength() == -1) {
            this.f45661d = new c();
        } else {
            f fVarB = this.f45658a.b();
            this.f45661d = new com.google.android.exoplayer2.extractor.ogg.a(this, this.f45663f, lVar.getLength(), fVarB.f45647h + fVarB.f45648i, fVarB.f45642c, (fVarB.f45641b & 4) != 0);
        }
        this.f45665h = 2;
        this.f45658a.f();
        return 0;
    }

    @mk.m({"trackOutput", "oggSeeker", "extractorOutput"})
    private int k(l lVar, z zVar) throws IOException {
        long jA = this.f45661d.a(lVar);
        if (jA >= 0) {
            zVar.f46218a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f45669l) {
            this.f45660c.t((b0) com.google.android.exoplayer2.util.a.k(this.f45661d.b()));
            this.f45669l = true;
        }
        if (this.f45668k <= 0 && !this.f45658a.d(lVar)) {
            this.f45665h = 3;
            return -1;
        }
        this.f45668k = 0L;
        com.google.android.exoplayer2.util.e0 e0VarC = this.f45658a.c();
        long jF = f(e0VarC);
        if (jF >= 0) {
            long j10 = this.f45664g;
            if (j10 + jF >= this.f45662e) {
                long jB = b(j10);
                this.f45659b.c(e0VarC, e0VarC.f());
                this.f45659b.e(jB, 1, e0VarC.f(), 0, null);
                this.f45662e = -1L;
            }
        }
        this.f45664g += jF;
        return 0;
    }

    protected long b(long j10) {
        return (j10 * 1000000) / ((long) this.f45666i);
    }

    protected long c(long j10) {
        return (((long) this.f45666i) * j10) / 1000000;
    }

    void d(m mVar, e0 e0Var) {
        this.f45660c = mVar;
        this.f45659b = e0Var;
        l(true);
    }

    protected void e(long j10) {
        this.f45664g = j10;
    }

    protected abstract long f(com.google.android.exoplayer2.util.e0 e0Var);

    final int g(l lVar, z zVar) throws IOException {
        a();
        int i10 = this.f45665h;
        if (i10 == 0) {
            return j(lVar);
        }
        if (i10 == 1) {
            lVar.t((int) this.f45663f);
            this.f45665h = 2;
            return 0;
        }
        if (i10 == 2) {
            u0.k(this.f45661d);
            return k(lVar, zVar);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @mk.e(expression = {"#3.format"}, result = false)
    protected abstract boolean i(com.google.android.exoplayer2.util.e0 e0Var, long j10, b bVar) throws IOException;

    protected void l(boolean z10) {
        if (z10) {
            this.f45667j = new b();
            this.f45663f = 0L;
            this.f45665h = 0;
        } else {
            this.f45665h = 1;
        }
        this.f45662e = -1L;
        this.f45664g = 0L;
    }

    final void m(long j10, long j11) {
        this.f45658a.e();
        if (j10 == 0) {
            l(!this.f45669l);
        } else if (this.f45665h != 0) {
            this.f45662e = c(j11);
            ((g) u0.k(this.f45661d)).c(this.f45662e);
            this.f45665h = 2;
        }
    }
}
