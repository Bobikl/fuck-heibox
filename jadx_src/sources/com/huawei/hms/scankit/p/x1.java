package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: DefaultGridSampler.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x1 extends s3 {
    @Override // com.huawei.hms.scankit.p.s3
    public s a(s sVar, int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) throws a {
        return a(sVar, i10, i11, d6.a(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25), false);
    }

    public s a(s sVar, int i10, int i11, d6 d6Var) throws a {
        if (i10 <= 0 || i11 <= 0) {
            throw a.a();
        }
        s sVar2 = new s(i10, i11);
        float[] fArr = new float[10];
        float f10 = 0.5f;
        int i12 = 0;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = i12;
            while (i14 < i10) {
                float f11 = i14;
                fArr[i12] = (f11 - 0.2f) + f10;
                float f12 = i13;
                float f13 = f12 + f10;
                fArr[1] = f13;
                fArr[2] = f11 + 0.2f + f10;
                fArr[3] = f13;
                float f14 = f11 + f10;
                fArr[4] = f14;
                fArr[5] = (f12 - 0.2f) + f10;
                fArr[6] = f14;
                fArr[7] = f12 + 0.2f + f10;
                fArr[8] = f14;
                fArr[9] = f13;
                if (r3.f62290p && r3.f62287m) {
                    d6Var.b(fArr);
                } else {
                    d6Var.a(fArr);
                }
                int iE = sVar.e();
                int iC = sVar.c();
                int i15 = i12;
                int i16 = i15;
                while (i15 < 5) {
                    int i17 = i15 * 2;
                    try {
                        int i18 = (int) fArr[i17];
                        int i19 = (int) fArr[i17 + 1];
                        if (i18 >= -1 && i18 <= iE && i19 >= -1 && i19 <= iC) {
                            if (sVar.b(i18, i19)) {
                                i16++;
                            }
                        }
                        i15++;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw a.a();
                    }
                }
                if (i16 >= 3) {
                    sVar2.c(i14, i13);
                }
                i14++;
                f10 = 0.5f;
                i12 = 0;
            }
            i13++;
            f10 = 0.5f;
            i12 = 0;
        }
        return sVar2;
    }

    @Override // com.huawei.hms.scankit.p.s3
    public s a(s sVar, int i10, int i11, d6 d6Var, boolean z10) throws a {
        boolean z11 = r3.f62288n;
        return (z11 && z10) || ((!z11 && !z10) || r3.f62295u) ? b(sVar, i10, i11, d6Var) : a(sVar, i10, i11, d6Var);
    }

    public s b(s sVar, int i10, int i11, d6 d6Var) throws a {
        if (i10 <= 0 || i11 <= 0) {
            throw a.a();
        }
        s sVar2 = new s(i10, i11);
        int i12 = i10 * 2;
        float[] fArr = new float[i12];
        for (int i13 = 0; i13 < i11; i13++) {
            float f10 = i13 + 0.5f;
            for (int i14 = 0; i14 < i12; i14 += 2) {
                fArr[i14] = (i14 / 2) + 0.5f;
                fArr[i14 + 1] = f10;
            }
            if (r3.f62290p && r3.f62287m) {
                d6Var.b(fArr);
            } else {
                d6Var.a(fArr);
            }
            int iE = sVar.e();
            int iC = sVar.c();
            for (int i15 = 0; i15 < i12; i15 += 2) {
                try {
                    int i16 = (int) fArr[i15];
                    int i17 = (int) fArr[i15 + 1];
                    if (i16 < -1 || i16 > iE || i17 < -1 || i17 > iC) {
                        sVar2.c(i15 / 2, i13);
                    } else if (sVar.b(i16, i17)) {
                        sVar2.c(i15 / 2, i13);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw a.a();
                }
            }
        }
        return sVar2;
    }
}
