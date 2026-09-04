package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: RefinedSoundex.java */
/* JADX INFO: loaded from: classes5.dex */
public class h implements mj.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f133000b = "01360240043788015936020505";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f133001c = f133000b.toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f133002d = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[] f133003a;

    public h() {
        this.f133003a = f133001c;
    }

    public h(String str) {
        this.f133003a = str.toCharArray();
    }

    public h(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        this.f133003a = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // mj.g
    public String a(String str) {
        return d(str);
    }

    public int b(String str, String str2) throws EncoderException {
        return j.b(this, str, str2);
    }

    char c(char c10) {
        if (Character.isLetter(c10)) {
            return this.f133003a[Character.toUpperCase(c10) - 'A'];
        }
        return (char) 0;
    }

    public String d(String str) {
        if (str == null) {
            return null;
        }
        String strA = j.a(str);
        if (strA.length() == 0) {
            return strA;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strA.charAt(0));
        char c10 = '*';
        for (int i10 = 0; i10 < strA.length(); i10++) {
            char c11 = c(strA.charAt(i10));
            if (c11 != c10) {
                if (c11 != 0) {
                    stringBuffer.append(c11);
                }
                c10 = c11;
            }
        }
        return stringBuffer.toString();
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return d((String) obj);
        }
        throw new EncoderException("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
    }
}
