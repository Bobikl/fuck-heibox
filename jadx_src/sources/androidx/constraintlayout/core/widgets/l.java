package androidx.constraintlayout.core.widgets;

import java.util.HashSet;

/* JADX INFO: compiled from: VirtualLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class l extends h {
    private int B1 = 0;
    private int C1 = 0;
    private int D1 = 0;
    private int E1 = 0;
    private int F1 = 0;
    private int G1 = 0;
    private int H1 = 0;
    private int I1 = 0;
    private boolean J1 = false;
    private int K1 = 0;
    private int L1 = 0;
    protected androidx.constraintlayout.core.widgets.analyzer.b.a M1 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0110b N1 = null;

    public void A2(int i10) {
        this.F1 = i10;
        this.H1 = i10;
        this.I1 = i10;
    }

    public void B2(int i10) {
        this.B1 = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.h, androidx.constraintlayout.core.widgets.g
    public void c(d dVar) {
        h2();
    }

    public void g2(boolean z10) {
        int i10 = this.F1;
        if (i10 > 0 || this.G1 > 0) {
            if (z10) {
                this.H1 = this.G1;
                this.I1 = i10;
            } else {
                this.H1 = i10;
                this.I1 = this.G1;
            }
        }
    }

    public void h2() {
        for (int i10 = 0; i10 < this.A1; i10++) {
            ConstraintWidget constraintWidget = this.f18483z1[i10];
            if (constraintWidget != null) {
                constraintWidget.C1(true);
            }
        }
    }

    public boolean i2(HashSet<ConstraintWidget> hashSet) {
        for (int i10 = 0; i10 < this.A1; i10++) {
            if (hashSet.contains(this.f18483z1[i10])) {
                return true;
            }
        }
        return false;
    }

    public int j2() {
        return this.L1;
    }

    public int k2() {
        return this.K1;
    }

    public int l2() {
        return this.C1;
    }

    public int m2() {
        return this.H1;
    }

    public int n2() {
        return this.I1;
    }

    public int o2() {
        return this.B1;
    }

    public void p2(int i10, int i11, int i12, int i13) {
    }

    protected void q2(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        while (this.N1 == null && U() != null) {
            this.N1 = ((d) U()).A2();
        }
        androidx.constraintlayout.core.widgets.analyzer.b.a aVar = this.M1;
        aVar.f18343a = dimensionBehaviour;
        aVar.f18344b = dimensionBehaviour2;
        aVar.f18345c = i10;
        aVar.f18346d = i11;
        this.N1.b(constraintWidget, aVar);
        constraintWidget.W1(this.M1.f18347e);
        constraintWidget.s1(this.M1.f18348f);
        constraintWidget.r1(this.M1.f18350h);
        constraintWidget.a1(this.M1.f18349g);
    }

    protected boolean r2() {
        ConstraintWidget constraintWidget = this.f18257c0;
        androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0110b interfaceC0110bA2 = constraintWidget != null ? ((d) constraintWidget).A2() : null;
        if (interfaceC0110bA2 == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.A1) {
                return true;
            }
            ConstraintWidget constraintWidget2 = this.f18483z1[i10];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof f)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviourZ = constraintWidget2.z(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourZ2 = constraintWidget2.z(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (!(dimensionBehaviourZ == dimensionBehaviour && constraintWidget2.f18296w != 1 && dimensionBehaviourZ2 == dimensionBehaviour && constraintWidget2.f18298x != 1)) {
                    if (dimensionBehaviourZ == dimensionBehaviour) {
                        dimensionBehaviourZ = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (dimensionBehaviourZ2 == dimensionBehaviour) {
                        dimensionBehaviourZ2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    androidx.constraintlayout.core.widgets.analyzer.b.a aVar = this.M1;
                    aVar.f18343a = dimensionBehaviourZ;
                    aVar.f18344b = dimensionBehaviourZ2;
                    aVar.f18345c = constraintWidget2.j0();
                    this.M1.f18346d = constraintWidget2.D();
                    interfaceC0110bA2.b(constraintWidget2, this.M1);
                    constraintWidget2.W1(this.M1.f18347e);
                    constraintWidget2.s1(this.M1.f18348f);
                    constraintWidget2.a1(this.M1.f18349g);
                }
            }
            i10++;
        }
    }

    public boolean s2() {
        return this.J1;
    }

    protected void t2(boolean z10) {
        this.J1 = z10;
    }

    public void u2(int i10, int i11) {
        this.K1 = i10;
        this.L1 = i11;
    }

    public void v2(int i10) {
        this.D1 = i10;
        this.B1 = i10;
        this.E1 = i10;
        this.C1 = i10;
        this.F1 = i10;
        this.G1 = i10;
    }

    public void w2(int i10) {
        this.C1 = i10;
    }

    public void x2(int i10) {
        this.G1 = i10;
    }

    public void y2(int i10) {
        this.D1 = i10;
        this.H1 = i10;
    }

    public void z2(int i10) {
        this.E1 = i10;
        this.I1 = i10;
    }
}
