package androidx.constraintlayout.core.motion;

import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: MotionPaths.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements Comparable<d> {
    static final int A = 3;
    static final int B = 4;
    static final int C = 5;
    public static final int D = 1;
    public static final int E = 0;
    public static final int F = 2;
    static String[] G = {CommonNetImpl.POSITION, "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f17477u = "MotionPaths";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f17478v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f17479w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int f17480x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f17481y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f17482z = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.core.motion.utils.d f17483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f17484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f17485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f17486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f17487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f17488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f17489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f17490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f17491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f17492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f17493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f17494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f17495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    b f17496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    HashMap<String, a> f17497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f17498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f17499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    double[] f17500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    double[] f17501t;

    public d() {
        this.f17484c = 0;
        this.f17491j = Float.NaN;
        this.f17492k = Float.NaN;
        this.f17493l = -1;
        this.f17494m = -1;
        this.f17495n = Float.NaN;
        this.f17496o = null;
        this.f17497p = new HashMap<>();
        this.f17498q = 0;
        this.f17500s = new double[18];
        this.f17501t = new double[18];
    }

    public d(int i10, int i11, androidx.constraintlayout.core.motion.key.e eVar, d dVar, d dVar2) {
        this.f17484c = 0;
        this.f17491j = Float.NaN;
        this.f17492k = Float.NaN;
        this.f17493l = -1;
        this.f17494m = -1;
        this.f17495n = Float.NaN;
        this.f17496o = null;
        this.f17497p = new HashMap<>();
        this.f17498q = 0;
        this.f17500s = new double[18];
        this.f17501t = new double[18];
        if (dVar.f17494m != -1) {
            q(i10, i11, eVar, dVar, dVar2);
            return;
        }
        int i12 = eVar.I;
        if (i12 == 1) {
            p(eVar, dVar, dVar2);
        } else if (i12 != 2) {
            o(eVar, dVar, dVar2);
        } else {
            r(i10, i11, eVar, dVar, dVar2);
        }
    }

    private boolean d(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    private static final float y(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (((f14 - f12) * f11) - ((f15 - f13) * f10)) + f12;
    }

    private static final float z(float f10, float f11, float f12, float f13, float f14, float f15) {
        return ((f14 - f12) * f10) + ((f15 - f13) * f11) + f13;
    }

    public void a(e eVar) {
        this.f17483b = androidx.constraintlayout.core.motion.utils.d.c(eVar.f17517i.f17526c);
        e.a aVar = eVar.f17517i;
        this.f17493l = aVar.f17527d;
        this.f17494m = aVar.f17524a;
        this.f17491j = aVar.f17531h;
        this.f17484c = aVar.f17528e;
        this.f17499r = aVar.f17525b;
        this.f17492k = eVar.f17518j.f17540d;
        this.f17495n = 0.0f;
        for (String str : eVar.j()) {
            a aVarI = eVar.i(str);
            if (aVarI != null && aVarI.q()) {
                this.f17497p.put(str, aVarI);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return Float.compare(this.f17486e, dVar.f17486e);
    }

    public void c(b bVar) {
        bVar.A(this.f17492k);
    }

    void e(d dVar, boolean[] zArr, String[] strArr, boolean z10) {
        boolean zD = d(this.f17487f, dVar.f17487f);
        boolean zD2 = d(this.f17488g, dVar.f17488g);
        zArr[0] = zArr[0] | d(this.f17486e, dVar.f17486e);
        boolean z11 = zD | zD2 | z10;
        zArr[1] = zArr[1] | z11;
        zArr[2] = z11 | zArr[2];
        zArr[3] = zArr[3] | d(this.f17489h, dVar.f17489h);
        zArr[4] = d(this.f17490i, dVar.f17490i) | zArr[4];
    }

    void f(double[] dArr, int[] iArr) {
        float[] fArr = {this.f17486e, this.f17487f, this.f17488g, this.f17489h, this.f17490i, this.f17491j};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 6) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    void g(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f17489h;
        float f11 = this.f17490i;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        fArr[i10] = f10;
        fArr[i10 + 1] = f11;
    }

    void h(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f17487f;
        float fCos = this.f17488g;
        float f10 = this.f17489h;
        float f11 = this.f17490i;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f12;
            } else if (i12 == 2) {
                fCos = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        b bVar = this.f17496o;
        if (bVar != null) {
            float[] fArr2 = new float[2];
            bVar.m(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) f14) - (d12 * Math.cos(d13))) - ((double) (f11 / 2.0f)));
        }
        fArr[i10] = fSin + (f10 / 2.0f) + 0.0f;
        fArr[i10 + 1] = fCos + (f11 / 2.0f) + 0.0f;
    }

    void i(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10 = this.f17487f;
        float f11 = this.f17488g;
        float f12 = this.f17489h;
        float f13 = this.f17490i;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f18 = (float) dArr[i10];
            float f19 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f10 = f18;
                f14 = f19;
            } else if (i11 == 2) {
                f11 = f18;
                f16 = f19;
            } else if (i11 == 3) {
                f12 = f18;
                f15 = f19;
            } else if (i11 == 4) {
                f13 = f18;
                f17 = f19;
            }
        }
        float f20 = 2.0f;
        float f21 = (f15 / 2.0f) + f14;
        float fCos = (f17 / 2.0f) + f16;
        b bVar = this.f17496o;
        if (bVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            bVar.m(d10, fArr3, fArr4);
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr4[0];
            float f25 = fArr4[1];
            double d11 = f10;
            double d12 = f11;
            float fSin = (float) ((((double) f22) + (Math.sin(d12) * d11)) - ((double) (f12 / 2.0f)));
            float fCos2 = (float) ((((double) f23) - (d11 * Math.cos(d12))) - ((double) (f13 / 2.0f)));
            double d13 = f14;
            double d14 = f16;
            float fSin2 = (float) (((double) f24) + (Math.sin(d12) * d13) + (Math.cos(d12) * d14));
            fCos = (float) ((((double) f25) - (d13 * Math.cos(d12))) + (Math.sin(d12) * d14));
            f21 = fSin2;
            f10 = fSin;
            f11 = fCos2;
            f20 = 2.0f;
        }
        fArr[0] = f10 + (f12 / f20) + 0.0f;
        fArr[1] = f11 + (f13 / f20) + 0.0f;
        fArr2[0] = f21;
        fArr2[1] = fCos;
    }

    void j(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f17487f;
        float fCos = this.f17488g;
        float f10 = this.f17489h;
        float f11 = this.f17490i;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f12;
            } else if (i12 == 2) {
                fCos = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        b bVar = this.f17496o;
        if (bVar != null) {
            float[] fArr2 = new float[2];
            bVar.m(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) f14) - (d12 * Math.cos(d13))) - ((double) (f11 / 2.0f)));
        }
        fArr[i10] = fSin + (f10 / 2.0f) + 0.0f;
        fArr[i10 + 1] = fCos + (f11 / 2.0f) + 0.0f;
    }

    int k(String str, double[] dArr, int i10) {
        a aVar = this.f17497p.get(str);
        int i11 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.r() == 1) {
            dArr[i10] = aVar.n();
            return 1;
        }
        int iR = aVar.r();
        float[] fArr = new float[iR];
        aVar.o(fArr);
        while (i11 < iR) {
            dArr[i10] = fArr[i11];
            i11++;
            i10++;
        }
        return iR;
    }

    int l(String str) {
        a aVar = this.f17497p.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.r();
    }

    void m(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f17487f;
        float fCos = this.f17488g;
        float f11 = this.f17489h;
        float f12 = this.f17490i;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f13;
            } else if (i12 == 2) {
                fCos = f13;
            } else if (i12 == 3) {
                f11 = f13;
            } else if (i12 == 4) {
                f12 = f13;
            }
        }
        b bVar = this.f17496o;
        if (bVar != null) {
            float fN = bVar.n();
            float fO = this.f17496o.o();
            double d10 = f10;
            double d11 = fCos;
            float fSin = (float) ((((double) fN) + (Math.sin(d11) * d10)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) fO) - (d10 * Math.cos(d11))) - ((double) (f12 / 2.0f)));
            f10 = fSin;
        }
        float f14 = f11 + f10;
        float f15 = f12 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i13 = i10 + 1;
        fArr[i10] = f10 + 0.0f;
        int i14 = i13 + 1;
        fArr[i13] = fCos + 0.0f;
        int i15 = i14 + 1;
        fArr[i14] = f14 + 0.0f;
        int i16 = i15 + 1;
        fArr[i15] = fCos + 0.0f;
        int i17 = i16 + 1;
        fArr[i16] = f14 + 0.0f;
        int i18 = i17 + 1;
        fArr[i17] = f15 + 0.0f;
        fArr[i18] = f10 + 0.0f;
        fArr[i18 + 1] = f15 + 0.0f;
    }

    boolean n(String str) {
        return this.f17497p.containsKey(str);
    }

    void o(androidx.constraintlayout.core.motion.key.e eVar, d dVar, d dVar2) {
        float f10 = eVar.f17566h / 100.0f;
        this.f17485d = f10;
        this.f17484c = eVar.B;
        float f11 = Float.isNaN(eVar.C) ? f10 : eVar.C;
        float f12 = Float.isNaN(eVar.D) ? f10 : eVar.D;
        float f13 = dVar2.f17489h;
        float f14 = dVar.f17489h;
        float f15 = dVar2.f17490i;
        float f16 = dVar.f17490i;
        this.f17486e = this.f17485d;
        float f17 = dVar.f17487f;
        float f18 = dVar.f17488g;
        float f19 = (dVar2.f17487f + (f13 / 2.0f)) - ((f14 / 2.0f) + f17);
        float f20 = (dVar2.f17488g + (f15 / 2.0f)) - (f18 + (f16 / 2.0f));
        float f21 = (f13 - f14) * f11;
        float f22 = f21 / 2.0f;
        this.f17487f = (int) ((f17 + (f19 * f10)) - f22);
        float f23 = (f15 - f16) * f12;
        float f24 = f23 / 2.0f;
        this.f17488g = (int) ((f18 + (f20 * f10)) - f24);
        this.f17489h = (int) (f14 + f21);
        this.f17490i = (int) (f16 + f23);
        float f25 = Float.isNaN(eVar.E) ? f10 : eVar.E;
        float f26 = Float.isNaN(eVar.H) ? 0.0f : eVar.H;
        if (!Float.isNaN(eVar.F)) {
            f10 = eVar.F;
        }
        float f27 = Float.isNaN(eVar.G) ? 0.0f : eVar.G;
        this.f17498q = 0;
        this.f17487f = (int) (((dVar.f17487f + (f25 * f19)) + (f27 * f20)) - f22);
        this.f17488g = (int) (((dVar.f17488g + (f19 * f26)) + (f20 * f10)) - f24);
        this.f17483b = androidx.constraintlayout.core.motion.utils.d.c(eVar.f17581z);
        this.f17493l = eVar.A;
    }

    void p(androidx.constraintlayout.core.motion.key.e eVar, d dVar, d dVar2) {
        float f10 = eVar.f17566h / 100.0f;
        this.f17485d = f10;
        this.f17484c = eVar.B;
        float f11 = Float.isNaN(eVar.C) ? f10 : eVar.C;
        float f12 = Float.isNaN(eVar.D) ? f10 : eVar.D;
        float f13 = dVar2.f17489h - dVar.f17489h;
        float f14 = dVar2.f17490i - dVar.f17490i;
        this.f17486e = this.f17485d;
        if (!Float.isNaN(eVar.E)) {
            f10 = eVar.E;
        }
        float f15 = dVar.f17487f;
        float f16 = dVar.f17489h;
        float f17 = dVar.f17488g;
        float f18 = dVar.f17490i;
        float f19 = (dVar2.f17487f + (dVar2.f17489h / 2.0f)) - ((f16 / 2.0f) + f15);
        float f20 = (dVar2.f17488g + (dVar2.f17490i / 2.0f)) - ((f18 / 2.0f) + f17);
        float f21 = f19 * f10;
        float f22 = f13 * f11;
        float f23 = f22 / 2.0f;
        this.f17487f = (int) ((f15 + f21) - f23);
        float f24 = f10 * f20;
        float f25 = f14 * f12;
        float f26 = f25 / 2.0f;
        this.f17488g = (int) ((f17 + f24) - f26);
        this.f17489h = (int) (f16 + f22);
        this.f17490i = (int) (f18 + f25);
        float f27 = Float.isNaN(eVar.F) ? 0.0f : eVar.F;
        this.f17498q = 1;
        float f28 = (int) ((dVar.f17487f + f21) - f23);
        float f29 = (int) ((dVar.f17488g + f24) - f26);
        this.f17487f = f28 + ((-f20) * f27);
        this.f17488g = f29 + (f19 * f27);
        this.f17494m = this.f17494m;
        this.f17483b = androidx.constraintlayout.core.motion.utils.d.c(eVar.f17581z);
        this.f17493l = eVar.A;
    }

    void q(int i10, int i11, androidx.constraintlayout.core.motion.key.e eVar, d dVar, d dVar2) {
        float fMin;
        float f10;
        float f11 = eVar.f17566h / 100.0f;
        this.f17485d = f11;
        this.f17484c = eVar.B;
        this.f17498q = eVar.I;
        float f12 = Float.isNaN(eVar.C) ? f11 : eVar.C;
        float f13 = Float.isNaN(eVar.D) ? f11 : eVar.D;
        float f14 = dVar2.f17489h;
        float f15 = dVar.f17489h;
        float f16 = dVar2.f17490i;
        float f17 = dVar.f17490i;
        this.f17486e = this.f17485d;
        this.f17489h = (int) (f15 + ((f14 - f15) * f12));
        this.f17490i = (int) (f17 + ((f16 - f17) * f13));
        int i12 = eVar.I;
        if (i12 == 1) {
            float f18 = Float.isNaN(eVar.E) ? f11 : eVar.E;
            float f19 = dVar2.f17487f;
            float f20 = dVar.f17487f;
            this.f17487f = (f18 * (f19 - f20)) + f20;
            if (!Float.isNaN(eVar.F)) {
                f11 = eVar.F;
            }
            float f21 = dVar2.f17488g;
            float f22 = dVar.f17488g;
            this.f17488g = (f11 * (f21 - f22)) + f22;
        } else if (i12 != 2) {
            float f23 = Float.isNaN(eVar.E) ? f11 : eVar.E;
            float f24 = dVar2.f17487f;
            float f25 = dVar.f17487f;
            this.f17487f = (f23 * (f24 - f25)) + f25;
            if (!Float.isNaN(eVar.F)) {
                f11 = eVar.F;
            }
            float f26 = dVar2.f17488g;
            float f27 = dVar.f17488g;
            this.f17488g = (f11 * (f26 - f27)) + f27;
        } else {
            if (Float.isNaN(eVar.E)) {
                float f28 = dVar2.f17487f;
                float f29 = dVar.f17487f;
                fMin = ((f28 - f29) * f11) + f29;
            } else {
                fMin = Math.min(f13, f12) * eVar.E;
            }
            this.f17487f = fMin;
            if (Float.isNaN(eVar.F)) {
                float f30 = dVar2.f17488g;
                float f31 = dVar.f17488g;
                f10 = (f11 * (f30 - f31)) + f31;
            } else {
                f10 = eVar.F;
            }
            this.f17488g = f10;
        }
        this.f17494m = dVar.f17494m;
        this.f17483b = androidx.constraintlayout.core.motion.utils.d.c(eVar.f17581z);
        this.f17493l = eVar.A;
    }

    void r(int i10, int i11, androidx.constraintlayout.core.motion.key.e eVar, d dVar, d dVar2) {
        float f10 = eVar.f17566h / 100.0f;
        this.f17485d = f10;
        this.f17484c = eVar.B;
        float f11 = Float.isNaN(eVar.C) ? f10 : eVar.C;
        float f12 = Float.isNaN(eVar.D) ? f10 : eVar.D;
        float f13 = dVar2.f17489h;
        float f14 = dVar.f17489h;
        float f15 = dVar2.f17490i;
        float f16 = dVar.f17490i;
        this.f17486e = this.f17485d;
        float f17 = dVar.f17487f;
        float f18 = dVar.f17488g;
        float f19 = dVar2.f17487f + (f13 / 2.0f);
        float f20 = dVar2.f17488g + (f15 / 2.0f);
        float f21 = (f13 - f14) * f11;
        this.f17487f = (int) ((f17 + ((f19 - ((f14 / 2.0f) + f17)) * f10)) - (f21 / 2.0f));
        float f22 = (f15 - f16) * f12;
        this.f17488g = (int) ((f18 + ((f20 - (f18 + (f16 / 2.0f))) * f10)) - (f22 / 2.0f));
        this.f17489h = (int) (f14 + f21);
        this.f17490i = (int) (f16 + f22);
        this.f17498q = 2;
        if (!Float.isNaN(eVar.E)) {
            this.f17487f = (int) (eVar.E * ((int) (i10 - this.f17489h)));
        }
        if (!Float.isNaN(eVar.F)) {
            this.f17488g = (int) (eVar.F * ((int) (i11 - this.f17490i)));
        }
        this.f17494m = this.f17494m;
        this.f17483b = androidx.constraintlayout.core.motion.utils.d.c(eVar.f17581z);
        this.f17493l = eVar.A;
    }

    void s(float f10, float f11, float f12, float f13) {
        this.f17487f = f10;
        this.f17488g = f11;
        this.f17489h = f12;
        this.f17490i = f13;
    }

    void t(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (f17 * (1.0f - f10)) + (((f13 * 1.0f) + f17) * f10) + 0.0f;
        fArr[1] = (f18 * (1.0f - f11)) + (((f15 * 1.0f) + f18) * f11) + 0.0f;
    }

    void w(float f10, e eVar, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f11;
        float f12;
        float f13 = this.f17487f;
        float f14 = this.f17488g;
        float f15 = this.f17489h;
        float f16 = this.f17490i;
        if (iArr.length != 0 && this.f17500s.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.f17500s = new double[i10];
            this.f17501t = new double[i10];
        }
        Arrays.fill(this.f17500s, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.f17500s;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.f17501t[i12] = dArr2[i11];
        }
        float f17 = Float.NaN;
        int i13 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (true) {
            double[] dArr5 = this.f17500s;
            if (i13 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f12 = f17;
            } else {
                double d10 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.f17500s[i13])) {
                    d10 = this.f17500s[i13] + d10;
                }
                f12 = f17;
                float f22 = (float) d10;
                float f23 = (float) this.f17501t[i13];
                if (i13 == 1) {
                    f17 = f12;
                    f18 = f23;
                    f13 = f22;
                } else if (i13 == 2) {
                    f17 = f12;
                    f19 = f23;
                    f14 = f22;
                } else if (i13 == 3) {
                    f17 = f12;
                    f20 = f23;
                    f15 = f22;
                } else if (i13 == 4) {
                    f17 = f12;
                    f21 = f23;
                    f16 = f22;
                } else if (i13 == 5) {
                    f17 = f22;
                }
                i13++;
            }
            f17 = f12;
            i13++;
        }
        float f24 = f17;
        b bVar = this.f17496o;
        if (bVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            bVar.m(f10, fArr, fArr2);
            float f25 = fArr[0];
            float f26 = fArr[1];
            float f27 = fArr2[0];
            float f28 = fArr2[1];
            double d11 = f13;
            double d12 = f14;
            float fSin = (float) ((((double) f25) + (Math.sin(d12) * d11)) - ((double) (f15 / 2.0f)));
            f11 = f16;
            float fCos = (float) ((((double) f26) - (Math.cos(d12) * d11)) - ((double) (f16 / 2.0f)));
            double d13 = f18;
            double d14 = f19;
            float fSin2 = (float) (((double) f27) + (Math.sin(d12) * d13) + (Math.cos(d12) * d11 * d14));
            float fCos2 = (float) ((((double) f28) - (d13 * Math.cos(d12))) + (d11 * Math.sin(d12) * d14));
            if (dArr2.length >= 2) {
                dArr2[0] = fSin2;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f24)) {
                eVar.Q((float) (((double) f24) + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f13 = fSin;
            f14 = fCos;
        } else {
            f11 = f16;
            if (!Float.isNaN(f24)) {
                eVar.Q((float) (((double) 0.0f) + ((double) f24) + Math.toDegrees(Math.atan2(f19 + (f21 / 2.0f), f18 + (f20 / 2.0f)))));
            }
        }
        float f29 = f13 + 0.5f;
        float f30 = f14 + 0.5f;
        eVar.G((int) f29, (int) f30, (int) (f29 + f15), (int) (f30 + f11));
    }

    public void x(b bVar, d dVar) {
        double d10 = ((this.f17487f + (this.f17489h / 2.0f)) - dVar.f17487f) - (dVar.f17489h / 2.0f);
        double d11 = ((this.f17488g + (this.f17490i / 2.0f)) - dVar.f17488g) - (dVar.f17490i / 2.0f);
        this.f17496o = bVar;
        this.f17487f = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f17495n)) {
            this.f17488g = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f17488g = (float) Math.toRadians(this.f17495n);
        }
    }
}
