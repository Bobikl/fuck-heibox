package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ConstraintWidget f18319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    l f18320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ConstraintWidget.DimensionBehaviour f18321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    f f18322e = new f(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18323f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f18324g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DependencyNode f18325h = new DependencyNode(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DependencyNode f18326i = new DependencyNode(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected RunType f18327j = RunType.NONE;

    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18328a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f18328a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18328a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18328a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18328a[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18328a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f18319b = constraintWidget;
    }

    private void o(int i10, int i11) {
        int i12 = this.f18318a;
        if (i12 == 0) {
            this.f18322e.e(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f18322e.e(Math.min(g(this.f18322e.f18365m, i10), i11));
            return;
        }
        if (i12 == 2) {
            ConstraintWidget constraintWidgetU = this.f18319b.U();
            if (constraintWidgetU != null) {
                f fVar = (i10 == 0 ? constraintWidgetU.f18260e : constraintWidgetU.f18262f).f18322e;
                if (fVar.f18315j) {
                    ConstraintWidget constraintWidget = this.f18319b;
                    this.f18322e.e(g((int) ((fVar.f18312g * (i10 == 0 ? constraintWidget.B : constraintWidget.E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        ConstraintWidget constraintWidget2 = this.f18319b;
        WidgetRun widgetRun = constraintWidget2.f18260e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun.f18321d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2 && widgetRun.f18318a == 3) {
            m mVar = constraintWidget2.f18262f;
            if (mVar.f18321d == dimensionBehaviour2 && mVar.f18318a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            widgetRun = constraintWidget2.f18262f;
        }
        if (widgetRun.f18322e.f18315j) {
            float fA = constraintWidget2.A();
            this.f18322e.e(i10 == 1 ? (int) ((widgetRun.f18322e.f18312g / fA) + 0.5f) : (int) ((fA * widgetRun.f18322e.f18312g) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
    }

    protected final void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10) {
        dependencyNode.f18317l.add(dependencyNode2);
        dependencyNode.f18311f = i10;
        dependencyNode2.f18316k.add(dependencyNode);
    }

    protected final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10, f fVar) {
        dependencyNode.f18317l.add(dependencyNode2);
        dependencyNode.f18317l.add(this.f18322e);
        dependencyNode.f18313h = i10;
        dependencyNode.f18314i = fVar;
        dependencyNode2.f18316k.add(dependencyNode);
        fVar.f18316k.add(dependencyNode);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        int iMax;
        if (i11 == 0) {
            ConstraintWidget constraintWidget = this.f18319b;
            int i12 = constraintWidget.A;
            iMax = Math.max(constraintWidget.f18302z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f18319b;
            int i13 = constraintWidget2.D;
            iMax = Math.max(constraintWidget2.C, i10);
            if (i13 > 0) {
                iMax = Math.min(i13, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        }
        return iMax;
    }

    protected final DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f18222f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f18220d;
        int i10 = a.f18328a[constraintAnchor2.f18221e.ordinal()];
        if (i10 == 1) {
            return constraintWidget.f18260e.f18325h;
        }
        if (i10 == 2) {
            return constraintWidget.f18260e.f18326i;
        }
        if (i10 == 3) {
            return constraintWidget.f18262f.f18325h;
        }
        if (i10 == 4) {
            return constraintWidget.f18262f.f18387k;
        }
        if (i10 != 5) {
            return null;
        }
        return constraintWidget.f18262f.f18326i;
    }

    protected final DependencyNode i(ConstraintAnchor constraintAnchor, int i10) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f18222f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f18220d;
        WidgetRun widgetRun = i10 == 0 ? constraintWidget.f18260e : constraintWidget.f18262f;
        int i11 = a.f18328a[constraintAnchor2.f18221e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.f18326i;
        }
        return widgetRun.f18325h;
    }

    public long j() {
        f fVar = this.f18322e;
        if (fVar.f18315j) {
            return fVar.f18312g;
        }
        return 0L;
    }

    public boolean k() {
        int size = this.f18325h.f18317l.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f18325h.f18317l.get(i11).f18309d != this) {
                i10++;
            }
        }
        int size2 = this.f18326i.f18317l.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (this.f18326i.f18317l.get(i12).f18309d != this) {
                i10++;
            }
        }
        return i10 >= 2;
    }

    public boolean l() {
        return this.f18322e.f18315j;
    }

    public boolean m() {
        return this.f18324g;
    }

    abstract void n();

    abstract boolean p();

    protected void q(d dVar, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        DependencyNode dependencyNodeH = h(constraintAnchor);
        DependencyNode dependencyNodeH2 = h(constraintAnchor2);
        if (dependencyNodeH.f18315j && dependencyNodeH2.f18315j) {
            int iG = dependencyNodeH.f18312g + constraintAnchor.g();
            int iG2 = dependencyNodeH2.f18312g - constraintAnchor2.g();
            int i11 = iG2 - iG;
            if (!this.f18322e.f18315j && this.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                o(i10, i11);
            }
            f fVar = this.f18322e;
            if (fVar.f18315j) {
                if (fVar.f18312g == i11) {
                    this.f18325h.e(iG);
                    this.f18326i.e(iG2);
                    return;
                }
                ConstraintWidget constraintWidget = this.f18319b;
                float fE = i10 == 0 ? constraintWidget.E() : constraintWidget.d0();
                if (dependencyNodeH == dependencyNodeH2) {
                    iG = dependencyNodeH.f18312g;
                    iG2 = dependencyNodeH2.f18312g;
                    fE = 0.5f;
                }
                this.f18325h.e((int) (iG + 0.5f + (((iG2 - iG) - this.f18322e.f18312g) * fE)));
                this.f18326i.e(this.f18325h.f18312g + this.f18322e.f18312g);
            }
        }
    }

    protected void r(d dVar) {
    }

    protected void s(d dVar) {
    }

    public long t(int i10) {
        int i11;
        f fVar = this.f18322e;
        if (!fVar.f18315j) {
            return 0L;
        }
        long j10 = fVar.f18312g;
        if (k()) {
            i11 = this.f18325h.f18311f - this.f18326i.f18311f;
        } else {
            if (i10 != 0) {
                return j10 - ((long) this.f18326i.f18311f);
            }
            i11 = this.f18325h.f18311f;
        }
        return j10 + ((long) i11);
    }
}
