package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public class Dimension {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f18109i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f18110j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f18111k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f18112l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f18113m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f18114n = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f18116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f18117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f18118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f18119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f18120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f18121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f18122h;

    public enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    private Dimension() {
        this.f18115a = -2;
        this.f18116b = 0;
        this.f18117c = Integer.MAX_VALUE;
        this.f18118d = 1.0f;
        this.f18119e = 0;
        this.f18120f = null;
        this.f18121g = f18110j;
        this.f18122h = false;
    }

    private Dimension(Object obj) {
        this.f18115a = -2;
        this.f18116b = 0;
        this.f18117c = Integer.MAX_VALUE;
        this.f18118d = 1.0f;
        this.f18119e = 0;
        this.f18120f = null;
        this.f18122h = false;
        this.f18121g = obj;
    }

    public static Dimension a(int i10) {
        Dimension dimension = new Dimension(f18109i);
        dimension.l(i10);
        return dimension;
    }

    public static Dimension b(Object obj) {
        Dimension dimension = new Dimension(f18109i);
        dimension.m(obj);
        return dimension;
    }

    public static Dimension c() {
        return new Dimension(f18112l);
    }

    public static Dimension d(Object obj, float f10) {
        Dimension dimension = new Dimension(f18113m);
        dimension.s(obj, f10);
        return dimension;
    }

    public static Dimension e(String str) {
        Dimension dimension = new Dimension(f18114n);
        dimension.t(str);
        return dimension;
    }

    public static Dimension f() {
        return new Dimension(f18111k);
    }

    public static Dimension g(int i10) {
        Dimension dimension = new Dimension();
        dimension.v(i10);
        return dimension;
    }

    public static Dimension h(Object obj) {
        Dimension dimension = new Dimension();
        dimension.w(obj);
        return dimension;
    }

    public static Dimension i() {
        return new Dimension(f18110j);
    }

    public void j(State state, ConstraintWidget constraintWidget, int i10) {
        String str = this.f18120f;
        if (str != null) {
            constraintWidget.h1(str);
        }
        int i11 = 2;
        if (i10 == 0) {
            if (this.f18122h) {
                constraintWidget.x1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.f18121g;
                if (obj == f18110j) {
                    i11 = 1;
                } else if (obj != f18113m) {
                    i11 = 0;
                }
                constraintWidget.y1(i11, this.f18116b, this.f18117c, this.f18118d);
                return;
            }
            int i12 = this.f18116b;
            if (i12 > 0) {
                constraintWidget.J1(i12);
            }
            int i13 = this.f18117c;
            if (i13 < Integer.MAX_VALUE) {
                constraintWidget.G1(i13);
            }
            Object obj2 = this.f18121g;
            if (obj2 == f18110j) {
                constraintWidget.x1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (obj2 == f18112l) {
                constraintWidget.x1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    constraintWidget.x1(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.W1(this.f18119e);
                    return;
                }
                return;
            }
        }
        if (this.f18122h) {
            constraintWidget.S1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.f18121g;
            if (obj3 == f18110j) {
                i11 = 1;
            } else if (obj3 != f18113m) {
                i11 = 0;
            }
            constraintWidget.T1(i11, this.f18116b, this.f18117c, this.f18118d);
            return;
        }
        int i14 = this.f18116b;
        if (i14 > 0) {
            constraintWidget.I1(i14);
        }
        int i15 = this.f18117c;
        if (i15 < Integer.MAX_VALUE) {
            constraintWidget.F1(i15);
        }
        Object obj4 = this.f18121g;
        if (obj4 == f18110j) {
            constraintWidget.S1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (obj4 == f18112l) {
            constraintWidget.S1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (obj4 == null) {
            constraintWidget.S1(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.s1(this.f18119e);
        }
    }

    public boolean k(int i10) {
        return this.f18121g == null && this.f18119e == i10;
    }

    public Dimension l(int i10) {
        this.f18121g = null;
        this.f18119e = i10;
        return this;
    }

    public Dimension m(Object obj) {
        this.f18121g = obj;
        if (obj instanceof Integer) {
            this.f18119e = ((Integer) obj).intValue();
            this.f18121g = null;
        }
        return this;
    }

    int n() {
        return this.f18119e;
    }

    public Dimension o(int i10) {
        if (this.f18117c >= 0) {
            this.f18117c = i10;
        }
        return this;
    }

    public Dimension p(Object obj) {
        Object obj2 = f18110j;
        if (obj == obj2 && this.f18122h) {
            this.f18121g = obj2;
            this.f18117c = Integer.MAX_VALUE;
        }
        return this;
    }

    public Dimension q(int i10) {
        if (i10 >= 0) {
            this.f18116b = i10;
        }
        return this;
    }

    public Dimension r(Object obj) {
        if (obj == f18110j) {
            this.f18116b = -2;
        }
        return this;
    }

    public Dimension s(Object obj, float f10) {
        this.f18118d = f10;
        return this;
    }

    public Dimension t(String str) {
        this.f18120f = str;
        return this;
    }

    void u(int i10) {
        this.f18122h = false;
        this.f18121g = null;
        this.f18119e = i10;
    }

    public Dimension v(int i10) {
        this.f18122h = true;
        return this;
    }

    public Dimension w(Object obj) {
        this.f18121g = obj;
        this.f18122h = true;
        return this;
    }
}
