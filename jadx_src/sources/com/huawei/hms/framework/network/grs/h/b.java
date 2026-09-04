package com.huawei.hms.framework.network.grs.h;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f60857a = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f60858b = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    public static String a(String str) {
        return a(str, "SHA-256");
    }

    private static String a(String str, String str2) {
        String str3;
        String str4;
        try {
            try {
                return a(MessageDigest.getInstance(str2).digest(str.getBytes("UTF-8")));
            } catch (NoSuchAlgorithmException unused) {
                str3 = f60857a;
                str4 = "encrypt NoSuchAlgorithmException";
                Logger.w(str3, str4);
                return null;
            }
        } catch (UnsupportedEncodingException unused2) {
            str3 = f60857a;
            str4 = "encrypt UnsupportedEncodingException";
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append("0");
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i10 = 1;
        if (str.length() == 1) {
            return androidx.webkit.b.f28327e;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < str.length(); i11++) {
            String str2 = str.charAt(i11) + "";
            if (f60858b.matcher(str2).matches()) {
                if (i10 % 2 == 0) {
                    str2 = androidx.webkit.b.f28327e;
                }
                i10++;
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }
}
