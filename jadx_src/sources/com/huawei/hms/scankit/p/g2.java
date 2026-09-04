package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.Map;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes7.dex */
public class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f61853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v6 f61854b;

    public g2(s sVar) {
        this.f61853a = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f A[RETURN] */
    private float a(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int iAbs = Math.abs(i16 - i14);
        int iAbs2 = Math.abs(i17 - i15);
        int i20 = 2;
        int i21 = (-iAbs) / 2;
        int i22 = i14 < i16 ? 1 : -1;
        int i23 = i15 < i17 ? 1 : -1;
        int i24 = i16 + i22;
        int i25 = i14;
        int i26 = i15;
        int i27 = 0;
        while (i25 != i24) {
            if ((i27 == i19 ? i19 : 0) == this.f61853a.b(z10 ? i26 : i25, z10 ? i25 : i26)) {
                if (i27 == 2) {
                    return s4.a(i25, i26, i14, i15);
                }
                i27++;
            }
            i21 += iAbs2;
            if (i21 > 0) {
                if (i26 == i17) {
                    i18 = 2;
                    if (i27 == i18) {
                        return s4.a(i24, i17, i14, i15);
                    }
                    return Float.NaN;
                }
                i26 += i23;
                i21 -= iAbs;
            }
            i25 += i22;
            i24 = i24;
            z10 = z10;
            i19 = 1;
            i20 = 2;
        }
        i24 = i24;
        i18 = i20;
        if (i27 == i18) {
            return s4.a(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    private float a(u6 u6Var, u6 u6Var2) {
        float fB = b((int) u6Var.b(), (int) u6Var.c(), (int) u6Var2.b(), (int) u6Var2.c());
        float fB2 = b((int) u6Var2.b(), (int) u6Var2.c(), (int) u6Var.b(), (int) u6Var.c());
        if (Float.isNaN(fB)) {
            return fB2 / 7.0f;
        }
        return Float.isNaN(fB2) ? fB / 7.0f : (fB + fB2) / 14.0f;
    }

    private int a(b8 b8Var, int i10, e3 e3Var, e3 e3Var2, e3 e3Var3, float f10, int i11, int i12, d[] dVarArr, d[] dVarArr2) {
        int i13;
        int i14;
        int i15;
        float f11;
        int i16 = i12;
        int i17 = 0;
        while (i17 < i11) {
            if (i17 == 0) {
                i13 = i11 - 1;
                i14 = 1;
            } else {
                i13 = i11;
                i14 = 0;
            }
            int i18 = i17 != i11 + (-1) ? i14 : 1;
            float f12 = 3.0f;
            float f13 = i10;
            float fB = (((b8Var.c()[i17] - 3.0f) * (e3Var.b() - e3Var2.b())) / f13) + e3Var2.b();
            float fC = (((b8Var.c()[i17] - 3.0f) * (e3Var.c() - e3Var2.c())) / f13) + e3Var2.c();
            while (i18 < i13) {
                int iC = (int) (fC - (((b8Var.c()[i18] - f12) * (e3Var2.c() - e3Var3.c())) / f13));
                int iB = (int) (fB - (((b8Var.c()[i18] - f12) * (e3Var2.b() - e3Var3.b())) / f13));
                int i19 = 4;
                int i20 = 4;
                while (true) {
                    if (i20 > i19) {
                        i15 = i13;
                        f11 = fB;
                        break;
                    }
                    int i21 = (i17 * i11) + i18;
                    try {
                        dVarArr[i21] = a(f10, iB, iC, i20);
                        i15 = i13;
                        try {
                            f11 = fB;
                            try {
                                dVarArr2[i21] = new d(b8Var.c()[i17] + 0.5f, b8Var.c()[i18] + 0.5f, e3Var3.e());
                                i16++;
                                break;
                            } catch (a unused) {
                                continue;
                                i20 <<= 1;
                                i11 = i11;
                                fB = f11;
                                i13 = i15;
                                i19 = 4;
                            }
                        } catch (a unused2) {
                            f11 = fB;
                        }
                    } catch (a unused3) {
                        i15 = i13;
                    }
                    i20 <<= 1;
                    i11 = i11;
                    fB = f11;
                    i13 = i15;
                    i19 = 4;
                }
                i18++;
                i11 = i11;
                fB = f11;
                i13 = i15;
                f12 = 3.0f;
            }
            i17++;
        }
        return i16;
    }

    private int a(e3 e3Var, e3 e3Var2, e3 e3Var3, float f10, int i10, b8 b8Var, d[] dVarArr, d[] dVarArr2, int i11, int i12, d[] dVarArr3) {
        int i13;
        int i14;
        float fB = (e3Var2.b() - e3Var.b()) + e3Var3.b();
        float fC = (e3Var2.c() - e3Var.c()) + e3Var3.c();
        float f11 = i12;
        float f12 = 3.0f / f11;
        float f13 = 1.0f - f12;
        int iB = (int) (e3Var.b() + ((fB - e3Var.b()) * f13));
        int iC = (int) (e3Var.c() + (f13 * (fC - e3Var.c())));
        if (r3.f62296v[0] && i12 == 22) {
            i14 = 8;
            i13 = 2;
        } else {
            i13 = 4;
            i14 = 16;
        }
        for (int i15 = i13; i15 <= i14; i15 <<= 1) {
            try {
                dVarArr3[0] = a(f10, iB, iC, i15);
                break;
            } catch (a unused) {
            }
        }
        float f14 = i10 - 6.5f;
        dVarArr3[1] = new d(f14, f14, e3Var3.e());
        d dVar = dVarArr3[0];
        if (dVar != null && s4.a(iB, iC, dVar.b(), dVarArr3[0].c()) > f10 * 4.0f) {
            dVarArr3[0] = null;
        }
        if (dVarArr3[0] == null && i11 > 2) {
            int i16 = i11 - 2;
            dVarArr3[1] = new d(b8Var.c()[i16] + 0.5f, f14, e3Var3.e());
            int iC2 = (int) (e3Var3.c() - (f12 * (e3Var3.c() - e3Var.c())));
            int iB2 = (int) ((((b8Var.c()[i16] - 3.0f) / f11) * (e3Var2.b() - e3Var.b())) + e3Var3.b());
            while (i13 <= i14) {
                try {
                    dVarArr3[0] = a(f10, iB2, iC2, i13);
                    break;
                } catch (a unused2) {
                    i13 <<= 1;
                }
            }
            d dVar2 = dVarArr3[0];
            if (dVar2 != null && s4.a(iB2, iC2, dVar2.b(), dVarArr3[0].c()) > f10 * 4.0f) {
                dVarArr3[0] = null;
            }
        }
        if (r3.f62290p && r3.f62287m) {
            return a(b8Var, i12, e3Var2, e3Var, e3Var3, f10, i11, 0, dVarArr, dVarArr2);
        }
        return 0;
    }

    private static int a(u6 u6Var, u6 u6Var2, u6 u6Var3, float f10) throws a {
        int iA;
        try {
            iA = ((s4.a(u6.a(u6Var, u6Var2) / f10) + s4.a(u6.a(u6Var, u6Var3) / f10)) / 2) + 7;
            int i10 = iA & 3;
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return iA;
                    }
                    throw a.a();
                }
                return iA - 1;
            }
        } catch (a unused) {
            iA = ((((int) (u6.a(u6Var, u6Var2) / f10)) + ((int) (u6.a(u6Var, u6Var3) / f10))) / 2) + 7;
            int i11 = iA & 3;
            if (i11 != 0) {
                if (i11 != 2) {
                    return i11 != 3 ? iA : iA + 2;
                }
            }
            return iA + 1;
        }
        return iA + 1;
    }

    private static d6 a(u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4, u6 u6Var5, int i10) {
        float fB;
        float fC;
        float fB2;
        float fC2;
        float f10 = i10 - 3.5f;
        if (u6Var4 != null) {
            float fB3 = u6Var4.b();
            fB = fB3;
            fC = u6Var4.c();
            fB2 = u6Var5.b();
            fC2 = u6Var5.c();
        } else {
            fB = (u6Var2.b() - u6Var.b()) + u6Var3.b();
            fC = (u6Var2.c() - u6Var.c()) + u6Var3.c();
            fB2 = f10;
            fC2 = fB2;
        }
        return d6.a(3.5f, 3.5f, f10, 3.5f, fB2, fC2, 3.5f, f10, u6Var.b(), u6Var.c(), u6Var2.b(), u6Var2.c(), fB, fC, u6Var3.b(), u6Var3.c());
    }

    private j2 a(e3 e3Var, e3 e3Var2, e3 e3Var3, float f10) throws a {
        d[] dVarArr;
        int iA;
        int iA2 = a((u6) e3Var, (u6) e3Var2, (u6) e3Var3, f10);
        r3.f62297w.push(Integer.valueOf(iA2));
        b8 b8VarB = b8.b(iA2);
        if (r3.f62293s && r3.f62277c) {
            return a(e3Var, e3Var2, e3Var3, f10, iA2);
        }
        int iD = b8VarB.d() - 7;
        int length = b8VarB.c().length;
        int i10 = length * length;
        d[] dVarArr2 = new d[i10];
        d[] dVarArr3 = new d[i10];
        d[] dVarArr4 = new d[2];
        if (b8VarB.c().length > 0) {
            dVarArr = dVarArr4;
            iA = a(e3Var, e3Var2, e3Var3, f10, iA2, b8VarB, dVarArr2, dVarArr3, length, iD, dVarArr);
        } else {
            dVarArr = dVarArr4;
            iA = 0;
        }
        d dVar = dVarArr[0];
        d6 d6VarA = a(e3Var, e3Var2, e3Var3, dVar, dVarArr[1], iA2);
        if (r3.f62290p && r3.f62287m) {
            a(d6VarA, length, iA2, e3Var, e3Var2, e3Var3, dVarArr2, iA, dVarArr3);
        }
        s sVarA = a(this.f61853a, d6VarA, iA2);
        u6[] u6VarArr = dVar == null ? new u6[]{e3Var3, e3Var, e3Var2} : new u6[]{e3Var3, e3Var, e3Var2, dVar};
        float f11 = iA2;
        float[] fArr = {0.0f, 0.0f, f11, 0.0f, f11, f11, 0.0f, f11};
        d6VarA.a(fArr);
        return new j2(sVarA, u6VarArr, new u6[]{a(new u6(fArr[6], fArr[7])), a(new u6(fArr[0], fArr[1], e3Var.d())), a(new u6(fArr[r8], fArr[3], e3Var2.d())), a(new u6(fArr[4], fArr[5], e3Var3.d()))}, f10);
    }

    private j2 a(e3 e3Var, e3 e3Var2, e3 e3Var3, float f10, int i10) {
        s sVar = new s(i10, i10);
        float f11 = i10;
        float fC = this.f61853a.c() / f11;
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                double d10 = ((double) fC) * 0.5d;
                int i13 = (int) (((double) (i12 * fC)) + d10);
                int i14 = (int) (((double) (i11 * fC)) + d10);
                if (i13 < -1 || i13 > this.f61853a.e() || i14 < -1 || i14 > this.f61853a.c()) {
                    sVar.c(i12, i11);
                } else if (this.f61853a.b(i13, i14)) {
                    sVar.c(i12, i11);
                }
            }
        }
        u6[] u6VarArr = {e3Var3, e3Var, e3Var2};
        float[] fArr = {0.0f, 0.0f, f11, 0.0f, f11, f11, 0.0f, f11};
        a(e3Var, e3Var2, e3Var3, null, null, i10).a(fArr);
        return new j2(sVar, u6VarArr, new u6[]{a(new u6(fArr[6], fArr[7])), a(new u6(fArr[0], fArr[1])), a(new u6(fArr[2], fArr[3])), a(new u6(fArr[4], fArr[5]))}, f10);
    }

    private static s a(s sVar, d6 d6Var, int i10) throws a {
        return s3.a().a(sVar, i10, i10, d6Var, true);
    }

    private u6 a(u6 u6Var) {
        float fB = u6Var.b();
        float fC = u6Var.c();
        int iE = this.f61853a.e() - 1;
        int iC = this.f61853a.c() - 1;
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        float f10 = iE;
        if (fB > f10) {
            fB = f10;
        }
        if (fC < 0.0f) {
            fC = 0.0f;
        }
        float f11 = iC;
        if (fC > f11) {
            fC = f11;
        }
        return new u6(fB, fC, u6Var.d());
    }

    private void a(d6 d6Var, int i10, int i11, e3 e3Var, e3 e3Var2, e3 e3Var3, d[] dVarArr, int i12, d[] dVarArr2) {
        int i13 = i12 + 3;
        int i14 = i13 * 2;
        float[] fArr = new float[i14];
        float[] fArr2 = new float[i14];
        fArr[0] = e3Var.b();
        fArr[1] = e3Var.c();
        fArr[2] = e3Var2.b();
        fArr[3] = e3Var2.c();
        fArr[4] = e3Var3.b();
        fArr[5] = e3Var3.c();
        fArr2[0] = 3.5f;
        fArr2[1] = 3.5f;
        float f10 = i11 - 3.5f;
        fArr2[2] = f10;
        fArr2[3] = 3.5f;
        fArr2[4] = 3.5f;
        fArr2[5] = f10;
        int i15 = 6;
        int i16 = 6;
        for (int i17 = 0; i17 < i10 * i10; i17++) {
            d dVar = dVarArr[i17];
            if (dVar != null) {
                int i18 = i16 + 1;
                fArr[i16] = dVar.b();
                i16 = i18 + 1;
                fArr[i18] = dVarArr[i17].c();
                int i19 = i15 + 1;
                fArr2[i15] = dVarArr2[i17].b();
                i15 = i19 + 1;
                fArr2[i19] = dVarArr2[i17].c();
            }
        }
        float[] fArrQuadFitting = LoadOpencvJNIUtil.QuadFitting(fArr2, i13, fArr);
        if (fArrQuadFitting.length != 0) {
            d6Var.a(fArrQuadFitting[0], fArrQuadFitting[1], fArrQuadFitting[2], fArrQuadFitting[3], fArrQuadFitting[4], fArrQuadFitting[5], fArrQuadFitting[6], fArrQuadFitting[7], fArrQuadFitting[8], fArrQuadFitting[9], fArrQuadFitting[10], fArrQuadFitting[11], fArrQuadFitting[12], fArrQuadFitting[13]);
        }
    }

    private float b(int i10, int i11, int i12, int i13) {
        float fE;
        float fC;
        float fA = a(i10, i11, i12, i13);
        int iE = i10 - (i12 - i10);
        if (i10 == iE) {
            return Float.NaN;
        }
        int iC = 0;
        if (iE < 0) {
            fE = i10 / (i10 - iE);
            iE = 0;
        } else if (iE >= this.f61853a.e()) {
            fE = ((this.f61853a.e() - 1) - i10) / (iE - i10);
            iE = this.f61853a.e() - 1;
        } else {
            fE = 1.0f;
        }
        float f10 = i11;
        int i14 = (int) (f10 - ((i13 - i11) * fE));
        if (i11 == i14) {
            return Float.NaN;
        }
        if (i14 < 0) {
            fC = f10 / (i11 - i14);
        } else if (i14 >= this.f61853a.c()) {
            fC = ((this.f61853a.c() - 1) - i11) / (i14 - i11);
            iC = this.f61853a.c() - 1;
        } else {
            iC = i14;
            fC = 1.0f;
        }
        float fA2 = a(i10, i11, (int) (i10 + ((iE - i10) * fC)), iC);
        if (Math.max(fA, fA2) > ((double) Math.min(fA, fA2)) * 1.5d) {
            return Float.NaN;
        }
        return (fA + fA2) - 1.0f;
    }

    protected final float a(u6 u6Var, u6 u6Var2, u6 u6Var3) {
        return (a(u6Var, u6Var2) + a(u6Var, u6Var3)) / 2.0f;
    }

    protected final d a(float f10, int i10, int i11, float f11) throws a {
        int i12 = (int) (f11 * f10);
        int iMax = Math.max(0, i10 - i12);
        int iMin = Math.min(this.f61853a.e() - 1, i10 + i12) - iMax;
        float f12 = 3.0f * f10;
        if (iMin < f12) {
            throw a.a();
        }
        int iMax2 = Math.max(0, i11 - i12);
        int iMin2 = Math.min(this.f61853a.c() - 1, i11 + i12) - iMax2;
        if (iMin2 >= f12) {
            return new e(this.f61853a, iMax, iMax2, iMin, iMin2, f10, this.f61854b).a();
        }
        throw a.a();
    }

    protected final j2 a(k3 k3Var) throws a {
        e3 e3VarB = k3Var.b();
        e3 e3VarC = k3Var.c();
        e3 e3VarA = k3Var.a();
        try {
            float fA = a(e3VarB, e3VarC, e3VarA);
            if (fA >= 1.0f) {
                return a(e3VarB, e3VarC, e3VarA, fA);
            }
            throw a.a();
        } catch (a unused) {
            float fE = ((e3VarB.e() + e3VarC.e()) + e3VarA.e()) / 3.0f;
            if (fE >= 1.0f) {
                return a(e3VarB, e3VarC, e3VarA, fE);
            }
            throw a.a();
        }
    }

    public final j2 a(Map<l1, ?> map) throws a {
        this.f61854b = map == null ? null : (v6) map.get(l1.NEED_RESULT_POINT_CALLBACK);
        return a(new i3(this.f61853a, this.f61854b).b());
    }
}
