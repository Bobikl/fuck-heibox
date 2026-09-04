package com.umeng.ut.a.c;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f106425a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static String a(String str, String str2) {
        try {
            byte[] bArrA = a(str.getBytes(), str2.getBytes());
            return bArrA != null ? toHexString(bArrA) : "0000000000000000";
        } catch (Exception e10) {
            e.m56a("", e10);
            return "0000000000000000";
        }
    }

    private static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e10) {
            e.a("", e10, new Object[0]);
            return null;
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        for (int i10 = 0; i10 < 64; i10++) {
            bArr3[i10] = org.apache.tools.tar.c.L;
            bArr4[i10] = 92;
        }
        byte[] bArr5 = new byte[64];
        if (bArr.length > 64) {
            bArr = a(bArr);
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr5[i11] = bArr[i11];
        }
        if (bArr.length < 64) {
            for (int length = bArr.length; length < 64; length++) {
                bArr5[length] = 0;
            }
        }
        byte[] bArr6 = new byte[64];
        for (int i12 = 0; i12 < 64; i12++) {
            bArr6[i12] = (byte) (bArr5[i12] ^ bArr3[i12]);
        }
        byte[] bArr7 = new byte[bArr2.length + 64];
        for (int i13 = 0; i13 < 64; i13++) {
            bArr7[i13] = bArr6[i13];
        }
        for (int i14 = 0; i14 < bArr2.length; i14++) {
            bArr7[i14 + 64] = bArr2[i14];
        }
        byte[] bArrA = a(bArr7);
        byte[] bArr8 = new byte[64];
        for (int i15 = 0; i15 < 64; i15++) {
            bArr8[i15] = (byte) (bArr5[i15] ^ bArr4[i15]);
        }
        byte[] bArr9 = new byte[bArrA.length + 64];
        for (int i16 = 0; i16 < 64; i16++) {
            bArr9[i16] = bArr8[i16];
        }
        for (int i17 = 0; i17 < bArrA.length; i17++) {
            bArr9[i17 + 64] = bArrA[i17];
        }
        return a(bArr9);
    }

    private static String c() {
        byte[] bytes = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn".getBytes();
        for (byte b10 = 0; b10 < 32; b10 = (byte) (b10 + 1)) {
            try {
                bytes[b10] = (byte) (bytes[b10] + b10);
            } catch (Exception unused) {
                return null;
            }
        }
        return toHexString(bytes);
    }

    public static String c(String str) {
        return a(c(), str);
    }

    private static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            char[] cArr = f106425a;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }
}
