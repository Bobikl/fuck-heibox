package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DependencyNode implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    WidgetRun f18309d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f18311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18312g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f18306a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18307b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18308c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Type f18310e = Type.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f18313h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    f f18314i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18315j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List<d> f18316k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List<DependencyNode> f18317l = new ArrayList();

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f18309d = widgetRun;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        Iterator<DependencyNode> it = this.f18317l.iterator();
        while (it.hasNext()) {
            if (!it.next().f18315j) {
                return;
            }
        }
        this.f18308c = true;
        d dVar2 = this.f18306a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f18307b) {
            this.f18309d.a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i10 = 0;
        for (DependencyNode dependencyNode2 : this.f18317l) {
            if (!(dependencyNode2 instanceof f)) {
                i10++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i10 == 1 && dependencyNode.f18315j) {
            f fVar = this.f18314i;
            if (fVar != null) {
                if (!fVar.f18315j) {
                    return;
                } else {
                    this.f18311f = this.f18313h * fVar.f18312g;
                }
            }
            e(dependencyNode.f18312g + this.f18311f);
        }
        d dVar3 = this.f18306a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f18316k.add(dVar);
        if (this.f18315j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f18317l.clear();
        this.f18316k.clear();
        this.f18315j = false;
        this.f18312g = 0;
        this.f18308c = false;
        this.f18307b = false;
    }

    public String d() {
        String str;
        String strY = this.f18309d.f18319b.y();
        Type type = this.f18310e;
        if (type == Type.LEFT || type == Type.RIGHT) {
            str = strY + "_HORIZONTAL";
        } else {
            str = strY + "_VERTICAL";
        }
        return str + ":" + this.f18310e.name();
    }

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

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18309d.f18319b.y());
        sb2.append(":");
        sb2.append(this.f18310e);
        sb2.append("(");
        sb2.append(this.f18315j ? Integer.valueOf(this.f18312g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f18317l.size());
        sb2.append(":d=");
        sb2.append(this.f18316k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
