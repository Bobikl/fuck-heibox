package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.s;
import com.huawei.hms.framework.common.ContainerUtils;
import com.meituan.robust.Constants;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ConstraintSet.java */
/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final int A = 1;
    private static final int A0 = 29;
    private static final int A1 = 81;
    public static final int B = 0;
    private static final int B0 = 30;
    private static final int B1 = 82;
    public static final int C = 1;
    private static final int C0 = 31;
    private static final int C1 = 83;
    public static final int D = 0;
    private static final int D0 = 32;
    private static final int D1 = 84;
    public static final int E = 4;
    private static final int E0 = 33;
    private static final int E1 = 85;
    public static final int F = 8;
    private static final int F0 = 34;
    private static final int F1 = 86;
    public static final int G = 1;
    private static final int G0 = 35;
    private static final int G1 = 87;
    public static final int H = 2;
    private static final int H0 = 36;
    private static final int H1 = 88;
    public static final int I = 3;
    private static final int I0 = 37;
    private static final int I1 = 89;
    public static final int J = 4;
    private static final int J0 = 38;
    private static final int J1 = 90;
    public static final int K = 5;
    private static final int K0 = 39;
    private static final int K1 = 91;
    public static final int L = 6;
    private static final int L0 = 40;
    private static final int L1 = 92;
    public static final int M = 7;
    private static final int M0 = 41;
    private static final int M1 = 93;
    public static final int N = 8;
    private static final int N0 = 42;
    private static final int N1 = 94;
    public static final int O = 0;
    private static final int O0 = 43;
    private static final int O1 = 95;
    public static final int P = 1;
    private static final int P0 = 44;
    private static final int P1 = 96;
    public static final int Q = 0;
    private static final int Q0 = 45;
    private static final int Q1 = 97;
    public static final int R = 1;
    private static final int R0 = 46;
    private static final int R1 = 98;
    public static final int S = 2;
    private static final int S0 = 47;
    private static final String S1 = "weight";
    private static final boolean T = false;
    private static final int T0 = 48;
    private static final String T1 = "ratio";
    private static final int U0 = 49;
    private static final String U1 = "parent";
    private static final int V = 1;
    private static final int V0 = 50;
    private static final int W0 = 51;
    private static final int X0 = 52;
    private static final int Y = 1;
    private static final int Y0 = 53;
    private static final int Z = 2;
    private static final int Z0 = 54;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f19482a0 = 3;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private static final int f19483a1 = 55;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f19484b0 = 4;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private static final int f19485b1 = 56;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f19486c0 = 5;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private static final int f19487c1 = 57;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f19488d0 = 6;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private static final int f19489d1 = 58;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int f19490e0 = 7;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static final int f19491e1 = 59;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int f19492f0 = 8;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private static final int f19493f1 = 60;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int f19494g0 = 9;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final int f19495g1 = 61;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f19496h = "ConstraintSet";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int f19497h0 = 10;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private static final int f19498h1 = 62;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f19499i = "XML parser error must be within a Constraint ";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f19500i0 = 11;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final int f19501i1 = 63;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f19502j = -1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int f19503j0 = 12;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private static final int f19504j1 = 64;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f19505k = -2;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int f19506k0 = 13;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private static final int f19507k1 = 65;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f19508l = -3;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f19509l0 = 14;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private static final int f19510l1 = 66;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f19511m = -4;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f19512m0 = 15;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private static final int f19513m1 = 67;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f19514n = 0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int f19515n0 = 16;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private static final int f19516n1 = 68;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f19517o = 1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final int f19518o0 = 17;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private static final int f19519o1 = 69;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f19520p = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f19521p0 = 18;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f19522p1 = 70;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f19523q = 3;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final int f19524q0 = 19;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private static final int f19525q1 = 71;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f19526r = 4;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final int f19527r0 = 20;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private static final int f19528r1 = 72;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f19529s = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final int f19530s0 = 21;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private static final int f19531s1 = 73;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f19532t = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final int f19533t0 = 22;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private static final int f19534t1 = 74;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f19535u = -2;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final int f19536u0 = 23;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private static final int f19537u1 = 75;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f19538v = 1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final int f19539v0 = 24;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private static final int f19540v1 = 76;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f19541w = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final int f19542w0 = 25;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private static final int f19543w1 = 77;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f19544x = 2;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final int f19545x0 = 26;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final int f19546x1 = 78;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f19547y = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int f19548y0 = 27;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int f19549y1 = 79;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f19550z = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final int f19551z0 = 28;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private static final int f19552z1 = 80;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19555c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19556d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<String, ConstraintAttribute> f19557e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19558f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<Integer, a> f19559g = new HashMap<>();
    private static final int[] U = {0, 4, 8};
    private static SparseIntArray W = new SparseIntArray();
    private static SparseIntArray X = new SparseIntArray();

    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f19561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f19562c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0117c f19563d = new C0117c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f19564e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f19565f = new e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f19566g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C0116a f19567h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ConstraintSet.java */
        public static class C0116a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private static final int f19568m = 4;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final int f19569n = 10;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static final int f19570o = 10;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private static final int f19571p = 5;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int[] f19572a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int[] f19573b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f19574c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int[] f19575d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            float[] f19576e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f19577f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int[] f19578g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            String[] f19579h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f19580i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int[] f19581j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            boolean[] f19582k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f19583l = 0;

            C0116a() {
            }

            void a(int i10, float f10) {
                int i11 = this.f19577f;
                int[] iArr = this.f19575d;
                if (i11 >= iArr.length) {
                    this.f19575d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f19576e;
                    this.f19576e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f19575d;
                int i12 = this.f19577f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f19576e;
                this.f19577f = i12 + 1;
                fArr2[i12] = f10;
            }

            void b(int i10, int i11) {
                int i12 = this.f19574c;
                int[] iArr = this.f19572a;
                if (i12 >= iArr.length) {
                    this.f19572a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f19573b;
                    this.f19573b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f19572a;
                int i13 = this.f19574c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f19573b;
                this.f19574c = i13 + 1;
                iArr4[i13] = i11;
            }

            void c(int i10, String str) {
                int i11 = this.f19580i;
                int[] iArr = this.f19578g;
                if (i11 >= iArr.length) {
                    this.f19578g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f19579h;
                    this.f19579h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f19578g;
                int i12 = this.f19580i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f19579h;
                this.f19580i = i12 + 1;
                strArr2[i12] = str;
            }

            void d(int i10, boolean z10) {
                int i11 = this.f19583l;
                int[] iArr = this.f19581j;
                if (i11 >= iArr.length) {
                    this.f19581j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f19582k;
                    this.f19582k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f19581j;
                int i12 = this.f19583l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f19582k;
                this.f19583l = i12 + 1;
                zArr2[i12] = z10;
            }

            void e(a aVar) {
                for (int i10 = 0; i10 < this.f19574c; i10++) {
                    c.S0(aVar, this.f19572a[i10], this.f19573b[i10]);
                }
                for (int i11 = 0; i11 < this.f19577f; i11++) {
                    c.R0(aVar, this.f19575d[i11], this.f19576e[i11]);
                }
                for (int i12 = 0; i12 < this.f19580i; i12++) {
                    c.T0(aVar, this.f19578g[i12], this.f19579h[i12]);
                }
                for (int i13 = 0; i13 < this.f19583l; i13++) {
                    c.U0(aVar, this.f19581j[i13], this.f19582k[i13]);
                }
            }

            @SuppressLint({"LogConditional"})
            void f(String str) {
                Log.v(str, Constants.INT);
                for (int i10 = 0; i10 < this.f19574c; i10++) {
                    Log.v(str, this.f19572a[i10] + " = " + this.f19573b[i10]);
                }
                Log.v(str, "float");
                for (int i11 = 0; i11 < this.f19577f; i11++) {
                    Log.v(str, this.f19575d[i11] + " = " + this.f19576e[i11]);
                }
                Log.v(str, "strings");
                for (int i12 = 0; i12 < this.f19580i; i12++) {
                    Log.v(str, this.f19578g[i12] + " = " + this.f19579h[i12]);
                }
                Log.v(str, "boolean");
                for (int i13 = 0; i13 < this.f19583l; i13++) {
                    Log.v(str, this.f19581j[i13] + " = " + this.f19582k[i13]);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(int i10, ConstraintLayout.LayoutParams layoutParams) {
            this.f19560a = i10;
            b bVar = this.f19564e;
            bVar.f19630i = layoutParams.f19292d;
            bVar.f19632j = layoutParams.f19294e;
            bVar.f19634k = layoutParams.f19296f;
            bVar.f19636l = layoutParams.f19298g;
            bVar.f19638m = layoutParams.f19300h;
            bVar.f19640n = layoutParams.f19302i;
            bVar.f19642o = layoutParams.f19304j;
            bVar.f19644p = layoutParams.f19306k;
            bVar.f19646q = layoutParams.f19308l;
            bVar.f19647r = layoutParams.f19310m;
            bVar.f19648s = layoutParams.f19312n;
            bVar.f19649t = layoutParams.f19320r;
            bVar.f19650u = layoutParams.f19322s;
            bVar.f19651v = layoutParams.f19324t;
            bVar.f19652w = layoutParams.f19326u;
            bVar.f19653x = layoutParams.F;
            bVar.f19654y = layoutParams.G;
            bVar.f19655z = layoutParams.H;
            bVar.A = layoutParams.f19314o;
            bVar.B = layoutParams.f19316p;
            bVar.C = layoutParams.f19318q;
            bVar.D = layoutParams.W;
            bVar.E = layoutParams.X;
            bVar.F = layoutParams.Y;
            bVar.f19628h = layoutParams.f19290c;
            bVar.f19624f = layoutParams.f19286a;
            bVar.f19626g = layoutParams.f19288b;
            bVar.f19620d = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            bVar.f19622e = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            bVar.G = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            bVar.H = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            bVar.I = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            bVar.J = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            bVar.M = layoutParams.C;
            bVar.U = layoutParams.L;
            bVar.V = layoutParams.K;
            bVar.X = layoutParams.N;
            bVar.W = layoutParams.M;
            bVar.f19639m0 = layoutParams.Z;
            bVar.f19641n0 = layoutParams.f19287a0;
            bVar.Y = layoutParams.O;
            bVar.Z = layoutParams.P;
            bVar.f19615a0 = layoutParams.S;
            bVar.f19617b0 = layoutParams.T;
            bVar.f19619c0 = layoutParams.Q;
            bVar.f19621d0 = layoutParams.R;
            bVar.f19623e0 = layoutParams.U;
            bVar.f19625f0 = layoutParams.V;
            bVar.f19637l0 = layoutParams.f19289b0;
            bVar.O = layoutParams.f19330w;
            bVar.Q = layoutParams.f19332y;
            bVar.N = layoutParams.f19328v;
            bVar.P = layoutParams.f19331x;
            bVar.S = layoutParams.f19333z;
            bVar.R = layoutParams.A;
            bVar.T = layoutParams.B;
            bVar.f19645p0 = layoutParams.f19291c0;
            bVar.K = layoutParams.getMarginEnd();
            this.f19564e.L = layoutParams.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int i10, Constraints.LayoutParams layoutParams) {
            k(i10, layoutParams);
            this.f19562c.f19685d = layoutParams.U0;
            e eVar = this.f19565f;
            eVar.f19700b = layoutParams.X0;
            eVar.f19701c = layoutParams.Y0;
            eVar.f19702d = layoutParams.Z0;
            eVar.f19703e = layoutParams.f19379a1;
            eVar.f19704f = layoutParams.f19380b1;
            eVar.f19705g = layoutParams.f19381c1;
            eVar.f19706h = layoutParams.f19382d1;
            eVar.f19708j = layoutParams.f19383e1;
            eVar.f19709k = layoutParams.f19384f1;
            eVar.f19710l = layoutParams.f19385g1;
            eVar.f19712n = layoutParams.W0;
            eVar.f19711m = layoutParams.V0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(ConstraintHelper constraintHelper, int i10, Constraints.LayoutParams layoutParams) {
            l(i10, layoutParams);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.f19564e;
                bVar.f19631i0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f19627g0 = barrier.getType();
                this.f19564e.f19633j0 = barrier.getReferencedIds();
                this.f19564e.f19629h0 = barrier.getMargin();
            }
        }

        private ConstraintAttribute n(String str, ConstraintAttribute.AttributeType attributeType) {
            if (!this.f19566g.containsKey(str)) {
                ConstraintAttribute constraintAttribute = new ConstraintAttribute(str, attributeType);
                this.f19566g.put(str, constraintAttribute);
                return constraintAttribute;
            }
            ConstraintAttribute constraintAttribute2 = this.f19566g.get(str);
            if (constraintAttribute2.e() == attributeType) {
                return constraintAttribute2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute2.e().name());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(String str, int i10) {
            n(str, ConstraintAttribute.AttributeType.COLOR_TYPE).l(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(String str, float f10) {
            n(str, ConstraintAttribute.AttributeType.FLOAT_TYPE).m(f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(String str, int i10) {
            n(str, ConstraintAttribute.AttributeType.INT_TYPE).n(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(String str, String str2) {
            n(str, ConstraintAttribute.AttributeType.STRING_TYPE).p(str2);
        }

        public void h(a aVar) {
            C0116a c0116a = this.f19567h;
            if (c0116a != null) {
                c0116a.e(aVar);
            }
        }

        public void i(ConstraintLayout.LayoutParams layoutParams) {
            b bVar = this.f19564e;
            layoutParams.f19292d = bVar.f19630i;
            layoutParams.f19294e = bVar.f19632j;
            layoutParams.f19296f = bVar.f19634k;
            layoutParams.f19298g = bVar.f19636l;
            layoutParams.f19300h = bVar.f19638m;
            layoutParams.f19302i = bVar.f19640n;
            layoutParams.f19304j = bVar.f19642o;
            layoutParams.f19306k = bVar.f19644p;
            layoutParams.f19308l = bVar.f19646q;
            layoutParams.f19310m = bVar.f19647r;
            layoutParams.f19312n = bVar.f19648s;
            layoutParams.f19320r = bVar.f19649t;
            layoutParams.f19322s = bVar.f19650u;
            layoutParams.f19324t = bVar.f19651v;
            layoutParams.f19326u = bVar.f19652w;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.I;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bVar.J;
            layoutParams.f19333z = bVar.S;
            layoutParams.A = bVar.R;
            layoutParams.f19330w = bVar.O;
            layoutParams.f19332y = bVar.Q;
            layoutParams.F = bVar.f19653x;
            layoutParams.G = bVar.f19654y;
            layoutParams.f19314o = bVar.A;
            layoutParams.f19316p = bVar.B;
            layoutParams.f19318q = bVar.C;
            layoutParams.H = bVar.f19655z;
            layoutParams.W = bVar.D;
            layoutParams.X = bVar.E;
            layoutParams.L = bVar.U;
            layoutParams.K = bVar.V;
            layoutParams.N = bVar.X;
            layoutParams.M = bVar.W;
            layoutParams.Z = bVar.f19639m0;
            layoutParams.f19287a0 = bVar.f19641n0;
            layoutParams.O = bVar.Y;
            layoutParams.P = bVar.Z;
            layoutParams.S = bVar.f19615a0;
            layoutParams.T = bVar.f19617b0;
            layoutParams.Q = bVar.f19619c0;
            layoutParams.R = bVar.f19621d0;
            layoutParams.U = bVar.f19623e0;
            layoutParams.V = bVar.f19625f0;
            layoutParams.Y = bVar.F;
            layoutParams.f19290c = bVar.f19628h;
            layoutParams.f19286a = bVar.f19624f;
            layoutParams.f19288b = bVar.f19626g;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = bVar.f19620d;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = bVar.f19622e;
            String str = bVar.f19637l0;
            if (str != null) {
                layoutParams.f19289b0 = str;
            }
            layoutParams.f19291c0 = bVar.f19645p0;
            layoutParams.setMarginStart(bVar.L);
            layoutParams.setMarginEnd(this.f19564e.K);
            layoutParams.e();
        }

        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f19564e.a(this.f19564e);
            aVar.f19563d.a(this.f19563d);
            aVar.f19562c.a(this.f19562c);
            aVar.f19565f.a(this.f19565f);
            aVar.f19560a = this.f19560a;
            aVar.f19567h = this.f19567h;
            return aVar;
        }

        public void o(String str) {
            C0116a c0116a = this.f19567h;
            if (c0116a != null) {
                c0116a.f(str);
            } else {
                Log.v(str, "DELTA IS NULL");
            }
        }
    }

    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class b {
        private static final int A0 = 8;
        private static final int B0 = 9;
        private static final int C0 = 10;
        private static final int D0 = 11;
        private static final int E0 = 12;
        private static final int F0 = 13;
        private static final int G0 = 14;
        private static final int H0 = 15;
        private static final int I0 = 16;
        private static final int J0 = 17;
        private static final int K0 = 18;
        private static final int L0 = 19;
        private static final int M0 = 20;
        private static final int N0 = 21;
        private static final int O0 = 22;
        private static final int P0 = 23;
        private static final int Q0 = 24;
        private static final int R0 = 25;
        private static final int S0 = 26;
        private static final int T0 = 27;
        private static final int U0 = 28;
        private static final int V0 = 29;
        private static final int W0 = 30;
        private static final int X0 = 31;
        private static final int Y0 = 32;
        private static final int Z0 = 33;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        private static final int f19584a1 = 34;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        private static final int f19585b1 = 35;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        private static final int f19586c1 = 36;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        private static final int f19587d1 = 37;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static final int f19588e1 = 38;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        private static final int f19589f1 = 39;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        private static final int f19590g1 = 40;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        private static final int f19591h1 = 41;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        private static final int f19592i1 = 42;

        /* JADX INFO: renamed from: j1, reason: collision with root package name */
        private static final int f19593j1 = 61;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        private static final int f19594k1 = 62;

        /* JADX INFO: renamed from: l1, reason: collision with root package name */
        private static final int f19595l1 = 63;

        /* JADX INFO: renamed from: m1, reason: collision with root package name */
        private static final int f19596m1 = 69;

        /* JADX INFO: renamed from: n1, reason: collision with root package name */
        private static final int f19597n1 = 70;

        /* JADX INFO: renamed from: o1, reason: collision with root package name */
        private static final int f19598o1 = 71;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        private static final int f19599p1 = 72;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f19600q0 = -1;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        private static final int f19601q1 = 73;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f19602r0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        private static final int f19603r1 = 74;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        private static SparseIntArray f19604s0 = null;

        /* JADX INFO: renamed from: s1, reason: collision with root package name */
        private static final int f19605s1 = 75;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        private static final int f19606t0 = 1;

        /* JADX INFO: renamed from: t1, reason: collision with root package name */
        private static final int f19607t1 = 76;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        private static final int f19608u0 = 2;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private static final int f19609v0 = 3;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        private static final int f19610w0 = 4;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        private static final int f19611x0 = 5;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        private static final int f19612y0 = 6;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        private static final int f19613z0 = 7;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19622e;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int[] f19633j0;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public String f19635k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f19637l0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19614a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19616b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f19618c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19624f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19626g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f19628h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f19630i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f19632j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f19634k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f19636l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f19638m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19640n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f19642o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f19644p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f19646q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f19647r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f19648s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19649t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f19650u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f19651v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f19652w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f19653x = 0.5f;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f19654y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f19655z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f19615a0 = -1;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f19617b0 = -1;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f19619c0 = -1;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f19621d0 = -1;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public float f19623e0 = 1.0f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f19625f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f19627g0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f19629h0 = 0;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f19631i0 = -1;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public boolean f19639m0 = false;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f19641n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f19643o0 = true;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f19645p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f19604s0 = sparseIntArray;
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            f19604s0.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            f19604s0.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            f19604s0.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            f19604s0.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            f19604s0.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            f19604s0.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            f19604s0.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            f19604s0.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f19604s0.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            f19604s0.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            f19604s0.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            f19604s0.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            f19604s0.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            f19604s0.append(R.styleable.Layout_android_orientation, 26);
            f19604s0.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            f19604s0.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            f19604s0.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            f19604s0.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            f19604s0.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            f19604s0.append(R.styleable.Layout_layout_goneMarginTop, 16);
            f19604s0.append(R.styleable.Layout_layout_goneMarginRight, 14);
            f19604s0.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            f19604s0.append(R.styleable.Layout_layout_goneMarginStart, 15);
            f19604s0.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            f19604s0.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            f19604s0.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            f19604s0.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            f19604s0.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            f19604s0.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            f19604s0.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            f19604s0.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            f19604s0.append(R.styleable.Layout_layout_constraintLeft_creator, 76);
            f19604s0.append(R.styleable.Layout_layout_constraintTop_creator, 76);
            f19604s0.append(R.styleable.Layout_layout_constraintRight_creator, 76);
            f19604s0.append(R.styleable.Layout_layout_constraintBottom_creator, 76);
            f19604s0.append(R.styleable.Layout_layout_constraintBaseline_creator, 76);
            f19604s0.append(R.styleable.Layout_android_layout_marginLeft, 23);
            f19604s0.append(R.styleable.Layout_android_layout_marginRight, 27);
            f19604s0.append(R.styleable.Layout_android_layout_marginStart, 30);
            f19604s0.append(R.styleable.Layout_android_layout_marginEnd, 8);
            f19604s0.append(R.styleable.Layout_android_layout_marginTop, 33);
            f19604s0.append(R.styleable.Layout_android_layout_marginBottom, 2);
            f19604s0.append(R.styleable.Layout_android_layout_width, 22);
            f19604s0.append(R.styleable.Layout_android_layout_height, 21);
            f19604s0.append(R.styleable.Layout_layout_constraintWidth, 41);
            f19604s0.append(R.styleable.Layout_layout_constraintHeight, 42);
            f19604s0.append(R.styleable.Layout_layout_constrainedWidth, 41);
            f19604s0.append(R.styleable.Layout_layout_constrainedHeight, 42);
            f19604s0.append(R.styleable.Layout_layout_wrapBehaviorInParent, 97);
            f19604s0.append(R.styleable.Layout_layout_constraintCircle, 61);
            f19604s0.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
            f19604s0.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            f19604s0.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
            f19604s0.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
            f19604s0.append(R.styleable.Layout_chainUseRtl, 71);
            f19604s0.append(R.styleable.Layout_barrierDirection, 72);
            f19604s0.append(R.styleable.Layout_barrierMargin, 73);
            f19604s0.append(R.styleable.Layout_constraint_referenced_ids, 74);
            f19604s0.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void a(b bVar) {
            this.f19614a = bVar.f19614a;
            this.f19620d = bVar.f19620d;
            this.f19616b = bVar.f19616b;
            this.f19622e = bVar.f19622e;
            this.f19624f = bVar.f19624f;
            this.f19626g = bVar.f19626g;
            this.f19628h = bVar.f19628h;
            this.f19630i = bVar.f19630i;
            this.f19632j = bVar.f19632j;
            this.f19634k = bVar.f19634k;
            this.f19636l = bVar.f19636l;
            this.f19638m = bVar.f19638m;
            this.f19640n = bVar.f19640n;
            this.f19642o = bVar.f19642o;
            this.f19644p = bVar.f19644p;
            this.f19646q = bVar.f19646q;
            this.f19647r = bVar.f19647r;
            this.f19648s = bVar.f19648s;
            this.f19649t = bVar.f19649t;
            this.f19650u = bVar.f19650u;
            this.f19651v = bVar.f19651v;
            this.f19652w = bVar.f19652w;
            this.f19653x = bVar.f19653x;
            this.f19654y = bVar.f19654y;
            this.f19655z = bVar.f19655z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f19615a0 = bVar.f19615a0;
            this.f19617b0 = bVar.f19617b0;
            this.f19619c0 = bVar.f19619c0;
            this.f19621d0 = bVar.f19621d0;
            this.f19623e0 = bVar.f19623e0;
            this.f19625f0 = bVar.f19625f0;
            this.f19627g0 = bVar.f19627g0;
            this.f19629h0 = bVar.f19629h0;
            this.f19631i0 = bVar.f19631i0;
            this.f19637l0 = bVar.f19637l0;
            int[] iArr = bVar.f19633j0;
            if (iArr == null || bVar.f19635k0 != null) {
                this.f19633j0 = null;
            } else {
                this.f19633j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f19635k0 = bVar.f19635k0;
            this.f19639m0 = bVar.f19639m0;
            this.f19641n0 = bVar.f19641n0;
            this.f19643o0 = bVar.f19643o0;
            this.f19645p0 = bVar.f19645p0;
        }

        public void b(s sVar, StringBuilder sb2) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb2.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object objX = sVar.X(num.intValue());
                                sb2.append("    ");
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(objX == null ? num : objX);
                                sb2.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f10 = (Float) obj;
                            if (f10.floatValue() != -1.0f) {
                                sb2.append("    ");
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(f10);
                                sb2.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }

        void c(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.O);
            this.f19616b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f19604s0.get(index);
                if (i11 == 80) {
                    this.f19639m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f19639m0);
                } else if (i11 == 81) {
                    this.f19641n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f19641n0);
                } else if (i11 != 97) {
                    switch (i11) {
                        case 1:
                            this.f19646q = c.y0(typedArrayObtainStyledAttributes, index, this.f19646q);
                            break;
                        case 2:
                            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 3:
                            this.f19644p = c.y0(typedArrayObtainStyledAttributes, index, this.f19644p);
                            break;
                        case 4:
                            this.f19642o = c.y0(typedArrayObtainStyledAttributes, index, this.f19642o);
                            break;
                        case 5:
                            this.f19655z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                            break;
                        case 7:
                            this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                            break;
                        case 8:
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 9:
                            this.f19652w = c.y0(typedArrayObtainStyledAttributes, index, this.f19652w);
                            break;
                        case 10:
                            this.f19651v = c.y0(typedArrayObtainStyledAttributes, index, this.f19651v);
                            break;
                        case 11:
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        case 12:
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        case 13:
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 14:
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        case 15:
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        case 16:
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 17:
                            this.f19624f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f19624f);
                            break;
                        case 18:
                            this.f19626g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f19626g);
                            break;
                        case 19:
                            this.f19628h = typedArrayObtainStyledAttributes.getFloat(index, this.f19628h);
                            break;
                        case 20:
                            this.f19653x = typedArrayObtainStyledAttributes.getFloat(index, this.f19653x);
                            break;
                        case 21:
                            this.f19622e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f19622e);
                            break;
                        case 22:
                            this.f19620d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f19620d);
                            break;
                        case 23:
                            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 24:
                            this.f19630i = c.y0(typedArrayObtainStyledAttributes, index, this.f19630i);
                            break;
                        case 25:
                            this.f19632j = c.y0(typedArrayObtainStyledAttributes, index, this.f19632j);
                            break;
                        case 26:
                            this.F = typedArrayObtainStyledAttributes.getInt(index, this.F);
                            break;
                        case 27:
                            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 28:
                            this.f19634k = c.y0(typedArrayObtainStyledAttributes, index, this.f19634k);
                            break;
                        case 29:
                            this.f19636l = c.y0(typedArrayObtainStyledAttributes, index, this.f19636l);
                            break;
                        case 30:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 31:
                            this.f19649t = c.y0(typedArrayObtainStyledAttributes, index, this.f19649t);
                            break;
                        case 32:
                            this.f19650u = c.y0(typedArrayObtainStyledAttributes, index, this.f19650u);
                            break;
                        case 33:
                            this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 34:
                            this.f19640n = c.y0(typedArrayObtainStyledAttributes, index, this.f19640n);
                            break;
                        case 35:
                            this.f19638m = c.y0(typedArrayObtainStyledAttributes, index, this.f19638m);
                            break;
                        case 36:
                            this.f19654y = typedArrayObtainStyledAttributes.getFloat(index, this.f19654y);
                            break;
                        case 37:
                            this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                            break;
                        case 38:
                            this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                            break;
                        case 39:
                            this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                            break;
                        case 40:
                            this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                            break;
                        case 41:
                            c.A0(this, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 42:
                            c.A0(this, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 55:
                                    this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                    break;
                                case 56:
                                    this.f19615a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f19615a0);
                                    break;
                                case 57:
                                    this.f19617b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f19617b0);
                                    break;
                                case 58:
                                    this.f19619c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f19619c0);
                                    break;
                                case 59:
                                    this.f19621d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f19621d0);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.A = c.y0(typedArrayObtainStyledAttributes, index, this.A);
                                            break;
                                        case 62:
                                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                            break;
                                        case 63:
                                            this.C = typedArrayObtainStyledAttributes.getFloat(index, this.C);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f19623e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f19625f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e(c.f19496h, "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f19627g0 = typedArrayObtainStyledAttributes.getInt(index, this.f19627g0);
                                                    break;
                                                case 73:
                                                    this.f19629h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f19629h0);
                                                    break;
                                                case 74:
                                                    this.f19635k0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f19643o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f19643o0);
                                                    break;
                                                case 76:
                                                    Log.w(c.f19496h, "unused attribute 0x" + Integer.toHexString(index) + "   " + f19604s0.get(index));
                                                    break;
                                                case 77:
                                                    this.f19637l0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 91:
                                                            this.f19647r = c.y0(typedArrayObtainStyledAttributes, index, this.f19647r);
                                                            break;
                                                        case 92:
                                                            this.f19648s = c.y0(typedArrayObtainStyledAttributes, index, this.f19648s);
                                                            break;
                                                        case 93:
                                                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                                            break;
                                                        case 94:
                                                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                                            break;
                                                        default:
                                                            Log.w(c.f19496h, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f19604s0.get(index));
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f19645p0 = typedArrayObtainStyledAttributes.getInt(index, this.f19645p0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class C0117c {
        private static final int A = 9;
        private static final int B = 10;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f19656o = -2;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f19657p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f19658q = -3;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static SparseIntArray f19659r = null;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final int f19660s = 1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f19661t = 2;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final int f19662u = 3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final int f19663v = 4;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final int f19664w = 5;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final int f19665x = 6;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int f19666y = 7;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int f19667z = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19668a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19669b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19670c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f19671d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19672e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19673f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f19674g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19675h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f19676i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f19677j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f19678k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f19679l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f19680m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19681n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f19659r = sparseIntArray;
            sparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
            f19659r.append(R.styleable.Motion_pathMotionArc, 2);
            f19659r.append(R.styleable.Motion_transitionEasing, 3);
            f19659r.append(R.styleable.Motion_drawPath, 4);
            f19659r.append(R.styleable.Motion_animateRelativeTo, 5);
            f19659r.append(R.styleable.Motion_animateCircleAngleTo, 6);
            f19659r.append(R.styleable.Motion_motionStagger, 7);
            f19659r.append(R.styleable.Motion_quantizeMotionSteps, 8);
            f19659r.append(R.styleable.Motion_quantizeMotionPhase, 9);
            f19659r.append(R.styleable.Motion_quantizeMotionInterpolator, 10);
        }

        public void a(C0117c c0117c) {
            this.f19668a = c0117c.f19668a;
            this.f19669b = c0117c.f19669b;
            this.f19671d = c0117c.f19671d;
            this.f19672e = c0117c.f19672e;
            this.f19673f = c0117c.f19673f;
            this.f19676i = c0117c.f19676i;
            this.f19674g = c0117c.f19674g;
            this.f19675h = c0117c.f19675h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.W);
            this.f19668a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f19659r.get(index)) {
                    case 1:
                        this.f19676i = typedArrayObtainStyledAttributes.getFloat(index, this.f19676i);
                        break;
                    case 2:
                        this.f19672e = typedArrayObtainStyledAttributes.getInt(index, this.f19672e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f19671d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f19671d = androidx.constraintlayout.core.motion.utils.d.f17653o[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f19673f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f19669b = c.y0(typedArrayObtainStyledAttributes, index, this.f19669b);
                        break;
                    case 6:
                        this.f19670c = typedArrayObtainStyledAttributes.getInteger(index, this.f19670c);
                        break;
                    case 7:
                        this.f19674g = typedArrayObtainStyledAttributes.getFloat(index, this.f19674g);
                        break;
                    case 8:
                        this.f19678k = typedArrayObtainStyledAttributes.getInteger(index, this.f19678k);
                        break;
                    case 9:
                        this.f19677j = typedArrayObtainStyledAttributes.getFloat(index, this.f19677j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f19681n = resourceId;
                            if (resourceId != -1) {
                                this.f19680m = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f19679l = string;
                            if (string.indexOf("/") > 0) {
                                this.f19681n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f19680m = -2;
                            } else {
                                this.f19680m = -1;
                            }
                        } else {
                            this.f19680m = typedArrayObtainStyledAttributes.getInteger(index, this.f19681n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19682a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19683b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19684c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f19685d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f19686e = Float.NaN;

        public void a(d dVar) {
            this.f19682a = dVar.f19682a;
            this.f19683b = dVar.f19683b;
            this.f19685d = dVar.f19685d;
            this.f19686e = dVar.f19686e;
            this.f19684c = dVar.f19684c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19404h0);
            this.f19682a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.PropertySet_android_alpha) {
                    this.f19685d = typedArrayObtainStyledAttributes.getFloat(index, this.f19685d);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    this.f19683b = typedArrayObtainStyledAttributes.getInt(index, this.f19683b);
                    this.f19683b = c.U[this.f19683b];
                } else if (index == R.styleable.PropertySet_visibilityMode) {
                    this.f19684c = typedArrayObtainStyledAttributes.getInt(index, this.f19684c);
                } else if (index == R.styleable.PropertySet_motionProgress) {
                    this.f19686e = typedArrayObtainStyledAttributes.getFloat(index, this.f19686e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class e {
        private static final int A = 12;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static SparseIntArray f19687o = null;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f19688p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f19689q = 2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final int f19690r = 3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final int f19691s = 4;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f19692t = 5;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final int f19693u = 6;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final int f19694v = 7;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final int f19695w = 8;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final int f19696x = 9;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int f19697y = 10;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int f19698z = 11;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19699a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f19700b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f19701c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f19702d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f19703e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f19704f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f19705g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f19706h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f19707i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f19708j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f19709k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f19710l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f19711m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f19712n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f19687o = sparseIntArray;
            sparseIntArray.append(R.styleable.Transform_android_rotation, 1);
            f19687o.append(R.styleable.Transform_android_rotationX, 2);
            f19687o.append(R.styleable.Transform_android_rotationY, 3);
            f19687o.append(R.styleable.Transform_android_scaleX, 4);
            f19687o.append(R.styleable.Transform_android_scaleY, 5);
            f19687o.append(R.styleable.Transform_android_transformPivotX, 6);
            f19687o.append(R.styleable.Transform_android_transformPivotY, 7);
            f19687o.append(R.styleable.Transform_android_translationX, 8);
            f19687o.append(R.styleable.Transform_android_translationY, 9);
            f19687o.append(R.styleable.Transform_android_translationZ, 10);
            f19687o.append(R.styleable.Transform_android_elevation, 11);
            f19687o.append(R.styleable.Transform_transformPivotTarget, 12);
        }

        public void a(e eVar) {
            this.f19699a = eVar.f19699a;
            this.f19700b = eVar.f19700b;
            this.f19701c = eVar.f19701c;
            this.f19702d = eVar.f19702d;
            this.f19703e = eVar.f19703e;
            this.f19704f = eVar.f19704f;
            this.f19705g = eVar.f19705g;
            this.f19706h = eVar.f19706h;
            this.f19707i = eVar.f19707i;
            this.f19708j = eVar.f19708j;
            this.f19709k = eVar.f19709k;
            this.f19710l = eVar.f19710l;
            this.f19711m = eVar.f19711m;
            this.f19712n = eVar.f19712n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19428t0);
            this.f19699a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f19687o.get(index)) {
                    case 1:
                        this.f19700b = typedArrayObtainStyledAttributes.getFloat(index, this.f19700b);
                        break;
                    case 2:
                        this.f19701c = typedArrayObtainStyledAttributes.getFloat(index, this.f19701c);
                        break;
                    case 3:
                        this.f19702d = typedArrayObtainStyledAttributes.getFloat(index, this.f19702d);
                        break;
                    case 4:
                        this.f19703e = typedArrayObtainStyledAttributes.getFloat(index, this.f19703e);
                        break;
                    case 5:
                        this.f19704f = typedArrayObtainStyledAttributes.getFloat(index, this.f19704f);
                        break;
                    case 6:
                        this.f19705g = typedArrayObtainStyledAttributes.getDimension(index, this.f19705g);
                        break;
                    case 7:
                        this.f19706h = typedArrayObtainStyledAttributes.getDimension(index, this.f19706h);
                        break;
                    case 8:
                        this.f19708j = typedArrayObtainStyledAttributes.getDimension(index, this.f19708j);
                        break;
                    case 9:
                        this.f19709k = typedArrayObtainStyledAttributes.getDimension(index, this.f19709k);
                        break;
                    case 10:
                        this.f19710l = typedArrayObtainStyledAttributes.getDimension(index, this.f19710l);
                        break;
                    case 11:
                        this.f19711m = true;
                        this.f19712n = typedArrayObtainStyledAttributes.getDimension(index, this.f19712n);
                        break;
                    case 12:
                        this.f19707i = c.y0(typedArrayObtainStyledAttributes, index, this.f19707i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: ConstraintSet.java */
    public class f {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f19713o = "       ";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Writer f19714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ConstraintLayout f19715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Context f19716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f19717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19718e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f19719f = "'left'";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final String f19720g = "'right'";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final String f19721h = "'baseline'";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final String f19722i = "'bottom'";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final String f19723j = "'top'";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final String f19724k = "'start'";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final String f19725l = "'end'";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        HashMap<Integer, String> f19726m = new HashMap<>();

        f(Writer writer, ConstraintLayout constraintLayout, int i10) throws IOException {
            this.f19714a = writer;
            this.f19715b = constraintLayout;
            this.f19716c = constraintLayout.getContext();
            this.f19717d = i10;
        }

        private void e(String str, int i10, int i11, float f10, int i12, int i13, boolean z10) throws IOException {
            if (i10 != 0) {
                if (i10 == -2) {
                    this.f19714a.write(f19713o + str + ": 'wrap'\n");
                    return;
                }
                if (i10 == -1) {
                    this.f19714a.write(f19713o + str + ": 'parent'\n");
                    return;
                }
                this.f19714a.write(f19713o + str + ": " + i10 + ",\n");
                return;
            }
            if (i13 == -1 && i12 == -1) {
                if (i11 == 1) {
                    this.f19714a.write(f19713o + str + ": '???????????',\n");
                    return;
                }
                if (i11 != 2) {
                    return;
                }
                this.f19714a.write(f19713o + str + ": '" + f10 + "%',\n");
                return;
            }
            if (i11 == 0) {
                this.f19714a.write(f19713o + str + ": {'spread' ," + i12 + ", " + i13 + "}\n");
                return;
            }
            if (i11 == 1) {
                this.f19714a.write(f19713o + str + ": {'wrap' ," + i12 + ", " + i13 + "}\n");
                return;
            }
            if (i11 != 2) {
                return;
            }
            this.f19714a.write(f19713o + str + ": {'" + f10 + "'% ," + i12 + ", " + i13 + "}\n");
        }

        private void f(int i10, int i11, int i12, float f10) {
        }

        String a(int i10) {
            if (this.f19726m.containsKey(Integer.valueOf(i10))) {
                return "'" + this.f19726m.get(Integer.valueOf(i10)) + "'";
            }
            if (i10 == 0) {
                return "'parent'";
            }
            String strB = b(i10);
            this.f19726m.put(Integer.valueOf(i10), strB);
            return "'" + strB + "'";
        }

        String b(int i10) {
            try {
                if (i10 != -1) {
                    return this.f19716c.getResources().getResourceEntryName(i10);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i11 = this.f19718e + 1;
                this.f19718e = i11;
                sb2.append(i11);
                return sb2.toString();
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unknown");
                int i12 = this.f19718e + 1;
                this.f19718e = i12;
                sb3.append(i12);
                return sb3.toString();
            }
        }

        void c(int i10, float f10, int i11) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f19714a.write("       circle");
            this.f19714a.write(":[");
            this.f19714a.write(a(i10));
            this.f19714a.write(", " + f10);
            this.f19714a.write(i11 + "]");
        }

        void d(String str, int i10, String str2, int i11, int i12) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f19714a.write(f19713o + str);
            this.f19714a.write(":[");
            this.f19714a.write(a(i10));
            this.f19714a.write(" , ");
            this.f19714a.write(str2);
            if (i11 != 0) {
                this.f19714a.write(" , " + i11);
            }
            this.f19714a.write("],\n");
        }

        void g() throws IOException {
            this.f19714a.write("\n'ConstraintSet':{\n");
            for (Integer num : c.this.f19559g.keySet()) {
                a aVar = (a) c.this.f19559g.get(num);
                String strA = a(num.intValue());
                this.f19714a.write(strA + ":{\n");
                b bVar = aVar.f19564e;
                e("height", bVar.f19622e, bVar.Z, bVar.f19625f0, bVar.f19621d0, bVar.f19617b0, bVar.f19641n0);
                e("width", bVar.f19620d, bVar.Y, bVar.f19623e0, bVar.f19619c0, bVar.f19615a0, bVar.f19639m0);
                d("'left'", bVar.f19630i, "'left'", bVar.G, bVar.N);
                d("'left'", bVar.f19632j, "'right'", bVar.G, bVar.N);
                d("'right'", bVar.f19634k, "'left'", bVar.H, bVar.P);
                d("'right'", bVar.f19636l, "'right'", bVar.H, bVar.P);
                d("'baseline'", bVar.f19646q, "'baseline'", -1, bVar.T);
                d("'baseline'", bVar.f19647r, "'top'", -1, bVar.T);
                d("'baseline'", bVar.f19648s, "'bottom'", -1, bVar.T);
                d("'top'", bVar.f19640n, "'bottom'", bVar.I, bVar.O);
                d("'top'", bVar.f19638m, "'top'", bVar.I, bVar.O);
                d("'bottom'", bVar.f19644p, "'bottom'", bVar.J, bVar.Q);
                d("'bottom'", bVar.f19642o, "'top'", bVar.J, bVar.Q);
                d("'start'", bVar.f19650u, "'start'", bVar.L, bVar.S);
                d("'start'", bVar.f19649t, "'end'", bVar.L, bVar.S);
                d("'end'", bVar.f19651v, "'start'", bVar.K, bVar.R);
                d("'end'", bVar.f19652w, "'end'", bVar.K, bVar.R);
                i("'horizontalBias'", bVar.f19653x, 0.5f);
                i("'verticalBias'", bVar.f19654y, 0.5f);
                c(bVar.A, bVar.C, bVar.B);
                f(bVar.F, bVar.f19624f, bVar.f19626g, bVar.f19628h);
                k("'dimensionRatio'", bVar.f19655z);
                j("'barrierMargin'", bVar.f19629h0);
                j("'type'", bVar.f19631i0);
                k("'ReferenceId'", bVar.f19635k0);
                m("'mBarrierAllowsGoneWidgets'", bVar.f19643o0, true);
                j("'WrapBehavior'", bVar.f19645p0);
                h("'verticalWeight'", bVar.U);
                h("'horizontalWeight'", bVar.V);
                j("'horizontalChainStyle'", bVar.W);
                j("'verticalChainStyle'", bVar.X);
                j("'barrierDirection'", bVar.f19627g0);
                int[] iArr = bVar.f19633j0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f19714a.write("}\n");
            }
            this.f19714a.write("}\n");
        }

        void h(String str, float f10) throws IOException {
            if (f10 == -1.0f) {
                return;
            }
            this.f19714a.write(f19713o + str);
            this.f19714a.write(": " + f10);
            this.f19714a.write(",\n");
        }

        void i(String str, float f10, float f11) throws IOException {
            if (f10 == f11) {
                return;
            }
            this.f19714a.write(f19713o + str);
            this.f19714a.write(": " + f10);
            this.f19714a.write(",\n");
        }

        void j(String str, int i10) throws IOException {
            if (i10 == 0 || i10 == -1) {
                return;
            }
            this.f19714a.write(f19713o + str);
            this.f19714a.write(":");
            this.f19714a.write(", " + i10);
            this.f19714a.write("\n");
        }

        void k(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.f19714a.write(f19713o + str);
            this.f19714a.write(":");
            this.f19714a.write(", " + str2);
            this.f19714a.write("\n");
        }

        void l(String str, boolean z10) throws IOException {
            if (z10) {
                this.f19714a.write(f19713o + str);
                this.f19714a.write(": " + z10);
                this.f19714a.write(",\n");
            }
        }

        void m(String str, boolean z10, boolean z11) throws IOException {
            if (z10 == z11) {
                return;
            }
            this.f19714a.write(f19713o + str);
            this.f19714a.write(": " + z10);
            this.f19714a.write(",\n");
        }

        void n(String str, int[] iArr) throws IOException {
            if (iArr == null) {
                return;
            }
            this.f19714a.write(f19713o + str);
            this.f19714a.write(": ");
            int i10 = 0;
            while (i10 < iArr.length) {
                Writer writer = this.f19714a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? Constants.ARRAY_TYPE : ", ");
                sb2.append(a(iArr[i10]));
                writer.write(sb2.toString());
                i10++;
            }
            this.f19714a.write("],\n");
        }
    }

    /* JADX INFO: compiled from: ConstraintSet.java */
    public class g {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f19728o = "\n       ";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Writer f19729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ConstraintLayout f19730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Context f19731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f19732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19733e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f19734f = "'left'";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final String f19735g = "'right'";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final String f19736h = "'baseline'";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final String f19737i = "'bottom'";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final String f19738j = "'top'";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final String f19739k = "'start'";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final String f19740l = "'end'";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        HashMap<Integer, String> f19741m = new HashMap<>();

        g(Writer writer, ConstraintLayout constraintLayout, int i10) throws IOException {
            this.f19729a = writer;
            this.f19730b = constraintLayout;
            this.f19731c = constraintLayout.getContext();
            this.f19732d = i10;
        }

        private void c(String str, int i10, int i11) throws IOException {
            if (i10 != i11) {
                if (i10 == -2) {
                    this.f19729a.write(f19728o + str + "=\"wrap_content\"");
                    return;
                }
                if (i10 == -1) {
                    this.f19729a.write(f19728o + str + "=\"match_parent\"");
                    return;
                }
                this.f19729a.write(f19728o + str + "=\"" + i10 + "dp\"");
            }
        }

        private void d(String str, boolean z10, boolean z11) throws IOException {
            if (z10 != z11) {
                this.f19729a.write(f19728o + str + "=\"" + z10 + "dp\"");
            }
        }

        private void g(String str, int i10, int i11) throws IOException {
            if (i10 != i11) {
                this.f19729a.write(f19728o + str + "=\"" + i10 + "dp\"");
            }
        }

        private void h(String str, int i10, String[] strArr, int i11) throws IOException {
            if (i10 != i11) {
                this.f19729a.write(f19728o + str + "=\"" + strArr[i10] + "\"");
            }
        }

        String a(int i10) {
            if (this.f19741m.containsKey(Integer.valueOf(i10))) {
                return "@+id/" + this.f19741m.get(Integer.valueOf(i10)) + "";
            }
            if (i10 == 0) {
                return c.U1;
            }
            String strB = b(i10);
            this.f19741m.put(Integer.valueOf(i10), strB);
            return "@+id/" + strB + "";
        }

        String b(int i10) {
            try {
                if (i10 != -1) {
                    return this.f19731c.getResources().getResourceEntryName(i10);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i11 = this.f19733e + 1;
                this.f19733e = i11;
                sb2.append(i11);
                return sb2.toString();
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unknown");
                int i12 = this.f19733e + 1;
                this.f19733e = i12;
                sb3.append(i12);
                return sb3.toString();
            }
        }

        void e(int i10, float f10, int i11) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f19729a.write(com.google.android.exoplayer2.text.ttml.d.f49820z0);
            this.f19729a.write(":[");
            this.f19729a.write(a(i10));
            this.f19729a.write(", " + f10);
            this.f19729a.write(i11 + "]");
        }

        void f(String str, int i10, String str2, int i11, int i12) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f19729a.write(f19728o + str);
            this.f19729a.write(":[");
            this.f19729a.write(a(i10));
            this.f19729a.write(" , ");
            this.f19729a.write(str2);
            if (i11 != 0) {
                this.f19729a.write(" , " + i11);
            }
            this.f19729a.write("],\n");
        }

        void i() throws IOException {
            this.f19729a.write("\n<ConstraintSet>\n");
            for (Integer num : c.this.f19559g.keySet()) {
                a aVar = (a) c.this.f19559g.get(num);
                String strA = a(num.intValue());
                this.f19729a.write("  <Constraint");
                this.f19729a.write("\n       android:id=\"" + strA + "\"");
                b bVar = aVar.f19564e;
                c("android:layout_width", bVar.f19620d, -5);
                c("android:layout_height", bVar.f19622e, -5);
                j("app:layout_constraintGuide_begin", (float) bVar.f19624f, -1.0f);
                j("app:layout_constraintGuide_end", bVar.f19626g, -1.0f);
                j("app:layout_constraintGuide_percent", bVar.f19628h, -1.0f);
                j("app:layout_constraintHorizontal_bias", bVar.f19653x, 0.5f);
                j("app:layout_constraintVertical_bias", bVar.f19654y, 0.5f);
                m("app:layout_constraintDimensionRatio", bVar.f19655z, null);
                o("app:layout_constraintCircle", bVar.A);
                j("app:layout_constraintCircleRadius", bVar.B, 0.0f);
                j("app:layout_constraintCircleAngle", bVar.C, 0.0f);
                j("android:orientation", bVar.F, -1.0f);
                j("app:layout_constraintVertical_weight", bVar.U, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.V, -1.0f);
                j("app:layout_constraintHorizontal_chainStyle", bVar.W, 0.0f);
                j("app:layout_constraintVertical_chainStyle", bVar.X, 0.0f);
                j("app:barrierDirection", bVar.f19627g0, -1.0f);
                j("app:barrierMargin", bVar.f19629h0, 0.0f);
                g("app:layout_marginLeft", bVar.G, 0);
                g("app:layout_goneMarginLeft", bVar.N, Integer.MIN_VALUE);
                g("app:layout_marginRight", bVar.H, 0);
                g("app:layout_goneMarginRight", bVar.P, Integer.MIN_VALUE);
                g("app:layout_marginStart", bVar.L, 0);
                g("app:layout_goneMarginStart", bVar.S, Integer.MIN_VALUE);
                g("app:layout_marginEnd", bVar.K, 0);
                g("app:layout_goneMarginEnd", bVar.R, Integer.MIN_VALUE);
                g("app:layout_marginTop", bVar.I, 0);
                g("app:layout_goneMarginTop", bVar.O, Integer.MIN_VALUE);
                g("app:layout_marginBottom", bVar.J, 0);
                g("app:layout_goneMarginBottom", bVar.Q, Integer.MIN_VALUE);
                g("app:goneBaselineMargin", bVar.T, Integer.MIN_VALUE);
                g("app:baselineMargin", bVar.M, 0);
                d("app:layout_constrainedWidth", bVar.f19639m0, false);
                d("app:layout_constrainedHeight", bVar.f19641n0, false);
                d("app:barrierAllowsGoneWidgets", bVar.f19643o0, true);
                j("app:layout_wrapBehaviorInParent", bVar.f19645p0, 0.0f);
                o("app:baselineToBaseline", bVar.f19646q);
                o("app:baselineToBottom", bVar.f19648s);
                o("app:baselineToTop", bVar.f19647r);
                o("app:layout_constraintBottom_toBottomOf", bVar.f19644p);
                o("app:layout_constraintBottom_toTopOf", bVar.f19642o);
                o("app:layout_constraintEnd_toEndOf", bVar.f19652w);
                o("app:layout_constraintEnd_toStartOf", bVar.f19651v);
                o("app:layout_constraintLeft_toLeftOf", bVar.f19630i);
                o("app:layout_constraintLeft_toRightOf", bVar.f19632j);
                o("app:layout_constraintRight_toLeftOf", bVar.f19634k);
                o("app:layout_constraintRight_toRightOf", bVar.f19636l);
                o("app:layout_constraintStart_toEndOf", bVar.f19649t);
                o("app:layout_constraintStart_toStartOf", bVar.f19650u);
                o("app:layout_constraintTop_toBottomOf", bVar.f19640n);
                o("app:layout_constraintTop_toTopOf", bVar.f19638m);
                String[] strArr = {"spread", "wrap", "percent"};
                h("app:layout_constraintHeight_default", bVar.Z, strArr, 0);
                j("app:layout_constraintHeight_percent", bVar.f19625f0, 1.0f);
                g("app:layout_constraintHeight_min", bVar.f19621d0, 0);
                g("app:layout_constraintHeight_max", bVar.f19617b0, 0);
                d("android:layout_constrainedHeight", bVar.f19641n0, false);
                h("app:layout_constraintWidth_default", bVar.Y, strArr, 0);
                j("app:layout_constraintWidth_percent", bVar.f19623e0, 1.0f);
                g("app:layout_constraintWidth_min", bVar.f19619c0, 0);
                g("app:layout_constraintWidth_max", bVar.f19615a0, 0);
                d("android:layout_constrainedWidth", bVar.f19639m0, false);
                j("app:layout_constraintVertical_weight", bVar.U, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.V, -1.0f);
                k("app:layout_constraintHorizontal_chainStyle", bVar.W);
                k("app:layout_constraintVertical_chainStyle", bVar.X);
                h("app:barrierDirection", bVar.f19627g0, new String[]{com.google.android.exoplayer2.text.ttml.d.f49793l0, com.google.android.exoplayer2.text.ttml.d.f49796n0, "top", "bottom", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0}, -1);
                m("app:layout_constraintTag", bVar.f19637l0, null);
                int[] iArr = bVar.f19633j0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f19729a.write(" />\n");
            }
            this.f19729a.write("</ConstraintSet>\n");
        }

        void j(String str, float f10, float f11) throws IOException {
            if (f10 == f11) {
                return;
            }
            this.f19729a.write(f19728o + str);
            this.f19729a.write("=\"" + f10 + "\"");
        }

        void k(String str, int i10) throws IOException {
            if (i10 == 0 || i10 == -1) {
                return;
            }
            this.f19729a.write(f19728o + str + "=\"" + i10 + "\"\n");
        }

        void l(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.f19729a.write(str);
            this.f19729a.write(":");
            this.f19729a.write(", " + str2);
            this.f19729a.write("\n");
        }

        void m(String str, String str2, String str3) throws IOException {
            if (str2 == null || str2.equals(str3)) {
                return;
            }
            this.f19729a.write(f19728o + str);
            this.f19729a.write("=\"" + str2 + "\"");
        }

        void n(String str, int[] iArr) throws IOException {
            if (iArr == null) {
                return;
            }
            this.f19729a.write(f19728o + str);
            this.f19729a.write(":");
            int i10 = 0;
            while (i10 < iArr.length) {
                Writer writer = this.f19729a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? Constants.ARRAY_TYPE : ", ");
                sb2.append(a(iArr[i10]));
                writer.write(sb2.toString());
                i10++;
            }
            this.f19729a.write("],\n");
        }

        void o(String str, int i10) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f19729a.write(f19728o + str);
            this.f19729a.write("=\"" + a(i10) + "\"");
        }
    }

    static {
        W.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        W.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        W.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        W.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        W.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        W.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        W.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        W.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        W.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        W.append(R.styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        W.append(R.styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        W.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        W.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        W.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        W.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        W.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        W.append(R.styleable.Constraint_android_orientation, 27);
        W.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        W.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        W.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        W.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        W.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        W.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        W.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        W.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        W.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        W.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        W.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        W.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        W.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        W.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        W.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        W.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        W.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        W.append(R.styleable.Constraint_layout_constraintLeft_creator, 87);
        W.append(R.styleable.Constraint_layout_constraintTop_creator, 87);
        W.append(R.styleable.Constraint_layout_constraintRight_creator, 87);
        W.append(R.styleable.Constraint_layout_constraintBottom_creator, 87);
        W.append(R.styleable.Constraint_layout_constraintBaseline_creator, 87);
        W.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        W.append(R.styleable.Constraint_android_layout_marginRight, 28);
        W.append(R.styleable.Constraint_android_layout_marginStart, 31);
        W.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        W.append(R.styleable.Constraint_android_layout_marginTop, 34);
        W.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        W.append(R.styleable.Constraint_android_layout_width, 23);
        W.append(R.styleable.Constraint_android_layout_height, 21);
        W.append(R.styleable.Constraint_layout_constraintWidth, 95);
        W.append(R.styleable.Constraint_layout_constraintHeight, 96);
        W.append(R.styleable.Constraint_android_visibility, 22);
        W.append(R.styleable.Constraint_android_alpha, 43);
        W.append(R.styleable.Constraint_android_elevation, 44);
        W.append(R.styleable.Constraint_android_rotationX, 45);
        W.append(R.styleable.Constraint_android_rotationY, 46);
        W.append(R.styleable.Constraint_android_rotation, 60);
        W.append(R.styleable.Constraint_android_scaleX, 47);
        W.append(R.styleable.Constraint_android_scaleY, 48);
        W.append(R.styleable.Constraint_android_transformPivotX, 49);
        W.append(R.styleable.Constraint_android_transformPivotY, 50);
        W.append(R.styleable.Constraint_android_translationX, 51);
        W.append(R.styleable.Constraint_android_translationY, 52);
        W.append(R.styleable.Constraint_android_translationZ, 53);
        W.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        W.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        W.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
        W.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
        W.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
        W.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
        W.append(R.styleable.Constraint_layout_constraintCircle, 61);
        W.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
        W.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        W.append(R.styleable.Constraint_animateRelativeTo, 64);
        W.append(R.styleable.Constraint_transitionEasing, 65);
        W.append(R.styleable.Constraint_drawPath, 66);
        W.append(R.styleable.Constraint_transitionPathRotate, 67);
        W.append(R.styleable.Constraint_motionStagger, 79);
        W.append(R.styleable.Constraint_android_id, 38);
        W.append(R.styleable.Constraint_motionProgress, 68);
        W.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
        W.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
        W.append(R.styleable.Constraint_layout_wrapBehaviorInParent, 97);
        W.append(R.styleable.Constraint_chainUseRtl, 71);
        W.append(R.styleable.Constraint_barrierDirection, 72);
        W.append(R.styleable.Constraint_barrierMargin, 73);
        W.append(R.styleable.Constraint_constraint_referenced_ids, 74);
        W.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        W.append(R.styleable.Constraint_pathMotionArc, 76);
        W.append(R.styleable.Constraint_layout_constraintTag, 77);
        W.append(R.styleable.Constraint_visibilityMode, 78);
        W.append(R.styleable.Constraint_layout_constrainedWidth, 80);
        W.append(R.styleable.Constraint_layout_constrainedHeight, 81);
        W.append(R.styleable.Constraint_polarRelativeTo, 82);
        W.append(R.styleable.Constraint_transformPivotTarget, 83);
        W.append(R.styleable.Constraint_quantizeMotionSteps, 84);
        W.append(R.styleable.Constraint_quantizeMotionPhase, 85);
        W.append(R.styleable.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = X;
        int i10 = R.styleable.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i10, 6);
        X.append(i10, 7);
        X.append(R.styleable.ConstraintOverride_android_orientation, 27);
        X.append(R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        X.append(R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
        X.append(R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
        X.append(R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        X.append(R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
        X.append(R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        X.append(R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        X.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        X.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        X.append(R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        X.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        X.append(R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        X.append(R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        X.append(R.styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        X.append(R.styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        X.append(R.styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        X.append(R.styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        X.append(R.styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        X.append(R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
        X.append(R.styleable.ConstraintOverride_android_layout_marginRight, 28);
        X.append(R.styleable.ConstraintOverride_android_layout_marginStart, 31);
        X.append(R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
        X.append(R.styleable.ConstraintOverride_android_layout_marginTop, 34);
        X.append(R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
        X.append(R.styleable.ConstraintOverride_android_layout_width, 23);
        X.append(R.styleable.ConstraintOverride_android_layout_height, 21);
        X.append(R.styleable.ConstraintOverride_layout_constraintWidth, 95);
        X.append(R.styleable.ConstraintOverride_layout_constraintHeight, 96);
        X.append(R.styleable.ConstraintOverride_android_visibility, 22);
        X.append(R.styleable.ConstraintOverride_android_alpha, 43);
        X.append(R.styleable.ConstraintOverride_android_elevation, 44);
        X.append(R.styleable.ConstraintOverride_android_rotationX, 45);
        X.append(R.styleable.ConstraintOverride_android_rotationY, 46);
        X.append(R.styleable.ConstraintOverride_android_rotation, 60);
        X.append(R.styleable.ConstraintOverride_android_scaleX, 47);
        X.append(R.styleable.ConstraintOverride_android_scaleY, 48);
        X.append(R.styleable.ConstraintOverride_android_transformPivotX, 49);
        X.append(R.styleable.ConstraintOverride_android_transformPivotY, 50);
        X.append(R.styleable.ConstraintOverride_android_translationX, 51);
        X.append(R.styleable.ConstraintOverride_android_translationY, 52);
        X.append(R.styleable.ConstraintOverride_android_translationZ, 53);
        X.append(R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        X.append(R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        X.append(R.styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        X.append(R.styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        X.append(R.styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        X.append(R.styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        X.append(R.styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        X.append(R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        X.append(R.styleable.ConstraintOverride_animateRelativeTo, 64);
        X.append(R.styleable.ConstraintOverride_transitionEasing, 65);
        X.append(R.styleable.ConstraintOverride_drawPath, 66);
        X.append(R.styleable.ConstraintOverride_transitionPathRotate, 67);
        X.append(R.styleable.ConstraintOverride_motionStagger, 79);
        X.append(R.styleable.ConstraintOverride_android_id, 38);
        X.append(R.styleable.ConstraintOverride_motionTarget, 98);
        X.append(R.styleable.ConstraintOverride_motionProgress, 68);
        X.append(R.styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        X.append(R.styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        X.append(R.styleable.ConstraintOverride_chainUseRtl, 71);
        X.append(R.styleable.ConstraintOverride_barrierDirection, 72);
        X.append(R.styleable.ConstraintOverride_barrierMargin, 73);
        X.append(R.styleable.ConstraintOverride_constraint_referenced_ids, 74);
        X.append(R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        X.append(R.styleable.ConstraintOverride_pathMotionArc, 76);
        X.append(R.styleable.ConstraintOverride_layout_constraintTag, 77);
        X.append(R.styleable.ConstraintOverride_visibilityMode, 78);
        X.append(R.styleable.ConstraintOverride_layout_constrainedWidth, 80);
        X.append(R.styleable.ConstraintOverride_layout_constrainedHeight, 81);
        X.append(R.styleable.ConstraintOverride_polarRelativeTo, 82);
        X.append(R.styleable.ConstraintOverride_transformPivotTarget, 83);
        X.append(R.styleable.ConstraintOverride_quantizeMotionSteps, 84);
        X.append(R.styleable.ConstraintOverride_quantizeMotionPhase, 85);
        X.append(R.styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        X.append(R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    static void A0(Object obj, TypedArray typedArray, int i10, int i11) {
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        if (i12 == 3) {
            B0(obj, typedArray.getString(i10), i11);
            return;
        }
        int dimensionPixelSize = -2;
        boolean z10 = false;
        if (i12 != 5) {
            int i13 = typedArray.getInt(i10, 0);
            if (i13 != -4) {
                dimensionPixelSize = (i13 == -3 || !(i13 == -2 || i13 == -1)) ? 0 : i13;
            } else {
                z10 = true;
            }
        } else {
            dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
        }
        if (obj instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
            if (i11 == 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = dimensionPixelSize;
                layoutParams.Z = z10;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = dimensionPixelSize;
                layoutParams.f19287a0 = z10;
                return;
            }
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (i11 == 0) {
                bVar.f19620d = dimensionPixelSize;
                bVar.f19639m0 = z10;
                return;
            } else {
                bVar.f19622e = dimensionPixelSize;
                bVar.f19641n0 = z10;
                return;
            }
        }
        if (obj instanceof a.C0116a) {
            a.C0116a c0116a = (a.C0116a) obj;
            if (i11 == 0) {
                c0116a.b(23, dimensionPixelSize);
                c0116a.d(80, z10);
            } else {
                c0116a.b(21, dimensionPixelSize);
                c0116a.d(81, z10);
            }
        }
    }

    static void B0(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if (T1.equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                    }
                    C0(layoutParams, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f19655z = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0116a) {
                        ((a.C0116a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if (S1.equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                            layoutParams2.K = f10;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                            layoutParams2.L = f10;
                        }
                    } else if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (i10 == 0) {
                            bVar.f19620d = 0;
                            bVar.V = f10;
                        } else {
                            bVar.f19622e = 0;
                            bVar.U = f10;
                        }
                    } else if (obj instanceof a.C0116a) {
                        a.C0116a c0116a = (a.C0116a) obj;
                        if (i10 == 0) {
                            c0116a.b(23, 0);
                            c0116a.a(39, f10);
                        } else {
                            c0116a.b(21, 0);
                            c0116a.a(40, f10);
                        }
                    }
                } else {
                    if (!U1.equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.U = fMax;
                            layoutParams3.O = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.V = fMax;
                            layoutParams3.P = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar2 = (b) obj;
                        if (i10 == 0) {
                            bVar2.f19620d = 0;
                            bVar2.f19623e0 = fMax;
                            bVar2.Y = 2;
                        } else {
                            bVar2.f19622e = 0;
                            bVar2.f19625f0 = fMax;
                            bVar2.Z = 2;
                        }
                    } else if (obj instanceof a.C0116a) {
                        a.C0116a c0116a2 = (a.C0116a) obj;
                        if (i10 == 0) {
                            c0116a2.b(23, 0);
                            c0116a2.b(54, 2);
                        } else {
                            c0116a2.b(21, 0);
                            c0116a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void C0(ConstraintLayout.LayoutParams layoutParams, String str) {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase(androidx.exifinterface.media.a.T4)) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.H = str;
        layoutParams.I = fAbs;
        layoutParams.J = i10;
    }

    private String F1(int i10) {
        switch (i10) {
            case 1:
                return com.google.android.exoplayer2.text.ttml.d.f49793l0;
            case 2:
                return com.google.android.exoplayer2.text.ttml.d.f49796n0;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return com.google.android.exoplayer2.text.ttml.d.f49798o0;
            case 7:
                return com.google.android.exoplayer2.text.ttml.d.f49800p0;
            default:
                return "undefined";
        }
    }

    private void G0(Context context, a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            H0(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != R.styleable.Constraint_android_id && R.styleable.Constraint_android_layout_marginStart != index && R.styleable.Constraint_android_layout_marginEnd != index) {
                aVar.f19563d.f19668a = true;
                aVar.f19564e.f19616b = true;
                aVar.f19562c.f19682a = true;
                aVar.f19565f.f19699a = true;
            }
            switch (W.get(index)) {
                case 1:
                    b bVar = aVar.f19564e;
                    bVar.f19646q = y0(typedArray, index, bVar.f19646q);
                    break;
                case 2:
                    b bVar2 = aVar.f19564e;
                    bVar2.J = typedArray.getDimensionPixelSize(index, bVar2.J);
                    break;
                case 3:
                    b bVar3 = aVar.f19564e;
                    bVar3.f19644p = y0(typedArray, index, bVar3.f19644p);
                    break;
                case 4:
                    b bVar4 = aVar.f19564e;
                    bVar4.f19642o = y0(typedArray, index, bVar4.f19642o);
                    break;
                case 5:
                    aVar.f19564e.f19655z = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f19564e;
                    bVar5.D = typedArray.getDimensionPixelOffset(index, bVar5.D);
                    break;
                case 7:
                    b bVar6 = aVar.f19564e;
                    bVar6.E = typedArray.getDimensionPixelOffset(index, bVar6.E);
                    break;
                case 8:
                    b bVar7 = aVar.f19564e;
                    bVar7.K = typedArray.getDimensionPixelSize(index, bVar7.K);
                    break;
                case 9:
                    b bVar8 = aVar.f19564e;
                    bVar8.f19652w = y0(typedArray, index, bVar8.f19652w);
                    break;
                case 10:
                    b bVar9 = aVar.f19564e;
                    bVar9.f19651v = y0(typedArray, index, bVar9.f19651v);
                    break;
                case 11:
                    b bVar10 = aVar.f19564e;
                    bVar10.Q = typedArray.getDimensionPixelSize(index, bVar10.Q);
                    break;
                case 12:
                    b bVar11 = aVar.f19564e;
                    bVar11.R = typedArray.getDimensionPixelSize(index, bVar11.R);
                    break;
                case 13:
                    b bVar12 = aVar.f19564e;
                    bVar12.N = typedArray.getDimensionPixelSize(index, bVar12.N);
                    break;
                case 14:
                    b bVar13 = aVar.f19564e;
                    bVar13.P = typedArray.getDimensionPixelSize(index, bVar13.P);
                    break;
                case 15:
                    b bVar14 = aVar.f19564e;
                    bVar14.S = typedArray.getDimensionPixelSize(index, bVar14.S);
                    break;
                case 16:
                    b bVar15 = aVar.f19564e;
                    bVar15.O = typedArray.getDimensionPixelSize(index, bVar15.O);
                    break;
                case 17:
                    b bVar16 = aVar.f19564e;
                    bVar16.f19624f = typedArray.getDimensionPixelOffset(index, bVar16.f19624f);
                    break;
                case 18:
                    b bVar17 = aVar.f19564e;
                    bVar17.f19626g = typedArray.getDimensionPixelOffset(index, bVar17.f19626g);
                    break;
                case 19:
                    b bVar18 = aVar.f19564e;
                    bVar18.f19628h = typedArray.getFloat(index, bVar18.f19628h);
                    break;
                case 20:
                    b bVar19 = aVar.f19564e;
                    bVar19.f19653x = typedArray.getFloat(index, bVar19.f19653x);
                    break;
                case 21:
                    b bVar20 = aVar.f19564e;
                    bVar20.f19622e = typedArray.getLayoutDimension(index, bVar20.f19622e);
                    break;
                case 22:
                    d dVar = aVar.f19562c;
                    dVar.f19683b = typedArray.getInt(index, dVar.f19683b);
                    d dVar2 = aVar.f19562c;
                    dVar2.f19683b = U[dVar2.f19683b];
                    break;
                case 23:
                    b bVar21 = aVar.f19564e;
                    bVar21.f19620d = typedArray.getLayoutDimension(index, bVar21.f19620d);
                    break;
                case 24:
                    b bVar22 = aVar.f19564e;
                    bVar22.G = typedArray.getDimensionPixelSize(index, bVar22.G);
                    break;
                case 25:
                    b bVar23 = aVar.f19564e;
                    bVar23.f19630i = y0(typedArray, index, bVar23.f19630i);
                    break;
                case 26:
                    b bVar24 = aVar.f19564e;
                    bVar24.f19632j = y0(typedArray, index, bVar24.f19632j);
                    break;
                case 27:
                    b bVar25 = aVar.f19564e;
                    bVar25.F = typedArray.getInt(index, bVar25.F);
                    break;
                case 28:
                    b bVar26 = aVar.f19564e;
                    bVar26.H = typedArray.getDimensionPixelSize(index, bVar26.H);
                    break;
                case 29:
                    b bVar27 = aVar.f19564e;
                    bVar27.f19634k = y0(typedArray, index, bVar27.f19634k);
                    break;
                case 30:
                    b bVar28 = aVar.f19564e;
                    bVar28.f19636l = y0(typedArray, index, bVar28.f19636l);
                    break;
                case 31:
                    b bVar29 = aVar.f19564e;
                    bVar29.L = typedArray.getDimensionPixelSize(index, bVar29.L);
                    break;
                case 32:
                    b bVar30 = aVar.f19564e;
                    bVar30.f19649t = y0(typedArray, index, bVar30.f19649t);
                    break;
                case 33:
                    b bVar31 = aVar.f19564e;
                    bVar31.f19650u = y0(typedArray, index, bVar31.f19650u);
                    break;
                case 34:
                    b bVar32 = aVar.f19564e;
                    bVar32.I = typedArray.getDimensionPixelSize(index, bVar32.I);
                    break;
                case 35:
                    b bVar33 = aVar.f19564e;
                    bVar33.f19640n = y0(typedArray, index, bVar33.f19640n);
                    break;
                case 36:
                    b bVar34 = aVar.f19564e;
                    bVar34.f19638m = y0(typedArray, index, bVar34.f19638m);
                    break;
                case 37:
                    b bVar35 = aVar.f19564e;
                    bVar35.f19654y = typedArray.getFloat(index, bVar35.f19654y);
                    break;
                case 38:
                    aVar.f19560a = typedArray.getResourceId(index, aVar.f19560a);
                    break;
                case 39:
                    b bVar36 = aVar.f19564e;
                    bVar36.V = typedArray.getFloat(index, bVar36.V);
                    break;
                case 40:
                    b bVar37 = aVar.f19564e;
                    bVar37.U = typedArray.getFloat(index, bVar37.U);
                    break;
                case 41:
                    b bVar38 = aVar.f19564e;
                    bVar38.W = typedArray.getInt(index, bVar38.W);
                    break;
                case 42:
                    b bVar39 = aVar.f19564e;
                    bVar39.X = typedArray.getInt(index, bVar39.X);
                    break;
                case 43:
                    d dVar3 = aVar.f19562c;
                    dVar3.f19685d = typedArray.getFloat(index, dVar3.f19685d);
                    break;
                case 44:
                    e eVar = aVar.f19565f;
                    eVar.f19711m = true;
                    eVar.f19712n = typedArray.getDimension(index, eVar.f19712n);
                    break;
                case 45:
                    e eVar2 = aVar.f19565f;
                    eVar2.f19701c = typedArray.getFloat(index, eVar2.f19701c);
                    break;
                case 46:
                    e eVar3 = aVar.f19565f;
                    eVar3.f19702d = typedArray.getFloat(index, eVar3.f19702d);
                    break;
                case 47:
                    e eVar4 = aVar.f19565f;
                    eVar4.f19703e = typedArray.getFloat(index, eVar4.f19703e);
                    break;
                case 48:
                    e eVar5 = aVar.f19565f;
                    eVar5.f19704f = typedArray.getFloat(index, eVar5.f19704f);
                    break;
                case 49:
                    e eVar6 = aVar.f19565f;
                    eVar6.f19705g = typedArray.getDimension(index, eVar6.f19705g);
                    break;
                case 50:
                    e eVar7 = aVar.f19565f;
                    eVar7.f19706h = typedArray.getDimension(index, eVar7.f19706h);
                    break;
                case 51:
                    e eVar8 = aVar.f19565f;
                    eVar8.f19708j = typedArray.getDimension(index, eVar8.f19708j);
                    break;
                case 52:
                    e eVar9 = aVar.f19565f;
                    eVar9.f19709k = typedArray.getDimension(index, eVar9.f19709k);
                    break;
                case 53:
                    e eVar10 = aVar.f19565f;
                    eVar10.f19710l = typedArray.getDimension(index, eVar10.f19710l);
                    break;
                case 54:
                    b bVar40 = aVar.f19564e;
                    bVar40.Y = typedArray.getInt(index, bVar40.Y);
                    break;
                case 55:
                    b bVar41 = aVar.f19564e;
                    bVar41.Z = typedArray.getInt(index, bVar41.Z);
                    break;
                case 56:
                    b bVar42 = aVar.f19564e;
                    bVar42.f19615a0 = typedArray.getDimensionPixelSize(index, bVar42.f19615a0);
                    break;
                case 57:
                    b bVar43 = aVar.f19564e;
                    bVar43.f19617b0 = typedArray.getDimensionPixelSize(index, bVar43.f19617b0);
                    break;
                case 58:
                    b bVar44 = aVar.f19564e;
                    bVar44.f19619c0 = typedArray.getDimensionPixelSize(index, bVar44.f19619c0);
                    break;
                case 59:
                    b bVar45 = aVar.f19564e;
                    bVar45.f19621d0 = typedArray.getDimensionPixelSize(index, bVar45.f19621d0);
                    break;
                case 60:
                    e eVar11 = aVar.f19565f;
                    eVar11.f19700b = typedArray.getFloat(index, eVar11.f19700b);
                    break;
                case 61:
                    b bVar46 = aVar.f19564e;
                    bVar46.A = y0(typedArray, index, bVar46.A);
                    break;
                case 62:
                    b bVar47 = aVar.f19564e;
                    bVar47.B = typedArray.getDimensionPixelSize(index, bVar47.B);
                    break;
                case 63:
                    b bVar48 = aVar.f19564e;
                    bVar48.C = typedArray.getFloat(index, bVar48.C);
                    break;
                case 64:
                    C0117c c0117c = aVar.f19563d;
                    c0117c.f19669b = y0(typedArray, index, c0117c.f19669b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f19563d.f19671d = typedArray.getString(index);
                    } else {
                        aVar.f19563d.f19671d = androidx.constraintlayout.core.motion.utils.d.f17653o[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f19563d.f19673f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0117c c0117c2 = aVar.f19563d;
                    c0117c2.f19676i = typedArray.getFloat(index, c0117c2.f19676i);
                    break;
                case 68:
                    d dVar4 = aVar.f19562c;
                    dVar4.f19686e = typedArray.getFloat(index, dVar4.f19686e);
                    break;
                case 69:
                    aVar.f19564e.f19623e0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f19564e.f19625f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e(f19496h, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f19564e;
                    bVar49.f19627g0 = typedArray.getInt(index, bVar49.f19627g0);
                    break;
                case 73:
                    b bVar50 = aVar.f19564e;
                    bVar50.f19629h0 = typedArray.getDimensionPixelSize(index, bVar50.f19629h0);
                    break;
                case 74:
                    aVar.f19564e.f19635k0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f19564e;
                    bVar51.f19643o0 = typedArray.getBoolean(index, bVar51.f19643o0);
                    break;
                case 76:
                    C0117c c0117c3 = aVar.f19563d;
                    c0117c3.f19672e = typedArray.getInt(index, c0117c3.f19672e);
                    break;
                case 77:
                    aVar.f19564e.f19637l0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f19562c;
                    dVar5.f19684c = typedArray.getInt(index, dVar5.f19684c);
                    break;
                case 79:
                    C0117c c0117c4 = aVar.f19563d;
                    c0117c4.f19674g = typedArray.getFloat(index, c0117c4.f19674g);
                    break;
                case 80:
                    b bVar52 = aVar.f19564e;
                    bVar52.f19639m0 = typedArray.getBoolean(index, bVar52.f19639m0);
                    break;
                case 81:
                    b bVar53 = aVar.f19564e;
                    bVar53.f19641n0 = typedArray.getBoolean(index, bVar53.f19641n0);
                    break;
                case 82:
                    C0117c c0117c5 = aVar.f19563d;
                    c0117c5.f19670c = typedArray.getInteger(index, c0117c5.f19670c);
                    break;
                case 83:
                    e eVar12 = aVar.f19565f;
                    eVar12.f19707i = y0(typedArray, index, eVar12.f19707i);
                    break;
                case 84:
                    C0117c c0117c6 = aVar.f19563d;
                    c0117c6.f19678k = typedArray.getInteger(index, c0117c6.f19678k);
                    break;
                case 85:
                    C0117c c0117c7 = aVar.f19563d;
                    c0117c7.f19677j = typedArray.getFloat(index, c0117c7.f19677j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f19563d.f19681n = typedArray.getResourceId(index, -1);
                        C0117c c0117c8 = aVar.f19563d;
                        if (c0117c8.f19681n != -1) {
                            c0117c8.f19680m = -2;
                        }
                    } else if (i11 == 3) {
                        aVar.f19563d.f19679l = typedArray.getString(index);
                        if (aVar.f19563d.f19679l.indexOf("/") > 0) {
                            aVar.f19563d.f19681n = typedArray.getResourceId(index, -1);
                            aVar.f19563d.f19680m = -2;
                        } else {
                            aVar.f19563d.f19680m = -1;
                        }
                    } else {
                        C0117c c0117c9 = aVar.f19563d;
                        c0117c9.f19680m = typedArray.getInteger(index, c0117c9.f19681n);
                    }
                    break;
                case 87:
                    Log.w(f19496h, "unused attribute 0x" + Integer.toHexString(index) + "   " + W.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w(f19496h, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + W.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f19564e;
                    bVar54.f19647r = y0(typedArray, index, bVar54.f19647r);
                    break;
                case 92:
                    b bVar55 = aVar.f19564e;
                    bVar55.f19648s = y0(typedArray, index, bVar55.f19648s);
                    break;
                case 93:
                    b bVar56 = aVar.f19564e;
                    bVar56.M = typedArray.getDimensionPixelSize(index, bVar56.M);
                    break;
                case 94:
                    b bVar57 = aVar.f19564e;
                    bVar57.T = typedArray.getDimensionPixelSize(index, bVar57.T);
                    break;
                case 95:
                    A0(aVar.f19564e, typedArray, index, 0);
                    break;
                case 96:
                    A0(aVar.f19564e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f19564e;
                    bVar58.f19645p0 = typedArray.getInt(index, bVar58.f19645p0);
                    break;
            }
        }
        b bVar59 = aVar.f19564e;
        if (bVar59.f19635k0 != null) {
            bVar59.f19633j0 = null;
        }
    }

    private static String[] G1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < charArray.length; i11++) {
            char c10 = charArray[i11];
            if (c10 == ',' && !z10) {
                arrayList.add(new String(charArray, i10, i11 - i10));
                i10 = i11 + 1;
            } else if (c10 == '\"') {
                z10 = !z10;
            }
        }
        arrayList.add(new String(charArray, i10, charArray.length - i10));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static void H0(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0116a c0116a = new a.C0116a();
        aVar.f19567h = c0116a;
        aVar.f19563d.f19668a = false;
        aVar.f19564e.f19616b = false;
        aVar.f19562c.f19682a = false;
        aVar.f19565f.f19699a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (X.get(index)) {
                case 2:
                    c0116a.b(2, typedArray.getDimensionPixelSize(index, aVar.f19564e.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w(f19496h, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + W.get(index));
                    break;
                case 5:
                    c0116a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0116a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f19564e.D));
                    break;
                case 7:
                    c0116a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f19564e.E));
                    break;
                case 8:
                    c0116a.b(8, typedArray.getDimensionPixelSize(index, aVar.f19564e.K));
                    break;
                case 11:
                    c0116a.b(11, typedArray.getDimensionPixelSize(index, aVar.f19564e.Q));
                    break;
                case 12:
                    c0116a.b(12, typedArray.getDimensionPixelSize(index, aVar.f19564e.R));
                    break;
                case 13:
                    c0116a.b(13, typedArray.getDimensionPixelSize(index, aVar.f19564e.N));
                    break;
                case 14:
                    c0116a.b(14, typedArray.getDimensionPixelSize(index, aVar.f19564e.P));
                    break;
                case 15:
                    c0116a.b(15, typedArray.getDimensionPixelSize(index, aVar.f19564e.S));
                    break;
                case 16:
                    c0116a.b(16, typedArray.getDimensionPixelSize(index, aVar.f19564e.O));
                    break;
                case 17:
                    c0116a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f19564e.f19624f));
                    break;
                case 18:
                    c0116a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f19564e.f19626g));
                    break;
                case 19:
                    c0116a.a(19, typedArray.getFloat(index, aVar.f19564e.f19628h));
                    break;
                case 20:
                    c0116a.a(20, typedArray.getFloat(index, aVar.f19564e.f19653x));
                    break;
                case 21:
                    c0116a.b(21, typedArray.getLayoutDimension(index, aVar.f19564e.f19622e));
                    break;
                case 22:
                    c0116a.b(22, U[typedArray.getInt(index, aVar.f19562c.f19683b)]);
                    break;
                case 23:
                    c0116a.b(23, typedArray.getLayoutDimension(index, aVar.f19564e.f19620d));
                    break;
                case 24:
                    c0116a.b(24, typedArray.getDimensionPixelSize(index, aVar.f19564e.G));
                    break;
                case 27:
                    c0116a.b(27, typedArray.getInt(index, aVar.f19564e.F));
                    break;
                case 28:
                    c0116a.b(28, typedArray.getDimensionPixelSize(index, aVar.f19564e.H));
                    break;
                case 31:
                    c0116a.b(31, typedArray.getDimensionPixelSize(index, aVar.f19564e.L));
                    break;
                case 34:
                    c0116a.b(34, typedArray.getDimensionPixelSize(index, aVar.f19564e.I));
                    break;
                case 37:
                    c0116a.a(37, typedArray.getFloat(index, aVar.f19564e.f19654y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f19560a);
                    aVar.f19560a = resourceId;
                    c0116a.b(38, resourceId);
                    break;
                case 39:
                    c0116a.a(39, typedArray.getFloat(index, aVar.f19564e.V));
                    break;
                case 40:
                    c0116a.a(40, typedArray.getFloat(index, aVar.f19564e.U));
                    break;
                case 41:
                    c0116a.b(41, typedArray.getInt(index, aVar.f19564e.W));
                    break;
                case 42:
                    c0116a.b(42, typedArray.getInt(index, aVar.f19564e.X));
                    break;
                case 43:
                    c0116a.a(43, typedArray.getFloat(index, aVar.f19562c.f19685d));
                    break;
                case 44:
                    c0116a.d(44, true);
                    c0116a.a(44, typedArray.getDimension(index, aVar.f19565f.f19712n));
                    break;
                case 45:
                    c0116a.a(45, typedArray.getFloat(index, aVar.f19565f.f19701c));
                    break;
                case 46:
                    c0116a.a(46, typedArray.getFloat(index, aVar.f19565f.f19702d));
                    break;
                case 47:
                    c0116a.a(47, typedArray.getFloat(index, aVar.f19565f.f19703e));
                    break;
                case 48:
                    c0116a.a(48, typedArray.getFloat(index, aVar.f19565f.f19704f));
                    break;
                case 49:
                    c0116a.a(49, typedArray.getDimension(index, aVar.f19565f.f19705g));
                    break;
                case 50:
                    c0116a.a(50, typedArray.getDimension(index, aVar.f19565f.f19706h));
                    break;
                case 51:
                    c0116a.a(51, typedArray.getDimension(index, aVar.f19565f.f19708j));
                    break;
                case 52:
                    c0116a.a(52, typedArray.getDimension(index, aVar.f19565f.f19709k));
                    break;
                case 53:
                    c0116a.a(53, typedArray.getDimension(index, aVar.f19565f.f19710l));
                    break;
                case 54:
                    c0116a.b(54, typedArray.getInt(index, aVar.f19564e.Y));
                    break;
                case 55:
                    c0116a.b(55, typedArray.getInt(index, aVar.f19564e.Z));
                    break;
                case 56:
                    c0116a.b(56, typedArray.getDimensionPixelSize(index, aVar.f19564e.f19615a0));
                    break;
                case 57:
                    c0116a.b(57, typedArray.getDimensionPixelSize(index, aVar.f19564e.f19617b0));
                    break;
                case 58:
                    c0116a.b(58, typedArray.getDimensionPixelSize(index, aVar.f19564e.f19619c0));
                    break;
                case 59:
                    c0116a.b(59, typedArray.getDimensionPixelSize(index, aVar.f19564e.f19621d0));
                    break;
                case 60:
                    c0116a.a(60, typedArray.getFloat(index, aVar.f19565f.f19700b));
                    break;
                case 62:
                    c0116a.b(62, typedArray.getDimensionPixelSize(index, aVar.f19564e.B));
                    break;
                case 63:
                    c0116a.a(63, typedArray.getFloat(index, aVar.f19564e.C));
                    break;
                case 64:
                    c0116a.b(64, y0(typedArray, index, aVar.f19563d.f19669b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0116a.c(65, typedArray.getString(index));
                    } else {
                        c0116a.c(65, androidx.constraintlayout.core.motion.utils.d.f17653o[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0116a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0116a.a(67, typedArray.getFloat(index, aVar.f19563d.f19676i));
                    break;
                case 68:
                    c0116a.a(68, typedArray.getFloat(index, aVar.f19562c.f19686e));
                    break;
                case 69:
                    c0116a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0116a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e(f19496h, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0116a.b(72, typedArray.getInt(index, aVar.f19564e.f19627g0));
                    break;
                case 73:
                    c0116a.b(73, typedArray.getDimensionPixelSize(index, aVar.f19564e.f19629h0));
                    break;
                case 74:
                    c0116a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0116a.d(75, typedArray.getBoolean(index, aVar.f19564e.f19643o0));
                    break;
                case 76:
                    c0116a.b(76, typedArray.getInt(index, aVar.f19563d.f19672e));
                    break;
                case 77:
                    c0116a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0116a.b(78, typedArray.getInt(index, aVar.f19562c.f19684c));
                    break;
                case 79:
                    c0116a.a(79, typedArray.getFloat(index, aVar.f19563d.f19674g));
                    break;
                case 80:
                    c0116a.d(80, typedArray.getBoolean(index, aVar.f19564e.f19639m0));
                    break;
                case 81:
                    c0116a.d(81, typedArray.getBoolean(index, aVar.f19564e.f19641n0));
                    break;
                case 82:
                    c0116a.b(82, typedArray.getInteger(index, aVar.f19563d.f19670c));
                    break;
                case 83:
                    c0116a.b(83, y0(typedArray, index, aVar.f19565f.f19707i));
                    break;
                case 84:
                    c0116a.b(84, typedArray.getInteger(index, aVar.f19563d.f19678k));
                    break;
                case 85:
                    c0116a.a(85, typedArray.getFloat(index, aVar.f19563d.f19677j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f19563d.f19681n = typedArray.getResourceId(index, -1);
                        c0116a.b(89, aVar.f19563d.f19681n);
                        C0117c c0117c = aVar.f19563d;
                        if (c0117c.f19681n != -1) {
                            c0117c.f19680m = -2;
                            c0116a.b(88, -2);
                        }
                    } else if (i11 == 3) {
                        aVar.f19563d.f19679l = typedArray.getString(index);
                        c0116a.c(90, aVar.f19563d.f19679l);
                        if (aVar.f19563d.f19679l.indexOf("/") > 0) {
                            aVar.f19563d.f19681n = typedArray.getResourceId(index, -1);
                            c0116a.b(89, aVar.f19563d.f19681n);
                            aVar.f19563d.f19680m = -2;
                            c0116a.b(88, -2);
                        } else {
                            aVar.f19563d.f19680m = -1;
                            c0116a.b(88, -1);
                        }
                    } else {
                        C0117c c0117c2 = aVar.f19563d;
                        c0117c2.f19680m = typedArray.getInteger(index, c0117c2.f19681n);
                        c0116a.b(88, aVar.f19563d.f19680m);
                    }
                    break;
                case 87:
                    Log.w(f19496h, "unused attribute 0x" + Integer.toHexString(index) + "   " + W.get(index));
                    break;
                case 93:
                    c0116a.b(93, typedArray.getDimensionPixelSize(index, aVar.f19564e.M));
                    break;
                case 94:
                    c0116a.b(94, typedArray.getDimensionPixelSize(index, aVar.f19564e.T));
                    break;
                case 95:
                    A0(c0116a, typedArray, index, 0);
                    break;
                case 96:
                    A0(c0116a, typedArray, index, 1);
                    break;
                case 97:
                    c0116a.b(97, typedArray.getInt(index, aVar.f19564e.f19645p0));
                    break;
                case 98:
                    if (MotionLayout.U4) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f19560a);
                        aVar.f19560a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f19561b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f19561b = typedArray.getString(index);
                    } else {
                        aVar.f19560a = typedArray.getResourceId(index, aVar.f19560a);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void R0(a aVar, int i10, float f10) {
        if (i10 == 19) {
            aVar.f19564e.f19628h = f10;
        }
        if (i10 == 20) {
            aVar.f19564e.f19653x = f10;
            return;
        }
        if (i10 == 37) {
            aVar.f19564e.f19654y = f10;
            return;
        }
        if (i10 == 60) {
            aVar.f19565f.f19700b = f10;
            return;
        }
        if (i10 == 63) {
            aVar.f19564e.C = f10;
            return;
        }
        if (i10 == 79) {
            aVar.f19563d.f19674g = f10;
            return;
        }
        if (i10 == 85) {
            aVar.f19563d.f19677j = f10;
            return;
        }
        if (i10 != 87) {
            if (i10 == 39) {
                aVar.f19564e.V = f10;
                return;
            }
            if (i10 == 40) {
                aVar.f19564e.U = f10;
                return;
            }
            switch (i10) {
                case 43:
                    aVar.f19562c.f19685d = f10;
                    break;
                case 44:
                    e eVar = aVar.f19565f;
                    eVar.f19712n = f10;
                    eVar.f19711m = true;
                    break;
                case 45:
                    aVar.f19565f.f19701c = f10;
                    break;
                case 46:
                    aVar.f19565f.f19702d = f10;
                    break;
                case 47:
                    aVar.f19565f.f19703e = f10;
                    break;
                case 48:
                    aVar.f19565f.f19704f = f10;
                    break;
                case 49:
                    aVar.f19565f.f19705g = f10;
                    break;
                case 50:
                    aVar.f19565f.f19706h = f10;
                    break;
                case 51:
                    aVar.f19565f.f19708j = f10;
                    break;
                case 52:
                    aVar.f19565f.f19709k = f10;
                    break;
                case 53:
                    aVar.f19565f.f19710l = f10;
                    break;
                default:
                    switch (i10) {
                        case 67:
                            aVar.f19563d.f19676i = f10;
                            break;
                        case 68:
                            aVar.f19562c.f19686e = f10;
                            break;
                        case 69:
                            aVar.f19564e.f19623e0 = f10;
                            break;
                        case 70:
                            aVar.f19564e.f19625f0 = f10;
                            break;
                        default:
                            Log.w(f19496h, "Unknown attribute 0x");
                            break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S0(a aVar, int i10, int i11) {
        if (i10 == 6) {
            aVar.f19564e.D = i11;
        }
        if (i10 == 7) {
            aVar.f19564e.E = i11;
            return;
        }
        if (i10 == 8) {
            aVar.f19564e.K = i11;
            return;
        }
        if (i10 == 27) {
            aVar.f19564e.F = i11;
            return;
        }
        if (i10 == 28) {
            aVar.f19564e.H = i11;
            return;
        }
        if (i10 == 41) {
            aVar.f19564e.W = i11;
            return;
        }
        if (i10 == 42) {
            aVar.f19564e.X = i11;
            return;
        }
        if (i10 == 61) {
            aVar.f19564e.A = i11;
            return;
        }
        if (i10 == 62) {
            aVar.f19564e.B = i11;
            return;
        }
        if (i10 == 72) {
            aVar.f19564e.f19627g0 = i11;
            return;
        }
        if (i10 == 73) {
            aVar.f19564e.f19629h0 = i11;
            return;
        }
        switch (i10) {
            case 2:
                aVar.f19564e.J = i11;
                break;
            case 11:
                aVar.f19564e.Q = i11;
                break;
            case 12:
                aVar.f19564e.R = i11;
                break;
            case 13:
                aVar.f19564e.N = i11;
                break;
            case 14:
                aVar.f19564e.P = i11;
                break;
            case 15:
                aVar.f19564e.S = i11;
                break;
            case 16:
                aVar.f19564e.O = i11;
                break;
            case 17:
                aVar.f19564e.f19624f = i11;
                break;
            case 18:
                aVar.f19564e.f19626g = i11;
                break;
            case 31:
                aVar.f19564e.L = i11;
                break;
            case 34:
                aVar.f19564e.I = i11;
                break;
            case 38:
                aVar.f19560a = i11;
                break;
            case 64:
                aVar.f19563d.f19669b = i11;
                break;
            case 66:
                aVar.f19563d.f19673f = i11;
                break;
            case 76:
                aVar.f19563d.f19672e = i11;
                break;
            case 78:
                aVar.f19562c.f19684c = i11;
                break;
            case 93:
                aVar.f19564e.M = i11;
                break;
            case 94:
                aVar.f19564e.T = i11;
                break;
            case 97:
                aVar.f19564e.f19645p0 = i11;
                break;
            default:
                switch (i10) {
                    case 21:
                        aVar.f19564e.f19622e = i11;
                        break;
                    case 22:
                        aVar.f19562c.f19683b = i11;
                        break;
                    case 23:
                        aVar.f19564e.f19620d = i11;
                        break;
                    case 24:
                        aVar.f19564e.G = i11;
                        break;
                    default:
                        switch (i10) {
                            case 54:
                                aVar.f19564e.Y = i11;
                                break;
                            case 55:
                                aVar.f19564e.Z = i11;
                                break;
                            case 56:
                                aVar.f19564e.f19615a0 = i11;
                                break;
                            case 57:
                                aVar.f19564e.f19617b0 = i11;
                                break;
                            case 58:
                                aVar.f19564e.f19619c0 = i11;
                                break;
                            case 59:
                                aVar.f19564e.f19621d0 = i11;
                                break;
                            default:
                                switch (i10) {
                                    case 82:
                                        aVar.f19563d.f19670c = i11;
                                        break;
                                    case 83:
                                        aVar.f19565f.f19707i = i11;
                                        break;
                                    case 84:
                                        aVar.f19563d.f19678k = i11;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 87:
                                                break;
                                            case 88:
                                                aVar.f19563d.f19680m = i11;
                                                break;
                                            case 89:
                                                aVar.f19563d.f19681n = i11;
                                                break;
                                            default:
                                                Log.w(f19496h, "Unknown attribute 0x");
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void T0(a aVar, int i10, String str) {
        if (i10 == 5) {
            aVar.f19564e.f19655z = str;
            return;
        }
        if (i10 == 65) {
            aVar.f19563d.f19671d = str;
            return;
        }
        if (i10 == 74) {
            b bVar = aVar.f19564e;
            bVar.f19635k0 = str;
            bVar.f19633j0 = null;
        } else if (i10 == 77) {
            aVar.f19564e.f19637l0 = str;
        } else if (i10 != 87) {
            if (i10 != 90) {
                Log.w(f19496h, "Unknown attribute 0x");
            } else {
                aVar.f19563d.f19679l = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void U0(a aVar, int i10, boolean z10) {
        if (i10 == 44) {
            aVar.f19565f.f19711m = z10;
            return;
        }
        if (i10 == 75) {
            aVar.f19564e.f19643o0 = z10;
            return;
        }
        if (i10 != 87) {
            if (i10 == 80) {
                aVar.f19564e.f19639m0 = z10;
            } else if (i10 != 81) {
                Log.w(f19496h, "Unknown attribute 0x");
            } else {
                aVar.f19564e.f19641n0 = z10;
            }
        }
    }

    private int[] Z(View view, String str) {
        int iIntValue;
        Object objN;
        String[] strArrSplit = str.split(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = R.id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objN = ((ConstraintLayout) view.getParent()).n(0, strTrim)) != null && (objN instanceof Integer)) {
                iIntValue = ((Integer) objN).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private void d0(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14, int i15, int i16) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            i0(iArr[0]).f19564e.V = fArr[0];
        }
        i0(iArr[0]).f19564e.W = i14;
        L(iArr[0], i15, i10, i11, -1);
        for (int i17 = 1; i17 < iArr.length; i17++) {
            int i18 = i17 - 1;
            L(iArr[i17], i15, iArr[i18], i16, -1);
            L(iArr[i18], i16, iArr[i17], i15, -1);
            if (fArr != null) {
                i0(iArr[i17]).f19564e.V = fArr[i17];
            }
        }
        L(iArr[iArr.length - 1], i16, i12, i13, -1);
    }

    private void h(ConstraintAttribute.AttributeType attributeType, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (this.f19557e.containsKey(strArr[i10])) {
                ConstraintAttribute constraintAttribute = this.f19557e.get(strArr[i10]);
                if (constraintAttribute != null && constraintAttribute.e() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.e().name());
                }
            } else {
                this.f19557e.put(strArr[i10], new ConstraintAttribute(strArr[i10], attributeType));
            }
        }
    }

    private a h0(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? R.styleable.f19435x : R.styleable.f19427t);
        G0(context, aVar, typedArrayObtainStyledAttributes, z10);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a i0(int i10) {
        if (!this.f19559g.containsKey(Integer.valueOf(i10))) {
            this.f19559g.put(Integer.valueOf(i10), new a());
        }
        return this.f19559g.get(Integer.valueOf(i10));
    }

    static String m0(int i10) {
        for (Field field : c.class.getDeclaredFields()) {
            if (field.getName().contains(lg.a.f131412e) && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == i10) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return "UNKNOWN";
    }

    static String p0(Context context, int i10, XmlPullParser xmlPullParser) {
        return ".(" + androidx.constraintlayout.motion.widget.c.i(context, i10) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    public static a w(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, R.styleable.f19435x);
        H0(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int y0(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    public void A(int i10, int i11) {
        if (i11 == 0) {
            x(i10, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            x(i10, i11, 7, 0, i11, 6, 0, 0.5f);
        }
    }

    public void A1(int i10, float f10) {
        i0(i10).f19564e.f19654y = f10;
    }

    public void B(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        L(i10, 6, i11, i12, i13);
        L(i10, 7, i14, i15, i16);
        a aVar = this.f19559g.get(Integer.valueOf(i10));
        if (aVar != null) {
            aVar.f19564e.f19653x = f10;
        }
    }

    public void B1(int i10, int i11) {
        i0(i10).f19564e.X = i11;
    }

    public void C(int i10, int i11) {
        if (i11 == 0) {
            x(i10, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            x(i10, i11, 4, 0, i11, 3, 0, 0.5f);
        }
    }

    public void C1(int i10, float f10) {
        i0(i10).f19564e.U = f10;
    }

    public void D(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        L(i10, 3, i11, i12, i13);
        L(i10, 4, i14, i15, i16);
        a aVar = this.f19559g.get(Integer.valueOf(i10));
        if (aVar != null) {
            aVar.f19564e.f19654y = f10;
        }
    }

    public void D0(a aVar, String str) {
        String[] strArrSplit = str.split(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (strArrSplit2.length != 2) {
                Log.w(f19496h, " Unable to parse " + strArrSplit[i10]);
            } else {
                aVar.q(strArrSplit2[0], Float.parseFloat(strArrSplit2[1]));
            }
        }
    }

    public void D1(int i10, int i11) {
        i0(i10).f19562c.f19683b = i11;
    }

    public void E(int i10) {
        this.f19559g.remove(Integer.valueOf(i10));
    }

    public void E0(a aVar, String str) {
        String[] strArrSplit = str.split(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (strArrSplit2.length != 2) {
                Log.w(f19496h, " Unable to parse " + strArrSplit[i10]);
            } else {
                aVar.q(strArrSplit2[0], Integer.decode(strArrSplit2[1]).intValue());
            }
        }
    }

    public void E1(int i10, int i11) {
        i0(i10).f19562c.f19684c = i11;
    }

    public void F(int i10, int i11) {
        a aVar;
        if (!this.f19559g.containsKey(Integer.valueOf(i10)) || (aVar = this.f19559g.get(Integer.valueOf(i10))) == null) {
            return;
        }
        switch (i11) {
            case 1:
                b bVar = aVar.f19564e;
                bVar.f19632j = -1;
                bVar.f19630i = -1;
                bVar.G = -1;
                bVar.N = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f19564e;
                bVar2.f19636l = -1;
                bVar2.f19634k = -1;
                bVar2.H = -1;
                bVar2.P = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f19564e;
                bVar3.f19640n = -1;
                bVar3.f19638m = -1;
                bVar3.I = 0;
                bVar3.O = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f19564e;
                bVar4.f19642o = -1;
                bVar4.f19644p = -1;
                bVar4.J = 0;
                bVar4.Q = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f19564e;
                bVar5.f19646q = -1;
                bVar5.f19647r = -1;
                bVar5.f19648s = -1;
                bVar5.M = 0;
                bVar5.T = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f19564e;
                bVar6.f19649t = -1;
                bVar6.f19650u = -1;
                bVar6.L = 0;
                bVar6.S = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.f19564e;
                bVar7.f19651v = -1;
                bVar7.f19652w = -1;
                bVar7.K = 0;
                bVar7.R = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f19564e;
                bVar8.C = -1.0f;
                bVar8.B = -1;
                bVar8.A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void F0(a aVar, String str) {
        String[] strArrG1 = G1(str);
        for (int i10 = 0; i10 < strArrG1.length; i10++) {
            String[] strArrSplit = strArrG1[i10].split(ContainerUtils.KEY_VALUE_DELIMITER);
            Log.w(f19496h, " Unable to parse " + strArrG1[i10]);
            aVar.s(strArrSplit[0], strArrSplit[1]);
        }
    }

    public void G(Context context, int i10) {
        H((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void H(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f19559g.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f19558f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f19559g.containsKey(Integer.valueOf(id2))) {
                this.f19559g.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f19559g.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f19566g = ConstraintAttribute.d(this.f19557e, childAt);
                aVar.k(id2, layoutParams);
                aVar.f19562c.f19683b = childAt.getVisibility();
                aVar.f19562c.f19685d = childAt.getAlpha();
                aVar.f19565f.f19700b = childAt.getRotation();
                aVar.f19565f.f19701c = childAt.getRotationX();
                aVar.f19565f.f19702d = childAt.getRotationY();
                aVar.f19565f.f19703e = childAt.getScaleX();
                aVar.f19565f.f19704f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f19565f;
                    eVar.f19705g = pivotX;
                    eVar.f19706h = pivotY;
                }
                aVar.f19565f.f19708j = childAt.getTranslationX();
                aVar.f19565f.f19709k = childAt.getTranslationY();
                aVar.f19565f.f19710l = childAt.getTranslationZ();
                e eVar2 = aVar.f19565f;
                if (eVar2.f19711m) {
                    eVar2.f19712n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f19564e.f19643o0 = barrier.getAllowsGoneWidget();
                    aVar.f19564e.f19633j0 = barrier.getReferencedIds();
                    aVar.f19564e.f19627g0 = barrier.getType();
                    aVar.f19564e.f19629h0 = barrier.getMargin();
                }
            }
        }
    }

    public void H1(Writer writer, ConstraintLayout constraintLayout, int i10) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((i10 & 1) == 1) {
            new g(writer, constraintLayout, i10).i();
        } else {
            new f(writer, constraintLayout, i10).g();
        }
        writer.write("\n---------------------------------------------\n");
    }

    public void I(c cVar) {
        this.f19559g.clear();
        for (Integer num : cVar.f19559g.keySet()) {
            a aVar = cVar.f19559g.get(num);
            if (aVar != null) {
                this.f19559g.put(num, aVar.clone());
            }
        }
    }

    public void I0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f19558f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f19559g.containsKey(Integer.valueOf(id2))) {
                this.f19559g.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f19559g.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (!aVar.f19564e.f19616b) {
                    aVar.k(id2, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        aVar.f19564e.f19633j0 = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f19564e.f19643o0 = barrier.getAllowsGoneWidget();
                            aVar.f19564e.f19627g0 = barrier.getType();
                            aVar.f19564e.f19629h0 = barrier.getMargin();
                        }
                    }
                    aVar.f19564e.f19616b = true;
                }
                d dVar = aVar.f19562c;
                if (!dVar.f19682a) {
                    dVar.f19683b = childAt.getVisibility();
                    aVar.f19562c.f19685d = childAt.getAlpha();
                    aVar.f19562c.f19682a = true;
                }
                e eVar = aVar.f19565f;
                if (!eVar.f19699a) {
                    eVar.f19699a = true;
                    eVar.f19700b = childAt.getRotation();
                    aVar.f19565f.f19701c = childAt.getRotationX();
                    aVar.f19565f.f19702d = childAt.getRotationY();
                    aVar.f19565f.f19703e = childAt.getScaleX();
                    aVar.f19565f.f19704f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar2 = aVar.f19565f;
                        eVar2.f19705g = pivotX;
                        eVar2.f19706h = pivotY;
                    }
                    aVar.f19565f.f19708j = childAt.getTranslationX();
                    aVar.f19565f.f19709k = childAt.getTranslationY();
                    aVar.f19565f.f19710l = childAt.getTranslationZ();
                    e eVar3 = aVar.f19565f;
                    if (eVar3.f19711m) {
                        eVar3.f19712n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void J(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f19559g.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraints.getChildAt(i10);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f19558f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f19559g.containsKey(Integer.valueOf(id2))) {
                this.f19559g.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f19559g.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (childAt instanceof ConstraintHelper) {
                    aVar.m((ConstraintHelper) childAt, id2, layoutParams);
                }
                aVar.l(id2, layoutParams);
            }
        }
    }

    public void J0(c cVar) {
        for (Integer num : cVar.f19559g.keySet()) {
            int iIntValue = num.intValue();
            a aVar = cVar.f19559g.get(num);
            if (!this.f19559g.containsKey(Integer.valueOf(iIntValue))) {
                this.f19559g.put(Integer.valueOf(iIntValue), new a());
            }
            a aVar2 = this.f19559g.get(Integer.valueOf(iIntValue));
            if (aVar2 != null) {
                b bVar = aVar2.f19564e;
                if (!bVar.f19616b) {
                    bVar.a(aVar.f19564e);
                }
                d dVar = aVar2.f19562c;
                if (!dVar.f19682a) {
                    dVar.a(aVar.f19562c);
                }
                e eVar = aVar2.f19565f;
                if (!eVar.f19699a) {
                    eVar.a(aVar.f19565f);
                }
                C0117c c0117c = aVar2.f19563d;
                if (!c0117c.f19668a) {
                    c0117c.a(aVar.f19563d);
                }
                for (String str : aVar.f19566g.keySet()) {
                    if (!aVar2.f19566g.containsKey(str)) {
                        aVar2.f19566g.put(str, aVar.f19566g.get(str));
                    }
                }
            }
        }
    }

    public void K(int i10, int i11, int i12, int i13) {
        if (!this.f19559g.containsKey(Integer.valueOf(i10))) {
            this.f19559g.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f19559g.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f19564e;
                    bVar.f19630i = i12;
                    bVar.f19632j = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar2 = aVar.f19564e;
                    bVar2.f19632j = i12;
                    bVar2.f19630i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + F1(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f19564e;
                    bVar3.f19634k = i12;
                    bVar3.f19636l = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar4 = aVar.f19564e;
                    bVar4.f19636l = i12;
                    bVar4.f19634k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + F1(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f19564e;
                    bVar5.f19638m = i12;
                    bVar5.f19640n = -1;
                    bVar5.f19646q = -1;
                    bVar5.f19647r = -1;
                    bVar5.f19648s = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + F1(i13) + " undefined");
                }
                b bVar6 = aVar.f19564e;
                bVar6.f19640n = i12;
                bVar6.f19638m = -1;
                bVar6.f19646q = -1;
                bVar6.f19647r = -1;
                bVar6.f19648s = -1;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f19564e;
                    bVar7.f19644p = i12;
                    bVar7.f19642o = -1;
                    bVar7.f19646q = -1;
                    bVar7.f19647r = -1;
                    bVar7.f19648s = -1;
                    return;
                }
                if (i13 != 3) {
                    throw new IllegalArgumentException("right to " + F1(i13) + " undefined");
                }
                b bVar8 = aVar.f19564e;
                bVar8.f19642o = i12;
                bVar8.f19644p = -1;
                bVar8.f19646q = -1;
                bVar8.f19647r = -1;
                bVar8.f19648s = -1;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f19564e;
                    bVar9.f19646q = i12;
                    bVar9.f19644p = -1;
                    bVar9.f19642o = -1;
                    bVar9.f19638m = -1;
                    bVar9.f19640n = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f19564e;
                    bVar10.f19647r = i12;
                    bVar10.f19644p = -1;
                    bVar10.f19642o = -1;
                    bVar10.f19638m = -1;
                    bVar10.f19640n = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + F1(i13) + " undefined");
                }
                b bVar11 = aVar.f19564e;
                bVar11.f19648s = i12;
                bVar11.f19644p = -1;
                bVar11.f19642o = -1;
                bVar11.f19638m = -1;
                bVar11.f19640n = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f19564e;
                    bVar12.f19650u = i12;
                    bVar12.f19649t = -1;
                    return;
                } else if (i13 == 7) {
                    b bVar13 = aVar.f19564e;
                    bVar13.f19649t = i12;
                    bVar13.f19650u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + F1(i13) + " undefined");
                }
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f19564e;
                    bVar14.f19652w = i12;
                    bVar14.f19651v = -1;
                    return;
                } else if (i13 == 6) {
                    b bVar15 = aVar.f19564e;
                    bVar15.f19651v = i12;
                    bVar15.f19652w = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + F1(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(F1(i11) + " to " + F1(i13) + " unknown");
        }
    }

    public void K0(String str) {
        this.f19557e.remove(str);
    }

    public void L(int i10, int i11, int i12, int i13, int i14) {
        if (!this.f19559g.containsKey(Integer.valueOf(i10))) {
            this.f19559g.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f19559g.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f19564e;
                    bVar.f19630i = i12;
                    bVar.f19632j = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + F1(i13) + " undefined");
                    }
                    b bVar2 = aVar.f19564e;
                    bVar2.f19632j = i12;
                    bVar2.f19630i = -1;
                }
                aVar.f19564e.G = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f19564e;
                    bVar3.f19634k = i12;
                    bVar3.f19636l = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + F1(i13) + " undefined");
                    }
                    b bVar4 = aVar.f19564e;
                    bVar4.f19636l = i12;
                    bVar4.f19634k = -1;
                }
                aVar.f19564e.H = i14;
                return;
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f19564e;
                    bVar5.f19638m = i12;
                    bVar5.f19640n = -1;
                    bVar5.f19646q = -1;
                    bVar5.f19647r = -1;
                    bVar5.f19648s = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + F1(i13) + " undefined");
                    }
                    b bVar6 = aVar.f19564e;
                    bVar6.f19640n = i12;
                    bVar6.f19638m = -1;
                    bVar6.f19646q = -1;
                    bVar6.f19647r = -1;
                    bVar6.f19648s = -1;
                }
                aVar.f19564e.I = i14;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f19564e;
                    bVar7.f19644p = i12;
                    bVar7.f19642o = -1;
                    bVar7.f19646q = -1;
                    bVar7.f19647r = -1;
                    bVar7.f19648s = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + F1(i13) + " undefined");
                    }
                    b bVar8 = aVar.f19564e;
                    bVar8.f19642o = i12;
                    bVar8.f19644p = -1;
                    bVar8.f19646q = -1;
                    bVar8.f19647r = -1;
                    bVar8.f19648s = -1;
                }
                aVar.f19564e.J = i14;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f19564e;
                    bVar9.f19646q = i12;
                    bVar9.f19644p = -1;
                    bVar9.f19642o = -1;
                    bVar9.f19638m = -1;
                    bVar9.f19640n = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f19564e;
                    bVar10.f19647r = i12;
                    bVar10.f19644p = -1;
                    bVar10.f19642o = -1;
                    bVar10.f19638m = -1;
                    bVar10.f19640n = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + F1(i13) + " undefined");
                }
                b bVar11 = aVar.f19564e;
                bVar11.f19648s = i12;
                bVar11.f19644p = -1;
                bVar11.f19642o = -1;
                bVar11.f19638m = -1;
                bVar11.f19640n = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f19564e;
                    bVar12.f19650u = i12;
                    bVar12.f19649t = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + F1(i13) + " undefined");
                    }
                    b bVar13 = aVar.f19564e;
                    bVar13.f19649t = i12;
                    bVar13.f19650u = -1;
                }
                aVar.f19564e.L = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f19564e;
                    bVar14.f19652w = i12;
                    bVar14.f19651v = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + F1(i13) + " undefined");
                    }
                    b bVar15 = aVar.f19564e;
                    bVar15.f19651v = i12;
                    bVar15.f19652w = -1;
                }
                aVar.f19564e.K = i14;
                return;
            default:
                throw new IllegalArgumentException(F1(i11) + " to " + F1(i13) + " unknown");
        }
    }

    public void L0(int i10) {
        a aVar;
        if (!this.f19559g.containsKey(Integer.valueOf(i10)) || (aVar = this.f19559g.get(Integer.valueOf(i10))) == null) {
            return;
        }
        b bVar = aVar.f19564e;
        int i11 = bVar.f19632j;
        int i12 = bVar.f19634k;
        if (i11 != -1 || i12 != -1) {
            if (i11 == -1 || i12 == -1) {
                int i13 = bVar.f19636l;
                if (i13 != -1) {
                    L(i11, 2, i13, 2, 0);
                } else {
                    int i14 = bVar.f19630i;
                    if (i14 != -1) {
                        L(i12, 1, i14, 1, 0);
                    }
                }
            } else {
                L(i11, 2, i12, 1, 0);
                L(i12, 1, i11, 2, 0);
            }
            F(i10, 1);
            F(i10, 2);
            return;
        }
        int i15 = bVar.f19649t;
        int i16 = bVar.f19651v;
        if (i15 != -1 || i16 != -1) {
            if (i15 != -1 && i16 != -1) {
                L(i15, 7, i16, 6, 0);
                L(i16, 6, i11, 7, 0);
            } else if (i16 != -1) {
                int i17 = bVar.f19636l;
                if (i17 != -1) {
                    L(i11, 7, i17, 7, 0);
                } else {
                    int i18 = bVar.f19630i;
                    if (i18 != -1) {
                        L(i16, 6, i18, 6, 0);
                    }
                }
            }
        }
        F(i10, 6);
        F(i10, 7);
    }

    public void M(int i10, int i11, int i12, float f10) {
        b bVar = i0(i10).f19564e;
        bVar.A = i11;
        bVar.B = i12;
        bVar.C = f10;
    }

    public void M0(int i10) {
        if (this.f19559g.containsKey(Integer.valueOf(i10))) {
            a aVar = this.f19559g.get(Integer.valueOf(i10));
            if (aVar == null) {
                return;
            }
            b bVar = aVar.f19564e;
            int i11 = bVar.f19640n;
            int i12 = bVar.f19642o;
            if (i11 != -1 || i12 != -1) {
                if (i11 == -1 || i12 == -1) {
                    int i13 = bVar.f19644p;
                    if (i13 != -1) {
                        L(i11, 4, i13, 4, 0);
                    } else {
                        int i14 = bVar.f19638m;
                        if (i14 != -1) {
                            L(i12, 3, i14, 3, 0);
                        }
                    }
                } else {
                    L(i11, 4, i12, 3, 0);
                    L(i12, 3, i11, 4, 0);
                }
            }
        }
        F(i10, 3);
        F(i10, 4);
    }

    public void N(int i10, int i11) {
        i0(i10).f19564e.Z = i11;
    }

    public void N0(int i10, float f10) {
        i0(i10).f19562c.f19685d = f10;
    }

    public void O(int i10, int i11) {
        i0(i10).f19564e.Y = i11;
    }

    public void O0(int i10, boolean z10) {
        i0(i10).f19565f.f19711m = z10;
    }

    public void P(int i10, int i11) {
        i0(i10).f19564e.f19622e = i11;
    }

    public void P0(int i10, int i11) {
        i0(i10).f19564e.f19631i0 = i11;
    }

    public void Q(int i10, int i11) {
        i0(i10).f19564e.f19617b0 = i11;
    }

    public void Q0(int i10, String str, int i11) {
        i0(i10).p(str, i11);
    }

    public void R(int i10, int i11) {
        i0(i10).f19564e.f19615a0 = i11;
    }

    public void S(int i10, int i11) {
        i0(i10).f19564e.f19621d0 = i11;
    }

    public void T(int i10, int i11) {
        i0(i10).f19564e.f19619c0 = i11;
    }

    public void U(int i10, float f10) {
        i0(i10).f19564e.f19625f0 = f10;
    }

    public void V(int i10, float f10) {
        i0(i10).f19564e.f19623e0 = f10;
    }

    public void V0(int i10, String str) {
        i0(i10).f19564e.f19655z = str;
    }

    public void W(int i10, int i11) {
        i0(i10).f19564e.f19620d = i11;
    }

    public void W0(int i10, int i11) {
        i0(i10).f19564e.D = i11;
    }

    public void X(int i10, boolean z10) {
        i0(i10).f19564e.f19641n0 = z10;
    }

    public void X0(int i10, int i11) {
        i0(i10).f19564e.E = i11;
    }

    public void Y(int i10, boolean z10) {
        i0(i10).f19564e.f19639m0 = z10;
    }

    public void Y0(int i10, float f10) {
        i0(i10).f19565f.f19712n = f10;
        i0(i10).f19565f.f19711m = true;
    }

    public void Z0(int i10, String str, float f10) {
        i0(i10).q(str, f10);
    }

    public void a0(int i10, int i11) {
        b bVar = i0(i10).f19564e;
        bVar.f19614a = true;
        bVar.F = i11;
    }

    public void a1(boolean z10) {
        this.f19558f = z10;
    }

    public void b0(int i10, int i11, int i12, int... iArr) {
        b bVar = i0(i10).f19564e;
        bVar.f19631i0 = 1;
        bVar.f19627g0 = i11;
        bVar.f19629h0 = i12;
        bVar.f19614a = false;
        bVar.f19633j0 = iArr;
    }

    public void b1(int i10, int i11, int i12) {
        a aVarI0 = i0(i10);
        switch (i11) {
            case 1:
                aVarI0.f19564e.N = i12;
                return;
            case 2:
                aVarI0.f19564e.P = i12;
                return;
            case 3:
                aVarI0.f19564e.O = i12;
                return;
            case 4:
                aVarI0.f19564e.Q = i12;
                return;
            case 5:
                aVarI0.f19564e.T = i12;
                return;
            case 6:
                aVarI0.f19564e.S = i12;
                return;
            case 7:
                aVarI0.f19564e.R = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void c0(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        d0(i10, i11, i12, i13, iArr, fArr, i14, 1, 2);
    }

    public void c1(int i10, int i11) {
        i0(i10).f19564e.f19624f = i11;
        i0(i10).f19564e.f19626g = -1;
        i0(i10).f19564e.f19628h = -1.0f;
    }

    public void d1(int i10, int i11) {
        i0(i10).f19564e.f19626g = i11;
        i0(i10).f19564e.f19624f = -1;
        i0(i10).f19564e.f19628h = -1.0f;
    }

    public void e0(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        d0(i10, i11, i12, i13, iArr, fArr, i14, 6, 7);
    }

    public void e1(int i10, float f10) {
        i0(i10).f19564e.f19628h = f10;
        i0(i10).f19564e.f19626g = -1;
        i0(i10).f19564e.f19624f = -1;
    }

    public void f0(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            i0(iArr[0]).f19564e.U = fArr[0];
        }
        i0(iArr[0]).f19564e.X = i14;
        L(iArr[0], 3, i10, i11, 0);
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = i15 - 1;
            L(iArr[i15], 3, iArr[i16], 4, 0);
            L(iArr[i16], 4, iArr[i15], 3, 0);
            if (fArr != null) {
                i0(iArr[i15]).f19564e.U = fArr[i15];
            }
        }
        L(iArr[iArr.length - 1], 4, i12, i13, 0);
    }

    public void f1(int i10, float f10) {
        i0(i10).f19564e.f19653x = f10;
    }

    public void g0(s sVar, int... iArr) {
        HashSet hashSet;
        Set<Integer> setKeySet = this.f19559g.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i10 : iArr) {
                hashSet.add(Integer.valueOf(i10));
            }
        } else {
            hashSet = new HashSet(setKeySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb2 = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar = this.f19559g.get(num);
            if (aVar != null) {
                sb2.append("<Constraint id=");
                sb2.append(num);
                sb2.append(" \n");
                aVar.f19564e.b(sVar, sb2);
                sb2.append("/>\n");
            }
        }
        System.out.println(sb2.toString());
    }

    public void g1(int i10, int i11) {
        i0(i10).f19564e.W = i11;
    }

    public void h1(int i10, float f10) {
        i0(i10).f19564e.V = f10;
    }

    public void i(String... strArr) {
        h(ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
    }

    public void i1(int i10, String str, int i11) {
        i0(i10).r(str, i11);
    }

    public void j(String... strArr) {
        h(ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
    }

    public boolean j0(int i10) {
        return i0(i10).f19565f.f19711m;
    }

    public void j1(int i10, int i11) {
        if (i11 < 0 || i11 > 3) {
            return;
        }
        i0(i10).f19564e.f19645p0 = i11;
    }

    public void k(String... strArr) {
        h(ConstraintAttribute.AttributeType.INT_TYPE, strArr);
    }

    public a k0(int i10) {
        if (this.f19559g.containsKey(Integer.valueOf(i10))) {
            return this.f19559g.get(Integer.valueOf(i10));
        }
        return null;
    }

    public void k1(int i10, int i11, int i12) {
        a aVarI0 = i0(i10);
        switch (i11) {
            case 1:
                aVarI0.f19564e.G = i12;
                return;
            case 2:
                aVarI0.f19564e.H = i12;
                return;
            case 3:
                aVarI0.f19564e.I = i12;
                return;
            case 4:
                aVarI0.f19564e.J = i12;
                return;
            case 5:
                aVarI0.f19564e.M = i12;
                return;
            case 6:
                aVarI0.f19564e.L = i12;
                return;
            case 7:
                aVarI0.f19564e.K = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void l(String... strArr) {
        h(ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
    }

    public HashMap<String, ConstraintAttribute> l0() {
        return this.f19557e;
    }

    public void l1(int i10, int... iArr) {
        i0(i10).f19564e.f19633j0 = iArr;
    }

    public void m(int i10, int i11, int i12) {
        L(i10, 1, i11, i11 == 0 ? 1 : 2, 0);
        L(i10, 2, i12, i12 == 0 ? 2 : 1, 0);
        if (i11 != 0) {
            L(i11, 2, i10, 1, 0);
        }
        if (i12 != 0) {
            L(i12, 1, i10, 2, 0);
        }
    }

    public void m1(int i10, float f10) {
        i0(i10).f19565f.f19700b = f10;
    }

    public void n(int i10, int i11, int i12) {
        L(i10, 6, i11, i11 == 0 ? 6 : 7, 0);
        L(i10, 7, i12, i12 == 0 ? 7 : 6, 0);
        if (i11 != 0) {
            L(i11, 7, i10, 6, 0);
        }
        if (i12 != 0) {
            L(i12, 6, i10, 7, 0);
        }
    }

    public int n0(int i10) {
        return i0(i10).f19564e.f19622e;
    }

    public void n1(int i10, float f10) {
        i0(i10).f19565f.f19701c = f10;
    }

    public void o(int i10, int i11, int i12) {
        L(i10, 3, i11, i11 == 0 ? 3 : 4, 0);
        L(i10, 4, i12, i12 == 0 ? 4 : 3, 0);
        if (i11 != 0) {
            L(i11, 4, i10, 3, 0);
        }
        if (i12 != 0) {
            L(i12, 3, i10, 4, 0);
        }
    }

    public int[] o0() {
        Integer[] numArr = (Integer[]) this.f19559g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    public void o1(int i10, float f10) {
        i0(i10).f19565f.f19702d = f10;
    }

    public void p(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f19559g.containsKey(Integer.valueOf(id2))) {
                Log.w(f19496h, "id unknown " + androidx.constraintlayout.motion.widget.c.k(childAt));
            } else {
                if (this.f19558f && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f19559g.containsKey(Integer.valueOf(id2)) && (aVar = this.f19559g.get(Integer.valueOf(id2))) != null) {
                    ConstraintAttribute.k(childAt, aVar.f19566g);
                }
            }
        }
    }

    public void p1(int i10, float f10) {
        i0(i10).f19565f.f19703e = f10;
    }

    public void q(c cVar) {
        for (a aVar : cVar.f19559g.values()) {
            if (aVar.f19567h != null) {
                if (aVar.f19561b != null) {
                    Iterator<Integer> it = this.f19559g.keySet().iterator();
                    while (it.hasNext()) {
                        a aVarK0 = k0(it.next().intValue());
                        String str = aVarK0.f19564e.f19637l0;
                        if (str != null && aVar.f19561b.matches(str)) {
                            aVar.f19567h.e(aVarK0);
                            aVarK0.f19566g.putAll((HashMap) aVar.f19566g.clone());
                        }
                    }
                } else {
                    aVar.f19567h.e(k0(aVar.f19560a));
                }
            }
        }
    }

    public a q0(int i10) {
        return i0(i10);
    }

    public void q1(int i10, float f10) {
        i0(i10).f19565f.f19704f = f10;
    }

    public void r(ConstraintLayout constraintLayout) {
        t(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public int[] r0(int i10) {
        int[] iArr = i0(i10).f19564e.f19633j0;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public void r1(int i10, String str, String str2) {
        i0(i10).s(str, str2);
    }

    public void s(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        a aVar;
        int id2 = constraintHelper.getId();
        if (this.f19559g.containsKey(Integer.valueOf(id2)) && (aVar = this.f19559g.get(Integer.valueOf(id2))) != null && (constraintWidget instanceof h)) {
            constraintHelper.z(aVar, (h) constraintWidget, layoutParams, sparseArray);
        }
    }

    public int s0(int i10) {
        return i0(i10).f19562c.f19683b;
    }

    public void s1(int i10, float f10, float f11) {
        e eVar = i0(i10).f19565f;
        eVar.f19706h = f11;
        eVar.f19705g = f10;
    }

    void t(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f19559g.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f19559g.containsKey(Integer.valueOf(id2))) {
                Log.w(f19496h, "id unknown " + androidx.constraintlayout.motion.widget.c.k(childAt));
            } else {
                if (this.f19558f && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f19559g.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f19559g.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f19564e.f19631i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f19564e.f19627g0);
                                barrier.setMargin(aVar.f19564e.f19629h0);
                                barrier.setAllowsGoneWidget(aVar.f19564e.f19643o0);
                                b bVar = aVar.f19564e;
                                int[] iArr = bVar.f19633j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f19635k0;
                                    if (str != null) {
                                        bVar.f19633j0 = Z(barrier, str);
                                        barrier.setReferencedIds(aVar.f19564e.f19633j0);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.e();
                            aVar.i(layoutParams);
                            if (z10) {
                                ConstraintAttribute.k(childAt, aVar.f19566g);
                            }
                            childAt.setLayoutParams(layoutParams);
                            d dVar = aVar.f19562c;
                            if (dVar.f19684c == 0) {
                                childAt.setVisibility(dVar.f19683b);
                            }
                            childAt.setAlpha(aVar.f19562c.f19685d);
                            childAt.setRotation(aVar.f19565f.f19700b);
                            childAt.setRotationX(aVar.f19565f.f19701c);
                            childAt.setRotationY(aVar.f19565f.f19702d);
                            childAt.setScaleX(aVar.f19565f.f19703e);
                            childAt.setScaleY(aVar.f19565f.f19704f);
                            e eVar = aVar.f19565f;
                            if (eVar.f19707i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f19565f.f19707i);
                                if (viewFindViewById != null) {
                                    float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                    float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left2 = left - childAt.getLeft();
                                        float top2 = top - childAt.getTop();
                                        childAt.setPivotX(left2);
                                        childAt.setPivotY(top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f19705g)) {
                                    childAt.setPivotX(aVar.f19565f.f19705g);
                                }
                                if (!Float.isNaN(aVar.f19565f.f19706h)) {
                                    childAt.setPivotY(aVar.f19565f.f19706h);
                                }
                            }
                            childAt.setTranslationX(aVar.f19565f.f19708j);
                            childAt.setTranslationY(aVar.f19565f.f19709k);
                            childAt.setTranslationZ(aVar.f19565f.f19710l);
                            e eVar2 = aVar.f19565f;
                            if (eVar2.f19711m) {
                                childAt.setElevation(eVar2.f19712n);
                            }
                        }
                    } else {
                        Log.v(f19496h, "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f19559g.get(num);
            if (aVar2 != null) {
                if (aVar2.f19564e.f19631i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = aVar2.f19564e;
                    int[] iArr2 = bVar2.f19633j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f19635k0;
                        if (str2 != null) {
                            bVar2.f19633j0 = Z(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f19564e.f19633j0);
                        }
                    }
                    barrier2.setType(aVar2.f19564e.f19627g0);
                    barrier2.setMargin(aVar2.f19564e.f19629h0);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.I();
                    aVar2.i(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (aVar2.f19564e.f19614a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.i(layoutParamsGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).r(constraintLayout);
            }
        }
    }

    public int t0(int i10) {
        return i0(i10).f19562c.f19684c;
    }

    public void t1(int i10, float f10) {
        i0(i10).f19565f.f19705g = f10;
    }

    public void u(int i10, ConstraintLayout.LayoutParams layoutParams) {
        a aVar;
        if (!this.f19559g.containsKey(Integer.valueOf(i10)) || (aVar = this.f19559g.get(Integer.valueOf(i10))) == null) {
            return;
        }
        aVar.i(layoutParams);
    }

    public int u0(int i10) {
        return i0(i10).f19564e.f19620d;
    }

    public void u1(int i10, float f10) {
        i0(i10).f19565f.f19706h = f10;
    }

    public void v(ConstraintLayout constraintLayout) {
        t(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public boolean v0() {
        return this.f19558f;
    }

    public void v1(int i10, float f10, float f11) {
        e eVar = i0(i10).f19565f;
        eVar.f19708j = f10;
        eVar.f19709k = f11;
    }

    public void w0(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarH0 = h0(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarH0.f19564e.f19614a = true;
                    }
                    this.f19559g.put(Integer.valueOf(aVarH0.f19560a), aVarH0);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public void w1(int i10, float f10) {
        i0(i10).f19565f.f19708j = f10;
    }

    public void x(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        if (i13 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f10 <= 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i12 == 1 || i12 == 2) {
            L(i10, 1, i11, i12, i13);
            L(i10, 2, i14, i15, i16);
            a aVar = this.f19559g.get(Integer.valueOf(i10));
            if (aVar != null) {
                aVar.f19564e.f19653x = f10;
                return;
            }
            return;
        }
        if (i12 == 6 || i12 == 7) {
            L(i10, 6, i11, i12, i13);
            L(i10, 7, i14, i15, i16);
            a aVar2 = this.f19559g.get(Integer.valueOf(i10));
            if (aVar2 != null) {
                aVar2.f19564e.f19653x = f10;
                return;
            }
            return;
        }
        L(i10, 3, i11, i12, i13);
        L(i10, 4, i14, i15, i16);
        a aVar3 = this.f19559g.get(Integer.valueOf(i10));
        if (aVar3 != null) {
            aVar3.f19564e.f19654y = f10;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void x0(Context context, XmlPullParser xmlPullParser) {
        a aVarH0;
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    switch (xmlPullParser.getName()) {
                        case "Constraint":
                            aVarH0 = h0(context, Xml.asAttributeSet(xmlPullParser), false);
                            break;
                        case "ConstraintOverride":
                            aVarH0 = h0(context, Xml.asAttributeSet(xmlPullParser), true);
                            break;
                        case "Guideline":
                            aVarH0 = h0(context, Xml.asAttributeSet(xmlPullParser), false);
                            b bVar = aVarH0.f19564e;
                            bVar.f19614a = true;
                            bVar.f19616b = true;
                            break;
                        case "Barrier":
                            aVarH0 = h0(context, Xml.asAttributeSet(xmlPullParser), false);
                            aVarH0.f19564e.f19631i0 = 1;
                            break;
                        case "PropertySet":
                            if (aVar == null) {
                                throw new RuntimeException(f19499i + xmlPullParser.getLineNumber());
                            }
                            aVar.f19562c.b(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Transform":
                            if (aVar == null) {
                                throw new RuntimeException(f19499i + xmlPullParser.getLineNumber());
                            }
                            aVar.f19565f.b(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Layout":
                            if (aVar == null) {
                                throw new RuntimeException(f19499i + xmlPullParser.getLineNumber());
                            }
                            aVar.f19564e.c(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Motion":
                            if (aVar == null) {
                                throw new RuntimeException(f19499i + xmlPullParser.getLineNumber());
                            }
                            aVar.f19563d.b(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (aVar == null) {
                                throw new RuntimeException(f19499i + xmlPullParser.getLineNumber());
                            }
                            ConstraintAttribute.j(context, xmlPullParser, aVar.f19566g);
                            continue;
                            break;
                            break;
                        default:
                            continue;
                            break;
                    }
                    aVar = aVarH0;
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r4 == 0) {
                        return;
                    }
                    if (r4 == 1 || r4 == 2 || r4 == 3) {
                        this.f19559g.put(Integer.valueOf(aVar.f19560a), aVar);
                        aVar = null;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public void x1(int i10, float f10) {
        i0(i10).f19565f.f19709k = f10;
    }

    public void y(int i10, int i11) {
        if (i11 == 0) {
            x(i10, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            x(i10, i11, 2, 0, i11, 1, 0, 0.5f);
        }
    }

    public void y1(int i10, float f10) {
        i0(i10).f19565f.f19710l = f10;
    }

    public void z(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        L(i10, 1, i11, i12, i13);
        L(i10, 2, i14, i15, i16);
        a aVar = this.f19559g.get(Integer.valueOf(i10));
        if (aVar != null) {
            aVar.f19564e.f19653x = f10;
        }
    }

    public void z0(a aVar, String str) {
        String[] strArrSplit = str.split(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (strArrSplit2.length != 2) {
                Log.w(f19496h, " Unable to parse " + strArrSplit[i10]);
            } else {
                aVar.p(strArrSplit2[0], Color.parseColor(strArrSplit2[1]));
            }
        }
    }

    public void z1(boolean z10) {
        this.f19553a = z10;
    }
}
