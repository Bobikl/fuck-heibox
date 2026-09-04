package com.huawei.agconnect.config.impl;

/* JADX INFO: loaded from: classes7.dex */
public class Hex {
    private static final char[] HEX_CODE = "0123456789ABCDEF".toCharArray();

    private static byte[] decodeHex(char[] cArr) {
        if ((cArr.length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[cArr.length >> 1];
        int i10 = 0;
        int i11 = 0;
        while (i10 < cArr.length) {
            int iDigit = Character.digit(cArr[i10], 16);
            if (iDigit == -1) {
                throw new IllegalArgumentException("Illegal hexadecimal character at index " + i10);
            }
            int i12 = i10 + 1;
            int iDigit2 = Character.digit(cArr[i12], 16);
            if (iDigit2 == -1) {
                throw new IllegalArgumentException("Illegal hexadecimal character at index " + i12);
            }
            i10 = i12 + 1;
            bArr[i11] = (byte) (((iDigit << 4) | iDigit2) & 255);
            i11++;
        }
        return bArr;
    }

    public static byte[] decodeHexString(String str) {
        return decodeHex(str.toCharArray());
    }

    public static String encodeHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            char[] cArr = HEX_CODE;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
