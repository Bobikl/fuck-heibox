package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: MotionKeyAttributes.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends b {
    static final String P = "KeyAttribute";
    private static final String Q = "KeyAttributes";
    private static final boolean R = false;
    public static final int S = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f17571y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f17572z = -1;
    private int A = 0;
    private float B = Float.NaN;
    private float C = Float.NaN;
    private float D = Float.NaN;
    private float E = Float.NaN;
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

    public c() {
        this.f17569k = 1;
        this.f17570l = new HashMap<>();
    }

    private float w(int i10) {
        if (i10 == 100) {
            return this.f17566h;
        }
        switch (i10) {
            case 303:
                return this.B;
            case 304:
                return this.L;
            case 305:
                return this.M;
            case 306:
                return this.N;
            case 307:
                return this.C;
            case 308:
                return this.E;
            case 309:
                return this.F;
            case 310:
                return this.D;
            case 311:
                return this.J;
            case 312:
                return this.K;
            case 313:
                return this.G;
            case 314:
                return this.H;
            case 315:
                return this.O;
            case 316:
                return this.I;
            default:
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean a(int i10, int i11) {
        if (i10 == 100) {
            this.f17566h = i11;
            return true;
        }
        if (i10 == 301) {
            this.f17572z = i11;
            return true;
        }
        if (i10 == 302) {
            this.A = i11;
            return true;
        }
        if (a(i10, i11)) {
            return true;
        }
        return super.a(i10, i11);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i10, float f10) {
        if (i10 == 100) {
            this.I = f10;
            return true;
        }
        switch (i10) {
            case 303:
                this.B = f10;
                return true;
            case 304:
                this.L = f10;
                return true;
            case 305:
                this.M = f10;
                return true;
            case 306:
                this.N = f10;
                return true;
            case 307:
                this.C = f10;
                return true;
            case 308:
                this.E = f10;
                return true;
            case 309:
                this.F = f10;
                return true;
            case 310:
                this.D = f10;
                return true;
            case 311:
                this.J = f10;
                return true;
            case 312:
                this.K = f10;
                return true;
            case 313:
                this.G = f10;
                return true;
            case 314:
                this.H = f10;
                return true;
            case 315:
                this.O = f10;
                return true;
            case 316:
                this.I = f10;
                return true;
            default:
                return super.b(i10, f10);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean d(int i10, String str) {
        if (i10 == 101) {
            this.f17568j = str;
            return true;
        }
        if (i10 != 317) {
            return super.d(i10, str);
        }
        this.f17571y = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public int e(String str) {
        return v.a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, o> map) {
        for (String str : map.keySet()) {
            o oVar = map.get(str);
            if (oVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.E)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.E);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.F)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.F);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (Float.isNaN(this.D)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.D);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.L)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.L);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.M)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.M);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.N)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.N);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.O)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.O);
                                break;
                            }
                            break;
                        case "pivotX":
                            if (Float.isNaN(this.E)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.G);
                                break;
                            }
                            break;
                        case "pivotY":
                            if (Float.isNaN(this.F)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.H);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.J)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.J);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.K);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.C)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.C);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.B)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.B);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (Float.isNaN(this.I)) {
                                break;
                            } else {
                                oVar.g(this.f17566h, this.I);
                                break;
                            }
                            break;
                        default:
                            System.err.println("not supported by KeyAttributes " + str);
                            break;
                    }
                } else {
                    androidx.constraintlayout.core.motion.a aVar = this.f17570l.get(str.substring(7));
                    if (aVar != null) {
                        ((o.c) oVar).k(this.f17566h, aVar);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.B)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("progress");
        }
        if (this.f17570l.size() > 0) {
            Iterator<String> it = this.f17570l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void q(HashMap<String, Integer> map) {
        if (!Float.isNaN(this.B)) {
            map.put("alpha", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.C)) {
            map.put("elevation", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.D)) {
            map.put("rotationZ", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.E)) {
            map.put("rotationX", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.F)) {
            map.put("rotationY", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.G)) {
            map.put("pivotX", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.H)) {
            map.put("pivotY", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.L)) {
            map.put("translationX", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.M)) {
            map.put("translationY", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.N)) {
            map.put("translationZ", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.I)) {
            map.put("pathRotate", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.J)) {
            map.put("scaleX", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.K)) {
            map.put("scaleY", Integer.valueOf(this.f17572z));
        }
        if (!Float.isNaN(this.O)) {
            map.put("progress", Integer.valueOf(this.f17572z));
        }
        if (this.f17570l.size() > 0) {
            Iterator<String> it = this.f17570l.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f17572z));
            }
        }
    }

    public int v() {
        return this.f17572z;
    }

    public void x() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        System.out.println(" ------------- " + this.f17566h + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            int iA = v.a(strArr[i10]);
            System.out.println(strArr[i10] + ":" + w(iA));
        }
    }
}
