package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: Soundex.java */
/* JADX INFO: loaded from: classes5.dex */
public class i implements mj.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f133004c = "01230120022455012623010202";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f133005d = f133004c.toCharArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f133006e = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f133007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f133008b;

    public i() {
        this.f133007a = 4;
        this.f133008b = f133005d;
    }

    public i(String str) {
        this.f133007a = 4;
        this.f133008b = str.toCharArray();
    }

    public i(char[] cArr) {
        this.f133007a = 4;
        char[] cArr2 = new char[cArr.length];
        this.f133008b = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    private char c(String str, int i10) {
        char cCharAt;
        char cF = f(str.charAt(i10));
        if (i10 > 1 && cF != '0' && ('H' == (cCharAt = str.charAt(i10 - 1)) || 'W' == cCharAt)) {
            char cCharAt2 = str.charAt(i10 - 2);
            if (f(cCharAt2) == cF || 'H' == cCharAt2 || 'W' == cCharAt2) {
                return (char) 0;
            }
        }
        return cF;
    }

    private char[] e() {
        return this.f133008b;
    }

    private char f(char c10) {
        int i10 = c10 - 'A';
        if (i10 >= 0 && i10 < e().length) {
            return e()[i10];
        }
        throw new IllegalArgumentException("The character is not mapped: " + c10);
    }

    @Override // mj.g
    public String a(String str) {
        return h(str);
    }

    public int b(String str, String str2) throws EncoderException {
        return j.b(this, str, str2);
    }

    public int d() {
        return this.f133007a;
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return h((String) obj);
        }
        throw new EncoderException("Parameter supplied to Soundex encode is not of type java.lang.String");
    }

    public void g(int i10) {
        this.f133007a = i10;
    }

    public String h(String str) {
        if (str == null) {
            return null;
        }
        String strA = j.a(str);
        if (strA.length() == 0) {
            return strA;
        }
        char[] cArr = {'0', '0', '0', '0'};
        cArr[0] = strA.charAt(0);
        char c10 = c(strA, 0);
        int i10 = 1;
        int i11 = 1;
        while (i10 < strA.length() && i11 < 4) {
            int i12 = i10 + 1;
            char c11 = c(strA, i10);
            if (c11 != 0) {
                if (c11 != '0' && c11 != c10) {
                    cArr[i11] = c11;
                    i11++;
                }
                c10 = c11;
            }
            i10 = i12;
        }
        return new String(cArr);
    }
}
