package com.igexin.push.extension.distribution.basic.g;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
public class h {
    public static String a(String str) {
        MessageDigest messageDigest;
        byte[] bytes = str.getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        messageDigest.update(bytes);
        byte[] bArrDigest = messageDigest.digest();
        char[] cArr2 = new char[32];
        int i10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            byte b10 = bArrDigest[i11];
            int i12 = i10 + 1;
            cArr2[i10] = cArr[(b10 >>> 4) & 15];
            i10 = i12 + 1;
            cArr2[i12] = cArr[b10 & 15];
        }
        return new String(cArr2);
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArrA;
        if (bArr == null || (bArrA = com.igexin.a.a.b.e.a(bArr)) == null) {
            return null;
        }
        String strA = a(String.valueOf(System.currentTimeMillis()));
        int length = bArrA.length;
        byte[] bArr2 = new byte[length + 16];
        byte[] bytes = strA.substring(0, 8).getBytes();
        byte[] bytes2 = strA.substring(24, 32).getBytes();
        System.arraycopy(bytes, 0, bArr2, 0, 8);
        System.arraycopy(bArrA, 0, bArr2, 8, length);
        System.arraycopy(bytes2, 0, bArr2, length + 8, 8);
        return bArr2;
    }

    public static byte[] b(byte[] bArr) {
        if (bArr == null || bArr.length < 16) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length - 16];
        System.arraycopy(bArr, 8, bArr2, 0, bArr.length - 16);
        return com.igexin.a.a.b.e.b(bArr2);
    }
}
