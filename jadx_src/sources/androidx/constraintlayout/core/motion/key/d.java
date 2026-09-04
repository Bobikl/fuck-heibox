package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.e0;
import androidx.constraintlayout.core.motion.utils.h;
import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: MotionKeyCycle.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends b {
    private static final String R = "KeyCycle";
    static final String S = "KeyCycle";
    public static final String T = "wavePeriod";
    public static final String U = "waveOffset";
    public static final String V = "wavePhase";
    public static final String W = "waveShape";
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f17573a0 = 3;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f17574b0 = 4;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f17575c0 = 5;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f17576d0 = 6;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f17577e0 = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f17578y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f17579z = 0;
    private int A = -1;
    private String B = null;
    private float C = Float.NaN;
    private float D = 0.0f;
    private float E = 0.0f;
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

    public d() {
        this.f17569k = 4;
        this.f17570l = new HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean a(int i10, int i11) {
        if (i10 == 401) {
            this.f17579z = i11;
            return true;
        }
        if (i10 == 421) {
            this.A = i11;
            return true;
        }
        if (b(i10, i11)) {
            return true;
        }
        return super.a(i10, i11);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i10, float f10) {
        if (i10 == 315) {
            this.F = f10;
            return true;
        }
        if (i10 == 403) {
            this.G = f10;
            return true;
        }
        if (i10 == 416) {
            this.J = f10;
            return true;
        }
        switch (i10) {
            case 304:
                this.O = f10;
                return true;
            case 305:
                this.P = f10;
                return true;
            case 306:
                this.Q = f10;
                return true;
            case 307:
                this.H = f10;
                return true;
            case 308:
                this.K = f10;
                return true;
            case 309:
                this.L = f10;
                return true;
            case 310:
                this.I = f10;
                return true;
            case 311:
                this.M = f10;
                return true;
            case 312:
                this.N = f10;
                return true;
            default:
                switch (i10) {
                    case 423:
                        this.C = f10;
                        return true;
                    case 424:
                        this.D = f10;
                        return true;
                    case 425:
                        this.E = f10;
                        return true;
                    default:
                        return super.b(i10, f10);
                }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean d(int i10, String str) {
        if (i10 == 420) {
            this.f17578y = str;
            return true;
        }
        if (i10 != 422) {
            return super.d(i10, str);
        }
        this.B = str;
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.core.motion.utils.w
    public int e(String str) {
        byte b10;
        str.hashCode();
        switch (str.hashCode()) {
            case -1581616630:
                b10 = !str.equals(w.c.P) ? (byte) -1 : (byte) 0;
                break;
            case -1310311125:
                b10 = !str.equals("easing") ? (byte) -1 : (byte) 1;
                break;
            case -1249320806:
                b10 = !str.equals("rotationX") ? (byte) -1 : (byte) 2;
                break;
            case -1249320805:
                b10 = !str.equals("rotationY") ? (byte) -1 : (byte) 3;
                break;
            case -1249320804:
                b10 = !str.equals("rotationZ") ? (byte) -1 : (byte) 4;
                break;
            case -1225497657:
                b10 = !str.equals("translationX") ? (byte) -1 : (byte) 5;
                break;
            case -1225497656:
                b10 = !str.equals("translationY") ? (byte) -1 : (byte) 6;
                break;
            case -1225497655:
                b10 = !str.equals("translationZ") ? (byte) -1 : (byte) 7;
                break;
            case -1019779949:
                b10 = !str.equals(w.c.R) ? (byte) -1 : (byte) 8;
                break;
            case -1001078227:
                b10 = !str.equals("progress") ? (byte) -1 : (byte) 9;
                break;
            case -991726143:
                b10 = !str.equals("period") ? (byte) -1 : (byte) 10;
                break;
            case -987906986:
                b10 = !str.equals("pivotX") ? (byte) -1 : (byte) 11;
                break;
            case -987906985:
                b10 = !str.equals("pivotY") ? (byte) -1 : (byte) 12;
                break;
            case -908189618:
                b10 = !str.equals("scaleX") ? (byte) -1 : (byte) 13;
                break;
            case -908189617:
                b10 = !str.equals("scaleY") ? (byte) -1 : (byte) 14;
                break;
            case 92909918:
                b10 = !str.equals("alpha") ? (byte) -1 : (byte) 15;
                break;
            case 106629499:
                b10 = !str.equals(w.c.S) ? (byte) -1 : (byte) 16;
                break;
            case 579057826:
                b10 = !str.equals("curveFit") ? (byte) -1 : (byte) 17;
                break;
            case 803192288:
                b10 = !str.equals("pathRotate") ? (byte) -1 : com.google.common.base.a.f56668u;
                break;
            case 1532805160:
                b10 = !str.equals("waveShape") ? (byte) -1 : (byte) 19;
                break;
            case 1941332754:
                b10 = !str.equals("visibility") ? (byte) -1 : com.google.common.base.a.f56671x;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return 422;
            case 1:
                return 420;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case 8:
                return 424;
            case 9:
                return 315;
            case 10:
                return 423;
            case 11:
                return 313;
            case 12:
                return 314;
            case 13:
                return 311;
            case 14:
                return 312;
            case 15:
                return 403;
            case 16:
                return 425;
            case 17:
                return 401;
            case 18:
                return 416;
            case 19:
                return 421;
            case 20:
                return 402;
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
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("translationZ");
        }
        if (this.f17570l.size() > 0) {
            Iterator<String> it = this.f17570l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void v(HashMap<String, h> map) {
        h hVar;
        h hVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.core.motion.a aVar = this.f17570l.get(str.substring(7));
                if (aVar != null && aVar.m() == 901 && (hVar = map.get(str)) != null) {
                    hVar.g(this.f17566h, this.A, this.B, -1, this.C, this.D, this.E, aVar.n(), aVar);
                }
            } else {
                float fX = x(str);
                if (!Float.isNaN(fX) && (hVar2 = map.get(str)) != null) {
                    hVar2.f(this.f17566h, this.A, this.B, -1, this.C, this.D, this.E, fX);
                }
            }
        }
    }

    public void w() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.A + ", mWavePeriod=" + this.C + ", mWaveOffset=" + this.D + ", mWavePhase=" + this.E + ", mRotation=" + this.I + '}');
    }

    public float x(String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return this.K;
            case "rotationY":
                return this.L;
            case "rotationZ":
                return this.I;
            case "translationX":
                return this.O;
            case "translationY":
                return this.P;
            case "translationZ":
                return this.Q;
            case "offset":
                return this.D;
            case "progress":
                return this.F;
            case "scaleX":
                return this.M;
            case "scaleY":
                return this.N;
            case "elevation":
                return this.H;
            case "alpha":
                return this.G;
            case "phase":
                return this.E;
            case "pathRotate":
                return this.J;
            default:
                return Float.NaN;
        }
    }

    public void y() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        e0.c(" ------------- " + this.f17566h + " -------------");
        e0.c("MotionKeyCycle{Shape=" + this.A + ", Period=" + this.C + ", Offset=" + this.D + ", Phase=" + this.E + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            v.a(strArr[i10]);
            e0.c(strArr[i10] + ":" + x(strArr[i10]));
        }
    }
}
