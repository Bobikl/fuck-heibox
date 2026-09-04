package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: compiled from: VerticalWidgetRun.java */
/* JADX INFO: loaded from: classes.dex */
public class m extends WidgetRun {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DependencyNode f18387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    f f18388l;

    /* JADX INFO: compiled from: VerticalWidgetRun.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18389a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f18389a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18389a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18389a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public m(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f18387k = dependencyNode;
        this.f18388l = null;
        this.f18325h.f18310e = DependencyNode.Type.TOP;
        this.f18326i.f18310e = DependencyNode.Type.BOTTOM;
        dependencyNode.f18310e = DependencyNode.Type.BASELINE;
        this.f18323f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        float f10;
        float fA;
        float fA2;
        int i10;
        int i11 = a.f18389a[this.f18327j.ordinal()];
        if (i11 == 1) {
            s(dVar);
        } else if (i11 == 2) {
            r(dVar);
        } else if (i11 == 3) {
            ConstraintWidget constraintWidget = this.f18319b;
            q(dVar, constraintWidget.R, constraintWidget.T, 1);
            return;
        }
        f fVar = this.f18322e;
        if (fVar.f18308c && !fVar.f18315j && this.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f18319b;
            int i12 = constraintWidget2.f18298x;
            if (i12 == 2) {
                ConstraintWidget constraintWidgetU = constraintWidget2.U();
                if (constraintWidgetU != null) {
                    f fVar2 = constraintWidgetU.f18262f.f18322e;
                    if (fVar2.f18315j) {
                        this.f18322e.e((int) ((fVar2.f18312g * this.f18319b.E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && constraintWidget2.f18260e.f18322e.f18315j) {
                int iB = constraintWidget2.B();
                if (iB != -1) {
                    if (iB == 0) {
                        ConstraintWidget constraintWidget3 = this.f18319b;
                        fA2 = constraintWidget3.f18260e.f18322e.f18312g * constraintWidget3.A();
                        i10 = (int) (fA2 + 0.5f);
                    } else if (iB != 1) {
                        i10 = 0;
                    } else {
                        ConstraintWidget constraintWidget4 = this.f18319b;
                        f10 = constraintWidget4.f18260e.f18322e.f18312g;
                        fA = constraintWidget4.A();
                    }
                    this.f18322e.e(i10);
                } else {
                    ConstraintWidget constraintWidget5 = this.f18319b;
                    f10 = constraintWidget5.f18260e.f18322e.f18312g;
                    fA = constraintWidget5.A();
                }
                fA2 = f10 / fA;
                i10 = (int) (fA2 + 0.5f);
                this.f18322e.e(i10);
            }
        }
        DependencyNode dependencyNode = this.f18325h;
        if (dependencyNode.f18308c) {
            DependencyNode dependencyNode2 = this.f18326i;
            if (dependencyNode2.f18308c) {
                if (dependencyNode.f18315j && dependencyNode2.f18315j && this.f18322e.f18315j) {
                    return;
                }
                if (!this.f18322e.f18315j && this.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget6 = this.f18319b;
                    if (constraintWidget6.f18296w == 0 && !constraintWidget6.z0()) {
                        DependencyNode dependencyNode3 = this.f18325h.f18317l.get(0);
                        DependencyNode dependencyNode4 = this.f18326i.f18317l.get(0);
                        int i13 = dependencyNode3.f18312g;
                        DependencyNode dependencyNode5 = this.f18325h;
                        int i14 = i13 + dependencyNode5.f18311f;
                        int i15 = dependencyNode4.f18312g + this.f18326i.f18311f;
                        dependencyNode5.e(i14);
                        this.f18326i.e(i15);
                        this.f18322e.e(i15 - i14);
                        return;
                    }
                }
                if (!this.f18322e.f18315j && this.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f18318a == 1 && this.f18325h.f18317l.size() > 0 && this.f18326i.f18317l.size() > 0) {
                    DependencyNode dependencyNode6 = this.f18325h.f18317l.get(0);
                    int i16 = (this.f18326i.f18317l.get(0).f18312g + this.f18326i.f18311f) - (dependencyNode6.f18312g + this.f18325h.f18311f);
                    f fVar3 = this.f18322e;
                    int i17 = fVar3.f18365m;
                    if (i16 < i17) {
                        fVar3.e(i16);
                    } else {
                        fVar3.e(i17);
                    }
                }
                if (this.f18322e.f18315j && this.f18325h.f18317l.size() > 0 && this.f18326i.f18317l.size() > 0) {
                    DependencyNode dependencyNode7 = this.f18325h.f18317l.get(0);
                    DependencyNode dependencyNode8 = this.f18326i.f18317l.get(0);
                    int i18 = dependencyNode7.f18312g + this.f18325h.f18311f;
                    int i19 = dependencyNode8.f18312g + this.f18326i.f18311f;
                    float fD0 = this.f18319b.d0();
                    if (dependencyNode7 == dependencyNode8) {
                        i18 = dependencyNode7.f18312g;
                        i19 = dependencyNode8.f18312g;
                        fD0 = 0.5f;
                    }
                    this.f18325h.e((int) (i18 + 0.5f + (((i19 - i18) - this.f18322e.f18312g) * fD0)));
                    this.f18326i.e(this.f18325h.f18312g + this.f18322e.f18312g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        ConstraintWidget constraintWidgetU;
        ConstraintWidget constraintWidgetU2;
        ConstraintWidget constraintWidget = this.f18319b;
        if (constraintWidget.f18252a) {
            this.f18322e.e(constraintWidget.D());
        }
        if (!this.f18322e.f18315j) {
            this.f18321d = this.f18319b.g0();
            if (this.f18319b.n0()) {
                this.f18388l = new androidx.constraintlayout.core.widgets.analyzer.a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f18321d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidgetU2 = this.f18319b.U()) != null && constraintWidgetU2.g0() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int iD = (constraintWidgetU2.D() - this.f18319b.R.g()) - this.f18319b.T.g();
                    b(this.f18325h, constraintWidgetU2.f18262f.f18325h, this.f18319b.R.g());
                    b(this.f18326i, constraintWidgetU2.f18262f.f18326i, -this.f18319b.T.g());
                    this.f18322e.e(iD);
                    return;
                }
                if (this.f18321d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f18322e.e(this.f18319b.D());
                }
            }
        } else if (this.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidgetU = this.f18319b.U()) != null && constraintWidgetU.g0() == ConstraintWidget.DimensionBehaviour.FIXED) {
            b(this.f18325h, constraintWidgetU.f18262f.f18325h, this.f18319b.R.g());
            b(this.f18326i, constraintWidgetU.f18262f.f18326i, -this.f18319b.T.g());
            return;
        }
        f fVar = this.f18322e;
        boolean z10 = fVar.f18315j;
        if (z10) {
            ConstraintWidget constraintWidget2 = this.f18319b;
            if (constraintWidget2.f18252a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.Y;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f18222f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f18222f != null) {
                    if (constraintWidget2.z0()) {
                        this.f18325h.f18311f = this.f18319b.Y[2].g();
                        this.f18326i.f18311f = -this.f18319b.Y[3].g();
                    } else {
                        DependencyNode dependencyNodeH = h(this.f18319b.Y[2]);
                        if (dependencyNodeH != null) {
                            b(this.f18325h, dependencyNodeH, this.f18319b.Y[2].g());
                        }
                        DependencyNode dependencyNodeH2 = h(this.f18319b.Y[3]);
                        if (dependencyNodeH2 != null) {
                            b(this.f18326i, dependencyNodeH2, -this.f18319b.Y[3].g());
                        }
                        this.f18325h.f18307b = true;
                        this.f18326i.f18307b = true;
                    }
                    if (this.f18319b.n0()) {
                        b(this.f18387k, this.f18325h, this.f18319b.t());
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        b(this.f18325h, dependencyNodeH3, this.f18319b.Y[2].g());
                        b(this.f18326i, this.f18325h, this.f18322e.f18312g);
                        if (this.f18319b.n0()) {
                            b(this.f18387k, this.f18325h, this.f18319b.t());
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f18222f != null) {
                    DependencyNode dependencyNodeH4 = h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        b(this.f18326i, dependencyNodeH4, -this.f18319b.Y[3].g());
                        b(this.f18325h, this.f18326i, -this.f18322e.f18312g);
                    }
                    if (this.f18319b.n0()) {
                        b(this.f18387k, this.f18325h, this.f18319b.t());
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f18222f != null) {
                    DependencyNode dependencyNodeH5 = h(constraintAnchor4);
                    if (dependencyNodeH5 != null) {
                        b(this.f18387k, dependencyNodeH5, 0);
                        b(this.f18325h, this.f18387k, -this.f18319b.t());
                        b(this.f18326i, this.f18325h, this.f18322e.f18312g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof androidx.constraintlayout.core.widgets.g) || constraintWidget2.U() == null || this.f18319b.r(ConstraintAnchor.Type.CENTER).f18222f != null) {
                    return;
                }
                b(this.f18325h, this.f18319b.U().f18262f.f18325h, this.f18319b.m0());
                b(this.f18326i, this.f18325h, this.f18322e.f18312g);
                if (this.f18319b.n0()) {
                    b(this.f18387k, this.f18325h, this.f18319b.t());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f18321d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            fVar.b(this);
        } else {
            ConstraintWidget constraintWidget3 = this.f18319b;
            int i10 = constraintWidget3.f18298x;
            if (i10 == 2) {
                ConstraintWidget constraintWidgetU3 = constraintWidget3.U();
                if (constraintWidgetU3 != null) {
                    f fVar2 = constraintWidgetU3.f18262f.f18322e;
                    this.f18322e.f18317l.add(fVar2);
                    fVar2.f18316k.add(this.f18322e);
                    f fVar3 = this.f18322e;
                    fVar3.f18307b = true;
                    fVar3.f18316k.add(this.f18325h);
                    this.f18322e.f18316k.add(this.f18326i);
                }
            } else if (i10 == 3 && !constraintWidget3.z0()) {
                ConstraintWidget constraintWidget4 = this.f18319b;
                if (constraintWidget4.f18296w != 3) {
                    f fVar4 = constraintWidget4.f18260e.f18322e;
                    this.f18322e.f18317l.add(fVar4);
                    fVar4.f18316k.add(this.f18322e);
                    f fVar5 = this.f18322e;
                    fVar5.f18307b = true;
                    fVar5.f18316k.add(this.f18325h);
                    this.f18322e.f18316k.add(this.f18326i);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.f18319b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.Y;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f18222f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f18222f != null) {
            if (constraintWidget5.z0()) {
                this.f18325h.f18311f = this.f18319b.Y[2].g();
                this.f18326i.f18311f = -this.f18319b.Y[3].g();
            } else {
                DependencyNode dependencyNodeH6 = h(this.f18319b.Y[2]);
                DependencyNode dependencyNodeH7 = h(this.f18319b.Y[3]);
                if (dependencyNodeH6 != null) {
                    dependencyNodeH6.b(this);
                }
                if (dependencyNodeH7 != null) {
                    dependencyNodeH7.b(this);
                }
                this.f18327j = WidgetRun.RunType.CENTER;
            }
            if (this.f18319b.n0()) {
                c(this.f18387k, this.f18325h, 1, this.f18388l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode dependencyNodeH8 = h(constraintAnchor5);
            if (dependencyNodeH8 != null) {
                b(this.f18325h, dependencyNodeH8, this.f18319b.Y[2].g());
                c(this.f18326i, this.f18325h, 1, this.f18322e);
                if (this.f18319b.n0()) {
                    c(this.f18387k, this.f18325h, 1, this.f18388l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f18321d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.f18319b.A() > 0.0f) {
                    k kVar = this.f18319b.f18260e;
                    if (kVar.f18321d == dimensionBehaviour3) {
                        kVar.f18322e.f18316k.add(this.f18322e);
                        this.f18322e.f18317l.add(this.f18319b.f18260e.f18322e);
                        this.f18322e.f18306a = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f18222f != null) {
                DependencyNode dependencyNodeH9 = h(constraintAnchor7);
                if (dependencyNodeH9 != null) {
                    b(this.f18326i, dependencyNodeH9, -this.f18319b.Y[3].g());
                    c(this.f18325h, this.f18326i, -1, this.f18322e);
                    if (this.f18319b.n0()) {
                        c(this.f18387k, this.f18325h, 1, this.f18388l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f18222f != null) {
                    DependencyNode dependencyNodeH10 = h(constraintAnchor8);
                    if (dependencyNodeH10 != null) {
                        b(this.f18387k, dependencyNodeH10, 0);
                        c(this.f18325h, this.f18387k, -1, this.f18388l);
                        c(this.f18326i, this.f18325h, 1, this.f18322e);
                    }
                } else if (!(constraintWidget5 instanceof androidx.constraintlayout.core.widgets.g) && constraintWidget5.U() != null) {
                    b(this.f18325h, this.f18319b.U().f18262f.f18325h, this.f18319b.m0());
                    c(this.f18326i, this.f18325h, 1, this.f18322e);
                    if (this.f18319b.n0()) {
                        c(this.f18387k, this.f18325h, 1, this.f18388l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f18321d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.f18319b.A() > 0.0f) {
                        k kVar2 = this.f18319b.f18260e;
                        if (kVar2.f18321d == dimensionBehaviour5) {
                            kVar2.f18322e.f18316k.add(this.f18322e);
                            this.f18322e.f18317l.add(this.f18319b.f18260e.f18322e);
                            this.f18322e.f18306a = this;
                        }
                    }
                }
            }
        }
        if (this.f18322e.f18317l.size() == 0) {
            this.f18322e.f18308c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode = this.f18325h;
        if (dependencyNode.f18315j) {
            this.f18319b.a2(dependencyNode.f18312g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.f18320c = null;
        this.f18325h.c();
        this.f18326i.c();
        this.f18387k.c();
        this.f18322e.c();
        this.f18324g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void n() {
        this.f18324g = false;
        this.f18325h.c();
        this.f18325h.f18315j = false;
        this.f18326i.c();
        this.f18326i.f18315j = false;
        this.f18387k.c();
        this.f18387k.f18315j = false;
        this.f18322e.f18315j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean p() {
        return this.f18321d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f18319b.f18298x == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f18319b.y();
    }
}
