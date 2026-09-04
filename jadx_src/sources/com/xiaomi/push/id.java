package com.xiaomi.push;

import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class id {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final char[] f569a = "&quot;".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f107357b = "&apos;".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f107358c = "&amp;".toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f107359d = "&lt;".toCharArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f107360e = "&gt;".toCharArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Random f107356a = new Random();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f107361f = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static String a(int i10) {
        if (i10 < 1) {
            return null;
        }
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            cArr[i11] = f107361f[f107356a.nextInt(71)];
        }
        return new String(cArr);
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        StringBuilder sb2 = new StringBuilder((int) (((double) length) * 1.3d));
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char c10 = charArray[i10];
            if (c10 <= '>') {
                if (c10 == '<') {
                    if (i10 > i11) {
                        sb2.append(charArray, i11, i10 - i11);
                    }
                    i11 = i10 + 1;
                    sb2.append(f107359d);
                } else if (c10 == '>') {
                    if (i10 > i11) {
                        sb2.append(charArray, i11, i10 - i11);
                    }
                    i11 = i10 + 1;
                    sb2.append(f107360e);
                } else if (c10 == '&') {
                    if (i10 > i11) {
                        sb2.append(charArray, i11, i10 - i11);
                    }
                    int i12 = i10 + 5;
                    if (length <= i12 || charArray[i10 + 1] != '#' || !Character.isDigit(charArray[i10 + 2]) || !Character.isDigit(charArray[i10 + 3]) || !Character.isDigit(charArray[i10 + 4]) || charArray[i12] != ';') {
                        i11 = i10 + 1;
                        sb2.append(f107358c);
                    }
                } else if (c10 == '\"') {
                    if (i10 > i11) {
                        sb2.append(charArray, i11, i10 - i11);
                    }
                    i11 = i10 + 1;
                    sb2.append(f569a);
                } else if (c10 == '\'') {
                    if (i10 > i11) {
                        sb2.append(charArray, i11, i10 - i11);
                    }
                    i11 = i10 + 1;
                    sb2.append(f107357b);
                }
            }
            i10++;
        }
        if (i11 == 0) {
            return str;
        }
        if (i10 > i11) {
            sb2.append(charArray, i11, i10 - i11);
        }
        return sb2.toString();
    }

    public static final String a(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(str2, 0);
        if (iIndexOf < 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char[] charArray2 = str3.toCharArray();
        int length = str2.length();
        StringBuilder sb2 = new StringBuilder(charArray.length);
        sb2.append(charArray, 0, iIndexOf);
        sb2.append(charArray2);
        int i10 = iIndexOf + length;
        while (true) {
            int iIndexOf2 = str.indexOf(str2, i10);
            if (iIndexOf2 <= 0) {
                sb2.append(charArray, i10, charArray.length - i10);
                return sb2.toString();
            }
            sb2.append(charArray, i10, iIndexOf2 - i10);
            sb2.append(charArray2);
            i10 = iIndexOf2 + length;
        }
    }

    public static String a(byte[] bArr) {
        return String.valueOf(bm.a(bArr));
    }

    public static final String b(String str) {
        return a(a(a(a(a(str, "&lt;", "<"), "&gt;", ">"), "&quot;", "\""), "&apos;", "'"), "&amp;", "&");
    }
}
