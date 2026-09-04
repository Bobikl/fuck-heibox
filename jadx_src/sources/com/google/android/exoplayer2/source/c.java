package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.r3;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: ClippingMediaPeriod.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements c0, c0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f47581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private c0.a f47582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a[] f47583d = new a[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f47584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f47585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f47586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private ClippingMediaSource.IllegalClippingException f47587h;

    /* JADX INFO: compiled from: ClippingMediaPeriod.java */
    public final class a implements d1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d1 f47588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f47589c;

        public a(d1 d1Var) {
            this.f47588b = d1Var;
        }

        public void a() {
            this.f47589c = false;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public void b() throws IOException {
            this.f47588b.b();
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (c.this.m()) {
                return -3;
            }
            if (this.f47589c) {
                decoderInputBuffer.m(4);
                return -4;
            }
            int iC = this.f47588b.c(b2Var, decoderInputBuffer, i10);
            if (iC == -5) {
                a2 a2Var = (a2) com.google.android.exoplayer2.util.a.g(b2Var.f44366b);
                int i11 = a2Var.C;
                if (i11 != 0 || a2Var.D != 0) {
                    c cVar = c.this;
                    if (cVar.f47585f != 0) {
                        i11 = 0;
                    }
                    b2Var.f44366b = a2Var.c().N(i11).O(cVar.f47586g == Long.MIN_VALUE ? a2Var.D : 0).E();
                }
                return -5;
            }
            c cVar2 = c.this;
            long j10 = cVar2.f47586g;
            if (j10 == Long.MIN_VALUE || ((iC != -4 || decoderInputBuffer.f44490g < j10) && !(iC == -3 && cVar2.e() == Long.MIN_VALUE && !decoderInputBuffer.f44489f))) {
                return iC;
            }
            decoderInputBuffer.f();
            decoderInputBuffer.m(4);
            this.f47589c = true;
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.d1
        public boolean isReady() {
            return !c.this.m() && this.f47588b.isReady();
        }

        @Override // com.google.android.exoplayer2.source.d1
        public int n(long j10) {
            if (c.this.m()) {
                return -3;
            }
            return this.f47588b.n(j10);
        }
    }

    public c(c0 c0Var, boolean z10, long j10, long j11) {
        this.f47581b = c0Var;
        this.f47584e = z10 ? j10 : com.google.android.exoplayer2.j.f46377b;
        this.f47585f = j10;
        this.f47586g = j11;
    }

    private r3 b(long j10, r3 r3Var) {
        long jT = com.google.android.exoplayer2.util.u0.t(r3Var.f47348a, 0L, j10 - this.f47585f);
        long j11 = r3Var.f47349b;
        long j12 = this.f47586g;
        long jT2 = com.google.android.exoplayer2.util.u0.t(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jT == r3Var.f47348a && jT2 == r3Var.f47349b) ? r3Var : new r3(jT, jT2);
    }

    private static boolean w(long j10, com.google.android.exoplayer2.trackselection.j[] jVarArr) {
        if (j10 != 0) {
            for (com.google.android.exoplayer2.trackselection.j jVar : jVarArr) {
                if (jVar != null) {
                    a2 a2VarM = jVar.m();
                    if (!com.google.android.exoplayer2.util.y.a(a2VarM.f43593m, a2VarM.f43590j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean a() {
        return this.f47581b.a();
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean d(long j10) {
        return this.f47581b.d(j10);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long e() {
        long jE = this.f47581b.e();
        if (jE != Long.MIN_VALUE) {
            long j10 = this.f47586g;
            if (j10 == Long.MIN_VALUE || jE < j10) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public void f(long j10) {
        this.f47581b.f(j10);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long g() {
        long jG = this.f47581b.g();
        if (jG != Long.MIN_VALUE) {
            long j10 = this.f47586g;
            if (j10 == Long.MIN_VALUE || jG < j10) {
                return jG;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long h(long j10, r3 r3Var) {
        long j11 = this.f47585f;
        if (j10 == j11) {
            return j11;
        }
        return this.f47581b.h(j10, b(j10, r3Var));
    }

    @Override // com.google.android.exoplayer2.source.c0
    public /* synthetic */ List i(List list) {
        return b0.a(this, list);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.google.android.exoplayer2.source.c0
    public long j(long j10) {
        this.f47584e = com.google.android.exoplayer2.j.f46377b;
        boolean z10 = false;
        for (a aVar : this.f47583d) {
            if (aVar != null) {
                aVar.a();
            }
        }
        long j11 = this.f47581b.j(j10);
        if (j11 == j10) {
            z10 = true;
        } else if (j11 >= this.f47585f) {
            long j12 = this.f47586g;
            if (j12 == Long.MIN_VALUE || j11 <= j12) {
                z10 = true;
            }
        }
        com.google.android.exoplayer2.util.a.i(z10);
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long k() {
        if (m()) {
            long j10 = this.f47584e;
            this.f47584e = com.google.android.exoplayer2.j.f46377b;
            long jK = k();
            return jK != com.google.android.exoplayer2.j.f46377b ? jK : j10;
        }
        long jK2 = this.f47581b.k();
        if (jK2 == com.google.android.exoplayer2.j.f46377b) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        boolean z10 = true;
        com.google.android.exoplayer2.util.a.i(jK2 >= this.f47585f);
        long j11 = this.f47586g;
        if (j11 != Long.MIN_VALUE && jK2 > j11) {
            z10 = false;
        }
        com.google.android.exoplayer2.util.a.i(z10);
        return jK2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    @Override // com.google.android.exoplayer2.source.c0
    public long l(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        long j11;
        boolean z10;
        this.f47583d = new a[d1VarArr.length];
        d1[] d1VarArr2 = new d1[d1VarArr.length];
        int i10 = 0;
        while (true) {
            d1 d1Var = null;
            if (i10 >= d1VarArr.length) {
                break;
            }
            a[] aVarArr = this.f47583d;
            a aVar = (a) d1VarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                d1Var = aVar.f47588b;
            }
            d1VarArr2[i10] = d1Var;
            i10++;
        }
        long jL = this.f47581b.l(jVarArr, zArr, d1VarArr2, zArr2, j10);
        if (m()) {
            long j12 = this.f47585f;
            if (j10 == j12 && w(j12, jVarArr)) {
                j11 = jL;
            } else {
                j11 = com.google.android.exoplayer2.j.f46377b;
            }
        } else {
            j11 = com.google.android.exoplayer2.j.f46377b;
        }
        this.f47584e = j11;
        if (jL != j10) {
            if (jL >= this.f47585f) {
                long j13 = this.f47586g;
                z10 = j13 == Long.MIN_VALUE || jL <= j13;
            }
        }
        com.google.android.exoplayer2.util.a.i(z10);
        for (int i11 = 0; i11 < d1VarArr.length; i11++) {
            d1 d1Var2 = d1VarArr2[i11];
            if (d1Var2 == null) {
                this.f47583d[i11] = null;
            } else {
                a[] aVarArr2 = this.f47583d;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f47588b != d1Var2) {
                    aVarArr2[i11] = new a(d1Var2);
                }
            }
            d1VarArr[i11] = this.f47583d[i11];
        }
        return jL;
    }

    boolean m() {
        return this.f47584e != com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public p1 o() {
        return this.f47581b.o();
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    public void q(c0 c0Var) {
        if (this.f47587h != null) {
            return;
        }
        ((c0.a) com.google.android.exoplayer2.util.a.g(this.f47582c)).q(this);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void r(c0.a aVar, long j10) {
        this.f47582c = aVar;
        this.f47581b.r(this, j10);
    }

    @Override // com.google.android.exoplayer2.source.e1.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(c0 c0Var) {
        ((c0.a) com.google.android.exoplayer2.util.a.g(this.f47582c)).n(this);
    }

    public void t(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f47587h = illegalClippingException;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void u() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f47587h;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f47581b.u();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void v(long j10, boolean z10) {
        this.f47581b.v(j10, z10);
    }

    public void x(long j10, long j11) {
        this.f47585f = j10;
        this.f47586g = j11;
    }
}
