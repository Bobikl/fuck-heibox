package com.tencent.qcloud.core.util;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public class QCloudStringUtils {
    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || !(charSequence == null || charSequence2 == null || (!((charSequence instanceof String) && (charSequence2 instanceof String)) ? regionMatches(charSequence, false, 0, charSequence2, 0, Math.max(charSequence.length(), charSequence2.length())) : charSequence.equals(charSequence2)));
    }

    public static byte[] getBytesUTF8(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String newStringUTF8(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    static boolean regionMatches(CharSequence charSequence, boolean z10, int i10, CharSequence charSequence2, int i11, int i12) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z10, i10, (String) charSequence2, i11, i12);
        }
        while (true) {
            int i13 = i12 - 1;
            if (i12 <= 0) {
                return true;
            }
            int i14 = i10 + 1;
            char cCharAt = charSequence.charAt(i10);
            int i15 = i11 + 1;
            char cCharAt2 = charSequence2.charAt(i11);
            if (cCharAt != cCharAt2) {
                if (!z10) {
                    return false;
                }
                if (Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                    return false;
                }
            }
            i10 = i14;
            i12 = i13;
            i11 = i15;
        }
    }
}
