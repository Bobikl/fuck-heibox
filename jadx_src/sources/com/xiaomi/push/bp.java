package com.xiaomi.push;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class bp {
    public static String a(int i10) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(m192a(str));
            return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    public static String a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        if (i10 <= 0 || length < i10) {
            i10 = length / 3;
            if (i10 <= 1) {
                i10 = 1;
            }
            if (i10 > 3) {
                i10 = 3;
            }
        }
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (i12 % i10 == 0) {
                sb2.append(androidx.webkit.b.f28327e);
            } else {
                sb2.append(str.charAt(i11));
            }
            i11 = i12;
        }
        return sb2.toString();
    }

    public static String a(Collection<?> collection, String str) {
        if (collection == null) {
            return null;
        }
        return a(collection.iterator(), str);
    }

    public static String a(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next.toString();
        }
        StringBuffer stringBuffer = new StringBuffer(256);
        if (next != null) {
            stringBuffer.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                stringBuffer.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                stringBuffer.append(next2);
            }
        }
        return stringBuffer.toString();
    }

    public static String a(byte[] bArr) {
        String str;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            str = String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (Exception unused) {
            str = "";
        }
        return str.toLowerCase();
    }

    public static String a(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return a(objArr, str, 0, objArr.length);
    }

    public static String a(Object[] objArr, String str, int i10, int i11) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        Object obj = objArr[i10];
        StringBuffer stringBuffer = new StringBuffer(i12 * ((obj == null ? 16 : obj.toString().length()) + str.length()));
        for (int i13 = i10; i13 < i11; i13++) {
            if (i13 > i10) {
                stringBuffer.append(str);
            }
            Object obj2 = objArr[i13];
            if (obj2 != null) {
                stringBuffer.append(obj2);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m191a(String str) {
        if (str == null) {
            return true;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 0 || cCharAt > 127) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static byte[] m192a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(m192a(str));
            return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    public static String b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }
}
