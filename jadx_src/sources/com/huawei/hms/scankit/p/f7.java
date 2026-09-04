package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: TelPhoneNumberResultParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f7 extends t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f61810b = Pattern.compile("tel:([\\s\\S]+)", 2);

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String strA = t6.a(s6Var);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        Matcher matcher = f61810b.matcher(strA);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        return new HmsScan(s6Var.k(), t6.a(s6Var.c()), strGroup, HmsScan.TEL_PHONE_NUMBER_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(new HmsScan.TelPhoneNumber(HmsScan.TelPhoneNumber.OTHER_USE_TYPE, strGroup)));
    }
}
