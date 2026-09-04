package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;

/* JADX INFO: compiled from: ISBNResultParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i4 extends t6 {
    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        if (t6.a(s6Var.c()) != HmsScanBase.EAN13_SCAN_TYPE) {
            return null;
        }
        String strA = t6.a(s6Var);
        if (strA.length() != 13) {
            return null;
        }
        if (strA.startsWith("978") || strA.startsWith("979")) {
            return new HmsScan(s6Var.k(), t6.a(s6Var.c()), strA, HmsScan.ISBN_NUMBER_FORM, s6Var.i(), t6.a(s6Var.j()), null, null);
        }
        return null;
    }
}
