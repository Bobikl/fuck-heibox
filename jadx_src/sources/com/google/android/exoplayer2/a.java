package com.google.android.exoplayer2;

import android.util.Pair;

/* JADX INFO: compiled from: AbstractConcatenatedTimeline.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends z3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f43567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.f1 f43568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f43569i;

    public a(boolean z10, com.google.android.exoplayer2.source.f1 f1Var) {
        this.f43569i = z10;
        this.f43568h = f1Var;
        this.f43567g = f1Var.getLength();
    }

    public static Object E(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object F(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object H(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int K(int i10, boolean z10) {
        if (z10) {
            return this.f43568h.b(i10);
        }
        if (i10 < this.f43567g - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int L(int i10, boolean z10) {
        if (z10) {
            return this.f43568h.a(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    protected abstract int B(Object obj);

    protected abstract int C(int i10);

    protected abstract int D(int i10);

    protected abstract Object G(int i10);

    protected abstract int I(int i10);

    protected abstract int J(int i10);

    protected abstract z3 M(int i10);

    @Override // com.google.android.exoplayer2.z3
    public int f(boolean z10) {
        if (this.f43567g == 0) {
            return -1;
        }
        if (this.f43569i) {
            z10 = false;
        }
        int iE = z10 ? this.f43568h.e() : 0;
        while (M(iE).x()) {
            iE = K(iE, z10);
            if (iE == -1) {
                return -1;
            }
        }
        return J(iE) + M(iE).f(z10);
    }

    @Override // com.google.android.exoplayer2.z3
    public final int g(Object obj) {
        int iG;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objF = F(obj);
        Object objE = E(obj);
        int iB = B(objF);
        if (iB == -1 || (iG = M(iB).g(objE)) == -1) {
            return -1;
        }
        return I(iB) + iG;
    }

    @Override // com.google.android.exoplayer2.z3
    public int h(boolean z10) {
        int i10 = this.f43567g;
        if (i10 == 0) {
            return -1;
        }
        if (this.f43569i) {
            z10 = false;
        }
        int iC = z10 ? this.f43568h.c() : i10 - 1;
        while (M(iC).x()) {
            iC = L(iC, z10);
            if (iC == -1) {
                return -1;
            }
        }
        return J(iC) + M(iC).h(z10);
    }

    @Override // com.google.android.exoplayer2.z3
    public int j(int i10, int i11, boolean z10) {
        if (this.f43569i) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iD = D(i10);
        int iJ = J(iD);
        int iJ2 = M(iD).j(i10 - iJ, i11 != 2 ? i11 : 0, z10);
        if (iJ2 != -1) {
            return iJ + iJ2;
        }
        int iK = K(iD, z10);
        while (iK != -1 && M(iK).x()) {
            iK = K(iK, z10);
        }
        if (iK != -1) {
            return J(iK) + M(iK).f(z10);
        }
        if (i11 == 2) {
            return f(z10);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.z3
    public final z3.b l(int i10, z3.b bVar, boolean z10) {
        int iC = C(i10);
        int iJ = J(iC);
        M(iC).l(i10 - I(iC), bVar, z10);
        bVar.f52095d += iJ;
        if (z10) {
            bVar.f52094c = H(G(iC), com.google.android.exoplayer2.util.a.g(bVar.f52094c));
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.z3
    public final z3.b m(Object obj, z3.b bVar) {
        Object objF = F(obj);
        Object objE = E(obj);
        int iB = B(objF);
        int iJ = J(iB);
        M(iB).m(objE, bVar);
        bVar.f52095d += iJ;
        bVar.f52094c = obj;
        return bVar;
    }

    @Override // com.google.android.exoplayer2.z3
    public int s(int i10, int i11, boolean z10) {
        if (this.f43569i) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iD = D(i10);
        int iJ = J(iD);
        int iS = M(iD).s(i10 - iJ, i11 != 2 ? i11 : 0, z10);
        if (iS != -1) {
            return iJ + iS;
        }
        int iL = L(iD, z10);
        while (iL != -1 && M(iL).x()) {
            iL = L(iL, z10);
        }
        if (iL != -1) {
            return J(iL) + M(iL).h(z10);
        }
        if (i11 == 2) {
            return h(z10);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.z3
    public final Object t(int i10) {
        int iC = C(i10);
        return H(G(iC), M(iC).t(i10 - I(iC)));
    }

    @Override // com.google.android.exoplayer2.z3
    public final z3.d v(int i10, z3.d dVar, long j10) {
        int iD = D(i10);
        int iJ = J(iD);
        int I = I(iD);
        M(iD).v(i10 - iJ, dVar, j10);
        Object objG = G(iD);
        if (!z3.d.f52104s.equals(dVar.f52112b)) {
            objG = H(objG, dVar.f52112b);
        }
        dVar.f52112b = objG;
        dVar.f52126p += I;
        dVar.f52127q += I;
        return dVar;
    }
}
