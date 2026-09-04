package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: OtsuBinarizer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k5 extends q3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s f62042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p4 f62043f;

    public k5(p4 p4Var) {
        super(p4Var);
        this.f62043f = p4Var;
    }

    @Override // com.huawei.hms.scankit.p.q3, com.huawei.hms.scankit.p.o
    public s a() {
        s sVar = this.f62042e;
        if (sVar != null) {
            return sVar;
        }
        p4 p4VarC = c();
        int iC = p4VarC.c();
        int iA = p4VarC.a();
        byte[] bArrB = p4VarC.b();
        s sVar2 = new s(iC, iA);
        byte[] bArrB2 = this.f62043f.b();
        int iC2 = this.f62043f.c();
        int iA2 = this.f62043f.a();
        int i10 = 256;
        int[] iArr = new int[256];
        for (int i11 = 0; i11 < iA2; i11++) {
            int i12 = i11 * iC2;
            for (int i13 = 0; i13 < iC2; i13++) {
                int i14 = bArrB2[i12 + i13] & 255;
                iArr[i14] = iArr[i14] + 1;
            }
        }
        int i15 = 0;
        int i16 = 0;
        double d10 = 0.0d;
        while (i15 < i10) {
            int i17 = 0;
            int i18 = 0;
            double d11 = 0.0d;
            while (i17 < i15) {
                int i19 = iArr[i17];
                i18 += i19;
                d11 += (double) (i19 * i17);
                i17++;
                iArr = iArr;
                i10 = 256;
            }
            int[] iArr2 = iArr;
            int i20 = 0;
            double d12 = 0.0d;
            int i21 = i15;
            for (int i22 = i10; i21 < i22; i22 = 256) {
                int i23 = iArr2[i21];
                i20 += i23;
                d12 += (double) (i23 * i21);
                i21++;
                i18 = i18;
            }
            int i24 = i18;
            double d13 = i24;
            int i25 = iC2;
            int i26 = iA2;
            double d14 = iC2 * iA2;
            double d15 = d13 / d14;
            byte[] bArr = bArrB;
            double d16 = i20;
            double d17 = d16 / d14;
            double d18 = i24 > 0 ? d11 / d13 : 0.0d;
            double d19 = i20 > 0 ? d12 / d16 : 0.0d;
            double d20 = (d15 * d18) + (d17 * d19);
            double d21 = d18 - d20;
            double d22 = d19 - d20;
            double d23 = (d15 * d21 * d21) + (d17 * d22 * d22);
            if (d23 > d10) {
                i16 = i15;
                d10 = d23;
            }
            i15++;
            bArrB = bArr;
            iC2 = i25;
            iArr = iArr2;
            iA2 = i26;
            i10 = 256;
        }
        byte[] bArr2 = bArrB;
        for (int i27 = 0; i27 < iA; i27++) {
            int i28 = i27 * iC;
            for (int i29 = 0; i29 < iC; i29++) {
                if ((bArr2[i28 + i29] & 255) <= i16) {
                    sVar2.c(i29, i27);
                }
            }
        }
        this.f62042e = sVar2;
        return sVar2;
    }
}
