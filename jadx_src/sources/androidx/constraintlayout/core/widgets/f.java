package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

/* JADX INFO: compiled from: Guideline.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends ConstraintWidget {
    public static final int G1 = 0;
    public static final int H1 = 1;
    public static final int I1 = 0;
    public static final int J1 = 1;
    public static final int K1 = 2;
    public static final int L1 = -1;
    private boolean F1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    protected float f18481z1 = -1.0f;
    protected int A1 = -1;
    protected int B1 = -1;
    private ConstraintAnchor C1 = this.R;
    private int D1 = 0;
    private int E1 = 0;

    /* JADX INFO: compiled from: Guideline.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18482a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f18482a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18482a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18482a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18482a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18482a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18482a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18482a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18482a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18482a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public f() {
        this.Z.clear();
        this.Z.add(this.C1);
        int length = this.Y.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.Y[i10] = this.C1;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean C0() {
        return this.F1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean D0() {
        return this.F1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String c0() {
        return "Guideline";
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void d2(androidx.constraintlayout.core.e eVar, boolean z10) {
        if (U() == null) {
            return;
        }
        int iO = eVar.O(this.C1);
        if (this.D1 == 1) {
            Z1(iO);
            a2(0);
            s1(U().D());
            W1(0);
            return;
        }
        Z1(0);
        a2(iO);
        W1(U().j0());
        s1(0);
    }

    public void e2() {
        if (this.A1 != -1) {
            n2();
        } else if (this.f18481z1 != -1.0f) {
            m2();
        } else if (this.B1 != -1) {
            l2();
        }
    }

    public ConstraintAnchor f2() {
        return this.C1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.e eVar, boolean z10) {
        d dVar = (d) U();
        if (dVar == null) {
            return;
        }
        ConstraintAnchor constraintAnchorR = dVar.r(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorR2 = dVar.r(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.f18257c0;
        boolean z11 = constraintWidget != null && constraintWidget.f18255b0[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.D1 == 0) {
            constraintAnchorR = dVar.r(ConstraintAnchor.Type.TOP);
            constraintAnchorR2 = dVar.r(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f18257c0;
            z11 = constraintWidget2 != null && constraintWidget2.f18255b0[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.F1 && this.C1.o()) {
            SolverVariable solverVariableU = eVar.u(this.C1);
            eVar.f(solverVariableU, this.C1.f());
            if (this.A1 != -1) {
                if (z11) {
                    eVar.i(eVar.u(constraintAnchorR2), solverVariableU, 0, 5);
                }
            } else if (this.B1 != -1 && z11) {
                SolverVariable solverVariableU2 = eVar.u(constraintAnchorR2);
                eVar.i(solverVariableU, eVar.u(constraintAnchorR), 0, 5);
                eVar.i(solverVariableU2, solverVariableU, 0, 5);
            }
            this.F1 = false;
            return;
        }
        if (this.A1 != -1) {
            SolverVariable solverVariableU3 = eVar.u(this.C1);
            eVar.e(solverVariableU3, eVar.u(constraintAnchorR), this.A1, 8);
            if (z11) {
                eVar.i(eVar.u(constraintAnchorR2), solverVariableU3, 0, 5);
                return;
            }
            return;
        }
        if (this.B1 == -1) {
            if (this.f18481z1 != -1.0f) {
                eVar.d(androidx.constraintlayout.core.e.w(eVar, eVar.u(this.C1), eVar.u(constraintAnchorR2), this.f18481z1));
                return;
            }
            return;
        }
        SolverVariable solverVariableU4 = eVar.u(this.C1);
        SolverVariable solverVariableU5 = eVar.u(constraintAnchorR2);
        eVar.e(solverVariableU4, solverVariableU5, -this.B1, 8);
        if (z11) {
            eVar.i(solverVariableU4, eVar.u(constraintAnchorR), 0, 5);
            eVar.i(solverVariableU5, solverVariableU4, 0, 5);
        }
    }

    public int g2() {
        return this.D1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    public int h2() {
        return this.A1;
    }

    public int i2() {
        if (this.f18481z1 != -1.0f) {
            return 0;
        }
        if (this.A1 != -1) {
            return 1;
        }
        return this.B1 != -1 ? 2 : -1;
    }

    public int j2() {
        return this.B1;
    }

    public float k2() {
        return this.f18481z1;
    }

    void l2() {
        int iL0 = l0();
        if (this.D1 == 0) {
            iL0 = m0();
        }
        q2(iL0);
    }

    void m2() {
        int iJ0 = U().j0() - l0();
        if (this.D1 == 0) {
            iJ0 = U().D() - m0();
        }
        r2(iJ0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.n(constraintWidget, map);
        f fVar = (f) constraintWidget;
        this.f18481z1 = fVar.f18481z1;
        this.A1 = fVar.A1;
        this.B1 = fVar.B1;
        v2(fVar.D1);
    }

    void n2() {
        float fL0 = l0() / U().j0();
        if (this.D1 == 0) {
            fL0 = m0() / U().D();
        }
        s2(fL0);
    }

    public boolean o2() {
        return this.f18481z1 != -1.0f && this.A1 == -1 && this.B1 == -1;
    }

    public void p2(int i10) {
        this.C1.A(i10);
        this.F1 = true;
    }

    public void q2(int i10) {
        if (i10 > -1) {
            this.f18481z1 = -1.0f;
            this.A1 = i10;
            this.B1 = -1;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor r(ConstraintAnchor.Type type) {
        int i10 = a.f18482a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.D1 == 1) {
                return this.C1;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.D1 == 0) {
            return this.C1;
        }
        return null;
    }

    public void r2(int i10) {
        if (i10 > -1) {
            this.f18481z1 = -1.0f;
            this.A1 = -1;
            this.B1 = i10;
        }
    }

    public void s2(float f10) {
        if (f10 > -1.0f) {
            this.f18481z1 = f10;
            this.A1 = -1;
            this.B1 = -1;
        }
    }

    public void t2(int i10) {
        s2(i10 / 100.0f);
    }

    public void u2(int i10) {
        this.E1 = i10;
    }

    public void v2(int i10) {
        if (this.D1 == i10) {
            return;
        }
        this.D1 = i10;
        this.Z.clear();
        if (this.D1 == 1) {
            this.C1 = this.Q;
        } else {
            this.C1 = this.R;
        }
        this.Z.add(this.C1);
        int length = this.Y.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.Y[i11] = this.C1;
        }
    }
}
