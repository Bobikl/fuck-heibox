package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: RunGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f18376h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18377i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18378j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f18379k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    WidgetRun f18382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    WidgetRun f18383d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f18385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f18386g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18380a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18381b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<WidgetRun> f18384e = new ArrayList<>();

    public l(WidgetRun widgetRun, int i10) {
        this.f18382c = null;
        this.f18383d = null;
        int i11 = f18379k;
        this.f18385f = i11;
        f18379k = i11 + 1;
        this.f18382c = widgetRun;
        this.f18383d = widgetRun;
        this.f18386g = i10;
    }

    private boolean c(WidgetRun widgetRun, int i10) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (!widgetRun.f18319b.f18264g[i10]) {
            return false;
        }
        for (d dVar : widgetRun.f18325h.f18316k) {
            if ((dVar instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dVar).f18309d) != widgetRun && dependencyNode2 == widgetRun3.f18325h) {
                if (widgetRun instanceof c) {
                    Iterator<WidgetRun> it = ((c) widgetRun).f18353k.iterator();
                    while (it.hasNext()) {
                        c(it.next(), i10);
                    }
                } else if (!(widgetRun instanceof j)) {
                    widgetRun.f18319b.f18264g[i10] = false;
                }
                c(dependencyNode2.f18309d, i10);
            }
        }
        for (d dVar2 : widgetRun.f18326i.f18316k) {
            if ((dVar2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dVar2).f18309d) != widgetRun && dependencyNode == widgetRun2.f18325h) {
                if (widgetRun instanceof c) {
                    Iterator<WidgetRun> it2 = ((c) widgetRun).f18353k.iterator();
                    while (it2.hasNext()) {
                        c(it2.next(), i10);
                    }
                } else if (!(widgetRun instanceof j)) {
                    widgetRun.f18319b.f18264g[i10] = false;
                }
                c(dependencyNode.f18309d, i10);
            }
        }
        return false;
    }

    private long e(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f18309d;
        if (widgetRun instanceof j) {
            return j10;
        }
        int size = dependencyNode.f18316k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = dependencyNode.f18316k.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f18309d != widgetRun) {
                    jMin = Math.min(jMin, e(dependencyNode2, ((long) dependencyNode2.f18311f) + j10));
                }
            }
        }
        if (dependencyNode != widgetRun.f18326i) {
            return jMin;
        }
        long j11 = j10 - widgetRun.j();
        return Math.min(Math.min(jMin, e(widgetRun.f18325h, j11)), j11 - ((long) widgetRun.f18325h.f18311f));
    }

    private long f(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f18309d;
        if (widgetRun instanceof j) {
            return j10;
        }
        int size = dependencyNode.f18316k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = dependencyNode.f18316k.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f18309d != widgetRun) {
                    jMax = Math.max(jMax, f(dependencyNode2, ((long) dependencyNode2.f18311f) + j10));
                }
            }
        }
        if (dependencyNode != widgetRun.f18325h) {
            return jMax;
        }
        long j11 = j10 + widgetRun.j();
        return Math.max(Math.max(jMax, f(widgetRun.f18326i, j11)), j11 - ((long) widgetRun.f18326i.f18311f));
    }

    public void a(WidgetRun widgetRun) {
        this.f18384e.add(widgetRun);
        this.f18383d = widgetRun;
    }

    public long b(androidx.constraintlayout.core.widgets.d dVar, int i10) {
        long j10;
        int i11;
        WidgetRun widgetRun = this.f18382c;
        if (widgetRun instanceof c) {
            if (((c) widgetRun).f18323f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(widgetRun instanceof k)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof m)) {
            return 0L;
        }
        DependencyNode dependencyNode = (i10 == 0 ? dVar.f18260e : dVar.f18262f).f18325h;
        DependencyNode dependencyNode2 = (i10 == 0 ? dVar.f18260e : dVar.f18262f).f18326i;
        boolean zContains = widgetRun.f18325h.f18317l.contains(dependencyNode);
        boolean zContains2 = this.f18382c.f18326i.f18317l.contains(dependencyNode2);
        long j11 = this.f18382c.j();
        if (zContains && zContains2) {
            long jF = f(this.f18382c.f18325h, 0L);
            long jE = e(this.f18382c.f18326i, 0L);
            long j12 = jF - j11;
            WidgetRun widgetRun2 = this.f18382c;
            int i12 = widgetRun2.f18326i.f18311f;
            if (j12 >= (-i12)) {
                j12 += (long) i12;
            }
            int i13 = widgetRun2.f18325h.f18311f;
            long j13 = ((-jE) - j11) - ((long) i13);
            if (j13 >= i13) {
                j13 -= (long) i13;
            }
            float fU = widgetRun2.f18319b.u(i10);
            float f10 = fU > 0.0f ? (long) ((j13 / fU) + (j12 / (1.0f - fU))) : 0L;
            long j14 = ((long) ((f10 * fU) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fU)) + 0.5f));
            WidgetRun widgetRun3 = this.f18382c;
            j10 = ((long) widgetRun3.f18325h.f18311f) + j14;
            i11 = widgetRun3.f18326i.f18311f;
        } else {
            if (zContains) {
                DependencyNode dependencyNode3 = this.f18382c.f18325h;
                return Math.max(f(dependencyNode3, dependencyNode3.f18311f), ((long) this.f18382c.f18325h.f18311f) + j11);
            }
            if (zContains2) {
                DependencyNode dependencyNode4 = this.f18382c.f18326i;
                return Math.max(-e(dependencyNode4, dependencyNode4.f18311f), ((long) (-this.f18382c.f18326i.f18311f)) + j11);
            }
            WidgetRun widgetRun4 = this.f18382c;
            j10 = ((long) widgetRun4.f18325h.f18311f) + widgetRun4.j();
            i11 = this.f18382c.f18326i.f18311f;
        }
        return j10 - ((long) i11);
    }

    public void d(boolean z10, boolean z11) {
        if (z10) {
            WidgetRun widgetRun = this.f18382c;
            if (widgetRun instanceof k) {
                c(widgetRun, 0);
            }
        }
        if (z11) {
            WidgetRun widgetRun2 = this.f18382c;
            if (widgetRun2 instanceof m) {
                c(widgetRun2, 1);
            }
        }
    }
}
