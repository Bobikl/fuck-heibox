package com.huawei.hms.scankit.p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: FinderPatternFinder.java */
/* JADX INFO: loaded from: classes7.dex */
public class i3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f61943h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f61944i = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f61946a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v6 f61950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f61941f = {1, 3, 1, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f61942g = {1, 1, 3, 1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final d f61945j = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<e3> f61947b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f61949d = new int[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<e3> f61948c = new ArrayList();

    /* JADX INFO: compiled from: FinderPatternFinder.java */
    public static final class b implements Comparator<e3>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f61951a;

        private b(float f10) {
            this.f61951a = f10;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e3 e3Var, e3 e3Var2) {
            int iCompare = Integer.compare(e3Var2.a(), e3Var.a());
            return iCompare == 0 ? Float.compare(Math.abs(e3Var.e() - this.f61951a), Math.abs(e3Var2.e() - this.f61951a)) : iCompare;
        }
    }

    /* JADX INFO: compiled from: FinderPatternFinder.java */
    public static final class c implements Comparator<e3>, Serializable {
        private c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e3 e3Var, e3 e3Var2) {
            return Integer.compare(e3Var2.a(), e3Var.a());
        }
    }

    /* JADX INFO: compiled from: FinderPatternFinder.java */
    public static final class d implements Comparator<e3>, Serializable {
        private d() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e3 e3Var, e3 e3Var2) {
            return Float.compare(e3Var.e(), e3Var2.e());
        }
    }

    /* JADX INFO: compiled from: FinderPatternFinder.java */
    public static final class e implements Comparator<e3>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f61952a;

        private e(float f10) {
            this.f61952a = f10;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e3 e3Var, e3 e3Var2) {
            return Float.compare(Math.abs(e3Var2.e() - this.f61952a), Math.abs(e3Var.e() - this.f61952a));
        }
    }

    /* JADX INFO: compiled from: FinderPatternFinder.java */
    public static final class f implements Comparator<e3>, Serializable {
        private f() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e3 e3Var, e3 e3Var2) {
            return Float.compare(e3Var.b(), e3Var2.b());
        }
    }

    /* JADX INFO: compiled from: FinderPatternFinder.java */
    public static final class g implements Comparator<e3>, Serializable {
        private g() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e3 e3Var, e3 e3Var2) {
            return Float.compare(e3Var.c(), e3Var2.c());
        }
    }

    public i3(s sVar, v6 v6Var) {
        this.f61946a = sVar;
        this.f61950e = v6Var;
    }

    private static double a(e3 e3Var, e3 e3Var2) {
        double dB = e3Var.b() - e3Var2.b();
        double dC = e3Var.c() - e3Var2.c();
        return (dB * dB) + (dC * dC);
    }

    private float a(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        s sVar = this.f61946a;
        int iC = sVar.c();
        int[] iArrD = d();
        if (c(i10, i11, i12, iArrD)) {
            return Float.NaN;
        }
        int i16 = i10 + 1;
        while (i16 < iC && !sVar.b(i11, i16)) {
            int i17 = iArrD[1];
            if (i17 > i12) {
                break;
            }
            iArrD[1] = i17 + 1;
            i16++;
        }
        if (i16 < 0 || iArrD[1] > i12) {
            return Float.NaN;
        }
        while (i16 < iC && sVar.b(i11, i16)) {
            iArrD[2] = iArrD[2] + 1;
            i16++;
        }
        if (i16 == iC) {
            return Float.NaN;
        }
        while (i16 < iC && !sVar.b(i11, i16) && (i15 = iArrD[3]) < i12) {
            iArrD[3] = i15 + 1;
            i16++;
        }
        if (i16 == iC || iArrD[3] >= i12) {
            return Float.NaN;
        }
        while (i16 < iC && sVar.b(i11, i16) && (i14 = iArrD[4]) < i12) {
            iArrD[4] = i14 + 1;
            i16++;
        }
        int i18 = iArrD[4];
        if (i18 >= i12 || Math.abs(((((iArrD[0] + iArrD[1]) + iArrD[2]) + iArrD[3]) + i18) - i13) * 5 >= i13 * 2) {
            return Float.NaN;
        }
        if (r3.f62282h) {
            if (a(iArrD, true)) {
                return a(iArrD, i16);
            }
            return Float.NaN;
        }
        if (a(iArrD, false)) {
            return a(iArrD, i16);
        }
        return Float.NaN;
    }

    private float a(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        s sVar = this.f61946a;
        int iC = sVar.c();
        int i17 = i11;
        while (i17 <= i12) {
            int[] iArrD = d();
            int i18 = i10;
            while (i18 >= 0 && !sVar.b(i17, i18) && (i16 = iArrD[1]) <= i13) {
                iArrD[1] = i16 + 1;
                i18--;
            }
            if (i18 >= 0) {
                double d10 = ((double) i13) * 1.5d;
                if (iArrD[1] > d10) {
                    continue;
                } else {
                    while (i18 >= 0 && sVar.b(i17, i18) && (i15 = iArrD[0]) <= i13) {
                        iArrD[0] = i15 + 1;
                        i18--;
                    }
                    if (iArrD[0] > i13 / 2) {
                        continue;
                    } else {
                        int i19 = i10 + 1;
                        while (i19 < iC && !sVar.b(i17, i19)) {
                            int i20 = iArrD[1];
                            if (i20 > i13) {
                                break;
                            }
                            iArrD[1] = i20 + 1;
                            i19++;
                        }
                        if (i19 >= 0 && iArrD[1] <= d10) {
                            while (i19 < iC && sVar.b(i17, i19)) {
                                iArrD[2] = iArrD[2] + 1;
                                i19++;
                            }
                            if (Math.abs(((iArrD[0] + iArrD[1]) + iArrD[2]) - i14) * 5 < i14 * 2 && b(iArrD)) {
                                return (i19 - (iArrD[1] / 2)) - iArrD[2];
                            }
                        }
                    }
                }
            }
            i17 += i12 - i11;
        }
        return Float.NaN;
    }

    private float a(int i10, int i11, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        s sVar = this.f61946a;
        int iE = sVar.e();
        int[] iArrD = d();
        if (a(i10, i11, i12, iArrD)) {
            return Float.NaN;
        }
        int i16 = i10 + 1;
        while (i16 < iE && sVar.b(i16, i11)) {
            iArrD[2] = iArrD[2] + 1;
            i16++;
        }
        if (i16 == iE) {
            return Float.NaN;
        }
        while (i16 < iE && !sVar.b(i16, i11) && (i15 = iArrD[3]) < i12) {
            iArrD[3] = i15 + 1;
            i16++;
        }
        if (i16 == iE || iArrD[3] >= i12) {
            return Float.NaN;
        }
        while (i16 < iE && sVar.b(i16, i11) && (i14 = iArrD[4]) < i12) {
            iArrD[4] = i14 + 1;
            i16++;
        }
        if (!a(iArrD, z10)) {
            return Float.NaN;
        }
        if (Math.abs(((((iArrD[0] + iArrD[1]) + iArrD[2]) + iArrD[3]) + iArrD[4]) - i13) * 5 < i13 || f61944i || f61943h) {
            return a(iArrD, i16);
        }
        return Float.NaN;
    }

    private static float a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    protected static float a(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f15 = iArr2[i13] * f12;
            float f16 = i14;
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void a(int r11, int r12, int r13) {
        /*
            r10 = this;
            r0 = 5
            int[] r1 = new int[r0]
            int r2 = r11 + (-1)
        L5:
            if (r2 >= r12) goto L5e
            r10.a(r1)
            int[] r3 = new int[r0]
            r4 = 0
            r3[r4] = r4
            r5 = 1
            r3[r5] = r2
            r6 = 2
            r3[r6] = r4
            r7 = 3
            r3[r7] = r13
            r7 = 4
            r3[r7] = r11
            r8 = r4
        L1c:
            if (r8 >= r13) goto L39
            r3[r6] = r8
            com.huawei.hms.scankit.p.s r9 = r10.f61946a
            boolean r9 = r9.b(r8, r2)
            if (r9 == 0) goto L2c
            r10.a(r1, r3)
            goto L33
        L2c:
            boolean r9 = r10.b(r1, r3)
            if (r9 == 0) goto L33
            goto L37
        L33:
            r8 = r3[r6]
            r11 = r3[r7]
        L37:
            int r8 = r8 + r5
            goto L1c
        L39:
            boolean r5 = b(r1)
            if (r5 == 0) goto L4e
            r3 = r3[r4]
            r5 = r13
        L42:
            if (r3 <= r6) goto L4a
            r7 = r1[r3]
            int r5 = r5 - r7
            int r3 = r3 + (-1)
            goto L42
        L4a:
            r10.b(r1, r2, r5)
            goto L4f
        L4e:
            r5 = r13
        L4f:
            boolean r3 = a(r1, r4)
            if (r3 == 0) goto L5c
            boolean r3 = r10.a(r1, r2, r5, r4)
            if (r3 == 0) goto L5c
            r11 = r6
        L5c:
            int r2 = r2 + r11
            goto L5
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.i3.a(int, int, int):void");
    }

    private static void a(e3 e3Var, e3 e3Var2, e3 e3Var3, float[] fArr) {
        float fB = e3Var.b() - e3Var2.b();
        float fC = e3Var.c() - e3Var2.c();
        float f10 = (fB * fB) + (fC * fC);
        float fB2 = e3Var.b() - e3Var3.b();
        float fC2 = e3Var.c() - e3Var3.c();
        float f11 = (fB2 * fB2) + (fC2 * fC2);
        float fB3 = e3Var2.b() - e3Var3.b();
        float fC3 = e3Var2.c() - e3Var3.c();
        float f12 = (fB3 * fB3) + (fC3 * fC3);
        if (f10 > f12 && f10 > f11) {
            fArr[0] = f10;
            fArr[1] = f11;
            fArr[2] = f12;
        } else if (f12 <= f10 || f12 <= f11) {
            fArr[0] = f11;
            fArr[1] = f10;
            fArr[2] = f12;
        } else {
            fArr[0] = f12;
            fArr[1] = f10;
            fArr[2] = f11;
        }
    }

    private void a(int[] iArr, int[] iArr2) {
        int i10 = iArr2[0];
        if ((i10 & 1) == 1) {
            iArr2[0] = i10 + 1;
        }
        int i11 = iArr2[0];
        if (i11 >= 0 && i11 < iArr.length) {
            iArr[i11] = iArr[i11] + 1;
        }
        if (iArr2[2] == iArr2[3] - 1 && iArr2[0] == 4) {
            if (a(iArr, false)) {
                boolean zA = a(iArr, iArr2[1], iArr2[2], false);
                if (zA) {
                    iArr2[4] = 2;
                }
                if (!zA) {
                    zA = a(iArr, iArr2[1], iArr2[2]);
                }
                if (zA) {
                    iArr2[0] = 0;
                    a(iArr);
                    while (iArr2[2] < this.f61946a.e() && !this.f61946a.b(iArr2[2], iArr2[1])) {
                        iArr2[2] = iArr2[2] + 1;
                    }
                }
            }
            if (r3.f62282h && a(iArr, true) && a(iArr, iArr2[1], iArr2[2], true)) {
                iArr2[0] = 0;
                a(iArr);
            }
        }
    }

    private boolean a(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] iArrD = d();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f61946a.b(i11 - i15, i10 - i15)) {
            iArrD[2] = iArrD[2] + 1;
            i15++;
        }
        if (iArrD[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f61946a.b(i11 - i15, i10 - i15)) {
            iArrD[1] = iArrD[1] + 1;
            i15++;
        }
        if (iArrD[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f61946a.b(i11 - i15, i10 - i15)) {
            iArrD[0] = iArrD[0] + 1;
            i15++;
        }
        if (iArrD[0] == 0) {
            return false;
        }
        int iC = this.f61946a.c();
        int iE = this.f61946a.e();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            if (i17 >= iC || (i14 = i11 + i16) >= iE || !this.f61946a.b(i14, i17)) {
                break;
            }
            iArrD[2] = iArrD[2] + 1;
            i16++;
        }
        while (true) {
            int i18 = i10 + i16;
            if (i18 >= iC || (i13 = i11 + i16) >= iE || this.f61946a.b(i13, i18)) {
                break;
            }
            iArrD[3] = iArrD[3] + 1;
            i16++;
        }
        if (iArrD[3] == 0) {
            return false;
        }
        while (true) {
            int i19 = i10 + i16;
            if (i19 >= iC || (i12 = i11 + i16) >= iE || !this.f61946a.b(i12, i19)) {
                break;
            }
            iArrD[4] = iArrD[4] + 1;
            i16++;
        }
        if (iArrD[4] == 0) {
            return false;
        }
        return c(iArrD);
    }

    private boolean a(int i10, int i11, int i12, int[] iArr) {
        boolean z10;
        int i13;
        s sVar = this.f61946a;
        while (true) {
            z10 = true;
            if (i10 < 0 || !sVar.b(i10, i11)) {
                break;
            }
            iArr[2] = iArr[2] + 1;
            i10--;
        }
        if (i10 < 0) {
            return true;
        }
        while (i10 >= 0 && !sVar.b(i10, i11)) {
            int i14 = iArr[1];
            if (i14 > i12) {
                break;
            }
            iArr[1] = i14 + 1;
            i10--;
        }
        if (i10 >= 0 && iArr[1] <= i12) {
            while (true) {
                z10 = false;
                if (i10 < 0 || !sVar.b(i10, i11) || (i13 = iArr[0]) > i12) {
                    break;
                }
                iArr[0] = i13 + 1;
                i10--;
            }
        }
        return z10;
    }

    private boolean a(boolean z10, float f10, float f11, float f12) {
        for (int i10 = 0; i10 < this.f61948c.size(); i10++) {
            e3 e3Var = this.f61948c.get(i10);
            if (e3Var.b(f12, f10, f11)) {
                this.f61948c.set(i10, e3Var.a(f10, f11, f12, false));
                z10 = true;
                break;
            }
        }
        if (!z10) {
            e3 e3Var2 = new e3(f11, f10, f12, false);
            this.f61948c.add(e3Var2);
            v6 v6Var = this.f61950e;
            if (v6Var != null) {
                v6Var.a(e3Var2);
            }
        }
        return true;
    }

    protected static boolean a(int[] iArr, boolean z10) {
        float f10;
        float f11;
        e();
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        if (z10 && r3.f62282h) {
            f11 = 0.75f;
            f10 = 1.0f;
        } else {
            f10 = 3.0f;
            f11 = 0.5f;
        }
        float f12 = i10 / 7.0f;
        float f13 = f11 * f12;
        if (Math.abs(f12 - iArr[0]) < f13 && Math.abs(f12 - iArr[1]) < f13 && Math.abs((3.0f * f12) - iArr[2]) < f10 * f13 && Math.abs(f12 - iArr[3]) < f13 && Math.abs(f12 - iArr[4]) < f13) {
            return true;
        }
        if (!z10) {
            return false;
        }
        int[] iArr2 = new int[iArr.length - 1];
        int i13 = 0;
        while (i13 < iArr.length - 1) {
            int i14 = i13 + 1;
            iArr2[i13] = iArr[i14];
            i13 = i14;
        }
        int[] iArr3 = new int[iArr.length - 1];
        for (int i15 = 0; i15 < iArr.length - 1; i15++) {
            iArr3[i15] = iArr[i15];
        }
        float fA = a(iArr2, f61941f, 0.5f);
        float fA2 = a(iArr3, f61942g, 0.5f);
        boolean z11 = fA < 0.3f;
        f61943h = z11;
        boolean z12 = fA2 < 0.3f;
        f61944i = z12;
        return z11 || z12;
    }

    private e3[] a() throws com.huawei.hms.scankit.p.a {
        e3 e3Var = this.f61947b.get(0);
        e3 e3Var2 = this.f61947b.get(1);
        float[] fArr = e3Var.b() < e3Var2.b() ? new float[]{e3Var.b(), e3Var2.b()} : new float[]{e3Var2.b(), e3Var.b()};
        float[] fArr2 = e3Var.b() < e3Var2.b() ? new float[]{e3Var.c(), e3Var2.c()} : new float[]{e3Var2.c(), e3Var.c()};
        float fE = (e3Var.e() + e3Var2.e()) / 2.0f;
        float fE2 = ((e3Var.e() + e3Var2.e()) * 7.0f) / 1.5f;
        if (Math.abs(fArr[0] - fArr[1]) > fE2 && Math.abs(fArr2[0] - fArr2[1]) <= fE2) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            this.f61947b.add(new e3((f10 + f11) - fArr2[1], (f11 + fArr[1]) - f10, fE, false, 0));
        } else if (Math.abs(fArr[0] - fArr[1]) <= fE2 && Math.abs(fArr2[0] - fArr2[1]) > fE2) {
            float f12 = fArr[0];
            float f13 = fArr[1];
            if (f12 < f13) {
                float f14 = fArr2[0] + f13;
                float f15 = fArr2[1];
                this.f61947b.add(new e3(f14 - f15, (f15 + f13) - f12, fE, false, 0));
            } else {
                float f16 = fArr2[1] + f12;
                float f17 = fArr2[0];
                this.f61947b.add(new e3(f16 - f17, (f17 + f12) - f13, fE, false, 0));
            }
        } else if (Math.abs(fArr[0] - fArr[1]) > fE2 && Math.abs(fArr2[0] - fArr2[1]) > fE2) {
            float f18 = fArr[0];
            float f19 = fArr[1];
            float f20 = fArr2[1];
            float f21 = fArr2[0];
            this.f61947b.add(new e3((((f18 + f19) + f20) - f21) / 2.0f, (((f21 + f20) + f18) - f19) / 2.0f, fE, false, 0));
        }
        if (this.f61947b.size() == 3) {
            return new e3[]{this.f61947b.get(0), this.f61947b.get(1), this.f61947b.get(2)};
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private float b(int i10, int i11, int i12, int i13) {
        int i14;
        s sVar = this.f61946a;
        int iC = sVar.c();
        int[] iArrD = d();
        if (d(i10, i11, i12, iArrD)) {
            return Float.NaN;
        }
        int i15 = i10 + 1;
        while (i15 < iC && !sVar.b(i11, i15) && (i14 = iArrD[3]) <= i12) {
            iArrD[3] = i14 + 1;
            i15++;
        }
        if (i15 < 0 || iArrD[3] > i12) {
            return Float.NaN;
        }
        while (i15 < iC && sVar.b(i11, i15)) {
            iArrD[4] = iArrD[4] + 1;
            i15++;
        }
        int i16 = iArrD[4];
        if (i16 <= i12 && Math.abs(((((iArrD[0] + iArrD[1]) + iArrD[2]) + iArrD[3]) + i16) - i13) * 5 < i13 * 2 && a(iArrD, true)) {
            return a(iArrD, i15);
        }
        return Float.NaN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
    
        if ((r11 * 3) > r13) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float b(int r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            com.huawei.hms.scankit.p.s r0 = r9.f61946a
            int r1 = r0.c()
            int[] r2 = r9.d()
            boolean r3 = r9.b(r10, r11, r12, r2)
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r3 == 0) goto L13
            return r4
        L13:
            r3 = 1
            int r10 = r10 + r3
        L15:
            r5 = 2
            if (r10 >= r1) goto L26
            boolean r6 = r0.b(r11, r10)
            if (r6 == 0) goto L26
            r6 = r2[r5]
            int r6 = r6 + r3
            r2[r5] = r6
            int r10 = r10 + 1
            goto L15
        L26:
            if (r10 != r1) goto L29
            return r4
        L29:
            r6 = 3
            if (r10 >= r1) goto L3d
            boolean r7 = r0.b(r11, r10)
            if (r7 != 0) goto L3d
            r7 = r2[r6]
            if (r7 >= r12) goto L3d
            int r7 = r7 + 1
            r2[r6] = r7
            int r10 = r10 + 1
            goto L29
        L3d:
            if (r10 == r1) goto L90
            r7 = r2[r6]
            if (r7 < r12) goto L44
            goto L90
        L44:
            r7 = 4
            if (r10 >= r1) goto L58
            boolean r8 = r0.b(r11, r10)
            if (r8 == 0) goto L58
            r8 = r2[r7]
            if (r8 >= r12) goto L58
            int r8 = r8 + 1
            r2[r7] = r8
            int r10 = r10 + 1
            goto L44
        L58:
            boolean r11 = a(r2, r14)
            if (r11 != 0) goto L5f
            return r4
        L5f:
            r11 = 0
            r11 = r2[r11]
            r12 = r2[r3]
            int r11 = r11 + r12
            r12 = r2[r5]
            int r11 = r11 + r12
            r12 = r2[r6]
            int r11 = r11 + r12
            r12 = r2[r7]
            int r11 = r11 + r12
            if (r14 == 0) goto L83
            int r11 = r11 - r13
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 * 5
            int r13 = r13 * r6
            if (r11 < r13) goto L8b
            boolean r11 = com.huawei.hms.scankit.p.i3.f61944i
            if (r11 != 0) goto L8b
            boolean r11 = com.huawei.hms.scankit.p.i3.f61943h
            if (r11 != 0) goto L8b
            return r4
        L83:
            int r12 = r13 * 3
            if (r11 >= r12) goto L90
            int r11 = r11 * r6
            if (r11 > r13) goto L8b
            goto L90
        L8b:
            float r10 = a(r2, r10)
            return r10
        L90:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.i3.b(int, int, int, int, boolean):float");
    }

    private boolean b(int i10, int i11, int i12, int[] iArr) {
        boolean z10;
        int i13;
        s sVar = this.f61946a;
        while (true) {
            z10 = true;
            if (i10 < 0 || !sVar.b(i11, i10)) {
                break;
            }
            iArr[2] = iArr[2] + 1;
            i10--;
        }
        if (i10 < 0) {
            return true;
        }
        while (i10 >= 0 && !sVar.b(i11, i10)) {
            int i14 = iArr[1];
            if (i14 > i12) {
                break;
            }
            iArr[1] = i14 + 1;
            i10--;
        }
        if (i10 >= 0 && iArr[1] <= i12) {
            while (true) {
                z10 = false;
                if (i10 < 0 || !sVar.b(i11, i10) || (i13 = iArr[0]) > i12) {
                    break;
                }
                iArr[0] = i13 + 1;
                i10--;
            }
        }
        return z10;
    }

    private static boolean b(e3 e3Var, e3 e3Var2, e3 e3Var3, float[] fArr) {
        a(e3Var, e3Var2, e3Var3, fArr);
        float fSqrt = (float) Math.sqrt(fArr[1]);
        float fSqrt2 = (float) Math.sqrt(fArr[2]);
        float fSqrt3 = (float) Math.sqrt(fArr[0]);
        if (Math.min(Math.min(fSqrt, fSqrt2), fSqrt3) <= Math.max(Math.max(e3Var.e(), e3Var2.e()), e3Var3.e()) * 7.0f) {
            return false;
        }
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[0];
        float f13 = ((f10 + f11) - f12) / ((fSqrt * 2.0f) * fSqrt2);
        float f14 = fSqrt3 * 2.0f;
        float f15 = ((f12 + f10) - f11) / (fSqrt * f14);
        float f16 = ((f12 + f11) - f10) / (f14 * fSqrt2);
        return Math.abs(f13) <= 0.45f && f15 >= 0.2588f && f15 <= 0.94f && f16 >= 0.2588f && f16 <= 0.94f;
    }

    protected static boolean b(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = 0.5f * f10;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs((5.0f * f10) - ((float) iArr[1])) < f11 && Math.abs(f10 - ((float) iArr[2])) < f11;
    }

    private boolean b(int[] iArr, int[] iArr2) {
        int i10 = iArr2[0];
        if ((i10 & 1) != 0) {
            iArr[i10] = iArr[i10] + 1;
        } else if (i10 == 4) {
            if (a(iArr, false)) {
                boolean zA = a(iArr, iArr2[1], iArr2[2], false);
                if (zA) {
                    iArr2[4] = 2;
                }
                if (!zA) {
                    zA = a(iArr, iArr2[1], iArr2[2]);
                }
                if (zA) {
                    iArr2[0] = 0;
                    a(iArr);
                    return true;
                }
            }
            if (b(iArr)) {
                int i11 = iArr2[2];
                for (int i12 = iArr2[0]; i12 > 2; i12--) {
                    i11 -= iArr[i12];
                }
                if (b(iArr, iArr2[1], i11)) {
                    d(iArr);
                    iArr2[0] = 3;
                    return true;
                }
            }
            if (r3.f62282h && a(iArr, true) && a(iArr, iArr2[1], iArr2[2], true)) {
                iArr2[0] = 0;
                a(iArr);
                return true;
            }
            d(iArr);
            iArr2[0] = 3;
        } else {
            int i13 = i10 + 1;
            iArr2[0] = i13;
            iArr[i13] = iArr[i13] + 1;
        }
        return false;
    }

    private boolean c(int i10, int i11, int i12, int[] iArr) {
        int i13;
        int i14;
        s sVar = this.f61946a;
        while (i10 >= 0 && !sVar.b(i11, i10) && (i14 = iArr[1]) <= i12) {
            iArr[1] = i14 + 1;
            i10--;
        }
        if (i10 < 0 || iArr[1] > i12) {
            return true;
        }
        while (i10 >= 0 && sVar.b(i11, i10) && (i13 = iArr[0]) <= i12) {
            iArr[0] = i13 + 1;
            i10--;
        }
        return iArr[0] > i12;
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
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = 0.75f * f10;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    private e3[] c() throws com.huawei.hms.scankit.p.a {
        boolean z10;
        boolean z11;
        if (this.f61947b.size() > 2) {
            try {
                return f();
            } catch (com.huawei.hms.scankit.p.a unused) {
                if (this.f61948c.size() <= 0) {
                    throw com.huawei.hms.scankit.p.a.a();
                }
                Collections.sort(this.f61948c, new c());
                int iMin = Math.min(3, this.f61948c.size());
                for (int i10 = 0; i10 < iMin; i10++) {
                    e3 e3Var = this.f61948c.get(i10);
                    float fE = e3Var.e();
                    float fC = e3Var.c();
                    float fB = e3Var.b();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= this.f61947b.size()) {
                            z10 = false;
                            break;
                        }
                        e3 e3Var2 = this.f61947b.get(i11);
                        if (e3Var2.b(fE, fC, fB)) {
                            this.f61947b.set(i11, e3Var2.a(fC, fB, fE, false));
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                    if (!z10) {
                        this.f61947b.add(e3Var);
                    }
                }
                return f();
            }
        }
        if (this.f61947b.size() == 2) {
            int i12 = this.f61947b.get(0).e() > this.f61947b.get(1).e() ? 0 : 1;
            if (Math.max(this.f61947b.get(0).e(), this.f61947b.get(1).e()) / Math.min(this.f61947b.get(0).e(), this.f61947b.get(1).e()) > 1.5d) {
                e3 e3Var3 = this.f61947b.get(i12);
                this.f61947b.clear();
                this.f61947b.add(e3Var3);
            }
        }
        if (this.f61947b.size() <= 1 && this.f61948c.size() >= 1) {
            for (int i13 = 0; i13 < this.f61947b.size(); i13++) {
                e3 e3Var4 = this.f61947b.get(i13);
                float fE2 = e3Var4.e();
                float fC2 = e3Var4.c();
                float fB2 = e3Var4.b();
                int i14 = 0;
                while (true) {
                    if (i14 >= this.f61948c.size()) {
                        z11 = false;
                        break;
                    }
                    e3 e3Var5 = this.f61948c.get(i14);
                    if (e3Var5.b(fE2, fC2, fB2)) {
                        this.f61948c.set(i14, e3Var4.a(e3Var5.c(), e3Var5.b(), e3Var5.e(), false));
                        z11 = true;
                        break;
                    }
                    i14++;
                }
                if (!z11) {
                    this.f61948c.add(e3Var4);
                }
            }
            this.f61947b.clear();
            this.f61947b.addAll(this.f61948c);
            this.f61948c.clear();
        }
        if (this.f61947b.size() == 2) {
            try {
                return g();
            } catch (com.huawei.hms.scankit.p.a unused2) {
                return a();
            }
        }
        if (this.f61947b.size() > 1) {
            return f();
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private boolean d(int i10, int i11, int i12, int[] iArr) {
        int i13;
        int i14;
        int i15;
        s sVar = this.f61946a;
        while (i10 >= 0 && !sVar.b(i11, i10) && (i15 = iArr[3]) <= i12) {
            iArr[3] = i15 + 1;
            i10--;
        }
        if (i10 >= 0 && iArr[3] <= i12) {
            while (i10 >= 0 && sVar.b(i11, i10) && (i14 = iArr[2]) <= i12) {
                iArr[2] = i14 + 1;
                i10--;
            }
            if (i10 >= 0 && iArr[2] <= i12) {
                while (i10 >= 0 && !sVar.b(i11, i10)) {
                    int i16 = iArr[1];
                    if (i16 > i12) {
                        break;
                    }
                    iArr[1] = i16 + 1;
                    i10--;
                }
                if (i10 >= 0 && iArr[1] <= i12) {
                    while (i10 >= 0 && sVar.b(i11, i10) && (i13 = iArr[0]) <= i12) {
                        iArr[0] = i13 + 1;
                        i10--;
                    }
                    return iArr[0] > i12;
                }
            }
        }
        return true;
    }

    private int[] d() {
        a(this.f61949d);
        return this.f61949d;
    }

    private static void e() {
        f61943h = false;
        f61944i = false;
    }

    private e3[] f() throws com.huawei.hms.scankit.p.a {
        int size = this.f61947b.size();
        if (size < 3) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        e3[] e3VarArr = new e3[3];
        if (size == 3) {
            e3VarArr[0] = this.f61947b.get(0);
            e3VarArr[1] = this.f61947b.get(1);
            e3 e3Var = this.f61947b.get(2);
            e3VarArr[2] = e3Var;
            if (b(e3VarArr[0], e3VarArr[1], e3Var, new float[3])) {
                return e3VarArr;
            }
            throw com.huawei.hms.scankit.p.a.a();
        }
        Collections.sort(this.f61947b, new c());
        if (this.f61947b.get(2).a() - this.f61947b.get(3).a() > 1 && this.f61947b.get(2).a() > 1) {
            e3VarArr[0] = this.f61947b.get(0);
            e3VarArr[1] = this.f61947b.get(1);
            e3VarArr[2] = this.f61947b.get(2);
            return e3VarArr;
        }
        float fE = 0.0f;
        if (this.f61947b.get(3).a() > 1) {
            float fE2 = 0.0f;
            for (int i10 = 0; i10 < 4; i10++) {
                fE2 += this.f61947b.get(i10).e();
            }
            float f10 = fE2 / 4.0f;
            int i11 = 0;
            for (int i12 = 0; i12 < 4; i12++) {
                float fAbs = Math.abs(this.f61947b.get(i12).e() - f10);
                if (fAbs > fE) {
                    i11 = i12;
                    fE = fAbs;
                }
            }
            if (i11 == 0) {
                e3VarArr[0] = this.f61947b.get(1);
                e3VarArr[1] = this.f61947b.get(2);
                e3VarArr[2] = this.f61947b.get(3);
            } else if (i11 == 1) {
                e3VarArr[0] = this.f61947b.get(0);
                e3VarArr[1] = this.f61947b.get(2);
                e3VarArr[2] = this.f61947b.get(3);
            } else if (i11 != 2) {
                e3VarArr[0] = this.f61947b.get(0);
                e3VarArr[1] = this.f61947b.get(1);
                e3VarArr[2] = this.f61947b.get(2);
            } else {
                e3VarArr[0] = this.f61947b.get(0);
                e3VarArr[1] = this.f61947b.get(1);
                e3VarArr[2] = this.f61947b.get(3);
            }
            if (b(e3VarArr[0], e3VarArr[1], e3VarArr[2], new float[3])) {
                return e3VarArr;
            }
            throw com.huawei.hms.scankit.p.a.a();
        }
        if (this.f61947b.get(1).a() > 1 && this.f61947b.get(2).a() == 1) {
            ArrayList arrayList = new ArrayList();
            float fE3 = (this.f61947b.get(0).e() + this.f61947b.get(1).e()) / 2.0f;
            for (int i13 = 2; i13 < size; i13++) {
                if (Math.abs(this.f61947b.get(i13).e() - fE3) < ((double) fE3) * 0.5d) {
                    arrayList.add(this.f61947b.get(i13));
                }
            }
            int i14 = 0;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                float[] fArr = new float[3];
                if (b(this.f61947b.get(0), this.f61947b.get(1), (e3) arrayList.get(i15), fArr)) {
                    float f11 = fArr[0];
                    if (f11 >= fE) {
                        i14 = i15;
                        fE = f11;
                    }
                }
            }
            e3VarArr[0] = this.f61947b.get(0);
            e3VarArr[1] = this.f61947b.get(1);
            if (i14 >= arrayList.size()) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            e3VarArr[2] = (e3) arrayList.get(i14);
            return e3VarArr;
        }
        if (size > 3) {
            float f12 = 0.0f;
            float f13 = 0.0f;
            for (int i16 = 0; i16 < size; i16++) {
                float fE4 = this.f61947b.get(i16).e();
                f12 += fE4;
                f13 += fE4 * fE4;
            }
            float f14 = size;
            float f15 = f12 / f14;
            float fSqrt = (float) Math.sqrt((f13 / f14) - (f15 * f15));
            Collections.sort(this.f61947b, new e(f15));
            float fMax = Math.max(0.5f * f15, fSqrt);
            int i17 = 0;
            while (i17 < this.f61947b.size() && this.f61947b.size() > 3) {
                if (Math.abs(this.f61947b.get(i17).e() - f15) > fMax) {
                    this.f61947b.remove(i17);
                    i17--;
                }
                i17++;
            }
        }
        if (this.f61947b.size() > 15) {
            Collections.sort(this.f61947b, new c());
            List<e3> list = this.f61947b;
            list.subList(15, list.size()).clear();
        } else if (this.f61947b.size() > 12) {
            Collections.sort(this.f61947b, new c());
            List<e3> list2 = this.f61947b;
            list2.subList(12, list2.size()).clear();
        }
        if (this.f61947b.size() >= 6) {
            Collections.sort(this.f61947b, new f());
            List<e3> list3 = this.f61947b;
            list3.subList(4, list3.size() - 2).clear();
            Collections.sort(this.f61947b, new g());
            this.f61947b.subList(1, 3).clear();
            Collections.sort(this.f61947b, new g());
            List<e3> list4 = this.f61947b;
            list4.subList(list4.size() - 1, this.f61947b.size()).clear();
        } else if (this.f61947b.size() > 3) {
            for (int i18 = 0; i18 < this.f61947b.size(); i18++) {
                fE += this.f61947b.get(i18).e();
            }
            Collections.sort(this.f61947b, new b(fE / this.f61947b.size()));
            List<e3> list5 = this.f61947b;
            list5.subList(3, list5.size()).clear();
        }
        e3VarArr[0] = this.f61947b.get(0);
        e3VarArr[1] = this.f61947b.get(1);
        e3 e3Var2 = this.f61947b.get(2);
        e3VarArr[2] = e3Var2;
        if (b(e3VarArr[0], e3VarArr[1], e3Var2, new float[3])) {
            return e3VarArr;
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private e3[] g() throws com.huawei.hms.scankit.p.a {
        e3 e3Var;
        e3 e3Var2;
        double d10;
        char c10 = 0;
        e3 e3Var3 = this.f61947b.get(0);
        char c11 = 1;
        e3 e3Var4 = this.f61947b.get(1);
        e3 e3Var5 = this.f61947b.get(1);
        double dA = a(e3Var3, e3Var4);
        double[] dArr = new double[3];
        float fMin = Math.min(e3Var3.e(), e3Var4.e());
        Collections.sort(this.f61947b, new e(fMin));
        int i10 = 0;
        double d11 = Double.MAX_VALUE;
        while (i10 < this.f61948c.size()) {
            e3 e3Var6 = this.f61948c.get(i10);
            float fE = e3Var6.e();
            if (fE > 1.25f * fMin || fE < 0.75f * fMin) {
                e3Var = e3Var3;
                e3Var2 = e3Var4;
                d10 = dA;
            } else {
                dArr[c10] = dA;
                dArr[c11] = a(e3Var4, e3Var6);
                dArr[2] = a(e3Var3, e3Var6);
                Arrays.sort(dArr);
                double dAbs = Math.abs(dArr[2] - (dArr[c11] * 2.0d)) + Math.abs(dArr[2] - (dArr[c10] * 2.0d));
                double d12 = dArr[2];
                double d13 = dAbs / d12;
                double d14 = dArr[c11];
                double d15 = dArr[c10];
                double dSqrt = ((d14 + d15) - d12) / ((Math.sqrt(d15) * 2.0d) * Math.sqrt(dArr[c11]));
                if (!r3.f62282h || Math.abs(dSqrt) >= 0.25d) {
                    e3Var = e3Var3;
                    e3Var2 = e3Var4;
                    d10 = dA;
                } else {
                    boolean z10 = e3Var3.b() < ((float) this.f61946a.e()) * 0.3f && e3Var4.b() > ((float) this.f61946a.e()) * 0.7f;
                    boolean z11 = e3Var4.b() < ((float) this.f61946a.e()) * 0.3f && e3Var3.b() > ((float) this.f61946a.e()) * 0.7f;
                    boolean z12 = e3Var3.c() < ((float) this.f61946a.c()) * 0.3f && e3Var4.c() > ((float) this.f61946a.c()) * 0.7f;
                    e3Var2 = e3Var4;
                    boolean z13 = e3Var4.c() < ((float) this.f61946a.c()) * 0.3f && e3Var3.c() > ((float) this.f61946a.c()) * 0.7f;
                    e3Var = e3Var3;
                    boolean z14 = e3Var6.b() < ((float) this.f61946a.e()) * 0.3f || e3Var6.b() > ((float) this.f61946a.e()) * 0.7f;
                    d10 = dA;
                    boolean z15 = e3Var6.c() < ((float) this.f61946a.c()) * 0.3f || e3Var6.c() > ((float) this.f61946a.c()) * 0.7f;
                    if (((z10 || z11) && !z14) || ((z12 || z13) && !z15)) {
                    }
                }
                if (d13 < d11 && Math.abs(dSqrt) < 0.25d) {
                    e3Var5 = e3Var6;
                    d11 = d13;
                }
            }
            i10++;
            e3Var4 = e3Var2;
            e3Var3 = e3Var;
            dA = d10;
            c10 = 0;
            c11 = 1;
        }
        if (d11 == Double.MAX_VALUE) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        this.f61947b.add(e3Var5);
        return new e3[]{this.f61947b.get(0), this.f61947b.get(1), this.f61947b.get(2)};
    }

    protected final void a(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = 0;
        }
    }

    protected final boolean a(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        float fA = a(iArr, i11);
        float fB = b(i10, (int) fA, iArr[2], i12, false);
        if (Float.isNaN(fB)) {
            int i13 = iArr[2];
            int i14 = iArr[1];
            int i15 = iArr[3];
            fB = a(i10, (int) ((fA - (i13 / 2)) - (i14 / 2)), (int) ((i13 / 2) + fA + (i15 / 2)), i14 + i13 + i15, i12);
        }
        if (Float.isNaN(fB)) {
            return false;
        }
        return a(false, fB, fA, i12 / 7.0f);
    }

    protected final boolean a(int[] iArr, int i10, int i11, boolean z10) {
        boolean z11 = false;
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = i12 + i13 + i14 + i15 + i16;
        boolean z12 = f61943h;
        boolean z13 = f61944i;
        int i18 = z12 ? i13 + i13 + i14 + i15 + i16 : z13 ? i12 + i13 + i14 + i15 + i15 : i17;
        int iA = (int) a(iArr, i11);
        float fB = b(i10, iA, iArr[2], i18, z10);
        boolean z14 = f61943h;
        boolean z15 = f61944i;
        if (!Float.isNaN(fB)) {
            float f10 = i18 / 7.0f;
            int i19 = (int) fB;
            float fA = a(iA, i19, iArr[2], i18, z10);
            if (!Float.isNaN(fA) && (a(i19, (int) fA) || (z10 && (z12 || z13 || z14 || z15)))) {
                if (z10) {
                    return a(false, fB, fA, f10);
                }
                for (int i20 = 0; i20 < this.f61947b.size(); i20++) {
                    e3 e3Var = this.f61947b.get(i20);
                    if (e3Var.b(f10, fB, fA)) {
                        this.f61947b.set(i20, e3Var.a(fB, fA, f10, true));
                        z11 = true;
                        break;
                    }
                }
                if (!z11) {
                    e3 e3Var2 = new e3(fA, fB, f10, true);
                    this.f61947b.add(e3Var2);
                    v6 v6Var = this.f61950e;
                    if (v6Var != null) {
                        v6Var.a(e3Var2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    final k3 b() throws com.huawei.hms.scankit.p.a {
        int iC = this.f61946a.c();
        int iE = this.f61946a.e();
        int i10 = (iC * 3) / bb.c.b.f31054y4;
        if (i10 < 3) {
            i10 = 3;
        }
        if (r3.f62288n) {
            i10 = 2;
        }
        a(i10, iC, iE);
        e3[] e3VarArrC = c();
        if (e3VarArrC == null) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        u6.a(e3VarArrC);
        if (((double) (this.f61946a.c() * this.f61946a.e())) / (Math.sqrt(a(e3VarArrC[0], e3VarArrC[1])) * Math.sqrt(a(e3VarArrC[1], e3VarArrC[2]))) <= 900.0d) {
            return new k3(e3VarArrC);
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    protected final boolean b(int[] iArr, int i10, int i11) {
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = i12 + i13 + iArr[2];
        float f10 = i11 - (i14 / 2);
        int i15 = (int) f10;
        float fA = a(i10, i15, i13, i14);
        if (Float.isNaN(fA)) {
            int i16 = iArr[1];
            fA = a(i10, (int) (f10 - ((i16 * 2) / 5)), (int) (((i16 * 2) / 5) + f10), i16, i14);
            if (Float.isNaN(fA) && r3.f62282h) {
                fA = b(i10, i15, iArr[1], i14);
            }
        }
        if (Float.isNaN(fA)) {
            return false;
        }
        return a(false, fA, f10, i14 / 7.0f);
    }

    protected final void d(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
