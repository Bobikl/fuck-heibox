package com.google.common.base;

/* JADX INFO: compiled from: Ascii.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public final class a {
    public static final byte A = 23;
    public static final byte B = 24;
    public static final byte C = 25;
    public static final byte D = 26;
    public static final byte E = 27;
    public static final byte F = 28;
    public static final byte G = 29;
    public static final byte H = 30;
    public static final byte I = 31;
    public static final byte J = 32;
    public static final byte K = 32;
    public static final byte L = 127;
    public static final char M = 0;
    public static final char N = 127;
    private static final char O = ' ';

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f56648a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte f56649b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte f56650c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte f56651d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte f56652e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte f56653f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte f56654g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte f56655h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte f56656i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte f56657j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte f56658k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte f56659l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte f56660m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte f56661n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte f56662o = 13;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte f56663p = 14;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte f56664q = 15;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte f56665r = 16;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte f56666s = 17;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte f56667t = 17;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte f56668u = 18;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte f56669v = 19;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte f56670w = 19;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte f56671x = 20;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte f56672y = 21;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte f56673z = 22;

    private a() {
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int iB;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            char cCharAt2 = charSequence2.charAt(i10);
            if (cCharAt != cCharAt2 && ((iB = b(cCharAt)) >= 26 || iB != b(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int b(char c10) {
        return (char) ((c10 | O) - 97);
    }

    public static boolean c(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static boolean d(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static char e(char c10) {
        return d(c10) ? (char) (c10 ^ O) : c10;
    }

    public static String f(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return g((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = e(charSequence.charAt(i10));
        }
        return String.valueOf(cArr);
    }

    public static String g(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (d(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (d(c10)) {
                        charArray[i10] = (char) (c10 ^ O);
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static char h(char c10) {
        return c(c10) ? (char) (c10 ^ O) : c10;
    }

    public static String i(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return j((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = h(charSequence.charAt(i10));
        }
        return String.valueOf(cArr);
    }

    public static String j(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (c(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c(c10)) {
                        charArray[i10] = (char) (c10 ^ O);
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String k(CharSequence charSequence, int i10, String str) {
        String string;
        w.E(charSequence);
        int length = i10 - str.length();
        w.m(length >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", i10, str.length());
        int length2 = charSequence.length();
        CharSequence charSequence2 = charSequence;
        if (length2 <= i10) {
            string = charSequence.toString();
            if (string.length() <= i10) {
                charSequence2 = string;
                return string;
            }
        }
        charSequence2 = string;
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(charSequence2, 0, length);
        sb2.append(str);
        return sb2.toString();
    }
}
