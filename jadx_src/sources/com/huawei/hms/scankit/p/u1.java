package com.huawei.hms.scankit.p;

import java.util.Map;

/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p6 f62386a = new p6(o3.f62194l);

    private w1 a(t tVar, Map<l1, ?> map) throws Exception {
        a8 a8VarD = tVar.d();
        c3 c3VarA = tVar.c().a();
        c1[] c1VarArrA = c1.a(tVar.b(), a8VarD, c3VarA);
        int iB = 0;
        for (c1 c1Var : c1VarArrA) {
            iB += c1Var.b();
        }
        byte[] bArr = new byte[iB];
        int i10 = 0;
        for (c1 c1Var2 : c1VarArrA) {
            byte[] bArrA = c1Var2.a();
            int iB2 = c1Var2.b();
            a(bArrA, iB2);
            int i11 = 0;
            while (i11 < iB2) {
                bArr[i10] = bArrA[i11];
                i11++;
                i10++;
            }
        }
        return p1.a(bArr, a8VarD, c3VarA, map);
    }

    private void a(byte[] bArr, int i10) throws Exception {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f62386a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (a unused) {
            throw a.a();
        }
    }

    public w1 a(s sVar, Map<l1, ?> map) throws Exception {
        t tVar = new t(sVar);
        try {
            try {
                return a(tVar, map);
            } catch (a unused) {
                throw a.a();
            }
        } catch (a unused2) {
            tVar.e();
            tVar.a(true);
            tVar.d();
            tVar.c();
            tVar.a();
            w1 w1VarA = a(tVar, map);
            w1VarA.a(new l6(true));
            return w1VarA;
        }
    }
}
