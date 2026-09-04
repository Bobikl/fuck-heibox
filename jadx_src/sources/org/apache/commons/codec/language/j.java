package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: SoundexUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j {
    j() {
    }

    static String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (Character.isLetter(str.charAt(i11))) {
                cArr[i10] = str.charAt(i11);
                i10++;
            }
        }
        return i10 == length ? str.toUpperCase(Locale.ENGLISH) : new String(cArr, 0, i10).toUpperCase(Locale.ENGLISH);
    }

    static int b(mj.g gVar, String str, String str2) throws EncoderException {
        return c(gVar.a(str), gVar.a(str2));
    }

    static int c(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        int iMin = Math.min(str.length(), str2.length());
        int i10 = 0;
        for (int i11 = 0; i11 < iMin; i11++) {
            if (str.charAt(i11) == str2.charAt(i11)) {
                i10++;
            }
        }
        return i10;
    }
}
