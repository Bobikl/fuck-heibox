package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: ProductResultParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g6 extends t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f61857b = Pattern.compile("\\d+");

    protected static boolean a(CharSequence charSequence, int i10) {
        return charSequence != null && i10 > 0 && i10 == charSequence.length() && f61857b.matcher(charSequence).matches();
    }

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        int iA = t6.a(s6Var.c());
        if (iA != HmsScanBase.EAN13_SCAN_TYPE && iA != HmsScanBase.EAN8_SCAN_TYPE && iA != HmsScanBase.UPCCODE_A_SCAN_TYPE && iA != HmsScanBase.UPCCODE_E_SCAN_TYPE) {
            return null;
        }
        String strA = t6.a(s6Var);
        if (a(strA, strA.length())) {
            return new HmsScan(strA, t6.a(s6Var.c()), strA, HmsScan.ARTICLE_NUMBER_FORM, s6Var.i(), t6.a(s6Var.j()), null, null);
        }
        return null;
    }
}
