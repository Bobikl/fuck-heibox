package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: DataBlock.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f61662b;

    private d1(int i10, byte[] bArr) {
        this.f61661a = i10;
        this.f61662b = bArr;
    }

    static d1[] a(byte[] bArr, b8 b8Var, b3 b3Var) throws Exception {
        if (bArr.length != b8Var.e()) {
            try {
                throw new IllegalArgumentException();
            } catch (Exception e10) {
                throw e10;
            }
        }
        b8.b bVarA = b8Var.a(b3Var);
        b8.a[] aVarArrA = bVarA.a();
        int iA = 0;
        for (b8.a aVar : aVarArrA) {
            iA += aVar.a();
        }
        d1[] d1VarArr = new d1[iA];
        int i10 = 0;
        for (b8.a aVar2 : aVarArrA) {
            int i11 = 0;
            while (i11 < aVar2.a()) {
                int iB = aVar2.b();
                d1VarArr[i10] = new d1(iB, new byte[bVarA.b() + iB]);
                i11++;
                i10++;
            }
        }
        int length = d1VarArr[0].f61662b.length;
        int i12 = iA - 1;
        while (i12 >= 0 && d1VarArr[i12].f61662b.length != length) {
            i12--;
        }
        return a(d1VarArr, bArr, length, bVarA, i10, i12 + 1);
    }

    private static d1[] a(d1[] d1VarArr, byte[] bArr, int i10, b8.b bVar, int i11, int i12) {
        int iB = i10 - bVar.b();
        int i13 = 0;
        for (int i14 = 0; i14 < iB; i14++) {
            int i15 = 0;
            while (i15 < i11) {
                d1VarArr[i15].f61662b[i14] = bArr[i13];
                i15++;
                i13++;
            }
        }
        int i16 = i12;
        while (i16 < i11) {
            d1VarArr[i16].f61662b[iB] = bArr[i13];
            i16++;
            i13++;
        }
        int length = d1VarArr[0].f61662b.length;
        while (iB < length) {
            int i17 = 0;
            while (true) {
                if (i17 < i11) {
                    int i18 = i17 < i12 ? iB : iB + 1;
                    if (i17 >= 0) {
                        try {
                            if (i17 < d1VarArr.length && w7.a(d1VarArr[i17].f61662b, i18) && w7.a(bArr, i13)) {
                                d1VarArr[i17].f61662b[i18] = bArr[i13];
                                i17++;
                                i13++;
                            }
                        } catch (ArrayIndexOutOfBoundsException e10) {
                            throw e10;
                        }
                    }
                    throw new ArrayIndexOutOfBoundsException();
                } else {
                    iB++;
                }
            }
        }
        return d1VarArr;
    }

    byte[] a() {
        return this.f61662b;
    }

    int b() {
        return this.f61661a;
    }
}
