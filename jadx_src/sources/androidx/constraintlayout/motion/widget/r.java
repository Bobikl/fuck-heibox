package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.n0;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: MotionPaths.java */
/* JADX INFO: loaded from: classes.dex */
public class r implements Comparable<r> {
    static final int A = 3;
    static final int B = 4;
    static final int C = 5;
    static final int D = 1;
    static final int E = 0;
    static final int F = 2;
    static String[] G = {CommonNetImpl.POSITION, "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f18939u = "MotionPaths";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f18940v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f18941w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int f18942x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f18943y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f18944z = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.core.motion.utils.d f18945b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f18947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f18948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f18949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f18950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f18951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f18952i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f18955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f18956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f18957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    o f18958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    LinkedHashMap<String, ConstraintAttribute> f18959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f18960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f18961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    double[] f18962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    double[] f18963t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f18946c = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f18953j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f18954k = Float.NaN;

    public r() {
        int i10 = f.f18718f;
        this.f18955l = i10;
        this.f18956m = i10;
        this.f18957n = Float.NaN;
        this.f18958o = null;
        this.f18959p = new LinkedHashMap<>();
        this.f18960q = 0;
        this.f18962s = new double[18];
        this.f18963t = new double[18];
    }

    public r(int i10, int i11, j jVar, r rVar, r rVar2) {
        int i12 = f.f18718f;
        this.f18955l = i12;
        this.f18956m = i12;
        this.f18957n = Float.NaN;
        this.f18958o = null;
        this.f18959p = new LinkedHashMap<>();
        this.f18960q = 0;
        this.f18962s = new double[18];
        this.f18963t = new double[18];
        if (rVar.f18956m != f.f18718f) {
            q(i10, i11, jVar, rVar, rVar2);
            return;
        }
        int i13 = jVar.O;
        if (i13 == 1) {
            p(jVar, rVar, rVar2);
        } else if (i13 != 2) {
            o(jVar, rVar, rVar2);
        } else {
            r(i10, i11, jVar, rVar, rVar2);
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

    public void a(androidx.constraintlayout.widget.c.a aVar) {
        this.f18945b = androidx.constraintlayout.core.motion.utils.d.c(aVar.f19563d.f19671d);
        androidx.constraintlayout.widget.c.C0117c c0117c = aVar.f19563d;
        this.f18955l = c0117c.f19672e;
        this.f18956m = c0117c.f19669b;
        this.f18953j = c0117c.f19676i;
        this.f18946c = c0117c.f19673f;
        this.f18961r = c0117c.f19670c;
        this.f18954k = aVar.f19562c.f19686e;
        this.f18957n = aVar.f19564e.C;
        for (String str : aVar.f19566g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f19566g.get(str);
            if (constraintAttribute != null && constraintAttribute.h()) {
                this.f18959p.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@n0 r rVar) {
        return Float.compare(this.f18948e, rVar.f18948e);
    }

    public void c(o oVar) {
        oVar.A(this.f18954k);
    }

    void e(r rVar, boolean[] zArr, String[] strArr, boolean z10) {
        boolean zD = d(this.f18949f, rVar.f18949f);
        boolean zD2 = d(this.f18950g, rVar.f18950g);
        zArr[0] = zArr[0] | d(this.f18948e, rVar.f18948e);
        boolean z11 = zD | zD2 | z10;
        zArr[1] = zArr[1] | z11;
        zArr[2] = z11 | zArr[2];
        zArr[3] = zArr[3] | d(this.f18951h, rVar.f18951h);
        zArr[4] = d(this.f18952i, rVar.f18952i) | zArr[4];
    }

    void f(double[] dArr, int[] iArr) {
        float[] fArr = {this.f18948e, this.f18949f, this.f18950g, this.f18951h, this.f18952i, this.f18953j};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 6) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    void g(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f18951h;
        float f11 = this.f18952i;
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
        float fSin = this.f18949f;
        float fCos = this.f18950g;
        float f10 = this.f18951h;
        float f11 = this.f18952i;
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
        o oVar = this.f18958o;
        if (oVar != null) {
            float[] fArr2 = new float[2];
            oVar.m(d10, fArr2, new float[2]);
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
        float f10 = this.f18949f;
        float f11 = this.f18950g;
        float f12 = this.f18951h;
        float f13 = this.f18952i;
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
        o oVar = this.f18958o;
        if (oVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            oVar.m(d10, fArr3, fArr4);
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
        float fSin = this.f18949f;
        float fCos = this.f18950g;
        float f10 = this.f18951h;
        float f11 = this.f18952i;
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
        o oVar = this.f18958o;
        if (oVar != null) {
            float[] fArr2 = new float[2];
            oVar.m(d10, fArr2, new float[2]);
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
        ConstraintAttribute constraintAttribute = this.f18959p.get(str);
        int i11 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.i() == 1) {
            dArr[i10] = constraintAttribute.f();
            return 1;
        }
        int i12 = constraintAttribute.i();
        float[] fArr = new float[i12];
        constraintAttribute.g(fArr);
        while (i11 < i12) {
            dArr[i10] = fArr[i11];
            i11++;
            i10++;
        }
        return i12;
    }

    int l(String str) {
        ConstraintAttribute constraintAttribute = this.f18959p.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.i();
    }

    void m(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f18949f;
        float fCos = this.f18950g;
        float f11 = this.f18951h;
        float f12 = this.f18952i;
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
        o oVar = this.f18958o;
        if (oVar != null) {
            float fN = oVar.n();
            float fO = this.f18958o.o();
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
        return this.f18959p.containsKey(str);
    }

    void o(j jVar, r rVar, r rVar2) {
        float f10 = jVar.f18739a / 100.0f;
        this.f18947d = f10;
        this.f18946c = jVar.H;
        float f11 = Float.isNaN(jVar.I) ? f10 : jVar.I;
        float f12 = Float.isNaN(jVar.J) ? f10 : jVar.J;
        float f13 = rVar2.f18951h;
        float f14 = rVar.f18951h;
        float f15 = rVar2.f18952i;
        float f16 = rVar.f18952i;
        this.f18948e = this.f18947d;
        float f17 = rVar.f18949f;
        float f18 = rVar.f18950g;
        float f19 = (rVar2.f18949f + (f13 / 2.0f)) - ((f14 / 2.0f) + f17);
        float f20 = (rVar2.f18950g + (f15 / 2.0f)) - (f18 + (f16 / 2.0f));
        float f21 = (f13 - f14) * f11;
        float f22 = f21 / 2.0f;
        this.f18949f = (int) ((f17 + (f19 * f10)) - f22);
        float f23 = (f15 - f16) * f12;
        float f24 = f23 / 2.0f;
        this.f18950g = (int) ((f18 + (f20 * f10)) - f24);
        this.f18951h = (int) (f14 + f21);
        this.f18952i = (int) (f16 + f23);
        float f25 = Float.isNaN(jVar.K) ? f10 : jVar.K;
        float f26 = Float.isNaN(jVar.N) ? 0.0f : jVar.N;
        if (!Float.isNaN(jVar.L)) {
            f10 = jVar.L;
        }
        float f27 = Float.isNaN(jVar.M) ? 0.0f : jVar.M;
        this.f18960q = 0;
        this.f18949f = (int) (((rVar.f18949f + (f25 * f19)) + (f27 * f20)) - f22);
        this.f18950g = (int) (((rVar.f18950g + (f19 * f26)) + (f20 * f10)) - f24);
        this.f18945b = androidx.constraintlayout.core.motion.utils.d.c(jVar.F);
        this.f18955l = jVar.G;
    }

    void p(j jVar, r rVar, r rVar2) {
        float f10 = jVar.f18739a / 100.0f;
        this.f18947d = f10;
        this.f18946c = jVar.H;
        float f11 = Float.isNaN(jVar.I) ? f10 : jVar.I;
        float f12 = Float.isNaN(jVar.J) ? f10 : jVar.J;
        float f13 = rVar2.f18951h - rVar.f18951h;
        float f14 = rVar2.f18952i - rVar.f18952i;
        this.f18948e = this.f18947d;
        if (!Float.isNaN(jVar.K)) {
            f10 = jVar.K;
        }
        float f15 = rVar.f18949f;
        float f16 = rVar.f18951h;
        float f17 = rVar.f18950g;
        float f18 = rVar.f18952i;
        float f19 = (rVar2.f18949f + (rVar2.f18951h / 2.0f)) - ((f16 / 2.0f) + f15);
        float f20 = (rVar2.f18950g + (rVar2.f18952i / 2.0f)) - ((f18 / 2.0f) + f17);
        float f21 = f19 * f10;
        float f22 = f13 * f11;
        float f23 = f22 / 2.0f;
        this.f18949f = (int) ((f15 + f21) - f23);
        float f24 = f10 * f20;
        float f25 = f14 * f12;
        float f26 = f25 / 2.0f;
        this.f18950g = (int) ((f17 + f24) - f26);
        this.f18951h = (int) (f16 + f22);
        this.f18952i = (int) (f18 + f25);
        float f27 = Float.isNaN(jVar.L) ? 0.0f : jVar.L;
        this.f18960q = 1;
        float f28 = (int) ((rVar.f18949f + f21) - f23);
        float f29 = (int) ((rVar.f18950g + f24) - f26);
        this.f18949f = f28 + ((-f20) * f27);
        this.f18950g = f29 + (f19 * f27);
        this.f18956m = this.f18956m;
        this.f18945b = androidx.constraintlayout.core.motion.utils.d.c(jVar.F);
        this.f18955l = jVar.G;
    }

    void q(int i10, int i11, j jVar, r rVar, r rVar2) {
        float fMin;
        float f10;
        float f11 = jVar.f18739a / 100.0f;
        this.f18947d = f11;
        this.f18946c = jVar.H;
        this.f18960q = jVar.O;
        float f12 = Float.isNaN(jVar.I) ? f11 : jVar.I;
        float f13 = Float.isNaN(jVar.J) ? f11 : jVar.J;
        float f14 = rVar2.f18951h;
        float f15 = rVar.f18951h;
        float f16 = rVar2.f18952i;
        float f17 = rVar.f18952i;
        this.f18948e = this.f18947d;
        this.f18951h = (int) (f15 + ((f14 - f15) * f12));
        this.f18952i = (int) (f17 + ((f16 - f17) * f13));
        int i12 = jVar.O;
        if (i12 == 1) {
            float f18 = Float.isNaN(jVar.K) ? f11 : jVar.K;
            float f19 = rVar2.f18949f;
            float f20 = rVar.f18949f;
            this.f18949f = (f18 * (f19 - f20)) + f20;
            if (!Float.isNaN(jVar.L)) {
                f11 = jVar.L;
            }
            float f21 = rVar2.f18950g;
            float f22 = rVar.f18950g;
            this.f18950g = (f11 * (f21 - f22)) + f22;
        } else if (i12 != 2) {
            float f23 = Float.isNaN(jVar.K) ? f11 : jVar.K;
            float f24 = rVar2.f18949f;
            float f25 = rVar.f18949f;
            this.f18949f = (f23 * (f24 - f25)) + f25;
            if (!Float.isNaN(jVar.L)) {
                f11 = jVar.L;
            }
            float f26 = rVar2.f18950g;
            float f27 = rVar.f18950g;
            this.f18950g = (f11 * (f26 - f27)) + f27;
        } else {
            if (Float.isNaN(jVar.K)) {
                float f28 = rVar2.f18949f;
                float f29 = rVar.f18949f;
                fMin = ((f28 - f29) * f11) + f29;
            } else {
                fMin = Math.min(f13, f12) * jVar.K;
            }
            this.f18949f = fMin;
            if (Float.isNaN(jVar.L)) {
                float f30 = rVar2.f18950g;
                float f31 = rVar.f18950g;
                f10 = (f11 * (f30 - f31)) + f31;
            } else {
                f10 = jVar.L;
            }
            this.f18950g = f10;
        }
        this.f18956m = rVar.f18956m;
        this.f18945b = androidx.constraintlayout.core.motion.utils.d.c(jVar.F);
        this.f18955l = jVar.G;
    }

    void r(int i10, int i11, j jVar, r rVar, r rVar2) {
        float f10 = jVar.f18739a / 100.0f;
        this.f18947d = f10;
        this.f18946c = jVar.H;
        float f11 = Float.isNaN(jVar.I) ? f10 : jVar.I;
        float f12 = Float.isNaN(jVar.J) ? f10 : jVar.J;
        float f13 = rVar2.f18951h;
        float f14 = rVar.f18951h;
        float f15 = rVar2.f18952i;
        float f16 = rVar.f18952i;
        this.f18948e = this.f18947d;
        float f17 = rVar.f18949f;
        float f18 = rVar.f18950g;
        float f19 = rVar2.f18949f + (f13 / 2.0f);
        float f20 = rVar2.f18950g + (f15 / 2.0f);
        float f21 = (f13 - f14) * f11;
        this.f18949f = (int) ((f17 + ((f19 - ((f14 / 2.0f) + f17)) * f10)) - (f21 / 2.0f));
        float f22 = (f15 - f16) * f12;
        this.f18950g = (int) ((f18 + ((f20 - (f18 + (f16 / 2.0f))) * f10)) - (f22 / 2.0f));
        this.f18951h = (int) (f14 + f21);
        this.f18952i = (int) (f16 + f22);
        this.f18960q = 2;
        if (!Float.isNaN(jVar.K)) {
            this.f18949f = (int) (jVar.K * ((int) (i10 - this.f18951h)));
        }
        if (!Float.isNaN(jVar.L)) {
            this.f18950g = (int) (jVar.L * ((int) (i11 - this.f18952i)));
        }
        this.f18956m = this.f18956m;
        this.f18945b = androidx.constraintlayout.core.motion.utils.d.c(jVar.F);
        this.f18955l = jVar.G;
    }

    void s(float f10, float f11, float f12, float f13) {
        this.f18949f = f10;
        this.f18950g = f11;
        this.f18951h = f12;
        this.f18952i = f13;
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

    /* JADX WARN: Multi-variable type inference failed */
    void w(float f10, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f11;
        boolean z10;
        boolean z11;
        float f12;
        float f13 = this.f18949f;
        float f14 = this.f18950g;
        float f15 = this.f18951h;
        float f16 = this.f18952i;
        if (iArr.length != 0 && this.f18962s.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.f18962s = new double[i10];
            this.f18963t = new double[i10];
        }
        Arrays.fill(this.f18962s, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.f18962s;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.f18963t[i12] = dArr2[i11];
        }
        float f17 = Float.NaN;
        int i13 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (true) {
            double[] dArr5 = this.f18962s;
            if (i13 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f12 = f17;
            } else {
                double d10 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.f18962s[i13])) {
                    d10 = this.f18962s[i13] + d10;
                }
                f12 = f17;
                float f22 = (float) d10;
                float f23 = (float) this.f18963t[i13];
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
        o oVar = this.f18958o;
        if (oVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            oVar.m(f10, fArr, fArr2);
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
                z10 = false;
                dArr2[0] = fSin2;
                z11 = true;
                dArr2[1] = fCos2;
            } else {
                z10 = false;
                z11 = true;
            }
            if (!Float.isNaN(f24)) {
                view.setRotation((float) (((double) f24) + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f13 = fSin;
            f14 = fCos;
        } else {
            f11 = f16;
            z10 = false;
            z11 = true;
            if (!Float.isNaN(f24)) {
                view.setRotation((float) (((double) 0.0f) + ((double) f24) + Math.toDegrees(Math.atan2(f19 + (f21 / 2.0f), f18 + (f20 / 2.0f)))));
            }
        }
        if (view instanceof e) {
            ((e) view).a(f13, f14, f15 + f13, f14 + f11);
            return;
        }
        float f29 = f13 + 0.5f;
        int i14 = (int) f29;
        float f30 = f14 + 0.5f;
        int i15 = (int) f30;
        int i16 = (int) (f29 + f15);
        int i17 = (int) (f30 + f11);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (i18 != view.getMeasuredWidth() || i19 != view.getMeasuredHeight()) {
            z10 = z11;
        }
        if (z10) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
        view.layout(i14, i15, i16, i17);
    }

    public void x(o oVar, r rVar) {
        double d10 = ((this.f18949f + (this.f18951h / 2.0f)) - rVar.f18949f) - (rVar.f18951h / 2.0f);
        double d11 = ((this.f18950g + (this.f18952i / 2.0f)) - rVar.f18950g) - (rVar.f18952i / 2.0f);
        this.f18958o = oVar;
        this.f18949f = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f18957n)) {
            this.f18950g = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f18950g = (float) Math.toRadians(this.f18957n);
        }
    }
}
