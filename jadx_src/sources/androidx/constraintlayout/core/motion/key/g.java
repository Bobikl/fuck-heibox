package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.o;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: MotionKeyTrigger.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends b {
    private static final String S = "KeyTrigger";
    public static final String T = "viewTransitionOnCross";
    public static final String U = "viewTransitionOnPositiveCross";
    public static final String V = "viewTransitionOnNegativeCross";
    public static final String W = "postLayout";
    public static final String X = "triggerSlack";
    public static final String Y = "triggerCollisionView";
    public static final String Z = "triggerCollisionId";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f17584a0 = "triggerID";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f17585b0 = "positiveCross";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f17586c0 = "negativeCross";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f17587d0 = "triggerReceiver";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f17588e0 = "CROSS";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f17589f0 = 301;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f17590g0 = 302;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f17591h0 = 303;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f17592i0 = 304;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f17593j0 = 305;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f17594k0 = 306;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f17595l0 = 307;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f17596m0 = 308;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f17597n0 = 309;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f17598o0 = 310;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f17599p0 = 311;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f17600q0 = 312;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f17601r0 = 5;
    private int A;
    private String B;
    private String C;
    private int D;
    private int E;
    float F;
    private boolean G;
    private boolean H;
    private boolean I;
    private float J;
    private float K;
    private boolean L;
    int M;
    int N;
    int O;
    androidx.constraintlayout.core.motion.utils.e P;
    androidx.constraintlayout.core.motion.utils.e Q;
    HashMap<String, Method> R;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f17602y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f17603z = null;

    public g() {
        int i10 = b.f17554m;
        this.A = i10;
        this.B = null;
        this.C = null;
        this.D = i10;
        this.E = i10;
        this.F = 0.1f;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = Float.NaN;
        this.L = false;
        this.M = i10;
        this.N = i10;
        this.O = i10;
        this.P = new androidx.constraintlayout.core.motion.utils.e();
        this.Q = new androidx.constraintlayout.core.motion.utils.e();
        this.R = new HashMap<>();
        this.f17569k = 5;
        this.f17570l = new HashMap<>();
    }

    private void x(String str, androidx.constraintlayout.core.motion.e eVar) {
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f17570l.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                androidx.constraintlayout.core.motion.a aVar = this.f17570l.get(str2);
                if (aVar != null) {
                    aVar.a(eVar);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean a(int i10, int i11) {
        if (i10 == 307) {
            this.E = i11;
            return true;
        }
        if (i10 == 308) {
            this.D = u(Integer.valueOf(i11));
            return true;
        }
        if (i10 == 311) {
            this.A = i11;
            return true;
        }
        switch (i10) {
            case 301:
                this.O = i11;
                return true;
            case 302:
                this.N = i11;
                return true;
            case 303:
                this.M = i11;
                return true;
            default:
                return super.a(i10, i11);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i10, float f10) {
        if (i10 != 305) {
            return super.b(i10, f10);
        }
        this.F = f10;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i10, boolean z10) {
        if (i10 != 304) {
            return super.c(i10, z10);
        }
        this.L = z10;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean d(int i10, String str) {
        if (i10 == 309) {
            this.C = str;
            return true;
        }
        if (i10 == 310) {
            this.B = str;
            return true;
        }
        if (i10 != 312) {
            return super.d(i10, str);
        }
        this.f17603z = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public int e(String str) {
        str.hashCode();
        switch (str) {
            case "positiveCross":
                return 309;
            case "viewTransitionOnPositiveCross":
                return 302;
            case "triggerCollisionId":
                return 307;
            case "triggerID":
                return 308;
            case "negativeCross":
                return 310;
            case "triggerCollisionView":
                return 306;
            case "viewTransitionOnNegativeCross":
                return 303;
            case "triggerSlack":
                return 305;
            case "viewTransitionOnCross":
                return 301;
            case "postLayout":
                return 304;
            case "triggerReceiver":
                return 311;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, o> map) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return new g().h(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
    }

    public void v(float f10, androidx.constraintlayout.core.motion.e eVar) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public g h(b bVar) {
        super.h(bVar);
        g gVar = (g) bVar;
        this.f17602y = gVar.f17602y;
        this.f17603z = gVar.f17603z;
        this.A = gVar.A;
        this.B = gVar.B;
        this.C = gVar.C;
        this.D = gVar.D;
        this.E = gVar.E;
        this.F = gVar.F;
        this.G = gVar.G;
        this.H = gVar.H;
        this.I = gVar.I;
        this.J = gVar.J;
        this.K = gVar.K;
        this.L = gVar.L;
        this.P = gVar.P;
        this.Q = gVar.Q;
        this.R = gVar.R;
        return this;
    }
}
