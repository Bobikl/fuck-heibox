package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: compiled from: AztecReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h implements o6 {
    @Override // com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map<l1, ?> map) throws Exception {
        u6[] u6VarArrD;
        v6 v6Var;
        c2 c2Var = new c2(pVar.b());
        w1 w1VarA = null;
        try {
            g gVarA = c2Var.a(false);
            u6VarArrD = gVarA.d();
            try {
                w1 w1VarA2 = new s1().a(gVarA, map);
                e = null;
                w1VarA = w1VarA2;
            } catch (a e10) {
                e = e10;
            }
        } catch (a e11) {
            e = e11;
            u6VarArrD = null;
        }
        if (w1VarA == null) {
            try {
                g gVarA2 = c2Var.a(true);
                u6VarArrD = gVarA2.d();
                w1VarA = new s1().a(gVarA2, map);
            } catch (a e12) {
                if (u6VarArrD != null && !r3.f62277c) {
                    return new s6(null, null, 0, (u6[]) u6VarArrD.clone(), BarcodeFormat.AZTEC, System.currentTimeMillis());
                }
                if (e != null) {
                    throw e;
                }
                throw e12;
            }
        }
        u6[] u6VarArr = u6VarArrD;
        if (map != null && (v6Var = (v6) map.get(l1.NEED_RESULT_POINT_CALLBACK)) != null && u6VarArr != null) {
            for (u6 u6Var : u6VarArr) {
                v6Var.a(u6Var);
            }
        }
        return new s6(w1VarA.d(), w1VarA.c(), w1VarA.a(), u6VarArr, BarcodeFormat.AZTEC, System.currentTimeMillis());
    }
}
