package com.igexin.push.util;

import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static PublicKey a(String str, String str2) throws InvalidKeySpecException, NoSuchAlgorithmException {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 0)));
    }

    public static SecretKey a(String str, int i10) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(str);
        keyGenerator.init(i10);
        return keyGenerator.generateKey();
    }

    public static byte[] a(String str, PublicKey publicKey, byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(1, publicKey);
        return cipher.doFinal(bArr);
    }

    public static byte[] a(String str, SecretKey secretKey, IvParameterSpec ivParameterSpec, byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(1, secretKey, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    public static byte[] b(String str, SecretKey secretKey, IvParameterSpec ivParameterSpec, byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(2, secretKey, ivParameterSpec);
        return cipher.doFinal(bArr);
    }
}
