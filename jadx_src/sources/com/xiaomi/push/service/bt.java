package com.xiaomi.push.service;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes4.dex */
public class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static RSAPublicKey f107975a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final byte[] f1058a;

    static {
        byte[] bArr = {org.apache.tools.tar.c.F, -127, -97, org.apache.tools.tar.c.F, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 3, -127, -115, 0, org.apache.tools.tar.c.F, -127, -119, 2, -127, -127, 0, -109, -38, -114, com.google.common.base.a.D, -72, 78, 16, 70, -90, 113, -30, 36, 85, -3, -43, 123, 61, -98, 4, -16, 67, 19, -90, -73, -5, -89, 36, 44, -27, 59, -123, 72, -73, -48, org.apache.tools.tar.c.G, 13, 16, org.apache.tools.tar.c.H, -27, -82, com.google.common.base.a.f56668u, -28, 84, 0, -41, 16, 69, -39, 7, 82, 56, 79, -37, 40, 85, 107, 98, 33, 123, -34, -49, 111, -11, org.apache.tools.tar.c.G, com.google.common.base.a.F, 117, -74, 114, -122, -29, -84, 82, com.google.common.base.a.f56673z, -122, 42, -40, -79, com.google.common.base.a.f56668u, -116, -42, 101, -70, 44, 11, 62, -49, -3, -22, -2, 66, 90, -116, -75, -99, 34, 121, 69, 10, -81, -57, 89, -23, -36, -60, -81, 67, -114, 10, 79, 100, com.google.common.base.a.G, 47, -24, 110, -66, -7, 87, 16, -125, -91, -43, -103, 67, -20, 41, 117, -37, -11, 2, 3, 1, 0, 1};
        f1058a = bArr;
        try {
            f107975a = (RSAPublicKey) KeyFactory.getInstance(n5.d.f132016a).generatePublic(new X509EncodedKeySpec(bArr));
        } catch (Throwable unused) {
            com.xiaomi.channel.commonutils.logger.b.d("rsa key pair init failure!!!");
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, f107975a);
            return Base64.encodeToString(a(cipher, 1, str.getBytes("UTF-8"), f107975a.getModulus().bitLength()), 2);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static byte[] a(Cipher cipher, int i10, byte[] bArr, int i11) {
        if (cipher == null || bArr == null) {
            return null;
        }
        int i12 = i10 == 2 ? i11 / 8 : (i11 / 8) - 11;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (bArr.length > i13) {
                byte[] bArrDoFinal = bArr.length - i13 > i12 ? cipher.doFinal(bArr, i13, i12) : cipher.doFinal(bArr, i13, bArr.length - i13);
                byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
                i14++;
                i13 = i14 * i12;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
