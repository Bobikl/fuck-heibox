package androidx.constraintlayout.core.motion.utils;

import com.meituan.robust.Constants;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: KeyCycleOscillator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f17688h = "KeyCycleOscillator";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b f17689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f17690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17692d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f17693e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17694f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<g> f17695g = new ArrayList<>();

    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public class a implements Comparator<g> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            return Integer.compare(gVar.f17719a, gVar2.f17719a);
        }
    }

    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public static class b extends h {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        String f17697i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f17698j;

        public b(String str) {
            this.f17697i = str;
            this.f17698j = y.a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.h
        public void h(androidx.constraintlayout.core.motion.e eVar, float f10) {
            eVar.b(this.f17698j, a(f10));
        }
    }

    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public static class c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final int f17699q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f17700r = "CycleOscillator";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        l f17702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f17703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f17704d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f17705e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float[] f17706f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        double[] f17707g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float[] f17708h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float[] f17709i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float[] f17710j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float[] f17711k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f17712l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.b f17713m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double[] f17714n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        double[] f17715o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f17716p;

        c(int i10, String str, int i11, int i12) {
            l lVar = new l();
            this.f17702b = lVar;
            this.f17703c = 0;
            this.f17704d = 1;
            this.f17705e = 2;
            this.f17712l = i10;
            this.f17701a = i11;
            lVar.g(i10, str);
            this.f17706f = new float[i12];
            this.f17707g = new double[i12];
            this.f17708h = new float[i12];
            this.f17709i = new float[i12];
            this.f17710j = new float[i12];
            this.f17711k = new float[i12];
        }

        public double a() {
            return this.f17714n[1];
        }

        public double b(float f10) {
            androidx.constraintlayout.core.motion.utils.b bVar = this.f17713m;
            if (bVar != null) {
                double d10 = f10;
                bVar.g(d10, this.f17715o);
                this.f17713m.d(d10, this.f17714n);
            } else {
                double[] dArr = this.f17715o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d11 = f10;
            double dE = this.f17702b.e(d11, this.f17714n[1]);
            double d12 = this.f17702b.d(d11, this.f17714n[1], this.f17715o[1]);
            double[] dArr2 = this.f17715o;
            return dArr2[0] + (dE * dArr2[2]) + (d12 * this.f17714n[2]);
        }

        public double c(float f10) {
            androidx.constraintlayout.core.motion.utils.b bVar = this.f17713m;
            if (bVar != null) {
                bVar.d(f10, this.f17714n);
            } else {
                double[] dArr = this.f17714n;
                dArr[0] = this.f17709i[0];
                dArr[1] = this.f17710j[0];
                dArr[2] = this.f17706f[0];
            }
            double[] dArr2 = this.f17714n;
            return dArr2[0] + (this.f17702b.e(f10, dArr2[1]) * this.f17714n[2]);
        }

        public void d(int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f17707g[i10] = ((double) i11) / 100.0d;
            this.f17708h[i10] = f10;
            this.f17709i[i10] = f11;
            this.f17710j[i10] = f12;
            this.f17706f[i10] = f13;
        }

        public void e(float f10) {
            this.f17716p = f10;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f17707g.length, 3);
            float[] fArr = this.f17706f;
            this.f17714n = new double[fArr.length + 2];
            this.f17715o = new double[fArr.length + 2];
            if (this.f17707g[0] > 0.0d) {
                this.f17702b.a(0.0d, this.f17708h[0]);
            }
            double[] dArr2 = this.f17707g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f17702b.a(1.0d, this.f17708h[length]);
            }
            for (int i10 = 0; i10 < dArr.length; i10++) {
                double[] dArr3 = dArr[i10];
                dArr3[0] = this.f17709i[i10];
                dArr3[1] = this.f17710j[i10];
                dArr3[2] = this.f17706f[i10];
                this.f17702b.a(this.f17707g[i10], this.f17708h[i10]);
            }
            this.f17702b.f();
            double[] dArr4 = this.f17707g;
            if (dArr4.length > 1) {
                this.f17713m = androidx.constraintlayout.core.motion.utils.b.a(0, dArr4, dArr);
            } else {
                this.f17713m = null;
            }
        }
    }

    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public static class d {
        private d() {
        }

        private static int a(int[] iArr, float[] fArr, int i10, int i11) {
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

        static void b(int[] iArr, float[] fArr, int i10, int i11) {
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
                    int iA = a(iArr, fArr, i14, i15);
                    int i16 = i12 + 1;
                    iArr2[i12] = iA - 1;
                    int i17 = i16 + 1;
                    iArr2[i16] = i14;
                    int i18 = i17 + 1;
                    iArr2[i17] = i15;
                    i12 = i18 + 1;
                    iArr2[i18] = iA + 1;
                }
            }
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

    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public static class e {
        private e() {
        }

        private static int a(int[] iArr, float[] fArr, float[] fArr2, int i10, int i11) {
            int i12 = iArr[i11];
            int i13 = i10;
            while (i10 < i11) {
                if (iArr[i10] <= i12) {
                    c(iArr, fArr, fArr2, i13, i10);
                    i13++;
                }
                i10++;
            }
            c(iArr, fArr, fArr2, i13, i11);
            return i13;
        }

        static void b(int[] iArr, float[] fArr, float[] fArr2, int i10, int i11) {
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
                    int iA = a(iArr, fArr, fArr2, i14, i15);
                    int i16 = i12 + 1;
                    iArr2[i12] = iA - 1;
                    int i17 = i16 + 1;
                    iArr2[i16] = i14;
                    int i18 = i17 + 1;
                    iArr2[i17] = i15;
                    i12 = i18 + 1;
                    iArr2[i18] = iA + 1;
                }
            }
        }

        private static void c(int[] iArr, float[] fArr, float[] fArr2, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float f10 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = f10;
            float f11 = fArr2[i10];
            fArr2[i10] = fArr2[i11];
            fArr2[i11] = f11;
        }
    }

    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public static class f extends h {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        String f17717i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f17718j;

        public f(String str) {
            this.f17717i = str;
            this.f17718j = y.a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.h
        public void h(androidx.constraintlayout.core.motion.e eVar, float f10) {
            eVar.b(this.f17718j, a(f10));
        }

        public void l(androidx.constraintlayout.core.motion.e eVar, float f10, double d10, double d11) {
            eVar.Q(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f17720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f17721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f17722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f17723e;

        public g(int i10, float f10, float f11, float f12, float f13) {
            this.f17719a = i10;
            this.f17720b = f13;
            this.f17721c = f11;
            this.f17722d = f10;
            this.f17723e = f12;
        }
    }

    public static h d(String str) {
        return str.equals("pathRotate") ? new f(str) : new b(str);
    }

    public float a(float f10) {
        return (float) this.f17690b.c(f10);
    }

    public androidx.constraintlayout.core.motion.utils.b b() {
        return this.f17689a;
    }

    public float c(float f10) {
        return (float) this.f17690b.b(f10);
    }

    protected void e(Object obj) {
    }

    public void f(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13) {
        this.f17695g.add(new g(i10, f10, f11, f12, f13));
        if (i12 != -1) {
            this.f17694f = i12;
        }
        this.f17692d = i11;
        this.f17693e = str;
    }

    public void g(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13, Object obj) {
        this.f17695g.add(new g(i10, f10, f11, f12, f13));
        if (i12 != -1) {
            this.f17694f = i12;
        }
        this.f17692d = i11;
        e(obj);
        this.f17693e = str;
    }

    public void h(androidx.constraintlayout.core.motion.e eVar, float f10) {
    }

    public void i(String str) {
        this.f17691c = str;
    }

    public void j(float f10) {
        int size = this.f17695g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f17695g, new a());
        double[] dArr = new double[size];
        char c10 = 0;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f17690b = new c(this.f17692d, this.f17693e, this.f17694f, size);
        int i10 = 0;
        for (g gVar : this.f17695g) {
            float f11 = gVar.f17722d;
            dArr[i10] = ((double) f11) * 0.01d;
            double[] dArr3 = dArr2[i10];
            float f12 = gVar.f17720b;
            dArr3[c10] = f12;
            float f13 = gVar.f17721c;
            dArr3[1] = f13;
            float f14 = gVar.f17723e;
            dArr3[2] = f14;
            this.f17690b.d(i10, gVar.f17719a, f11, f13, f14, f12);
            i10++;
            c10 = 0;
        }
        this.f17690b.e(f10);
        this.f17689a = androidx.constraintlayout.core.motion.utils.b.a(0, dArr, dArr2);
    }

    public boolean k() {
        return this.f17694f == 1;
    }

    public String toString() {
        String str = this.f17691c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (g gVar : this.f17695g) {
            str = str + Constants.ARRAY_TYPE + gVar.f17719a + " , " + decimalFormat.format(gVar.f17720b) + "] ";
        }
        return str;
    }
}
