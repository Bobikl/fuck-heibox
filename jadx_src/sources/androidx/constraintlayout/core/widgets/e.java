package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: Flow.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends l {

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final int f18440n2 = 0;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final int f18441o2 = 1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f18442p2 = 2;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final int f18443q2 = 0;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final int f18444r2 = 1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final int f18445s2 = 2;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final int f18446t2 = 3;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final int f18447u2 = 0;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final int f18448v2 = 1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final int f18449w2 = 2;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    private ConstraintWidget[] f18461l2;
    private int O1 = -1;
    private int P1 = -1;
    private int Q1 = -1;
    private int R1 = -1;
    private int S1 = -1;
    private int T1 = -1;
    private float U1 = 0.5f;
    private float V1 = 0.5f;
    private float W1 = 0.5f;
    private float X1 = 0.5f;
    private float Y1 = 0.5f;
    private float Z1 = 0.5f;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    private int f18450a2 = 0;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private int f18451b2 = 0;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private int f18452c2 = 2;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    private int f18453d2 = 2;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    private int f18454e2 = 0;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    private int f18455f2 = -1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    private int f18456g2 = 0;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private ArrayList<a> f18457h2 = new ArrayList<>();

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    private ConstraintWidget[] f18458i2 = null;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    private ConstraintWidget[] f18459j2 = null;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    private int[] f18460k2 = null;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    private int f18462m2 = 0;

    /* JADX INFO: compiled from: Flow.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f18463a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ConstraintAnchor f18466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ConstraintAnchor f18467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ConstraintAnchor f18468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ConstraintAnchor f18469g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f18470h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f18471i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f18472j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f18473k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f18479q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConstraintWidget f18464b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18465c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f18474l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f18475m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f18476n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f18477o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f18478p = 0;

        public a(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11) {
            this.f18470h = 0;
            this.f18471i = 0;
            this.f18472j = 0;
            this.f18473k = 0;
            this.f18479q = 0;
            this.f18463a = i10;
            this.f18466d = constraintAnchor;
            this.f18467e = constraintAnchor2;
            this.f18468f = constraintAnchor3;
            this.f18469g = constraintAnchor4;
            this.f18470h = e.this.m2();
            this.f18471i = e.this.o2();
            this.f18472j = e.this.n2();
            this.f18473k = e.this.l2();
            this.f18479q = i11;
        }

        private void h() {
            this.f18474l = 0;
            this.f18475m = 0;
            this.f18464b = null;
            this.f18465c = 0;
            int i10 = this.f18477o;
            for (int i11 = 0; i11 < i10 && this.f18476n + i11 < e.this.f18462m2; i11++) {
                ConstraintWidget constraintWidget = e.this.f18461l2[this.f18476n + i11];
                if (this.f18463a == 0) {
                    int iJ0 = constraintWidget.j0();
                    int i12 = e.this.f18450a2;
                    if (constraintWidget.i0() == 8) {
                        i12 = 0;
                    }
                    this.f18474l += iJ0 + i12;
                    int iX2 = e.this.X2(constraintWidget, this.f18479q);
                    if (this.f18464b == null || this.f18465c < iX2) {
                        this.f18464b = constraintWidget;
                        this.f18465c = iX2;
                        this.f18475m = iX2;
                    }
                } else {
                    int iY2 = e.this.Y2(constraintWidget, this.f18479q);
                    int iX3 = e.this.X2(constraintWidget, this.f18479q);
                    int i13 = e.this.f18451b2;
                    if (constraintWidget.i0() == 8) {
                        i13 = 0;
                    }
                    this.f18475m += iX3 + i13;
                    if (this.f18464b == null || this.f18465c < iY2) {
                        this.f18464b = constraintWidget;
                        this.f18465c = iY2;
                        this.f18474l = iY2;
                    }
                }
            }
        }

        public void b(ConstraintWidget constraintWidget) {
            if (this.f18463a == 0) {
                int iY2 = e.this.Y2(constraintWidget, this.f18479q);
                if (constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f18478p++;
                    iY2 = 0;
                }
                this.f18474l += iY2 + (constraintWidget.i0() != 8 ? e.this.f18450a2 : 0);
                int iX2 = e.this.X2(constraintWidget, this.f18479q);
                if (this.f18464b == null || this.f18465c < iX2) {
                    this.f18464b = constraintWidget;
                    this.f18465c = iX2;
                    this.f18475m = iX2;
                }
            } else {
                int iY3 = e.this.Y2(constraintWidget, this.f18479q);
                int iX3 = e.this.X2(constraintWidget, this.f18479q);
                if (constraintWidget.g0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f18478p++;
                    iX3 = 0;
                }
                this.f18475m += iX3 + (constraintWidget.i0() != 8 ? e.this.f18451b2 : 0);
                if (this.f18464b == null || this.f18465c < iY3) {
                    this.f18464b = constraintWidget;
                    this.f18465c = iY3;
                    this.f18474l = iY3;
                }
            }
            this.f18477o++;
        }

        public void c() {
            this.f18465c = 0;
            this.f18464b = null;
            this.f18474l = 0;
            this.f18475m = 0;
            this.f18476n = 0;
            this.f18477o = 0;
            this.f18478p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            ConstraintWidget constraintWidget;
            char c10;
            float f10;
            float f11;
            int i11 = this.f18477o;
            for (int i12 = 0; i12 < i11 && this.f18476n + i12 < e.this.f18462m2; i12++) {
                ConstraintWidget constraintWidget2 = e.this.f18461l2[this.f18476n + i12];
                if (constraintWidget2 != null) {
                    constraintWidget2.Q0();
                }
            }
            if (i11 == 0 || this.f18464b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i13 = -1;
            int i14 = -1;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = z10 ? (i11 - 1) - i15 : i15;
                if (this.f18476n + i16 >= e.this.f18462m2) {
                    break;
                }
                if (e.this.f18461l2[this.f18476n + i16].i0() == 0) {
                    if (i13 == -1) {
                        i13 = i15;
                    }
                    i14 = i15;
                }
            }
            ConstraintWidget constraintWidget3 = null;
            if (this.f18463a != 0) {
                ConstraintWidget constraintWidget4 = this.f18464b;
                constraintWidget4.v1(e.this.O1);
                int i17 = this.f18470h;
                if (i10 > 0) {
                    i17 += e.this.f18450a2;
                }
                if (z10) {
                    constraintWidget4.S.a(this.f18468f, i17);
                    if (z11) {
                        constraintWidget4.Q.a(this.f18466d, this.f18472j);
                    }
                    if (i10 > 0) {
                        this.f18468f.f18220d.Q.a(constraintWidget4.S, 0);
                    }
                } else {
                    constraintWidget4.Q.a(this.f18466d, i17);
                    if (z11) {
                        constraintWidget4.S.a(this.f18468f, this.f18472j);
                    }
                    if (i10 > 0) {
                        this.f18466d.f18220d.S.a(constraintWidget4.Q, 0);
                    }
                }
                int i18 = 0;
                while (i18 < i11 && this.f18476n + i18 < e.this.f18462m2) {
                    ConstraintWidget constraintWidget5 = e.this.f18461l2[this.f18476n + i18];
                    if (i18 == 0) {
                        constraintWidget5.l(constraintWidget5.R, this.f18467e, this.f18471i);
                        int i19 = e.this.P1;
                        float f12 = e.this.V1;
                        if (this.f18476n == 0 && e.this.R1 != -1) {
                            i19 = e.this.R1;
                            f12 = e.this.X1;
                        } else if (z11 && e.this.T1 != -1) {
                            i19 = e.this.T1;
                            f12 = e.this.Z1;
                        }
                        constraintWidget5.Q1(i19);
                        constraintWidget5.P1(f12);
                    }
                    if (i18 == i11 - 1) {
                        constraintWidget5.l(constraintWidget5.T, this.f18469g, this.f18473k);
                    }
                    if (constraintWidget3 != null) {
                        constraintWidget5.R.a(constraintWidget3.T, e.this.f18451b2);
                        if (i18 == i13) {
                            constraintWidget5.R.B(this.f18471i);
                        }
                        constraintWidget3.T.a(constraintWidget5.R, 0);
                        if (i18 == i14 + 1) {
                            constraintWidget3.T.B(this.f18473k);
                        }
                    }
                    if (constraintWidget5 != constraintWidget4) {
                        if (z10) {
                            int i20 = e.this.f18452c2;
                            if (i20 == 0) {
                                constraintWidget5.S.a(constraintWidget4.S, 0);
                            } else if (i20 == 1) {
                                constraintWidget5.Q.a(constraintWidget4.Q, 0);
                            } else if (i20 == 2) {
                                constraintWidget5.Q.a(constraintWidget4.Q, 0);
                                constraintWidget5.S.a(constraintWidget4.S, 0);
                            }
                        } else {
                            int i21 = e.this.f18452c2;
                            if (i21 == 0) {
                                constraintWidget5.Q.a(constraintWidget4.Q, 0);
                            } else if (i21 == 1) {
                                constraintWidget5.S.a(constraintWidget4.S, 0);
                            } else if (i21 == 2) {
                                if (z12) {
                                    constraintWidget5.Q.a(this.f18466d, this.f18470h);
                                    constraintWidget5.S.a(this.f18468f, this.f18472j);
                                } else {
                                    constraintWidget5.Q.a(constraintWidget4.Q, 0);
                                    constraintWidget5.S.a(constraintWidget4.S, 0);
                                }
                            }
                        }
                    }
                    i18++;
                    constraintWidget3 = constraintWidget5;
                }
                return;
            }
            ConstraintWidget constraintWidget6 = this.f18464b;
            constraintWidget6.Q1(e.this.P1);
            int i22 = this.f18471i;
            if (i10 > 0) {
                i22 += e.this.f18451b2;
            }
            constraintWidget6.R.a(this.f18467e, i22);
            if (z11) {
                constraintWidget6.T.a(this.f18469g, this.f18473k);
            }
            if (i10 > 0) {
                this.f18467e.f18220d.T.a(constraintWidget6.R, 0);
            }
            if (e.this.f18453d2 != 3 || constraintWidget6.n0()) {
                constraintWidget = constraintWidget6;
                break;
            }
            int i23 = 0;
            while (true) {
                if (i23 < i11) {
                    int i24 = z10 ? (i11 - 1) - i23 : i23;
                    if (this.f18476n + i24 < e.this.f18462m2) {
                        constraintWidget = e.this.f18461l2[this.f18476n + i24];
                        if (constraintWidget.n0()) {
                            break;
                        } else {
                            i23++;
                        }
                    }
                }
                constraintWidget = constraintWidget6;
                break;
            }
            int i25 = 0;
            while (i25 < i11) {
                int i26 = z10 ? (i11 - 1) - i25 : i25;
                if (this.f18476n + i26 >= e.this.f18462m2) {
                    return;
                }
                ConstraintWidget constraintWidget7 = e.this.f18461l2[this.f18476n + i26];
                if (i25 == 0) {
                    constraintWidget7.l(constraintWidget7.Q, this.f18466d, this.f18470h);
                }
                if (i26 == 0) {
                    int i27 = e.this.O1;
                    float f13 = e.this.U1;
                    if (z10) {
                        f13 = 1.0f - f13;
                    }
                    if (this.f18476n == 0 && e.this.Q1 != -1) {
                        i27 = e.this.Q1;
                        if (z10) {
                            f11 = e.this.W1;
                            f10 = 1.0f - f11;
                        } else {
                            f10 = e.this.W1;
                        }
                        f13 = f10;
                    } else if (z11 && e.this.S1 != -1) {
                        i27 = e.this.S1;
                        if (z10) {
                            f11 = e.this.Y1;
                            f10 = 1.0f - f11;
                        } else {
                            f10 = e.this.Y1;
                        }
                        f13 = f10;
                    }
                    constraintWidget7.v1(i27);
                    constraintWidget7.u1(f13);
                }
                if (i25 == i11 - 1) {
                    constraintWidget7.l(constraintWidget7.S, this.f18468f, this.f18472j);
                }
                if (constraintWidget3 != null) {
                    constraintWidget7.Q.a(constraintWidget3.S, e.this.f18450a2);
                    if (i25 == i13) {
                        constraintWidget7.Q.B(this.f18470h);
                    }
                    constraintWidget3.S.a(constraintWidget7.Q, 0);
                    if (i25 == i14 + 1) {
                        constraintWidget3.S.B(this.f18472j);
                    }
                }
                if (constraintWidget7 != constraintWidget6) {
                    c10 = 3;
                    if (e.this.f18453d2 == 3 && constraintWidget.n0() && constraintWidget7 != constraintWidget && constraintWidget7.n0()) {
                        constraintWidget7.U.a(constraintWidget.U, 0);
                    } else {
                        int i28 = e.this.f18453d2;
                        if (i28 == 0) {
                            constraintWidget7.R.a(constraintWidget6.R, 0);
                        } else if (i28 == 1) {
                            constraintWidget7.T.a(constraintWidget6.T, 0);
                        } else if (z12) {
                            constraintWidget7.R.a(this.f18467e, this.f18471i);
                            constraintWidget7.T.a(this.f18469g, this.f18473k);
                        } else {
                            constraintWidget7.R.a(constraintWidget6.R, 0);
                            constraintWidget7.T.a(constraintWidget6.T, 0);
                        }
                    }
                } else {
                    c10 = 3;
                }
                i25++;
                constraintWidget3 = constraintWidget7;
            }
        }

        public int e() {
            return this.f18463a == 1 ? this.f18475m - e.this.f18451b2 : this.f18475m;
        }

        public int f() {
            return this.f18463a == 0 ? this.f18474l - e.this.f18450a2 : this.f18474l;
        }

        public void g(int i10) {
            int i11 = this.f18478p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f18477o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f18476n + i14 < e.this.f18462m2; i14++) {
                ConstraintWidget constraintWidget = e.this.f18461l2[this.f18476n + i14];
                if (this.f18463a == 0) {
                    if (constraintWidget != null && constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f18296w == 0) {
                        e.this.q2(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i13, constraintWidget.g0(), constraintWidget.D());
                    }
                } else if (constraintWidget != null && constraintWidget.g0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f18298x == 0) {
                    e.this.q2(constraintWidget, constraintWidget.H(), constraintWidget.j0(), ConstraintWidget.DimensionBehaviour.FIXED, i13);
                }
            }
            h();
        }

        public void i(int i10) {
            this.f18476n = i10;
        }

        public void j(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11, int i12, int i13, int i14, int i15) {
            this.f18463a = i10;
            this.f18466d = constraintAnchor;
            this.f18467e = constraintAnchor2;
            this.f18468f = constraintAnchor3;
            this.f18469g = constraintAnchor4;
            this.f18470h = i11;
            this.f18471i = i12;
            this.f18472j = i13;
            this.f18473k = i14;
            this.f18479q = i15;
        }
    }

    private void W2(boolean z10) {
        ConstraintWidget constraintWidget;
        float f10;
        int i10;
        if (this.f18460k2 == null || this.f18459j2 == null || this.f18458i2 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f18462m2; i11++) {
            this.f18461l2[i11].Q0();
        }
        int[] iArr = this.f18460k2;
        int i12 = iArr[0];
        int i13 = iArr[1];
        ConstraintWidget constraintWidget2 = null;
        float f11 = this.U1;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.U1;
            } else {
                f10 = f11;
                i10 = i14;
            }
            ConstraintWidget constraintWidget3 = this.f18459j2[i10];
            if (constraintWidget3 != null && constraintWidget3.i0() != 8) {
                if (i14 == 0) {
                    constraintWidget3.l(constraintWidget3.Q, this.Q, m2());
                    constraintWidget3.v1(this.O1);
                    constraintWidget3.u1(f10);
                }
                if (i14 == i12 - 1) {
                    constraintWidget3.l(constraintWidget3.S, this.S, n2());
                }
                if (i14 > 0 && constraintWidget2 != null) {
                    constraintWidget3.l(constraintWidget3.Q, constraintWidget2.S, this.f18450a2);
                    constraintWidget2.l(constraintWidget2.S, constraintWidget3.Q, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            ConstraintWidget constraintWidget4 = this.f18458i2[i15];
            if (constraintWidget4 != null && constraintWidget4.i0() != 8) {
                if (i15 == 0) {
                    constraintWidget4.l(constraintWidget4.R, this.R, o2());
                    constraintWidget4.Q1(this.P1);
                    constraintWidget4.P1(this.V1);
                }
                if (i15 == i13 - 1) {
                    constraintWidget4.l(constraintWidget4.T, this.T, l2());
                }
                if (i15 > 0 && constraintWidget2 != null) {
                    constraintWidget4.l(constraintWidget4.R, constraintWidget2.T, this.f18451b2);
                    constraintWidget2.l(constraintWidget2.T, constraintWidget4.R, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.f18456g2 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                ConstraintWidget[] constraintWidgetArr = this.f18461l2;
                if (i18 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i18]) != null && constraintWidget.i0() != 8) {
                    ConstraintWidget constraintWidget5 = this.f18459j2[i16];
                    ConstraintWidget constraintWidget6 = this.f18458i2[i17];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.l(constraintWidget.Q, constraintWidget5.Q, 0);
                        constraintWidget.l(constraintWidget.S, constraintWidget5.S, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.l(constraintWidget.R, constraintWidget6.R, 0);
                        constraintWidget.l(constraintWidget.T, constraintWidget6.T, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int X2(ConstraintWidget constraintWidget, int i10) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.g0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.f18298x;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.E * i10);
                if (i12 != constraintWidget.D()) {
                    constraintWidget.H1(true);
                    q2(constraintWidget, constraintWidget.H(), constraintWidget.j0(), ConstraintWidget.DimensionBehaviour.FIXED, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return constraintWidget.D();
            }
            if (i11 == 3) {
                return (int) ((constraintWidget.j0() * constraintWidget.f18263f0) + 0.5f);
            }
        }
        return constraintWidget.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Y2(ConstraintWidget constraintWidget, int i10) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.f18296w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.B * i10);
                if (i12 != constraintWidget.j0()) {
                    constraintWidget.H1(true);
                    q2(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i12, constraintWidget.g0(), constraintWidget.D());
                }
                return i12;
            }
            if (i11 == 1) {
                return constraintWidget.j0();
            }
            if (i11 == 3) {
                return (int) ((constraintWidget.D() * constraintWidget.f18263f0) + 0.5f);
            }
        }
        return constraintWidget.j0();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:119:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:122:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0060  */
    /* JADX WARN: Code duplicated, block: B:47:0x006a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0080  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    /* JADX WARN: Code duplicated, block: B:64:0x0097  */
    /* JADX WARN: Code duplicated, block: B:66:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x009f  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void Z2(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.Z2(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void a3(ConstraintWidget[] constraintWidgetArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        int i14;
        int i15;
        ConstraintAnchor constraintAnchor;
        int iN2;
        ConstraintAnchor constraintAnchor2;
        int iL2;
        int i16;
        if (i10 == 0) {
            return;
        }
        this.f18457h2.clear();
        a aVar = new a(i11, this.Q, this.R, this.S, this.T, i12);
        this.f18457h2.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i18];
                int iY2 = Y2(constraintWidget, i12);
                if (constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i12 || (this.f18450a2 + i17) + iY2 > i12) && aVar.f18464b != null;
                if (!z10 && i18 > 0 && (i16 = this.f18455f2) > 0 && i18 % i16 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = new a(i11, this.Q, this.R, this.S, this.T, i12);
                    aVar.i(i18);
                    this.f18457h2.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += this.f18450a2 + iY2;
                    }
                    aVar.b(constraintWidget);
                    i18++;
                    i13 = i19;
                }
                i17 = iY2;
                aVar.b(constraintWidget);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i21];
                int iX2 = X2(constraintWidget2, i12);
                if (constraintWidget2.g0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i12 || (this.f18451b2 + i20) + iX2 > i12) && aVar.f18464b != null;
                if (!z11 && i21 > 0 && (i14 = this.f18455f2) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = new a(i11, this.Q, this.R, this.S, this.T, i12);
                    aVar.i(i21);
                    this.f18457h2.add(aVar);
                } else {
                    if (i21 > 0) {
                        i20 += this.f18451b2 + iX2;
                    }
                    aVar.b(constraintWidget2);
                    i21++;
                    i13 = i22;
                }
                i20 = iX2;
                aVar.b(constraintWidget2);
                i21++;
                i13 = i22;
            }
        }
        int size = this.f18457h2.size();
        ConstraintAnchor constraintAnchor3 = this.Q;
        ConstraintAnchor constraintAnchor4 = this.R;
        ConstraintAnchor constraintAnchor5 = this.S;
        ConstraintAnchor constraintAnchor6 = this.T;
        int iM2 = m2();
        int iO2 = o2();
        int iN3 = n2();
        int iL3 = l2();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourH = H();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z12 = dimensionBehaviourH == dimensionBehaviour || g0() == dimensionBehaviour;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = this.f18457h2.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        int i24 = iO2;
        int i25 = iN3;
        int iE = 0;
        int iF = 0;
        int i26 = 0;
        int i27 = iM2;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i28 = iL3;
        while (i26 < size) {
            a aVar3 = this.f18457h2.get(i26);
            if (i11 == 0) {
                if (i26 < size - 1) {
                    constraintAnchor2 = this.f18457h2.get(i26 + 1).f18464b.R;
                    iL2 = 0;
                } else {
                    constraintAnchor2 = this.T;
                    iL2 = l2();
                }
                ConstraintAnchor constraintAnchor9 = aVar3.f18464b.T;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i29 = iE;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i30 = iF;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i15 = i26;
                aVar3.j(i11, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i27, i24, i25, iL2, i12);
                int iMax = Math.max(i30, aVar3.f());
                iE = i29 + aVar3.e();
                if (i15 > 0) {
                    iE += this.f18451b2;
                }
                constraintAnchor8 = constraintAnchor11;
                iF = iMax;
                i24 = 0;
                constraintAnchor7 = constraintAnchor9;
                constraintAnchor = constraintAnchor14;
                int i31 = iL2;
                constraintAnchor6 = constraintAnchor2;
                i28 = i31;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i32 = iE;
                int i33 = iF;
                i15 = i26;
                if (i15 < size - 1) {
                    constraintAnchor = this.f18457h2.get(i15 + 1).f18464b.Q;
                    iN2 = 0;
                } else {
                    constraintAnchor = this.S;
                    iN2 = n2();
                }
                ConstraintAnchor constraintAnchor16 = aVar3.f18464b.S;
                aVar3.j(i11, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i27, i24, iN2, i28, i12);
                iF = i33 + aVar3.f();
                int iMax2 = Math.max(i32, aVar3.e());
                if (i15 > 0) {
                    iF += this.f18450a2;
                }
                iE = iMax2;
                i27 = 0;
                i25 = iN2;
                constraintAnchor8 = constraintAnchor16;
            }
            i26 = i15 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = iF;
        iArr[1] = iE;
    }

    private void b3(ConstraintWidget[] constraintWidgetArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f18457h2.size() == 0) {
            aVar = new a(i11, this.Q, this.R, this.S, this.T, i12);
            this.f18457h2.add(aVar);
        } else {
            a aVar2 = this.f18457h2.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i11, this.Q, this.R, this.S, this.T, m2(), o2(), n2(), l2(), i12);
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(constraintWidgetArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void c3(float f10) {
        this.W1 = f10;
    }

    public void d3(int i10) {
        this.Q1 = i10;
    }

    public void e3(float f10) {
        this.X1 = f10;
    }

    public void f3(int i10) {
        this.R1 = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.e eVar, boolean z10) {
        super.g(eVar, z10);
        boolean z11 = U() != null && ((d) U()).I2();
        int i10 = this.f18454e2;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f18457h2.size();
                int i11 = 0;
                while (i11 < size) {
                    this.f18457h2.get(i11).d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                W2(z11);
            }
        } else if (this.f18457h2.size() > 0) {
            this.f18457h2.get(0).d(z11, 0, true);
        }
        t2(false);
    }

    public void g3(int i10) {
        this.f18452c2 = i10;
    }

    public void h3(float f10) {
        this.U1 = f10;
    }

    public void i3(int i10) {
        this.f18450a2 = i10;
    }

    public void j3(int i10) {
        this.O1 = i10;
    }

    public void k3(float f10) {
        this.Y1 = f10;
    }

    public void l3(int i10) {
        this.S1 = i10;
    }

    public void m3(float f10) {
        this.Z1 = f10;
    }

    @Override // androidx.constraintlayout.core.widgets.h, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.n(constraintWidget, map);
        e eVar = (e) constraintWidget;
        this.O1 = eVar.O1;
        this.P1 = eVar.P1;
        this.Q1 = eVar.Q1;
        this.R1 = eVar.R1;
        this.S1 = eVar.S1;
        this.T1 = eVar.T1;
        this.U1 = eVar.U1;
        this.V1 = eVar.V1;
        this.W1 = eVar.W1;
        this.X1 = eVar.X1;
        this.Y1 = eVar.Y1;
        this.Z1 = eVar.Z1;
        this.f18450a2 = eVar.f18450a2;
        this.f18451b2 = eVar.f18451b2;
        this.f18452c2 = eVar.f18452c2;
        this.f18453d2 = eVar.f18453d2;
        this.f18454e2 = eVar.f18454e2;
        this.f18455f2 = eVar.f18455f2;
        this.f18456g2 = eVar.f18456g2;
    }

    public void n3(int i10) {
        this.T1 = i10;
    }

    public void o3(int i10) {
        this.f18455f2 = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.l
    public void p2(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        boolean z10;
        if (this.A1 > 0 && !r2()) {
            u2(0, 0);
            t2(false);
            return;
        }
        int iM2 = m2();
        int iN2 = n2();
        int iO2 = o2();
        int iL2 = l2();
        int[] iArr = new int[2];
        int i16 = (i11 - iM2) - iN2;
        int i17 = this.f18456g2;
        if (i17 == 1) {
            i16 = (i13 - iO2) - iL2;
        }
        int i18 = i16;
        if (i17 == 0) {
            if (this.O1 == -1) {
                this.O1 = 0;
            }
            if (this.P1 == -1) {
                this.P1 = 0;
            }
        } else {
            if (this.O1 == -1) {
                this.O1 = 0;
            }
            if (this.P1 == -1) {
                this.P1 = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.f18483z1;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            i14 = this.A1;
            if (i19 >= i14) {
                break;
            }
            if (this.f18483z1[i19].i0() == 8) {
                i20++;
            }
            i19++;
        }
        if (i20 > 0) {
            constraintWidgetArr = new ConstraintWidget[i14 - i20];
            int i21 = 0;
            for (int i22 = 0; i22 < this.A1; i22++) {
                ConstraintWidget constraintWidget = this.f18483z1[i22];
                if (constraintWidget.i0() != 8) {
                    constraintWidgetArr[i21] = constraintWidget;
                    i21++;
                }
            }
            i15 = i21;
        } else {
            i15 = i14;
        }
        this.f18461l2 = constraintWidgetArr;
        this.f18462m2 = i15;
        int i23 = this.f18454e2;
        if (i23 == 0) {
            z10 = true;
            b3(constraintWidgetArr, i15, this.f18456g2, i18, iArr);
        } else if (i23 == 1) {
            z10 = true;
            a3(constraintWidgetArr, i15, this.f18456g2, i18, iArr);
        } else if (i23 != 2) {
            z10 = true;
        } else {
            z10 = true;
            Z2(constraintWidgetArr, i15, this.f18456g2, i18, iArr);
        }
        int iMin = iArr[0] + iM2 + iN2;
        int iMin2 = iArr[z10 ? 1 : 0] + iO2 + iL2;
        if (i10 == 1073741824) {
            iMin = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i11);
        } else if (i10 != 0) {
            iMin = 0;
        }
        if (i12 == 1073741824) {
            iMin2 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i13);
        } else if (i12 != 0) {
            iMin2 = 0;
        }
        u2(iMin, iMin2);
        W1(iMin);
        s1(iMin2);
        if (this.A1 <= 0) {
            z10 = false;
        }
        t2(z10);
    }

    public void p3(int i10) {
        this.f18456g2 = i10;
    }

    public void q3(int i10) {
        this.f18453d2 = i10;
    }

    public void r3(float f10) {
        this.V1 = f10;
    }

    public void s3(int i10) {
        this.f18451b2 = i10;
    }

    public void t3(int i10) {
        this.P1 = i10;
    }

    public void u3(int i10) {
        this.f18454e2 = i10;
    }
}
