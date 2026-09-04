package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: compiled from: DimensionDependency.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends DependencyNode {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18365m;

    public f(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof k) {
            this.f18310e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f18310e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public void e(int i10) {
        if (this.f18315j) {
            return;
        }
        this.f18315j = true;
        this.f18312g = i10;
        for (d dVar : this.f18316k) {
            dVar.a(dVar);
        }
    }
}
