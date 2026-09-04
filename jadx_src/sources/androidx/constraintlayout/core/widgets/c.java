package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* JADX INFO: compiled from: ChainHead.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ConstraintWidget f18408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ConstraintWidget f18409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ConstraintWidget f18410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ConstraintWidget f18411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ConstraintWidget f18412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ConstraintWidget f18413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected ConstraintWidget f18414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList<ConstraintWidget> f18415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f18416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f18417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f18418k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f18419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f18420m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f18421n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f18422o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18423p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f18425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f18426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f18427t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f18428u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f18429v;

    public c(ConstraintWidget constraintWidget, int i10, boolean z10) {
        this.f18408a = constraintWidget;
        this.f18423p = i10;
        this.f18424q = z10;
    }

    private void b() {
        int i10 = this.f18423p * 2;
        ConstraintWidget constraintWidget = this.f18408a;
        this.f18422o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z10 = false;
        while (!z10) {
            this.f18416i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.O0;
            int i11 = this.f18423p;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i11] = null;
            constraintWidget.N0[i11] = null;
            if (constraintWidget.i0() != 8) {
                this.f18419l++;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourZ = constraintWidget.z(this.f18423p);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourZ != dimensionBehaviour) {
                    this.f18420m += constraintWidget.M(this.f18423p);
                }
                int iG = this.f18420m + constraintWidget.Y[i10].g();
                this.f18420m = iG;
                int i12 = i10 + 1;
                this.f18420m = iG + constraintWidget.Y[i12].g();
                int iG2 = this.f18421n + constraintWidget.Y[i10].g();
                this.f18421n = iG2;
                this.f18421n = iG2 + constraintWidget.Y[i12].g();
                if (this.f18409b == null) {
                    this.f18409b = constraintWidget;
                }
                this.f18411d = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f18255b0;
                int i13 = this.f18423p;
                if (dimensionBehaviourArr[i13] == dimensionBehaviour) {
                    int i14 = constraintWidget.f18300y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f18417j++;
                        float f10 = constraintWidget.M0[i13];
                        if (f10 > 0.0f) {
                            this.f18418k += f10;
                        }
                        if (k(constraintWidget, i13)) {
                            if (f10 < 0.0f) {
                                this.f18425r = true;
                            } else {
                                this.f18426s = true;
                            }
                            if (this.f18415h == null) {
                                this.f18415h = new ArrayList<>();
                            }
                            this.f18415h.add(constraintWidget);
                        }
                        if (this.f18413f == null) {
                            this.f18413f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.f18414g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.N0[this.f18423p] = constraintWidget;
                        }
                        this.f18414g = constraintWidget;
                    }
                    if (this.f18423p == 0) {
                        if (constraintWidget.f18296w != 0 || constraintWidget.f18302z != 0 || constraintWidget.A != 0) {
                            this.f18422o = false;
                        }
                    } else if (constraintWidget.f18298x != 0 || constraintWidget.C != 0 || constraintWidget.D != 0) {
                        this.f18422o = false;
                    }
                    if (constraintWidget.f18263f0 != 0.0f) {
                        this.f18422o = false;
                        this.f18428u = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.O0[this.f18423p] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.Y[i10 + 1].f18222f;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.f18220d;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.Y[i10].f18222f;
                if (constraintAnchor2 != null && constraintAnchor2.f18220d == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z10 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f18409b;
        if (constraintWidget6 != null) {
            this.f18420m -= constraintWidget6.Y[i10].g();
        }
        ConstraintWidget constraintWidget7 = this.f18411d;
        if (constraintWidget7 != null) {
            this.f18420m -= constraintWidget7.Y[i10 + 1].g();
        }
        this.f18410c = constraintWidget;
        if (this.f18423p == 0 && this.f18424q) {
            this.f18412e = constraintWidget;
        } else {
            this.f18412e = this.f18408a;
        }
        this.f18427t = this.f18426s && this.f18425r;
    }

    private static boolean k(ConstraintWidget constraintWidget, int i10) {
        int i11;
        return constraintWidget.i0() != 8 && constraintWidget.f18255b0[i10] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && ((i11 = constraintWidget.f18300y[i10]) == 0 || i11 == 3);
    }

    public void a() {
        if (!this.f18429v) {
            b();
        }
        this.f18429v = true;
    }

    public ConstraintWidget c() {
        return this.f18408a;
    }

    public ConstraintWidget d() {
        return this.f18413f;
    }

    public ConstraintWidget e() {
        return this.f18409b;
    }

    public ConstraintWidget f() {
        return this.f18412e;
    }

    public ConstraintWidget g() {
        return this.f18410c;
    }

    public ConstraintWidget h() {
        return this.f18414g;
    }

    public ConstraintWidget i() {
        return this.f18411d;
    }

    public float j() {
        return this.f18418k;
    }
}
