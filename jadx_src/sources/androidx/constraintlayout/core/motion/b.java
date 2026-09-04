package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.f;
import androidx.constraintlayout.core.motion.key.g;
import androidx.constraintlayout.core.motion.utils.e0;
import androidx.constraintlayout.core.motion.utils.f0;
import androidx.constraintlayout.core.motion.utils.g0;
import androidx.constraintlayout.core.motion.utils.h;
import androidx.constraintlayout.core.motion.utils.i;
import androidx.constraintlayout.core.motion.utils.m;
import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.t;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: Motion.java */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final int M = 0;
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 3;
    public static final int Q = 4;
    public static final int R = 5;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 3;
    public static final int W = 4;
    public static final int X = 5;
    public static final int Y = 6;
    public static final int Z = 1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f17411a0 = 2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f17412b0 = "MotionController";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final boolean f17413c0 = false;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final boolean f17414d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    static final int f17415e0 = 0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    static final int f17416f0 = 1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    static final int f17417g0 = 2;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    static final int f17418h0 = 3;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    static final int f17419i0 = 4;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    static final int f17420j0 = 5;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int f17421k0 = -1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f17422l0 = -2;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f17423m0 = -3;
    private HashMap<String, t> A;
    private HashMap<String, o> B;
    private HashMap<String, h> C;
    private g[] D;
    String[] L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f17425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f17426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f17427d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b[] f17433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b f17434k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f17438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f17439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f17440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private double[] f17441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double[] f17442s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String[] f17443t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int[] f17444u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    m f17424a = new m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17428e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f17429f = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f17430g = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f17431h = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f17432i = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f17435l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f17436m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f17437n = 1.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f17445v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float[] f17446w = new float[4];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ArrayList<d> f17447x = new ArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float[] f17448y = new float[1];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.core.motion.key.b> f17449z = new ArrayList<>();
    private int E = -1;
    private int F = -1;
    private e G = null;
    private int H = -1;
    private float I = Float.NaN;
    private androidx.constraintlayout.core.motion.utils.c J = null;
    private boolean K = false;

    /* JADX INFO: compiled from: Motion.java */
    public static final class a implements androidx.constraintlayout.core.motion.utils.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f17450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f17451b;

        a(androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f17451b = dVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public float a() {
            return (float) this.f17451b.b(this.f17450a);
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public float getInterpolation(float f10) {
            this.f17450a = f10;
            return (float) this.f17451b.a(f10);
        }
    }

    public b(e eVar) {
        X(eVar);
    }

    private float D() {
        char c10;
        float fHypot;
        float[] fArr = new float[2];
        float f10 = 1.0f / 99;
        double d10 = 0.0d;
        double d11 = 0.0d;
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < 100) {
            float f12 = i10 * f10;
            double dA = f12;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f17429f.f17483b;
            float f13 = Float.NaN;
            float f14 = 0.0f;
            for (d dVar2 : this.f17447x) {
                androidx.constraintlayout.core.motion.utils.d dVar3 = dVar2.f17483b;
                if (dVar3 != null) {
                    float f15 = dVar2.f17485d;
                    if (f15 < f12) {
                        dVar = dVar3;
                        f14 = f15;
                    } else if (Float.isNaN(f13)) {
                        f13 = dVar2.f17485d;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                float f16 = f13 - f14;
                dA = (((float) dVar.a((f12 - f14) / f16)) * f16) + f14;
            }
            this.f17433j[0].d(dA, this.f17441r);
            float f17 = f11;
            int i11 = i10;
            this.f17429f.h(dA, this.f17440q, this.f17441r, fArr, 0);
            if (i11 > 0) {
                c10 = 0;
                fHypot = (float) (((double) f17) + Math.hypot(d11 - ((double) fArr[1]), d10 - ((double) fArr[0])));
            } else {
                c10 = 0;
                fHypot = f17;
            }
            d10 = fArr[c10];
            i10 = i11 + 1;
            f11 = fHypot;
            d11 = fArr[1];
        }
        return f11;
    }

    private void K(d dVar) {
        d dVar2 = null;
        for (d dVar3 : this.f17447x) {
            if (dVar.f17486e == dVar3.f17486e) {
                dVar2 = dVar3;
            }
        }
        if (dVar2 != null) {
            this.f17447x.remove(dVar2);
        }
        int iBinarySearch = Collections.binarySearch(this.f17447x, dVar);
        if (iBinarySearch == 0) {
            e0.f(f17412b0, " KeyPath position \"" + dVar.f17486e + "\" outside of range");
        }
        this.f17447x.add((-iBinarySearch) - 1, dVar);
    }

    private void O(d dVar) {
        dVar.s(this.f17425b.E(), this.f17425b.F(), this.f17425b.D(), this.f17425b.k());
    }

    private float j(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f17437n;
            if (f12 != 1.0d) {
                float f13 = this.f17436m;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.d dVar = this.f17429f.f17483b;
        float f14 = Float.NaN;
        for (d dVar2 : this.f17447x) {
            androidx.constraintlayout.core.motion.utils.d dVar3 = dVar2.f17483b;
            if (dVar3 != null) {
                float f15 = dVar2.f17485d;
                if (f15 < f10) {
                    dVar = dVar3;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = dVar2.f17485d;
                }
            }
        }
        if (dVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) dVar.a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) dVar.b(d10);
            }
        }
        return f10;
    }

    private static androidx.constraintlayout.core.motion.utils.c v(int i10, String str, int i11) {
        if (i10 != -1) {
            return null;
        }
        return new a(androidx.constraintlayout.core.motion.utils.d.c(str));
    }

    double[] A(double d10) {
        this.f17433j[0].d(d10, this.f17441r);
        androidx.constraintlayout.core.motion.utils.b bVar = this.f17434k;
        if (bVar != null) {
            double[] dArr = this.f17441r;
            if (dArr.length > 0) {
                bVar.d(d10, dArr);
            }
        }
        return this.f17441r;
    }

    androidx.constraintlayout.core.motion.key.e B(int i10, int i11, float f10, float f11) {
        androidx.constraintlayout.core.motion.utils.e eVar = new androidx.constraintlayout.core.motion.utils.e();
        d dVar = this.f17429f;
        float f12 = dVar.f17487f;
        eVar.f17662b = f12;
        float f13 = dVar.f17488g;
        eVar.f17664d = f13;
        eVar.f17663c = f12 + dVar.f17489h;
        eVar.f17661a = f13 + dVar.f17490i;
        androidx.constraintlayout.core.motion.utils.e eVar2 = new androidx.constraintlayout.core.motion.utils.e();
        d dVar2 = this.f17430g;
        float f14 = dVar2.f17487f;
        eVar2.f17662b = f14;
        float f15 = dVar2.f17488g;
        eVar2.f17664d = f15;
        eVar2.f17663c = f14 + dVar2.f17489h;
        eVar2.f17661a = f15 + dVar2.f17490i;
        for (androidx.constraintlayout.core.motion.key.b bVar : this.f17449z) {
            if (bVar instanceof androidx.constraintlayout.core.motion.key.e) {
                androidx.constraintlayout.core.motion.key.e eVar3 = (androidx.constraintlayout.core.motion.key.e) bVar;
                if (eVar3.B(i10, i11, eVar, eVar2, f10, f11)) {
                    return eVar3;
                }
            }
        }
        return null;
    }

    void C(float f10, int i10, int i11, float f11, float f12, float[] fArr) {
        float fJ = j(f10, this.f17448y);
        HashMap<String, o> map = this.B;
        o oVar = map == null ? null : map.get("translationX");
        HashMap<String, o> map2 = this.B;
        o oVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, o> map3 = this.B;
        o oVar3 = map3 == null ? null : map3.get("rotationZ");
        HashMap<String, o> map4 = this.B;
        o oVar4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, o> map5 = this.B;
        o oVar5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, h> map6 = this.C;
        h hVar = map6 == null ? null : map6.get("translationX");
        HashMap<String, h> map7 = this.C;
        h hVar2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, h> map8 = this.C;
        h hVar3 = map8 == null ? null : map8.get("rotationZ");
        HashMap<String, h> map9 = this.C;
        h hVar4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, h> map10 = this.C;
        h hVar5 = map10 != null ? map10.get("scaleY") : null;
        f0 f0Var = new f0();
        f0Var.b();
        f0Var.d(oVar3, fJ);
        f0Var.h(oVar, oVar2, fJ);
        f0Var.f(oVar4, oVar5, fJ);
        f0Var.c(hVar3, fJ);
        f0Var.g(hVar, hVar2, fJ);
        f0Var.e(hVar4, hVar5, fJ);
        androidx.constraintlayout.core.motion.utils.b bVar = this.f17434k;
        if (bVar != null) {
            double[] dArr = this.f17441r;
            if (dArr.length > 0) {
                double d10 = fJ;
                bVar.d(d10, dArr);
                this.f17434k.g(d10, this.f17442s);
                this.f17429f.t(f11, f12, fArr, this.f17440q, this.f17442s, this.f17441r);
            }
            f0Var.a(f11, f12, i10, i11, fArr);
            return;
        }
        int i12 = 0;
        if (this.f17433j == null) {
            d dVar = this.f17430g;
            float f13 = dVar.f17487f;
            d dVar2 = this.f17429f;
            float f14 = f13 - dVar2.f17487f;
            h hVar6 = hVar5;
            float f15 = dVar.f17488g - dVar2.f17488g;
            h hVar7 = hVar4;
            float f16 = (dVar.f17489h - dVar2.f17489h) + f14;
            float f17 = (dVar.f17490i - dVar2.f17490i) + f15;
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            f0Var.b();
            f0Var.d(oVar3, fJ);
            f0Var.h(oVar, oVar2, fJ);
            f0Var.f(oVar4, oVar5, fJ);
            f0Var.c(hVar3, fJ);
            f0Var.g(hVar, hVar2, fJ);
            f0Var.e(hVar7, hVar6, fJ);
            f0Var.a(f11, f12, i10, i11, fArr);
            return;
        }
        double dJ = j(fJ, this.f17448y);
        this.f17433j[0].g(dJ, this.f17442s);
        this.f17433j[0].d(dJ, this.f17441r);
        float f18 = this.f17448y[0];
        while (true) {
            double[] dArr2 = this.f17442s;
            if (i12 >= dArr2.length) {
                this.f17429f.t(f11, f12, fArr, this.f17440q, dArr2, this.f17441r);
                f0Var.a(f11, f12, i10, i11, fArr);
                return;
            } else {
                dArr2[i12] = dArr2[i12] * ((double) f18);
                i12++;
            }
        }
    }

    public float E() {
        return this.f17429f.f17490i;
    }

    public float F() {
        return this.f17429f.f17489h;
    }

    public float G() {
        return this.f17429f.f17487f;
    }

    public float H() {
        return this.f17429f.f17488g;
    }

    public int I() {
        return this.F;
    }

    public e J() {
        return this.f17425b;
    }

    public boolean L(e eVar, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
        float fJ = j(f10, null);
        int i10 = this.H;
        if (i10 != -1) {
            float f11 = 1.0f / i10;
            float fFloor = ((float) Math.floor(fJ / f11)) * f11;
            float f12 = (fJ % f11) / f11;
            if (!Float.isNaN(this.I)) {
                f12 = (f12 + this.I) % 1.0f;
            }
            androidx.constraintlayout.core.motion.utils.c cVar = this.J;
            fJ = ((cVar != null ? cVar.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + fFloor;
        }
        float f13 = fJ;
        HashMap<String, o> map = this.B;
        if (map != null) {
            Iterator<o> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().h(eVar, f13);
            }
        }
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = this.f17433j;
        if (bVarArr != null) {
            double d10 = f13;
            bVarArr[0].d(d10, this.f17441r);
            this.f17433j[0].g(d10, this.f17442s);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f17434k;
            if (bVar != null) {
                double[] dArr = this.f17441r;
                if (dArr.length > 0) {
                    bVar.d(d10, dArr);
                    this.f17434k.g(d10, this.f17442s);
                }
            }
            if (!this.K) {
                this.f17429f.w(f13, eVar, this.f17440q, this.f17441r, this.f17442s, null);
            }
            if (this.F != -1) {
                if (this.G == null) {
                    this.G = eVar.n().f(this.F);
                }
                e eVar2 = this.G;
                if (eVar2 != null) {
                    float fW = (eVar2.w() + this.G.h()) / 2.0f;
                    float fL = (this.G.l() + this.G.q()) / 2.0f;
                    if (eVar.q() - eVar.l() > 0 && eVar.h() - eVar.w() > 0) {
                        float fL2 = fL - eVar.l();
                        float fW2 = fW - eVar.w();
                        eVar.M(fL2);
                        eVar.N(fW2);
                    }
                }
            }
            int i11 = 1;
            while (true) {
                androidx.constraintlayout.core.motion.utils.b[] bVarArr2 = this.f17433j;
                if (i11 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i11].e(d10, this.f17446w);
                this.f17429f.f17497p.get(this.f17443t[i11 - 1]).w(eVar, this.f17446w);
                i11++;
            }
            c cVar2 = this.f17431h;
            if (cVar2.f17453c == 0) {
                if (f13 <= 0.0f) {
                    eVar.a0(cVar2.f17454d);
                } else if (f13 >= 1.0f) {
                    eVar.a0(this.f17432i.f17454d);
                } else if (this.f17432i.f17454d != cVar2.f17454d) {
                    eVar.a0(4);
                }
            }
            if (this.D != null) {
                int i12 = 0;
                while (true) {
                    g[] gVarArr = this.D;
                    if (i12 >= gVarArr.length) {
                        break;
                    }
                    gVarArr[i12].v(f13, eVar);
                    i12++;
                }
            }
        } else {
            d dVar = this.f17429f;
            float f14 = dVar.f17487f;
            d dVar2 = this.f17430g;
            float f15 = f14 + ((dVar2.f17487f - f14) * f13);
            float f16 = dVar.f17488g;
            float f17 = f16 + ((dVar2.f17488g - f16) * f13);
            float f18 = dVar.f17489h;
            float f19 = f18 + ((dVar2.f17489h - f18) * f13);
            float f20 = dVar.f17490i;
            float f21 = f15 + 0.5f;
            float f22 = f17 + 0.5f;
            eVar.G((int) f21, (int) f22, (int) (f21 + f19), (int) (f22 + f20 + ((dVar2.f17490i - f20) * f13)));
        }
        HashMap<String, h> map2 = this.C;
        if (map2 == null) {
            return false;
        }
        for (h hVar : map2.values()) {
            if (hVar instanceof h.f) {
                double[] dArr2 = this.f17442s;
                ((h.f) hVar).l(eVar, f13, dArr2[0], dArr2[1]);
            } else {
                hVar.h(eVar, f13);
            }
        }
        return false;
    }

    String M() {
        return this.f17425b.m();
    }

    void N(e eVar, androidx.constraintlayout.core.motion.key.e eVar2, float f10, float f11, String[] strArr, float[] fArr) {
        androidx.constraintlayout.core.motion.utils.e eVar3 = new androidx.constraintlayout.core.motion.utils.e();
        d dVar = this.f17429f;
        float f12 = dVar.f17487f;
        eVar3.f17662b = f12;
        float f13 = dVar.f17488g;
        eVar3.f17664d = f13;
        eVar3.f17663c = f12 + dVar.f17489h;
        eVar3.f17661a = f13 + dVar.f17490i;
        androidx.constraintlayout.core.motion.utils.e eVar4 = new androidx.constraintlayout.core.motion.utils.e();
        d dVar2 = this.f17430g;
        float f14 = dVar2.f17487f;
        eVar4.f17662b = f14;
        float f15 = dVar2.f17488g;
        eVar4.f17664d = f15;
        eVar4.f17663c = f14 + dVar2.f17489h;
        eVar4.f17661a = f15 + dVar2.f17490i;
        eVar2.C(eVar, eVar3, eVar4, f10, f11, strArr, fArr);
    }

    void P(m mVar, m mVar2, int i10, int i11, int i12) {
        if (i10 == 1) {
            int i13 = mVar.f17766b + mVar.f17767c;
            mVar2.f17766b = ((mVar.f17768d + mVar.f17765a) - mVar.b()) / 2;
            mVar2.f17768d = i12 - ((i13 + mVar.a()) / 2);
            mVar2.f17767c = mVar2.f17766b + mVar.b();
            mVar2.f17765a = mVar2.f17768d + mVar.a();
            return;
        }
        if (i10 == 2) {
            int i14 = mVar.f17766b + mVar.f17767c;
            mVar2.f17766b = i11 - (((mVar.f17768d + mVar.f17765a) + mVar.b()) / 2);
            mVar2.f17768d = (i14 - mVar.a()) / 2;
            mVar2.f17767c = mVar2.f17766b + mVar.b();
            mVar2.f17765a = mVar2.f17768d + mVar.a();
            return;
        }
        if (i10 == 3) {
            int i15 = mVar.f17766b + mVar.f17767c;
            mVar2.f17766b = ((mVar.a() / 2) + mVar.f17768d) - (i15 / 2);
            mVar2.f17768d = i12 - ((i15 + mVar.a()) / 2);
            mVar2.f17767c = mVar2.f17766b + mVar.b();
            mVar2.f17765a = mVar2.f17768d + mVar.a();
            return;
        }
        if (i10 != 4) {
            return;
        }
        int i16 = mVar.f17766b + mVar.f17767c;
        mVar2.f17766b = i11 - (((mVar.f17765a + mVar.f17768d) + mVar.b()) / 2);
        mVar2.f17768d = (i16 - mVar.a()) / 2;
        mVar2.f17767c = mVar2.f17766b + mVar.b();
        mVar2.f17765a = mVar2.f17768d + mVar.a();
    }

    void Q(e eVar) {
        d dVar = this.f17429f;
        dVar.f17485d = 0.0f;
        dVar.f17486e = 0.0f;
        this.K = true;
        dVar.s(eVar.E(), eVar.F(), eVar.D(), eVar.k());
        this.f17430g.s(eVar.E(), eVar.F(), eVar.D(), eVar.k());
        this.f17431h.l(eVar);
        this.f17432i.l(eVar);
    }

    public void R(int i10) {
        this.f17429f.f17484c = i10;
    }

    public void S(e eVar) {
        d dVar = this.f17430g;
        dVar.f17485d = 1.0f;
        dVar.f17486e = 1.0f;
        O(dVar);
        this.f17430g.s(eVar.l(), eVar.w(), eVar.D(), eVar.k());
        this.f17430g.a(eVar);
        this.f17432i.l(eVar);
    }

    public void T(int i10) {
        this.E = i10;
    }

    public void U(e eVar) {
        d dVar = this.f17429f;
        dVar.f17485d = 0.0f;
        dVar.f17486e = 0.0f;
        dVar.s(eVar.E(), eVar.F(), eVar.D(), eVar.k());
        this.f17429f.a(eVar);
        this.f17431h.l(eVar);
    }

    public void V(g0 g0Var, e eVar, int i10, int i11, int i12) {
        d dVar = this.f17429f;
        dVar.f17485d = 0.0f;
        dVar.f17486e = 0.0f;
        m mVar = new m();
        if (i10 == 1) {
            int i13 = g0Var.f17684b + g0Var.f17686d;
            mVar.f17766b = ((g0Var.f17685c + g0Var.f17687e) - g0Var.c()) / 2;
            mVar.f17768d = i11 - ((i13 + g0Var.b()) / 2);
            mVar.f17767c = mVar.f17766b + g0Var.c();
            mVar.f17765a = mVar.f17768d + g0Var.b();
        } else if (i10 == 2) {
            int i14 = g0Var.f17684b + g0Var.f17686d;
            mVar.f17766b = i12 - (((g0Var.f17685c + g0Var.f17687e) + g0Var.c()) / 2);
            mVar.f17768d = (i14 - g0Var.b()) / 2;
            mVar.f17767c = mVar.f17766b + g0Var.c();
            mVar.f17765a = mVar.f17768d + g0Var.b();
        }
        this.f17429f.s(mVar.f17766b, mVar.f17768d, mVar.b(), mVar.a());
        this.f17431h.m(mVar, eVar, i10, g0Var.f17683a);
    }

    public void W(int i10) {
        this.F = i10;
        this.G = null;
    }

    public void X(e eVar) {
        this.f17425b = eVar;
    }

    public void Y(int i10, int i11, float f10, long j10) {
        ArrayList arrayList;
        String[] strArr;
        int i12;
        androidx.constraintlayout.core.motion.a aVar;
        o oVarF;
        androidx.constraintlayout.core.motion.a aVar2;
        Integer num;
        o oVarF2;
        androidx.constraintlayout.core.motion.a aVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i13 = this.E;
        if (i13 != -1) {
            this.f17429f.f17493l = i13;
        }
        this.f17431h.e(this.f17432i, hashSet2);
        ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList2 = this.f17449z;
        if (arrayList2 != null) {
            arrayList = null;
            for (androidx.constraintlayout.core.motion.key.b bVar : arrayList2) {
                if (bVar instanceof androidx.constraintlayout.core.motion.key.e) {
                    androidx.constraintlayout.core.motion.key.e eVar = (androidx.constraintlayout.core.motion.key.e) bVar;
                    K(new d(i10, i11, eVar, this.f17429f, this.f17430g));
                    int i14 = eVar.f17580y;
                    if (i14 != -1) {
                        this.f17428e = i14;
                    }
                } else if (bVar instanceof androidx.constraintlayout.core.motion.key.d) {
                    bVar.i(hashSet3);
                } else if (bVar instanceof f) {
                    bVar.i(hashSet);
                } else if (bVar instanceof g) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((g) bVar);
                } else {
                    bVar.q(map);
                    bVar.i(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.D = (g[]) arrayList.toArray(new g[0]);
        }
        char c10 = 1;
        if (!hashSet2.isEmpty()) {
            this.B = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    i.b bVar2 = new i.b();
                    String str2 = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[c10];
                    for (androidx.constraintlayout.core.motion.key.b bVar3 : this.f17449z) {
                        HashMap<String, androidx.constraintlayout.core.motion.a> map2 = bVar3.f17570l;
                        if (map2 != null && (aVar3 = map2.get(str2)) != null) {
                            bVar2.a(bVar3.f17566h, aVar3);
                        }
                    }
                    oVarF2 = o.e(str, bVar2);
                } else {
                    oVarF2 = o.f(str, j10);
                }
                if (oVarF2 != null) {
                    oVarF2.i(str);
                    this.B.put(str, oVarF2);
                }
                c10 = 1;
            }
            ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList3 = this.f17449z;
            if (arrayList3 != null) {
                for (androidx.constraintlayout.core.motion.key.b bVar4 : arrayList3) {
                    if (bVar4 instanceof androidx.constraintlayout.core.motion.key.c) {
                        bVar4.f(this.B);
                    }
                }
            }
            this.f17431h.a(this.B, 0);
            this.f17432i.a(this.B, 100);
            for (String str3 : this.B.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                o oVar = this.B.get(str3);
                if (oVar != null) {
                    oVar.j(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.A == null) {
                this.A = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.A.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        i.b bVar5 = new i.b();
                        String str5 = str4.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
                        for (androidx.constraintlayout.core.motion.key.b bVar6 : this.f17449z) {
                            HashMap<String, androidx.constraintlayout.core.motion.a> map3 = bVar6.f17570l;
                            if (map3 != null && (aVar2 = map3.get(str5)) != null) {
                                bVar5.a(bVar6.f17566h, aVar2);
                            }
                        }
                        oVarF = o.e(str4, bVar5);
                    } else {
                        oVarF = o.f(str4, j10);
                    }
                    if (oVarF != null) {
                        oVarF.i(str4);
                    }
                }
            }
            ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList4 = this.f17449z;
            if (arrayList4 != null) {
                for (androidx.constraintlayout.core.motion.key.b bVar7 : arrayList4) {
                    if (bVar7 instanceof f) {
                        ((f) bVar7).v(this.A);
                    }
                }
            }
            for (String str6 : this.A.keySet()) {
                this.A.get(str6).f(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int i15 = 2;
        int size = this.f17447x.size() + 2;
        d[] dVarArr = new d[size];
        dVarArr[0] = this.f17429f;
        dVarArr[size - 1] = this.f17430g;
        if (this.f17447x.size() > 0 && this.f17428e == androidx.constraintlayout.core.motion.key.b.f17554m) {
            this.f17428e = 0;
        }
        Iterator<d> it = this.f17447x.iterator();
        int i16 = 1;
        while (it.hasNext()) {
            dVarArr[i16] = it.next();
            i16++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f17430g.f17497p.keySet()) {
            if (this.f17429f.f17497p.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f17443t = strArr2;
        this.f17444u = new int[strArr2.length];
        int i17 = 0;
        while (true) {
            strArr = this.f17443t;
            if (i17 >= strArr.length) {
                break;
            }
            String str8 = strArr[i17];
            this.f17444u[i17] = 0;
            for (int i18 = 0; i18 < size; i18++) {
                if (dVarArr[i18].f17497p.containsKey(str8) && (aVar = dVarArr[i18].f17497p.get(str8)) != null) {
                    int[] iArr = this.f17444u;
                    iArr[i17] = iArr[i17] + aVar.r();
                    break;
                }
            }
            i17++;
        }
        boolean z10 = dVarArr[0].f17493l != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i19 = 1; i19 < size; i19++) {
            dVarArr[i19].e(dVarArr[i19 - 1], zArr, this.f17443t, z10);
        }
        int i20 = 0;
        for (int i21 = 1; i21 < length; i21++) {
            if (zArr[i21]) {
                i20++;
            }
        }
        this.f17440q = new int[i20];
        int iMax = Math.max(2, i20);
        this.f17441r = new double[iMax];
        this.f17442s = new double[iMax];
        int i22 = 0;
        for (int i23 = 1; i23 < length; i23++) {
            if (zArr[i23]) {
                this.f17440q[i22] = i23;
                i22++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, this.f17440q.length);
        double[] dArr2 = new double[size];
        for (int i24 = 0; i24 < size; i24++) {
            dVarArr[i24].f(dArr[i24], this.f17440q);
            dArr2[i24] = dVarArr[i24].f17485d;
        }
        int i25 = 0;
        while (true) {
            int[] iArr2 = this.f17440q;
            if (i25 >= iArr2.length) {
                break;
            }
            if (iArr2[i25] < d.G.length) {
                String str9 = d.G[this.f17440q[i25]] + " [";
                for (int i26 = 0; i26 < size; i26++) {
                    str9 = str9 + dArr[i26][i25];
                }
            }
            i25++;
        }
        this.f17433j = new androidx.constraintlayout.core.motion.utils.b[this.f17443t.length + 1];
        int i27 = 0;
        while (true) {
            String[] strArr3 = this.f17443t;
            if (i27 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i27];
            int i28 = 0;
            int i29 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i28 < size) {
                if (dVarArr[i28].n(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i15];
                        iArr3[1] = dVarArr[i28].l(str10);
                        i12 = 0;
                        iArr3[0] = size;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    } else {
                        i12 = 0;
                    }
                    d dVar = dVarArr[i28];
                    dArr3[i29] = dVar.f17485d;
                    dVar.k(str10, dArr4[i29], i12);
                    i29++;
                }
                i28++;
                dVarArr = dVarArr;
                i15 = 2;
            }
            i27++;
            this.f17433j[i27] = androidx.constraintlayout.core.motion.utils.b.a(this.f17428e, Arrays.copyOf(dArr3, i29), (double[][]) Arrays.copyOf(dArr4, i29));
            dVarArr = dVarArr;
            i15 = 2;
        }
        d[] dVarArr2 = dVarArr;
        this.f17433j[0] = androidx.constraintlayout.core.motion.utils.b.a(this.f17428e, dArr2, dArr);
        if (dVarArr2[0].f17493l != -1) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
            for (int i30 = 0; i30 < size; i30++) {
                d dVar2 = dVarArr2[i30];
                iArr4[i30] = dVar2.f17493l;
                dArr5[i30] = dVar2.f17485d;
                double[] dArr7 = dArr6[i30];
                dArr7[0] = dVar2.f17487f;
                dArr7[1] = dVar2.f17488g;
            }
            this.f17434k = androidx.constraintlayout.core.motion.utils.b.b(iArr4, dArr5, dArr6);
        }
        float fD = Float.NaN;
        this.C = new HashMap<>();
        if (this.f17449z != null) {
            for (String str11 : hashSet3) {
                h hVarD = h.d(str11);
                if (hVarD != null) {
                    if (hVarD.k() && Float.isNaN(fD)) {
                        fD = D();
                    }
                    hVarD.i(str11);
                    this.C.put(str11, hVarD);
                }
            }
            for (androidx.constraintlayout.core.motion.key.b bVar8 : this.f17449z) {
                if (bVar8 instanceof androidx.constraintlayout.core.motion.key.d) {
                    ((androidx.constraintlayout.core.motion.key.d) bVar8).v(this.C);
                }
            }
            Iterator<h> it2 = this.C.values().iterator();
            while (it2.hasNext()) {
                it2.next().j(fD);
            }
        }
    }

    public void Z(b bVar) {
        this.f17429f.x(bVar, bVar.f17429f);
        this.f17430g.x(bVar, bVar.f17430g);
    }

    public void a(androidx.constraintlayout.core.motion.key.b bVar) {
        this.f17449z.add(bVar);
    }

    void b(ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList) {
        this.f17449z.addAll(arrayList);
    }

    void c(float[] fArr, int i10) {
        float f10 = 1.0f / (i10 - 1);
        HashMap<String, o> map = this.B;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, o> map2 = this.B;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, h> map3 = this.C;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, h> map4 = this.C;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            float fMin = i11 * f10;
            float f11 = this.f17437n;
            float f12 = 0.0f;
            if (f11 != 1.0f) {
                float f13 = this.f17436m;
                if (fMin < f13) {
                    fMin = 0.0f;
                }
                if (fMin > f13 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f13) * f11, 1.0f);
                }
            }
            double dA = fMin;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f17429f.f17483b;
            float f14 = Float.NaN;
            for (d dVar2 : this.f17447x) {
                androidx.constraintlayout.core.motion.utils.d dVar3 = dVar2.f17483b;
                if (dVar3 != null) {
                    float f15 = dVar2.f17485d;
                    if (f15 < fMin) {
                        dVar = dVar3;
                        f12 = f15;
                    } else if (Float.isNaN(f14)) {
                        f14 = dVar2.f17485d;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f14)) {
                    f14 = 1.0f;
                }
                float f16 = f14 - f12;
                dA = (((float) dVar.a((fMin - f12) / f16)) * f16) + f12;
            }
            this.f17433j[0].d(dA, this.f17441r);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f17434k;
            if (bVar != null) {
                double[] dArr = this.f17441r;
                if (dArr.length > 0) {
                    bVar.d(dA, dArr);
                }
            }
            this.f17429f.g(this.f17440q, this.f17441r, fArr, i11 * 2);
        }
    }

    int d(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrH = this.f17433j[0].h();
        if (iArr != null) {
            Iterator<d> it = this.f17447x.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().f17498q;
                i10++;
            }
        }
        int i11 = 0;
        for (double d10 : dArrH) {
            this.f17433j[0].d(d10, this.f17441r);
            this.f17429f.g(this.f17440q, this.f17441r, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    public int e(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrH = this.f17433j[0].h();
        if (iArr != null) {
            Iterator<d> it = this.f17447x.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().f17498q;
                i10++;
            }
        }
        if (iArr2 != null) {
            Iterator<d> it2 = this.f17447x.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                iArr2[i11] = (int) (it2.next().f17486e * 100.0f);
                i11++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < dArrH.length; i13++) {
            this.f17433j[0].d(dArrH[i13], this.f17441r);
            this.f17429f.h(dArrH[i13], this.f17440q, this.f17441r, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public void f(float[] fArr, int i10) {
        double dA;
        float f10 = 1.0f;
        float f11 = 1.0f / (i10 - 1);
        HashMap<String, o> map = this.B;
        o oVar = map == null ? null : map.get("translationX");
        HashMap<String, o> map2 = this.B;
        o oVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, h> map3 = this.C;
        h hVar = map3 == null ? null : map3.get("translationX");
        HashMap<String, h> map4 = this.C;
        h hVar2 = map4 != null ? map4.get("translationY") : null;
        int i11 = 0;
        while (i11 < i10) {
            float fMin = i11 * f11;
            float f12 = this.f17437n;
            if (f12 != f10) {
                float f13 = this.f17436m;
                if (fMin < f13) {
                    fMin = 0.0f;
                }
                if (fMin > f13 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f13) * f12, f10);
                }
            }
            float f14 = fMin;
            double d10 = f14;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f17429f.f17483b;
            float f15 = Float.NaN;
            float f16 = 0.0f;
            for (d dVar2 : this.f17447x) {
                androidx.constraintlayout.core.motion.utils.d dVar3 = dVar2.f17483b;
                double d11 = d10;
                if (dVar3 != null) {
                    float f17 = dVar2.f17485d;
                    if (f17 < f14) {
                        f16 = f17;
                        dVar = dVar3;
                    } else if (Float.isNaN(f15)) {
                        f15 = dVar2.f17485d;
                    }
                }
                d10 = d11;
            }
            double d12 = d10;
            if (dVar != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                float f18 = f15 - f16;
                dA = (((float) dVar.a((f14 - f16) / f18)) * f18) + f16;
            } else {
                dA = d12;
            }
            this.f17433j[0].d(dA, this.f17441r);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f17434k;
            if (bVar != null) {
                double[] dArr = this.f17441r;
                if (dArr.length > 0) {
                    bVar.d(dA, dArr);
                }
            }
            int i12 = i11 * 2;
            int i13 = i11;
            this.f17429f.h(dA, this.f17440q, this.f17441r, fArr, i12);
            if (hVar != null) {
                fArr[i12] = fArr[i12] + hVar.a(f14);
            } else if (oVar != null) {
                fArr[i12] = fArr[i12] + oVar.a(f14);
            }
            if (hVar2 != null) {
                int i14 = i12 + 1;
                fArr[i14] = fArr[i14] + hVar2.a(f14);
            } else if (oVar2 != null) {
                int i15 = i12 + 1;
                fArr[i15] = fArr[i15] + oVar2.a(f14);
            }
            i11 = i13 + 1;
            f10 = 1.0f;
        }
    }

    public void g(float f10, float[] fArr, int i10) {
        this.f17433j[0].d(j(f10, null), this.f17441r);
        this.f17429f.m(this.f17440q, this.f17441r, fArr, i10);
    }

    void h(float[] fArr, int i10) {
        float f10 = 1.0f / (i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17433j[0].d(j(i11 * f10, null), this.f17441r);
            this.f17429f.m(this.f17440q, this.f17441r, fArr, i11 * 8);
        }
    }

    void i(boolean z10) {
    }

    public int k() {
        return this.f17429f.f17494m;
    }

    int l(String str, float[] fArr, int i10) {
        o oVar = this.B.get(str);
        if (oVar == null) {
            return -1;
        }
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr[i11] = oVar.a(i11 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void m(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f17433j[0].d(d10, dArr);
        this.f17433j[0].g(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f17429f.i(d10, this.f17440q, dArr, fArr, dArr2, fArr2);
    }

    public float n() {
        return this.f17438o;
    }

    public float o() {
        return this.f17439p;
    }

    void p(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float fJ = j(f10, this.f17448y);
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = this.f17433j;
        int i10 = 0;
        if (bVarArr == null) {
            d dVar = this.f17430g;
            float f13 = dVar.f17487f;
            d dVar2 = this.f17429f;
            float f14 = f13 - dVar2.f17487f;
            float f15 = dVar.f17488g - dVar2.f17488g;
            float f16 = (dVar.f17489h - dVar2.f17489h) + f14;
            float f17 = (dVar.f17490i - dVar2.f17490i) + f15;
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            return;
        }
        double d10 = fJ;
        bVarArr[0].g(d10, this.f17442s);
        this.f17433j[0].d(d10, this.f17441r);
        float f18 = this.f17448y[0];
        while (true) {
            dArr = this.f17442s;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * ((double) f18);
            i10++;
        }
        androidx.constraintlayout.core.motion.utils.b bVar = this.f17434k;
        if (bVar == null) {
            this.f17429f.t(f11, f12, fArr, this.f17440q, dArr, this.f17441r);
            return;
        }
        double[] dArr2 = this.f17441r;
        if (dArr2.length > 0) {
            bVar.d(d10, dArr2);
            this.f17434k.g(d10, this.f17442s);
            this.f17429f.t(f11, f12, fArr, this.f17440q, this.f17442s, this.f17441r);
        }
    }

    public int q() {
        int iMax = this.f17429f.f17484c;
        Iterator<d> it = this.f17447x.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f17484c);
        }
        return Math.max(iMax, this.f17430g.f17484c);
    }

    public float r() {
        return this.f17430g.f17490i;
    }

    public float s() {
        return this.f17430g.f17489h;
    }

    public float t() {
        return this.f17430g.f17487f;
    }

    public String toString() {
        return " start: x: " + this.f17429f.f17487f + " y: " + this.f17429f.f17488g + " end: x: " + this.f17430g.f17487f + " y: " + this.f17430g.f17488g;
    }

    public float u() {
        return this.f17430g.f17488g;
    }

    public d w(int i10) {
        return this.f17447x.get(i10);
    }

    public int x(int i10, int[] iArr) {
        float[] fArr = new float[2];
        int i11 = 0;
        int i12 = 0;
        for (androidx.constraintlayout.core.motion.key.b bVar : this.f17449z) {
            int i13 = bVar.f17569k;
            if (i13 == i10 || i10 != -1) {
                iArr[i12] = 0;
                int i14 = i12 + 1;
                iArr[i14] = i13;
                int i15 = i14 + 1;
                int i16 = bVar.f17566h;
                iArr[i15] = i16;
                double d10 = i16 / 100.0f;
                this.f17433j[0].d(d10, this.f17441r);
                this.f17429f.h(d10, this.f17440q, this.f17441r, fArr, 0);
                int i17 = i15 + 1;
                iArr[i17] = Float.floatToIntBits(fArr[0]);
                int i18 = i17 + 1;
                iArr[i18] = Float.floatToIntBits(fArr[1]);
                if (bVar instanceof androidx.constraintlayout.core.motion.key.e) {
                    androidx.constraintlayout.core.motion.key.e eVar = (androidx.constraintlayout.core.motion.key.e) bVar;
                    int i19 = i18 + 1;
                    iArr[i19] = eVar.I;
                    int i20 = i19 + 1;
                    iArr[i20] = Float.floatToIntBits(eVar.E);
                    i18 = i20 + 1;
                    iArr[i18] = Float.floatToIntBits(eVar.F);
                }
                int i21 = i18 + 1;
                iArr[i12] = i21 - i12;
                i11++;
                i12 = i21;
            }
        }
        return i11;
    }

    float y(int i10, float f10, float f11) {
        d dVar = this.f17430g;
        float f12 = dVar.f17487f;
        d dVar2 = this.f17429f;
        float f13 = dVar2.f17487f;
        float f14 = f12 - f13;
        float f15 = dVar.f17488g;
        float f16 = dVar2.f17488g;
        float f17 = f15 - f16;
        float f18 = f13 + (dVar2.f17489h / 2.0f);
        float f19 = f16 + (dVar2.f17490i / 2.0f);
        float fHypot = (float) Math.hypot(f14, f17);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f20 = f10 - f18;
        float f21 = f11 - f19;
        if (((float) Math.hypot(f20, f21)) == 0.0f) {
            return 0.0f;
        }
        float f22 = (f20 * f14) + (f21 * f17);
        if (i10 == 0) {
            return f22 / fHypot;
        }
        if (i10 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f22 * f22));
        }
        if (i10 == 2) {
            return f20 / f14;
        }
        if (i10 == 3) {
            return f21 / f14;
        }
        if (i10 == 4) {
            return f20 / f17;
        }
        if (i10 != 5) {
            return 0.0f;
        }
        return f21 / f17;
    }

    public int z(int[] iArr, float[] fArr) {
        int i10 = 0;
        int i11 = 0;
        for (androidx.constraintlayout.core.motion.key.b bVar : this.f17449z) {
            int i12 = bVar.f17566h;
            iArr[i10] = (bVar.f17569k * 1000) + i12;
            double d10 = i12 / 100.0f;
            this.f17433j[0].d(d10, this.f17441r);
            this.f17429f.h(d10, this.f17440q, this.f17441r, fArr, i11);
            i11 += 2;
            i10++;
        }
        return i10;
    }
}
