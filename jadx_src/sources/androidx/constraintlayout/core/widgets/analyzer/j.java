package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Iterator;

/* JADX INFO: compiled from: HelperReferences.java */
/* JADX INFO: loaded from: classes.dex */
public class j extends WidgetRun {
    public j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void u(DependencyNode dependencyNode) {
        this.f18325h.f18316k.add(dependencyNode);
        dependencyNode.f18317l.add(this.f18325h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f18319b;
        int iJ2 = aVar.j2();
        Iterator<DependencyNode> it = this.f18325h.f18317l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f18312g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iJ2 == 0 || iJ2 == 2) {
            this.f18325h.e(i11 + aVar.k2());
        } else {
            this.f18325h.e(i10 + aVar.k2());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        ConstraintWidget constraintWidget = this.f18319b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            this.f18325h.f18307b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int iJ2 = aVar.j2();
            boolean zI2 = aVar.i2();
            int i10 = 0;
            if (iJ2 == 0) {
                this.f18325h.f18310e = DependencyNode.Type.LEFT;
                while (i10 < aVar.A1) {
                    ConstraintWidget constraintWidget2 = aVar.f18483z1[i10];
                    if (zI2 || constraintWidget2.i0() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.f18260e.f18325h;
                        dependencyNode.f18316k.add(this.f18325h);
                        this.f18325h.f18317l.add(dependencyNode);
                    }
                    i10++;
                }
                u(this.f18319b.f18260e.f18325h);
                u(this.f18319b.f18260e.f18326i);
                return;
            }
            if (iJ2 == 1) {
                this.f18325h.f18310e = DependencyNode.Type.RIGHT;
                while (i10 < aVar.A1) {
                    ConstraintWidget constraintWidget3 = aVar.f18483z1[i10];
                    if (zI2 || constraintWidget3.i0() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.f18260e.f18326i;
                        dependencyNode2.f18316k.add(this.f18325h);
                        this.f18325h.f18317l.add(dependencyNode2);
                    }
                    i10++;
                }
                u(this.f18319b.f18260e.f18325h);
                u(this.f18319b.f18260e.f18326i);
                return;
            }
            if (iJ2 == 2) {
                this.f18325h.f18310e = DependencyNode.Type.TOP;
                while (i10 < aVar.A1) {
                    ConstraintWidget constraintWidget4 = aVar.f18483z1[i10];
                    if (zI2 || constraintWidget4.i0() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.f18262f.f18325h;
                        dependencyNode3.f18316k.add(this.f18325h);
                        this.f18325h.f18317l.add(dependencyNode3);
                    }
                    i10++;
                }
                u(this.f18319b.f18262f.f18325h);
                u(this.f18319b.f18262f.f18326i);
                return;
            }
            if (iJ2 != 3) {
                return;
            }
            this.f18325h.f18310e = DependencyNode.Type.BOTTOM;
            while (i10 < aVar.A1) {
                ConstraintWidget constraintWidget5 = aVar.f18483z1[i10];
                if (zI2 || constraintWidget5.i0() != 8) {
                    DependencyNode dependencyNode4 = constraintWidget5.f18262f.f18326i;
                    dependencyNode4.f18316k.add(this.f18325h);
                    this.f18325h.f18317l.add(dependencyNode4);
                }
                i10++;
            }
            u(this.f18319b.f18262f.f18325h);
            u(this.f18319b.f18262f.f18326i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        ConstraintWidget constraintWidget = this.f18319b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int iJ2 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).j2();
            if (iJ2 == 0 || iJ2 == 1) {
                this.f18319b.Z1(this.f18325h.f18312g);
            } else {
                this.f18319b.a2(this.f18325h.f18312g);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.f18320c = null;
        this.f18325h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void n() {
        this.f18325h.f18315j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean p() {
        return false;
    }
}
