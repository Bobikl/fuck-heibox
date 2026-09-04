package com.sina.weibo.sdk.b;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final char[] f96819aj = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = new char[32];
            int i10 = 0;
            for (int i11 = 0; i11 < 16; i11++) {
                byte b10 = bArrDigest[i11];
                int i12 = i10 + 1;
                char[] cArr2 = f96819aj;
                cArr[i10] = cArr2[(b10 >>> 4) & 15];
                i10 = i12 + 1;
                cArr[i12] = cArr2[b10 & 15];
            }
            return new String(cArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String f(String str) {
        try {
            return a(str.getBytes());
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
