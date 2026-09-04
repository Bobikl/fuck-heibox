package com.huawei.hms.scankit.p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FinderPatternFinder.java */
/* JADX INFO: loaded from: classes7.dex */
public class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f61987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<f3> f61988b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f61989c = new int[5];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v6 f61990d;

    /* JADX INFO: compiled from: FinderPatternFinder.java */
    public static final class b implements Comparator<f3>, Serializable {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f3 f3Var, f3 f3Var2) {
            return Float.compare(f3Var2.e(), f3Var.e());
        }
    }

    /* JADX INFO: compiled from: FinderPatternFinder.java */
    public static final class c implements Comparator<f3>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f61991a;

        private c(float f10) {
            this.f61991a = f10;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f3 f3Var, f3 f3Var2) {
            return Float.compare(Math.abs(f3Var2.e() - this.f61991a), Math.abs(f3Var.e() - this.f61991a));
        }
    }

    public j3(s sVar, v6 v6Var) {
        this.f61987a = sVar;
        this.f61990d = v6Var;
    }

    private static float a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private void a(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = 0;
        }
    }

    private boolean a(int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int[] iArrA = a();
        int i16 = 0;
        while (i10 >= i16 && i11 >= i16 && this.f61987a.b(i11 - i16, i10 - i16)) {
            iArrA[2] = iArrA[2] + 1;
            i16++;
        }
        if (iArrA[2] == 0) {
            return false;
        }
        while (i10 >= i16 && i11 >= i16 && !this.f61987a.b(i11 - i16, i10 - i16)) {
            iArrA[1] = iArrA[1] + 1;
            i16++;
        }
        if (iArrA[1] == 0) {
            return false;
        }
        while (i10 >= i16 && i11 >= i16 && this.f61987a.b(i11 - i16, i10 - i16)) {
            iArrA[0] = iArrA[0] + 1;
            i16++;
        }
        if (iArrA[0] == 0) {
            return false;
        }
        int iC = this.f61987a.c();
        int iE = this.f61987a.e();
        int i17 = 1;
        while (true) {
            int i18 = i10 + i17;
            if (i18 >= iC || (i15 = i11 + i17) >= iE || !this.f61987a.b(i15, i18)) {
                break;
            }
            iArrA[2] = iArrA[2] + 1;
            i17++;
        }
        while (true) {
            int i19 = i10 + i17;
            if (i19 >= iC || (i14 = i11 + i17) >= iE || this.f61987a.b(i14, i19)) {
                break;
            }
            iArrA[3] = iArrA[3] + 1;
            i17++;
        }
        if (iArrA[3] == 0) {
            return false;
        }
        while (true) {
            int i20 = i10 + i17;
            if (i20 >= iC || (i13 = i11 + i17) >= iE || !this.f61987a.b(i13, i20)) {
                break;
            }
            iArrA[4] = iArrA[4] + 1;
            i17++;
        }
        int i21 = iArrA[4];
        if (i21 != 0 && Math.abs(((((iArrA[0] + iArrA[1]) + iArrA[2]) + iArrA[3]) + i21) - i12) < i12 * 0.5f) {
            return c(iArrA);
        }
        return false;
    }

    private int[] a() {
        a(this.f61989c);
        return this.f61989c;
    }

    private boolean b(int i10, int i11, int i12) {
        int i13;
        int i14;
        int[] iArrA = a();
        int iC = this.f61987a.c();
        int iE = this.f61987a.e();
        int i15 = 0;
        while (true) {
            int i16 = i10 + i15;
            if (i16 >= iC || i11 < i15 || !this.f61987a.b(i11 - i15, i16)) {
                break;
            }
            iArrA[2] = iArrA[2] + 1;
            i15++;
        }
        if (iArrA[2] == 0) {
            return false;
        }
        while (true) {
            int i17 = i10 + i15;
            if (i17 >= iC || i11 < i15 || this.f61987a.b(i11 - i15, i17)) {
                break;
            }
            iArrA[1] = iArrA[1] + 1;
            i15++;
        }
        if (iArrA[1] == 0) {
            return false;
        }
        while (true) {
            int i18 = i10 + i15;
            if (i18 >= iC || i11 < i15 || !this.f61987a.b(i11 - i15, i18)) {
                break;
            }
            iArrA[0] = iArrA[0] + 1;
            i15++;
        }
        if (iArrA[0] == 0) {
            return false;
        }
        int i19 = 1;
        while (i10 >= i19) {
            int i20 = i11 + i19;
            if (i20 >= iE || !this.f61987a.b(i20, i10 - i19)) {
                break;
            }
            iArrA[2] = iArrA[2] + 1;
            i19++;
        }
        while (i10 >= i19 && (i14 = i11 + i19) < iE && !this.f61987a.b(i14, i10 - i19)) {
            iArrA[3] = iArrA[3] + 1;
            i19++;
        }
        if (iArrA[3] == 0) {
            return false;
        }
        while (i10 >= i19 && (i13 = i11 + i19) < iE && this.f61987a.b(i13, i10 - i19)) {
            iArrA[4] = iArrA[4] + 1;
            i19++;
        }
        int i21 = iArrA[4];
        if (i21 != 0 && Math.abs(((((iArrA[0] + iArrA[1]) + iArrA[2]) + iArrA[3]) + i21) - i12) < i12 * 0.5f) {
            return c(iArrA);
        }
        return false;
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
        if (i10 < 5) {
            return false;
        }
        float f10 = i10 / 5.0f;
        float f11 = f10 / 1.6f;
        float f12 = f10 * 0.8f;
        float f13 = 0.8f * f11;
        if (Math.abs(f12 - iArr[0]) >= f13) {
            return false;
        }
        float f14 = f10 * 1.2f;
        float f15 = 1.2f * f11;
        return Math.abs(f14 - ((float) iArr[1])) < f15 && Math.abs(f10 - ((float) iArr[2])) < f11 && Math.abs(f14 - ((float) iArr[3])) < f15 && Math.abs(f12 - ((float) iArr[4])) < f13;
    }

    private f3[] b() throws com.huawei.hms.scankit.p.a {
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f61988b.size()) {
            f3 f3Var = this.f61988b.get(i11);
            if (f3Var.e() <= 5.0f || f3Var.a() <= 2) {
                this.f61988b.remove(i11);
                i11--;
            }
            i11++;
        }
        int size = this.f61988b.size();
        if (size < 3) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        Iterator<f3> it = this.f61988b.iterator();
        float fA = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (it.hasNext()) {
            float fE = it.next().e();
            f10 += fE;
            f11 += fE * fE;
        }
        float f12 = size;
        float f13 = f10 / f12;
        float fSqrt = (float) Math.sqrt((f11 / f12) - (f13 * f13));
        Collections.sort(this.f61988b, new c(f13));
        float fMax = Math.max(0.36f * f13, fSqrt);
        int i12 = 0;
        while (i12 < this.f61988b.size() && this.f61988b.size() > 3) {
            if (Math.abs(this.f61988b.get(i12).e() - f13) > fMax) {
                this.f61988b.remove(i12);
                i12--;
            }
            i12++;
        }
        int size2 = this.f61988b.size();
        Iterator<f3> it2 = this.f61988b.iterator();
        while (it2.hasNext()) {
            fA += it2.next().a();
        }
        float f14 = fA / size2;
        while (i10 < this.f61988b.size() && this.f61988b.size() > 3) {
            if (this.f61988b.get(i10).a() <= 0.5f * f14) {
                this.f61988b.remove(i10);
                i10--;
            }
            i10++;
        }
        Collections.sort(this.f61988b, new b());
        List<f3> list = this.f61988b;
        return (f3[]) list.toArray(new f3[list.size()]);
    }

    private float c(int i10, int i11, int i12) {
        s sVar = this.f61987a;
        int iE = sVar.e();
        int[] iArrA = a();
        int i13 = i10;
        while (i13 >= 0 && sVar.b(i13, i11)) {
            iArrA[2] = iArrA[2] + 1;
            i13--;
        }
        if (i13 < 0) {
            return Float.NaN;
        }
        while (i13 >= 0 && !sVar.b(i13, i11)) {
            iArrA[1] = iArrA[1] + 1;
            i13--;
        }
        if (i13 < 0 || iArrA[1] == 0) {
            return Float.NaN;
        }
        while (i13 >= 0 && sVar.b(i13, i11)) {
            iArrA[0] = iArrA[0] + 1;
            i13--;
        }
        if (iArrA[0] == 0) {
            return Float.NaN;
        }
        int i14 = i10 + 1;
        while (i14 < iE && sVar.b(i14, i11)) {
            iArrA[2] = iArrA[2] + 1;
            i14++;
        }
        if (i14 == iE || iArrA[2] == 0) {
            return Float.NaN;
        }
        while (i14 < iE && !sVar.b(i14, i11)) {
            iArrA[3] = iArrA[3] + 1;
            i14++;
        }
        if (i14 == iE || iArrA[3] == 0) {
            return Float.NaN;
        }
        while (i14 < iE && sVar.b(i14, i11)) {
            iArrA[4] = iArrA[4] + 1;
            i14++;
        }
        int i15 = iArrA[4];
        if (i15 != 0 && Math.abs(((((iArrA[0] + iArrA[1]) + iArrA[2]) + iArrA[3]) + i15) - i12) < i12 * 0.2f && b(iArrA)) {
            return a(iArrA, i14);
        }
        return Float.NaN;
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
        if (i10 < 5) {
            return false;
        }
        float f10 = i10 / 5.0f;
        float f11 = f10 / 1.0f;
        float f12 = f10 * 0.8f;
        float f13 = 0.8f * f11;
        if (Math.abs(f12 - iArr[0]) >= f13) {
            return false;
        }
        float f14 = f10 * 1.2f;
        float f15 = 1.2f * f11;
        return Math.abs(f14 - ((float) iArr[1])) < f15 && Math.abs(f10 - ((float) iArr[2])) < f11 && Math.abs(f14 - ((float) iArr[3])) < f15 && Math.abs(f12 - ((float) iArr[4])) < f13;
    }

    private float d(int i10, int i11, int i12) {
        s sVar = this.f61987a;
        int iC = sVar.c();
        int[] iArrA = a();
        int i13 = i10;
        while (i13 >= 0 && sVar.b(i11, i13)) {
            iArrA[2] = iArrA[2] + 1;
            i13--;
        }
        if (i13 < 0) {
            return Float.NaN;
        }
        while (i13 >= 0 && !sVar.b(i11, i13)) {
            iArrA[1] = iArrA[1] + 1;
            i13--;
        }
        if (i13 < 0 || iArrA[1] == 0) {
            return Float.NaN;
        }
        while (i13 >= 0 && sVar.b(i11, i13)) {
            iArrA[0] = iArrA[0] + 1;
            i13--;
        }
        if (iArrA[0] == 0) {
            return Float.NaN;
        }
        int i14 = i10 + 1;
        while (i14 < iC && sVar.b(i11, i14)) {
            iArrA[2] = iArrA[2] + 1;
            i14++;
        }
        if (i14 == iC || iArrA[2] == 0) {
            return Float.NaN;
        }
        while (i14 < iC && !sVar.b(i11, i14)) {
            iArrA[3] = iArrA[3] + 1;
            i14++;
        }
        if (i14 == iC || iArrA[3] == 0) {
            return Float.NaN;
        }
        while (i14 < iC && sVar.b(i11, i14)) {
            iArrA[4] = iArrA[4] + 1;
            i14++;
        }
        int i15 = iArrA[4];
        if (i15 != 0 && Math.abs(((((iArrA[0] + iArrA[1]) + iArrA[2]) + iArrA[3]) + i15) - i12) < i12 * 0.4f && b(iArrA)) {
            return a(iArrA, i14);
        }
        return Float.NaN;
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
        float fD = d(i10, iA, i12);
        if (!Float.isNaN(fD)) {
            int i13 = (int) fD;
            float fC = c(iA, i13, i12);
            if (!Float.isNaN(fC)) {
                int i14 = (int) fC;
                if (a(i13, i14, i12) && b(i13, i14, i12)) {
                    float f10 = i12 / 5.0f;
                    for (int i15 = 0; i15 < this.f61988b.size(); i15++) {
                        f3 f3Var = this.f61988b.get(i15);
                        if (f3Var.b(f10, fD, fC)) {
                            this.f61988b.set(i15, f3Var.c(fD, fC, f10));
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10) {
                        f3 f3Var2 = new f3(fC, fD, f10);
                        this.f61988b.add(f3Var2);
                        v6 v6Var = this.f61990d;
                        if (v6Var != null) {
                            v6Var.a(f3Var2);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    final f3[] a(Map<l1, ?> map) throws com.huawei.hms.scankit.p.a {
        int iC = this.f61987a.c();
        int iE = this.f61987a.e();
        int[] iArr = new int[5];
        for (int i10 = 1; i10 < iC; i10 += 2) {
            a(iArr);
            int i11 = 0;
            for (int i12 = 0; i12 < iE; i12++) {
                if (this.f61987a.b(i12, i10)) {
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
