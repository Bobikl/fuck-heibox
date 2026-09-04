package com.xiaomi.push;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class bo {
    private static String a(byte b10) {
        int i10 = (b10 & 127) + (b10 < 0 ? 128 : 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10 < 16 ? "0" : "");
        sb2.append(Integer.toHexString(i10).toLowerCase());
        return sb2.toString();
    }

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            StringBuffer stringBuffer = new StringBuffer();
            messageDigest.update(str.getBytes(), 0, str.length());
            for (byte b10 : messageDigest.digest()) {
                stringBuffer.append(a(b10));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static byte[] m190a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        return a(str).subSequence(8, 24).toString();
    }
}
