package com.tencent.qcloud.core.auth;

import com.tencent.qcloud.core.util.QCloudStringUtils;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class Utils {
    private static final char[] DIGITS_LOWER;
    private static final char[] DIGITS_UPPER;
    private static Calendar calendar;

    static {
        Calendar calendar2 = Calendar.getInstance();
        calendar = calendar2;
        calendar2.set(2010, 0, 1);
        DIGITS_LOWER = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        DIGITS_UPPER = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static byte[] decodeHex(String str) {
        return decodeHex(str.toCharArray());
    }

    public static byte[] decodeHex(char[] cArr) {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int digit = toDigit(cArr[i10], i10) << 4;
            int i12 = i10 + 1;
            int digit2 = digit | toDigit(cArr[i12], i12);
            i10 = i12 + 1;
            bArr[i11] = (byte) (digit2 & 255);
            i11++;
        }
        return bArr;
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static char[] encodeHex(byte[] bArr, boolean z10) {
        return encodeHex(bArr, z10 ? DIGITS_LOWER : DIGITS_UPPER);
    }

    static char[] encodeHex(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 & 240) >>> 4];
            i10 = i11 + 1;
            cArr2[i11] = cArr[b10 & 15];
        }
        return cArr2;
    }

    public static String encodeHexString(byte[] bArr) {
        return new String(encodeHex(bArr));
    }

    public static String encodeHexString(byte[] bArr, boolean z10) {
        return new String(encodeHex(bArr, z10));
    }

    static long handleTimeAccuracy(long j10) {
        return j10 > calendar.getTime().getTime() ? j10 / 1000 : j10;
    }

    public static byte[] hmacSha1(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(QCloudStringUtils.getBytesUTF8(str2), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            return mac.doFinal(QCloudStringUtils.getBytesUTF8(str));
        } catch (InvalidKeyException e10) {
            e10.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    static long[] parseKeyTimes(String str) {
        String[] strArrSplit = str.split(";");
        return new long[]{Long.parseLong(strArrSplit[0]), Long.parseLong(strArrSplit[1])};
    }

    public static byte[] sha1(String str) {
        try {
            return MessageDigest.getInstance("SHA-1").digest(QCloudStringUtils.getBytesUTF8(str));
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    static int toDigit(char c10, int i10) {
        int iDigit = Character.digit(c10, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new IllegalArgumentException("Illegal hexadecimal character " + c10 + " at index " + i10);
    }
}
