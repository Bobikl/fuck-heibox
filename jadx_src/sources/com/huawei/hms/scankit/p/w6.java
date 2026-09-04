package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SMSTOMMSTOResultParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class w6 extends t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f62536b = Pattern.compile("(?:mmsto|smsto):([\\s\\S]+)", 2);

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String strSubstring;
        String strSubstring2;
        String str;
        String strA = t6.a(s6Var);
        if (TextUtils.isEmpty(strA) || !f62536b.matcher(strA).matches()) {
            return null;
        }
        String strSubstring3 = strA.substring(6);
        int iIndexOf = strSubstring3.indexOf(58);
        if (iIndexOf >= 0) {
            strSubstring = strSubstring3.substring(0, iIndexOf);
            strSubstring2 = strSubstring3.substring(iIndexOf + 1);
        } else {
            strSubstring = strSubstring3;
            strSubstring2 = "";
        }
        if (strSubstring2.isEmpty()) {
            str = strSubstring;
        } else {
            str = strSubstring + "\n" + strSubstring2;
        }
        return new HmsScan(s6Var.k(), t6.a(s6Var.c()), str, HmsScan.SMS_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(new HmsScan.SmsContent(strSubstring2, strSubstring)));
    }
}
