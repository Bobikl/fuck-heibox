package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: HelperWidget.java */
/* JADX INFO: loaded from: classes.dex */
public class h extends ConstraintWidget implements g {

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public ConstraintWidget[] f18483z1 = new ConstraintWidget[4];
    public int A1 = 0;

    @Override // androidx.constraintlayout.core.widgets.g
    public void a(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i10 = this.A1 + 1;
        ConstraintWidget[] constraintWidgetArr = this.f18483z1;
        if (i10 > constraintWidgetArr.length) {
            this.f18483z1 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f18483z1;
        int i11 = this.A1;
        constraintWidgetArr2[i11] = constraintWidget;
        this.A1 = i11 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.g
    public void b() {
        this.A1 = 0;
        Arrays.fill(this.f18483z1, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.g
    public void c(d dVar) {
    }

    public void e2(ArrayList<n> arrayList, int i10, n nVar) {
        for (int i11 = 0; i11 < this.A1; i11++) {
            nVar.a(this.f18483z1[i11]);
        }
        for (int i12 = 0; i12 < this.A1; i12++) {
            androidx.constraintlayout.core.widgets.analyzer.h.a(this.f18483z1[i12], i10, arrayList, nVar);
        }
    }

    public int f2(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.A1; i13++) {
            ConstraintWidget constraintWidget = this.f18483z1[i13];
            if (i10 == 0 && (i12 = constraintWidget.R0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = constraintWidget.S0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.n(constraintWidget, map);
        h hVar = (h) constraintWidget;
        this.A1 = 0;
        int i10 = hVar.A1;
        for (int i11 = 0; i11 < i10; i11++) {
            a(map.get(hVar.f18483z1[i11]));
        }
    }
}
