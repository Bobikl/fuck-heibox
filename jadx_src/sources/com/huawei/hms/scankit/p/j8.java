package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: WhiteRectangleDetector.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f62011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f62013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f62014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f62015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f62016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f62017g;

    public j8(s sVar) throws a {
        this(sVar, 10, sVar.e() / 2, sVar.c() / 2);
    }

    public j8(s sVar, int i10, int i11, int i12) throws a {
        this.f62011a = sVar;
        int iC = sVar.c();
        this.f62012b = iC;
        int iE = sVar.e();
        this.f62013c = iE;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.f62014d = i14;
        int i15 = i11 + i13;
        this.f62015e = i15;
        int i16 = i12 - i13;
        this.f62017g = i16;
        int i17 = i12 + i13;
        this.f62016f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= iC || i15 >= iE) {
            throw a.a();
        }
    }

    private u6 a(float f10, float f11, float f12, float f13) {
        int iA = s4.a(s4.a(f10, f11, f12, f13));
        float f14 = iA;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < iA; i10++) {
            float f17 = i10;
            int iA2 = s4.a((f17 * f15) + f10);
            int iA3 = s4.a((f17 * f16) + f11);
            if (this.f62011a.b(iA2, iA3)) {
                return new u6(iA2, iA3);
            }
        }
        return null;
    }

    private void a(int[] iArr) {
        int i10;
        boolean z10 = true;
        while (true) {
            if ((!z10 && iArr[8] == 1) || (i10 = iArr[3]) >= this.f62012b) {
                return;
            }
            boolean zA = a(iArr[0], iArr[1], i10, true);
            if (zA) {
                iArr[3] = iArr[3] + 1;
                iArr[5] = 1;
                iArr[8] = 1;
            } else if (iArr[8] != 1) {
                iArr[3] = iArr[3] + 1;
            }
            z10 = zA;
        }
    }

    private boolean a(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.f62011a.b(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.f62011a.b(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private u6[] a(u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4) {
        float fB = u6Var.b();
        float fC = u6Var.c();
        float fB2 = u6Var2.b();
        float fC2 = u6Var2.c();
        float fB3 = u6Var3.b();
        float fC3 = u6Var3.c();
        float fB4 = u6Var4.b();
        float fC4 = u6Var4.c();
        return fB < ((float) this.f62013c) / 2.0f ? new u6[]{new u6(fB4 - 1.0f, fC4 + 1.0f), new u6(fB2 + 1.0f, fC2 + 1.0f), new u6(fB3 - 1.0f, fC3 - 1.0f), new u6(fB + 1.0f, fC - 1.0f)} : new u6[]{new u6(fB4 + 1.0f, fC4 + 1.0f), new u6(fB2 + 1.0f, fC2 - 1.0f), new u6(fB3 - 1.0f, fC3 + 1.0f), new u6(fB - 1.0f, fC - 1.0f)};
    }

    private u6[] b(int[] iArr) throws a {
        int i10 = iArr[1] - iArr[0];
        u6 u6VarA = null;
        u6 u6VarA2 = null;
        for (int i11 = 1; u6VarA2 == null && i11 < i10; i11++) {
            int i12 = iArr[0];
            int i13 = iArr[3];
            u6VarA2 = a(i12, i13 - i11, i12 + i11, i13);
        }
        if (u6VarA2 == null) {
            throw a.a();
        }
        u6 u6VarA3 = null;
        for (int i14 = 1; u6VarA3 == null && i14 < i10; i14++) {
            int i15 = iArr[0];
            int i16 = iArr[2];
            u6VarA3 = a(i15, i16 + i14, i15 + i14, i16);
        }
        if (u6VarA3 == null) {
            throw a.a();
        }
        u6 u6VarA4 = null;
        for (int i17 = 1; u6VarA4 == null && i17 < i10; i17++) {
            int i18 = iArr[1];
            int i19 = iArr[2];
            u6VarA4 = a(i18, i19 + i17, i18 - i17, i19);
        }
        if (u6VarA4 == null) {
            throw a.a();
        }
        for (int i20 = 1; u6VarA == null && i20 < i10; i20++) {
            int i21 = iArr[1];
            int i22 = iArr[3];
            u6VarA = a(i21, i22 - i20, i21 - i20, i22);
        }
        if (u6VarA != null) {
            return a(u6VarA, u6VarA2, u6VarA4, u6VarA3);
        }
        throw a.a();
    }

    private void c(int[] iArr) {
        int i10;
        boolean z10 = true;
        while (true) {
            if ((!z10 && iArr[9] == 1) || (i10 = iArr[0]) < 0) {
                return;
            }
            boolean zA = a(iArr[2], iArr[3], i10, false);
            if (zA) {
                iArr[0] = iArr[0] - 1;
                iArr[5] = 1;
                iArr[9] = 1;
            } else if (iArr[9] != 1) {
                iArr[0] = iArr[0] - 1;
            }
            z10 = zA;
        }
    }

    private void d(int[] iArr) {
        int i10;
        boolean zA = true;
        while (true) {
            if ((!zA && iArr[7] == 1) || (i10 = iArr[1]) >= this.f62013c) {
                return;
            }
            zA = a(iArr[2], iArr[3], i10, false);
            if (zA) {
                iArr[1] = iArr[1] + 1;
                iArr[5] = 1;
                iArr[7] = 1;
            } else if (iArr[7] != 1) {
                iArr[1] = iArr[1] + 1;
            }
        }
    }

    private void e(int[] iArr) {
        int i10;
        boolean z10 = true;
        while (true) {
            if ((!z10 && iArr[10] == 1) || (i10 = iArr[2]) < 0) {
                return;
            }
            boolean zA = a(iArr[0], iArr[1], i10, true);
            if (zA) {
                iArr[2] = iArr[2] - 1;
                iArr[5] = 1;
                iArr[10] = 1;
            } else if (iArr[10] != 1) {
                iArr[2] = iArr[2] - 1;
            }
            z10 = zA;
        }
    }

    public u6[] a() throws a {
        int[] iArr = {this.f62014d, this.f62015e, this.f62017g, this.f62016f, 0, 1, 0, 0, 0, 0, 0};
        while (iArr[5] == 1) {
            iArr[5] = 0;
            d(iArr);
            if (iArr[1] >= this.f62013c) {
                iArr[4] = 1;
                break;
            }
            a(iArr);
            if (iArr[3] >= this.f62012b) {
                iArr[4] = 1;
                break;
            }
            c(iArr);
            if (iArr[0] < 0) {
                iArr[4] = 1;
                break;
            }
            e(iArr);
            if (iArr[2] < 0) {
                iArr[4] = 1;
                break;
            }
            if (iArr[5] == 1) {
                iArr[6] = 1;
            }
        }
        if (iArr[4] == 1 || iArr[6] != 1) {
            throw a.a();
        }
        return b(iArr);
    }
}
