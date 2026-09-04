package androidx.constraintlayout.core.widgets;

/* JADX INFO: compiled from: Placeholder.java */
/* JADX INFO: loaded from: classes.dex */
public class j extends l {
    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.e eVar, boolean z10) {
        super.g(eVar, z10);
        if (this.A1 > 0) {
            ConstraintWidget constraintWidget = this.f18483z1[0];
            constraintWidget.O0();
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.j(type, this, type);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.j(type2, this, type2);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.j(type3, this, type3);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.j(type4, this, type4);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.l
    public void p2(int i10, int i11, int i12, int i13) {
        int iM2 = m2() + n2() + 0;
        int iO2 = o2() + l2() + 0;
        if (this.A1 > 0) {
            iM2 += this.f18483z1[0].j0();
            iO2 += this.f18483z1[0].D();
        }
        int iMax = Math.max(Q(), iM2);
        int iMax2 = Math.max(P(), iO2);
        if (i10 != 1073741824) {
            if (i10 == Integer.MIN_VALUE) {
                i11 = Math.min(iMax, i11);
            } else {
                i11 = i10 == 0 ? iMax : 0;
            }
        }
        if (i12 != 1073741824) {
            if (i12 == Integer.MIN_VALUE) {
                i13 = Math.min(iMax2, i13);
            } else {
                i13 = i12 == 0 ? iMax2 : 0;
            }
        }
        u2(i11, i13);
        W1(i11);
        s1(i13);
        t2(this.A1 > 0);
    }
}
