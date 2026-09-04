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

/* JADX INFO: compiled from: KeyTimeCycle.java */
/* JADX INFO: loaded from: classes.dex */
public class l extends f {
    static final String V = "KeyTimeCycle";
    private static final String W = "KeyTimeCycle";
    public static final String X = "wavePeriod";
    public static final String Y = "waveOffset";
    public static final String Z = "waveShape";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f18819a0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f18820b0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f18821c0 = 2;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f18822d0 = 3;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f18823e0 = 4;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f18824f0 = 5;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f18825g0 = 6;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f18826h0 = 3;
    private String D;
    private int E = -1;
    private float F = Float.NaN;
    private float G = Float.NaN;
    private float H = Float.NaN;
    private float I = Float.NaN;
    private float J = Float.NaN;
    private float K = Float.NaN;
    private float L = Float.NaN;
    private float M = Float.NaN;
    private float N = Float.NaN;
    private float O = Float.NaN;
    private float P = Float.NaN;
    private float Q = Float.NaN;
    private int R = 0;
    private String S = null;
    private float T = Float.NaN;
    private float U = 0.0f;

    /* JADX INFO: compiled from: KeyTimeCycle.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f18827a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f18828b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f18829c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f18830d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f18831e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f18832f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f18833g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f18834h = 9;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f18835i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f18836j = 12;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f18837k = 13;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f18838l = 14;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f18839m = 15;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f18840n = 16;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f18841o = 17;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f18842p = 18;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f18843q = 19;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final int f18844r = 20;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final int f18845s = 21;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static SparseIntArray f18846t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f18846t = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_alpha, 1);
            f18846t.append(R.styleable.KeyTimeCycle_android_elevation, 2);
            f18846t.append(R.styleable.KeyTimeCycle_android_rotation, 4);
            f18846t.append(R.styleable.KeyTimeCycle_android_rotationX, 5);
            f18846t.append(R.styleable.KeyTimeCycle_android_rotationY, 6);
            f18846t.append(R.styleable.KeyTimeCycle_android_scaleX, 7);
            f18846t.append(R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            f18846t.append(R.styleable.KeyTimeCycle_transitionEasing, 9);
            f18846t.append(R.styleable.KeyTimeCycle_motionTarget, 10);
            f18846t.append(R.styleable.KeyTimeCycle_framePosition, 12);
            f18846t.append(R.styleable.KeyTimeCycle_curveFit, 13);
            f18846t.append(R.styleable.KeyTimeCycle_android_scaleY, 14);
            f18846t.append(R.styleable.KeyTimeCycle_android_translationX, 15);
            f18846t.append(R.styleable.KeyTimeCycle_android_translationY, 16);
            f18846t.append(R.styleable.KeyTimeCycle_android_translationZ, 17);
            f18846t.append(R.styleable.KeyTimeCycle_motionProgress, 18);
            f18846t.append(R.styleable.KeyTimeCycle_wavePeriod, 20);
            f18846t.append(R.styleable.KeyTimeCycle_waveOffset, 21);
            f18846t.append(R.styleable.KeyTimeCycle_waveShape, 19);
        }

        private a() {
        }

        public static void a(l lVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f18846t.get(index)) {
                    case 1:
                        lVar.F = typedArray.getFloat(index, lVar.F);
                        break;
                    case 2:
                        lVar.G = typedArray.getDimension(index, lVar.G);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f18846t.get(index));
                        break;
                    case 4:
                        lVar.H = typedArray.getFloat(index, lVar.H);
                        break;
                    case 5:
                        lVar.I = typedArray.getFloat(index, lVar.I);
                        break;
                    case 6:
                        lVar.J = typedArray.getFloat(index, lVar.J);
                        break;
                    case 7:
                        lVar.L = typedArray.getFloat(index, lVar.L);
                        break;
                    case 8:
                        lVar.K = typedArray.getFloat(index, lVar.K);
                        break;
                    case 9:
                        lVar.D = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.U4) {
                            int resourceId = typedArray.getResourceId(index, lVar.f18740b);
                            lVar.f18740b = resourceId;
                            if (resourceId == -1) {
                                lVar.f18741c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            lVar.f18741c = typedArray.getString(index);
                        } else {
                            lVar.f18740b = typedArray.getResourceId(index, lVar.f18740b);
                        }
                        break;
                    case 12:
                        lVar.f18739a = typedArray.getInt(index, lVar.f18739a);
                        break;
                    case 13:
                        lVar.E = typedArray.getInteger(index, lVar.E);
                        break;
                    case 14:
                        lVar.M = typedArray.getFloat(index, lVar.M);
                        break;
                    case 15:
                        lVar.N = typedArray.getDimension(index, lVar.N);
                        break;
                    case 16:
                        lVar.O = typedArray.getDimension(index, lVar.O);
                        break;
                    case 17:
                        lVar.P = typedArray.getDimension(index, lVar.P);
                        break;
                    case 18:
                        lVar.Q = typedArray.getFloat(index, lVar.Q);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            lVar.S = typedArray.getString(index);
                            lVar.R = 7;
                        } else {
                            lVar.R = typedArray.getInt(index, lVar.R);
                        }
                        break;
                    case 20:
                        lVar.T = typedArray.getFloat(index, lVar.T);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            lVar.U = typedArray.getDimension(index, lVar.U);
                        } else {
                            lVar.U = typedArray.getFloat(index, lVar.U);
                        }
                        break;
                }
            }
        }
    }

    public l() {
        this.f18742d = 3;
        this.f18743e = new HashMap<>();
    }

    public void W(HashMap<String, androidx.constraintlayout.motion.utils.e> map) {
        for (String str : map.keySet()) {
            androidx.constraintlayout.motion.utils.e eVar = map.get(str);
            if (eVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.I)) {
                                break;
                            } else {
                                eVar.c(this.f18739a, this.I, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.J)) {
                                break;
                            } else {
                                eVar.c(this.f18739a, this.J, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.N)) {
                                break;
                            } else {
                                eVar.c(this.f18739a, this.N, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.O)) {
                                break;
                            } else {
                                eVar.c(this.f18739a, this.O, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.P)) {
                                break;
                            } else {
                                eVar.c(this.f18739a, this.P, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.Q)) {
                                break;
                            } else {
                                eVar.c(this.f18739a, this.Q, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.L)) {
                                break;
                            } else {
                                eVar.c(this.f18739a, this.L, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.M)) {
                                break;
                            } else {
                                eVar.c(this.f18739a, this.M, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.H)) {
                                break;
                            } else {
                                eVar.c(this.f18739a, this.H, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.G)) {
                                break;
                            } else {
                                eVar.c(this.f18739a, this.G, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                eVar.c(this.f18739a, this.K, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.F)) {
                                break;
                            } else {
                                eVar.c(this.f18739a, this.F, this.T, this.R, this.U);
                                break;
                            }
                            break;
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f18743e.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((androidx.constraintlayout.motion.utils.e.b) eVar).k(this.f18739a, constraintAttribute, this.T, this.R, this.U);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.c> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        return new l().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        l lVar = (l) fVar;
        this.D = lVar.D;
        this.E = lVar.E;
        this.R = lVar.R;
        this.T = lVar.T;
        this.U = lVar.U;
        this.Q = lVar.Q;
        this.F = lVar.F;
        this.G = lVar.G;
        this.H = lVar.H;
        this.K = lVar.K;
        this.I = lVar.I;
        this.J = lVar.J;
        this.L = lVar.L;
        this.M = lVar.M;
        this.N = lVar.N;
        this.O = lVar.O;
        this.P = lVar.P;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.F)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add(f.f18721i);
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("progress");
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
        a.a(this, context.obtainStyledAttributes(attributeSet, R.styleable.M));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void i(HashMap<String, Integer> map) {
        if (this.E == -1) {
            return;
        }
        if (!Float.isNaN(this.F)) {
            map.put("alpha", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.G)) {
            map.put("elevation", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.H)) {
            map.put(f.f18721i, Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.I)) {
            map.put("rotationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.J)) {
            map.put("rotationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.N)) {
            map.put("translationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.O)) {
            map.put("translationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.P)) {
            map.put("translationZ", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.K)) {
            map.put("transitionPathRotate", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.L)) {
            map.put("scaleX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.L)) {
            map.put("scaleY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.Q)) {
            map.put("progress", Integer.valueOf(this.E));
        }
        if (this.f18743e.size() > 0) {
            Iterator<String> it = this.f18743e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.E));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "motionProgress":
                this.Q = m(obj);
                break;
            case "transitionEasing":
                this.D = obj.toString();
                break;
            case "rotationX":
                this.I = m(obj);
                break;
            case "rotationY":
                this.J = m(obj);
                break;
            case "translationX":
                this.N = m(obj);
                break;
            case "translationY":
                this.O = m(obj);
                break;
            case "translationZ":
                this.P = m(obj);
                break;
            case "scaleX":
                this.L = m(obj);
                break;
            case "scaleY":
                this.M = m(obj);
                break;
            case "rotation":
                this.H = m(obj);
                break;
            case "elevation":
                this.G = m(obj);
                break;
            case "transitionPathRotate":
                this.K = m(obj);
                break;
            case "alpha":
                this.F = m(obj);
                break;
            case "waveOffset":
                this.U = m(obj);
                break;
            case "wavePeriod":
                this.T = m(obj);
                break;
            case "curveFit":
                this.E = n(obj);
                break;
            case "waveShape":
                if (!(obj instanceof Integer)) {
                    this.R = 7;
                    this.S = obj.toString();
                    break;
                } else {
                    this.R = n(obj);
                    break;
                }
                break;
        }
    }
}
