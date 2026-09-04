package com.vivo.push.util;

import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: CryptographicTool.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = (char) (bArr[i10] ^ 16);
        }
        return new String(cArr);
    }

    public static byte[] a(String str, String str2, byte[] bArr) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("utf-8"), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(2, secretKeySpec, new IvParameterSpec(str.getBytes("utf-8")));
        return cipher.doFinal(bArr);
    }
}
