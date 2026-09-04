package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.o;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {
    private static final boolean T0 = false;
    protected static final int U0 = 1;
    protected static final int V0 = 2;
    private static final boolean W0 = false;
    public static final int X0 = 0;
    public static final int Y0 = 1;
    public static final int Z0 = 2;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f18227a1 = 3;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f18228b1 = 4;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f18229c1 = -1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f18230d1 = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final int f18231e1 = 1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int f18232f1 = 2;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f18233g1 = 0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f18234h1 = 4;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f18235i1 = 8;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int f18236j1 = 0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final int f18237k1 = 1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final int f18238l1 = 2;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int f18239m1 = 0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final int f18240n1 = 1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final int f18241o1 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f18242p1 = 3;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private static final int f18243q1 = -2;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final int f18244r1 = 0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final int f18245s1 = 1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final int f18246t1 = 2;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final int f18247u1 = 3;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final int f18248v1 = 4;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    static final int f18249w1 = 0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    static final int f18250x1 = 1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static float f18251y1 = 0.5f;
    public int A;
    int A0;
    public float B;
    boolean B0;
    public int C;
    boolean C0;
    public int D;
    boolean D0;
    public float E;
    boolean E0;
    public boolean F;
    boolean F0;
    public boolean G;
    boolean G0;
    int H;
    boolean H0;
    float I;
    int I0;
    private int[] J;
    int J0;
    private float K;
    boolean K0;
    private boolean L;
    boolean L0;
    private boolean M;
    public float[] M0;
    private boolean N;
    protected ConstraintWidget[] N0;
    private int O;
    protected ConstraintWidget[] O0;
    private int P;
    ConstraintWidget P0;
    public ConstraintAnchor Q;
    ConstraintWidget Q0;
    public ConstraintAnchor R;
    public int R0;
    public ConstraintAnchor S;
    public int S0;
    public ConstraintAnchor T;
    public ConstraintAnchor U;
    ConstraintAnchor V;
    ConstraintAnchor W;
    public ConstraintAnchor X;
    public ConstraintAnchor[] Y;
    protected ArrayList<ConstraintAnchor> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18252a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean[] f18253a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WidgetRun[] f18254b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public DimensionBehaviour[] f18255b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f18256c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ConstraintWidget f18257c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f18258d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    int f18259d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.k f18260e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    int f18261e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.m f18262f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f18263f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f18264g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected int f18265g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f18266h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    protected int f18267h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18268i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    protected int f18269i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f18270j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    int f18271j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18272k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    int f18273k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f18274l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    protected int f18275l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18276m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected int f18277m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f18278n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    int f18279n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f18280o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    protected int f18281o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18282p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected int f18283p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18284q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    float f18285q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18286r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    float f18287r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f18288s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private Object f18289s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18290t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f18291t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18292u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f18293u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18294v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private String f18295v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18296w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private String f18297w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18298x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    int f18299x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f18300y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    int f18301y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f18302z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    int f18303z0;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f18305b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f18305b = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18305b[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18305b[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18305b[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f18304a = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18304a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18304a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18304a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18304a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18304a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18304a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18304a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18304a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        this.f18252a = false;
        this.f18254b = new WidgetRun[2];
        this.f18260e = null;
        this.f18262f = null;
        this.f18264g = new boolean[]{true, true};
        this.f18266h = false;
        this.f18268i = true;
        this.f18270j = false;
        this.f18272k = true;
        this.f18274l = -1;
        this.f18276m = -1;
        this.f18278n = new o(this);
        this.f18282p = false;
        this.f18284q = false;
        this.f18286r = false;
        this.f18288s = false;
        this.f18290t = -1;
        this.f18292u = -1;
        this.f18294v = 0;
        this.f18296w = 0;
        this.f18298x = 0;
        this.f18300y = new int[2];
        this.f18302z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = 0.0f;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.R = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.X = constraintAnchor;
        this.Y = new ConstraintAnchor[]{this.Q, this.S, this.R, this.T, this.U, constraintAnchor};
        this.Z = new ArrayList<>();
        this.f18253a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f18255b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f18257c0 = null;
        this.f18259d0 = 0;
        this.f18261e0 = 0;
        this.f18263f0 = 0.0f;
        this.f18265g0 = -1;
        this.f18267h0 = 0;
        this.f18269i0 = 0;
        this.f18271j0 = 0;
        this.f18273k0 = 0;
        this.f18275l0 = 0;
        this.f18277m0 = 0;
        this.f18279n0 = 0;
        float f10 = f18251y1;
        this.f18285q0 = f10;
        this.f18287r0 = f10;
        this.f18291t0 = 0;
        this.f18293u0 = 0;
        this.f18295v0 = null;
        this.f18297w0 = null;
        this.H0 = false;
        this.I0 = 0;
        this.J0 = 0;
        this.M0 = new float[]{-1.0f, -1.0f};
        this.N0 = new ConstraintWidget[]{null, null};
        this.O0 = new ConstraintWidget[]{null, null};
        this.P0 = null;
        this.Q0 = null;
        this.R0 = -1;
        this.S0 = -1;
        d();
    }

    public ConstraintWidget(int i10, int i11) {
        this(0, 0, i10, i11);
    }

    public ConstraintWidget(int i10, int i11, int i12, int i13) {
        this.f18252a = false;
        this.f18254b = new WidgetRun[2];
        this.f18260e = null;
        this.f18262f = null;
        this.f18264g = new boolean[]{true, true};
        this.f18266h = false;
        this.f18268i = true;
        this.f18270j = false;
        this.f18272k = true;
        this.f18274l = -1;
        this.f18276m = -1;
        this.f18278n = new o(this);
        this.f18282p = false;
        this.f18284q = false;
        this.f18286r = false;
        this.f18288s = false;
        this.f18290t = -1;
        this.f18292u = -1;
        this.f18294v = 0;
        this.f18296w = 0;
        this.f18298x = 0;
        this.f18300y = new int[2];
        this.f18302z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = 0.0f;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.R = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.X = constraintAnchor;
        this.Y = new ConstraintAnchor[]{this.Q, this.S, this.R, this.T, this.U, constraintAnchor};
        this.Z = new ArrayList<>();
        this.f18253a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f18255b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f18257c0 = null;
        this.f18263f0 = 0.0f;
        this.f18265g0 = -1;
        this.f18271j0 = 0;
        this.f18273k0 = 0;
        this.f18275l0 = 0;
        this.f18277m0 = 0;
        this.f18279n0 = 0;
        float f10 = f18251y1;
        this.f18285q0 = f10;
        this.f18287r0 = f10;
        this.f18291t0 = 0;
        this.f18293u0 = 0;
        this.f18295v0 = null;
        this.f18297w0 = null;
        this.H0 = false;
        this.I0 = 0;
        this.J0 = 0;
        this.M0 = new float[]{-1.0f, -1.0f};
        this.N0 = new ConstraintWidget[]{null, null};
        this.O0 = new ConstraintWidget[]{null, null};
        this.P0 = null;
        this.Q0 = null;
        this.R0 = -1;
        this.S0 = -1;
        this.f18267h0 = i10;
        this.f18269i0 = i11;
        this.f18259d0 = i12;
        this.f18261e0 = i13;
        d();
    }

    public ConstraintWidget(String str) {
        this.f18252a = false;
        this.f18254b = new WidgetRun[2];
        this.f18260e = null;
        this.f18262f = null;
        this.f18264g = new boolean[]{true, true};
        this.f18266h = false;
        this.f18268i = true;
        this.f18270j = false;
        this.f18272k = true;
        this.f18274l = -1;
        this.f18276m = -1;
        this.f18278n = new o(this);
        this.f18282p = false;
        this.f18284q = false;
        this.f18286r = false;
        this.f18288s = false;
        this.f18290t = -1;
        this.f18292u = -1;
        this.f18294v = 0;
        this.f18296w = 0;
        this.f18298x = 0;
        this.f18300y = new int[2];
        this.f18302z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = 0.0f;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.R = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.X = constraintAnchor;
        this.Y = new ConstraintAnchor[]{this.Q, this.S, this.R, this.T, this.U, constraintAnchor};
        this.Z = new ArrayList<>();
        this.f18253a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f18255b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f18257c0 = null;
        this.f18259d0 = 0;
        this.f18261e0 = 0;
        this.f18263f0 = 0.0f;
        this.f18265g0 = -1;
        this.f18267h0 = 0;
        this.f18269i0 = 0;
        this.f18271j0 = 0;
        this.f18273k0 = 0;
        this.f18275l0 = 0;
        this.f18277m0 = 0;
        this.f18279n0 = 0;
        float f10 = f18251y1;
        this.f18285q0 = f10;
        this.f18287r0 = f10;
        this.f18291t0 = 0;
        this.f18293u0 = 0;
        this.f18295v0 = null;
        this.f18297w0 = null;
        this.H0 = false;
        this.I0 = 0;
        this.J0 = 0;
        this.M0 = new float[]{-1.0f, -1.0f};
        this.N0 = new ConstraintWidget[]{null, null};
        this.O0 = new ConstraintWidget[]{null, null};
        this.P0 = null;
        this.Q0 = null;
        this.R0 = -1;
        this.S0 = -1;
        d();
        d1(str);
    }

    public ConstraintWidget(String str, int i10, int i11) {
        this(i10, i11);
        d1(str);
    }

    public ConstraintWidget(String str, int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13);
        d1(str);
    }

    private void V0(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f18222f == null) {
            return;
        }
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(constraintAnchor.f18222f);
        sb2.append("',");
        sb2.append(constraintAnchor.f18223g);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append(constraintAnchor.f18224h);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append(" ] ,\n");
    }

    private void W0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f11);
        sb2.append(",\n");
    }

    private void X0(StringBuilder sb2, ConstraintAnchor constraintAnchor, float f10) {
        if (constraintAnchor.f18222f == null) {
            return;
        }
        sb2.append("circle : [ '");
        sb2.append(constraintAnchor.f18222f);
        sb2.append("',");
        sb2.append(constraintAnchor.f18223g);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append(f10);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append(" ] ,\n");
    }

    private void Y0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    private void Z0(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        W0(sb2, UiKitSpanObj.TYPE_SIZE, i10, -2.14748365E9f);
        W0(sb2, org.apache.tools.ant.types.selectors.o.f136588l, i11, 0.0f);
        W0(sb2, org.apache.tools.ant.types.selectors.o.f136589m, i12, 2.14748365E9f);
        W0(sb2, "matchMin", i14, 0.0f);
        float f12 = i15;
        W0(sb2, "matchDef", f12, 0.0f);
        W0(sb2, "matchPercent", f12, 1.0f);
        sb2.append("},\n");
    }

    private void d() {
        this.Z.add(this.Q);
        this.Z.add(this.R);
        this.Z.add(this.S);
        this.Z.add(this.T);
        this.Z.add(this.V);
        this.Z.add(this.W);
        this.Z.add(this.X);
        this.Z.add(this.U);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0177  */
    /* JADX WARN: Code duplicated, block: B:103:0x017f  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:243:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:249:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:251:0x0404  */
    /* JADX WARN: Code duplicated, block: B:258:0x041d  */
    /* JADX WARN: Code duplicated, block: B:267:0x043f  */
    /* JADX WARN: Code duplicated, block: B:277:0x0457  */
    /* JADX WARN: Code duplicated, block: B:280:0x045d  */
    /* JADX WARN: Code duplicated, block: B:281:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:284:0x0465 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:287:0x046a  */
    /* JADX WARN: Code duplicated, block: B:290:0x0470  */
    /* JADX WARN: Code duplicated, block: B:292:0x0474  */
    /* JADX WARN: Code duplicated, block: B:295:0x0479  */
    /* JADX WARN: Code duplicated, block: B:297:0x047d  */
    /* JADX WARN: Code duplicated, block: B:299:0x0480  */
    /* JADX WARN: Code duplicated, block: B:302:0x0487  */
    /* JADX WARN: Code duplicated, block: B:304:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:308:0x0495  */
    /* JADX WARN: Code duplicated, block: B:311:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:313:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:314:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:316:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:318:0x04b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:326:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:371:0x0550  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x0113  */
    /* JADX WARN: Code duplicated, block: B:69:0x0116  */
    /* JADX WARN: Code duplicated, block: B:70:0x0118  */
    /* JADX WARN: Code duplicated, block: B:72:0x011b  */
    /* JADX WARN: Code duplicated, block: B:73:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:81:0x0131  */
    /* JADX WARN: Code duplicated, block: B:82:0x0133  */
    /* JADX WARN: Code duplicated, block: B:85:0x0138  */
    /* JADX WARN: Code duplicated, block: B:87:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0141  */
    /* JADX WARN: Code duplicated, block: B:90:0x0148  */
    /* JADX WARN: Code duplicated, block: B:93:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x014f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0156  */
    /* JADX WARN: Code duplicated, block: B:97:0x015e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0173  */
    private void i(androidx.constraintlayout.core.e eVar, boolean z10, boolean z11, boolean z12, boolean z13, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z14, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10, int i11, int i12, int i13, float f10, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15, int i16, int i17, float f11, boolean z20) {
        int i18;
        boolean z21;
        int iMin;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z22;
        boolean z23;
        ConstraintAnchor.Type typeL;
        ConstraintAnchor.Type type;
        SolverVariable solverVariableU;
        SolverVariable solverVariableU2;
        boolean z24;
        int i25;
        char c10;
        int i26;
        ConstraintAnchor constraintAnchor3;
        int i27;
        int i28;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        int i29;
        ConstraintWidget constraintWidget;
        boolean z29;
        ConstraintWidget constraintWidget2;
        int iMax;
        int i30;
        int i31;
        int iG;
        int iMin2;
        int i32;
        int i33;
        boolean z30;
        int i34;
        int i35;
        int i36;
        boolean z31;
        int i37;
        boolean z32;
        ConstraintWidget constraintWidget3;
        int i38;
        ConstraintWidget constraintWidget4;
        SolverVariable solverVariableU3 = eVar.u(constraintAnchor);
        SolverVariable solverVariableU4 = eVar.u(constraintAnchor2);
        SolverVariable solverVariableU5 = eVar.u(constraintAnchor.k());
        SolverVariable solverVariableU6 = eVar.u(constraintAnchor2.k());
        if (androidx.constraintlayout.core.e.L() != null) {
            androidx.constraintlayout.core.e.L().H++;
        }
        boolean zP = constraintAnchor.p();
        boolean zP2 = constraintAnchor2.p();
        boolean zP3 = this.X.p();
        int i39 = zP2 ? (zP ? 1 : 0) + 1 : zP ? 1 : 0;
        if (zP3) {
            i39++;
        }
        int i40 = z15 ? 3 : i14;
        int i41 = a.f18305b[dimensionBehaviour.ordinal()];
        if (i41 != 1 && i41 != 2 && i41 != 3 && i41 == 4) {
            i18 = i40;
            z21 = i18 != 4;
            iMin = this.f18274l;
            if (iMin == -1 && z10) {
                this.f18274l = -1;
                z21 = false;
            } else {
                iMin = i11;
            }
            i19 = this.f18276m;
            if (i19 != -1 && !z10) {
                this.f18276m = -1;
                iMin = i19;
                z21 = false;
            }
            if (this.f18293u0 == 8) {
                iMin = 0;
                z21 = false;
            }
            if (z20) {
                if (zP && !zP2 && !zP3) {
                    eVar.f(solverVariableU3, i10);
                } else if (zP && !zP2) {
                    eVar.e(solverVariableU3, solverVariableU5, constraintAnchor.g(), 8);
                }
            }
            if (!z21) {
                if (z14) {
                    eVar.e(solverVariableU4, solverVariableU3, 0, 3);
                    if (i12 > 0) {
                        eVar.i(solverVariableU4, solverVariableU3, i12, 8);
                    }
                    if (i13 < Integer.MAX_VALUE) {
                        eVar.k(solverVariableU4, solverVariableU3, i13, 8);
                    }
                } else {
                    eVar.e(solverVariableU4, solverVariableU3, iMin, 8);
                }
                i21 = i17;
                i23 = i39;
                z22 = z21;
                z23 = z13;
                i24 = i16;
            } else if (i39 == 2 && !z15 && (i18 == 1 || i18 == 0)) {
                int iMax2 = Math.max(i16, iMin);
                if (i17 > 0) {
                    iMax2 = Math.min(i17, iMax2);
                }
                eVar.e(solverVariableU4, solverVariableU3, iMax2, 8);
                z23 = z13;
                i21 = i17;
                i23 = i39;
                z22 = false;
                i24 = i16;
            } else {
                if (i16 == -2) {
                    i20 = iMin;
                } else {
                    i20 = i16;
                }
                if (i17 == -2) {
                    i21 = iMin;
                } else {
                    i21 = i17;
                }
                if (iMin > 0 && i18 != 1) {
                    iMin = 0;
                }
                if (i20 > 0) {
                    eVar.i(solverVariableU4, solverVariableU3, i20, 8);
                    iMin = Math.max(iMin, i20);
                }
                if (i21 > 0) {
                    if (z11 || i18 != 1) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (z24) {
                        i22 = 8;
                        eVar.k(solverVariableU4, solverVariableU3, i21, 8);
                    } else {
                        i22 = 8;
                    }
                    iMin = Math.min(iMin, i21);
                } else {
                    i22 = 8;
                }
                if (i18 == 1) {
                    if (z11) {
                        eVar.e(solverVariableU4, solverVariableU3, iMin, i22);
                    } else if (z17) {
                        eVar.e(solverVariableU4, solverVariableU3, iMin, 5);
                        eVar.k(solverVariableU4, solverVariableU3, iMin, i22);
                    } else {
                        eVar.e(solverVariableU4, solverVariableU3, iMin, 5);
                        eVar.k(solverVariableU4, solverVariableU3, iMin, i22);
                    }
                    i23 = i39;
                    z22 = z21;
                    z23 = z13;
                    i24 = i20;
                } else if (i18 == 2) {
                    typeL = constraintAnchor.l();
                    type = ConstraintAnchor.Type.TOP;
                    if (typeL != type || constraintAnchor.l() == ConstraintAnchor.Type.BOTTOM) {
                        solverVariableU = eVar.u(this.f18257c0.r(type));
                        solverVariableU2 = eVar.u(this.f18257c0.r(ConstraintAnchor.Type.BOTTOM));
                    } else {
                        solverVariableU = eVar.u(this.f18257c0.r(ConstraintAnchor.Type.LEFT));
                        solverVariableU2 = eVar.u(this.f18257c0.r(ConstraintAnchor.Type.RIGHT));
                    }
                    SolverVariable solverVariable3 = solverVariableU;
                    androidx.constraintlayout.core.b bVarV = eVar.v();
                    i23 = i39 == true ? 1 : 0;
                    i24 = i20;
                    eVar.d(bVarV.n(solverVariableU4, solverVariableU3, solverVariableU2, solverVariable3, f11));
                    if (z11) {
                        z21 = false;
                    }
                    z22 = z21;
                    z23 = z13;
                } else {
                    i23 = i39;
                    i24 = i20;
                    z22 = z21;
                    z23 = true;
                }
            }
            if (z20 || z17) {
                i25 = 0;
                c10 = 2;
                if (i23 >= c10 && z11 && z23) {
                    eVar.i(solverVariableU3, solverVariable, i25, 8);
                    int i42 = (z10 || this.U.f18222f == null) ? 1 : i25;
                    if (z10 || (constraintAnchor3 = this.U.f18222f) == null) {
                        i26 = i42;
                    } else {
                        ConstraintWidget constraintWidget5 = constraintAnchor3.f18220d;
                        if (constraintWidget5.f18263f0 != 0.0f) {
                            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget5.f18255b0;
                            DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[i25];
                            DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                            if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
                                i26 = 1;
                            } else {
                                i26 = i25;
                            }
                        } else {
                            i26 = i25;
                        }
                    }
                    if (i26 != 0) {
                        eVar.i(solverVariable2, solverVariableU4, i25, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zP || zP2 || zP3) {
                if (!zP || zP2) {
                    if (zP || !zP2) {
                        if (zP && zP2) {
                            ConstraintWidget constraintWidget6 = constraintAnchor.f18222f.f18220d;
                            ConstraintWidget constraintWidget7 = constraintAnchor2.f18222f.f18220d;
                            ConstraintWidget constraintWidgetU = U();
                            int i43 = 6;
                            if (z22) {
                                if (i18 == 0) {
                                    if (i21 != 0 || i24 != 0) {
                                        z31 = false;
                                        i35 = 5;
                                        i37 = 5;
                                        z32 = true;
                                        z25 = true;
                                    } else if (solverVariableU5.f17270h && solverVariableU6.f17270h) {
                                        eVar.e(solverVariableU3, solverVariableU5, constraintAnchor.g(), 8);
                                        eVar.e(solverVariableU4, solverVariableU6, -constraintAnchor2.g(), 8);
                                        return;
                                    } else {
                                        z32 = false;
                                        z25 = false;
                                        i35 = 8;
                                        i37 = 8;
                                        z31 = true;
                                    }
                                    if ((constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget7 instanceof androidx.constraintlayout.core.widgets.a)) {
                                        solverVariable2 = solverVariable2;
                                        i27 = i35;
                                        i43 = 6;
                                        z27 = z31;
                                        z26 = z32;
                                        i28 = 4;
                                    } else {
                                        z27 = z31;
                                        z26 = z32;
                                        i28 = i37;
                                        i27 = i35;
                                        i43 = 6;
                                    }
                                } else if (i18 == 2) {
                                    if (!(constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) && !(constraintWidget7 instanceof androidx.constraintlayout.core.widgets.a)) {
                                        solverVariable2 = solverVariable2;
                                        i43 = 6;
                                        i27 = 5;
                                        i28 = 5;
                                    }
                                    z26 = true;
                                    z25 = true;
                                    z27 = false;
                                } else if (i18 == 1) {
                                    i27 = 8;
                                    i28 = 4;
                                    z26 = true;
                                    z25 = true;
                                    z27 = false;
                                } else if (i18 == 3) {
                                    if (this.H == -1) {
                                        if (z18) {
                                            solverVariable2 = solverVariable2;
                                            i43 = z11 ? 5 : 4;
                                        } else {
                                            solverVariable2 = solverVariable2;
                                            i43 = 8;
                                        }
                                        i27 = 8;
                                    } else if (z15) {
                                        if (i15 == 2 || i15 == 1) {
                                            i35 = 5;
                                            i36 = 4;
                                        } else {
                                            i35 = 8;
                                            i36 = 5;
                                        }
                                        i28 = i36;
                                        z26 = true;
                                        z25 = true;
                                        z27 = true;
                                        i27 = i35;
                                        i43 = 6;
                                    } else {
                                        if (i21 > 0) {
                                            solverVariable2 = solverVariable2;
                                            i43 = 6;
                                            i27 = 5;
                                        } else {
                                            if (i21 != 0 || i24 != 0) {
                                                i27 = 5;
                                            } else if (z18) {
                                                i27 = (constraintWidget6 == constraintWidgetU || constraintWidget7 == constraintWidgetU) ? 5 : 4;
                                            } else {
                                                solverVariable2 = solverVariable2;
                                                i43 = 6;
                                                i27 = 5;
                                                i28 = 8;
                                            }
                                            i28 = 4;
                                        }
                                        z26 = true;
                                        z25 = true;
                                        z27 = true;
                                    }
                                    i28 = 5;
                                    z26 = true;
                                    z25 = true;
                                    z27 = true;
                                } else {
                                    solverVariable2 = solverVariable2;
                                    i43 = 6;
                                    i27 = 5;
                                    i28 = 4;
                                    z26 = false;
                                    z25 = false;
                                    z27 = false;
                                }
                                if (z25 || solverVariableU5 != solverVariableU6 || constraintWidget6 == constraintWidgetU) {
                                    z28 = true;
                                } else {
                                    z25 = false;
                                    z28 = false;
                                }
                                if (z26) {
                                    if (z22 && !z16 && !z18 && solverVariableU5 == solverVariable && solverVariableU6 == solverVariable2) {
                                        z29 = false;
                                        i34 = 8;
                                        i33 = 8;
                                        z30 = false;
                                    } else {
                                        z29 = z11;
                                        i33 = i43;
                                        z30 = z28;
                                        i34 = i27;
                                    }
                                    i29 = i18;
                                    constraintWidget = constraintWidgetU;
                                    eVar.c(solverVariableU3, solverVariableU5, constraintAnchor.g(), f10, solverVariableU6, solverVariableU4, constraintAnchor2.g(), i33);
                                    i27 = i34;
                                    z28 = z30;
                                } else {
                                    i29 = i18;
                                    constraintWidget = constraintWidgetU;
                                    z29 = z11;
                                }
                                if (this.f18293u0 != 8 && !constraintAnchor2.n()) {
                                    return;
                                }
                                if (z25) {
                                    if (z29 && solverVariableU5 != solverVariableU6 && !z22 && ((constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget7 instanceof androidx.constraintlayout.core.widgets.a))) {
                                        i27 = 6;
                                    }
                                    eVar.i(solverVariableU3, solverVariableU5, constraintAnchor.g(), i27);
                                    solverVariableU4 = solverVariableU4;
                                    eVar.k(solverVariableU4, solverVariableU6, -constraintAnchor2.g(), i27);
                                } else {
                                    solverVariableU4 = solverVariableU4;
                                }
                                if (z29 || !z19 || (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget7 instanceof androidx.constraintlayout.core.widgets.a)) {
                                    constraintWidget2 = constraintWidget;
                                } else {
                                    constraintWidget2 = constraintWidget;
                                    if (constraintWidget7 != constraintWidget2) {
                                        i27 = 6;
                                        iMax = 6;
                                        z28 = true;
                                    }
                                    if (z28) {
                                        if (z27 && (!z18 || z12)) {
                                            if (constraintWidget6 != constraintWidget2 || constraintWidget7 == constraintWidget2) {
                                                i32 = 6;
                                            } else {
                                                i32 = iMax;
                                            }
                                            if ((constraintWidget6 instanceof f) || (constraintWidget7 instanceof f)) {
                                                i32 = 5;
                                            }
                                            if ((constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget7 instanceof androidx.constraintlayout.core.widgets.a)) {
                                                i32 = 5;
                                            }
                                            if (z18) {
                                                i32 = 5;
                                            }
                                            iMax = Math.max(i32, iMax);
                                        }
                                        if (z29) {
                                            iMin2 = Math.min(i27, iMax);
                                            if (z15 || z18 || !(constraintWidget6 == constraintWidget2 || constraintWidget7 == constraintWidget2)) {
                                                iMax = iMin2;
                                            } else {
                                                iMax = 4;
                                            }
                                        }
                                        eVar.e(solverVariableU3, solverVariableU5, constraintAnchor.g(), iMax);
                                        eVar.e(solverVariableU4, solverVariableU6, -constraintAnchor2.g(), iMax);
                                    }
                                    if (z29) {
                                        if (solverVariable == solverVariableU5) {
                                            iG = constraintAnchor.g();
                                        } else {
                                            iG = 0;
                                        }
                                        if (solverVariableU5 != solverVariable) {
                                            eVar.i(solverVariableU3, solverVariable, iG, 5);
                                        }
                                    }
                                    if (z29 || !z22 || i12 != 0 || i24 != 0) {
                                        i30 = 5;
                                        i31 = 0;
                                    } else if (z22 && i29 == 3) {
                                        i31 = 0;
                                        eVar.i(solverVariableU4, solverVariableU3, 0, 8);
                                        i30 = 5;
                                    } else {
                                        i31 = 0;
                                        i30 = 5;
                                        eVar.i(solverVariableU4, solverVariableU3, 0, 5);
                                    }
                                }
                                iMax = i28;
                                if (z28) {
                                    if (z27) {
                                        if (constraintWidget6 != constraintWidget2) {
                                            i32 = 6;
                                        } else {
                                            i32 = 6;
                                        }
                                        if (constraintWidget6 instanceof f) {
                                            i32 = 5;
                                        } else {
                                            i32 = 5;
                                        }
                                        if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) {
                                            i32 = 5;
                                        } else {
                                            i32 = 5;
                                        }
                                        if (z18) {
                                            i32 = 5;
                                        }
                                        iMax = Math.max(i32, iMax);
                                    }
                                    if (z29) {
                                        iMin2 = Math.min(i27, iMax);
                                        if (z15) {
                                            iMax = iMin2;
                                        } else {
                                            iMax = iMin2;
                                        }
                                    }
                                    eVar.e(solverVariableU3, solverVariableU5, constraintAnchor.g(), iMax);
                                    eVar.e(solverVariableU4, solverVariableU6, -constraintAnchor2.g(), iMax);
                                }
                                if (z29) {
                                    if (solverVariable == solverVariableU5) {
                                        iG = constraintAnchor.g();
                                    } else {
                                        iG = 0;
                                    }
                                    if (solverVariableU5 != solverVariable) {
                                        eVar.i(solverVariableU3, solverVariable, iG, 5);
                                    }
                                }
                                if (z29) {
                                    i30 = 5;
                                    i31 = 0;
                                } else {
                                    i30 = 5;
                                    i31 = 0;
                                }
                            } else if (solverVariableU5.f17270h && solverVariableU6.f17270h) {
                                eVar.c(solverVariableU3, solverVariableU5, constraintAnchor.g(), f10, solverVariableU6, solverVariableU4, constraintAnchor2.g(), 8);
                                if (z11 && z23) {
                                    int iG2 = constraintAnchor2.f18222f != null ? constraintAnchor2.g() : 0;
                                    if (solverVariableU6 != solverVariable2) {
                                        eVar.i(solverVariable2, solverVariableU4, iG2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i27 = 5;
                            i28 = 4;
                            z26 = true;
                            z25 = true;
                            z27 = false;
                            if (z25) {
                                z28 = true;
                            } else {
                                z28 = true;
                            }
                            if (z26) {
                                if (z22) {
                                    z29 = z11;
                                    i33 = i43;
                                    z30 = z28;
                                    i34 = i27;
                                } else {
                                    z29 = z11;
                                    i33 = i43;
                                    z30 = z28;
                                    i34 = i27;
                                }
                                i29 = i18;
                                constraintWidget = constraintWidgetU;
                                eVar.c(solverVariableU3, solverVariableU5, constraintAnchor.g(), f10, solverVariableU6, solverVariableU4, constraintAnchor2.g(), i33);
                                i27 = i34;
                                z28 = z30;
                            } else {
                                i29 = i18;
                                constraintWidget = constraintWidgetU;
                                z29 = z11;
                            }
                            if (this.f18293u0 != 8) {
                            }
                            if (z25) {
                                if (z29) {
                                    i27 = 6;
                                }
                                eVar.i(solverVariableU3, solverVariableU5, constraintAnchor.g(), i27);
                                solverVariableU4 = solverVariableU4;
                                eVar.k(solverVariableU4, solverVariableU6, -constraintAnchor2.g(), i27);
                            } else {
                                solverVariableU4 = solverVariableU4;
                            }
                            if (z29) {
                                constraintWidget2 = constraintWidget;
                                iMax = i28;
                            } else {
                                constraintWidget2 = constraintWidget;
                                iMax = i28;
                            }
                            if (z28) {
                                if (z27) {
                                    if (constraintWidget6 != constraintWidget2) {
                                        i32 = 6;
                                    } else {
                                        i32 = 6;
                                    }
                                    if (constraintWidget6 instanceof f) {
                                        i32 = 5;
                                    } else {
                                        i32 = 5;
                                    }
                                    if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) {
                                        i32 = 5;
                                    } else {
                                        i32 = 5;
                                    }
                                    if (z18) {
                                        i32 = 5;
                                    }
                                    iMax = Math.max(i32, iMax);
                                }
                                if (z29) {
                                    iMin2 = Math.min(i27, iMax);
                                    if (z15) {
                                        iMax = iMin2;
                                    } else {
                                        iMax = iMin2;
                                    }
                                }
                                eVar.e(solverVariableU3, solverVariableU5, constraintAnchor.g(), iMax);
                                eVar.e(solverVariableU4, solverVariableU6, -constraintAnchor2.g(), iMax);
                            }
                            if (z29) {
                                if (solverVariable == solverVariableU5) {
                                    iG = constraintAnchor.g();
                                } else {
                                    iG = 0;
                                }
                                if (solverVariableU5 != solverVariable) {
                                    eVar.i(solverVariableU3, solverVariable, iG, 5);
                                }
                            }
                            if (z29) {
                                i30 = 5;
                                i31 = 0;
                            } else {
                                i30 = 5;
                                i31 = 0;
                            }
                        }
                        i38 = i30;
                    } else {
                        eVar.e(solverVariableU4, solverVariableU6, -constraintAnchor2.g(), 8);
                        if (z11) {
                            if (this.f18270j && solverVariableU3.f17270h && (constraintWidget3 = this.f18257c0) != null) {
                                d dVar = (d) constraintWidget3;
                                if (z10) {
                                    dVar.o2(constraintAnchor);
                                } else {
                                    dVar.t2(constraintAnchor);
                                }
                            } else {
                                i30 = 5;
                                eVar.i(solverVariableU3, solverVariable, 0, 5);
                                i31 = 0;
                            }
                        }
                    }
                    i31 = 0;
                    i30 = 5;
                } else {
                    z29 = z11;
                    i31 = 0;
                    i38 = (z11 && (constraintAnchor.f18222f.f18220d instanceof androidx.constraintlayout.core.widgets.a)) ? 8 : 5;
                    solverVariableU4 = solverVariableU4;
                }
                if (z29 || !z23) {
                    return;
                }
                int iG3 = constraintAnchor2.f18222f != null ? constraintAnchor2.g() : i31;
                if (solverVariableU6 != solverVariable2) {
                    if (!this.f18270j || !solverVariableU4.f17270h || (constraintWidget4 = this.f18257c0) == null) {
                        eVar.i(solverVariable2, solverVariableU4, iG3, i38);
                        return;
                    }
                    d dVar2 = (d) constraintWidget4;
                    if (z10) {
                        dVar2.n2(constraintAnchor2);
                        return;
                    } else {
                        dVar2.s2(constraintAnchor2);
                        return;
                    }
                }
                return;
            }
            i30 = 5;
            i31 = 0;
            z29 = z11;
            i38 = i30;
            if (z29) {
                return;
            } else {
                return;
            }
        }
        i18 = i40;
        iMin = this.f18274l;
        if (iMin == -1) {
            iMin = i11;
        } else {
            iMin = i11;
        }
        i19 = this.f18276m;
        if (i19 != -1) {
            this.f18276m = -1;
            iMin = i19;
            z21 = false;
        }
        if (this.f18293u0 == 8) {
            iMin = 0;
            z21 = false;
        }
        if (z20) {
            if (zP) {
                if (zP) {
                    eVar.e(solverVariableU3, solverVariableU5, constraintAnchor.g(), 8);
                }
            } else if (zP) {
                eVar.e(solverVariableU3, solverVariableU5, constraintAnchor.g(), 8);
            }
        }
        if (!z21) {
            if (z14) {
                eVar.e(solverVariableU4, solverVariableU3, 0, 3);
                if (i12 > 0) {
                    eVar.i(solverVariableU4, solverVariableU3, i12, 8);
                }
                if (i13 < Integer.MAX_VALUE) {
                    eVar.k(solverVariableU4, solverVariableU3, i13, 8);
                }
            } else {
                eVar.e(solverVariableU4, solverVariableU3, iMin, 8);
            }
            i21 = i17;
            i23 = i39;
            z22 = z21;
            z23 = z13;
            i24 = i16;
        } else if (i39 == 2) {
            if (i16 == -2) {
                i20 = iMin;
            } else {
                i20 = i16;
            }
            if (i17 == -2) {
                i21 = iMin;
            } else {
                i21 = i17;
            }
            if (iMin > 0) {
                iMin = 0;
            }
            if (i20 > 0) {
                eVar.i(solverVariableU4, solverVariableU3, i20, 8);
                iMin = Math.max(iMin, i20);
            }
            if (i21 > 0) {
                if (z11) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (z24) {
                    i22 = 8;
                    eVar.k(solverVariableU4, solverVariableU3, i21, 8);
                } else {
                    i22 = 8;
                }
                iMin = Math.min(iMin, i21);
            } else {
                i22 = 8;
            }
            if (i18 == 1) {
                if (z11) {
                    eVar.e(solverVariableU4, solverVariableU3, iMin, i22);
                } else if (z17) {
                    eVar.e(solverVariableU4, solverVariableU3, iMin, 5);
                    eVar.k(solverVariableU4, solverVariableU3, iMin, i22);
                } else {
                    eVar.e(solverVariableU4, solverVariableU3, iMin, 5);
                    eVar.k(solverVariableU4, solverVariableU3, iMin, i22);
                }
                i23 = i39;
                z22 = z21;
                z23 = z13;
                i24 = i20;
            } else if (i18 == 2) {
                typeL = constraintAnchor.l();
                type = ConstraintAnchor.Type.TOP;
                if (typeL != type) {
                    solverVariableU = eVar.u(this.f18257c0.r(type));
                    solverVariableU2 = eVar.u(this.f18257c0.r(ConstraintAnchor.Type.BOTTOM));
                } else {
                    solverVariableU = eVar.u(this.f18257c0.r(type));
                    solverVariableU2 = eVar.u(this.f18257c0.r(ConstraintAnchor.Type.BOTTOM));
                }
                SolverVariable solverVariable4 = solverVariableU;
                androidx.constraintlayout.core.b bVarV2 = eVar.v();
                i23 = i39 == true ? 1 : 0;
                i24 = i20;
                eVar.d(bVarV2.n(solverVariableU4, solverVariableU3, solverVariableU2, solverVariable4, f11));
                if (z11) {
                    z21 = false;
                }
                z22 = z21;
                z23 = z13;
            } else {
                i23 = i39;
                i24 = i20;
                z22 = z21;
                z23 = true;
            }
        } else {
            if (i16 == -2) {
                i20 = iMin;
            } else {
                i20 = i16;
            }
            if (i17 == -2) {
                i21 = iMin;
            } else {
                i21 = i17;
            }
            if (iMin > 0) {
                iMin = 0;
            }
            if (i20 > 0) {
                eVar.i(solverVariableU4, solverVariableU3, i20, 8);
                iMin = Math.max(iMin, i20);
            }
            if (i21 > 0) {
                if (z11) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (z24) {
                    i22 = 8;
                    eVar.k(solverVariableU4, solverVariableU3, i21, 8);
                } else {
                    i22 = 8;
                }
                iMin = Math.min(iMin, i21);
            } else {
                i22 = 8;
            }
            if (i18 == 1) {
                if (z11) {
                    eVar.e(solverVariableU4, solverVariableU3, iMin, i22);
                } else if (z17) {
                    eVar.e(solverVariableU4, solverVariableU3, iMin, 5);
                    eVar.k(solverVariableU4, solverVariableU3, iMin, i22);
                } else {
                    eVar.e(solverVariableU4, solverVariableU3, iMin, 5);
                    eVar.k(solverVariableU4, solverVariableU3, iMin, i22);
                }
                i23 = i39;
                z22 = z21;
                z23 = z13;
                i24 = i20;
            } else if (i18 == 2) {
                typeL = constraintAnchor.l();
                type = ConstraintAnchor.Type.TOP;
                if (typeL != type) {
                    solverVariableU = eVar.u(this.f18257c0.r(type));
                    solverVariableU2 = eVar.u(this.f18257c0.r(ConstraintAnchor.Type.BOTTOM));
                } else {
                    solverVariableU = eVar.u(this.f18257c0.r(type));
                    solverVariableU2 = eVar.u(this.f18257c0.r(ConstraintAnchor.Type.BOTTOM));
                }
                SolverVariable solverVariable5 = solverVariableU;
                androidx.constraintlayout.core.b bVarV3 = eVar.v();
                i23 = i39 == true ? 1 : 0;
                i24 = i20;
                eVar.d(bVarV3.n(solverVariableU4, solverVariableU3, solverVariableU2, solverVariable5, f11));
                if (z11) {
                    z21 = false;
                }
                z22 = z21;
                z23 = z13;
            } else {
                i23 = i39;
                i24 = i20;
                z22 = z21;
                z23 = true;
            }
        }
        if (z20) {
            i25 = 0;
            c10 = 2;
        } else {
            i25 = 0;
            c10 = 2;
        }
        if (i23 >= c10) {
        }
    }

    private boolean t0(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i11 = i10 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.Y;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i11];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f18222f;
        return (constraintAnchor4 == null || constraintAnchor4.f18222f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i11 + 1]).f18222f) == null || constraintAnchor2.f18222f != constraintAnchor) ? false : true;
    }

    public float A() {
        return this.f18263f0;
    }

    public boolean A0() {
        return this.N;
    }

    protected void A1(int i10, boolean z10) {
        this.f18253a0[i10] = z10;
    }

    public int B() {
        return this.f18265g0;
    }

    public boolean B0() {
        return this.f18268i && this.f18293u0 != 8;
    }

    public void B1(boolean z10) {
        this.M = z10;
    }

    public boolean C() {
        return this.L;
    }

    public boolean C0() {
        return this.f18282p || (this.Q.o() && this.S.o());
    }

    public void C1(boolean z10) {
        this.N = z10;
    }

    public int D() {
        if (this.f18293u0 == 8) {
            return 0;
        }
        return this.f18261e0;
    }

    public boolean D0() {
        return this.f18284q || (this.R.o() && this.T.o());
    }

    public void D1(int i10, int i11) {
        this.O = i10;
        this.P = i11;
        H1(false);
    }

    public float E() {
        return this.f18285q0;
    }

    public boolean E0() {
        return this.f18257c0 == null;
    }

    public void E1(int i10, int i11) {
        if (i11 == 0) {
            W1(i10);
        } else if (i11 == 1) {
            s1(i10);
        }
    }

    public ConstraintWidget F() {
        if (!x0()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor constraintAnchorR = constraintWidget.r(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor constraintAnchorK = constraintAnchorR == null ? null : constraintAnchorR.k();
            ConstraintWidget constraintWidgetI = constraintAnchorK == null ? null : constraintAnchorK.i();
            if (constraintWidgetI == U()) {
                return constraintWidget;
            }
            ConstraintAnchor constraintAnchorK2 = constraintWidgetI == null ? null : constraintWidgetI.r(ConstraintAnchor.Type.RIGHT).k();
            if (constraintAnchorK2 == null || constraintAnchorK2.i() == constraintWidget) {
                constraintWidget = constraintWidgetI;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public boolean F0() {
        return this.f18298x == 0 && this.f18263f0 == 0.0f && this.C == 0 && this.D == 0 && this.f18255b0[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void F1(int i10) {
        this.J[1] = i10;
    }

    public int G() {
        return this.I0;
    }

    public boolean G0() {
        return this.f18296w == 0 && this.f18263f0 == 0.0f && this.f18302z == 0 && this.A == 0 && this.f18255b0[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void G1(int i10) {
        this.J[0] = i10;
    }

    public DimensionBehaviour H() {
        return this.f18255b0[0];
    }

    public boolean H0() {
        return this.f18288s;
    }

    public void H1(boolean z10) {
        this.f18268i = z10;
    }

    public int I() {
        ConstraintAnchor constraintAnchor = this.Q;
        int i10 = constraintAnchor != null ? 0 + constraintAnchor.f18223g : 0;
        ConstraintAnchor constraintAnchor2 = this.S;
        return constraintAnchor2 != null ? i10 + constraintAnchor2.f18223g : i10;
    }

    public boolean I0() {
        return this.F;
    }

    public void I1(int i10) {
        if (i10 < 0) {
            this.f18283p0 = 0;
        } else {
            this.f18283p0 = i10;
        }
    }

    public int J() {
        return this.O;
    }

    public void J0() {
        this.f18286r = true;
    }

    public void J1(int i10) {
        if (i10 < 0) {
            this.f18281o0 = 0;
        } else {
            this.f18281o0 = i10;
        }
    }

    public int K() {
        return this.P;
    }

    public void K0() {
        this.f18288s = true;
    }

    public void K1(int i10, int i11) {
        this.f18275l0 = i10;
        this.f18277m0 = i11;
    }

    public int L() {
        return l0();
    }

    public boolean L0(int i10) {
        char c10 = i10 == 0 ? (char) 1 : (char) 0;
        DimensionBehaviour[] dimensionBehaviourArr = this.f18255b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i10];
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[c10];
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour3 && dimensionBehaviour2 == dimensionBehaviour3;
    }

    public void L1(int i10, int i11) {
        this.f18267h0 = i10;
        this.f18269i0 = i11;
    }

    public int M(int i10) {
        if (i10 == 0) {
            return j0();
        }
        if (i10 == 1) {
            return D();
        }
        return 0;
    }

    public boolean M0() {
        DimensionBehaviour[] dimensionBehaviourArr = this.f18255b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public void M1(ConstraintWidget constraintWidget) {
        this.f18257c0 = constraintWidget;
    }

    public int N() {
        return this.J[1];
    }

    public void N0() {
        this.Q.x();
        this.R.x();
        this.S.x();
        this.T.x();
        this.U.x();
        this.V.x();
        this.W.x();
        this.X.x();
        this.f18257c0 = null;
        this.K = 0.0f;
        this.f18259d0 = 0;
        this.f18261e0 = 0;
        this.f18263f0 = 0.0f;
        this.f18265g0 = -1;
        this.f18267h0 = 0;
        this.f18269i0 = 0;
        this.f18275l0 = 0;
        this.f18277m0 = 0;
        this.f18279n0 = 0;
        this.f18281o0 = 0;
        this.f18283p0 = 0;
        float f10 = f18251y1;
        this.f18285q0 = f10;
        this.f18287r0 = f10;
        DimensionBehaviour[] dimensionBehaviourArr = this.f18255b0;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f18289s0 = null;
        this.f18291t0 = 0;
        this.f18293u0 = 0;
        this.f18297w0 = null;
        this.F0 = false;
        this.G0 = false;
        this.I0 = 0;
        this.J0 = 0;
        this.K0 = false;
        this.L0 = false;
        float[] fArr = this.M0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f18290t = -1;
        this.f18292u = -1;
        int[] iArr = this.J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f18296w = 0;
        this.f18298x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f18302z = 0;
        this.C = 0;
        this.f18266h = false;
        this.H = -1;
        this.I = 1.0f;
        this.H0 = false;
        boolean[] zArr = this.f18264g;
        zArr[0] = true;
        zArr[1] = true;
        this.N = false;
        boolean[] zArr2 = this.f18253a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f18268i = true;
        int[] iArr2 = this.f18300y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f18274l = -1;
        this.f18276m = -1;
    }

    void N1(int i10, int i11) {
        if (i11 == 0) {
            this.f18271j0 = i10;
        } else if (i11 == 1) {
            this.f18273k0 = i10;
        }
    }

    public int O() {
        return this.J[0];
    }

    public void O0() {
        Q0();
        P1(f18251y1);
        u1(f18251y1);
    }

    public void O1(String str) {
        this.f18297w0 = str;
    }

    public int P() {
        return this.f18283p0;
    }

    public void P0(ConstraintAnchor constraintAnchor) {
        if (U() != null && (U() instanceof d) && ((d) U()).E2()) {
            return;
        }
        ConstraintAnchor constraintAnchorR = r(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorR2 = r(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor constraintAnchorR3 = r(ConstraintAnchor.Type.TOP);
        ConstraintAnchor constraintAnchorR4 = r(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor constraintAnchorR5 = r(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor constraintAnchorR6 = r(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor constraintAnchorR7 = r(ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == constraintAnchorR5) {
            if (constraintAnchorR.p() && constraintAnchorR2.p() && constraintAnchorR.k() == constraintAnchorR2.k()) {
                constraintAnchorR.x();
                constraintAnchorR2.x();
            }
            if (constraintAnchorR3.p() && constraintAnchorR4.p() && constraintAnchorR3.k() == constraintAnchorR4.k()) {
                constraintAnchorR3.x();
                constraintAnchorR4.x();
            }
            this.f18285q0 = 0.5f;
            this.f18287r0 = 0.5f;
        } else if (constraintAnchor == constraintAnchorR6) {
            if (constraintAnchorR.p() && constraintAnchorR2.p() && constraintAnchorR.k().i() == constraintAnchorR2.k().i()) {
                constraintAnchorR.x();
                constraintAnchorR2.x();
            }
            this.f18285q0 = 0.5f;
        } else if (constraintAnchor == constraintAnchorR7) {
            if (constraintAnchorR3.p() && constraintAnchorR4.p() && constraintAnchorR3.k().i() == constraintAnchorR4.k().i()) {
                constraintAnchorR3.x();
                constraintAnchorR4.x();
            }
            this.f18287r0 = 0.5f;
        } else if (constraintAnchor == constraintAnchorR || constraintAnchor == constraintAnchorR2) {
            if (constraintAnchorR.p() && constraintAnchorR.k() == constraintAnchorR2.k()) {
                constraintAnchorR5.x();
            }
        } else if ((constraintAnchor == constraintAnchorR3 || constraintAnchor == constraintAnchorR4) && constraintAnchorR3.p() && constraintAnchorR3.k() == constraintAnchorR4.k()) {
            constraintAnchorR5.x();
        }
        constraintAnchor.x();
    }

    public void P1(float f10) {
        this.f18287r0 = f10;
    }

    public int Q() {
        return this.f18281o0;
    }

    public void Q0() {
        ConstraintWidget constraintWidgetU = U();
        if (constraintWidgetU != null && (constraintWidgetU instanceof d) && ((d) U()).E2()) {
            return;
        }
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Z.get(i10).x();
        }
    }

    public void Q1(int i10) {
        this.J0 = i10;
    }

    public ConstraintWidget R(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 != 0) {
            if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.T).f18222f) != null && constraintAnchor2.f18222f == constraintAnchor) {
                return constraintAnchor2.f18220d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.S;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f18222f;
        if (constraintAnchor4 == null || constraintAnchor4.f18222f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f18220d;
    }

    public void R0() {
        this.f18282p = false;
        this.f18284q = false;
        this.f18286r = false;
        this.f18288s = false;
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Z.get(i10).y();
        }
    }

    public void R1(int i10, int i11) {
        this.f18269i0 = i10;
        int i12 = i11 - i10;
        this.f18261e0 = i12;
        int i13 = this.f18283p0;
        if (i12 < i13) {
            this.f18261e0 = i13;
        }
    }

    public int S() {
        int iMax;
        int i10 = this.f18261e0;
        if (this.f18255b0[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i10;
        }
        if (this.f18298x == 1) {
            iMax = Math.max(this.C, i10);
        } else {
            iMax = this.C;
            if (iMax > 0) {
                this.f18261e0 = iMax;
            } else {
                iMax = 0;
            }
        }
        int i11 = this.D;
        return (i11 <= 0 || i11 >= iMax) ? iMax : i11;
    }

    public void S0(androidx.constraintlayout.core.c cVar) {
        this.Q.z(cVar);
        this.R.z(cVar);
        this.S.z(cVar);
        this.T.z(cVar);
        this.U.z(cVar);
        this.X.z(cVar);
        this.V.z(cVar);
        this.W.z(cVar);
    }

    public void S1(DimensionBehaviour dimensionBehaviour) {
        this.f18255b0[1] = dimensionBehaviour;
    }

    public int T() {
        int iMax;
        int i10 = this.f18259d0;
        if (this.f18255b0[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i10;
        }
        if (this.f18296w == 1) {
            iMax = Math.max(this.f18302z, i10);
        } else {
            iMax = this.f18302z;
            if (iMax > 0) {
                this.f18259d0 = iMax;
            } else {
                iMax = 0;
            }
        }
        int i11 = this.A;
        return (i11 <= 0 || i11 >= iMax) ? iMax : i11;
    }

    public void T0() {
        this.f18286r = false;
        this.f18288s = false;
    }

    public void T1(int i10, int i11, int i12, float f10) {
        this.f18298x = i10;
        this.C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.D = i12;
        this.E = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f18298x = 2;
    }

    public ConstraintWidget U() {
        return this.f18257c0;
    }

    public StringBuilder U0(StringBuilder sb2) {
        sb2.append("{\n");
        V0(sb2, com.google.android.exoplayer2.text.ttml.d.f49793l0, this.Q);
        V0(sb2, "top", this.R);
        V0(sb2, com.google.android.exoplayer2.text.ttml.d.f49796n0, this.S);
        V0(sb2, "bottom", this.T);
        V0(sb2, "baseline", this.U);
        V0(sb2, "centerX", this.V);
        V0(sb2, "centerY", this.W);
        X0(sb2, this.X, this.K);
        Z0(sb2, "width", this.f18259d0, this.f18281o0, this.J[0], this.f18274l, this.f18302z, this.f18296w, this.B, this.M0[0]);
        Z0(sb2, "height", this.f18261e0, this.f18283p0, this.J[1], this.f18276m, this.C, this.f18298x, this.E, this.M0[1]);
        Y0(sb2, "dimensionRatio", this.f18263f0, this.f18265g0);
        W0(sb2, "horizontalBias", this.f18285q0, f18251y1);
        W0(sb2, "verticalBias", this.f18287r0, f18251y1);
        sb2.append("}\n");
        return sb2;
    }

    public void U1(float f10) {
        this.M0[1] = f10;
    }

    public ConstraintWidget V(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 != 0) {
            if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.R).f18222f) != null && constraintAnchor2.f18222f == constraintAnchor) {
                return constraintAnchor2.f18220d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.Q;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f18222f;
        if (constraintAnchor4 == null || constraintAnchor4.f18222f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f18220d;
    }

    public void V1(int i10) {
        this.f18293u0 = i10;
    }

    int W(int i10) {
        if (i10 == 0) {
            return this.f18271j0;
        }
        if (i10 == 1) {
            return this.f18273k0;
        }
        return 0;
    }

    public void W1(int i10) {
        this.f18259d0 = i10;
        int i11 = this.f18281o0;
        if (i10 < i11) {
            this.f18259d0 = i11;
        }
    }

    public int X() {
        return l0() + this.f18259d0;
    }

    public void X1(boolean z10) {
        this.F = z10;
    }

    protected int Y() {
        return this.f18267h0 + this.f18275l0;
    }

    public void Y1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f18294v = i10;
    }

    protected int Z() {
        return this.f18269i0 + this.f18277m0;
    }

    public void Z1(int i10) {
        this.f18267h0 = i10;
    }

    public WidgetRun a0(int i10) {
        if (i10 == 0) {
            return this.f18260e;
        }
        if (i10 == 1) {
            return this.f18262f;
        }
        return null;
    }

    public void a1(int i10) {
        this.f18279n0 = i10;
        this.L = i10 > 0;
    }

    public void a2(int i10) {
        this.f18269i0 = i10;
    }

    public int b0() {
        return m0();
    }

    public void b1(Object obj) {
        this.f18289s0 = obj;
    }

    public void b2(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.H == -1) {
            if (z12 && !z13) {
                this.H = 0;
            } else if (!z12 && z13) {
                this.H = 1;
                if (this.f18265g0 == -1) {
                    this.I = 1.0f / this.I;
                }
            }
        }
        if (this.H == 0 && (!this.R.p() || !this.T.p())) {
            this.H = 1;
        } else if (this.H == 1 && (!this.Q.p() || !this.S.p())) {
            this.H = 0;
        }
        if (this.H == -1 && (!this.R.p() || !this.T.p() || !this.Q.p() || !this.S.p())) {
            if (this.R.p() && this.T.p()) {
                this.H = 0;
            } else if (this.Q.p() && this.S.p()) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if (this.H == -1) {
            int i10 = this.f18302z;
            if (i10 > 0 && this.C == 0) {
                this.H = 0;
            } else {
                if (i10 != 0 || this.C <= 0) {
                    return;
                }
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
    }

    public String c0() {
        return this.f18297w0;
    }

    public void c1(int i10) {
        if (i10 >= 0) {
            this.f18291t0 = i10;
        } else {
            this.f18291t0 = 0;
        }
    }

    public void c2(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zM = z10 & this.f18260e.m();
        boolean zM2 = z11 & this.f18262f.m();
        androidx.constraintlayout.core.widgets.analyzer.k kVar = this.f18260e;
        int i12 = kVar.f18325h.f18312g;
        androidx.constraintlayout.core.widgets.analyzer.m mVar = this.f18262f;
        int i13 = mVar.f18325h.f18312g;
        int i14 = kVar.f18326i.f18312g;
        int i15 = mVar.f18326i.f18312g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zM) {
            this.f18267h0 = i12;
        }
        if (zM2) {
            this.f18269i0 = i13;
        }
        if (this.f18293u0 == 8) {
            this.f18259d0 = 0;
            this.f18261e0 = 0;
            return;
        }
        if (zM) {
            if (this.f18255b0[0] == DimensionBehaviour.FIXED && i17 < (i11 = this.f18259d0)) {
                i17 = i11;
            }
            this.f18259d0 = i17;
            int i19 = this.f18281o0;
            if (i17 < i19) {
                this.f18259d0 = i19;
            }
        }
        if (zM2) {
            if (this.f18255b0[1] == DimensionBehaviour.FIXED && i18 < (i10 = this.f18261e0)) {
                i18 = i10;
            }
            this.f18261e0 = i18;
            int i20 = this.f18283p0;
            if (i18 < i20) {
                this.f18261e0 = i20;
            }
        }
    }

    public float d0() {
        return this.f18287r0;
    }

    public void d1(String str) {
        this.f18295v0 = str;
    }

    public void d2(androidx.constraintlayout.core.e eVar, boolean z10) {
        androidx.constraintlayout.core.widgets.analyzer.m mVar;
        androidx.constraintlayout.core.widgets.analyzer.k kVar;
        int iO = eVar.O(this.Q);
        int iO2 = eVar.O(this.R);
        int iO3 = eVar.O(this.S);
        int iO4 = eVar.O(this.T);
        if (z10 && (kVar = this.f18260e) != null) {
            DependencyNode dependencyNode = kVar.f18325h;
            if (dependencyNode.f18315j) {
                DependencyNode dependencyNode2 = kVar.f18326i;
                if (dependencyNode2.f18315j) {
                    iO = dependencyNode.f18312g;
                    iO3 = dependencyNode2.f18312g;
                }
            }
        }
        if (z10 && (mVar = this.f18262f) != null) {
            DependencyNode dependencyNode3 = mVar.f18325h;
            if (dependencyNode3.f18315j) {
                DependencyNode dependencyNode4 = mVar.f18326i;
                if (dependencyNode4.f18315j) {
                    iO2 = dependencyNode3.f18312g;
                    iO4 = dependencyNode4.f18312g;
                }
            }
        }
        int i10 = iO4 - iO2;
        if (iO3 - iO < 0 || i10 < 0 || iO == Integer.MIN_VALUE || iO == Integer.MAX_VALUE || iO2 == Integer.MIN_VALUE || iO2 == Integer.MAX_VALUE || iO3 == Integer.MIN_VALUE || iO3 == Integer.MAX_VALUE || iO4 == Integer.MIN_VALUE || iO4 == Integer.MAX_VALUE) {
            iO4 = 0;
            iO = 0;
            iO2 = 0;
            iO3 = 0;
        }
        p1(iO, iO2, iO3, iO4);
    }

    public void e(d dVar, androidx.constraintlayout.core.e eVar, HashSet<ConstraintWidget> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            i.a(dVar, eVar, this);
            hashSet.remove(this);
            g(eVar, dVar.M2(64));
        }
        if (i10 == 0) {
            HashSet<ConstraintAnchor> hashSetE = this.Q.e();
            if (hashSetE != null) {
                Iterator<ConstraintAnchor> it = hashSetE.iterator();
                while (it.hasNext()) {
                    it.next().f18220d.e(dVar, eVar, hashSet, i10, true);
                }
            }
            HashSet<ConstraintAnchor> hashSetE2 = this.S.e();
            if (hashSetE2 != null) {
                Iterator<ConstraintAnchor> it2 = hashSetE2.iterator();
                while (it2.hasNext()) {
                    it2.next().f18220d.e(dVar, eVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSetE3 = this.R.e();
        if (hashSetE3 != null) {
            Iterator<ConstraintAnchor> it3 = hashSetE3.iterator();
            while (it3.hasNext()) {
                it3.next().f18220d.e(dVar, eVar, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> hashSetE4 = this.T.e();
        if (hashSetE4 != null) {
            Iterator<ConstraintAnchor> it4 = hashSetE4.iterator();
            while (it4.hasNext()) {
                it4.next().f18220d.e(dVar, eVar, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> hashSetE5 = this.U.e();
        if (hashSetE5 != null) {
            Iterator<ConstraintAnchor> it5 = hashSetE5.iterator();
            while (it5.hasNext()) {
                it5.next().f18220d.e(dVar, eVar, hashSet, i10, true);
            }
        }
    }

    public ConstraintWidget e0() {
        if (!z0()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor constraintAnchorR = constraintWidget.r(ConstraintAnchor.Type.TOP);
            ConstraintAnchor constraintAnchorK = constraintAnchorR == null ? null : constraintAnchorR.k();
            ConstraintWidget constraintWidgetI = constraintAnchorK == null ? null : constraintAnchorK.i();
            if (constraintWidgetI == U()) {
                return constraintWidget;
            }
            ConstraintAnchor constraintAnchorK2 = constraintWidgetI == null ? null : constraintWidgetI.r(ConstraintAnchor.Type.BOTTOM).k();
            if (constraintAnchorK2 == null || constraintAnchorK2.i() == constraintWidget) {
                constraintWidget = constraintWidgetI;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public void e1(androidx.constraintlayout.core.e eVar, String str) {
        this.f18295v0 = str;
        SolverVariable solverVariableU = eVar.u(this.Q);
        SolverVariable solverVariableU2 = eVar.u(this.R);
        SolverVariable solverVariableU3 = eVar.u(this.S);
        SolverVariable solverVariableU4 = eVar.u(this.T);
        solverVariableU.j(str + ".left");
        solverVariableU2.j(str + ".top");
        solverVariableU3.j(str + ".right");
        solverVariableU4.j(str + ".bottom");
        eVar.u(this.U).j(str + ".baseline");
    }

    boolean f() {
        return (this instanceof l) || (this instanceof f);
    }

    public int f0() {
        return this.J0;
    }

    public void f1(int i10, int i11) {
        this.f18259d0 = i10;
        int i12 = this.f18281o0;
        if (i10 < i12) {
            this.f18259d0 = i12;
        }
        this.f18261e0 = i11;
        int i13 = this.f18283p0;
        if (i11 < i13) {
            this.f18261e0 = i13;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15291. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void g(androidx.constraintlayout.core.e r54, boolean r55) {
        /*
            Method dump skipped, instruction units count: 1529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.g(androidx.constraintlayout.core.e, boolean):void");
    }

    public DimensionBehaviour g0() {
        return this.f18255b0[1];
    }

    public void g1(float f10, int i10) {
        this.f18263f0 = f10;
        this.f18265g0 = i10;
    }

    public boolean h() {
        return this.f18293u0 != 8;
    }

    public int h0() {
        int i10 = this.Q != null ? 0 + this.R.f18223g : 0;
        return this.S != null ? i10 + this.T.f18223g : i10;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[PHI: r0
  0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    public void h1(String str) {
        float fAbs;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.f18263f0 = 0.0f;
            return;
        }
        int i11 = -1;
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i12 = 0;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (strSubstring.equalsIgnoreCase(androidx.exifinterface.media.a.T4)) {
                i11 = 0;
            } else if (strSubstring.equalsIgnoreCase("H")) {
                i11 = 1;
            }
            i12 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i12);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i10;
                }
            } else {
                String strSubstring3 = str.substring(i12, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i10;
                } else {
                    float f10 = Float.parseFloat(strSubstring3);
                    float f11 = Float.parseFloat(strSubstring4);
                    if (f10 <= 0.0f || f11 <= 0.0f) {
                        fAbs = i10;
                    } else {
                        fAbs = i11 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i10 = (fAbs > i10 ? 1 : (fAbs == i10 ? 0 : -1));
        if (i10 > 0) {
            this.f18263f0 = fAbs;
            this.f18265g0 = i11;
        }
    }

    public int i0() {
        return this.f18293u0;
    }

    public void i1(int i10) {
        if (this.L) {
            int i11 = i10 - this.f18279n0;
            int i12 = this.f18261e0 + i11;
            this.f18269i0 = i11;
            this.R.A(i11);
            this.T.A(i12);
            this.U.A(i10);
            this.f18284q = true;
        }
    }

    public void j(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        k(type, constraintWidget, type2, 0);
    }

    public int j0() {
        if (this.f18293u0 == 8) {
            return 0;
        }
        return this.f18259d0;
    }

    public void j1(int i10, int i11, int i12, int i13, int i14, int i15) {
        p1(i10, i11, i12, i13);
        a1(i14);
        if (i15 == 0) {
            this.f18282p = true;
            this.f18284q = false;
        } else if (i15 == 1) {
            this.f18282p = false;
            this.f18284q = true;
        } else if (i15 == 2) {
            this.f18282p = true;
            this.f18284q = true;
        } else {
            this.f18282p = false;
            this.f18284q = false;
        }
    }

    public void k(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z10;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 != type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                if (type2 == type6 || type2 == ConstraintAnchor.Type.RIGHT) {
                    k(type6, constraintWidget, type2, 0);
                    k(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                    r(type5).a(constraintWidget.r(type2), 0);
                    return;
                }
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.TOP;
                if (type2 == type7 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    k(type7, constraintWidget, type2, 0);
                    k(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    r(type5).a(constraintWidget.r(type2), 0);
                    return;
                }
                return;
            }
            ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor constraintAnchorR = r(type8);
            ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor constraintAnchorR2 = r(type9);
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor constraintAnchorR3 = r(type10);
            ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor constraintAnchorR4 = r(type11);
            boolean z11 = true;
            if ((constraintAnchorR == null || !constraintAnchorR.p()) && (constraintAnchorR2 == null || !constraintAnchorR2.p())) {
                k(type8, constraintWidget, type8, 0);
                k(type9, constraintWidget, type9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((constraintAnchorR3 == null || !constraintAnchorR3.p()) && (constraintAnchorR4 == null || !constraintAnchorR4.p())) {
                k(type10, constraintWidget, type10, 0);
                k(type11, constraintWidget, type11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                r(type5).a(constraintWidget.r(type5), 0);
                return;
            }
            if (z10) {
                ConstraintAnchor.Type type12 = ConstraintAnchor.Type.CENTER_X;
                r(type12).a(constraintWidget.r(type12), 0);
                return;
            } else {
                if (z11) {
                    ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_Y;
                    r(type13).a(constraintWidget.r(type13), 0);
                    return;
                }
                return;
            }
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor constraintAnchorR5 = r(type4);
            ConstraintAnchor constraintAnchorR6 = constraintWidget.r(type2);
            ConstraintAnchor constraintAnchorR7 = r(ConstraintAnchor.Type.RIGHT);
            constraintAnchorR5.a(constraintAnchorR6, 0);
            constraintAnchorR7.a(constraintAnchorR6, 0);
            r(type14).a(constraintAnchorR6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor constraintAnchorR8 = constraintWidget.r(type2);
            r(type3).a(constraintAnchorR8, 0);
            r(ConstraintAnchor.Type.BOTTOM).a(constraintAnchorR8, 0);
            r(type15).a(constraintAnchorR8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            r(type16).a(constraintWidget.r(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            r(type17).a(constraintWidget.r(type17), 0);
            r(type14).a(constraintWidget.r(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            r(type18).a(constraintWidget.r(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            r(type19).a(constraintWidget.r(type19), 0);
            r(type15).a(constraintWidget.r(type2), 0);
            return;
        }
        ConstraintAnchor constraintAnchorR9 = r(type);
        ConstraintAnchor constraintAnchorR10 = constraintWidget.r(type2);
        if (constraintAnchorR9.v(constraintAnchorR10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor constraintAnchorR11 = r(ConstraintAnchor.Type.TOP);
                ConstraintAnchor constraintAnchorR12 = r(ConstraintAnchor.Type.BOTTOM);
                if (constraintAnchorR11 != null) {
                    constraintAnchorR11.x();
                }
                if (constraintAnchorR12 != null) {
                    constraintAnchorR12.x();
                }
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor constraintAnchorR13 = r(type20);
                if (constraintAnchorR13 != null) {
                    constraintAnchorR13.x();
                }
                ConstraintAnchor constraintAnchorR14 = r(type5);
                if (constraintAnchorR14.k() != constraintAnchorR10) {
                    constraintAnchorR14.x();
                }
                ConstraintAnchor constraintAnchorH = r(type).h();
                ConstraintAnchor constraintAnchorR15 = r(type15);
                if (constraintAnchorR15.p()) {
                    constraintAnchorH.x();
                    constraintAnchorR15.x();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor constraintAnchorR16 = r(type5);
                if (constraintAnchorR16.k() != constraintAnchorR10) {
                    constraintAnchorR16.x();
                }
                ConstraintAnchor constraintAnchorH2 = r(type).h();
                ConstraintAnchor constraintAnchorR17 = r(type14);
                if (constraintAnchorR17.p()) {
                    constraintAnchorH2.x();
                    constraintAnchorR17.x();
                }
            }
            constraintAnchorR9.a(constraintAnchorR10, i10);
        }
    }

    public int k0() {
        return this.f18294v;
    }

    public void k1(int i10, int i11) {
        if (this.f18282p) {
            return;
        }
        this.Q.A(i10);
        this.S.A(i11);
        this.f18267h0 = i10;
        this.f18259d0 = i11 - i10;
        this.f18282p = true;
    }

    public void l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        if (constraintAnchor.i() == this) {
            k(constraintAnchor.l(), constraintAnchor2.i(), constraintAnchor2.l(), i10);
        }
    }

    public int l0() {
        ConstraintWidget constraintWidget = this.f18257c0;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f18267h0 : ((d) constraintWidget).H1 + this.f18267h0;
    }

    public void l1(int i10) {
        this.Q.A(i10);
        this.f18267h0 = i10;
    }

    public void m(ConstraintWidget constraintWidget, float f10, int i10) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        s0(type, constraintWidget, type, i10, 0);
        this.K = f10;
    }

    public int m0() {
        ConstraintWidget constraintWidget = this.f18257c0;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f18269i0 : ((d) constraintWidget).I1 + this.f18269i0;
    }

    public void m1(int i10) {
        this.R.A(i10);
        this.f18269i0 = i10;
    }

    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.f18290t = constraintWidget.f18290t;
        this.f18292u = constraintWidget.f18292u;
        this.f18296w = constraintWidget.f18296w;
        this.f18298x = constraintWidget.f18298x;
        int[] iArr = this.f18300y;
        int[] iArr2 = constraintWidget.f18300y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f18302z = constraintWidget.f18302z;
        this.A = constraintWidget.A;
        this.C = constraintWidget.C;
        this.D = constraintWidget.D;
        this.E = constraintWidget.E;
        this.F = constraintWidget.F;
        this.G = constraintWidget.G;
        this.H = constraintWidget.H;
        this.I = constraintWidget.I;
        int[] iArr3 = constraintWidget.J;
        this.J = Arrays.copyOf(iArr3, iArr3.length);
        this.K = constraintWidget.K;
        this.L = constraintWidget.L;
        this.M = constraintWidget.M;
        this.Q.x();
        this.R.x();
        this.S.x();
        this.T.x();
        this.U.x();
        this.V.x();
        this.W.x();
        this.X.x();
        this.f18255b0 = (DimensionBehaviour[]) Arrays.copyOf(this.f18255b0, 2);
        this.f18257c0 = this.f18257c0 == null ? null : map.get(constraintWidget.f18257c0);
        this.f18259d0 = constraintWidget.f18259d0;
        this.f18261e0 = constraintWidget.f18261e0;
        this.f18263f0 = constraintWidget.f18263f0;
        this.f18265g0 = constraintWidget.f18265g0;
        this.f18267h0 = constraintWidget.f18267h0;
        this.f18269i0 = constraintWidget.f18269i0;
        this.f18271j0 = constraintWidget.f18271j0;
        this.f18273k0 = constraintWidget.f18273k0;
        this.f18275l0 = constraintWidget.f18275l0;
        this.f18277m0 = constraintWidget.f18277m0;
        this.f18279n0 = constraintWidget.f18279n0;
        this.f18281o0 = constraintWidget.f18281o0;
        this.f18283p0 = constraintWidget.f18283p0;
        this.f18285q0 = constraintWidget.f18285q0;
        this.f18287r0 = constraintWidget.f18287r0;
        this.f18289s0 = constraintWidget.f18289s0;
        this.f18291t0 = constraintWidget.f18291t0;
        this.f18293u0 = constraintWidget.f18293u0;
        this.f18295v0 = constraintWidget.f18295v0;
        this.f18297w0 = constraintWidget.f18297w0;
        this.f18299x0 = constraintWidget.f18299x0;
        this.f18301y0 = constraintWidget.f18301y0;
        this.f18303z0 = constraintWidget.f18303z0;
        this.A0 = constraintWidget.A0;
        this.B0 = constraintWidget.B0;
        this.C0 = constraintWidget.C0;
        this.D0 = constraintWidget.D0;
        this.E0 = constraintWidget.E0;
        this.F0 = constraintWidget.F0;
        this.G0 = constraintWidget.G0;
        this.I0 = constraintWidget.I0;
        this.J0 = constraintWidget.J0;
        this.K0 = constraintWidget.K0;
        this.L0 = constraintWidget.L0;
        float[] fArr = this.M0;
        float[] fArr2 = constraintWidget.M0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.N0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.N0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.O0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.O0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.P0;
        this.P0 = constraintWidget2 == null ? null : map.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.Q0;
        this.Q0 = constraintWidget3 != null ? map.get(constraintWidget3) : null;
    }

    public boolean n0() {
        return this.L;
    }

    public void n1(int i10, int i11) {
        if (this.f18284q) {
            return;
        }
        this.R.A(i10);
        this.T.A(i11);
        this.f18269i0 = i10;
        this.f18261e0 = i11 - i10;
        if (this.L) {
            this.U.A(i10 + this.f18279n0);
        }
        this.f18284q = true;
    }

    public void o(androidx.constraintlayout.core.e eVar) {
        eVar.u(this.Q);
        eVar.u(this.R);
        eVar.u(this.S);
        eVar.u(this.T);
        if (this.f18279n0 > 0) {
            eVar.u(this.U);
        }
    }

    public boolean o0(int i10) {
        if (i10 == 0) {
            return (this.Q.f18222f != null ? 1 : 0) + (this.S.f18222f != null ? 1 : 0) < 2;
        }
        return ((this.R.f18222f != null ? 1 : 0) + (this.T.f18222f != null ? 1 : 0)) + (this.U.f18222f != null ? 1 : 0) < 2;
    }

    public void o1(int i10, int i11, int i12) {
        if (i12 == 0) {
            w1(i10, i11);
        } else if (i12 == 1) {
            R1(i10, i11);
        }
    }

    public void p() {
        this.f18268i = true;
    }

    public boolean p0() {
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.Z.get(i10).n()) {
                return true;
            }
        }
        return false;
    }

    public void p1(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f18267h0 = i10;
        this.f18269i0 = i11;
        if (this.f18293u0 == 8) {
            this.f18259d0 = 0;
            this.f18261e0 = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f18255b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i16 < (i15 = this.f18259d0)) {
            i16 = i15;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i17 < (i14 = this.f18261e0)) {
            i17 = i14;
        }
        this.f18259d0 = i16;
        this.f18261e0 = i17;
        int i18 = this.f18283p0;
        if (i17 < i18) {
            this.f18261e0 = i18;
        }
        int i19 = this.f18281o0;
        if (i16 < i19) {
            this.f18259d0 = i19;
        }
        int i20 = this.A;
        if (i20 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f18259d0 = Math.min(this.f18259d0, i20);
        }
        int i21 = this.D;
        if (i21 > 0 && this.f18255b0[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f18261e0 = Math.min(this.f18261e0, i21);
        }
        int i22 = this.f18259d0;
        if (i16 != i22) {
            this.f18274l = i22;
        }
        int i23 = this.f18261e0;
        if (i17 != i23) {
            this.f18276m = i23;
        }
    }

    public void q() {
        if (this.f18260e == null) {
            this.f18260e = new androidx.constraintlayout.core.widgets.analyzer.k(this);
        }
        if (this.f18262f == null) {
            this.f18262f = new androidx.constraintlayout.core.widgets.analyzer.m(this);
        }
    }

    public boolean q0() {
        return (this.f18274l == -1 && this.f18276m == -1) ? false : true;
    }

    public void q1(ConstraintAnchor.Type type, int i10) {
        int i11 = a.f18304a[type.ordinal()];
        if (i11 == 1) {
            this.Q.f18224h = i10;
            return;
        }
        if (i11 == 2) {
            this.R.f18224h = i10;
            return;
        }
        if (i11 == 3) {
            this.S.f18224h = i10;
        } else if (i11 == 4) {
            this.T.f18224h = i10;
        } else {
            if (i11 != 5) {
                return;
            }
            this.U.f18224h = i10;
        }
    }

    public ConstraintAnchor r(ConstraintAnchor.Type type) {
        switch (a.f18304a[type.ordinal()]) {
            case 1:
                return this.Q;
            case 2:
                return this.R;
            case 3:
                return this.S;
            case 4:
                return this.T;
            case 5:
                return this.U;
            case 6:
                return this.X;
            case 7:
                return this.V;
            case 8:
                return this.W;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public boolean r0(int i10, int i11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor3 = this.Q.f18222f;
            return constraintAnchor3 != null && constraintAnchor3.o() && (constraintAnchor2 = this.S.f18222f) != null && constraintAnchor2.o() && (this.S.f18222f.f() - this.S.g()) - (this.Q.f18222f.f() + this.Q.g()) >= i11;
        }
        ConstraintAnchor constraintAnchor4 = this.R.f18222f;
        return constraintAnchor4 != null && constraintAnchor4.o() && (constraintAnchor = this.T.f18222f) != null && constraintAnchor.o() && (this.T.f18222f.f() - this.T.g()) - (this.R.f18222f.f() + this.R.g()) >= i11;
        return false;
    }

    public void r1(boolean z10) {
        this.L = z10;
    }

    public ArrayList<ConstraintAnchor> s() {
        return this.Z;
    }

    public void s0(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10, int i11) {
        r(type).b(constraintWidget.r(type2), i10, i11, true);
    }

    public void s1(int i10) {
        this.f18261e0 = i10;
        int i11 = this.f18283p0;
        if (i10 < i11) {
            this.f18261e0 = i11;
        }
    }

    public int t() {
        return this.f18279n0;
    }

    public void t1(boolean z10) {
        this.G = z10;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f18297w0 != null) {
            str = "type: " + this.f18297w0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f18295v0 != null) {
            str2 = "id: " + this.f18295v0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f18267h0);
        sb2.append(", ");
        sb2.append(this.f18269i0);
        sb2.append(") - (");
        sb2.append(this.f18259d0);
        sb2.append(" x ");
        sb2.append(this.f18261e0);
        sb2.append(")");
        return sb2.toString();
    }

    public float u(int i10) {
        if (i10 == 0) {
            return this.f18285q0;
        }
        if (i10 == 1) {
            return this.f18287r0;
        }
        return -1.0f;
    }

    public boolean u0() {
        return this.G;
    }

    public void u1(float f10) {
        this.f18285q0 = f10;
    }

    public int v() {
        return m0() + this.f18261e0;
    }

    public boolean v0() {
        return this.f18286r;
    }

    public void v1(int i10) {
        this.I0 = i10;
    }

    public Object w() {
        return this.f18289s0;
    }

    public boolean w0(int i10) {
        return this.f18253a0[i10];
    }

    public void w1(int i10, int i11) {
        this.f18267h0 = i10;
        int i12 = i11 - i10;
        this.f18259d0 = i12;
        int i13 = this.f18281o0;
        if (i12 < i13) {
            this.f18259d0 = i13;
        }
    }

    public int x() {
        return this.f18291t0;
    }

    public boolean x0() {
        ConstraintAnchor constraintAnchor = this.Q;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f18222f;
        if (constraintAnchor2 != null && constraintAnchor2.f18222f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.S;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f18222f;
        return constraintAnchor4 != null && constraintAnchor4.f18222f == constraintAnchor3;
    }

    public void x1(DimensionBehaviour dimensionBehaviour) {
        this.f18255b0[0] = dimensionBehaviour;
    }

    public String y() {
        return this.f18295v0;
    }

    public boolean y0() {
        return this.M;
    }

    public void y1(int i10, int i11, int i12, float f10) {
        this.f18296w = i10;
        this.f18302z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f18296w = 2;
    }

    public DimensionBehaviour z(int i10) {
        if (i10 == 0) {
            return H();
        }
        if (i10 == 1) {
            return g0();
        }
        return null;
    }

    public boolean z0() {
        ConstraintAnchor constraintAnchor = this.R;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f18222f;
        if (constraintAnchor2 != null && constraintAnchor2.f18222f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.T;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f18222f;
        return constraintAnchor4 != null && constraintAnchor4.f18222f == constraintAnchor3;
    }

    public void z1(float f10) {
        this.M0[0] = f10;
    }
}
