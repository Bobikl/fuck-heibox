package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.core.widgets.l;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static final String A = "ConstraintLayout-2.1.1";
    private static final String B = "ConstraintLayout";
    private static final boolean C = true;
    private static final boolean D = false;
    private static final boolean E = false;
    private static final boolean F = false;
    private static final boolean G = false;
    public static final int H = 0;
    private static e I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SparseArray<View> f19257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<ConstraintHelper> f19258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected androidx.constraintlayout.core.widgets.d f19259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f19264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c f19266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected androidx.constraintlayout.widget.a f19267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HashMap<String, Integer> f19269n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19270o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19271p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f19272q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f19273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f19274s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f19275t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private SparseArray<ConstraintWidget> f19276u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d f19277v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private androidx.constraintlayout.core.f f19278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    b f19279x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f19280y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f19281z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int A0 = 0;
        public static final int B0 = 1;
        public static final int C0 = 1;
        public static final int D0 = 2;
        public static final int E0 = 3;
        public static final int F0 = 4;
        public static final int G0 = 5;
        public static final int H0 = 6;
        public static final int I0 = 7;
        public static final int J0 = 8;
        public static final int K0 = 1;
        public static final int L0 = 0;
        public static final int M0 = 2;
        public static final int N0 = 0;
        public static final int O0 = 1;
        public static final int P0 = 2;
        public static final int Q0 = 0;
        public static final int R0 = 1;
        public static final int S0 = 2;
        public static final int T0 = 3;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final int f19282w0 = 0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final int f19283x0 = 0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final int f19284y0 = -1;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final int f19285z0 = Integer.MIN_VALUE;
        public int A;
        public int B;
        public int C;
        boolean D;
        boolean E;
        public float F;
        public float G;
        public String H;
        float I;
        int J;
        public float K;
        public float L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public float U;
        public float V;
        public int W;
        public int X;
        public int Y;
        public boolean Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19286a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f19287a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19288b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public String f19289b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f19290c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f19291c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19292d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        boolean f19293d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19294e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        boolean f19295e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19296f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        boolean f19297f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19298g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        boolean f19299g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19300h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        boolean f19301h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f19302i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        boolean f19303i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f19304j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        boolean f19305j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f19306k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        int f19307k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f19308l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f19309l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f19310m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        int f19311m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19312n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        int f19313n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f19314o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        int f19315o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f19316p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        int f19317p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f19318q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        float f19319q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f19320r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        int f19321r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f19322s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        int f19323s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19324t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        float f19325t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f19326u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        ConstraintWidget f19327u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f19328v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public boolean f19329v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f19330w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f19331x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f19332y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f19333z;

        public static class a {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 31;
            public static final int G = 32;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 47;
            public static final int W = 48;
            public static final int X = 49;
            public static final int Y = 50;
            public static final int Z = 51;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f19334a = 0;

            /* JADX INFO: renamed from: a0, reason: collision with root package name */
            public static final int f19335a0 = 52;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f19336b = 1;

            /* JADX INFO: renamed from: b0, reason: collision with root package name */
            public static final int f19337b0 = 53;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f19338c = 2;

            /* JADX INFO: renamed from: c0, reason: collision with root package name */
            public static final int f19339c0 = 54;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f19340d = 3;

            /* JADX INFO: renamed from: d0, reason: collision with root package name */
            public static final int f19341d0 = 55;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f19342e = 4;

            /* JADX INFO: renamed from: e0, reason: collision with root package name */
            public static final int f19343e0 = 64;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f19344f = 5;

            /* JADX INFO: renamed from: f0, reason: collision with root package name */
            public static final int f19345f0 = 65;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f19346g = 6;

            /* JADX INFO: renamed from: g0, reason: collision with root package name */
            public static final int f19347g0 = 66;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f19348h = 7;

            /* JADX INFO: renamed from: h0, reason: collision with root package name */
            public static final SparseIntArray f19349h0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f19350i = 8;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f19351j = 9;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f19352k = 10;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f19353l = 11;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f19354m = 12;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final int f19355n = 13;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final int f19356o = 14;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static final int f19357p = 15;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final int f19358q = 16;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final int f19359r = 17;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final int f19360s = 18;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final int f19361t = 19;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public static final int f19362u = 20;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final int f19363v = 21;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public static final int f19364w = 22;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static final int f19365x = 23;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public static final int f19366y = 24;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public static final int f19367z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f19349h0 = sparseIntArray;
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }

            private a() {
            }
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f19286a = -1;
            this.f19288b = -1;
            this.f19290c = -1.0f;
            this.f19292d = -1;
            this.f19294e = -1;
            this.f19296f = -1;
            this.f19298g = -1;
            this.f19300h = -1;
            this.f19302i = -1;
            this.f19304j = -1;
            this.f19306k = -1;
            this.f19308l = -1;
            this.f19310m = -1;
            this.f19312n = -1;
            this.f19314o = -1;
            this.f19316p = 0;
            this.f19318q = 0.0f;
            this.f19320r = -1;
            this.f19322s = -1;
            this.f19324t = -1;
            this.f19326u = -1;
            this.f19328v = Integer.MIN_VALUE;
            this.f19330w = Integer.MIN_VALUE;
            this.f19331x = Integer.MIN_VALUE;
            this.f19332y = Integer.MIN_VALUE;
            this.f19333z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.f19287a0 = false;
            this.f19289b0 = null;
            this.f19291c0 = 0;
            this.f19293d0 = true;
            this.f19295e0 = true;
            this.f19297f0 = false;
            this.f19299g0 = false;
            this.f19301h0 = false;
            this.f19303i0 = false;
            this.f19305j0 = false;
            this.f19307k0 = -1;
            this.f19309l0 = -1;
            this.f19311m0 = -1;
            this.f19313n0 = -1;
            this.f19315o0 = Integer.MIN_VALUE;
            this.f19317p0 = Integer.MIN_VALUE;
            this.f19319q0 = 0.5f;
            this.f19327u0 = new ConstraintWidget();
            this.f19329v0 = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19286a = -1;
            this.f19288b = -1;
            this.f19290c = -1.0f;
            this.f19292d = -1;
            this.f19294e = -1;
            this.f19296f = -1;
            this.f19298g = -1;
            this.f19300h = -1;
            this.f19302i = -1;
            this.f19304j = -1;
            this.f19306k = -1;
            this.f19308l = -1;
            this.f19310m = -1;
            this.f19312n = -1;
            this.f19314o = -1;
            this.f19316p = 0;
            this.f19318q = 0.0f;
            this.f19320r = -1;
            this.f19322s = -1;
            this.f19324t = -1;
            this.f19326u = -1;
            this.f19328v = Integer.MIN_VALUE;
            this.f19330w = Integer.MIN_VALUE;
            this.f19331x = Integer.MIN_VALUE;
            this.f19332y = Integer.MIN_VALUE;
            this.f19333z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.f19287a0 = false;
            this.f19289b0 = null;
            this.f19291c0 = 0;
            this.f19293d0 = true;
            this.f19295e0 = true;
            this.f19297f0 = false;
            this.f19299g0 = false;
            this.f19301h0 = false;
            this.f19303i0 = false;
            this.f19305j0 = false;
            this.f19307k0 = -1;
            this.f19309l0 = -1;
            this.f19311m0 = -1;
            this.f19313n0 = -1;
            this.f19315o0 = Integer.MIN_VALUE;
            this.f19317p0 = Integer.MIN_VALUE;
            this.f19319q0 = 0.5f;
            this.f19327u0 = new ConstraintWidget();
            this.f19329v0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19429u);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f19349h0.get(index);
                switch (i11) {
                    case 1:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f19314o);
                        this.f19314o = resourceId;
                        if (resourceId == -1) {
                            this.f19314o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f19316p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f19316p);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f19318q) % 360.0f;
                        this.f19318q = f10;
                        if (f10 < 0.0f) {
                            this.f19318q = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f19286a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f19286a);
                        break;
                    case 6:
                        this.f19288b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f19288b);
                        break;
                    case 7:
                        this.f19290c = typedArrayObtainStyledAttributes.getFloat(index, this.f19290c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19292d);
                        this.f19292d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f19292d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19294e);
                        this.f19294e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f19294e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19296f);
                        this.f19296f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f19296f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19298g);
                        this.f19298g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f19298g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19300h);
                        this.f19300h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f19300h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19302i);
                        this.f19302i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f19302i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19304j);
                        this.f19304j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f19304j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19306k);
                        this.f19306k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f19306k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19308l);
                        this.f19308l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f19308l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19320r);
                        this.f19320r = resourceId11;
                        if (resourceId11 == -1) {
                            this.f19320r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19322s);
                        this.f19322s = resourceId12;
                        if (resourceId12 == -1) {
                            this.f19322s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19324t);
                        this.f19324t = resourceId13;
                        if (resourceId13 == -1) {
                            this.f19324t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19326u);
                        this.f19326u = resourceId14;
                        if (resourceId14 == -1) {
                            this.f19326u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f19328v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f19328v);
                        break;
                    case 22:
                        this.f19330w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f19330w);
                        break;
                    case 23:
                        this.f19331x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f19331x);
                        break;
                    case 24:
                        this.f19332y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f19332y);
                        break;
                    case 25:
                        this.f19333z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f19333z);
                        break;
                    case 26:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 27:
                        this.Z = typedArrayObtainStyledAttributes.getBoolean(index, this.Z);
                        break;
                    case 28:
                        this.f19287a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f19287a0);
                        break;
                    case 29:
                        this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 30:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.O = i12;
                        if (i12 == 1) {
                            Log.e(ConstraintLayout.B, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i13;
                        if (i13 == 1) {
                            Log.e(ConstraintLayout.B, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 35:
                        this.U = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.U));
                        this.O = 2;
                        break;
                    case 36:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 38:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                c.C0(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.K = typedArrayObtainStyledAttributes.getFloat(index, this.K);
                                break;
                            case 46:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 47:
                                this.M = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.W = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.W);
                                break;
                            case 50:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 51:
                                this.f19289b0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19310m);
                                this.f19310m = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f19310m = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19312n);
                                this.f19312n = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f19312n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 55:
                                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        c.A0(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.D = true;
                                        break;
                                    case 65:
                                        c.A0(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.E = true;
                                        break;
                                    case 66:
                                        this.f19291c0 = typedArrayObtainStyledAttributes.getInt(index, this.f19291c0);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            e();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19286a = -1;
            this.f19288b = -1;
            this.f19290c = -1.0f;
            this.f19292d = -1;
            this.f19294e = -1;
            this.f19296f = -1;
            this.f19298g = -1;
            this.f19300h = -1;
            this.f19302i = -1;
            this.f19304j = -1;
            this.f19306k = -1;
            this.f19308l = -1;
            this.f19310m = -1;
            this.f19312n = -1;
            this.f19314o = -1;
            this.f19316p = 0;
            this.f19318q = 0.0f;
            this.f19320r = -1;
            this.f19322s = -1;
            this.f19324t = -1;
            this.f19326u = -1;
            this.f19328v = Integer.MIN_VALUE;
            this.f19330w = Integer.MIN_VALUE;
            this.f19331x = Integer.MIN_VALUE;
            this.f19332y = Integer.MIN_VALUE;
            this.f19333z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.f19287a0 = false;
            this.f19289b0 = null;
            this.f19291c0 = 0;
            this.f19293d0 = true;
            this.f19295e0 = true;
            this.f19297f0 = false;
            this.f19299g0 = false;
            this.f19301h0 = false;
            this.f19303i0 = false;
            this.f19305j0 = false;
            this.f19307k0 = -1;
            this.f19309l0 = -1;
            this.f19311m0 = -1;
            this.f19313n0 = -1;
            this.f19315o0 = Integer.MIN_VALUE;
            this.f19317p0 = Integer.MIN_VALUE;
            this.f19319q0 = 0.5f;
            this.f19327u0 = new ConstraintWidget();
            this.f19329v0 = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f19286a = -1;
            this.f19288b = -1;
            this.f19290c = -1.0f;
            this.f19292d = -1;
            this.f19294e = -1;
            this.f19296f = -1;
            this.f19298g = -1;
            this.f19300h = -1;
            this.f19302i = -1;
            this.f19304j = -1;
            this.f19306k = -1;
            this.f19308l = -1;
            this.f19310m = -1;
            this.f19312n = -1;
            this.f19314o = -1;
            this.f19316p = 0;
            this.f19318q = 0.0f;
            this.f19320r = -1;
            this.f19322s = -1;
            this.f19324t = -1;
            this.f19326u = -1;
            this.f19328v = Integer.MIN_VALUE;
            this.f19330w = Integer.MIN_VALUE;
            this.f19331x = Integer.MIN_VALUE;
            this.f19332y = Integer.MIN_VALUE;
            this.f19333z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.f19287a0 = false;
            this.f19289b0 = null;
            this.f19291c0 = 0;
            this.f19293d0 = true;
            this.f19295e0 = true;
            this.f19297f0 = false;
            this.f19299g0 = false;
            this.f19301h0 = false;
            this.f19303i0 = false;
            this.f19305j0 = false;
            this.f19307k0 = -1;
            this.f19309l0 = -1;
            this.f19311m0 = -1;
            this.f19313n0 = -1;
            this.f19315o0 = Integer.MIN_VALUE;
            this.f19317p0 = Integer.MIN_VALUE;
            this.f19319q0 = 0.5f;
            this.f19327u0 = new ConstraintWidget();
            this.f19329v0 = false;
            this.f19286a = layoutParams.f19286a;
            this.f19288b = layoutParams.f19288b;
            this.f19290c = layoutParams.f19290c;
            this.f19292d = layoutParams.f19292d;
            this.f19294e = layoutParams.f19294e;
            this.f19296f = layoutParams.f19296f;
            this.f19298g = layoutParams.f19298g;
            this.f19300h = layoutParams.f19300h;
            this.f19302i = layoutParams.f19302i;
            this.f19304j = layoutParams.f19304j;
            this.f19306k = layoutParams.f19306k;
            this.f19308l = layoutParams.f19308l;
            this.f19310m = layoutParams.f19310m;
            this.f19312n = layoutParams.f19312n;
            this.f19314o = layoutParams.f19314o;
            this.f19316p = layoutParams.f19316p;
            this.f19318q = layoutParams.f19318q;
            this.f19320r = layoutParams.f19320r;
            this.f19322s = layoutParams.f19322s;
            this.f19324t = layoutParams.f19324t;
            this.f19326u = layoutParams.f19326u;
            this.f19328v = layoutParams.f19328v;
            this.f19330w = layoutParams.f19330w;
            this.f19331x = layoutParams.f19331x;
            this.f19332y = layoutParams.f19332y;
            this.f19333z = layoutParams.f19333z;
            this.A = layoutParams.A;
            this.B = layoutParams.B;
            this.C = layoutParams.C;
            this.F = layoutParams.F;
            this.G = layoutParams.G;
            this.H = layoutParams.H;
            this.I = layoutParams.I;
            this.J = layoutParams.J;
            this.K = layoutParams.K;
            this.L = layoutParams.L;
            this.M = layoutParams.M;
            this.N = layoutParams.N;
            this.Z = layoutParams.Z;
            this.f19287a0 = layoutParams.f19287a0;
            this.O = layoutParams.O;
            this.P = layoutParams.P;
            this.Q = layoutParams.Q;
            this.S = layoutParams.S;
            this.R = layoutParams.R;
            this.T = layoutParams.T;
            this.U = layoutParams.U;
            this.V = layoutParams.V;
            this.W = layoutParams.W;
            this.X = layoutParams.X;
            this.Y = layoutParams.Y;
            this.f19293d0 = layoutParams.f19293d0;
            this.f19295e0 = layoutParams.f19295e0;
            this.f19297f0 = layoutParams.f19297f0;
            this.f19299g0 = layoutParams.f19299g0;
            this.f19307k0 = layoutParams.f19307k0;
            this.f19309l0 = layoutParams.f19309l0;
            this.f19311m0 = layoutParams.f19311m0;
            this.f19313n0 = layoutParams.f19313n0;
            this.f19315o0 = layoutParams.f19315o0;
            this.f19317p0 = layoutParams.f19317p0;
            this.f19319q0 = layoutParams.f19319q0;
            this.f19289b0 = layoutParams.f19289b0;
            this.f19291c0 = layoutParams.f19291c0;
            this.f19327u0 = layoutParams.f19327u0;
            this.D = layoutParams.D;
            this.E = layoutParams.E;
        }

        public String a() {
            return this.f19289b0;
        }

        public ConstraintWidget b() {
            return this.f19327u0;
        }

        public void c() {
            ConstraintWidget constraintWidget = this.f19327u0;
            if (constraintWidget != null) {
                constraintWidget.N0();
            }
        }

        public void d(String str) {
            this.f19327u0.d1(str);
        }

        public void e() {
            this.f19299g0 = false;
            this.f19293d0 = true;
            this.f19295e0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.Z) {
                this.f19293d0 = false;
                if (this.O == 0) {
                    this.O = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f19287a0) {
                this.f19295e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f19293d0 = false;
                if (i10 == 0 && this.O == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.Z = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f19295e0 = false;
                if (i11 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f19287a0 = true;
                }
            }
            if (this.f19290c == -1.0f && this.f19286a == -1 && this.f19288b == -1) {
                return;
            }
            this.f19299g0 = true;
            this.f19293d0 = true;
            this.f19295e0 = true;
            if (!(this.f19327u0 instanceof androidx.constraintlayout.core.widgets.f)) {
                this.f19327u0 = new androidx.constraintlayout.core.widgets.f();
            }
            ((androidx.constraintlayout.core.widgets.f) this.f19327u0).v2(this.Y);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:36:0x0076  */
        /* JADX WARN: Code duplicated, block: B:37:0x007e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x0080  */
        /* JADX WARN: Code duplicated, block: B:39:0x0087 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0089  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f19311m0 = -1;
            this.f19313n0 = -1;
            this.f19307k0 = -1;
            this.f19309l0 = -1;
            this.f19315o0 = this.f19328v;
            this.f19317p0 = this.f19331x;
            float f10 = this.F;
            this.f19319q0 = f10;
            int i17 = this.f19286a;
            this.f19321r0 = i17;
            int i18 = this.f19288b;
            this.f19323s0 = i18;
            float f11 = this.f19290c;
            this.f19325t0 = f11;
            if (z11) {
                int i19 = this.f19320r;
                if (i19 != -1) {
                    this.f19311m0 = i19;
                } else {
                    int i20 = this.f19322s;
                    if (i20 != -1) {
                        this.f19313n0 = i20;
                    } else {
                        i11 = this.f19324t;
                        if (i11 != -1) {
                            this.f19309l0 = i11;
                            z10 = true;
                        }
                        i12 = this.f19326u;
                        if (i12 != -1) {
                            this.f19307k0 = i12;
                            z10 = true;
                        }
                        i13 = this.f19333z;
                        if (i13 != Integer.MIN_VALUE) {
                            this.f19317p0 = i13;
                        }
                        i14 = this.A;
                        if (i14 != Integer.MIN_VALUE) {
                            this.f19315o0 = i14;
                        }
                        if (z10) {
                            this.f19319q0 = 1.0f - f10;
                        }
                        if (this.f19299g0 && this.Y == 1) {
                            if (f11 != -1.0f) {
                                this.f19325t0 = 1.0f - f11;
                                this.f19321r0 = -1;
                                this.f19323s0 = -1;
                            } else if (i17 != -1) {
                                this.f19323s0 = i17;
                                this.f19321r0 = -1;
                                this.f19325t0 = -1.0f;
                            } else if (i18 != -1) {
                                this.f19321r0 = i18;
                                this.f19323s0 = -1;
                                this.f19325t0 = -1.0f;
                            }
                        }
                    }
                }
                z10 = true;
                i11 = this.f19324t;
                if (i11 != -1) {
                    this.f19309l0 = i11;
                    z10 = true;
                }
                i12 = this.f19326u;
                if (i12 != -1) {
                    this.f19307k0 = i12;
                    z10 = true;
                }
                i13 = this.f19333z;
                if (i13 != Integer.MIN_VALUE) {
                    this.f19317p0 = i13;
                }
                i14 = this.A;
                if (i14 != Integer.MIN_VALUE) {
                    this.f19315o0 = i14;
                }
                if (z10) {
                    this.f19319q0 = 1.0f - f10;
                }
                if (this.f19299g0) {
                    if (f11 != -1.0f) {
                        this.f19325t0 = 1.0f - f11;
                        this.f19321r0 = -1;
                        this.f19323s0 = -1;
                    } else if (i17 != -1) {
                        this.f19323s0 = i17;
                        this.f19321r0 = -1;
                        this.f19325t0 = -1.0f;
                    } else if (i18 != -1) {
                        this.f19321r0 = i18;
                        this.f19323s0 = -1;
                        this.f19325t0 = -1.0f;
                    }
                }
            } else {
                int i21 = this.f19320r;
                if (i21 != -1) {
                    this.f19309l0 = i21;
                }
                int i22 = this.f19322s;
                if (i22 != -1) {
                    this.f19307k0 = i22;
                }
                int i23 = this.f19324t;
                if (i23 != -1) {
                    this.f19311m0 = i23;
                }
                int i24 = this.f19326u;
                if (i24 != -1) {
                    this.f19313n0 = i24;
                }
                int i25 = this.f19333z;
                if (i25 != Integer.MIN_VALUE) {
                    this.f19315o0 = i25;
                }
                int i26 = this.A;
                if (i26 != Integer.MIN_VALUE) {
                    this.f19317p0 = i26;
                }
            }
            if (this.f19324t == -1 && this.f19326u == -1 && this.f19322s == -1 && this.f19320r == -1) {
                int i27 = this.f19296f;
                if (i27 != -1) {
                    this.f19311m0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f19298g;
                    if (i28 != -1) {
                        this.f19313n0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f19292d;
                if (i29 != -1) {
                    this.f19307k0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f19294e;
                if (i30 != -1) {
                    this.f19309l0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19368a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f19368a = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19368a[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19368a[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19368a[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class b implements androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0110b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f19369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f19370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f19371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f19372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f19374f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f19375g;

        public b(ConstraintLayout constraintLayout) {
            this.f19369a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0110b
        public final void a() {
            int childCount = this.f19369a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f19369a.getChildAt(i10);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).b(this.f19369a);
                }
            }
            int size = this.f19369a.f19258c.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((ConstraintHelper) this.f19369a.f19258c.get(i11)).E(this.f19369a);
                }
            }
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0110b
        @SuppressLint({"WrongCall"})
        public final void b(ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int iMakeMeasureSpec3;
            int i10;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.i0() == 8 && !constraintWidget.y0()) {
                aVar.f18347e = 0;
                aVar.f18348f = 0;
                aVar.f18349g = 0;
                return;
            }
            if (constraintWidget.U() == null) {
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f18343a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f18344b;
            int i11 = aVar.f18345c;
            int i12 = aVar.f18346d;
            int i13 = this.f19370b + this.f19371c;
            int i14 = this.f19372d;
            View view = (View) constraintWidget.w();
            int[] iArr = a.f19368a;
            int i15 = iArr[dimensionBehaviour.ordinal()];
            if (i15 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i15 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f19374f, i14, -2);
            } else if (i15 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f19374f, i14 + constraintWidget.I(), -1);
            } else if (i15 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f19374f, i14, -2);
                boolean z10 = constraintWidget.f18296w == 1;
                int i16 = aVar.f18352j;
                if (i16 == androidx.constraintlayout.core.widgets.analyzer.b.a.f18341l || i16 == androidx.constraintlayout.core.widgets.analyzer.b.a.f18342m) {
                    if (aVar.f18352j == androidx.constraintlayout.core.widgets.analyzer.b.a.f18342m || !z10 || (z10 && (view.getMeasuredHeight() == constraintWidget.D())) || (view instanceof Placeholder) || constraintWidget.C0()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.j0(), 1073741824);
                    }
                }
            }
            int i17 = iArr[dimensionBehaviour2.ordinal()];
            if (i17 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i17 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f19375g, i13, -2);
            } else if (i17 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f19375g, i13 + constraintWidget.h0(), -1);
            } else if (i17 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f19375g, i13, -2);
                boolean z11 = constraintWidget.f18298x == 1;
                int i18 = aVar.f18352j;
                if (i18 == androidx.constraintlayout.core.widgets.analyzer.b.a.f18341l || i18 == androidx.constraintlayout.core.widgets.analyzer.b.a.f18342m) {
                    if (aVar.f18352j == androidx.constraintlayout.core.widgets.analyzer.b.a.f18342m || !z11 || (z11 && (view.getMeasuredWidth() == constraintWidget.j0())) || (view instanceof Placeholder) || constraintWidget.D0()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.D(), 1073741824);
                    }
                }
            }
            androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.U();
            if (dVar != null && i.b(ConstraintLayout.this.f19265j, 256) && view.getMeasuredWidth() == constraintWidget.j0() && view.getMeasuredWidth() < dVar.j0() && view.getMeasuredHeight() == constraintWidget.D() && view.getMeasuredHeight() < dVar.D() && view.getBaseline() == constraintWidget.t() && !constraintWidget.B0()) {
                if (d(constraintWidget.J(), iMakeMeasureSpec, constraintWidget.j0()) && d(constraintWidget.K(), iMakeMeasureSpec2, constraintWidget.D())) {
                    aVar.f18347e = constraintWidget.j0();
                    aVar.f18348f = constraintWidget.D();
                    aVar.f18349g = constraintWidget.t();
                    return;
                }
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z12 = dimensionBehaviour == dimensionBehaviour3;
            boolean z13 = dimensionBehaviour2 == dimensionBehaviour3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            boolean z14 = dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z15 = dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z16 = z12 && constraintWidget.f18263f0 > 0.0f;
            boolean z17 = z13 && constraintWidget.f18263f0 > 0.0f;
            if (view == null) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i19 = aVar.f18352j;
            if (i19 != androidx.constraintlayout.core.widgets.analyzer.b.a.f18341l && i19 != androidx.constraintlayout.core.widgets.analyzer.b.a.f18342m && z12 && constraintWidget.f18296w == 0 && z13 && constraintWidget.f18298x == 0) {
                i10 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof VirtualLayout) && (constraintWidget instanceof l)) {
                    ((VirtualLayout) view).J((l) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                constraintWidget.D1(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i20 = constraintWidget.f18302z;
                iMax = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                int i21 = constraintWidget.A;
                if (i21 > 0) {
                    iMax = Math.min(i21, iMax);
                }
                int i22 = constraintWidget.C;
                iMax2 = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
                int i23 = constraintWidget.D;
                if (i23 > 0) {
                    iMax2 = Math.min(i23, iMax2);
                }
                if (!i.b(ConstraintLayout.this.f19265j, 1)) {
                    if (z16 && z14) {
                        iMax = (int) ((iMax2 * constraintWidget.f18263f0) + 0.5f);
                    } else if (z17 && z15) {
                        iMax2 = (int) ((iMax / constraintWidget.f18263f0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec3 = iMakeMeasureSpec;
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    iMakeMeasureSpec3 = iMakeMeasureSpec;
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    constraintWidget.D1(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i10 = -1;
            }
            boolean z18 = baseline != i10;
            aVar.f18351i = (iMax == aVar.f18345c && iMax2 == aVar.f18346d) ? false : true;
            if (layoutParams.f19297f0) {
                z18 = true;
            }
            if (z18 && baseline != -1 && constraintWidget.t() != baseline) {
                aVar.f18351i = true;
            }
            aVar.f18347e = iMax;
            aVar.f18348f = iMax2;
            aVar.f18350h = z18;
            aVar.f18349g = baseline;
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f19370b = i12;
            this.f19371c = i13;
            this.f19372d = i14;
            this.f19373e = i15;
            this.f19374f = i10;
            this.f19375g = i11;
        }
    }

    public ConstraintLayout(@n0 Context context) {
        super(context);
        this.f19257b = new SparseArray<>();
        this.f19258c = new ArrayList<>(4);
        this.f19259d = new androidx.constraintlayout.core.widgets.d();
        this.f19260e = 0;
        this.f19261f = 0;
        this.f19262g = Integer.MAX_VALUE;
        this.f19263h = Integer.MAX_VALUE;
        this.f19264i = true;
        this.f19265j = 257;
        this.f19266k = null;
        this.f19267l = null;
        this.f19268m = -1;
        this.f19269n = new HashMap<>();
        this.f19270o = -1;
        this.f19271p = -1;
        this.f19272q = -1;
        this.f19273r = -1;
        this.f19274s = 0;
        this.f19275t = 0;
        this.f19276u = new SparseArray<>();
        this.f19279x = new b(this);
        this.f19280y = 0;
        this.f19281z = 0;
        r(null, 0, 0);
    }

    public ConstraintLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19257b = new SparseArray<>();
        this.f19258c = new ArrayList<>(4);
        this.f19259d = new androidx.constraintlayout.core.widgets.d();
        this.f19260e = 0;
        this.f19261f = 0;
        this.f19262g = Integer.MAX_VALUE;
        this.f19263h = Integer.MAX_VALUE;
        this.f19264i = true;
        this.f19265j = 257;
        this.f19266k = null;
        this.f19267l = null;
        this.f19268m = -1;
        this.f19269n = new HashMap<>();
        this.f19270o = -1;
        this.f19271p = -1;
        this.f19272q = -1;
        this.f19273r = -1;
        this.f19274s = 0;
        this.f19275t = 0;
        this.f19276u = new SparseArray<>();
        this.f19279x = new b(this);
        this.f19280y = 0;
        this.f19281z = 0;
        r(attributeSet, 0, 0);
    }

    public ConstraintLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19257b = new SparseArray<>();
        this.f19258c = new ArrayList<>(4);
        this.f19259d = new androidx.constraintlayout.core.widgets.d();
        this.f19260e = 0;
        this.f19261f = 0;
        this.f19262g = Integer.MAX_VALUE;
        this.f19263h = Integer.MAX_VALUE;
        this.f19264i = true;
        this.f19265j = 257;
        this.f19266k = null;
        this.f19267l = null;
        this.f19268m = -1;
        this.f19269n = new HashMap<>();
        this.f19270o = -1;
        this.f19271p = -1;
        this.f19272q = -1;
        this.f19273r = -1;
        this.f19274s = 0;
        this.f19275t = 0;
        this.f19276u = new SparseArray<>();
        this.f19279x = new b(this);
        this.f19280y = 0;
        this.f19281z = 0;
        r(attributeSet, i10, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f19257b = new SparseArray<>();
        this.f19258c = new ArrayList<>(4);
        this.f19259d = new androidx.constraintlayout.core.widgets.d();
        this.f19260e = 0;
        this.f19261f = 0;
        this.f19262g = Integer.MAX_VALUE;
        this.f19263h = Integer.MAX_VALUE;
        this.f19264i = true;
        this.f19265j = 257;
        this.f19266k = null;
        this.f19267l = null;
        this.f19268m = -1;
        this.f19269n = new HashMap<>();
        this.f19270o = -1;
        this.f19271p = -1;
        this.f19272q = -1;
        this.f19273r = -1;
        this.f19274s = 0;
        this.f19275t = 0;
        this.f19276u = new SparseArray<>();
        this.f19279x = new b(this);
        this.f19280y = 0;
        this.f19281z = 0;
        r(attributeSet, i10, i11);
    }

    private void A(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray, int i10, ConstraintAnchor.Type type) {
        View view = this.f19257b.get(i10);
        ConstraintWidget constraintWidget2 = sparseArray.get(i10);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.f19297f0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.f19297f0 = true;
            layoutParams2.f19327u0.r1(true);
        }
        constraintWidget.r(type2).b(constraintWidget2.r(type), layoutParams.C, layoutParams.B, true);
        constraintWidget.r1(true);
        constraintWidget.r(ConstraintAnchor.Type.TOP).x();
        constraintWidget.r(ConstraintAnchor.Type.BOTTOM).x();
    }

    private boolean B() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            y();
        }
        return z10;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static e getSharedValues() {
        if (I == null) {
            I = new e();
        }
        return I;
    }

    private final ConstraintWidget o(int i10) {
        if (i10 == 0) {
            return this.f19259d;
        }
        View viewFindViewById = this.f19257b.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f19259d;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((LayoutParams) viewFindViewById.getLayoutParams()).f19327u0;
    }

    private void r(AttributeSet attributeSet, int i10, int i11) {
        this.f19259d.b1(this);
        this.f19259d.O2(this.f19279x);
        this.f19257b.put(getId(), this);
        this.f19266k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f19429u, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.f19260e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f19260e);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.f19261f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f19261f);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.f19262g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f19262g);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.f19263h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f19263h);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f19265j = typedArrayObtainStyledAttributes.getInt(index, this.f19265j);
                } else if (index == R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f19267l = null;
                        }
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.f19266k = cVar;
                        cVar.w0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f19266k = null;
                    }
                    this.f19268m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f19259d.P2(this.f19265j);
    }

    private void u() {
        this.f19264i = true;
        this.f19270o = -1;
        this.f19271p = -1;
        this.f19272q = -1;
        this.f19273r = -1;
        this.f19274s = 0;
        this.f19275t = 0;
    }

    private void y() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ConstraintWidget constraintWidgetQ = q(getChildAt(i10));
            if (constraintWidgetQ != null) {
                constraintWidgetQ.N0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    o(childAt.getId()).d1(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f19268m != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f19268m && (childAt2 instanceof Constraints)) {
                    this.f19266k = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        c cVar = this.f19266k;
        if (cVar != null) {
            cVar.t(this, true);
        }
        this.f19259d.j2();
        int size = this.f19258c.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.f19258c.get(i13).H(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).c(this);
            }
        }
        this.f19276u.clear();
        this.f19276u.put(0, this.f19259d);
        this.f19276u.put(getId(), this.f19259d);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f19276u.put(childAt4.getId(), q(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            ConstraintWidget constraintWidgetQ2 = q(childAt5);
            if (constraintWidgetQ2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.f19259d.a(constraintWidgetQ2);
                h(zIsInEditMode, childAt5, constraintWidgetQ2, layoutParams, this.f19276u);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f19258c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f19258c.get(i10).F(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(y1.a.f141526c);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + i17;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        u();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getMaxHeight() {
        return this.f19263h;
    }

    public int getMaxWidth() {
        return this.f19262g;
    }

    public int getMinHeight() {
        return this.f19261f;
    }

    public int getMinWidth() {
        return this.f19260e;
    }

    public int getOptimizationLevel() {
        return this.f19259d.B2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(boolean z10, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        int i10;
        layoutParams.e();
        layoutParams.f19329v0 = false;
        constraintWidget.V1(view.getVisibility());
        if (layoutParams.f19303i0) {
            constraintWidget.B1(true);
            constraintWidget.V1(8);
        }
        constraintWidget.b1(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).B(constraintWidget, this.f19259d.I2());
        }
        if (layoutParams.f19299g0) {
            androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
            int i11 = layoutParams.f19321r0;
            int i12 = layoutParams.f19323s0;
            float f10 = layoutParams.f19325t0;
            if (f10 != -1.0f) {
                fVar.s2(f10);
                return;
            } else if (i11 != -1) {
                fVar.q2(i11);
                return;
            } else {
                if (i12 != -1) {
                    fVar.r2(i12);
                    return;
                }
                return;
            }
        }
        int i13 = layoutParams.f19307k0;
        int i14 = layoutParams.f19309l0;
        int i15 = layoutParams.f19311m0;
        int i16 = layoutParams.f19313n0;
        int i17 = layoutParams.f19315o0;
        int i18 = layoutParams.f19317p0;
        float f11 = layoutParams.f19319q0;
        int i19 = layoutParams.f19314o;
        if (i19 != -1) {
            ConstraintWidget constraintWidget6 = sparseArray.get(i19);
            if (constraintWidget6 != null) {
                constraintWidget.m(constraintWidget6, layoutParams.f19318q, layoutParams.f19316p);
            }
        } else {
            if (i13 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray.get(i13);
                if (constraintWidget7 != null) {
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                    constraintWidget.s0(type, constraintWidget7, type, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i17);
                }
            } else if (i14 != -1 && (constraintWidget2 = sparseArray.get(i14)) != null) {
                constraintWidget.s0(ConstraintAnchor.Type.LEFT, constraintWidget2, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i17);
            }
            if (i15 != -1) {
                ConstraintWidget constraintWidget8 = sparseArray.get(i15);
                if (constraintWidget8 != null) {
                    constraintWidget.s0(ConstraintAnchor.Type.RIGHT, constraintWidget8, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i18);
                }
            } else if (i16 != -1 && (constraintWidget3 = sparseArray.get(i16)) != null) {
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.s0(type2, constraintWidget3, type2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i18);
            }
            int i20 = layoutParams.f19300h;
            if (i20 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i20);
                if (constraintWidget9 != null) {
                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
                    constraintWidget.s0(type3, constraintWidget9, type3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f19330w);
                }
            } else {
                int i21 = layoutParams.f19302i;
                if (i21 != -1 && (constraintWidget4 = sparseArray.get(i21)) != null) {
                    constraintWidget.s0(ConstraintAnchor.Type.TOP, constraintWidget4, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f19330w);
                }
            }
            int i22 = layoutParams.f19304j;
            if (i22 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i22);
                if (constraintWidget10 != null) {
                    constraintWidget.s0(ConstraintAnchor.Type.BOTTOM, constraintWidget10, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f19332y);
                }
            } else {
                int i23 = layoutParams.f19306k;
                if (i23 != -1 && (constraintWidget5 = sparseArray.get(i23)) != null) {
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.s0(type4, constraintWidget5, type4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f19332y);
                }
            }
            int i24 = layoutParams.f19308l;
            if (i24 != -1) {
                A(constraintWidget, layoutParams, sparseArray, i24, ConstraintAnchor.Type.BASELINE);
            } else {
                int i25 = layoutParams.f19310m;
                if (i25 != -1) {
                    A(constraintWidget, layoutParams, sparseArray, i25, ConstraintAnchor.Type.TOP);
                } else {
                    int i26 = layoutParams.f19312n;
                    if (i26 != -1) {
                        A(constraintWidget, layoutParams, sparseArray, i26, ConstraintAnchor.Type.BOTTOM);
                    }
                }
            }
            if (f11 >= 0.0f) {
                constraintWidget.u1(f11);
            }
            float f12 = layoutParams.G;
            if (f12 >= 0.0f) {
                constraintWidget.P1(f12);
            }
        }
        if (z10 && ((i10 = layoutParams.W) != -1 || layoutParams.X != -1)) {
            constraintWidget.L1(i10, layoutParams.X);
        }
        if (layoutParams.f19293d0) {
            constraintWidget.x1(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.W1(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                constraintWidget.x1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            if (layoutParams.Z) {
                constraintWidget.x1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget.x1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget.r(ConstraintAnchor.Type.LEFT).f18223g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            constraintWidget.r(ConstraintAnchor.Type.RIGHT).f18223g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            constraintWidget.x1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget.W1(0);
        }
        if (layoutParams.f19295e0) {
            constraintWidget.S1(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.s1(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                constraintWidget.S1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            if (layoutParams.f19287a0) {
                constraintWidget.S1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget.S1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget.r(ConstraintAnchor.Type.TOP).f18223g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            constraintWidget.r(ConstraintAnchor.Type.BOTTOM).f18223g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            constraintWidget.S1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget.s1(0);
        }
        constraintWidget.h1(layoutParams.H);
        constraintWidget.z1(layoutParams.K);
        constraintWidget.U1(layoutParams.L);
        constraintWidget.v1(layoutParams.M);
        constraintWidget.Q1(layoutParams.N);
        constraintWidget.Y1(layoutParams.f19291c0);
        constraintWidget.y1(layoutParams.O, layoutParams.Q, layoutParams.S, layoutParams.U);
        constraintWidget.T1(layoutParams.P, layoutParams.R, layoutParams.T, layoutParams.V);
    }

    public void i(androidx.constraintlayout.core.f fVar) {
        this.f19278w = fVar;
        this.f19259d.y2(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public Object n(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f19269n;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f19269n.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f19327u0;
            if ((childAt.getVisibility() != 8 || layoutParams.f19299g0 || layoutParams.f19301h0 || layoutParams.f19305j0 || zIsInEditMode) && !layoutParams.f19303i0) {
                int iL0 = constraintWidget.l0();
                int iM0 = constraintWidget.m0();
                int iJ0 = constraintWidget.j0() + iL0;
                int iD = constraintWidget.D() + iM0;
                childAt.layout(iL0, iM0, iJ0, iD);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iL0, iM0, iJ0, iD);
                }
            }
        }
        int size = this.f19258c.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f19258c.get(i15).D(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f19280y == i10) {
            int i12 = this.f19281z;
        }
        if (!this.f19264i) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).isLayoutRequested()) {
                    this.f19264i = true;
                    break;
                }
            }
        }
        boolean z10 = this.f19264i;
        this.f19280y = i10;
        this.f19281z = i11;
        this.f19259d.S2(s());
        if (this.f19264i) {
            this.f19264i = false;
            if (B()) {
                this.f19259d.U2();
            }
        }
        x(this.f19259d, this.f19265j, i10, i11);
        w(i10, i11, this.f19259d.j0(), this.f19259d.D(), this.f19259d.J2(), this.f19259d.H2());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget constraintWidgetQ = q(view);
        if ((view instanceof Guideline) && !(constraintWidgetQ instanceof androidx.constraintlayout.core.widgets.f)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.f fVar = new androidx.constraintlayout.core.widgets.f();
            layoutParams.f19327u0 = fVar;
            layoutParams.f19299g0 = true;
            fVar.v2(layoutParams.Y);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.I();
            ((LayoutParams) view.getLayoutParams()).f19301h0 = true;
            if (!this.f19258c.contains(constraintHelper)) {
                this.f19258c.add(constraintHelper);
            }
        }
        this.f19257b.put(view.getId(), view);
        this.f19264i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f19257b.remove(view.getId());
        this.f19259d.i2(q(view));
        this.f19258c.remove(view);
        this.f19264i = true;
    }

    public View p(int i10) {
        return this.f19257b.get(i10);
    }

    public final ConstraintWidget q(View view) {
        if (view == this) {
            return this.f19259d;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f19327u0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f19327u0;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        u();
        super.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void setConstraintSet(c cVar) {
        this.f19266k = cVar;
    }

    public void setDesignInformation(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f19269n == null) {
                this.f19269n = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f19269n.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f19257b.remove(getId());
        super.setId(i10);
        this.f19257b.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f19263h) {
            return;
        }
        this.f19263h = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f19262g) {
            return;
        }
        this.f19262g = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f19261f) {
            return;
        }
        this.f19261f = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f19260e) {
            return;
        }
        this.f19260e = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(d dVar) {
        this.f19277v = dVar;
        androidx.constraintlayout.widget.a aVar = this.f19267l;
        if (aVar != null) {
            aVar.d(dVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f19265j = i10;
        this.f19259d.P2(i10);
    }

    public void setState(int i10, int i11, int i12) {
        androidx.constraintlayout.widget.a aVar = this.f19267l;
        if (aVar != null) {
            aVar.e(i10, i11, i12);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(int i10) {
        if (i10 == 0) {
            this.f19267l = null;
            return;
        }
        try {
            this.f19267l = new androidx.constraintlayout.widget.a(getContext(), this, i10);
        } catch (Resources.NotFoundException unused) {
            this.f19267l = null;
        }
    }

    protected void v(int i10) {
        this.f19267l = new androidx.constraintlayout.widget.a(getContext(), this, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        b bVar = this.f19279x;
        int i14 = bVar.f19373e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + bVar.f19372d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f19262g, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f19263h, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f19270o = iMin;
        this.f19271p = iMin2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x(androidx.constraintlayout.core.widgets.d dVar, int i10, int i11, int i12) {
        int iMax;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax2 = Math.max(0, getPaddingTop());
        int iMax3 = Math.max(0, getPaddingBottom());
        int i13 = iMax2 + iMax3;
        int paddingWidth = getPaddingWidth();
        this.f19279x.c(i11, i12, iMax2, iMax3, paddingWidth, i13);
        int iMax4 = Math.max(0, getPaddingStart());
        int iMax5 = Math.max(0, getPaddingEnd());
        if (iMax4 > 0 || iMax5 > 0) {
            iMax = s() ? iMax5 : iMax4;
        } else {
            iMax = Math.max(0, getPaddingLeft());
        }
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        z(dVar, mode, i14, mode2, i15);
        dVar.K2(i10, mode, i14, mode2, i15, this.f19270o, this.f19271p, iMax, iMax2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
  0x003e: PHI (r2v4 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
  (r2v3 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
  (r2v0 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
 binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    protected void z(androidx.constraintlayout.core.widgets.d dVar, int i10, int i11, int i12, int i13) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        b bVar = this.f19279x;
        int i14 = bVar.f19373e;
        int i15 = bVar.f19372d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f19260e);
            }
        } else if (i10 == 0) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            i11 = childCount == 0 ? Math.max(0, this.f19260e) : 0;
        } else if (i10 != 1073741824) {
            dimensionBehaviour = dimensionBehaviour2;
        } else {
            i11 = Math.min(this.f19262g - i15, i11);
            dimensionBehaviour = dimensionBehaviour2;
        }
        if (i12 == Integer.MIN_VALUE) {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f19261f);
            }
        } else if (i12 == 0) {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f19261f);
            } else {
                i13 = 0;
            }
        } else if (i12 != 1073741824) {
            i13 = 0;
        } else {
            i13 = Math.min(this.f19263h - i14, i13);
        }
        if (i11 != dVar.j0() || i13 != dVar.D()) {
            dVar.G2();
        }
        dVar.Z1(0);
        dVar.a2(0);
        dVar.G1(this.f19262g - i15);
        dVar.F1(this.f19263h - i14);
        dVar.J1(0);
        dVar.I1(0);
        dVar.x1(dimensionBehaviour);
        dVar.W1(i11);
        dVar.S1(dimensionBehaviour2);
        dVar.s1(i13);
        dVar.J1(this.f19260e - i15);
        dVar.I1(this.f19261f - i14);
    }
}
