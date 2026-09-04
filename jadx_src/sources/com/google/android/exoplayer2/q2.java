package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: MediaPeriodQueue.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f47326n = 1000000000000L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f47327o = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z3.b f47328a = new z3.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z3.d f47329b = new z3.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.android.exoplayer2.analytics.n1 f47330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f47331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f47332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private n2 f47335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private n2 f47336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private n2 f47337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f47338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private Object f47339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f47340m;

    public q2(@androidx.annotation.p0 com.google.android.exoplayer2.analytics.n1 n1Var, Handler handler) {
        this.f47330c = n1Var;
        this.f47331d = handler;
    }

    private static com.google.android.exoplayer2.source.f0.a B(z3 z3Var, Object obj, long j10, long j11, z3.b bVar) {
        z3Var.m(obj, bVar);
        int i10 = bVar.i(j10);
        return i10 == -1 ? new com.google.android.exoplayer2.source.f0.a(obj, j11, bVar.h(j10)) : new com.google.android.exoplayer2.source.f0.a(obj, i10, bVar.p(i10), j11);
    }

    private long C(z3 z3Var, Object obj) {
        int iG;
        int i10 = z3Var.m(obj, this.f47328a).f52095d;
        Object obj2 = this.f47339l;
        if (obj2 != null && (iG = z3Var.g(obj2)) != -1 && z3Var.k(iG, this.f47328a).f52095d == i10) {
            return this.f47340m;
        }
        for (n2 n2VarJ = this.f47335h; n2VarJ != null; n2VarJ = n2VarJ.j()) {
            if (n2VarJ.f47031b.equals(obj)) {
                return n2VarJ.f47035f.f47048a.f47722d;
            }
        }
        for (n2 n2VarJ2 = this.f47335h; n2VarJ2 != null; n2VarJ2 = n2VarJ2.j()) {
            int iG2 = z3Var.g(n2VarJ2.f47031b);
            if (iG2 != -1 && z3Var.k(iG2, this.f47328a).f52095d == i10) {
                return n2VarJ2.f47035f.f47048a.f47722d;
            }
        }
        long j10 = this.f47332e;
        this.f47332e = 1 + j10;
        if (this.f47335h == null) {
            this.f47339l = obj;
            this.f47340m = j10;
        }
        return j10;
    }

    private boolean E(z3 z3Var) {
        n2 n2VarJ = this.f47335h;
        if (n2VarJ == null) {
            return true;
        }
        int iG = z3Var.g(n2VarJ.f47031b);
        while (true) {
            iG = z3Var.i(iG, this.f47328a, this.f47329b, this.f47333f, this.f47334g);
            while (n2VarJ.j() != null && !n2VarJ.f47035f.f47054g) {
                n2VarJ = n2VarJ.j();
            }
            n2 n2VarJ2 = n2VarJ.j();
            if (iG == -1 || n2VarJ2 == null || z3Var.g(n2VarJ2.f47031b) != iG) {
                break;
            }
            n2VarJ = n2VarJ2;
        }
        boolean z10 = z(n2VarJ);
        n2VarJ.f47035f = r(z3Var, n2VarJ.f47035f);
        return !z10;
    }

    private boolean d(long j10, long j11) {
        return j10 == j.f46377b || j10 == j11;
    }

    private boolean e(o2 o2Var, o2 o2Var2) {
        return o2Var.f47049b == o2Var2.f47049b && o2Var.f47048a.equals(o2Var2.f47048a);
    }

    @androidx.annotation.p0
    private o2 h(z2 z2Var) {
        return k(z2Var.f52063a, z2Var.f52064b, z2Var.f52065c, z2Var.f52081s);
    }

    @androidx.annotation.p0
    private o2 i(z3 z3Var, n2 n2Var, long j10) {
        long j11;
        o2 o2Var = n2Var.f47035f;
        long jL = (n2Var.l() + o2Var.f47052e) - j10;
        if (o2Var.f47054g) {
            long j12 = 0;
            int i10 = z3Var.i(z3Var.g(o2Var.f47048a.f47719a), this.f47328a, this.f47329b, this.f47333f, this.f47334g);
            if (i10 == -1) {
                return null;
            }
            int i11 = z3Var.l(i10, this.f47328a, true).f52095d;
            Object obj = this.f47328a.f52094c;
            long j13 = o2Var.f47048a.f47722d;
            if (z3Var.u(i11, this.f47329b).f52126p == i10) {
                Pair<Object, Long> pairP = z3Var.p(this.f47329b, this.f47328a, i11, j.f46377b, Math.max(0L, jL));
                if (pairP == null) {
                    return null;
                }
                obj = pairP.first;
                long jLongValue = ((Long) pairP.second).longValue();
                n2 n2VarJ = n2Var.j();
                if (n2VarJ == null || !n2VarJ.f47031b.equals(obj)) {
                    j13 = this.f47332e;
                    this.f47332e = 1 + j13;
                } else {
                    j13 = n2VarJ.f47035f.f47048a.f47722d;
                }
                j11 = jLongValue;
                j12 = j.f46377b;
            } else {
                j11 = 0;
            }
            return k(z3Var, B(z3Var, obj, j11, j13, this.f47328a), j12, j11);
        }
        com.google.android.exoplayer2.source.f0.a aVar = o2Var.f47048a;
        z3Var.m(aVar.f47719a, this.f47328a);
        if (!aVar.c()) {
            int iP = this.f47328a.p(aVar.f47723e);
            if (iP != this.f47328a.e(aVar.f47723e)) {
                return l(z3Var, aVar.f47719a, aVar.f47723e, iP, o2Var.f47052e, aVar.f47722d);
            }
            return m(z3Var, aVar.f47719a, n(z3Var, aVar.f47719a, aVar.f47723e), o2Var.f47052e, aVar.f47722d);
        }
        int i12 = aVar.f47720b;
        int iE = this.f47328a.e(i12);
        if (iE == -1) {
            return null;
        }
        int iQ = this.f47328a.q(i12, aVar.f47721c);
        if (iQ < iE) {
            return l(z3Var, aVar.f47719a, i12, iQ, o2Var.f47050c, aVar.f47722d);
        }
        long jLongValue2 = o2Var.f47050c;
        if (jLongValue2 == j.f46377b) {
            z3.d dVar = this.f47329b;
            z3.b bVar = this.f47328a;
            Pair<Object, Long> pairP2 = z3Var.p(dVar, bVar, bVar.f52095d, j.f46377b, Math.max(0L, jL));
            if (pairP2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairP2.second).longValue();
        }
        return m(z3Var, aVar.f47719a, Math.max(n(z3Var, aVar.f47719a, aVar.f47720b), jLongValue2), o2Var.f47050c, aVar.f47722d);
    }

    @androidx.annotation.p0
    private o2 k(z3 z3Var, com.google.android.exoplayer2.source.f0.a aVar, long j10, long j11) {
        z3Var.m(aVar.f47719a, this.f47328a);
        return aVar.c() ? l(z3Var, aVar.f47719a, aVar.f47720b, aVar.f47721c, j10, aVar.f47722d) : m(z3Var, aVar.f47719a, j11, j10, aVar.f47722d);
    }

    private o2 l(z3 z3Var, Object obj, int i10, int i11, long j10, long j11) {
        com.google.android.exoplayer2.source.f0.a aVar = new com.google.android.exoplayer2.source.f0.a(obj, i10, i11, j11);
        long jF = z3Var.m(aVar.f47719a, this.f47328a).f(aVar.f47720b, aVar.f47721c);
        long jK = i11 == this.f47328a.p(i10) ? this.f47328a.k() : 0L;
        return new o2(aVar, (jF == j.f46377b || jK < jF) ? jK : Math.max(0L, jF - 1), j10, j.f46377b, jF, this.f47328a.v(aVar.f47720b), false, false, false);
    }

    private o2 m(z3 z3Var, Object obj, long j10, long j11, long j12) {
        long jMax = j10;
        z3Var.m(obj, this.f47328a);
        int iH = this.f47328a.h(jMax);
        com.google.android.exoplayer2.source.f0.a aVar = new com.google.android.exoplayer2.source.f0.a(obj, j12, iH);
        boolean zS = s(aVar);
        boolean zU = u(z3Var, aVar);
        boolean zT = t(z3Var, aVar, zS);
        boolean z10 = iH != -1 && this.f47328a.v(iH);
        long j13 = iH != -1 ? this.f47328a.j(iH) : -9223372036854775807L;
        long j14 = (j13 == j.f46377b || j13 == Long.MIN_VALUE) ? this.f47328a.f52096e : j13;
        if (j14 != j.f46377b && jMax >= j14) {
            jMax = Math.max(0L, j14 - 1);
        }
        return new o2(aVar, jMax, j11, j13, j14, z10, zS, zU, zT);
    }

    private long n(z3 z3Var, Object obj, int i10) {
        z3Var.m(obj, this.f47328a);
        long j10 = this.f47328a.j(i10);
        return j10 == Long.MIN_VALUE ? this.f47328a.f52096e : j10 + this.f47328a.m(i10);
    }

    private boolean s(com.google.android.exoplayer2.source.f0.a aVar) {
        return !aVar.c() && aVar.f47723e == -1;
    }

    private boolean t(z3 z3Var, com.google.android.exoplayer2.source.f0.a aVar, boolean z10) {
        int iG = z3Var.g(aVar.f47719a);
        return !z3Var.u(z3Var.k(iG, this.f47328a).f52095d, this.f47329b).f52120j && z3Var.y(iG, this.f47328a, this.f47329b, this.f47333f, this.f47334g) && z10;
    }

    private boolean u(z3 z3Var, com.google.android.exoplayer2.source.f0.a aVar) {
        if (s(aVar)) {
            return z3Var.u(z3Var.m(aVar.f47719a, this.f47328a).f52095d, this.f47329b).f52127q == z3Var.g(aVar.f47719a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(ImmutableList.a aVar, com.google.android.exoplayer2.source.f0.a aVar2) {
        this.f47330c.g3(aVar.e(), aVar2);
    }

    private void x() {
        if (this.f47330c != null) {
            final ImmutableList.a aVarQ = ImmutableList.q();
            for (n2 n2VarJ = this.f47335h; n2VarJ != null; n2VarJ = n2VarJ.j()) {
                aVarQ.a(n2VarJ.f47035f.f47048a);
            }
            n2 n2Var = this.f47336i;
            final com.google.android.exoplayer2.source.f0.a aVar = n2Var == null ? null : n2Var.f47035f.f47048a;
            this.f47331d.post(new Runnable() { // from class: com.google.android.exoplayer2.p2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47319b.w(aVarQ, aVar);
                }
            });
        }
    }

    public com.google.android.exoplayer2.source.f0.a A(z3 z3Var, Object obj, long j10) {
        return B(z3Var, obj, j10, C(z3Var, obj), this.f47328a);
    }

    public boolean D() {
        n2 n2Var = this.f47337j;
        return n2Var == null || (!n2Var.f47035f.f47056i && n2Var.q() && this.f47337j.f47035f.f47052e != j.f46377b && this.f47338k < 100);
    }

    public boolean F(z3 z3Var, long j10, long j11) {
        o2 o2VarR;
        n2 n2VarJ = this.f47335h;
        n2 n2Var = null;
        while (n2VarJ != null) {
            o2 o2Var = n2VarJ.f47035f;
            if (n2Var != null) {
                o2 o2VarI = i(z3Var, n2Var, j10);
                if (o2VarI != null && e(o2Var, o2VarI)) {
                    o2VarR = o2VarI;
                }
                return !z(n2Var);
            }
            o2VarR = r(z3Var, o2Var);
            n2VarJ.f47035f = o2VarR.a(o2Var.f47050c);
            if (!d(o2Var.f47052e, o2VarR.f47052e)) {
                n2VarJ.A();
                long j12 = o2VarR.f47052e;
                return (z(n2VarJ) || (n2VarJ == this.f47336i && !n2VarJ.f47035f.f47053f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > j.f46377b ? 1 : (j12 == j.f46377b ? 0 : -1)) == 0 ? Long.MAX_VALUE : n2VarJ.z(j12)) ? 1 : (j11 == ((j12 > j.f46377b ? 1 : (j12 == j.f46377b ? 0 : -1)) == 0 ? Long.MAX_VALUE : n2VarJ.z(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            n2Var = n2VarJ;
            n2VarJ = n2VarJ.j();
        }
        return true;
    }

    public boolean G(z3 z3Var, int i10) {
        this.f47333f = i10;
        return E(z3Var);
    }

    public boolean H(z3 z3Var, boolean z10) {
        this.f47334g = z10;
        return E(z3Var);
    }

    @androidx.annotation.p0
    public n2 b() {
        n2 n2Var = this.f47335h;
        if (n2Var == null) {
            return null;
        }
        if (n2Var == this.f47336i) {
            this.f47336i = n2Var.j();
        }
        this.f47335h.t();
        int i10 = this.f47338k - 1;
        this.f47338k = i10;
        if (i10 == 0) {
            this.f47337j = null;
            n2 n2Var2 = this.f47335h;
            this.f47339l = n2Var2.f47031b;
            this.f47340m = n2Var2.f47035f.f47048a.f47722d;
        }
        this.f47335h = this.f47335h.j();
        x();
        return this.f47335h;
    }

    public n2 c() {
        n2 n2Var = this.f47336i;
        com.google.android.exoplayer2.util.a.i((n2Var == null || n2Var.j() == null) ? false : true);
        this.f47336i = this.f47336i.j();
        x();
        return this.f47336i;
    }

    public void f() {
        if (this.f47338k == 0) {
            return;
        }
        n2 n2VarJ = (n2) com.google.android.exoplayer2.util.a.k(this.f47335h);
        this.f47339l = n2VarJ.f47031b;
        this.f47340m = n2VarJ.f47035f.f47048a.f47722d;
        while (n2VarJ != null) {
            n2VarJ.t();
            n2VarJ = n2VarJ.j();
        }
        this.f47335h = null;
        this.f47337j = null;
        this.f47336i = null;
        this.f47338k = 0;
        x();
    }

    public n2 g(o3[] o3VarArr, com.google.android.exoplayer2.trackselection.w wVar, com.google.android.exoplayer2.upstream.b bVar, t2 t2Var, o2 o2Var, com.google.android.exoplayer2.trackselection.x xVar) {
        n2 n2Var = this.f47337j;
        n2 n2Var2 = new n2(o3VarArr, n2Var == null ? f47326n : (n2Var.l() + this.f47337j.f47035f.f47052e) - o2Var.f47049b, wVar, bVar, t2Var, o2Var, xVar);
        n2 n2Var3 = this.f47337j;
        if (n2Var3 != null) {
            n2Var3.w(n2Var2);
        } else {
            this.f47335h = n2Var2;
            this.f47336i = n2Var2;
        }
        this.f47339l = null;
        this.f47337j = n2Var2;
        this.f47338k++;
        x();
        return n2Var2;
    }

    @androidx.annotation.p0
    public n2 j() {
        return this.f47337j;
    }

    @androidx.annotation.p0
    public o2 o(long j10, z2 z2Var) {
        n2 n2Var = this.f47337j;
        return n2Var == null ? h(z2Var) : i(z2Var.f52063a, n2Var, j10);
    }

    @androidx.annotation.p0
    public n2 p() {
        return this.f47335h;
    }

    @androidx.annotation.p0
    public n2 q() {
        return this.f47336i;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    public o2 r(z3 z3Var, o2 o2Var) {
        long jO;
        long j10;
        int i10;
        boolean zV;
        int i11;
        com.google.android.exoplayer2.source.f0.a aVar = o2Var.f47048a;
        boolean zS = s(aVar);
        boolean zU = u(z3Var, aVar);
        boolean zT = t(z3Var, aVar, zS);
        z3Var.m(o2Var.f47048a.f47719a, this.f47328a);
        long j11 = (aVar.c() || (i11 = aVar.f47723e) == -1) ? -9223372036854775807L : this.f47328a.j(i11);
        if (!aVar.c()) {
            if (j11 == j.f46377b || j11 == Long.MIN_VALUE) {
                jO = this.f47328a.o();
            } else {
                j10 = j11;
            }
            if (aVar.c()) {
                zV = this.f47328a.v(aVar.f47720b);
            } else {
                i10 = aVar.f47723e;
                if (i10 == -1 && this.f47328a.v(i10)) {
                    zV = true;
                } else {
                    zV = false;
                }
            }
            return new o2(aVar, o2Var.f47049b, o2Var.f47050c, j11, j10, zV, zS, zU, zT);
        }
        jO = this.f47328a.f(aVar.f47720b, aVar.f47721c);
        j10 = jO;
        if (aVar.c()) {
            zV = this.f47328a.v(aVar.f47720b);
        } else {
            i10 = aVar.f47723e;
            if (i10 == -1) {
                zV = false;
            } else {
                zV = false;
            }
        }
        return new o2(aVar, o2Var.f47049b, o2Var.f47050c, j11, j10, zV, zS, zU, zT);
    }

    public boolean v(com.google.android.exoplayer2.source.c0 c0Var) {
        n2 n2Var = this.f47337j;
        return n2Var != null && n2Var.f47030a == c0Var;
    }

    public void y(long j10) {
        n2 n2Var = this.f47337j;
        if (n2Var != null) {
            n2Var.s(j10);
        }
    }

    public boolean z(n2 n2Var) {
        boolean z10 = false;
        com.google.android.exoplayer2.util.a.i(n2Var != null);
        if (n2Var.equals(this.f47337j)) {
            return false;
        }
        this.f47337j = n2Var;
        while (n2Var.j() != null) {
            n2Var = n2Var.j();
            if (n2Var == this.f47336i) {
                this.f47336i = this.f47335h;
                z10 = true;
            }
            n2Var.t();
            this.f47338k--;
        }
        this.f47337j.w(null);
        x();
        return z10;
    }
}
