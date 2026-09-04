package com.tencent.beacon.base.util;

import android.text.TextUtils;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: StringUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public class f {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Charset.forName("ISO-8859-1").newEncoder().canEncode(str);
        } catch (Exception e10) {
            c.a(e10);
            return false;
        }
    }
}
