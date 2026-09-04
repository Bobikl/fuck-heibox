package com.huawei.secure.android.common.encrypt.keystore.rsa;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import n5.d;

/* JADX INFO: loaded from: classes7.dex */
public abstract class RSAEncryptKS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62880a = "RSAEncryptKS";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62881b = "AndroidKeyStore";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62882c = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62883d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f62884e = 2048;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f62885f = 3072;

    private static synchronized KeyPair a(String str, boolean z10) {
        KeyPair keyPairGenerateKeyPair = null;
        if (b(str)) {
            b.b(f62880a, "Key pair exits");
            return null;
        }
        b.c(f62880a, "generate key pair.");
        try {
            try {
                try {
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(d.f132016a, f62881b);
                    if (z10) {
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 2).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setKeySize(3072).build());
                    } else {
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 2).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setKeySize(2048).build());
                    }
                    keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                } catch (NoSuchAlgorithmException e10) {
                    b.b(f62880a, "NoSuchAlgorithmException: " + e10.getMessage());
                }
            } catch (InvalidAlgorithmParameterException e11) {
                b.b(f62880a, "InvalidAlgorithmParameterException: " + e11.getMessage());
            }
        } catch (NoSuchProviderException e12) {
            b.b(f62880a, "NoSuchProviderException: " + e12.getMessage());
        } catch (Exception e13) {
            b.b(f62880a, "Exception: " + e13.getMessage());
        }
        return keyPairGenerateKeyPair;
    }

    private static PrivateKey a(String str) {
        if (!b(str)) {
            return null;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance(f62881b);
            keyStore.load(null);
            return (PrivateKey) keyStore.getKey(str, null);
        } catch (IOException e10) {
            b.b(f62880a, "IOException: " + e10.getMessage());
            return null;
        } catch (KeyStoreException e11) {
            b.b(f62880a, "KeyStoreException: " + e11.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e12) {
            b.b(f62880a, "NoSuchAlgorithmException: " + e12.getMessage());
            return null;
        } catch (UnrecoverableKeyException e13) {
            b.b(f62880a, "UnrecoverableKeyException: " + e13.getMessage());
            return null;
        } catch (CertificateException e14) {
            b.b(f62880a, "CertificateException: " + e14.getMessage());
            return null;
        } catch (Exception e15) {
            b.b(f62880a, "Exception: " + e15.getMessage());
            return null;
        }
    }

    private static boolean a() {
        return true;
    }

    private static byte[] a(String str, byte[] bArr, boolean z10) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            b.b(f62880a, "alias or content is null");
            return bArr2;
        }
        if (!a()) {
            b.b(f62880a, "sdk version is too low");
            return bArr2;
        }
        PublicKey publicKeyB = b(str, z10);
        if (publicKeyB == null) {
            b.b(f62880a, "Public key is null");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(1, publicKeyB, new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-1"), PSource.PSpecified.DEFAULT));
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e10) {
            b.b(f62880a, "InvalidAlgorithmParameterException: " + e10.getMessage());
            return bArr2;
        } catch (InvalidKeyException e11) {
            b.b(f62880a, "InvalidKeyException: " + e11.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e12) {
            b.b(f62880a, "NoSuchAlgorithmException: " + e12.getMessage());
            return bArr2;
        } catch (BadPaddingException e13) {
            b.b(f62880a, "BadPaddingException: " + e13.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e14) {
            b.b(f62880a, "IllegalBlockSizeException: " + e14.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e15) {
            b.b(f62880a, "NoSuchPaddingException: " + e15.getMessage());
            return bArr2;
        } catch (Exception e16) {
            b.b(f62880a, "Exception: " + e16.getMessage());
            return bArr2;
        }
    }

    private static PublicKey b(String str, boolean z10) {
        if (!b(str)) {
            a(str, z10);
        }
        Certificate certificateC = c(str);
        if (certificateC != null) {
            return certificateC.getPublicKey();
        }
        return null;
    }

    private static boolean b(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance(f62881b);
            keyStore.load(null);
            return keyStore.getKey(str, null) != null;
        } catch (IOException e10) {
            b.b(f62880a, "IOException: " + e10.getMessage());
            return false;
        } catch (KeyStoreException e11) {
            b.b(f62880a, "KeyStoreException: " + e11.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e12) {
            b.b(f62880a, "NoSuchAlgorithmException: " + e12.getMessage());
            return false;
        } catch (UnrecoverableKeyException e13) {
            b.b(f62880a, "UnrecoverableKeyException: " + e13.getMessage());
            return false;
        } catch (CertificateException e14) {
            b.b(f62880a, "CertificateException: " + e14.getMessage());
            return false;
        } catch (Exception e15) {
            b.b(f62880a, "Exception: " + e15.getMessage());
            return false;
        }
    }

    private static Certificate c(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance(f62881b);
            keyStore.load(null);
            return keyStore.getCertificate(str);
        } catch (IOException e10) {
            b.b(f62880a, "IOException: " + e10.getMessage());
            return null;
        } catch (KeyStoreException e11) {
            b.b(f62880a, "KeyStoreException: " + e11.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e12) {
            b.b(f62880a, "NoSuchAlgorithmException: " + e12.getMessage());
            return null;
        } catch (CertificateException e13) {
            b.b(f62880a, "CertificateException: " + e13.getMessage());
            return null;
        } catch (Exception e14) {
            b.b(f62880a, "Exception: " + e14.getMessage());
            return null;
        }
    }

    @Deprecated
    public static String decrpyt(String str, String str2) {
        try {
            return new String(decrpyt(str, Base64.decode(str2, 0)), "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            b.b(f62880a, "UnsupportedEncodingException: " + e10.getMessage());
            return "";
        } catch (Exception e11) {
            b.b(f62880a, "Exception: " + e11.getMessage());
            return "";
        }
    }

    @Deprecated
    public static byte[] decrpyt(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            b.b(f62880a, "alias or encrypted content is null");
            return bArr2;
        }
        if (!a()) {
            b.b(f62880a, "sdk version is too low");
            return bArr2;
        }
        PrivateKey privateKeyA = a(str);
        if (privateKeyA == null) {
            b.b(f62880a, "Private key is null");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(2, privateKeyA, new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-1"), PSource.PSpecified.DEFAULT));
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e10) {
            b.b(f62880a, "InvalidAlgorithmParameterException: " + e10.getMessage());
            return bArr2;
        } catch (InvalidKeyException e11) {
            b.b(f62880a, "InvalidKeyException: " + e11.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e12) {
            b.b(f62880a, "NoSuchAlgorithmException: " + e12.getMessage());
            return bArr2;
        } catch (BadPaddingException e13) {
            b.b(f62880a, "BadPaddingException: " + e13.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e14) {
            b.b(f62880a, "IllegalBlockSizeException: " + e14.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e15) {
            b.b(f62880a, "NoSuchPaddingException: " + e15.getMessage());
            return bArr2;
        } catch (Exception e16) {
            b.b(f62880a, "Exception: " + e16.getMessage());
            return bArr2;
        }
    }

    public static String decrpytNew(String str, String str2) {
        try {
            return new String(decrpytNew(str, Base64.decode(str2, 0)), "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            b.b(f62880a, "UnsupportedEncodingException: " + e10.getMessage());
            return "";
        } catch (Exception e11) {
            b.b(f62880a, "Exception: " + e11.getMessage());
            return "";
        }
    }

    public static byte[] decrpytNew(String str, byte[] bArr) {
        return decrpyt(str, bArr);
    }

    @Deprecated
    public static String encrypt(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return Base64.encodeToString(encrypt(str, str2.getBytes("UTF-8")), 0);
        } catch (UnsupportedEncodingException e10) {
            b.b(f62880a, "UnsupportedEncodingException: " + e10.getMessage());
            return "";
        }
    }

    @Deprecated
    public static byte[] encrypt(String str, byte[] bArr) {
        return a(str, bArr, false);
    }

    public static String encryptNew(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return Base64.encodeToString(encryptNew(str, str2.getBytes("UTF-8")), 0);
        } catch (UnsupportedEncodingException e10) {
            b.b(f62880a, "UnsupportedEncodingException: " + e10.getMessage());
            return "";
        }
    }

    public static byte[] encryptNew(String str, byte[] bArr) {
        return a(str, bArr, true);
    }
}
