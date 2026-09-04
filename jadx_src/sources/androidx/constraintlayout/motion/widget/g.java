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

/* JADX INFO: compiled from: KeyAttributes.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends f {
    static final String U = "KeyAttribute";
    private static final String V = "KeyAttributes";
    private static final boolean W = false;
    public static final int X = 1;
    private String D;
    private int E = -1;
    private boolean F = false;
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
    private float R = Float.NaN;
    private float S = Float.NaN;
    private float T = Float.NaN;

    /* JADX INFO: compiled from: KeyAttributes.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f18744a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f18745b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f18746c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f18747d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f18748e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f18749f = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f18750g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f18751h = 9;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f18752i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f18753j = 12;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f18754k = 13;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f18755l = 14;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f18756m = 15;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f18757n = 16;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f18758o = 17;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f18759p = 18;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f18760q = 19;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final int f18761r = 20;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static SparseIntArray f18762s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f18762s = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyAttribute_android_alpha, 1);
            f18762s.append(R.styleable.KeyAttribute_android_elevation, 2);
            f18762s.append(R.styleable.KeyAttribute_android_rotation, 4);
            f18762s.append(R.styleable.KeyAttribute_android_rotationX, 5);
            f18762s.append(R.styleable.KeyAttribute_android_rotationY, 6);
            f18762s.append(R.styleable.KeyAttribute_android_transformPivotX, 19);
            f18762s.append(R.styleable.KeyAttribute_android_transformPivotY, 20);
            f18762s.append(R.styleable.KeyAttribute_android_scaleX, 7);
            f18762s.append(R.styleable.KeyAttribute_transitionPathRotate, 8);
            f18762s.append(R.styleable.KeyAttribute_transitionEasing, 9);
            f18762s.append(R.styleable.KeyAttribute_motionTarget, 10);
            f18762s.append(R.styleable.KeyAttribute_framePosition, 12);
            f18762s.append(R.styleable.KeyAttribute_curveFit, 13);
            f18762s.append(R.styleable.KeyAttribute_android_scaleY, 14);
            f18762s.append(R.styleable.KeyAttribute_android_translationX, 15);
            f18762s.append(R.styleable.KeyAttribute_android_translationY, 16);
            f18762s.append(R.styleable.KeyAttribute_android_translationZ, 17);
            f18762s.append(R.styleable.KeyAttribute_motionProgress, 18);
        }

        private a() {
        }

        public static void a(g gVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f18762s.get(index)) {
                    case 1:
                        gVar.G = typedArray.getFloat(index, gVar.G);
                        break;
                    case 2:
                        gVar.H = typedArray.getDimension(index, gVar.H);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e(g.U, "unused attribute 0x" + Integer.toHexString(index) + "   " + f18762s.get(index));
                        break;
                    case 4:
                        gVar.I = typedArray.getFloat(index, gVar.I);
                        break;
                    case 5:
                        gVar.J = typedArray.getFloat(index, gVar.J);
                        break;
                    case 6:
                        gVar.K = typedArray.getFloat(index, gVar.K);
                        break;
                    case 7:
                        gVar.O = typedArray.getFloat(index, gVar.O);
                        break;
                    case 8:
                        gVar.N = typedArray.getFloat(index, gVar.N);
                        break;
                    case 9:
                        gVar.D = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.U4) {
                            int resourceId = typedArray.getResourceId(index, gVar.f18740b);
                            gVar.f18740b = resourceId;
                            if (resourceId == -1) {
                                gVar.f18741c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            gVar.f18741c = typedArray.getString(index);
                        } else {
                            gVar.f18740b = typedArray.getResourceId(index, gVar.f18740b);
                        }
                        break;
                    case 12:
                        gVar.f18739a = typedArray.getInt(index, gVar.f18739a);
                        break;
                    case 13:
                        gVar.E = typedArray.getInteger(index, gVar.E);
                        break;
                    case 14:
                        gVar.P = typedArray.getFloat(index, gVar.P);
                        break;
                    case 15:
                        gVar.Q = typedArray.getDimension(index, gVar.Q);
                        break;
                    case 16:
                        gVar.R = typedArray.getDimension(index, gVar.R);
                        break;
                    case 17:
                        gVar.S = typedArray.getDimension(index, gVar.S);
                        break;
                    case 18:
                        gVar.T = typedArray.getFloat(index, gVar.T);
                        break;
                    case 19:
                        gVar.L = typedArray.getDimension(index, gVar.L);
                        break;
                    case 20:
                        gVar.M = typedArray.getDimension(index, gVar.M);
                        break;
                }
            }
        }
    }

    public g() {
        this.f18742d = 1;
        this.f18743e = new HashMap<>();
    }

    int T() {
        return this.E;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.c> map) {
        for (String str : map.keySet()) {
            androidx.constraintlayout.motion.utils.c cVar = map.get(str);
            if (cVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.J)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.J);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.K);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.Q)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.Q);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.R)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.R);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.S)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.S);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.T)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.T);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.O)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.O);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.P)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.P);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.J)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.L);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.M);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.I)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.I);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.H)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.H);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.N)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.N);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.G)) {
                                break;
                            } else {
                                cVar.g(this.f18739a, this.G);
                                break;
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f18743e.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((androidx.constraintlayout.motion.utils.c.b) cVar).n(this.f18739a, constraintAttribute);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        return new g().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        g gVar = (g) fVar;
        this.E = gVar.E;
        this.F = gVar.F;
        this.G = gVar.G;
        this.H = gVar.H;
        this.I = gVar.I;
        this.J = gVar.J;
        this.K = gVar.K;
        this.L = gVar.L;
        this.M = gVar.M;
        this.N = gVar.N;
        this.O = gVar.O;
        this.P = gVar.P;
        this.Q = gVar.Q;
        this.R = gVar.R;
        this.S = gVar.S;
        this.T = gVar.T;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add(f.f18721i);
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add(f.f18724l);
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add(f.f18725m);
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.R)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.S)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.T)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, R.styleable.G));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void i(HashMap<String, Integer> map) {
        if (this.E == -1) {
            return;
        }
        if (!Float.isNaN(this.G)) {
            map.put("alpha", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.H)) {
            map.put("elevation", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.I)) {
            map.put(f.f18721i, Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.J)) {
            map.put("rotationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.K)) {
            map.put("rotationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.L)) {
            map.put(f.f18724l, Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.M)) {
            map.put(f.f18725m, Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.Q)) {
            map.put("translationX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.R)) {
            map.put("translationY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.S)) {
            map.put("translationZ", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.N)) {
            map.put("transitionPathRotate", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.O)) {
            map.put("scaleX", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.P)) {
            map.put("scaleY", Integer.valueOf(this.E));
        }
        if (!Float.isNaN(this.T)) {
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
                this.T = m(obj);
                break;
            case "transitionEasing":
                this.D = obj.toString();
                break;
            case "rotationX":
                this.J = m(obj);
                break;
            case "rotationY":
                this.K = m(obj);
                break;
            case "translationX":
                this.Q = m(obj);
                break;
            case "translationY":
                this.R = m(obj);
                break;
            case "translationZ":
                this.S = m(obj);
                break;
            case "scaleX":
                this.O = m(obj);
                break;
            case "scaleY":
                this.P = m(obj);
                break;
            case "transformPivotX":
                this.L = m(obj);
                break;
            case "transformPivotY":
                this.M = m(obj);
                break;
            case "rotation":
                this.I = m(obj);
                break;
            case "elevation":
                this.H = m(obj);
                break;
            case "transitionPathRotate":
                this.N = m(obj);
                break;
            case "alpha":
                this.G = m(obj);
                break;
            case "curveFit":
                this.E = n(obj);
                break;
            case "visibility":
                this.F = l(obj);
                break;
        }
    }
}
