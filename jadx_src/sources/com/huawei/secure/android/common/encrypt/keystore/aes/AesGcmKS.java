package com.huawei.secure.android.common.encrypt.keystore.aes;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import com.huawei.secure.android.common.encrypt.utils.b;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes7.dex */
public class AesGcmKS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62873a = "GCMKS";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62874b = "AndroidKeyStore";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62875c = "AES/GCM/NoPadding";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62876d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f62877e = 12;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f62878f = 256;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Map<String, SecretKey> f62879g = new HashMap();

    private static SecretKey a(String str) {
        b.c(f62873a, "load key");
        SecretKey secretKeyGenerateKey = null;
        try {
            KeyStore keyStore = KeyStore.getInstance(f62874b);
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key instanceof SecretKey) {
                secretKeyGenerateKey = (SecretKey) key;
            } else {
                b.c(f62873a, "generate key");
                KeyGenerator keyGenerator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, f62874b);
                keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
                secretKeyGenerateKey = keyGenerator.generateKey();
            }
        } catch (IOException e10) {
            b.b(f62873a, "IOException : " + e10.getMessage());
        } catch (InvalidAlgorithmParameterException e11) {
            b.b(f62873a, "InvalidAlgorithmParameterException : " + e11.getMessage());
        } catch (KeyStoreException e12) {
            b.b(f62873a, "KeyStoreException : " + e12.getMessage());
        } catch (NoSuchAlgorithmException e13) {
            b.b(f62873a, "NoSuchAlgorithmException : " + e13.getMessage());
        } catch (NoSuchProviderException e14) {
            b.b(f62873a, "NoSuchProviderException : " + e14.getMessage());
        } catch (UnrecoverableKeyException e15) {
            b.b(f62873a, "UnrecoverableKeyException : " + e15.getMessage());
        } catch (CertificateException e16) {
            b.b(f62873a, "CertificateException : " + e16.getMessage());
        } catch (Exception e17) {
            b.b(f62873a, "Exception: " + e17.getMessage());
        }
        f62879g.put(str, secretKeyGenerateKey);
        return secretKeyGenerateKey;
    }

    private static boolean a() {
        return true;
    }

    private static SecretKey b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f62879g.get(str) == null) {
            a(str);
        }
        return f62879g.get(str);
    }

    public static String decrypt(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            b.b(f62873a, "alias or encrypt content is null");
            return "";
        }
        try {
            return new String(decrypt(str, HexUtil.hexStr2ByteArray(str2)), "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            b.b(f62873a, "decrypt: UnsupportedEncodingException : " + e10.getMessage());
            return "";
        }
    }

    public static byte[] decrypt(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            b.b(f62873a, "alias or encrypt content is null");
            return bArr2;
        }
        if (!a()) {
            b.b(f62873a, "sdk version is too low");
            return bArr2;
        }
        if (bArr.length > 12) {
            return decrypt(b(str), bArr);
        }
        b.b(f62873a, "Decrypt source data is invalid.");
        return bArr2;
    }

    public static byte[] decrypt(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (secretKey == null) {
            b.b(f62873a, "Decrypt secret key is null");
            return bArr2;
        }
        if (bArr == null) {
            b.b(f62873a, "content is null");
            return bArr2;
        }
        if (!a()) {
            b.b(f62873a, "sdk version is too low");
            return bArr2;
        }
        if (bArr.length <= 12) {
            b.b(f62873a, "Decrypt source data is invalid.");
            return bArr2;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        try {
            Cipher cipher = Cipher.getInstance(f62875c);
            cipher.init(2, secretKey, new GCMParameterSpec(128, bArrCopyOf));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (InvalidAlgorithmParameterException e10) {
            b.b(f62873a, "InvalidAlgorithmParameterException : " + e10.getMessage());
            return bArr2;
        } catch (InvalidKeyException e11) {
            b.b(f62873a, "InvalidKeyException : " + e11.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e12) {
            b.b(f62873a, "NoSuchAlgorithmException : " + e12.getMessage());
            return bArr2;
        } catch (BadPaddingException e13) {
            b.b(f62873a, "BadPaddingException : " + e13.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e14) {
            b.b(f62873a, "IllegalBlockSizeException : " + e14.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e15) {
            b.b(f62873a, "NoSuchPaddingException : " + e15.getMessage());
            return bArr2;
        } catch (Exception e16) {
            b.b(f62873a, "Exception: " + e16.getMessage());
            return bArr2;
        }
    }

    public static String encrypt(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            b.b(f62873a, "alias or encrypt content is null");
            return "";
        }
        try {
            return HexUtil.byteArray2HexStr(encrypt(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e10) {
            b.b(f62873a, "encrypt: UnsupportedEncodingException : " + e10.getMessage());
            return "";
        }
    }

    public static byte[] encrypt(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            b.b(f62873a, "alias or encrypt content is null");
            return bArr2;
        }
        if (a()) {
            return encrypt(b(str), bArr);
        }
        b.b(f62873a, "sdk version is too low");
        return bArr2;
    }

    public static byte[] encrypt(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null) {
            b.b(f62873a, "content is null");
            return bArr2;
        }
        if (secretKey == null) {
            b.b(f62873a, "secret key is null");
            return bArr2;
        }
        if (!a()) {
            b.b(f62873a, "sdk version is too low");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance(f62875c);
            cipher.init(1, secretKey);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (iv != null && iv.length == 12) {
                byte[] bArrCopyOf = Arrays.copyOf(iv, iv.length + bArrDoFinal.length);
                System.arraycopy(bArrDoFinal, 0, bArrCopyOf, iv.length, bArrDoFinal.length);
                return bArrCopyOf;
            }
            b.b(f62873a, "IV is invalid.");
            return bArr2;
        } catch (InvalidKeyException e10) {
            b.b(f62873a, "InvalidKeyException : " + e10.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e11) {
            b.b(f62873a, "NoSuchAlgorithmException : " + e11.getMessage());
            return bArr2;
        } catch (BadPaddingException e12) {
            b.b(f62873a, "BadPaddingException : " + e12.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e13) {
            b.b(f62873a, "IllegalBlockSizeException : " + e13.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e14) {
            b.b(f62873a, "NoSuchPaddingException : " + e14.getMessage());
            return bArr2;
        } catch (Exception e15) {
            b.b(f62873a, "Exception: " + e15.getMessage());
            return bArr2;
        }
    }
}
