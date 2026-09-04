package com.huawei.secure.android.common.encrypt.rsa;

import android.text.TextUtils;
import android.util.Base64;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes7.dex */
public abstract class RSAEncrypt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62892a = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62893b = "RSAEncrypt";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62894c = "UTF-8";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62895d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f62896e = 2048;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f62897f = "RSA";

    public static String decrypt(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return decrypt(str, EncryptUtil.getPrivateKey(str2));
        }
        b.b(f62893b, "content or private key is null");
        return "";
    }

    public static String decrypt(String str, PrivateKey privateKey) {
        if (TextUtils.isEmpty(str) || privateKey == null || !isPrivateKeyLengthRight((RSAPrivateKey) privateKey)) {
            b.b(f62893b, "content or privateKey is null , or length is too short");
            return "";
        }
        try {
            return new String(decrypt(Base64.decode(str, 0), privateKey), "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            b.b(f62893b, "RSA decrypt exception : " + e10.getMessage());
            return "";
        } catch (Exception e11) {
            b.b(f62893b, "exception : " + e11.getMessage());
            return "";
        }
    }

    public static byte[] decrypt(byte[] bArr, PrivateKey privateKey) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || privateKey == null || !isPrivateKeyLengthRight((RSAPrivateKey) privateKey)) {
            b.b(f62893b, "content or privateKey is null , or length is too short");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(2, privateKey);
            return cipher.doFinal(bArr);
        } catch (GeneralSecurityException e10) {
            b.b(f62893b, "RSA decrypt exception : " + e10.getMessage());
            return bArr2;
        }
    }

    public static String encrypt(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return encrypt(str, EncryptUtil.getPublicKey(str2));
        }
        b.b(f62893b, "content or public key is null");
        return "";
    }

    public static String encrypt(String str, PublicKey publicKey) {
        if (TextUtils.isEmpty(str) || publicKey == null || !isPublicKeyLengthRight((RSAPublicKey) publicKey)) {
            b.b(f62893b, "content or PublicKey is null , or length is too short");
            return "";
        }
        try {
            return Base64.encodeToString(encrypt(str.getBytes("UTF-8"), publicKey), 0);
        } catch (UnsupportedEncodingException unused) {
            b.b(f62893b, "encrypt: UnsupportedEncodingException");
            return "";
        } catch (Exception e10) {
            b.b(f62893b, "exception : " + e10.getMessage());
            return "";
        }
    }

    public static byte[] encrypt(byte[] bArr, PublicKey publicKey) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || publicKey == null || !isPublicKeyLengthRight((RSAPublicKey) publicKey)) {
            b.b(f62893b, "content or PublicKey is null , or length is too short");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (GeneralSecurityException e10) {
            b.b(f62893b, "RSA encrypt exception : " + e10.getMessage());
            return bArr2;
        }
    }

    public static Map<String, Key> generateRSAKeyPair(int i10) throws NoSuchAlgorithmException {
        HashMap map = new HashMap(2);
        if (i10 < 2048) {
            b.b(f62893b, "generateRSAKeyPair: key length is too short");
            return map;
        }
        SecureRandom secureRandomGenSecureRandom = EncryptUtil.genSecureRandom();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(i10, secureRandomGenSecureRandom);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
        PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
        map.put("publicKey", publicKey);
        map.put("privateKey", privateKey);
        return map;
    }

    public static boolean isPrivateKeyLengthRight(RSAPrivateKey rSAPrivateKey) {
        return rSAPrivateKey != null && rSAPrivateKey.getModulus().bitLength() >= 2048;
    }

    public static boolean isPublicKeyLengthRight(RSAPublicKey rSAPublicKey) {
        return rSAPublicKey != null && rSAPublicKey.getModulus().bitLength() >= 2048;
    }
}
