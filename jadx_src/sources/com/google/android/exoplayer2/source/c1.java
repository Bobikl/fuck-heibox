package com.google.android.exoplayer2.source;

import android.os.Looper;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import java.io.IOException;

/* JADX INFO: compiled from: SampleQueue.java */
/* JADX INFO: loaded from: classes7.dex */
public class c1 implements com.google.android.exoplayer2.extractor.e0 {

    @androidx.annotation.j1
    static final int L = 1000;
    private static final String M = "SampleQueue";
    private boolean A;
    private boolean D;

    @androidx.annotation.p0
    private a2 E;

    @androidx.annotation.p0
    private a2 F;
    private int G;
    private boolean H;
    private boolean I;
    private long J;
    private boolean K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a1 f47591d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.android.exoplayer2.drm.u f47594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.android.exoplayer2.drm.s.a f47595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private final Looper f47596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private d f47597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private a2 f47598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private DrmSession f47599l;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f47607t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f47608u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f47609v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f47610w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f47592e = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f47600m = 1000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f47601n = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long[] f47602o = new long[1000];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long[] f47605r = new long[1000];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f47604q = new int[1000];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f47603p = new int[1000];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0.a[] f47606s = new com.google.android.exoplayer2.extractor.e0.a[1000];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l1<c> f47593f = new l1<>(new com.google.android.exoplayer2.util.i() { // from class: com.google.android.exoplayer2.source.b1
        @Override // com.google.android.exoplayer2.util.i
        public final void accept(Object obj) {
            c1.M((c1.c) obj);
        }
    });

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f47611x = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f47612y = Long.MIN_VALUE;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f47613z = Long.MIN_VALUE;
    private boolean C = true;
    private boolean B = true;

    /* JADX INFO: compiled from: SampleQueue.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f47615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public com.google.android.exoplayer2.extractor.e0.a f47616c;

        b() {
        }
    }

    /* JADX INFO: compiled from: SampleQueue.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a2 f47617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.drm.u.b f47618b;

        private c(a2 a2Var, com.google.android.exoplayer2.drm.u.b bVar) {
            this.f47617a = a2Var;
            this.f47618b = bVar;
        }
    }

    /* JADX INFO: compiled from: SampleQueue.java */
    public interface d {
        void c(a2 a2Var);
    }

    protected c1(com.google.android.exoplayer2.upstream.b bVar, @androidx.annotation.p0 Looper looper, @androidx.annotation.p0 com.google.android.exoplayer2.drm.u uVar, @androidx.annotation.p0 com.google.android.exoplayer2.drm.s.a aVar) {
        this.f47596i = looper;
        this.f47594g = uVar;
        this.f47595h = aVar;
        this.f47591d = new a1(bVar);
    }

