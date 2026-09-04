package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: TimeCycleSplineSet.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f17817k = "SplineSet";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final int f17818l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final int f17819m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final int f17820n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static float f17821o = 6.2831855f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected androidx.constraintlayout.core.motion.utils.b f17822a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f17826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f17827f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected long f17830i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f17823b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int[] f17824c = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float[][] f17825d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected float[] f17828g = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f17829h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f17831j = Float.NaN;

    /* JADX INFO: compiled from: TimeCycleSplineSet.java */
    public static class a extends t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f17832p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        i.a f17833q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        i.c f17834r = new i.c();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        float[] f17835s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float[] f17836t;

        public a(String str, i.a aVar) {
            this.f17832p = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
            this.f17833q = aVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void c(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void f(int i10) {
            int iF = this.f17833q.f();
            int iJ = this.f17833q.g(0).j();
            double[] dArr = new double[iF];
            int i11 = iJ + 2;
            this.f17835s = new float[i11];
            this.f17836t = new float[iJ];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, i11);
            for (int i12 = 0; i12 < iF; i12++) {
                int iD = this.f17833q.d(i12);
                CustomAttribute customAttributeG = this.f17833q.g(i12);
                float[] fArrG = this.f17834r.g(i12);
                dArr[i12] = ((double) iD) * 0.01d;
                customAttributeG.g(this.f17835s);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f17835s;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iJ] = fArrG[0];
                dArr3[iJ + 1] = fArrG[1];
            }
            this.f17822a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
        }

        public void g(int i10, CustomAttribute customAttribute, float f10, int i11, float f11) {
            this.f17833q.a(i10, customAttribute);
            this.f17834r.a(i10, new float[]{f10, f11});
            this.f17823b = Math.max(this.f17823b, i11);
        }

        public boolean h(androidx.constraintlayout.core.motion.e eVar, float f10, long j10, g gVar) {
            this.f17822a.e(f10, this.f17835s);
            float[] fArr = this.f17835s;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f17830i;
            if (Float.isNaN(this.f17831j)) {
                float fA = gVar.a(eVar, this.f17832p, 0);
                this.f17831j = fA;
                if (Float.isNaN(fA)) {
                    this.f17831j = 0.0f;
                }
            }
            float f13 = (float) ((((double) this.f17831j) + ((j11 * 1.0E-9d) * ((double) f11))) % 1.0d);
            this.f17831j = f13;
            this.f17830i = j10;
            float fA2 = a(f13);
            this.f17829h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f17836t;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f17829h;
                float f14 = this.f17835s[i10];
                this.f17829h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA2) + f12;
                i10++;
            }
            this.f17833q.g(0).o(eVar, this.f17836t);
            if (f11 != 0.0f) {
                this.f17829h = true;
            }
            return this.f17829h;
        }
    }

    /* JADX INFO: compiled from: TimeCycleSplineSet.java */
    public static class b extends t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f17837p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        i.b f17838q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        i.c f17839r = new i.c();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        float[] f17840s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float[] f17841t;

        public b(String str, i.b bVar) {
            this.f17837p = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
            this.f17838q = bVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void c(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void f(int i10) {
            int iF = this.f17838q.f();
            int iR = this.f17838q.g(0).r();
            double[] dArr = new double[iF];
            int i11 = iR + 2;
            this.f17840s = new float[i11];
            this.f17841t = new float[iR];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, i11);
            for (int i12 = 0; i12 < iF; i12++) {
                int iD = this.f17838q.d(i12);
                androidx.constraintlayout.core.motion.a aVarG = this.f17838q.g(i12);
                float[] fArrG = this.f17839r.g(i12);
                dArr[i12] = ((double) iD) * 0.01d;
                aVarG.o(this.f17840s);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f17840s;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iR] = fArrG[0];
                dArr3[iR + 1] = fArrG[1];
            }
            this.f17822a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
        }

        public void g(int i10, androidx.constraintlayout.core.motion.a aVar, float f10, int i11, float f11) {
            this.f17838q.a(i10, aVar);
            this.f17839r.a(i10, new float[]{f10, f11});
            this.f17823b = Math.max(this.f17823b, i11);
        }

        public boolean h(androidx.constraintlayout.core.motion.e eVar, float f10, long j10, g gVar) {
            this.f17822a.e(f10, this.f17840s);
            float[] fArr = this.f17840s;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f17830i;
            if (Float.isNaN(this.f17831j)) {
                float fA = gVar.a(eVar, this.f17837p, 0);
                this.f17831j = fA;
                if (Float.isNaN(fA)) {
                    this.f17831j = 0.0f;
                }
            }
            float f13 = (float) ((((double) this.f17831j) + ((j11 * 1.0E-9d) * ((double) f11))) % 1.0d);
            this.f17831j = f13;
            this.f17830i = j10;
            float fA2 = a(f13);
            this.f17829h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f17841t;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f17829h;
                float f14 = this.f17840s[i10];
                this.f17829h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA2) + f12;
                i10++;
            }
            this.f17838q.g(0).w(eVar, this.f17841t);
            if (f11 != 0.0f) {
                this.f17829h = true;
            }
            return this.f17829h;
        }
    }

    /* JADX INFO: compiled from: TimeCycleSplineSet.java */
    public static class c {
        protected c() {
        }

        static void a(int[] iArr, float[][] fArr, int i10, int i11) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i11;
            iArr2[1] = i10;
            int i12 = 2;
            while (i12 > 0) {
                int i13 = i12 - 1;
                int i14 = iArr2[i13];
                i12 = i13 - 1;
                int i15 = iArr2[i12];
                if (i14 < i15) {
                    int iB = b(iArr, fArr, i14, i15);
                    int i16 = i12 + 1;
                    iArr2[i12] = iB - 1;
                    int i17 = i16 + 1;
                    iArr2[i16] = i14;
                    int i18 = i17 + 1;
                    iArr2[i17] = i15;
                    i12 = i18 + 1;
                    iArr2[i18] = iB + 1;
                }
            }
        }

        private static int b(int[] iArr, float[][] fArr, int i10, int i11) {
            int i12 = iArr[i11];
            int i13 = i10;
            while (i10 < i11) {
                if (iArr[i10] <= i12) {
                    c(iArr, fArr, i13, i10);
                    i13++;
                }
                i10++;
            }
            c(iArr, fArr, i13, i11);
            return i13;
        }

        private static void c(int[] iArr, float[][] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float[] fArr2 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = fArr2;
        }
    }

    protected float a(float f10) {
        float fAbs;
        switch (this.f17823b) {
            case 1:
                return Math.signum(f10 * f17821o);
            case 2:
                fAbs = Math.abs(f10);
                break;
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f10 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f10 * f17821o);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f10 * f17821o);
        }
        return 1.0f - fAbs;
    }

    public androidx.constraintlayout.core.motion.utils.b b() {
        return this.f17822a;
    }

    public void c(int i10, float f10, float f11, int i11, float f12) {
        int[] iArr = this.f17824c;
        int i12 = this.f17826e;
        iArr[i12] = i10;
        float[] fArr = this.f17825d[i12];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        this.f17823b = Math.max(this.f17823b, i11);
        this.f17826e++;
    }

    protected void d(long j10) {
        this.f17830i = j10;
    }

    public void e(String str) {
        this.f17827f = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    public void f(int i10) {
        int i11 = this.f17826e;
        if (i11 == 0) {
            System.err.println("Error no points added to " + this.f17827f);
            return;
        }
        c.a(this.f17824c, this.f17825d, 0, i11 - 1);
        int i12 = 1;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f17824c;
            if (i12 >= iArr.length) {
                break;
            }
            if (iArr[i12] != iArr[i12 - 1]) {
                i13++;
            }
            i12++;
        }
        if (i13 == 0) {
            i13 = 1;
        }
        double[] dArr = new double[i13];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i13, 3);
        int i14 = 0;
        for (int i15 = 0; i15 < this.f17826e; i15++) {
            if (i15 > 0) {
                int[] iArr2 = this.f17824c;
                if (iArr2[i15] != iArr2[i15 - 1]) {
                    dArr[i14] = ((double) this.f17824c[i15]) * 0.01d;
                    double[] dArr3 = dArr2[i14];
                    float[] fArr = this.f17825d[i15];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i14++;
                }
            } else {
                dArr[i14] = ((double) this.f17824c[i15]) * 0.01d;
                double[] dArr4 = dArr2[i14];
                float[] fArr2 = this.f17825d[i15];
                dArr4[0] = fArr2[0];
                dArr4[1] = fArr2[1];
                dArr4[2] = fArr2[2];
                i14++;
            }
        }
        this.f17822a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
    }

    public String toString() {
        String str = this.f17827f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f17826e; i10++) {
            str = str + com.meituan.robust.Constants.ARRAY_TYPE + this.f17824c[i10] + " , " + decimalFormat.format(this.f17825d[i10]) + "] ";
        }
        return str;
    }
}
