package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

/* JADX INFO: compiled from: Barrier.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends h {
    public static final int F1 = 0;
    public static final int G1 = 1;
    public static final int H1 = 2;
    public static final int I1 = 3;
    private static final boolean J1 = true;
    private static final boolean K1 = false;
    private int B1 = 0;
    private boolean C1 = true;
    private int D1 = 0;
    boolean E1 = false;

    public a() {
    }

    public a(String str) {
        d1(str);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean C0() {
        return this.E1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean D0() {
        return this.E1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.e eVar, boolean z10) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        ConstraintAnchor[] constraintAnchorArr2 = this.Y;
        constraintAnchorArr2[0] = this.Q;
        constraintAnchorArr2[2] = this.R;
        constraintAnchorArr2[1] = this.S;
        constraintAnchorArr2[3] = this.T;
        int i13 = 0;
        while (true) {
            constraintAnchorArr = this.Y;
            if (i13 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i13];
            constraintAnchor.f18225i = eVar.u(constraintAnchor);
            i13++;
        }
        int i14 = this.B1;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i14];
        if (!this.E1) {
            g2();
        }
        if (this.E1) {
            this.E1 = false;
            int i15 = this.B1;
            if (i15 == 0 || i15 == 1) {
                eVar.f(this.Q.f18225i, this.f18267h0);
                eVar.f(this.S.f18225i, this.f18267h0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    eVar.f(this.R.f18225i, this.f18269i0);
                    eVar.f(this.T.f18225i, this.f18269i0);
                    return;
                }
                return;
            }
        }
        int i16 = 0;
        while (true) {
            if (i16 >= this.A1) {
                z11 = false;
                break;
            }
            ConstraintWidget constraintWidget = this.f18483z1[i16];
            if ((this.C1 || constraintWidget.h()) && ((((i11 = this.B1) == 0 || i11 == 1) && constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.Q.f18222f != null && constraintWidget.S.f18222f != null) || (((i12 = this.B1) == 2 || i12 == 3) && constraintWidget.g0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.R.f18222f != null && constraintWidget.T.f18222f != null))) {
                z11 = true;
                break;
            }
            i16++;
        }
        boolean z12 = this.Q.m() || this.S.m();
        boolean z13 = this.R.m() || this.T.m();
        int i17 = !z11 && (((i10 = this.B1) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13)))) ? 5 : 4;
        for (int i18 = 0; i18 < this.A1; i18++) {
            ConstraintWidget constraintWidget2 = this.f18483z1[i18];
            if (this.C1 || constraintWidget2.h()) {
                SolverVariable solverVariableU = eVar.u(constraintWidget2.Y[this.B1]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.Y;
                int i19 = this.B1;
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i19];
                constraintAnchor3.f18225i = solverVariableU;
                ConstraintAnchor constraintAnchor4 = constraintAnchor3.f18222f;
                int i20 = (constraintAnchor4 == null || constraintAnchor4.f18220d != this) ? 0 : constraintAnchor3.f18223g + 0;
                if (i19 == 0 || i19 == 2) {
                    eVar.j(constraintAnchor2.f18225i, solverVariableU, this.D1 - i20, z11);
                } else {
                    eVar.h(constraintAnchor2.f18225i, solverVariableU, this.D1 + i20, z11);
                }
                eVar.e(constraintAnchor2.f18225i, solverVariableU, this.D1 + i20, i17);
            }
        }
        int i21 = this.B1;
        if (i21 == 0) {
            eVar.e(this.S.f18225i, this.Q.f18225i, 0, 8);
            eVar.e(this.Q.f18225i, this.f18257c0.S.f18225i, 0, 4);
            eVar.e(this.Q.f18225i, this.f18257c0.Q.f18225i, 0, 0);
            return;
        }
        if (i21 == 1) {
            eVar.e(this.Q.f18225i, this.S.f18225i, 0, 8);
            eVar.e(this.Q.f18225i, this.f18257c0.Q.f18225i, 0, 4);
            eVar.e(this.Q.f18225i, this.f18257c0.S.f18225i, 0, 0);
        } else if (i21 == 2) {
            eVar.e(this.T.f18225i, this.R.f18225i, 0, 8);
            eVar.e(this.R.f18225i, this.f18257c0.T.f18225i, 0, 4);
            eVar.e(this.R.f18225i, this.f18257c0.R.f18225i, 0, 0);
        } else if (i21 == 3) {
            eVar.e(this.R.f18225i, this.T.f18225i, 0, 8);
            eVar.e(this.R.f18225i, this.f18257c0.R.f18225i, 0, 4);
            eVar.e(this.R.f18225i, this.f18257c0.T.f18225i, 0, 0);
        }
    }

    public boolean g2() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.A1;
            if (i13 >= i10) {
                break;
            }
            ConstraintWidget constraintWidget = this.f18483z1[i13];
            if ((this.C1 || constraintWidget.h()) && ((((i11 = this.B1) == 0 || i11 == 1) && !constraintWidget.C0()) || (((i12 = this.B1) == 2 || i12 == 3) && !constraintWidget.D0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.A1; i14++) {
            ConstraintWidget constraintWidget2 = this.f18483z1[i14];
            if (this.C1 || constraintWidget2.h()) {
                if (!z11) {
                    int i15 = this.B1;
                    if (i15 == 0) {
                        iMax = constraintWidget2.r(ConstraintAnchor.Type.LEFT).f();
                    } else if (i15 == 1) {
                        iMax = constraintWidget2.r(ConstraintAnchor.Type.RIGHT).f();
                    } else if (i15 == 2) {
                        iMax = constraintWidget2.r(ConstraintAnchor.Type.TOP).f();
                    } else if (i15 == 3) {
                        iMax = constraintWidget2.r(ConstraintAnchor.Type.BOTTOM).f();
                    }
                    z11 = true;
                }
                int i16 = this.B1;
                if (i16 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.r(ConstraintAnchor.Type.LEFT).f());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.r(ConstraintAnchor.Type.RIGHT).f());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.r(ConstraintAnchor.Type.TOP).f());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.r(ConstraintAnchor.Type.BOTTOM).f());
                }
            }
        }
        int i17 = iMax + this.D1;
        int i18 = this.B1;
        if (i18 == 0 || i18 == 1) {
            k1(i17, i17);
        } else {
            n1(i17, i17);
        }
        this.E1 = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    @Deprecated
    public boolean h2() {
        return this.C1;
    }

    public boolean i2() {
        return this.C1;
    }

    public int j2() {
        return this.B1;
    }

    public int k2() {
        return this.D1;
    }

    public int l2() {
        int i10 = this.B1;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    protected void m2() {
        for (int i10 = 0; i10 < this.A1; i10++) {
            ConstraintWidget constraintWidget = this.f18483z1[i10];
            if (this.C1 || constraintWidget.h()) {
                int i11 = this.B1;
                if (i11 == 0 || i11 == 1) {
                    constraintWidget.A1(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    constraintWidget.A1(1, true);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.h, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.n(constraintWidget, map);
        a aVar = (a) constraintWidget;
        this.B1 = aVar.B1;
        this.C1 = aVar.C1;
        this.D1 = aVar.D1;
    }

    public void n2(boolean z10) {
        this.C1 = z10;
    }

    public void o2(int i10) {
        this.B1 = i10;
    }

    public void p2(int i10) {
        this.D1 = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + y() + " {";
        for (int i10 = 0; i10 < this.A1; i10++) {
            ConstraintWidget constraintWidget = this.f18483z1[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.y();
        }
        return str + z5.g.f141884d;
    }
}
