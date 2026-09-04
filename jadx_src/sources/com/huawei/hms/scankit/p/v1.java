package com.huawei.hms.scankit.p;

import java.util.Map;

/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p6 f62435a = new p6(o3.f62194l);

    private w1 a(u uVar, Map<l1, ?> map) throws Exception {
        b8 b8VarD = uVar.d();
        b3 b3VarB = uVar.c().b();
        d1[] d1VarArrA = d1.a(uVar.b(), b8VarD, b3VarB);
        int iB = 0;
        for (d1 d1Var : d1VarArrA) {
            iB += d1Var.b();
        }
        byte[] bArr = new byte[iB];
        int i10 = 0;
        for (d1 d1Var2 : d1VarArrA) {
            byte[] bArrA = d1Var2.a();
            int iB2 = d1Var2.b();
            a(bArrA, iB2);
            int i11 = 0;
            while (i11 < iB2) {
                bArr[i10] = bArrA[i11];
                i11++;
                i10++;
            }
        }
        return r1.a(bArr, b8VarD, b3VarB, map);
    }

    private void a(byte[] bArr, int i10) throws Exception {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f62435a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (a unused) {
            throw a.a();
        }
    }

    public w1 a(s sVar, Map<l1, ?> map) throws Exception {
        u uVar = new u(sVar);
        try {
            return a(uVar, map);
        } catch (a e10) {
            try {
                uVar.e();
                uVar.a(true);
                uVar.d();
                uVar.c();
                uVar.a();
                w1 w1VarA = a(uVar, map);
                w1VarA.a(new i6(true));
                return w1VarA;
            } catch (a unused) {
                throw e10;
            }
        }
    }
}
