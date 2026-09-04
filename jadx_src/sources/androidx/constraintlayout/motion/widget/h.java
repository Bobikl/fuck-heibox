package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: KeyCycle.java */
/* JADX INFO: loaded from: classes.dex */
public class h extends f {
    private static final String X = "KeyCycle";
    static final String Y = "KeyCycle";
    public static final String Z = "wavePeriod";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f18763a0 = "waveOffset";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f18764b0 = "wavePhase";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f18765c0 = "waveShape";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f18766d0 = 0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f18767e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f18768f0 = 2;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f18769g0 = 3;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f18770h0 = 4;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f18771i0 = 5;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f18772j0 = 6;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f18773k0 = 4;
    private String D = null;
    private int E = 0;
    private int F = -1;
    private String G = null;
    private float H = Float.NaN;
    private float I = 0.0f;
    private float J = 0.0f;
    private float K = Float.NaN;
    private int L = -1;
    private float M = Float.NaN;
    private float N = Float.NaN;
    private float O = Float.NaN;
    private float P = Float.NaN;
    private float Q = Float.NaN;
    private float R = Float.NaN;
    private float S = Float.NaN;
    private float T = Float.NaN;
    private float U = Float.NaN;
    private float V = Float.NaN;
    private float W = Float.NaN;

    /* JADX INFO: compiled from: KeyCycle.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f18774a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f18775b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f18776c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f18777d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f18778e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f18779f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f18780g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f18781h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f18782i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f18783j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f18784k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f18785l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f18786m = 13;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f18787n = 14;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f18788o = 15;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f18789p = 16;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f18790q = 17;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final int f18791r = 18;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final int f18792s = 19;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f18793t = 20;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final int f18794u = 21;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static SparseIntArray f18795v;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f18795v = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
            f18795v.append(R.styleable.KeyCycle_framePosition, 2);
            f18795v.append(R.styleable.KeyCycle_transitionEasing, 3);
            f18795v.append(R.styleable.KeyCycle_curveFit, 4);
            f18795v.append(R.styleable.KeyCycle_waveShape, 5);
            f18795v.append(R.styleable.KeyCycle_wavePeriod, 6);
            f18795v.append(R.styleable.KeyCycle_waveOffset, 7);
            f18795v.append(R.styleable.KeyCycle_waveVariesBy, 8);
            f18795v.append(R.styleable.KeyCycle_android_alpha, 9);
            f18795v.append(R.styleable.KeyCycle_android_elevation, 10);
            f18795v.append(R.styleable.KeyCycle_android_rotation, 11);
            f18795v.append(R.styleable.KeyCycle_android_rotationX, 12);
            f18795v.append(R.styleable.KeyCycle_android_rotationY, 13);
            f18795v.append(R.styleable.KeyCycle_transitionPathRotate, 14);
            f18795v.append(R.styleable.KeyCycle_android_scaleX, 15);
            f18795v.append(R.styleable.KeyCycle_android_scaleY, 16);
            f18795v.append(R.styleable.KeyCycle_android_translationX, 17);
            f18795v.append(R.styleable.KeyCycle_android_translationY, 18);
            f18795v.append(R.styleable.KeyCycle_android_translationZ, 19);
            f18795v.append(R.styleable.KeyCycle_motionProgress, 20);
            f18795v.append(R.styleable.KeyCycle_wavePhase, 21);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f18795v.get(index)) {
                    case 1:
                        if (MotionLayout.U4) {
                            int resourceId = typedArray.getResourceId(index, hVar.f18740b);
                            hVar.f18740b = resourceId;
                            if (resourceId == -1) {
                                hVar.f18741c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            hVar.f18741c = typedArray.getString(index);
                        } else {
                            hVar.f18740b = typedArray.getResourceId(index, hVar.f18740b);
                        }
                        break;
                    case 2:
                        hVar.f18739a = typedArray.getInt(index, hVar.f18739a);
                        break;
                    case 3:
                        hVar.D = typedArray.getString(index);
                        break;
                    case 4:
                        hVar.E = typedArray.getInteger(index, hVar.E);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            hVar.G = typedArray.getString(index);
                            hVar.F = 7;
                        } else {
                            hVar.F = typedArray.getInt(index, hVar.F);
                        }
                        break;
                    case 6:
                        hVar.H = typedArray.getFloat(index, hVar.H);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            hVar.I = typedArray.getDimension(index, hVar.I);
                        } else {
                            hVar.I = typedArray.getFloat(index, hVar.I);
                        }
                        break;
                    case 8:
                        hVar.L = typedArray.getInt(index, hVar.L);
                        break;
                    case 9:
                        hVar.M = typedArray.getFloat(index, hVar.M);
                        break;
                    case 10:
                        hVar.N = typedArray.getDimension(index, hVar.N);
                        break;
                    case 11:
                        hVar.O = typedArray.getFloat(index, hVar.O);
                        break;
                    case 12:
                        hVar.Q = typedArray.getFloat(index, hVar.Q);
                        break;
                    case 13:
                        hVar.R = typedArray.getFloat(index, hVar.R);
                        break;
                    case 14:
                        hVar.P = typedArray.getFloat(index, hVar.P);
                        break;
                    case 15:
                        hVar.S = typedArray.getFloat(index, hVar.S);
                        break;
                    case 16:
                        hVar.T = typedArray.getFloat(index, hVar.T);
                        break;
                    case 17:
                        hVar.U = typedArray.getDimension(index, hVar.U);
                        break;
                    case 18:
                        hVar.V = typedArray.getDimension(index, hVar.V);
                        break;
                    case 19:
                        hVar.W = typedArray.getDimension(index, hVar.W);
                        break;
                    case 20:
                        hVar.K = typedArray.getFloat(index, hVar.K);
                        break;
                    case 21:
                        hVar.J = typedArray.getFloat(index, hVar.J) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f18795v.get(index));
                        break;
                }
            }
        }
    }

    public h() {
        this.f18742d = 4;
        this.f18743e = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.c> map) {
        c.n("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            androidx.constraintlayout.motion.utils.c cVar = map.get(str);
            if (cVar != null) {
                str.hashCode();
                switch (str) {
                    case "rotationX":
                        cVar.g(this.f18739a, this.Q);
                        break;
                    case "rotationY":
                        cVar.g(this.f18739a, this.R);
                        break;
                    case "translationX":
                        cVar.g(this.f18739a, this.U);
                        break;
                    case "translationY":
                        cVar.g(this.f18739a, this.V);
                        break;
                    case "translationZ":
                        cVar.g(this.f18739a, this.W);
                        break;
                    case "progress":
                        cVar.g(this.f18739a, this.K);
                        break;
                    case "scaleX":
                        cVar.g(this.f18739a, this.S);
                        break;
                    case "scaleY":
                        cVar.g(this.f18739a, this.T);
                        break;
                    case "rotation":
                        cVar.g(this.f18739a, this.O);
                        break;
                    case "elevation":
                        cVar.g(this.f18739a, this.N);
                        break;
                    case "transitionPathRotate":
                        cVar.g(this.f18739a, this.P);
                        break;
                    case "alpha":
                        cVar.g(this.f18739a, this.M);
                        break;
                    case "waveOffset":
                        cVar.g(this.f18739a, this.I);
                        break;
                    case "wavePhase":
                        cVar.g(this.f18739a, this.J);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        }
                        break;
                }
            }
        }
    }

    public void a0(HashMap<String, androidx.constraintlayout.motion.utils.b> map) {
        androidx.constraintlayout.motion.utils.b bVar;
        androidx.constraintlayout.motion.utils.b bVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.f18743e.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.e() == ConstraintAttribute.AttributeType.FLOAT_TYPE && (bVar = map.get(str)) != null) {
                    bVar.g(this.f18739a, this.F, this.G, this.L, this.H, this.I, this.J, constraintAttribute.f(), constraintAttribute);
                }
            } else {
                float fB0 = b0(str);
                if (!Float.isNaN(fB0) && (bVar2 = map.get(str)) != null) {
                    bVar2.f(this.f18739a, this.F, this.G, this.L, this.H, this.I, this.J, fB0);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        return new h().c(this);
    }

    public float b0(String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return this.Q;
            case "rotationY":
                return this.R;
            case "translationX":
                return this.U;
            case "translationY":
                return this.V;
            case "translationZ":
                return this.W;
            case "progress":
                return this.K;
            case "scaleX":
                return this.S;
            case "scaleY":
                return this.T;
            case "rotation":
                return this.O;
            case "elevation":
                return this.N;
            case "transitionPathRotate":
                return this.P;
            case "alpha":
                return this.M;
            case "waveOffset":
                return this.I;
            case "wavePhase":
                return this.J;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        h hVar = (h) fVar;
        this.D = hVar.D;
        this.E = hVar.E;
        this.F = hVar.F;
        this.G = hVar.G;
        this.H = hVar.H;
        this.I = hVar.I;
        this.J = hVar.J;
        this.K = hVar.K;
        this.L = hVar.L;
        this.M = hVar.M;
        this.N = hVar.N;
        this.O = hVar.O;
        this.P = hVar.P;
        this.Q = hVar.Q;
        this.R = hVar.R;
        this.S = hVar.S;
        this.T = hVar.T;
        this.U = hVar.U;
        this.V = hVar.V;
        this.W = hVar.W;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.M)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add(f.f18721i);
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.R)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.S)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.T)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.U)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.V)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.W)) {
            hashSet.add("translationZ");
        }
        if (this.f18743e.size() > 0) {
            Iterator<String> it = this.f18743e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, R.styleable.H));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "motionProgress":
                this.K = m(obj);
                break;
            case "transitionEasing":
                this.D = obj.toString();
                break;
            case "rotationX":
                this.Q = m(obj);
                break;
            case "rotationY":
                this.R = m(obj);
                break;
            case "translationX":
                this.U = m(obj);
                break;
            case "translationY":
                this.V = m(obj);
                break;
            case "translationZ":
                this.W = m(obj);
                break;
            case "scaleX":
                this.S = m(obj);
                break;
            case "scaleY":
                this.T = m(obj);
                break;
            case "rotation":
                this.O = m(obj);
                break;
            case "elevation":
                this.N = m(obj);
                break;
            case "transitionPathRotate":
                this.P = m(obj);
                break;
            case "alpha":
                this.M = m(obj);
                break;
            case "waveOffset":
                this.I = m(obj);
                break;
            case "wavePeriod":
                this.H = m(obj);
                break;
            case "curveFit":
                this.E = n(obj);
                break;
            case "wavePhase":
                this.J = m(obj);
                break;
            case "waveShape":
                if (!(obj instanceof Integer)) {
                    this.F = 7;
                    this.G = obj.toString();
                    break;
                } else {
                    this.F = n(obj);
                    break;
                }
                break;
        }
    }
}
