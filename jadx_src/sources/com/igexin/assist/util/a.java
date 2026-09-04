package com.igexin.assist.util;

import com.igexin.push.util.h;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static String a(String str, byte[] bArr) {
        try {
            byte[] bArrA = h.a(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(a(bArr), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/CFB128/NoPadding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(a("".getBytes())));
            byte[] bArrDoFinal = cipher.doFinal(bArrA);
            if (bArrDoFinal != null) {
                return new String(bArrDoFinal);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
