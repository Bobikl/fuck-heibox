package com.huawei.agconnect.config.impl;

import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class i {
    public static SecretKey a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i10) throws InvalidKeySpecException, NoSuchAlgorithmException {
        if (bArr.length != 16 || bArr2.length != 16 || bArr3.length != 16) {
            throw new IllegalArgumentException("invalid data for generating the key.");
        }
        return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(Hex.encodeHexString(a(bArr, bArr2, bArr3)).toCharArray(), bArr4, i10, 128)).getEncoded(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
    }

    static byte[] a(SecretKey secretKey, byte[] bArr) throws GeneralSecurityException {
        if (secretKey == null || bArr == null) {
            throw new NullPointerException("key or cipherText must not be null.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(2, secretKey, new IvParameterSpec(bArrCopyOfRange));
        return cipher.doFinal(bArr, bArrCopyOfRange.length + 1, (bArr.length - bArrCopyOfRange.length) - 1);
    }

    private static byte[] a(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("bytes must not be null.");
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (i10 < 0) {
                bArr[i11] = (byte) (bArr[i11] << (-i10));
            } else {
                bArr[i11] = (byte) (bArr[i11] >> i10);
            }
        }
        return bArr;
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new NullPointerException("left or right must not be null.");
        }
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("left and right must be the same length.");
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return a(a(a(a(bArr, -4), bArr2), 6), bArr3);
    }
}
