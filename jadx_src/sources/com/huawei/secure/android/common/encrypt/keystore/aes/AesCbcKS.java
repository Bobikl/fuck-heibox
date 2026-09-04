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
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes7.dex */
public class AesCbcKS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62866a = "CBCKS";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62867b = "AndroidKeyStore";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62868c = "AES/CBC/PKCS7Padding";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62869d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f62870e = 16;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f62871f = 256;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Map<String, SecretKey> f62872g = new HashMap();

    private static synchronized SecretKey a(String str) {
        SecretKey secretKeyGenerateKey;
        b.c(f62866a, "load key");
        secretKeyGenerateKey = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                KeyStore keyStore = KeyStore.getInstance(f62867b);
                                keyStore.load(null);
                                Key key = keyStore.getKey(str, null);
                                if (key == null || !(key instanceof SecretKey)) {
                                    b.c(f62866a, "generate key");
                                    KeyGenerator keyGenerator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, f62867b);
                                    keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setKeySize(256).build());
                                    secretKeyGenerateKey = keyGenerator.generateKey();
                                } else {
                                    secretKeyGenerateKey = (SecretKey) key;
                                }
                            } catch (CertificateException e10) {
                                b.b(f62866a, "CertificateException: " + e10.getMessage());
                            }
                        } catch (InvalidAlgorithmParameterException e11) {
                            b.b(f62866a, "InvalidAlgorithmParameterException: " + e11.getMessage());
                        }
                    } catch (NoSuchProviderException e12) {
                        b.b(f62866a, "NoSuchProviderException: " + e12.getMessage());
                    }
                } catch (UnrecoverableKeyException e13) {
                    b.b(f62866a, "UnrecoverableKeyException: " + e13.getMessage());
                }
            } catch (IOException e14) {
                b.b(f62866a, "IOException: " + e14.getMessage());
            } catch (Exception e15) {
                b.b(f62866a, "Exception: " + e15.getMessage());
            }
        } catch (KeyStoreException e16) {
            b.b(f62866a, "KeyStoreException: " + e16.getMessage());
        } catch (NoSuchAlgorithmException e17) {
            b.b(f62866a, "NoSuchAlgorithmException: " + e17.getMessage());
        }
        f62872g.put(str, secretKeyGenerateKey);
        return secretKeyGenerateKey;
    }

    private static boolean a() {
        return true;
    }

    private static SecretKey b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f62872g.get(str) == null) {
            a(str);
        }
        return f62872g.get(str);
    }

    public static String decrypt(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            b.b(f62866a, "alias or encrypt content is null");
            return "";
        }
        try {
            return new String(decrypt(str, HexUtil.hexStr2ByteArray(str2)), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            b.b(f62866a, "encrypt: UnsupportedEncodingException");
            return "";
        }
    }

    public static byte[] decrypt(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            b.b(f62866a, "alias or encrypt content is null");
            return bArr2;
        }
        if (!a()) {
            b.b(f62866a, "sdk version is too low");
            return bArr2;
        }
        if (bArr.length <= 16) {
            b.b(f62866a, "Decrypt source data is invalid.");
            return bArr2;
        }
        SecretKey secretKeyB = b(str);
        if (secretKeyB == null) {
            b.b(f62866a, "decrypt secret key is null");
            return bArr2;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        try {
            Cipher cipher = Cipher.getInstance(f62868c);
            cipher.init(2, secretKeyB, new IvParameterSpec(bArrCopyOf));
            return cipher.doFinal(bArr, 16, bArr.length - 16);
        } catch (InvalidAlgorithmParameterException e10) {
            b.b(f62866a, "InvalidAlgorithmParameterException: " + e10.getMessage());
            return bArr2;
        } catch (InvalidKeyException e11) {
            b.b(f62866a, "InvalidKeyException: " + e11.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e12) {
            b.b(f62866a, "NoSuchAlgorithmException: " + e12.getMessage());
            return bArr2;
        } catch (BadPaddingException e13) {
            b.b(f62866a, "BadPaddingException: " + e13.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e14) {
            b.b(f62866a, "IllegalBlockSizeException: " + e14.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e15) {
            b.b(f62866a, "NoSuchPaddingException: " + e15.getMessage());
            return bArr2;
        } catch (Exception e16) {
            b.b(f62866a, "Exception: " + e16.getMessage());
            return bArr2;
        }
    }

    public static String encrypt(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            b.b(f62866a, "encrypt 1 content is null");
            return "";
        }
        try {
            return HexUtil.byteArray2HexStr(encrypt(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            b.b(f62866a, "encrypt: UnsupportedEncodingException");
            return "";
        }
    }

    public static byte[] encrypt(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            b.b(f62866a, "alias or encrypt content is null");
            return bArr2;
        }
        if (!a()) {
            b.b(f62866a, "sdk version is too low");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance(f62868c);
            SecretKey secretKeyB = b(str);
            if (secretKeyB == null) {
                b.b(f62866a, "encrypt secret key is null");
                return bArr2;
            }
            cipher.init(1, secretKeyB);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (iv != null && iv.length == 16) {
                byte[] bArrCopyOf = Arrays.copyOf(iv, iv.length + bArrDoFinal.length);
                System.arraycopy(bArrDoFinal, 0, bArrCopyOf, iv.length, bArrDoFinal.length);
                return bArrCopyOf;
            }
            b.b(f62866a, "IV is invalid.");
            return bArr2;
        } catch (InvalidKeyException e10) {
            b.b(f62866a, "InvalidKeyException: " + e10.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e11) {
            b.b(f62866a, "NoSuchAlgorithmException: " + e11.getMessage());
            return bArr2;
        } catch (BadPaddingException e12) {
            b.b(f62866a, "BadPaddingException: " + e12.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e13) {
            b.b(f62866a, "IllegalBlockSizeException: " + e13.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e14) {
            b.b(f62866a, "NoSuchPaddingException: " + e14.getMessage());
            return bArr2;
        } catch (Exception e15) {
            b.b(f62866a, "Exception: " + e15.getMessage());
            return bArr2;
        }
    }
}
