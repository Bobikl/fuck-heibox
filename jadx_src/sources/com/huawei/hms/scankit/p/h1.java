package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: compiled from: DataMatrixReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h1 implements o6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u6[] f61876b = new u6[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t1 f61877a = new t1();

    @Override // com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map<l1, ?> map) throws Exception {
        j2 j2VarA = new d2(pVar.b()).a();
        try {
            w1 w1VarA = this.f61877a.a(j2VarA.a(), map);
            return new s6(w1VarA.d(), w1VarA.c(), j2VarA.d(), BarcodeFormat.DATA_MATRIX);
        } catch (a e10) {
            if (j2VarA.d() == null || r3.f62277c) {
                throw e10;
            }
            double dSqrt = Math.sqrt(Math.pow(j2VarA.d()[0].b() - j2VarA.d()[1].b(), 2.0d) + Math.pow(j2VarA.d()[0].c() - j2VarA.d()[1].c(), 2.0d));
            double dSqrt2 = Math.sqrt(Math.pow(j2VarA.d()[0].b() - j2VarA.d()[3].b(), 2.0d) + Math.pow(j2VarA.d()[0].c() - j2VarA.d()[3].c(), 2.0d));
            if (this.f61877a.a() == null || Math.abs(dSqrt - dSqrt2) / dSqrt >= 0.1d) {
                throw e10;
            }
            return new s6(null, null, j2VarA.d(), BarcodeFormat.DATA_MATRIX);
        }
    }
}
