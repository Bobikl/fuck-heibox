package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AlignmentPatternFinder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f61725a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f61727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f61728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f61729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f61730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f61731g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v6 f61733i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f61726b = new ArrayList(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f61732h = new int[3];

    e(s sVar, int i10, int i11, int i12, int i13, float f10, v6 v6Var) {
        this.f61725a = sVar;
        this.f61727c = i10;
        this.f61728d = i11;
        this.f61729e = i12;
        this.f61730f = i13;
        this.f61731g = f10;
        this.f61733i = v6Var;
    }

    private float a(int i10, int i11, int i12, int i13) {
        int i14;
        s sVar = this.f61725a;
        int iC = sVar.c();
        int[] iArr = this.f61732h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i15 = i10;
        while (i15 >= 0 && sVar.b(i11, i15)) {
            int i16 = iArr[1];
            if (i16 > i12) {
                break;
            }
            iArr[1] = i16 + 1;
            i15--;
        }
        if (i15 < 0 || iArr[1] > i12) {
            return Float.NaN;
        }
        while (i15 >= 0 && !sVar.b(i11, i15)) {
            int i17 = iArr[0];
            if (i17 > i12) {
                break;
            }
            iArr[0] = i17 + 1;
            i15--;
        }
        if (iArr[0] > i12) {
            return Float.NaN;
        }
        int i18 = i10 + 1;
        while (i18 < iC && sVar.b(i11, i18)) {
            int i19 = iArr[1];
            if (i19 > i12) {
                break;
            }
            iArr[1] = i19 + 1;
            i18++;
        }
        if (i18 == iC || iArr[1] > i12) {
            return Float.NaN;
        }
        while (i18 < iC && !sVar.b(i11, i18)) {
            int i20 = iArr[2];
            if (i20 > i12) {
                break;
            }
            iArr[2] = i20 + 1;
            i18++;
        }
        int i21 = iArr[2];
        if (i21 <= i12 && (i14 = iArr[0] + iArr[1] + i21) < i13 * 3 && i14 * 3 > i13 && a(iArr)) {
            return a(iArr, i18);
        }
        return Float.NaN;
    }

    private static float a(int[] iArr, int i10) {
        return (i10 - iArr[2]) - (iArr[1] / 2.0f);
    }

    private d a(int i10, int i11, int i12, int[] iArr) {
        d dVarA;
        int i13 = 0;
        while (i11 < i12) {
            if (!this.f61725a.b(i11, i10)) {
                if (i13 == 1) {
                    i13++;
                }
                iArr[i13] = iArr[i13] + 1;
            } else if (i13 == 1) {
                iArr[1] = iArr[1] + 1;
            } else if (i13 != 2) {
                i13++;
                iArr[i13] = iArr[i13] + 1;
            } else {
                if (a(iArr) && (dVarA = a(iArr, i10, i11)) != null) {
                    return dVarA;
                }
                iArr[0] = iArr[2];
                iArr[1] = 1;
                iArr[2] = 0;
                i13 = 1;
            }
            i11++;
        }
        return null;
    }

    private d a(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float fA = a(iArr, i11);
        float fA2 = a(i10, (int) fA, iArr[1] * 3, i12);
        if (Float.isNaN(fA2)) {
            return null;
        }
        float f10 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (d dVar : this.f61726b) {
            if (dVar.b(f10, fA2, fA)) {
                return dVar.c(fA2, fA, f10);
            }
        }
        d dVar2 = new d(fA, fA2, f10);
        this.f61726b.add(dVar2);
        v6 v6Var = this.f61733i;
        if (v6Var == null) {
            return null;
        }
        v6Var.a(dVar2);
        return null;
    }

    private boolean a(int[] iArr) {
        float f10 = this.f61731g;
        float f11 = (3.0f * f10) / 4.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - iArr[i10]) >= f11) {
                return false;
            }
        }
        return true;
    }

    d a() throws a {
        d dVarA;
        int i10 = this.f61727c;
        int i11 = this.f61730f;
        int i12 = this.f61729e + i10;
        int i13 = this.f61728d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f61725a.b(i16, i15)) {
                i16++;
            }
            d dVarA2 = a(i15, i16, i12, iArr);
            if (dVarA2 != null) {
                return dVarA2;
            }
            if (a(iArr) && (dVarA = a(iArr, i15, i12)) != null) {
                return dVarA;
            }
        }
        if (this.f61726b.isEmpty()) {
            throw a.a();
        }
        return this.f61726b.get(0);
    }
}
