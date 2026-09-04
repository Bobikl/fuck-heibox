package org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class l {
    public static byte[] a(String str) {
        return b(str, "ISO-8859-1");
    }

    public static byte[] b(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e10) {
            throw h(str2, e10);
        }
    }

    public static byte[] c(String str) {
        return b(str, "US-ASCII");
    }

    public static byte[] d(String str) {
        return b(str, "UTF-16");
    }

    public static byte[] e(String str) {
        return b(str, mj.c.f131911d);
    }

    public static byte[] f(String str) {
        return b(str, "UTF-16LE");
    }

    public static byte[] g(String str) {
        return b(str, "UTF-8");
    }

    private static IllegalStateException h(String str, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(str + ": " + unsupportedEncodingException);
    }

    public static String i(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e10) {
            throw h(str, e10);
        }
    }

    public static String j(byte[] bArr) {
        return i(bArr, "ISO-8859-1");
    }

    public static String k(byte[] bArr) {
        return i(bArr, "US-ASCII");
    }

    public static String l(byte[] bArr) {
        return i(bArr, "UTF-16");
    }

    public static String m(byte[] bArr) {
        return i(bArr, mj.c.f131911d);
    }

    public static String n(byte[] bArr) {
        return i(bArr, "UTF-16LE");
    }

    public static String o(byte[] bArr) {
        return i(bArr, "UTF-8");
    }
}