    private long C(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iE = E(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f47605r[iE]);
            if ((this.f47604q[iE] & 1) != 0) {
                break;
            }
            iE--;
            if (iE == -1) {
                iE = this.f47600m - 1;
            }
        }
        return jMax;
    }

    private int E(int i10) {
        int i11 = this.f47609v + i10;
        int i12 = this.f47600m;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean I() {
        return this.f47610w != this.f47607t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(c cVar) {
        cVar.f47618b.release();
    }

    private boolean N(int i10) {
        DrmSession drmSession = this.f47599l;
        return drmSession == null || drmSession.getState() == 4 || ((this.f47604q[i10] & 1073741824) == 0 && this.f47599l.s());
    }

    private void P(a2 a2Var, b2 b2Var) {
        a2 a2Var2 = this.f47598k;
        boolean z10 = a2Var2 == null;
        DrmInitData drmInitData = z10 ? null : a2Var2.f43596p;
        this.f47598k = a2Var;
        DrmInitData drmInitData2 = a2Var.f43596p;
        com.google.android.exoplayer2.drm.u uVar = this.f47594g;
        b2Var.f44366b = uVar != null ? a2Var.e(uVar.b(a2Var)) : a2Var;
        b2Var.f44365a = this.f47599l;
        if (this.f47594g == null) {
            return;
        }
        if (z10 || !com.google.android.exoplayer2.util.u0.c(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f47599l;
            DrmSession drmSessionA = this.f47594g.a((Looper) com.google.android.exoplayer2.util.a.g(this.f47596i), this.f47595h, a2Var);
            this.f47599l = drmSessionA;
            b2Var.f44365a = drmSessionA;
            if (drmSession != null) {
                drmSession.r(this.f47595h);
            }
        }
    }

    private synchronized int Q(b2 b2Var, DecoderInputBuffer decoderInputBuffer, boolean z10, boolean z11, b bVar) {
        decoderInputBuffer.f44489f = false;
        if (!I()) {
            if (!z11 && !this.A) {
                a2 a2Var = this.F;
                if (a2Var == null || (!z10 && a2Var == this.f47598k)) {
                    return -3;
                }
                P((a2) com.google.android.exoplayer2.util.a.g(a2Var), b2Var);
                return -5;
            }
            decoderInputBuffer.m(4);
            return -4;
        }
        a2 a2Var2 = this.f47593f.f(D()).f47617a;
        if (!z10 && a2Var2 == this.f47598k) {
            int iE = E(this.f47610w);
            if (!N(iE)) {
                decoderInputBuffer.f44489f = true;
                return -3;
            }
            decoderInputBuffer.m(this.f47604q[iE]);
            long j10 = this.f47605r[iE];
            decoderInputBuffer.f44490g = j10;
            if (j10 < this.f47611x) {
                decoderInputBuffer.e(Integer.MIN_VALUE);
            }
            bVar.f47614a = this.f47603p[iE];
            bVar.f47615b = this.f47602o[iE];
            bVar.f47616c = this.f47606s[iE];
            return -4;
        }
        P(a2Var2, b2Var);
        return -5;
    }

    private void V() {
        DrmSession drmSession = this.f47599l;
        if (drmSession != null) {
            drmSession.r(this.f47595h);
            this.f47599l = null;
            this.f47598k = null;
        }
    }

    private synchronized void Y() {
        this.f47610w = 0;
        this.f47591d.o();
    }

    private synchronized boolean d0(a2 a2Var) {
        this.C = false;
        if (com.google.android.exoplayer2.util.u0.c(a2Var, this.F)) {
            return false;
        }
        if (this.f47593f.h() || !this.f47593f.g().f47617a.equals(a2Var)) {
            this.F = a2Var;
        } else {
            this.F = this.f47593f.g().f47617a;
        }
        a2 a2Var2 = this.F;
        this.H = com.google.android.exoplayer2.util.y.a(a2Var2.f43593m, a2Var2.f43590j);
        this.I = false;
        return true;
    }

    private synchronized boolean h(long j10) {
        if (this.f47607t == 0) {
            return j10 > this.f47612y;
        }
        if (B() >= j10) {
            return false;
        }
        u(this.f47608u + j(j10));
        return true;
    }

    private synchronized void i(long j10, int i10, long j11, int i11, @androidx.annotation.p0 com.google.android.exoplayer2.extractor.e0.a aVar) {
        int i12 = this.f47607t;
        if (i12 > 0) {
            int iE = E(i12 - 1);
            com.google.android.exoplayer2.util.a.a(this.f47602o[iE] + ((long) this.f47603p[iE]) <= j11);
        }
        this.A = (536870912 & i10) != 0;
        this.f47613z = Math.max(this.f47613z, j10);
        int iE2 = E(this.f47607t);
        this.f47605r[iE2] = j10;
        this.f47602o[iE2] = j11;
        this.f47603p[iE2] = i11;
        this.f47604q[iE2] = i10;
        this.f47606s[iE2] = aVar;
        this.f47601n[iE2] = this.G;
        if (this.f47593f.h() || !this.f47593f.g().f47617a.equals(this.F)) {
            com.google.android.exoplayer2.drm.u uVar = this.f47594g;
            this.f47593f.b(H(), new c((a2) com.google.android.exoplayer2.util.a.g(this.F), uVar != null ? uVar.c((Looper) com.google.android.exoplayer2.util.a.g(this.f47596i), this.f47595h, this.F) : com.google.android.exoplayer2.drm.u.b.f44759a));
        }
        int i13 = this.f47607t + 1;
        this.f47607t = i13;
        int i14 = this.f47600m;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            com.google.android.exoplayer2.extractor.e0.a[] aVarArr = new com.google.android.exoplayer2.extractor.e0.a[i15];
            int i16 = this.f47609v;
            int i17 = i14 - i16;
            System.arraycopy(this.f47602o, i16, jArr, 0, i17);
            System.arraycopy(this.f47605r, this.f47609v, jArr2, 0, i17);
            System.arraycopy(this.f47604q, this.f47609v, iArr2, 0, i17);
            System.arraycopy(this.f47603p, this.f47609v, iArr3, 0, i17);
            System.arraycopy(this.f47606s, this.f47609v, aVarArr, 0, i17);
            System.arraycopy(this.f47601n, this.f47609v, iArr, 0, i17);
            int i18 = this.f47609v;
            System.arraycopy(this.f47602o, 0, jArr, i17, i18);
            System.arraycopy(this.f47605r, 0, jArr2, i17, i18);
            System.arraycopy(this.f47604q, 0, iArr2, i17, i18);
            System.arraycopy(this.f47603p, 0, iArr3, i17, i18);
            System.arraycopy(this.f47606s, 0, aVarArr, i17, i18);
            System.arraycopy(this.f47601n, 0, iArr, i17, i18);
            this.f47602o = jArr;
            this.f47605r = jArr2;
            this.f47604q = iArr2;
            this.f47603p = iArr3;
            this.f47606s = aVarArr;
            this.f47601n = iArr;
            this.f47609v = 0;
            this.f47600m = i15;
        }
    }

    private int j(long j10) {
        int i10 = this.f47607t;
        int iE = E(i10 - 1);
        while (i10 > this.f47610w && this.f47605r[iE] >= j10) {
            i10--;
            iE--;
            if (iE == -1) {
                iE = this.f47600m - 1;
            }
        }
        return i10;
    }

    public static c1 k(com.google.android.exoplayer2.upstream.b bVar, Looper looper, com.google.android.exoplayer2.drm.u uVar, com.google.android.exoplayer2.drm.s.a aVar) {
        return new c1(bVar, (Looper) com.google.android.exoplayer2.util.a.g(looper), (com.google.android.exoplayer2.drm.u) com.google.android.exoplayer2.util.a.g(uVar), (com.google.android.exoplayer2.drm.s.a) com.google.android.exoplayer2.util.a.g(aVar));
    }

    public static c1 l(com.google.android.exoplayer2.upstream.b bVar) {
        return new c1(bVar, null, null, null);
    }

    private synchronized long m(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f47607t;
        if (i11 != 0) {
            long[] jArr = this.f47605r;
            int i12 = this.f47609v;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f47610w) != i11) {
                    i11 = i10 + 1;
                }
                int iW = w(i12, i11, j10, z10);
                if (iW == -1) {
                    return -1L;
                }
                return p(iW);
            }
        }
        return -1L;
    }

    private synchronized long n() {
        int i10 = this.f47607t;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    @androidx.annotation.b0("this")
    private long p(int i10) {
        this.f47612y = Math.max(this.f47612y, C(i10));
        this.f47607t -= i10;
        int i11 = this.f47608u + i10;
        this.f47608u = i11;
        int i12 = this.f47609v + i10;
        this.f47609v = i12;
        int i13 = this.f47600m;
        if (i12 >= i13) {
            this.f47609v = i12 - i13;
        }
        int i14 = this.f47610w - i10;
        this.f47610w = i14;
        if (i14 < 0) {
            this.f47610w = 0;
        }
        this.f47593f.e(i11);
        if (this.f47607t != 0) {
            return this.f47602o[this.f47609v];
        }
        int i15 = this.f47609v;
        if (i15 == 0) {
            i15 = this.f47600m;
        }
        int i16 = i15 - 1;
        return this.f47602o[i16] + ((long) this.f47603p[i16]);
    }

    private long u(int i10) {
        int iH = H() - i10;
        boolean z10 = false;
        com.google.android.exoplayer2.util.a.a(iH >= 0 && iH <= this.f47607t - this.f47610w);
        int i11 = this.f47607t - iH;
        this.f47607t = i11;
        this.f47613z = Math.max(this.f47612y, C(i11));
        if (iH == 0 && this.A) {
            z10 = true;
        }
        this.A = z10;
        this.f47593f.d(i10);
        int i12 = this.f47607t;
        if (i12 == 0) {
            return 0L;
        }
        int iE = E(i12 - 1);
        return this.f47602o[iE] + ((long) this.f47603p[iE]);
    }

    private int w(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f47605r[i10];
            if (j11 > j10) {
                return i12;
            }
            if (!z10 || (this.f47604q[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f47600m) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long A() {
        return this.f47613z;
    }

    public final synchronized long B() {
        return Math.max(this.f47612y, C(this.f47610w));
    }

    public final int D() {
        return this.f47608u + this.f47610w;
    }

    public final synchronized int F(long j10, boolean z10) {
        int iE = E(this.f47610w);
        if (I() && j10 >= this.f47605r[iE]) {
            if (j10 > this.f47613z && z10) {
                return this.f47607t - this.f47610w;
            }
            int iW = w(iE, this.f47607t - this.f47610w, j10, true);
            if (iW == -1) {
                return 0;
            }
            return iW;
        }
        return 0;
    }

    @androidx.annotation.p0
    public final synchronized a2 G() {
        return this.C ? null : this.F;
    }

    public final int H() {
        return this.f47608u + this.f47607t;
    }

    protected final void J() {
        this.D = true;
    }

    public final synchronized boolean K() {
        return this.A;
    }

    @androidx.annotation.i
    public synchronized boolean L(boolean z10) {
        a2 a2Var;
        boolean z11 = true;
        if (I()) {
            if (this.f47593f.f(D()).f47617a != this.f47598k) {
                return true;
            }
            return N(E(this.f47610w));
        }
        if (!z10 && !this.A && ((a2Var = this.F) == null || a2Var == this.f47598k)) {
            z11 = false;
        }
        return z11;
    }

    @androidx.annotation.i
    public void O() throws IOException {
        DrmSession drmSession = this.f47599l;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) com.google.android.exoplayer2.util.a.g(this.f47599l.q()));
        }
    }

    public final synchronized int R() {
        return I() ? this.f47601n[E(this.f47610w)] : this.G;
    }

    @androidx.annotation.i
    public void S() {
        r();
        V();
    }

    @androidx.annotation.i
    public int T(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10, boolean z10) {
        int iQ = Q(b2Var, decoderInputBuffer, (i10 & 2) != 0, z10, this.f47592e);
        if (iQ == -4 && !decoderInputBuffer.k()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f47591d.f(decoderInputBuffer, this.f47592e);
                } else {
                    this.f47591d.m(decoderInputBuffer, this.f47592e);
                }
            }
            if (!z11) {
                this.f47610w++;
            }
        }
        return iQ;
    }

    @androidx.annotation.i
    public void U() {
        X(true);
        V();
    }

    public final void W() {
        X(false);
    }

    @androidx.annotation.i
    public void X(boolean z10) {
        this.f47591d.n();
        this.f47607t = 0;
        this.f47608u = 0;
        this.f47609v = 0;
        this.f47610w = 0;
        this.B = true;
        this.f47611x = Long.MIN_VALUE;
        this.f47612y = Long.MIN_VALUE;
        this.f47613z = Long.MIN_VALUE;
        this.A = false;
        this.f47593f.c();
        if (z10) {
            this.E = null;
            this.F = null;
            this.C = true;
        }
    }

    public final synchronized boolean Z(int i10) {
        Y();
        int i11 = this.f47608u;
        if (i10 >= i11 && i10 <= this.f47607t + i11) {
            this.f47611x = Long.MIN_VALUE;
            this.f47610w = i10 - i11;
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.e0
    public final int a(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10, int i11) throws IOException {
        return this.f47591d.p(kVar, i10, z10);
    }

    public final synchronized boolean a0(long j10, boolean z10) {
        Y();
        int iE = E(this.f47610w);
        if (I() && j10 >= this.f47605r[iE] && (j10 <= this.f47613z || z10)) {
            int iW = w(iE, this.f47607t - this.f47610w, j10, true);
            if (iW == -1) {
                return false;
            }
            this.f47611x = j10;
            this.f47610w += iW;
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.e0
    public /* synthetic */ int b(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10) {
        return com.google.android.exoplayer2.extractor.d0.a(this, kVar, i10, z10);
    }

    public final void b0(long j10) {
        if (this.J != j10) {
            this.J = j10;
            J();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.e0
    public /* synthetic */ void c(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
        com.google.android.exoplayer2.extractor.d0.b(this, e0Var, i10);
    }

    public final void c0(long j10) {
        this.f47611x = j10;
    }

    @Override // com.google.android.exoplayer2.extractor.e0
    public final void d(a2 a2Var) {
        a2 a2VarX = x(a2Var);
        this.D = false;
        this.E = a2Var;
        boolean zD0 = d0(a2VarX);
        d dVar = this.f47597j;
        if (dVar == null || !zD0) {
            return;
        }
        dVar.c(a2VarX);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    @Override // com.google.android.exoplayer2.extractor.e0
    public void e(long j10, int i10, int i11, int i12, @androidx.annotation.p0 com.google.android.exoplayer2.extractor.e0.a aVar) {
        int i13;
        if (this.D) {
            d((a2) com.google.android.exoplayer2.util.a.k(this.E));
        }
        int i14 = i10 & 1;
        boolean z10 = i14 != 0;
        if (this.B) {
            if (!z10) {
                return;
            } else {
                this.B = false;
            }
        }
        long j11 = this.J + j10;
        if (!this.H) {
            i13 = i10;
        } else {
            if (j11 < this.f47611x) {
                return;
            }
            if (i14 == 0) {
                if (!this.I) {
                    String strValueOf = String.valueOf(this.F);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50);
                    sb2.append("Overriding unexpected non-sync sample for format: ");
                    sb2.append(strValueOf);
                    com.google.android.exoplayer2.util.u.m(M, sb2.toString());
                    this.I = true;
                }
                i13 = i10 | 1;
            } else {
                i13 = i10;
            }
        }
        if (this.K) {
            if (!z10 || !h(j11)) {
                return;
            } else {
                this.K = false;
            }
        }
        i(j11, i13, (this.f47591d.e() - ((long) i11)) - ((long) i12), i11, aVar);
    }

    public final void e0(@androidx.annotation.p0 d dVar) {
        this.f47597j = dVar;
    }

    @Override // com.google.android.exoplayer2.extractor.e0
    public final void f(com.google.android.exoplayer2.util.e0 e0Var, int i10, int i11) {
        this.f47591d.q(e0Var, i10);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void f0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f47610w + i10 <= this.f47607t) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            z10 = false;
        }
        com.google.android.exoplayer2.util.a.a(z10);
        this.f47610w += i10;
    }

    public final void g0(int i10) {
        this.G = i10;
    }

    public final void h0() {
        this.K = true;
    }

    public synchronized long o() {
        int i10 = this.f47610w;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    public final void q(long j10, boolean z10, boolean z11) {
        this.f47591d.b(m(j10, z10, z11));
    }

    public final void r() {
        this.f47591d.b(n());
    }

    public final void s() {
        this.f47591d.b(o());
    }

    public final void t(long j10) {
        if (this.f47607t == 0) {
            return;
        }
        com.google.android.exoplayer2.util.a.a(j10 > B());
        v(this.f47608u + j(j10));
    }

    public final void v(int i10) {
        this.f47591d.c(u(i10));
    }

    @androidx.annotation.i
    protected a2 x(a2 a2Var) {
        return (this.J == 0 || a2Var.f43597q == Long.MAX_VALUE) ? a2Var : a2Var.c().i0(a2Var.f43597q + this.J).E();
    }

    public final int y() {
        return this.f47608u;
    }

    public final synchronized long z() {
        return this.f47607t == 0 ? Long.MIN_VALUE : this.f47605r[this.f47609v];
    }
}
