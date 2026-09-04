package anet.channel.util;

import java.security.MessageDigest;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class StringUtils {
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String buildKey(String str, String str2) {
        return concatString(str, HttpConstant.SCHEME_SPLIT, str2);
    }

    public static String bytesToHexString(byte[] bArr) {
        return bArr == null ? "" : bytesToHexString(bArr, DIGITS_LOWER);
    }

    private static String bytesToHexString(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 & 240) >>> 4];
            i10 = i11 + 1;
            cArr2[i11] = cArr[b10 & 15];
        }
        return new String(cArr2);
    }

    public static String concatString(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String concatString(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + str3.length());
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static boolean isBlank(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i10 = 0; i10 < length; i10++) {
                if (!Character.isWhitespace(str.charAt(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static boolean isStringEqual(String str, String str2) {
        return (str == null && str2 == null) || (str != null && str.equals(str2));
    }

    public static String md5ToHex(String str) {
        if (str == null) {
            return null;
        }
        try {
            return bytesToHexString(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String simplifyString(String str, int i10) {
        return str.length() <= i10 ? str : concatString(str.substring(0, i10), "......");
    }

    public static String stringNull2Empty(String str) {
        return str == null ? "" : str;
    }
}
