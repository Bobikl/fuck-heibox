package com.huawei.hms.scankit.p;

import java.util.Map;

/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z7 f62369b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p6 f62368a = new p6(o3.f62195m);

    private void a(byte[] bArr, int i10) throws Exception {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f62368a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (a unused) {
            throw a.a();
        }
    }

    public w1 a(s sVar, Map<l1, ?> map) throws Exception {
        v vVar = new v(sVar);
        z7 z7VarA = vVar.a();
        this.f62369b = z7VarA;
        e1[] e1VarArrA = e1.a(vVar.b(), z7VarA);
        int iB = 0;
        for (e1 e1Var : e1VarArrA) {
            iB += e1Var.b();
        }
        byte[] bArr = new byte[iB];
        int length = e1VarArrA.length;
        for (int i10 = 0; i10 < length; i10++) {
            e1 e1Var2 = e1VarArrA[i10];
            byte[] bArrA = e1Var2.a();
            int iB2 = e1Var2.b();
            a(bArrA, iB2);
            for (int i11 = 0; i11 < iB2; i11++) {
                bArr[(i11 * length) + i10] = bArrA[i11];
            }
        }
        return o1.a(bArr, map);
    }

    public z7 a() {
        return this.f62369b;
    }
}
