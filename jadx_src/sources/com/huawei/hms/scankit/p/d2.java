package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f61663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j8 f61664b;

    public d2(s sVar) throws a {
        this.f61663a = sVar;
        this.f61664b = new j8(sVar);
    }

    private int a(u6 u6Var, u6 u6Var2) {
        int i10;
        boolean z10;
        d2 d2Var = this;
        int iB = (int) u6Var.b();
        int iC = (int) u6Var.c();
        int iB2 = (int) u6Var2.b();
        int iC2 = (int) u6Var2.c();
        boolean z11 = Math.abs(iC2 - iC) > Math.abs(iB2 - iB);
        if (!z11) {
            iC = iB;
            iB = iC;
            iC2 = iB2;
            iB2 = iC2;
        }
        int iAbs = Math.abs(iC2 - iC);
        int iAbs2 = Math.abs(iB2 - iB);
        int i11 = (-iAbs) / 2;
        int i12 = iB < iB2 ? 1 : -1;
        int i13 = iC < iC2 ? 1 : -1;
        boolean zB = d2Var.f61663a.b(z11 ? iB : iC, z11 ? iC : iB);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (iC != iC2) {
            boolean zB2 = d2Var.f61663a.b(z11 ? iB : iC, z11 ? iC : iB);
            i14++;
            if (zB2 != zB) {
                i10 = iC2;
                z10 = z11;
                if (i14 > Math.ceil(((double) i15) / 1.5d)) {
                    i16++;
                    i15 -= (i15 - i14) / i16;
                    zB = zB2;
                    i14 = 0;
                }
            } else {
                i10 = iC2;
                z10 = z11;
            }
            i11 += iAbs2;
            if (i11 > 0) {
                if (iB == iB2) {
                    break;
                }
                iB += i12;
                i11 -= iAbs;
            }
            iC += i13;
            d2Var = this;
            z11 = z10;
            iC2 = i10;
        }
        return i16;
    }

    private static s a(s sVar, u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4, int i10, int i11) throws a {
        float f10 = i10 - 0.5f;
        float f11 = i11 - 0.5f;
        return s3.a().a(sVar, i10, i11, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, u6Var.b(), u6Var.c(), u6Var4.b(), u6Var4.c(), u6Var3.b(), u6Var3.c(), u6Var2.b(), u6Var2.c());
    }

    private static u6 a(u6 u6Var, float f10, float f11) {
        float fB = u6Var.b();
        float fC = u6Var.c();
        return new u6(fB < f10 ? fB - 1.0f : fB + 1.0f, fC < f11 ? fC - 1.0f : fC + 1.0f);
    }

    private static u6 a(u6 u6Var, u6 u6Var2, int i10) {
        float f10 = i10 + 1;
        return new u6(u6Var.b() + ((u6Var2.b() - u6Var.b()) / f10), u6Var.c() + ((u6Var2.c() - u6Var.c()) / f10));
    }

    private u6 a(u6[] u6VarArr) {
        u6 u6Var = u6VarArr[0];
        u6 u6Var2 = u6VarArr[1];
        u6 u6Var3 = u6VarArr[2];
        u6 u6Var4 = u6VarArr[3];
        int iA = a(u6Var, u6Var4);
        u6 u6VarA = a(u6Var, u6Var2, (a(u6Var2, u6Var4) + 1) * 4);
        u6 u6VarA2 = a(u6Var3, u6Var2, (iA + 1) * 4);
        int iA2 = a(u6VarA, u6Var4);
        int iA3 = a(u6VarA2, u6Var4);
        float f10 = iA2 + 1;
        u6 u6Var5 = new u6(u6Var4.b() + ((u6Var3.b() - u6Var2.b()) / f10), u6Var4.c() + ((u6Var3.c() - u6Var2.c()) / f10));
        float f11 = iA3 + 1;
        u6 u6Var6 = new u6(u6Var4.b() + ((u6Var.b() - u6Var2.b()) / f11), u6Var4.c() + ((u6Var.c() - u6Var2.c()) / f11));
        if (a(u6Var5)) {
            return (a(u6Var6) && a(u6VarA, u6Var5) + a(u6VarA2, u6Var5) <= a(u6VarA, u6Var6) + a(u6VarA2, u6Var6)) ? u6Var6 : u6Var5;
        }
        if (a(u6Var6)) {
            return u6Var6;
        }
        return null;
    }

    private boolean a(u6 u6Var) {
        return u6Var.b() >= 0.0f && u6Var.b() < ((float) this.f61663a.e()) && u6Var.c() > 0.0f && u6Var.c() < ((float) this.f61663a.c());
    }

    private u6[] b(u6[] u6VarArr) {
        u6 u6Var = u6VarArr[0];
        u6 u6Var2 = u6VarArr[1];
        u6 u6Var3 = u6VarArr[3];
        u6 u6Var4 = u6VarArr[2];
        int iA = a(u6Var, u6Var2);
        int iA2 = a(u6Var2, u6Var3);
        int iA3 = a(u6Var3, u6Var4);
        int iA4 = a(u6Var4, u6Var);
        u6[] u6VarArr2 = {u6Var4, u6Var, u6Var2, u6Var3};
        if (iA > iA2) {
            u6VarArr2[0] = u6Var;
            u6VarArr2[1] = u6Var2;
            u6VarArr2[2] = u6Var3;
            u6VarArr2[3] = u6Var4;
            iA = iA2;
        }
        if (iA > iA3) {
            u6VarArr2[0] = u6Var2;
            u6VarArr2[1] = u6Var3;
            u6VarArr2[2] = u6Var4;
            u6VarArr2[3] = u6Var;
        } else {
            iA3 = iA;
        }
        if (iA3 > iA4) {
            u6VarArr2[0] = u6Var3;
            u6VarArr2[1] = u6Var4;
            u6VarArr2[2] = u6Var;
            u6VarArr2[3] = u6Var2;
        }
        return u6VarArr2;
    }

    private u6[] c(u6[] u6VarArr) {
        u6 u6Var = u6VarArr[0];
        u6 u6Var2 = u6VarArr[1];
        u6 u6Var3 = u6VarArr[2];
        u6 u6Var4 = u6VarArr[3];
        int iA = (a(u6Var, u6Var4) + 1) * 4;
        if (a(a(u6Var2, u6Var3, iA), u6Var) < a(a(u6Var3, u6Var2, iA), u6Var4)) {
            u6VarArr[0] = u6Var;
            u6VarArr[1] = u6Var2;
            u6VarArr[2] = u6Var3;
            u6VarArr[3] = u6Var4;
        } else {
            u6VarArr[0] = u6Var2;
            u6VarArr[1] = u6Var3;
            u6VarArr[2] = u6Var4;
            u6VarArr[3] = u6Var;
        }
        return u6VarArr;
    }

    private u6[] d(u6[] u6VarArr) {
        u6 u6Var = u6VarArr[0];
        u6 u6Var2 = u6VarArr[1];
        u6 u6Var3 = u6VarArr[2];
        u6 u6Var4 = u6VarArr[3];
        int iA = a(u6Var, u6Var4) + 1;
        u6 u6VarA = a(u6Var, u6Var2, (a(u6Var3, u6Var4) + 1) * 4);
        u6 u6VarA2 = a(u6Var3, u6Var2, iA * 4);
        int iA2 = a(u6VarA, u6Var4) + 1;
        int iA3 = a(u6VarA2, u6Var4) + 1;
        if ((iA2 & 1) == 1) {
            iA2++;
        }
        if ((iA3 & 1) == 1) {
            iA3++;
        }
        float fB = (((u6Var.b() + u6Var2.b()) + u6Var3.b()) + u6Var4.b()) / 4.0f;
        float fC = (((u6Var.c() + u6Var2.c()) + u6Var3.c()) + u6Var4.c()) / 4.0f;
        u6 u6VarA3 = a(u6Var, fB, fC);
        u6 u6VarA4 = a(u6Var2, fB, fC);
        u6 u6VarA5 = a(u6Var3, fB, fC);
        u6 u6VarA6 = a(u6Var4, fB, fC);
        int i10 = iA3 * 4;
        int i11 = iA2 * 4;
        return new u6[]{a(a(u6VarA3, u6VarA4, i10), u6VarA6, i11), a(a(u6VarA4, u6VarA3, i10), u6VarA5, i11), a(a(u6VarA5, u6VarA6, i10), u6VarA4, i11), a(a(u6VarA6, u6VarA5, i10), u6VarA3, i11)};
    }

    public j2 a() throws a {
        int iMax;
        int i10;
        u6[] u6VarArrC = c(b(this.f61664b.a()));
        u6 u6VarA = a(u6VarArrC);
        u6VarArrC[3] = u6VarA;
        if (u6VarA == null) {
            throw a.a();
        }
        u6[] u6VarArrD = d(u6VarArrC);
        u6 u6Var = u6VarArrD[0];
        u6 u6Var2 = u6VarArrD[1];
        u6 u6Var3 = u6VarArrD[2];
        u6 u6Var4 = u6VarArrD[3];
        int iA = a(u6Var, u6Var4) + 1;
        int iA2 = a(u6Var3, u6Var4) + 1;
        if ((iA & 1) == 1) {
            iA++;
        }
        if ((iA2 & 1) == 1) {
            iA2++;
        }
        if (iA * 4 >= iA2 * 7 || iA2 * 4 >= iA * 7) {
            iMax = iA;
            i10 = iA2;
        } else {
            iMax = Math.max(iA, iA2);
            i10 = iMax;
        }
        return new j2(a(this.f61663a, u6Var, u6Var2, u6Var3, u6Var4, iMax, i10), new u6[]{u6Var, u6Var2, u6Var3, u6Var4});
    }
}
