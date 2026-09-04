package com.igexin.a.b;

import android.text.TextUtils;
import com.igexin.a.a.b.e;
import com.meituan.robust.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f63285a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Constants.OBJECT_TYPE, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static String a(int i10) {
        if (i10 < 0) {
            i10 = 100;
        }
        if (i10 > 100) {
            i10 = 10;
        }
        Random random = new Random();
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            char[] cArr2 = f63285a;
            cArr[i11] = cArr2[random.nextInt(cArr2.length)];
        }
        return new String(cArr);
    }

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

    public static boolean a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static byte[] a(byte[] bArr) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    public static String b(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArrC;
        if (bArr == null || (bArrC = e.c(bArr)) == null) {
            return null;
        }
        String strA = a(String.valueOf(System.currentTimeMillis()));
        int length = bArrC.length;
        byte[] bArr2 = new byte[length + 16];
        byte[] bytes = strA.substring(0, 8).getBytes();
        byte[] bytes2 = strA.substring(24, 32).getBytes();
        System.arraycopy(bytes, 0, bArr2, 0, 8);
        System.arraycopy(bArrC, 0, bArr2, 8, length);
        System.arraycopy(bytes2, 0, bArr2, length + 8, 8);
        return bArr2;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr == null || bArr.length < 16) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length - 16];
        System.arraycopy(bArr, 8, bArr2, 0, bArr.length - 16);
        return e.d(bArr2);
    }
}
