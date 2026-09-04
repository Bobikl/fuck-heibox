package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: compiled from: HorizontalWidgetRun.java */
/* JADX INFO: loaded from: classes.dex */
public class k extends WidgetRun {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f18374k = new int[2];

    /* JADX INFO: compiled from: HorizontalWidgetRun.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18375a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f18375a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18375a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18375a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f18325h.f18310e = DependencyNode.Type.LEFT;
        this.f18326i.f18310e = DependencyNode.Type.RIGHT;
        this.f18323f = 0;
    }

    private void u(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02de  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ed  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        int iG;
        int i10;
        int iG2;
        float f10;
        float fA;
        float fA2;
        int i11;
        int i12 = a.f18375a[this.f18327j.ordinal()];
        if (i12 == 1) {
            s(dVar);
        } else if (i12 == 2) {
            r(dVar);
        } else if (i12 == 3) {
            ConstraintWidget constraintWidget = this.f18319b;
            q(dVar, constraintWidget.Q, constraintWidget.S, 0);
            return;
        }
        if (!this.f18322e.f18315j && this.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f18319b;
            int i13 = constraintWidget2.f18296w;
            if (i13 == 2) {
                ConstraintWidget constraintWidgetU = constraintWidget2.U();
                if (constraintWidgetU != null) {
                    f fVar = constraintWidgetU.f18260e.f18322e;
                    if (fVar.f18315j) {
                        this.f18322e.e((int) ((fVar.f18312g * this.f18319b.B) + 0.5f));
                    }
                }
            } else if (i13 == 3) {
                int i14 = constraintWidget2.f18298x;
                if (i14 == 0 || i14 == 3) {
                    m mVar = constraintWidget2.f18262f;
                    DependencyNode dependencyNode = mVar.f18325h;
                    DependencyNode dependencyNode2 = mVar.f18326i;
                    boolean z10 = constraintWidget2.Q.f18222f != null;
                    boolean z11 = constraintWidget2.R.f18222f != null;
                    boolean z12 = constraintWidget2.S.f18222f != null;
                    boolean z13 = constraintWidget2.T.f18222f != null;
                    int iB = constraintWidget2.B();
                    if (z10 && z11 && z12 && z13) {
                        float fA3 = this.f18319b.A();
                        if (dependencyNode.f18315j && dependencyNode2.f18315j) {
                            DependencyNode dependencyNode3 = this.f18325h;
                            if (dependencyNode3.f18308c && this.f18326i.f18308c) {
                                u(f18374k, dependencyNode3.f18317l.get(0).f18312g + this.f18325h.f18311f, this.f18326i.f18317l.get(0).f18312g - this.f18326i.f18311f, dependencyNode.f18312g + dependencyNode.f18311f, dependencyNode2.f18312g - dependencyNode2.f18311f, fA3, iB);
                                this.f18322e.e(f18374k[0]);
                                this.f18319b.f18262f.f18322e.e(f18374k[1]);
                                return;
                            }
                            return;
                        }
                        DependencyNode dependencyNode4 = this.f18325h;
                        if (dependencyNode4.f18315j) {
                            DependencyNode dependencyNode5 = this.f18326i;
                            if (dependencyNode5.f18315j) {
                                if (!dependencyNode.f18308c || !dependencyNode2.f18308c) {
                                    return;
                                }
                                u(f18374k, dependencyNode4.f18312g + dependencyNode4.f18311f, dependencyNode5.f18312g - dependencyNode5.f18311f, dependencyNode.f18317l.get(0).f18312g + dependencyNode.f18311f, dependencyNode2.f18317l.get(0).f18312g - dependencyNode2.f18311f, fA3, iB);
                                this.f18322e.e(f18374k[0]);
                                this.f18319b.f18262f.f18322e.e(f18374k[1]);
                            }
                        }
                        DependencyNode dependencyNode6 = this.f18325h;
                        if (!dependencyNode6.f18308c || !this.f18326i.f18308c || !dependencyNode.f18308c || !dependencyNode2.f18308c) {
                            return;
                        }
                        u(f18374k, dependencyNode6.f18317l.get(0).f18312g + this.f18325h.f18311f, this.f18326i.f18317l.get(0).f18312g - this.f18326i.f18311f, dependencyNode.f18317l.get(0).f18312g + dependencyNode.f18311f, dependencyNode2.f18317l.get(0).f18312g - dependencyNode2.f18311f, fA3, iB);
                        this.f18322e.e(f18374k[0]);
                        this.f18319b.f18262f.f18322e.e(f18374k[1]);
                    } else if (z10 && z12) {
                        if (!this.f18325h.f18308c || !this.f18326i.f18308c) {
                            return;
                        }
                        float fA4 = this.f18319b.A();
                        int i15 = this.f18325h.f18317l.get(0).f18312g + this.f18325h.f18311f;
                        int i16 = this.f18326i.f18317l.get(0).f18312g - this.f18326i.f18311f;
                        if (iB == -1 || iB == 0) {
                            int iG3 = g(i16 - i15, 0);
                            int i17 = (int) ((iG3 * fA4) + 0.5f);
                            int iG4 = g(i17, 1);
                            if (i17 != iG4) {
                                iG3 = (int) ((iG4 / fA4) + 0.5f);
                            }
                            this.f18322e.e(iG3);
                            this.f18319b.f18262f.f18322e.e(iG4);
                        } else if (iB == 1) {
                            int iG5 = g(i16 - i15, 0);
                            int i18 = (int) ((iG5 / fA4) + 0.5f);
                            int iG6 = g(i18, 1);
                            if (i18 != iG6) {
                                iG5 = (int) ((iG6 * fA4) + 0.5f);
                            }
                            this.f18322e.e(iG5);
                            this.f18319b.f18262f.f18322e.e(iG6);
                        }
                    } else if (z11 && z13) {
                        if (!dependencyNode.f18308c || !dependencyNode2.f18308c) {
                            return;
                        }
                        float fA5 = this.f18319b.A();
                        int i19 = dependencyNode.f18317l.get(0).f18312g + dependencyNode.f18311f;
                        int i20 = dependencyNode2.f18317l.get(0).f18312g - dependencyNode2.f18311f;
                        if (iB == -1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / fA5) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * fA5) + 0.5f);
                            }
                            this.f18322e.e(iG2);
                            this.f18319b.f18262f.f18322e.e(iG);
                        } else if (iB == 0) {
                            int iG7 = g(i20 - i19, 1);
                            int i21 = (int) ((iG7 * fA5) + 0.5f);
                            int iG8 = g(i21, 0);
                            if (i21 != iG8) {
                                iG7 = (int) ((iG8 / fA5) + 0.5f);
                            }
                            this.f18322e.e(iG8);
                            this.f18319b.f18262f.f18322e.e(iG7);
                        } else if (iB == 1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / fA5) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * fA5) + 0.5f);
                            }
                            this.f18322e.e(iG2);
                            this.f18319b.f18262f.f18322e.e(iG);
                        }
                    }
                } else {
                    int iB2 = constraintWidget2.B();
                    if (iB2 != -1) {
                        if (iB2 == 0) {
                            ConstraintWidget constraintWidget3 = this.f18319b;
                            fA2 = constraintWidget3.f18262f.f18322e.f18312g / constraintWidget3.A();
                            i11 = (int) (fA2 + 0.5f);
                        } else if (iB2 != 1) {
                            i11 = 0;
                        } else {
                            ConstraintWidget constraintWidget4 = this.f18319b;
                            f10 = constraintWidget4.f18262f.f18322e.f18312g;
                            fA = constraintWidget4.A();
                        }
                        this.f18322e.e(i11);
                    } else {
                        ConstraintWidget constraintWidget5 = this.f18319b;
                        f10 = constraintWidget5.f18262f.f18322e.f18312g;
                        fA = constraintWidget5.A();
                    }
                    fA2 = f10 * fA;
                    i11 = (int) (fA2 + 0.5f);
                    this.f18322e.e(i11);
                }
            }
        }
        DependencyNode dependencyNode7 = this.f18325h;
        if (dependencyNode7.f18308c) {
            DependencyNode dependencyNode8 = this.f18326i;
            if (dependencyNode8.f18308c) {
                if (dependencyNode7.f18315j && dependencyNode8.f18315j && this.f18322e.f18315j) {
                    return;
                }
                if (!this.f18322e.f18315j && this.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget6 = this.f18319b;
                    if (constraintWidget6.f18296w == 0 && !constraintWidget6.x0()) {
                        DependencyNode dependencyNode9 = this.f18325h.f18317l.get(0);
                        DependencyNode dependencyNode10 = this.f18326i.f18317l.get(0);
                        int i22 = dependencyNode9.f18312g;
                        DependencyNode dependencyNode11 = this.f18325h;
                        int i23 = i22 + dependencyNode11.f18311f;
                        int i24 = dependencyNode10.f18312g + this.f18326i.f18311f;
                        dependencyNode11.e(i23);
                        this.f18326i.e(i24);
                        this.f18322e.e(i24 - i23);
                        return;
                    }
                }
                if (!this.f18322e.f18315j && this.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f18318a == 1 && this.f18325h.f18317l.size() > 0 && this.f18326i.f18317l.size() > 0) {
                    int iMin = Math.min((this.f18326i.f18317l.get(0).f18312g + this.f18326i.f18311f) - (this.f18325h.f18317l.get(0).f18312g + this.f18325h.f18311f), this.f18322e.f18365m);
                    ConstraintWidget constraintWidget7 = this.f18319b;
                    int i25 = constraintWidget7.A;
                    int iMax = Math.max(constraintWidget7.f18302z, iMin);
                    if (i25 > 0) {
                        iMax = Math.min(i25, iMax);
                    }
                    this.f18322e.e(iMax);
                }
                if (this.f18322e.f18315j) {
                    DependencyNode dependencyNode12 = this.f18325h.f18317l.get(0);
                    DependencyNode dependencyNode13 = this.f18326i.f18317l.get(0);
                    int i26 = dependencyNode12.f18312g + this.f18325h.f18311f;
                    int i27 = dependencyNode13.f18312g + this.f18326i.f18311f;
                    float fE = this.f18319b.E();
                    if (dependencyNode12 == dependencyNode13) {
                        i26 = dependencyNode12.f18312g;
                        i27 = dependencyNode13.f18312g;
                        fE = 0.5f;
                    }
                    this.f18325h.e((int) (i26 + 0.5f + (((i27 - i26) - this.f18322e.f18312g) * fE)));
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
            this.f18322e.e(constraintWidget.j0());
        }
        if (this.f18322e.f18315j) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f18321d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour == dimensionBehaviour2 && (constraintWidgetU = this.f18319b.U()) != null && (constraintWidgetU.H() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetU.H() == dimensionBehaviour2)) {
                b(this.f18325h, constraintWidgetU.f18260e.f18325h, this.f18319b.Q.g());
                b(this.f18326i, constraintWidgetU.f18260e.f18326i, -this.f18319b.S.g());
                return;
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourH = this.f18319b.H();
            this.f18321d = dimensionBehaviourH;
            if (dimensionBehaviourH != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviourH == dimensionBehaviour3 && (constraintWidgetU2 = this.f18319b.U()) != null && (constraintWidgetU2.H() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetU2.H() == dimensionBehaviour3)) {
                    int iJ0 = (constraintWidgetU2.j0() - this.f18319b.Q.g()) - this.f18319b.S.g();
                    b(this.f18325h, constraintWidgetU2.f18260e.f18325h, this.f18319b.Q.g());
                    b(this.f18326i, constraintWidgetU2.f18260e.f18326i, -this.f18319b.S.g());
                    this.f18322e.e(iJ0);
                    return;
                }
                if (this.f18321d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f18322e.e(this.f18319b.j0());
                }
            }
        }
        f fVar = this.f18322e;
        if (fVar.f18315j) {
            ConstraintWidget constraintWidget2 = this.f18319b;
            if (constraintWidget2.f18252a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.Y;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f18222f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f18222f != null) {
                    if (constraintWidget2.x0()) {
                        this.f18325h.f18311f = this.f18319b.Y[0].g();
                        this.f18326i.f18311f = -this.f18319b.Y[1].g();
                        return;
                    }
                    DependencyNode dependencyNodeH = h(this.f18319b.Y[0]);
                    if (dependencyNodeH != null) {
                        b(this.f18325h, dependencyNodeH, this.f18319b.Y[0].g());
                    }
                    DependencyNode dependencyNodeH2 = h(this.f18319b.Y[1]);
                    if (dependencyNodeH2 != null) {
                        b(this.f18326i, dependencyNodeH2, -this.f18319b.Y[1].g());
                    }
                    this.f18325h.f18307b = true;
                    this.f18326i.f18307b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        b(this.f18325h, dependencyNodeH3, this.f18319b.Y[0].g());
                        b(this.f18326i, this.f18325h, this.f18322e.f18312g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f18222f != null) {
                    DependencyNode dependencyNodeH4 = h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        b(this.f18326i, dependencyNodeH4, -this.f18319b.Y[1].g());
                        b(this.f18325h, this.f18326i, -this.f18322e.f18312g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof androidx.constraintlayout.core.widgets.g) || constraintWidget2.U() == null || this.f18319b.r(ConstraintAnchor.Type.CENTER).f18222f != null) {
                    return;
                }
                b(this.f18325h, this.f18319b.U().f18260e.f18325h, this.f18319b.l0());
                b(this.f18326i, this.f18325h, this.f18322e.f18312g);
                return;
            }
        }
        if (this.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f18319b;
            int i10 = constraintWidget3.f18296w;
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
            } else if (i10 == 3) {
                if (constraintWidget3.f18298x == 3) {
                    this.f18325h.f18306a = this;
                    this.f18326i.f18306a = this;
                    m mVar = constraintWidget3.f18262f;
                    mVar.f18325h.f18306a = this;
                    mVar.f18326i.f18306a = this;
                    fVar.f18306a = this;
                    if (constraintWidget3.z0()) {
                        this.f18322e.f18317l.add(this.f18319b.f18262f.f18322e);
                        this.f18319b.f18262f.f18322e.f18316k.add(this.f18322e);
                        m mVar2 = this.f18319b.f18262f;
                        mVar2.f18322e.f18306a = this;
                        this.f18322e.f18317l.add(mVar2.f18325h);
                        this.f18322e.f18317l.add(this.f18319b.f18262f.f18326i);
                        this.f18319b.f18262f.f18325h.f18316k.add(this.f18322e);
                        this.f18319b.f18262f.f18326i.f18316k.add(this.f18322e);
                    } else if (this.f18319b.x0()) {
                        this.f18319b.f18262f.f18322e.f18317l.add(this.f18322e);
                        this.f18322e.f18316k.add(this.f18319b.f18262f.f18322e);
                    } else {
                        this.f18319b.f18262f.f18322e.f18317l.add(this.f18322e);
                    }
                } else {
                    f fVar4 = constraintWidget3.f18262f.f18322e;
                    fVar.f18317l.add(fVar4);
                    fVar4.f18316k.add(this.f18322e);
                    this.f18319b.f18262f.f18325h.f18316k.add(this.f18322e);
                    this.f18319b.f18262f.f18326i.f18316k.add(this.f18322e);
                    f fVar5 = this.f18322e;
                    fVar5.f18307b = true;
                    fVar5.f18316k.add(this.f18325h);
                    this.f18322e.f18316k.add(this.f18326i);
                    this.f18325h.f18317l.add(this.f18322e);
                    this.f18326i.f18317l.add(this.f18322e);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f18319b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.Y;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f18222f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f18222f != null) {
            if (constraintWidget4.x0()) {
                this.f18325h.f18311f = this.f18319b.Y[0].g();
                this.f18326i.f18311f = -this.f18319b.Y[1].g();
                return;
            }
            DependencyNode dependencyNodeH5 = h(this.f18319b.Y[0]);
            DependencyNode dependencyNodeH6 = h(this.f18319b.Y[1]);
            if (dependencyNodeH5 != null) {
                dependencyNodeH5.b(this);
            }
            if (dependencyNodeH6 != null) {
                dependencyNodeH6.b(this);
            }
            this.f18327j = WidgetRun.RunType.CENTER;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode dependencyNodeH7 = h(constraintAnchor4);
            if (dependencyNodeH7 != null) {
                b(this.f18325h, dependencyNodeH7, this.f18319b.Y[0].g());
                c(this.f18326i, this.f18325h, 1, this.f18322e);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f18222f != null) {
            DependencyNode dependencyNodeH8 = h(constraintAnchor6);
            if (dependencyNodeH8 != null) {
                b(this.f18326i, dependencyNodeH8, -this.f18319b.Y[1].g());
                c(this.f18325h, this.f18326i, -1, this.f18322e);
                return;
            }
            return;
        }
        if ((constraintWidget4 instanceof androidx.constraintlayout.core.widgets.g) || constraintWidget4.U() == null) {
            return;
        }
        b(this.f18325h, this.f18319b.U().f18260e.f18325h, this.f18319b.l0());
        c(this.f18326i, this.f18325h, 1, this.f18322e);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode = this.f18325h;
        if (dependencyNode.f18315j) {
            this.f18319b.Z1(dependencyNode.f18312g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.f18320c = null;
        this.f18325h.c();
        this.f18326i.c();
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
        this.f18322e.f18315j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean p() {
        return this.f18321d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f18319b.f18296w == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f18319b.y();
    }
}
