package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: DataBlock.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f61610b;

    private c1(int i10, byte[] bArr) {
        this.f61609a = i10;
        this.f61610b = bArr;
    }

    static c1[] a(byte[] bArr, a8 a8Var, c3 c3Var) {
        if (bArr.length != a8Var.l()) {
            throw new IllegalArgumentException();
        }
        a8.b bVarA = a8Var.a(c3Var);
        a8.a[] aVarArrA = bVarA.a();
        int iA = 0;
        for (a8.a aVar : aVarArrA) {
            iA += aVar.a();
        }
        c1[] c1VarArr = new c1[iA];
        int i10 = 0;
        for (a8.a aVar2 : aVarArrA) {
            int i11 = 0;
            while (i11 < aVar2.a()) {
                int iB = aVar2.b();
                c1VarArr[i10] = new c1(iB, new byte[bVarA.b() + iB]);
                i11++;
                i10++;
            }
        }
        int length = c1VarArr[0].f61610b.length;
        int i12 = iA - 1;
        while (i12 >= 0 && c1VarArr[i12].f61610b.length != length) {
            i12--;
        }
        int i13 = i12 + 1;
        int iB2 = length - bVarA.b();
        int i14 = 0;
        for (int i15 = 0; i15 < iB2; i15++) {
            int i16 = 0;
            while (i16 < i10) {
                c1VarArr[i16].f61610b[i15] = bArr[i14];
                i16++;
                i14++;
            }
        }
        int i17 = i13;
        while (i17 < i10) {
            c1VarArr[i17].f61610b[iB2] = bArr[i14];
            i17++;
            i14++;
        }
        int length2 = c1VarArr[0].f61610b.length;
        while (iB2 < length2) {
            int i18 = 0;
            while (i18 < i10) {
                c1VarArr[i18].f61610b[i18 < i13 ? iB2 : iB2 + 1] = bArr[i14];
                i18++;
                i14++;
            }
            iB2++;
        }
        return c1VarArr;
    }

    byte[] a() {
        return this.f61610b;
    }

    int b() {
        return this.f61609a;
    }
}
