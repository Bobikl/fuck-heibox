package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: compiled from: SplineSet.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f17773f = "SplineSet";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected androidx.constraintlayout.core.motion.utils.b f17774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int[] f17775b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected float[] f17776c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f17778e;

    /* JADX INFO: compiled from: SplineSet.java */
    public static class a extends o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f17779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f17780h;

        public a(String str, long j10) {
            this.f17779g = str;
            this.f17780h = j10;
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void h(w wVar, float f10) {
            wVar.b(wVar.e(this.f17779g), a(f10));
        }
    }

    /* JADX INFO: compiled from: SplineSet.java */
    public static class b extends o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f17781g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        i.a f17782h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float[] f17783i;

        public b(String str, i.a aVar) {
            this.f17781g = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
            this.f17782h = aVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void g(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void j(int i10) {
            int iF = this.f17782h.f();
            int iJ = this.f17782h.g(0).j();
            double[] dArr = new double[iF];
            this.f17783i = new float[iJ];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, iJ);
            for (int i11 = 0; i11 < iF; i11++) {
                int iD = this.f17782h.d(i11);
                CustomAttribute customAttributeG = this.f17782h.g(i11);
                dArr[i11] = ((double) iD) * 0.01d;
                customAttributeG.g(this.f17783i);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f17783i;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.f17774a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
        }

        public void k(int i10, CustomAttribute customAttribute) {
            this.f17782h.a(i10, customAttribute);
        }

        public void l(androidx.constraintlayout.core.state.o oVar, float f10) {
            this.f17774a.e(f10, this.f17783i);
            this.f17782h.g(0).o(oVar, this.f17783i);
        }
    }

    /* JADX INFO: compiled from: SplineSet.java */
    public static class c extends o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f17784g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        i.b f17785h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float[] f17786i;

        public c(String str, i.b bVar) {
            this.f17784g = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
            this.f17785h = bVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void g(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void h(w wVar, float f10) {
            l((androidx.constraintlayout.core.motion.e) wVar, f10);
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void j(int i10) {
            int iF = this.f17785h.f();
            int iR = this.f17785h.g(0).r();
            double[] dArr = new double[iF];
            this.f17786i = new float[iR];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, iR);
            for (int i11 = 0; i11 < iF; i11++) {
                int iD = this.f17785h.d(i11);
                androidx.constraintlayout.core.motion.a aVarG = this.f17785h.g(i11);
                dArr[i11] = ((double) iD) * 0.01d;
                aVarG.o(this.f17786i);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f17786i;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.f17774a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
        }

        public void k(int i10, androidx.constraintlayout.core.motion.a aVar) {
            this.f17785h.a(i10, aVar);
        }

        public void l(androidx.constraintlayout.core.motion.e eVar, float f10) {
            this.f17774a.e(f10, this.f17786i);
            this.f17785h.g(0).w(eVar, this.f17786i);
        }
    }

    /* JADX INFO: compiled from: SplineSet.java */
    public static class d {
        private d() {
        }

        static void a(int[] iArr, float[] fArr, int i10, int i11) {
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

        private static int b(int[] iArr, float[] fArr, int i10, int i11) {
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

        private static void c(int[] iArr, float[] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float f10 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = f10;
        }
    }

    public static o d(String str, i.a aVar) {
        return new b(str, aVar);
    }

    public static o e(String str, i.b bVar) {
        return new c(str, bVar);
    }

    public static o f(String str, long j10) {
        return new a(str, j10);
    }

    public float a(float f10) {
        return (float) this.f17774a.c(f10, 0);
    }

    public androidx.constraintlayout.core.motion.utils.b b() {
        return this.f17774a;
    }

    public float c(float f10) {
        return (float) this.f17774a.f(f10, 0);
    }

    public void g(int i10, float f10) {
        int[] iArr = this.f17775b;
        if (iArr.length < this.f17777d + 1) {
            this.f17775b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f17776c;
            this.f17776c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f17775b;
        int i11 = this.f17777d;
        iArr2[i11] = i10;
        this.f17776c[i11] = f10;
        this.f17777d = i11 + 1;
    }

    public void h(w wVar, float f10) {
        wVar.b(v.a(this.f17778e), a(f10));
    }

    public void i(String str) {
        this.f17778e = str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public void j(int i10) {
        int i11 = this.f17777d;
        if (i11 == 0) {
            return;
        }
        d.a(this.f17775b, this.f17776c, 0, i11 - 1);
        int i12 = 1;
        for (int i13 = 1; i13 < this.f17777d; i13++) {
            int[] iArr = this.f17775b;
            if (iArr[i13 - 1] != iArr[i13]) {
                i12++;
            }
        }
        double[] dArr = new double[i12];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i12, 1);
        int i14 = 0;
        for (int i15 = 0; i15 < this.f17777d; i15++) {
            if (i15 > 0) {
                int[] iArr2 = this.f17775b;
                if (iArr2[i15] != iArr2[i15 - 1]) {
                    dArr[i14] = ((double) this.f17775b[i15]) * 0.01d;
                    dArr2[i14][0] = this.f17776c[i15];
                    i14++;
                }
            } else {
                dArr[i14] = ((double) this.f17775b[i15]) * 0.01d;
                dArr2[i14][0] = this.f17776c[i15];
                i14++;
            }
        }
        this.f17774a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
    }

    public String toString() {
        String str = this.f17778e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f17777d; i10++) {
            str = str + com.meituan.robust.Constants.ARRAY_TYPE + this.f17775b[i10] + " , " + decimalFormat.format(this.f17776c[i10]) + "] ";
        }
        return str;
    }
}
