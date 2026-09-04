package androidx.constraintlayout.core;

import java.util.ArrayList;

/* JADX INFO: compiled from: ArrayRow.java */
/* JADX INFO: loaded from: classes.dex */
public class b implements e.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f17297g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f17298h = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f17303e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SolverVariable f17299a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f17300b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f17301c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<SolverVariable> f17302d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f17304f = false;

    /* JADX INFO: compiled from: ArrayRow.java */
    public interface a {
        void clear();

        int d();

        int e(SolverVariable solverVariable);

        boolean f(SolverVariable solverVariable);

        SolverVariable g(int i10);

        void h(SolverVariable solverVariable, float f10);

        float i(SolverVariable solverVariable);

        void j(float f10);

        void k(SolverVariable solverVariable, float f10, boolean z10);

        void l();

        float m(SolverVariable solverVariable, boolean z10);

        int n();

        void o();

        float p(b bVar, boolean z10);

        float q(int i10);
    }

    public b() {
    }

    public b(c cVar) {
        this.f17303e = new androidx.constraintlayout.core.a(this, cVar);
    }

    private SolverVariable B(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iD = this.f17303e.d();
        SolverVariable solverVariable2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iD; i10++) {
            float fQ = this.f17303e.q(i10);
            if (fQ < 0.0f) {
                SolverVariable solverVariableG = this.f17303e.g(i10);
                if ((zArr == null || !zArr[solverVariableG.f17266d]) && solverVariableG != solverVariable && (((type = solverVariableG.f17273k) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && fQ < f10)) {
                    f10 = fQ;
                    solverVariable2 = solverVariableG;
                }
            }
        }
        return solverVariable2;
    }

    private boolean z(SolverVariable solverVariable, e eVar) {
        return solverVariable.f17276n <= 1;
    }

    public SolverVariable A(SolverVariable solverVariable) {
        return B(null, solverVariable);
    }

    void C(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f17299a;
        if (solverVariable2 != null) {
            this.f17303e.h(solverVariable2, -1.0f);
            this.f17299a.f17267e = -1;
            this.f17299a = null;
        }
        float fM = this.f17303e.m(solverVariable, true) * (-1.0f);
        this.f17299a = solverVariable;
        if (fM == 1.0f) {
            return;
        }
        this.f17300b /= fM;
        this.f17303e.j(fM);
    }

    public void D() {
        this.f17299a = null;
        this.f17303e.clear();
        this.f17300b = 0.0f;
        this.f17304f = false;
    }

    int E() {
        return (this.f17299a != null ? 4 : 0) + 4 + 4 + this.f17303e.n();
    }

    String F() {
        boolean z10;
        String str = (this.f17299a == null ? "0" : "" + this.f17299a) + " = ";
        if (this.f17300b != 0.0f) {
            str = str + this.f17300b;
            z10 = true;
        } else {
            z10 = false;
        }
        int iD = this.f17303e.d();
        for (int i10 = 0; i10 < iD; i10++) {
            SolverVariable solverVariableG = this.f17303e.g(i10);
            if (solverVariableG != null) {
                float fQ = this.f17303e.q(i10);
                if (fQ != 0.0f) {
                    String string = solverVariableG.toString();
                    if (z10) {
                        if (fQ > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fQ *= -1.0f;
                        }
                    } else if (fQ < 0.0f) {
                        str = str + "- ";
                        fQ *= -1.0f;
                    }
                    str = fQ == 1.0f ? str + string : str + fQ + " " + string;
                    z10 = true;
                }
            }
        }
        if (z10) {
            return str;
        }
        return str + "0.0";
    }

    public void G(e eVar, SolverVariable solverVariable, boolean z10) {
        if (solverVariable == null || !solverVariable.f17277o) {
            return;
        }
        float fI = this.f17303e.i(solverVariable);
        this.f17300b += solverVariable.f17279q * fI;
        this.f17303e.m(solverVariable, z10);
        if (z10) {
            solverVariable.g(this);
        }
        this.f17303e.k(eVar.f17331n.f17308d[solverVariable.f17278p], fI, z10);
        if (e.f17315x && this.f17303e.d() == 0) {
            this.f17304f = true;
            eVar.f17318a = true;
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public void a(e eVar, SolverVariable solverVariable, boolean z10) {
        if (solverVariable == null || !solverVariable.f17270h) {
            return;
        }
        this.f17300b += solverVariable.f17269g * this.f17303e.i(solverVariable);
        this.f17303e.m(solverVariable, z10);
        if (z10) {
            solverVariable.g(this);
        }
        if (e.f17315x && this.f17303e.d() == 0) {
            this.f17304f = true;
            eVar.f17318a = true;
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public void b(e eVar, b bVar, boolean z10) {
        this.f17300b += bVar.f17300b * this.f17303e.p(bVar, z10);
        if (z10) {
            bVar.f17299a.g(this);
        }
        if (e.f17315x && this.f17299a != null && this.f17303e.d() == 0) {
            this.f17304f = true;
            eVar.f17318a = true;
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public SolverVariable c(e eVar, boolean[] zArr) {
        return B(zArr, null);
    }

    @Override // androidx.constraintlayout.core.e.a
    public void clear() {
        this.f17303e.clear();
        this.f17299a = null;
        this.f17300b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.e.a
    public void d(e eVar) {
        if (eVar.f17324g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iD = this.f17303e.d();
            for (int i10 = 0; i10 < iD; i10++) {
                SolverVariable solverVariableG = this.f17303e.g(i10);
                if (solverVariableG.f17267e != -1 || solverVariableG.f17270h || solverVariableG.f17277o) {
                    this.f17302d.add(solverVariableG);
                }
            }
            int size = this.f17302d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    SolverVariable solverVariable = this.f17302d.get(i11);
                    if (solverVariable.f17270h) {
                        a(eVar, solverVariable, true);
                    } else if (solverVariable.f17277o) {
                        G(eVar, solverVariable, true);
                    } else {
                        b(eVar, eVar.f17324g[solverVariable.f17267e], true);
                    }
                }
                this.f17302d.clear();
            } else {
                z10 = true;
            }
        }
        if (e.f17315x && this.f17299a != null && this.f17303e.d() == 0) {
            this.f17304f = true;
            eVar.f17318a = true;
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public void e(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f17299a = null;
            this.f17303e.clear();
            for (int i10 = 0; i10 < bVar.f17303e.d(); i10++) {
                this.f17303e.k(bVar.f17303e.g(i10), bVar.f17303e.q(i10), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.e.a
    public void f(SolverVariable solverVariable) {
        int i10 = solverVariable.f17268f;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f17303e.h(solverVariable, f10);
    }

    public b g(e eVar, int i10) {
        this.f17303e.h(eVar.s(i10, "ep"), 1.0f);
        this.f17303e.h(eVar.s(i10, "em"), -1.0f);
        return this;
    }

    @Override // androidx.constraintlayout.core.e.a
    public SolverVariable getKey() {
        return this.f17299a;
    }

    b h(SolverVariable solverVariable, int i10) {
        this.f17303e.h(solverVariable, i10);
        return this;
    }

    boolean i(e eVar) {
        boolean z10;
        SolverVariable solverVariableJ = j(eVar);
        if (solverVariableJ == null) {
            z10 = true;
        } else {
            C(solverVariableJ);
            z10 = false;
        }
        if (this.f17303e.d() == 0) {
            this.f17304f = true;
        }
        return z10;
    }

    @Override // androidx.constraintlayout.core.e.a
    public boolean isEmpty() {
        return this.f17299a == null && this.f17300b == 0.0f && this.f17303e.d() == 0;
    }

    SolverVariable j(e eVar) {
        int iD = this.f17303e.d();
        SolverVariable solverVariable = null;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        SolverVariable solverVariable2 = null;
        for (int i10 = 0; i10 < iD; i10++) {
            float fQ = this.f17303e.q(i10);
            SolverVariable solverVariableG = this.f17303e.g(i10);
            if (solverVariableG.f17273k == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null || f10 > fQ) {
                    boolean z12 = z(solverVariableG, eVar);
                    z10 = z12;
                    f10 = fQ;
                    solverVariable = solverVariableG;
                } else if (!z10 && z(solverVariableG, eVar)) {
                    f10 = fQ;
                    solverVariable = solverVariableG;
                    z10 = true;
                }
            } else if (solverVariable == null && fQ < 0.0f) {
                if (solverVariable2 == null || f11 > fQ) {
                    boolean z13 = z(solverVariableG, eVar);
                    z11 = z13;
                    f11 = fQ;
                    solverVariable2 = solverVariableG;
                } else if (!z11 && z(solverVariableG, eVar)) {
                    f11 = fQ;
                    solverVariable2 = solverVariableG;
                    z11 = true;
                }
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    b k(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, float f10, SolverVariable solverVariable3, SolverVariable solverVariable4, int i11) {
        if (solverVariable2 == solverVariable3) {
            this.f17303e.h(solverVariable, 1.0f);
            this.f17303e.h(solverVariable4, 1.0f);
            this.f17303e.h(solverVariable2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f17303e.h(solverVariable, 1.0f);
            this.f17303e.h(solverVariable2, -1.0f);
            this.f17303e.h(solverVariable3, -1.0f);
            this.f17303e.h(solverVariable4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f17300b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            this.f17303e.h(solverVariable, -1.0f);
            this.f17303e.h(solverVariable2, 1.0f);
            this.f17300b = i10;
        } else if (f10 >= 1.0f) {
            this.f17303e.h(solverVariable4, -1.0f);
            this.f17303e.h(solverVariable3, 1.0f);
            this.f17300b = -i11;
        } else {
            float f11 = 1.0f - f10;
            this.f17303e.h(solverVariable, f11 * 1.0f);
            this.f17303e.h(solverVariable2, f11 * (-1.0f));
            this.f17303e.h(solverVariable3, (-1.0f) * f10);
            this.f17303e.h(solverVariable4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f17300b = ((-i10) * f11) + (i11 * f10);
            }
        }
        return this;
    }

    b l(SolverVariable solverVariable, int i10) {
        this.f17299a = solverVariable;
        float f10 = i10;
        solverVariable.f17269g = f10;
        this.f17300b = f10;
        this.f17304f = true;
        return this;
    }

    b m(SolverVariable solverVariable, SolverVariable solverVariable2, float f10) {
        this.f17303e.h(solverVariable, -1.0f);
        this.f17303e.h(solverVariable2, f10);
        return this;
    }

    public b n(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10) {
        this.f17303e.h(solverVariable, -1.0f);
        this.f17303e.h(solverVariable2, 1.0f);
        this.f17303e.h(solverVariable3, f10);
        this.f17303e.h(solverVariable4, -f10);
        return this;
    }

    public b o(float f10, float f11, float f12, SolverVariable solverVariable, int i10, SolverVariable solverVariable2, int i11, SolverVariable solverVariable3, int i12, SolverVariable solverVariable4, int i13) {
        if (f11 == 0.0f || f10 == f12) {
            this.f17300b = ((-i10) - i11) + i12 + i13;
            this.f17303e.h(solverVariable, 1.0f);
            this.f17303e.h(solverVariable2, -1.0f);
            this.f17303e.h(solverVariable4, 1.0f);
            this.f17303e.h(solverVariable3, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f17300b = ((-i10) - i11) + (i12 * f13) + (i13 * f13);
            this.f17303e.h(solverVariable, 1.0f);
            this.f17303e.h(solverVariable2, -1.0f);
            this.f17303e.h(solverVariable4, f13);
            this.f17303e.h(solverVariable3, -f13);
        }
        return this;
    }

    public b p(float f10, float f11, float f12, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f17300b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f17303e.h(solverVariable, 1.0f);
            this.f17303e.h(solverVariable2, -1.0f);
            this.f17303e.h(solverVariable4, 1.0f);
            this.f17303e.h(solverVariable3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f17303e.h(solverVariable, 1.0f);
            this.f17303e.h(solverVariable2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f17303e.h(solverVariable3, 1.0f);
            this.f17303e.h(solverVariable4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f17303e.h(solverVariable, 1.0f);
            this.f17303e.h(solverVariable2, -1.0f);
            this.f17303e.h(solverVariable4, f13);
            this.f17303e.h(solverVariable3, -f13);
        }
        return this;
    }

    public b q(SolverVariable solverVariable, int i10) {
        if (i10 < 0) {
            this.f17300b = i10 * (-1);
            this.f17303e.h(solverVariable, 1.0f);
        } else {
            this.f17300b = i10;
            this.f17303e.h(solverVariable, -1.0f);
        }
        return this;
    }

    public b r(SolverVariable solverVariable, SolverVariable solverVariable2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f17300b = i10;
        }
        if (z10) {
            this.f17303e.h(solverVariable, 1.0f);
            this.f17303e.h(solverVariable2, -1.0f);
        } else {
            this.f17303e.h(solverVariable, -1.0f);
            this.f17303e.h(solverVariable2, 1.0f);
        }
        return this;
    }

    public b s(SolverVariable solverVariable, int i10, SolverVariable solverVariable2) {
        this.f17300b = i10;
        this.f17303e.h(solverVariable, -1.0f);
        return this;
    }

    public b t(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f17300b = i10;
        }
        if (z10) {
            this.f17303e.h(solverVariable, 1.0f);
            this.f17303e.h(solverVariable2, -1.0f);
            this.f17303e.h(solverVariable3, -1.0f);
        } else {
            this.f17303e.h(solverVariable, -1.0f);
            this.f17303e.h(solverVariable2, 1.0f);
            this.f17303e.h(solverVariable3, 1.0f);
        }
        return this;
    }

    public String toString() {
        return F();
    }

    public b u(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f17300b = i10;
        }
        if (z10) {
            this.f17303e.h(solverVariable, 1.0f);
            this.f17303e.h(solverVariable2, -1.0f);
            this.f17303e.h(solverVariable3, 1.0f);
        } else {
            this.f17303e.h(solverVariable, -1.0f);
            this.f17303e.h(solverVariable2, 1.0f);
            this.f17303e.h(solverVariable3, -1.0f);
        }
        return this;
    }

    public b v(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10) {
        this.f17303e.h(solverVariable3, 0.5f);
        this.f17303e.h(solverVariable4, 0.5f);
        this.f17303e.h(solverVariable, -0.5f);
        this.f17303e.h(solverVariable2, -0.5f);
        this.f17300b = -f10;
        return this;
    }

    void w() {
        float f10 = this.f17300b;
        if (f10 < 0.0f) {
            this.f17300b = f10 * (-1.0f);
            this.f17303e.l();
        }
    }

    boolean x() {
        SolverVariable solverVariable = this.f17299a;
        return solverVariable != null && (solverVariable.f17273k == SolverVariable.Type.UNRESTRICTED || this.f17300b >= 0.0f);
    }

    boolean y(SolverVariable solverVariable) {
        return this.f17303e.f(solverVariable);
    }
}
