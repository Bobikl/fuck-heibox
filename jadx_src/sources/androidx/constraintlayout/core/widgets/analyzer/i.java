package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: compiled from: GuidelineReference.java */
/* JADX INFO: loaded from: classes.dex */
public class i extends WidgetRun {
    public i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f18260e.f();
        constraintWidget.f18262f.f();
        this.f18323f = ((androidx.constraintlayout.core.widgets.f) constraintWidget).g2();
    }

    private void u(DependencyNode dependencyNode) {
        this.f18325h.f18316k.add(dependencyNode);
        dependencyNode.f18317l.add(this.f18325h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        DependencyNode dependencyNode = this.f18325h;
        if (dependencyNode.f18308c && !dependencyNode.f18315j) {
            this.f18325h.e((int) ((dependencyNode.f18317l.get(0).f18312g * ((androidx.constraintlayout.core.widgets.f) this.f18319b).k2()) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) this.f18319b;
        int iH2 = fVar.h2();
        int iJ2 = fVar.j2();
        fVar.k2();
        if (fVar.g2() == 1) {
            if (iH2 != -1) {
                this.f18325h.f18317l.add(this.f18319b.f18257c0.f18260e.f18325h);
                this.f18319b.f18257c0.f18260e.f18325h.f18316k.add(this.f18325h);
                this.f18325h.f18311f = iH2;
            } else if (iJ2 != -1) {
                this.f18325h.f18317l.add(this.f18319b.f18257c0.f18260e.f18326i);
                this.f18319b.f18257c0.f18260e.f18326i.f18316k.add(this.f18325h);
                this.f18325h.f18311f = -iJ2;
            } else {
                DependencyNode dependencyNode = this.f18325h;
                dependencyNode.f18307b = true;
                dependencyNode.f18317l.add(this.f18319b.f18257c0.f18260e.f18326i);
                this.f18319b.f18257c0.f18260e.f18326i.f18316k.add(this.f18325h);
            }
            u(this.f18319b.f18260e.f18325h);
            u(this.f18319b.f18260e.f18326i);
            return;
        }
        if (iH2 != -1) {
            this.f18325h.f18317l.add(this.f18319b.f18257c0.f18262f.f18325h);
            this.f18319b.f18257c0.f18262f.f18325h.f18316k.add(this.f18325h);
            this.f18325h.f18311f = iH2;
        } else if (iJ2 != -1) {
            this.f18325h.f18317l.add(this.f18319b.f18257c0.f18262f.f18326i);
            this.f18319b.f18257c0.f18262f.f18326i.f18316k.add(this.f18325h);
            this.f18325h.f18311f = -iJ2;
        } else {
            DependencyNode dependencyNode2 = this.f18325h;
            dependencyNode2.f18307b = true;
            dependencyNode2.f18317l.add(this.f18319b.f18257c0.f18262f.f18326i);
            this.f18319b.f18257c0.f18262f.f18326i.f18316k.add(this.f18325h);
        }
        u(this.f18319b.f18262f.f18325h);
        u(this.f18319b.f18262f.f18326i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        if (((androidx.constraintlayout.core.widgets.f) this.f18319b).g2() == 1) {
            this.f18319b.Z1(this.f18325h.f18312g);
        } else {
            this.f18319b.a2(this.f18325h.f18312g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.f18325h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void n() {
        this.f18325h.f18315j = false;
        this.f18326i.f18315j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean p() {
        return false;
    }
}
