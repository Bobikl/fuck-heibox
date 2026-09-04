package com.tencent.beacon.base.net.c;

import android.content.Context;
import android.util.Base64;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: EncryUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static byte[] a(int i10, String str, byte[] bArr) throws Exception {
        if (i10 == 3) {
            return a(str, bArr);
        }
        return null;
    }

    public static byte[] a(Context context, String str) {
        if (str == null) {
            return null;
        }
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) (context.getApplicationInfo().targetSdkVersion >= 28 ? KeyFactory.getInstance(n5.d.f132016a) : KeyFactory.getInstance(n5.d.f132016a, "BC")).generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCsAxNCSLyNUCOP1QqYStE8ZeiU\nv4afaMqEmoLCKb0mUZYvYOoVN7LPMi2IVY2MRaFJvuND3glVw1RDm2VJJtjQkwUd\n3kpR9TrHAf7UQOVTpNo3Vi7pXTOqZ6bh3ZA/fs56jDCCKV6+wT/pCeu8N6vVnPrD\nz3SdHIeNeWb/woazCwIDAQAB", 0)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, rSAPublicKey);
            return cipher.doFinal(str.getBytes(Charset.forName("UTF-8")));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static byte[] a(String str, byte[] bArr) throws Exception {
        if (str == null || bArr == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        for (int length = sb2.length(); length < 16; length++) {
            sb2.append("0");
        }
        String strSubstring = sb2.toString().substring(0, 16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(strSubstring.getBytes(Charset.forName("UTF-8")), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(2, secretKeySpec, new IvParameterSpec(strSubstring.getBytes(Charset.forName("UTF-8"))));
        return cipher.doFinal(bArr);
    }

    public static byte[] b(int i10, String str, byte[] bArr) throws Exception {
        if (i10 == 3) {
            return b(str, bArr);
        }
        return null;
    }

    private static byte[] b(String str, byte[] bArr) throws Exception {
        if (str == null || bArr == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        for (int length = sb2.length(); length < 16; length++) {
            sb2.append("0");
        }
        String strSubstring = sb2.toString().substring(0, 16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(strSubstring.getBytes(Charset.forName("UTF-8")), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(1, secretKeySpec, new IvParameterSpec(strSubstring.getBytes(Charset.forName("UTF-8"))));
        return cipher.doFinal(bArr);
    }
}
