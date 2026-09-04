package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: GlobalHistogramBinarizer.java */
/* JADX INFO: loaded from: classes7.dex */
public class q3 extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f62250d = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f62251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f62252c;

    public q3(p4 p4Var) {
        super(p4Var);
        this.f62251b = f62250d;
        this.f62252c = new int[32];
    }

    private static int a(int[] iArr, boolean z10) throws a {
        int length = iArr.length;
        boolean z11 = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            if (i14 > i10) {
                i12 = i13;
                i10 = i14;
            }
            if (i14 > i11) {
                i11 = i14;
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 - i12;
            int i19 = iArr[i17] * i18 * i18;
            if (i19 > i16) {
                i15 = i17;
                i16 = i19;
            }
        }
        if (i12 <= i15) {
            int i20 = i12;
            i12 = i15;
            i15 = i20;
        }
        int i21 = i12 - i15;
        if (i21 <= length / 16) {
            throw a.a();
        }
        int i22 = i12 - 1;
        int i23 = -1;
        int i24 = i22;
        while (i22 > i15) {
            int i25 = i22 - i15;
            int i26 = i25 * i25 * (i12 - i22) * (i11 - iArr[i22]);
            if (i26 > i23) {
                i24 = i22;
                i23 = i26;
            }
            i22--;
        }
        if (z10) {
            if (i24 < 10 && i23 < 100000 && i21 < 10) {
                z11 = true;
            }
            r3.f62294t = z11;
        }
        return i24 << 3;
    }

    private void a(int i10) {
        if (this.f62251b.length < i10) {
            this.f62251b = new byte[i10];
        }
        for (int i11 = 0; i11 < 32; i11++) {
            this.f62252c[i11] = 0;
        }
    }

    @Override // com.huawei.hms.scankit.p.o
    public o a(p4 p4Var) {
        return new q3(p4Var);
    }

    @Override // com.huawei.hms.scankit.p.o
    public r a(int i10, r rVar) throws a {
        p4 p4VarC = c();
        int iC = p4VarC.c();
        if (rVar == null || rVar.e() < iC) {
            rVar = new r(iC);
        } else {
            rVar.a();
        }
        a(iC);
        byte[] bArrA = p4VarC.a(i10, this.f62251b);
        int[] iArr = this.f62252c;
        for (int i11 = 0; i11 < iC; i11++) {
            int i12 = (bArrA[i11] & 255) >> 3;
            iArr[i12] = iArr[i12] + 1;
        }
        int iA = a(iArr, false);
        if (iC < 3) {
            for (int i13 = 0; i13 < iC; i13++) {
                if ((bArrA[i13] & 255) < iA) {
                    rVar.g(i13);
                }
            }
        } else {
            int i14 = 1;
            int i15 = bArrA[0] & 255;
            int i16 = bArrA[1] & 255;
            while (i14 < iC - 1) {
                int i17 = i14 + 1;
                int i18 = bArrA[i17] & 255;
                if ((((i16 * 4) - i15) - i18) / 2 < iA) {
                    rVar.g(i14);
                }
                i15 = i16;
                i14 = i17;
                i16 = i18;
            }
        }
        return rVar;
    }

    @Override // com.huawei.hms.scankit.p.o
    public s a() throws a {
        p4 p4VarC = c();
        int iC = p4VarC.c();
        int iA = p4VarC.a();
        a(iC);
        int[] iArr = this.f62252c;
        for (int i10 = 1; i10 < 5; i10++) {
            byte[] bArrA = p4VarC.a((iA * i10) / 5, this.f62251b);
            int i11 = (iC * 4) / 5;
            for (int i12 = iC / 5; i12 < i11; i12++) {
                int i13 = (bArrA[i12] & 255) >> 3;
                iArr[i13] = iArr[i13] + 1;
            }
        }
        int iA2 = a(iArr, true);
        byte[] bArrB = p4VarC.b();
        int i14 = (iC + 31) / 32;
        int[] iArr2 = new int[i14 * iA];
        for (int i15 = 0; i15 < iA; i15++) {
            int i16 = i15 * iC;
            for (int i17 = 0; i17 < iC; i17++) {
                if ((bArrB[i16 + i17] & 255) < iA2) {
                    int i18 = (i15 * i14) + (i17 >> 5);
                    iArr2[i18] = iArr2[i18] | (1 << (i17 & 31));
                }
            }
        }
        return new s(iC, iA, i14, iArr2);
    }
}
