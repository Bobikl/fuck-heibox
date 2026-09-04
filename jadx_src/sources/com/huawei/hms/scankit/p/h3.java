package com.huawei.hms.scankit.p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FinderPatternFinder.java */
/* JADX INFO: loaded from: classes7.dex */
public class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f61880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<g3> f61881b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f61882c = new int[5];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v6 f61883d;

    /* JADX INFO: compiled from: FinderPatternFinder.java */
    public static final class b implements Comparator<g3>, Serializable {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g3 g3Var, g3 g3Var2) {
            return Float.compare(g3Var2.e(), g3Var.e());
        }
    }

    /* JADX INFO: compiled from: FinderPatternFinder.java */
    public static final class c implements Comparator<g3>, Serializable {
        private c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g3 g3Var, g3 g3Var2) {
            return Integer.compare(g3Var2.a(), g3Var.a());
        }
    }

    /* JADX INFO: compiled from: FinderPatternFinder.java */
    public static final class d implements Comparator<g3>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f61884a;

        private d(float f10) {
            this.f61884a = f10;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g3 g3Var, g3 g3Var2) {
            return Float.compare(Math.abs(g3Var.e() - this.f61884a), Math.abs(g3Var2.e() - this.f61884a));
        }
    }

    public h3(s sVar, v6 v6Var) {
        this.f61880a = sVar;
        this.f61883d = v6Var;
    }

    private static double a(g3 g3Var, g3 g3Var2) {
        double dB = g3Var.b() - g3Var2.b();
        double dC = g3Var.c() - g3Var2.c();
        return (dB * dB) + (dC * dC);
    }

    private float a(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        s sVar = this.f61880a;
        int iE = sVar.e();
        int[] iArrA = a();
        int i17 = i10;
        while (i17 >= 0 && sVar.b(i17, i11)) {
            iArrA[2] = iArrA[2] + 1;
            i17--;
        }
        if (i17 < 0) {
            return Float.NaN;
        }
        while (i17 >= 0 && !sVar.b(i17, i11)) {
            int i18 = iArrA[1];
            if (i18 > i12) {
                break;
            }
            iArrA[1] = i18 + 1;
            i17--;
        }
        if (i17 < 0 || iArrA[1] > i12) {
            return Float.NaN;
        }
        while (i17 >= 0 && sVar.b(i17, i11) && (i16 = iArrA[0]) <= i12) {
            iArrA[0] = i16 + 1;
            i17--;
        }
        if (iArrA[0] > i12) {
            return Float.NaN;
        }
        int i19 = i10 + 1;
        while (i19 < iE && sVar.b(i19, i11)) {
            iArrA[2] = iArrA[2] + 1;
            i19++;
        }
        if (i19 == iE) {
            return Float.NaN;
        }
        while (i19 < iE && !sVar.b(i19, i11) && (i15 = iArrA[3]) < i12) {
            iArrA[3] = i15 + 1;
            i19++;
        }
        if (i19 == iE || iArrA[3] >= i12) {
            return Float.NaN;
        }
        while (i19 < iE && sVar.b(i19, i11) && (i14 = iArrA[4]) < i12) {
            iArrA[4] = i14 + 1;
            i19++;
        }
        int i20 = iArrA[4];
        if (i20 < i12 && Math.abs(((((iArrA[0] + iArrA[1]) + iArrA[2]) + iArrA[3]) + i20) - i13) * 5 < i13 && b(iArrA)) {
            return a(iArrA, i19);
        }
        return Float.NaN;
    }

    private static float a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private void a(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = 0;
        }
    }

    private boolean a(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] iArrA = a();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f61880a.b(i11 - i15, i10 - i15)) {
            iArrA[2] = iArrA[2] + 1;
            i15++;
        }
        if (iArrA[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f61880a.b(i11 - i15, i10 - i15)) {
            iArrA[1] = iArrA[1] + 1;
            i15++;
        }
        if (iArrA[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f61880a.b(i11 - i15, i10 - i15)) {
            iArrA[0] = iArrA[0] + 1;
            i15++;
        }
        if (iArrA[0] == 0) {
            return false;
        }
        int iC = this.f61880a.c();
        int iE = this.f61880a.e();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            if (i17 >= iC || (i14 = i11 + i16) >= iE || !this.f61880a.b(i14, i17)) {
                break;
            }
            iArrA[2] = iArrA[2] + 1;
            i16++;
        }
        while (true) {
            int i18 = i10 + i16;
            if (i18 >= iC || (i13 = i11 + i16) >= iE || this.f61880a.b(i13, i18)) {
                break;
            }
            iArrA[3] = iArrA[3] + 1;
            i16++;
        }
        if (iArrA[3] == 0) {
            return false;
        }
        while (true) {
            int i19 = i10 + i16;
            if (i19 >= iC || (i12 = i11 + i16) >= iE || !this.f61880a.b(i12, i19)) {
                break;
            }
            iArrA[4] = iArrA[4] + 1;
            i16++;
        }
        if (iArrA[4] == 0) {
            return false;
        }
        return c(iArrA);
    }

    private int[] a() {
        a(this.f61882c);
        return this.f61882c;
    }

    private float b(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        s sVar = this.f61880a;
        int iC = sVar.c();
        int[] iArrA = a();
        int i17 = i10;
        while (i17 >= 0 && sVar.b(i11, i17)) {
            iArrA[2] = iArrA[2] + 1;
            i17--;
        }
        if (i17 < 0) {
            return Float.NaN;
        }
        while (i17 >= 0 && !sVar.b(i11, i17)) {
            int i18 = iArrA[1];
            if (i18 > i12) {
                break;
            }
            iArrA[1] = i18 + 1;
            i17--;
        }
        if (i17 < 0 || iArrA[1] > i12) {
            return Float.NaN;
        }
        while (i17 >= 0 && sVar.b(i11, i17) && (i16 = iArrA[0]) <= i12) {
            iArrA[0] = i16 + 1;
            i17--;
        }
        if (iArrA[0] > i12) {
            return Float.NaN;
        }
        int i19 = i10 + 1;
        while (i19 < iC && sVar.b(i11, i19)) {
            iArrA[2] = iArrA[2] + 1;
            i19++;
        }
        if (i19 == iC) {
            return Float.NaN;
        }
        while (i19 < iC && !sVar.b(i11, i19) && (i15 = iArrA[3]) < i12) {
            iArrA[3] = i15 + 1;
            i19++;
        }
        if (i19 == iC || iArrA[3] >= i12) {
            return Float.NaN;
        }
        while (i19 < iC && sVar.b(i11, i19) && (i14 = iArrA[4]) < i12) {
            iArrA[4] = i14 + 1;
            i19++;
        }
        int i20 = iArrA[4];
        if (i20 < i12 && Math.abs(((((iArrA[0] + iArrA[1]) + iArrA[2]) + iArrA[3]) + i20) - i13) * 5 < i13 * 2 && b(iArrA)) {
            return a(iArrA, i19);
        }
        return Float.NaN;
    }

    protected static boolean b(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 6) {
            return false;
        }
        float f10 = i10 / 6.0f;
        float f11 = f10 / 1.5f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 2.0f) - ((float) iArr[2])) < 2.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    private g3[] b() throws com.huawei.hms.scankit.p.a {
        int i10 = 0;
        while (i10 < this.f61881b.size()) {
            g3 g3Var = this.f61881b.get(i10);
            if (g3Var.e() <= 5.0f && g3Var.a() <= 2) {
                this.f61881b.remove(i10);
                i10--;
            }
            i10++;
        }
        int size = this.f61881b.size();
        int i11 = 3;
        if (size < 3) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        if (size >= 4) {
            Iterator<g3> it = this.f61881b.iterator();
            float f10 = 0.0f;
            float fA = 0.0f;
            while (it.hasNext()) {
                fA += it.next().a();
            }
            float f11 = fA / size;
            int i12 = 0;
            while (i12 < this.f61881b.size() && this.f61881b.size() > 4) {
                if (this.f61881b.get(i12).a() <= 0.5f * f11) {
                    this.f61881b.remove(i12);
                    i12--;
                }
                i12++;
            }
            int size2 = this.f61881b.size();
            Iterator<g3> it2 = this.f61881b.iterator();
            float f12 = 0.0f;
            while (it2.hasNext()) {
                float fE = it2.next().e();
                f10 += fE;
                f12 += fE * fE;
            }
            float f13 = size2;
            float f14 = f10 / f13;
            float fSqrt = (float) Math.sqrt((f12 / f13) - (f14 * f14));
            Collections.sort(this.f61881b, new d(f14));
            float fMax = Math.max(0.36f * f14, fSqrt);
            int i13 = 0;
            while (i13 < this.f61881b.size() && this.f61881b.size() > 4) {
                if (Math.abs(this.f61881b.get(i13).e() - f14) > fMax) {
                    this.f61881b.remove(i13);
                    i13--;
                }
                i13++;
            }
            int size3 = this.f61881b.size();
            if (size3 >= 4) {
                Collections.sort(this.f61881b, new c());
                if (size3 > 4 && this.f61881b.get(3).a() - this.f61881b.get(4).a() > 2) {
                    while (4 < this.f61881b.size()) {
                        this.f61881b.remove(4);
                    }
                }
                double[] dArr = new double[3];
                while (i11 < this.f61881b.size()) {
                    dArr[0] = a(this.f61881b.get(0), this.f61881b.get(1));
                    dArr[1] = a(this.f61881b.get(1), this.f61881b.get(i11));
                    dArr[2] = a(this.f61881b.get(0), this.f61881b.get(i11));
                    Arrays.sort(dArr);
                    double d10 = dArr[1];
                    double d11 = dArr[0];
                    double dSqrt = ((d10 + d11) - dArr[2]) / ((Math.sqrt(d11) * 2.0d) * Math.sqrt(dArr[1]));
                    dArr[0] = a(this.f61881b.get(0), this.f61881b.get(2));
                    dArr[1] = a(this.f61881b.get(2), this.f61881b.get(i11));
                    dArr[2] = a(this.f61881b.get(0), this.f61881b.get(i11));
                    Arrays.sort(dArr);
                    double d12 = dArr[1];
                    double d13 = dArr[0];
                    double dSqrt2 = ((d12 + d13) - dArr[2]) / ((Math.sqrt(d13) * 2.0d) * Math.sqrt(dArr[1]));
                    if (Math.abs(dSqrt) > 0.25d || Math.abs(dSqrt2) > 0.25d) {
                        this.f61881b.remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        Collections.sort(this.f61881b, new b());
        List<g3> list = this.f61881b;
        return (g3[]) list.toArray(new g3[list.size()]);
    }

    protected static boolean c(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 6) {
            return false;
        }
        float f10 = i10 / 6.0f;
        float f11 = f10 / 1.0f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 2.0f) - ((float) iArr[2])) < 2.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    private void d(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    protected final boolean a(int[] iArr, int i10, int i11) {
        boolean z10 = false;
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(iArr, i11);
        float fB = b(i10, iA, iArr[2], i12);
        if (!Float.isNaN(fB)) {
            int i13 = (int) fB;
            float fA = a(iA, i13, iArr[2], i12);
            if (!Float.isNaN(fA) && a(i13, (int) fA)) {
                float f10 = i12 / 6.0f;
                for (int i14 = 0; i14 < this.f61881b.size(); i14++) {
                    g3 g3Var = this.f61881b.get(i14);
                    if (g3Var.b(f10, fB, fA)) {
                        this.f61881b.set(i14, g3Var.c(fB, fA, f10));
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    g3 g3Var2 = new g3(fA, fB, f10);
                    this.f61881b.add(g3Var2);
                    v6 v6Var = this.f61883d;
                    if (v6Var != null) {
                        v6Var.a(g3Var2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    final g3[] a(Map<l1, ?> map) throws com.huawei.hms.scankit.p.a {
        int iC = this.f61880a.c();
        int iE = this.f61880a.e();
        int[] iArr = new int[5];
        for (int i10 = 0; i10 < iC; i10++) {
            a(iArr);
            int i11 = 0;
            for (int i12 = 0; i12 < iE; i12++) {
                if (this.f61880a.b(i12, i10)) {
                    if ((i11 & 1) == 1) {
                        i11++;
                    }
                    iArr[i11] = iArr[i11] + 1;
                } else if ((i11 & 1) != 0) {
                    iArr[i11] = iArr[i11] + 1;
                } else if (i11 != 4) {
                    i11++;
                    iArr[i11] = iArr[i11] + 1;
                } else if (b(iArr) && a(iArr, i10, i12)) {
                    a(iArr);
                    i11 = 0;
                } else {
                    d(iArr);
                    i11 = 3;
                }
            }
            if (b(iArr)) {
                a(iArr, i10, iE);
            }
        }
        return b();
    }
}
