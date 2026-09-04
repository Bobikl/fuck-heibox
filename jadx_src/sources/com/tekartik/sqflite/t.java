package com.tekartik.sqflite;

import androidx.annotation.w0;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class t {
    @w0(api = 21)
    static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    static Locale b(String str) {
        String str2;
        String str3;
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        String str4 = "";
        if (strArrSplit.length > 0) {
            String str5 = strArrSplit[0];
            if (strArrSplit.length > 1) {
                str3 = strArrSplit[1];
                str2 = strArrSplit.length > 2 ? strArrSplit[strArrSplit.length - 1] : "";
            } else {
                str2 = "";
                str3 = str2;
            }
            str4 = str5;
        } else {
            str2 = "";
            str3 = str2;
        }
        return new Locale(str4, str3, str2);
    }

    static Locale c(String str) {
        return a(str);
    }
}
