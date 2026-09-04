package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: DataBlock.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f61749b;

    private e1(int i10, byte[] bArr) {
        this.f61748a = i10;
        this.f61749b = bArr;
    }

    static e1[] a(byte[] bArr, z7 z7Var) {
        z7.c cVarD = z7Var.d();
        z7.b[] bVarArrA = cVarD.a();
        int iA = 0;
        for (z7.b bVar : bVarArrA) {
            iA += bVar.a();
        }
        e1[] e1VarArr = new e1[iA];
        int i10 = 0;
        for (z7.b bVar2 : bVarArrA) {
            int i11 = 0;
            while (i11 < bVar2.a()) {
                int iB = bVar2.b();
                e1VarArr[i10] = new e1(iB, new byte[cVarD.b() + iB]);
                i11++;
                i10++;
            }
        }
        int length = e1VarArr[0].f61749b.length - cVarD.b();
        int i12 = length - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = 0;
            while (i15 < i10) {
                e1VarArr[i15].f61749b[i14] = bArr[i13];
                i15++;
                i13++;
            }
        }
        boolean z10 = z7Var.h() == 24;
        int i16 = z10 ? 8 : i10;
        int i17 = 0;
        while (i17 < i16) {
            e1VarArr[i17].f61749b[i12] = bArr[i13];
            i17++;
            i13++;
        }
        int length2 = e1VarArr[0].f61749b.length;
        while (length < length2) {
            int i18 = 0;
            while (i18 < i10) {
                int i19 = z10 ? (i18 + 8) % i10 : i18;
                e1VarArr[i19].f61749b[(!z10 || i19 <= 7) ? length : length - 1] = bArr[i13];
                i18++;
                i13++;
            }
            length++;
        }
        if (i13 == bArr.length) {
            return e1VarArr;
        }
        throw new IllegalArgumentException();
    }

    byte[] a() {
        return this.f61749b;
    }

    int b() {
        return this.f61748a;
    }
}
