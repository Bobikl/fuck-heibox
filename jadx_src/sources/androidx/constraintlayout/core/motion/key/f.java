package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.e0;
import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.t;
import androidx.constraintlayout.core.motion.utils.y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: MotionKeyTimeCycle.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends b {
    static final String Q = "KeyTimeCycle";
    private static final String R = "KeyTimeCycle";
    public static final int S = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f17582y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f17583z = -1;
    private float A = Float.NaN;
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
    private int M = 0;
    private String N = null;
    private float O = Float.NaN;
    private float P = 0.0f;

    public f() {
        this.f17569k = 3;
        this.f17570l = new HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean a(int i10, int i11) {
        if (i10 == 100) {
            this.f17566h = i11;
            return true;
        }
        if (i10 != 421) {
            return super.a(i10, i11);
        }
        this.M = i11;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i10, float f10) {
        if (i10 == 315) {
            this.L = t(Float.valueOf(f10));
            return true;
        }
        if (i10 == 401) {
            this.f17583z = u(Float.valueOf(f10));
            return true;
        }
        if (i10 == 403) {
            this.A = f10;
            return true;
        }
        if (i10 == 416) {
            this.F = t(Float.valueOf(f10));
            return true;
        }
        if (i10 == 423) {
            this.O = t(Float.valueOf(f10));
            return true;
        }
        if (i10 == 424) {
            this.P = t(Float.valueOf(f10));
            return true;
        }
        switch (i10) {
            case 304:
                this.I = t(Float.valueOf(f10));
                return true;
            case 305:
                this.J = t(Float.valueOf(f10));
                return true;
            case 306:
                this.K = t(Float.valueOf(f10));
                return true;
            case 307:
                this.B = t(Float.valueOf(f10));
                return true;
            case 308:
                this.D = t(Float.valueOf(f10));
                return true;
            case 309:
                this.E = t(Float.valueOf(f10));
                return true;
            case 310:
                this.C = t(Float.valueOf(f10));
                return true;
            case 311:
                this.G = t(Float.valueOf(f10));
                return true;
            case 312:
                this.H = t(Float.valueOf(f10));
                return true;
            default:
                return super.b(i10, f10);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i10, boolean z10) {
        return super.c(i10, z10);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean d(int i10, String str) {
        if (i10 == 420) {
            this.f17582y = str;
            return true;
        }
        if (i10 != 421) {
            return super.d(i10, str);
        }
        this.M = 7;
        this.N = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public int e(String str) {
        return y.a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, o> map) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return new f().h(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.A)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.B)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("translationZ");
        }
        if (this.f17570l.size() > 0) {
            Iterator<String> it = this.f17570l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void v(HashMap<String, t> map) {
        for (String str : map.keySet()) {
            t tVar = map.get(str);
            if (tVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.D)) {
                                break;
                            } else {
                                tVar.c(this.f17566h, this.D, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.E)) {
                                break;
                            } else {
                                tVar.c(this.f17566h, this.E, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (Float.isNaN(this.C)) {
                                break;
                            } else {
                                tVar.c(this.f17566h, this.C, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.I)) {
                                break;
                            } else {
                                tVar.c(this.f17566h, this.I, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.J)) {
                                break;
                            } else {
                                tVar.c(this.f17566h, this.J, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                tVar.c(this.f17566h, this.K, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.L)) {
                                break;
                            } else {
                                tVar.c(this.f17566h, this.L, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.G)) {
                                break;
                            } else {
                                tVar.c(this.f17566h, this.G, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.H)) {
                                break;
                            } else {
                                tVar.c(this.f17566h, this.H, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                tVar.c(this.f17566h, this.K, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.A)) {
                                break;
                            } else {
                                tVar.c(this.f17566h, this.A, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (Float.isNaN(this.F)) {
                                break;
                            } else {
                                tVar.c(this.f17566h, this.F, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        default:
                            e0.f("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    androidx.constraintlayout.core.motion.a aVar = this.f17570l.get(str.substring(7));
                    if (aVar != null) {
                        ((t.b) tVar).g(this.f17566h, aVar, this.O, this.M, this.P);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public f h(b bVar) {
        super.h(bVar);
        f fVar = (f) bVar;
        this.f17582y = fVar.f17582y;
        this.f17583z = fVar.f17583z;
        this.M = fVar.M;
        this.O = fVar.O;
        this.P = fVar.P;
        this.L = fVar.L;
        this.A = fVar.A;
        this.B = fVar.B;
        this.C = fVar.C;
        this.F = fVar.F;
        this.D = fVar.D;
        this.E = fVar.E;
        this.G = fVar.G;
        this.H = fVar.H;
        this.I = fVar.I;
        this.J = fVar.J;
        this.K = fVar.K;
        return this;
    }
}
