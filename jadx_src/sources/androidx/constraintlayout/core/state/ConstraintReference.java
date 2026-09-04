package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintReference implements c {
    private float U;
    private float V;
    Dimension X;
    Dimension Y;
    private Object Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f18078a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private ConstraintWidget f18079a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final State f18080b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private HashMap<String, Integer> f18081b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private HashMap<String, Float> f18083c0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f18082c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.constraintlayout.core.state.helpers.e f18084d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f18085e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f18086f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f18087g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f18088h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f18089i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f18090j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f18091k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f18092l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f18093m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f18094n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f18095o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f18096p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f18097q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f18098r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f18099s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f18100t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    float f18101u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f18102v = Float.NaN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    float f18103w = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    float f18104x = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    float f18105y = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f18106z = Float.NaN;
    float A = Float.NaN;
    float B = Float.NaN;
    float C = Float.NaN;
    float D = Float.NaN;
    float E = Float.NaN;
    int F = 0;
    Object G = null;
    Object H = null;
    Object I = null;
    Object J = null;
    protected Object K = null;
    protected Object L = null;
    protected Object M = null;
    protected Object N = null;
    protected Object O = null;
    protected Object P = null;
    protected Object Q = null;
    protected Object R = null;
    Object S = null;
    Object T = null;
    State.Constraint W = null;

    public static class IncorrectConstraintException extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f18107b;

        public IncorrectConstraintException(ArrayList<String> arrayList) {
            this.f18107b = arrayList;
        }

        public ArrayList<String> a() {
            return this.f18107b;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.f18107b.toString();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18108a;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            f18108a = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18108a[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18108a[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18108a[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18108a[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18108a[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18108a[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18108a[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18108a[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18108a[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18108a[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18108a[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18108a[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f18108a[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f18108a[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f18108a[State.Constraint.CENTER_VERTICALLY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public interface b {
        ConstraintReference a(State state);
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.f18110j;
        this.X = Dimension.b(obj);
        this.Y = Dimension.b(obj);
        this.f18081b0 = new HashMap<>();
        this.f18083c0 = new HashMap<>();
        this.f18080b = state;
    }

    private ConstraintWidget L(Object obj) {
        if (obj instanceof c) {
            return ((c) obj).a();
        }
        return null;
    }

    private void h(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget constraintWidgetL = L(obj);
        if (constraintWidgetL == null) {
        }
        int[] iArr = a.f18108a;
        int i10 = iArr[constraint.ordinal()];
        switch (iArr[constraint.ordinal()]) {
            case 1:
                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                constraintWidget.r(type).b(constraintWidgetL.r(type), this.f18089i, this.f18095o, false);
                break;
            case 2:
                constraintWidget.r(ConstraintAnchor.Type.LEFT).b(constraintWidgetL.r(ConstraintAnchor.Type.RIGHT), this.f18089i, this.f18095o, false);
                break;
            case 3:
                constraintWidget.r(ConstraintAnchor.Type.RIGHT).b(constraintWidgetL.r(ConstraintAnchor.Type.LEFT), this.f18090j, this.f18096p, false);
                break;
            case 4:
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.r(type2).b(constraintWidgetL.r(type2), this.f18090j, this.f18096p, false);
                break;
            case 5:
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                constraintWidget.r(type3).b(constraintWidgetL.r(type3), this.f18091k, this.f18097q, false);
                break;
            case 6:
                constraintWidget.r(ConstraintAnchor.Type.LEFT).b(constraintWidgetL.r(ConstraintAnchor.Type.RIGHT), this.f18091k, this.f18097q, false);
                break;
            case 7:
                constraintWidget.r(ConstraintAnchor.Type.RIGHT).b(constraintWidgetL.r(ConstraintAnchor.Type.LEFT), this.f18092l, this.f18098r, false);
                break;
            case 8:
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.r(type4).b(constraintWidgetL.r(type4), this.f18092l, this.f18098r, false);
                break;
            case 9:
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.TOP;
                constraintWidget.r(type5).b(constraintWidgetL.r(type5), this.f18093m, this.f18099s, false);
                break;
            case 10:
                constraintWidget.r(ConstraintAnchor.Type.TOP).b(constraintWidgetL.r(ConstraintAnchor.Type.BOTTOM), this.f18093m, this.f18099s, false);
                break;
            case 11:
                constraintWidget.r(ConstraintAnchor.Type.BOTTOM).b(constraintWidgetL.r(ConstraintAnchor.Type.TOP), this.f18094n, this.f18100t, false);
                break;
            case 12:
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.r(type6).b(constraintWidgetL.r(type6), this.f18094n, this.f18100t, false);
                break;
            case 13:
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                constraintWidget.s0(type7, constraintWidgetL, type7, 0, 0);
                break;
            case 14:
                constraintWidget.m(constraintWidgetL, this.U, (int) this.V);
                break;
        }
    }

    private void v() {
        this.G = z(this.G);
        this.H = z(this.H);
        this.I = z(this.I);
        this.J = z(this.J);
        this.K = z(this.K);
        this.L = z(this.L);
        this.M = z(this.M);
        this.N = z(this.N);
        this.O = z(this.O);
        this.P = z(this.P);
        this.Q = z(this.Q);
        this.R = z(this.R);
        this.S = z(this.S);
    }

    private Object z(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof ConstraintReference) ? this.f18080b.r(obj) : obj;
    }

    public float A() {
        return this.C;
    }

    public void A0() throws IncorrectConstraintException {
        ArrayList arrayList = new ArrayList();
        if (this.G != null && this.H != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.I != null && this.J != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.K != null && this.L != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.M != null && this.N != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.G != null || this.H != null || this.I != null || this.J != null) && (this.K != null || this.L != null || this.M != null || this.N != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new IncorrectConstraintException(arrayList);
        }
    }

    public Dimension B() {
        return this.Y;
    }

    public ConstraintReference B0(float f10) {
        this.f18088h = f10;
        return this;
    }

    public int C() {
        return this.f18085e;
    }

    public ConstraintReference C0(int i10) {
        this.F = i10;
        return this;
    }

    public float D() {
        return this.f18101u;
    }

    public ConstraintReference D0(Dimension dimension) {
        return q0(dimension);
    }

    public float E() {
        return this.f18102v;
    }

    public float F() {
        return this.f18103w;
    }

    public float G() {
        return this.f18104x;
    }

    public float H() {
        return this.f18105y;
    }

    public float I() {
        return this.D;
    }

    public float J() {
        return this.E;
    }

    public String K() {
        return this.f18082c;
    }

    public float M() {
        return this.f18106z;
    }

    public float N() {
        return this.A;
    }

    public float O() {
        return this.B;
    }

    public int P(int i10) {
        return this.f18086f;
    }

    public Object Q() {
        return this.Z;
    }

    public Dimension R() {
        return this.X;
    }

    public ConstraintReference S(Dimension dimension) {
        return l0(dimension);
    }

    public ConstraintReference T(float f10) {
        this.f18087g = f10;
        return this;
    }

    public ConstraintReference U() {
        if (this.G != null) {
            this.W = State.Constraint.LEFT_TO_LEFT;
        } else {
            this.W = State.Constraint.LEFT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference V(Object obj) {
        this.W = State.Constraint.LEFT_TO_LEFT;
        this.G = obj;
        return this;
    }

    public ConstraintReference W(Object obj) {
        this.W = State.Constraint.LEFT_TO_RIGHT;
        this.H = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference X(int i10) {
        State.Constraint constraint = this.W;
        if (constraint != null) {
            switch (a.f18108a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.f18089i = i10;
                    break;
                case 3:
                case 4:
                    this.f18090j = i10;
                    break;
                case 5:
                case 6:
                    this.f18091k = i10;
                    break;
                case 7:
                case 8:
                    this.f18092l = i10;
                    break;
                case 9:
                case 10:
                    this.f18093m = i10;
                    break;
                case 11:
                case 12:
                    this.f18094n = i10;
                    break;
                case 14:
                    this.V = i10;
                    break;
            }
        } else {
            this.f18089i = i10;
            this.f18090j = i10;
            this.f18091k = i10;
            this.f18092l = i10;
            this.f18093m = i10;
            this.f18094n = i10;
        }
        return this;
    }

    public ConstraintReference Y(Object obj) {
        return X(this.f18080b.f(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference Z(int i10) {
        State.Constraint constraint = this.W;
        if (constraint != null) {
            switch (a.f18108a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.f18095o = i10;
                    break;
                case 3:
                case 4:
                    this.f18096p = i10;
                    break;
                case 5:
                case 6:
                    this.f18097q = i10;
                    break;
                case 7:
                case 8:
                    this.f18098r = i10;
                    break;
                case 9:
                case 10:
                    this.f18099s = i10;
                    break;
                case 11:
                case 12:
                    this.f18100t = i10;
                    break;
            }
        } else {
            this.f18095o = i10;
            this.f18096p = i10;
            this.f18097q = i10;
            this.f18098r = i10;
            this.f18099s = i10;
            this.f18100t = i10;
        }
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c
    public ConstraintWidget a() {
        if (this.f18079a0 == null) {
            ConstraintWidget constraintWidgetU = u();
            this.f18079a0 = constraintWidgetU;
            constraintWidgetU.b1(this.Z);
        }
        return this.f18079a0;
    }

    public ConstraintReference a0(float f10) {
        this.f18101u = f10;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c
    public void apply() {
        if (this.f18079a0 == null) {
            return;
        }
        androidx.constraintlayout.core.state.helpers.e eVar = this.f18084d;
        if (eVar != null) {
            eVar.apply();
        }
        this.X.j(this.f18080b, this.f18079a0, 0);
        this.Y.j(this.f18080b, this.f18079a0, 1);
        v();
        h(this.f18079a0, this.G, State.Constraint.LEFT_TO_LEFT);
        h(this.f18079a0, this.H, State.Constraint.LEFT_TO_RIGHT);
        h(this.f18079a0, this.I, State.Constraint.RIGHT_TO_LEFT);
        h(this.f18079a0, this.J, State.Constraint.RIGHT_TO_RIGHT);
        h(this.f18079a0, this.K, State.Constraint.START_TO_START);
        h(this.f18079a0, this.L, State.Constraint.START_TO_END);
        h(this.f18079a0, this.M, State.Constraint.END_TO_START);
        h(this.f18079a0, this.N, State.Constraint.END_TO_END);
        h(this.f18079a0, this.O, State.Constraint.TOP_TO_TOP);
        h(this.f18079a0, this.P, State.Constraint.TOP_TO_BOTTOM);
        h(this.f18079a0, this.Q, State.Constraint.BOTTOM_TO_TOP);
        h(this.f18079a0, this.R, State.Constraint.BOTTOM_TO_BOTTOM);
        h(this.f18079a0, this.S, State.Constraint.BASELINE_TO_BASELINE);
        h(this.f18079a0, this.T, State.Constraint.CIRCULAR_CONSTRAINT);
        int i10 = this.f18085e;
        if (i10 != 0) {
            this.f18079a0.v1(i10);
        }
        int i11 = this.f18086f;
        if (i11 != 0) {
            this.f18079a0.Q1(i11);
        }
        this.f18079a0.u1(this.f18087g);
        this.f18079a0.P1(this.f18088h);
        ConstraintWidget constraintWidget = this.f18079a0;
        o oVar = constraintWidget.f18278n;
        oVar.f18200f = this.f18101u;
        oVar.f18201g = this.f18102v;
        oVar.f18202h = this.f18103w;
        oVar.f18203i = this.f18104x;
        oVar.f18204j = this.f18105y;
        oVar.f18205k = this.f18106z;
        oVar.f18206l = this.A;
        oVar.f18207m = this.B;
        oVar.f18208n = this.D;
        oVar.f18209o = this.E;
        oVar.f18210p = this.C;
        int i12 = this.F;
        oVar.f18212r = i12;
        constraintWidget.V1(i12);
        HashMap<String, Integer> map = this.f18081b0;
        if (map != null) {
            for (String str : map.keySet()) {
                this.f18079a0.f18278n.v(str, 902, this.f18081b0.get(str).intValue());
            }
        }
        HashMap<String, Float> map2 = this.f18083c0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.f18079a0.f18278n.u(str2, 901, this.f18083c0.get(str2).floatValue());
            }
        }
    }

    @Override // androidx.constraintlayout.core.state.c
    public void b(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.f18079a0 = constraintWidget;
        constraintWidget.b1(this.Z);
    }

    public ConstraintReference b0(float f10) {
        this.f18102v = f10;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c
    public void c(Object obj) {
        this.f18078a = obj;
    }

    public ConstraintReference c0() {
        if (this.I != null) {
            this.W = State.Constraint.RIGHT_TO_LEFT;
        } else {
            this.W = State.Constraint.RIGHT_TO_RIGHT;
        }
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c
    public androidx.constraintlayout.core.state.helpers.e d() {
        return this.f18084d;
    }

    public ConstraintReference d0(Object obj) {
        this.W = State.Constraint.RIGHT_TO_LEFT;
        this.I = obj;
        return this;
    }

    public void e(String str, int i10) {
        this.f18081b0.put(str, Integer.valueOf(i10));
    }

    public ConstraintReference e0(Object obj) {
        this.W = State.Constraint.RIGHT_TO_RIGHT;
        this.J = obj;
        return this;
    }

    public void f(String str, float f10) {
        if (this.f18083c0 == null) {
            this.f18083c0 = new HashMap<>();
        }
        this.f18083c0.put(str, Float.valueOf(f10));
    }

    public ConstraintReference f0(float f10) {
        this.f18103w = f10;
        return this;
    }

    public ConstraintReference g(float f10) {
        this.C = f10;
        return this;
    }

    public ConstraintReference g0(float f10) {
        this.f18104x = f10;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c
    public Object getKey() {
        return this.f18078a;
    }

    public ConstraintReference h0(float f10) {
        this.f18105y = f10;
        return this;
    }

    public ConstraintReference i() {
        this.W = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public ConstraintReference i0(float f10) {
        this.D = f10;
        return this;
    }

    public ConstraintReference j(Object obj) {
        this.W = State.Constraint.BASELINE_TO_BASELINE;
        this.S = obj;
        return this;
    }

    public ConstraintReference j0(float f10) {
        this.E = f10;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference k(float f10) {
        State.Constraint constraint = this.W;
        if (constraint == null) {
            return this;
        }
        switch (a.f18108a[constraint.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 15:
                this.f18087g = f10;
                return this;
            case 9:
            case 10:
            case 11:
            case 12:
            case 16:
                this.f18088h = f10;
                return this;
            case 13:
            case 14:
            default:
                return this;
        }
    }

    public void k0(androidx.constraintlayout.core.state.helpers.e eVar) {
        this.f18084d = eVar;
        if (eVar != null) {
            b(eVar.a());
        }
    }

    public ConstraintReference l() {
        if (this.Q != null) {
            this.W = State.Constraint.BOTTOM_TO_TOP;
        } else {
            this.W = State.Constraint.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference l0(Dimension dimension) {
        this.Y = dimension;
        return this;
    }

    public ConstraintReference m(Object obj) {
        this.W = State.Constraint.BOTTOM_TO_BOTTOM;
        this.R = obj;
        return this;
    }

    public void m0(int i10) {
        this.f18085e = i10;
    }

    public ConstraintReference n(Object obj) {
        this.W = State.Constraint.BOTTOM_TO_TOP;
        this.Q = obj;
        return this;
    }

    public void n0(String str) {
        this.f18082c = str;
    }

    public ConstraintReference o(Object obj) {
        Object objZ = z(obj);
        this.K = objZ;
        this.N = objZ;
        this.W = State.Constraint.CENTER_HORIZONTALLY;
        this.f18087g = 0.5f;
        return this;
    }

    public void o0(int i10) {
        this.f18086f = i10;
    }

    public ConstraintReference p(Object obj) {
        Object objZ = z(obj);
        this.O = objZ;
        this.R = objZ;
        this.W = State.Constraint.CENTER_VERTICALLY;
        this.f18088h = 0.5f;
        return this;
    }

    public void p0(Object obj) {
        this.Z = obj;
        ConstraintWidget constraintWidget = this.f18079a0;
        if (constraintWidget != null) {
            constraintWidget.b1(obj);
        }
    }

    public ConstraintReference q(Object obj, float f10, float f11) {
        this.T = z(obj);
        this.U = f10;
        this.V = f11;
        this.W = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    public ConstraintReference q0(Dimension dimension) {
        this.X = dimension;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference r() {
        State.Constraint constraint = this.W;
        if (constraint != null) {
            switch (a.f18108a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.G = null;
                    this.H = null;
                    this.f18089i = 0;
                    this.f18095o = 0;
                    break;
                case 3:
                case 4:
                    this.I = null;
                    this.J = null;
                    this.f18090j = 0;
                    this.f18096p = 0;
                    break;
                case 5:
                case 6:
                    this.K = null;
                    this.L = null;
                    this.f18091k = 0;
                    this.f18097q = 0;
                    break;
                case 7:
                case 8:
                    this.M = null;
                    this.N = null;
                    this.f18092l = 0;
                    this.f18098r = 0;
                    break;
                case 9:
                case 10:
                    this.O = null;
                    this.P = null;
                    this.f18093m = 0;
                    this.f18099s = 0;
                    break;
                case 11:
                case 12:
                    this.Q = null;
                    this.R = null;
                    this.f18094n = 0;
                    this.f18100t = 0;
                    break;
                case 13:
                    this.S = null;
                    break;
                case 14:
                    this.T = null;
                    break;
            }
        } else {
            this.G = null;
            this.H = null;
            this.f18089i = 0;
            this.I = null;
            this.J = null;
            this.f18090j = 0;
            this.K = null;
            this.L = null;
            this.f18091k = 0;
            this.M = null;
            this.N = null;
            this.f18092l = 0;
            this.O = null;
            this.P = null;
            this.f18093m = 0;
            this.Q = null;
            this.R = null;
            this.f18094n = 0;
            this.S = null;
            this.T = null;
            this.f18087g = 0.5f;
            this.f18088h = 0.5f;
            this.f18095o = 0;
            this.f18096p = 0;
            this.f18097q = 0;
            this.f18098r = 0;
            this.f18099s = 0;
            this.f18100t = 0;
        }
        return this;
    }

    public ConstraintReference r0() {
        if (this.K != null) {
            this.W = State.Constraint.START_TO_START;
        } else {
            this.W = State.Constraint.START_TO_END;
        }
        return this;
    }

    public ConstraintReference s() {
        r0().r();
        w().r();
        U().r();
        c0().r();
        return this;
    }

    public ConstraintReference s0(Object obj) {
        this.W = State.Constraint.START_TO_END;
        this.L = obj;
        return this;
    }

    public ConstraintReference t() {
        u0().r();
        i().r();
        l().r();
        return this;
    }

    public ConstraintReference t0(Object obj) {
        this.W = State.Constraint.START_TO_START;
        this.K = obj;
        return this;
    }

    public ConstraintWidget u() {
        return new ConstraintWidget(R().n(), B().n());
    }

    public ConstraintReference u0() {
        if (this.O != null) {
            this.W = State.Constraint.TOP_TO_TOP;
        } else {
            this.W = State.Constraint.TOP_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference v0(Object obj) {
        this.W = State.Constraint.TOP_TO_BOTTOM;
        this.P = obj;
        return this;
    }

    public ConstraintReference w() {
        if (this.M != null) {
            this.W = State.Constraint.END_TO_START;
        } else {
            this.W = State.Constraint.END_TO_END;
        }
        return this;
    }

    public ConstraintReference w0(Object obj) {
        this.W = State.Constraint.TOP_TO_TOP;
        this.O = obj;
        return this;
    }

    public ConstraintReference x(Object obj) {
        this.W = State.Constraint.END_TO_END;
        this.N = obj;
        return this;
    }

    public ConstraintReference x0(float f10) {
        this.f18106z = f10;
        return this;
    }

    public ConstraintReference y(Object obj) {
        this.W = State.Constraint.END_TO_START;
        this.M = obj;
        return this;
    }

    public ConstraintReference y0(float f10) {
        this.A = f10;
        return this;
    }

    public ConstraintReference z0(float f10) {
        this.B = f10;
        return this;
    }
}
