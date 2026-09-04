package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* JADX INFO: compiled from: WidgetContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class m extends ConstraintWidget {

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f18505z1;

    public m() {
        this.f18505z1 = new ArrayList<>();
    }

    public m(int i10, int i11) {
        super(i10, i11);
        this.f18505z1 = new ArrayList<>();
    }

    public m(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.f18505z1 = new ArrayList<>();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void K1(int i10, int i11) {
        super.K1(i10, i11);
        int size = this.f18505z1.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f18505z1.get(i12).K1(Y(), Z());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void N0() {
        this.f18505z1.clear();
        super.N0();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void S0(androidx.constraintlayout.core.c cVar) {
        super.S0(cVar);
        int size = this.f18505z1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18505z1.get(i10).S0(cVar);
        }
    }

    public void a(ConstraintWidget constraintWidget) {
        this.f18505z1.add(constraintWidget);
        if (constraintWidget.U() != null) {
            ((m) constraintWidget.U()).i2(constraintWidget);
        }
        constraintWidget.M1(this);
    }

    public void e2(ConstraintWidget... constraintWidgetArr) {
        for (ConstraintWidget constraintWidget : constraintWidgetArr) {
            a(constraintWidget);
        }
    }

    public ArrayList<ConstraintWidget> f2() {
        return this.f18505z1;
    }

    public d g2() {
        ConstraintWidget constraintWidgetU = U();
        d dVar = this instanceof d ? (d) this : null;
        while (constraintWidgetU != null) {
            ConstraintWidget constraintWidgetU2 = constraintWidgetU.U();
            if (constraintWidgetU instanceof d) {
                dVar = (d) constraintWidgetU;
            }
            constraintWidgetU = constraintWidgetU2;
        }
        return dVar;
    }

    public void h2() {
        ArrayList<ConstraintWidget> arrayList = this.f18505z1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f18505z1.get(i10);
            if (constraintWidget instanceof m) {
                ((m) constraintWidget).h2();
            }
        }
    }

    public void i2(ConstraintWidget constraintWidget) {
        this.f18505z1.remove(constraintWidget);
        constraintWidget.N0();
    }

    public void j2() {
        this.f18505z1.clear();
    }
}
