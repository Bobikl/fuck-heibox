package com.huawei.secure.android.common.encrypt.keystore.rsa;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
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
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import n5.d;

/* JADX INFO: loaded from: classes7.dex */
public abstract class RSASignKS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62886a = "RSASignKS";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62887b = "AndroidKeyStore";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62888c = "SHA256withRSA/PSS";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62889d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f62890e = 2048;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f62891f = 3072;

    private static synchronized KeyPair a(String str, boolean z10) {
        KeyPair keyPairGenerateKeyPair = null;
        if (a(str)) {
            b.b(f62886a, "Key pair exits");
            return null;
        }
        try {
            try {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(d.f132016a, f62887b);
                if (z10) {
                    keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 12).setDigests("SHA-256", "SHA-512").setSignaturePaddings("PSS").setKeySize(3072).build());
                } else {
                    keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 12).setDigests("SHA-256", "SHA-512").setSignaturePaddings("PSS").setKeySize(2048).build());
                }
                keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            } catch (NoSuchAlgorithmException e10) {
                b.b(f62886a, "NoSuchAlgorithmException: " + e10.getMessage());
            }
        } catch (InvalidAlgorithmParameterException e11) {
            b.b(f62886a, "InvalidAlgorithmParameterException: " + e11.getMessage());
        } catch (NoSuchProviderException e12) {
            b.b(f62886a, "NoSuchProviderException: " + e12.getMessage());
        }
        return keyPairGenerateKeyPair;
    }

    private static boolean a(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance(f62887b);
            keyStore.load(null);
            return keyStore.getKey(str, null) != null;
        } catch (IOException e10) {
            b.b(f62886a, "IOException: " + e10.getMessage());
            return false;
        } catch (KeyStoreException e11) {
            b.b(f62886a, "KeyStoreException: " + e11.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e12) {
            b.b(f62886a, "NoSuchAlgorithmException: " + e12.getMessage());
            return false;
        } catch (UnrecoverableKeyException e13) {
            b.b(f62886a, "UnrecoverableKeyException: " + e13.getMessage());
            return false;
        } catch (CertificateException e14) {
            b.b(f62886a, "CertificateException: " + e14.getMessage());
            return false;
        }
    }

    private static boolean a(String str, byte[] bArr, byte[] bArr2, boolean z10) {
        if (TextUtils.isEmpty(str) || bArr == null || bArr2 == null) {
            b.b(f62886a, "alias or content or sign value is null");
            return false;
        }
        if (!isBuildVersionHigherThan22()) {
            b.b(f62886a, "sdk version is too low");
            return false;
        }
        KeyStore.Entry entryB = b(str, z10);
        if (!(entryB instanceof KeyStore.PrivateKeyEntry)) {
            b.b(f62886a, "Not an instance of a PrivateKeyEntry");
            return false;
        }
        try {
            Signature signature = Signature.getInstance(f62888c);
            signature.initVerify(((KeyStore.PrivateKeyEntry) entryB).getCertificate());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException e10) {
            b.b(f62886a, "InvalidKeyException: " + e10.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e11) {
            b.b(f62886a, "NoSuchAlgorithmException: " + e11.getMessage());
            return false;
        } catch (SignatureException e12) {
            b.b(f62886a, "SignatureException: " + e12.getMessage());
            return false;
        } catch (Exception e13) {
            b.b(f62886a, "Exception: " + e13.getMessage());
            return false;
        }
    }

    private static byte[] a(String str, byte[] bArr, boolean z10) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            b.b(f62886a, "alias or content is null");
            return bArr2;
        }
        if (!isBuildVersionHigherThan22()) {
            b.b(f62886a, "sdk version is too low");
            return bArr2;
        }
        KeyStore.Entry entryB = b(str, z10);
        if (!(entryB instanceof KeyStore.PrivateKeyEntry)) {
            b.b(f62886a, "Not an instance of a PrivateKeyEntry");
            return bArr2;
        }
        try {
            Signature signature = Signature.getInstance(f62888c);
            signature.initSign(((KeyStore.PrivateKeyEntry) entryB).getPrivateKey());
            signature.update(bArr);
            return signature.sign();
        } catch (InvalidKeyException e10) {
            b.b(f62886a, "InvalidKeyException: " + e10.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e11) {
            b.b(f62886a, "NoSuchAlgorithmException: " + e11.getMessage());
            return bArr2;
        } catch (SignatureException e12) {
            b.b(f62886a, "SignatureException: " + e12.getMessage());
            return bArr2;
        } catch (Exception e13) {
            b.b(f62886a, "Exception: " + e13.getMessage());
            return bArr2;
        }
    }

    private static KeyStore.Entry b(String str, boolean z10) {
        if (!a(str)) {
            a(str, z10);
        }
        try {
            KeyStore keyStore = KeyStore.getInstance(f62887b);
            keyStore.load(null);
            return keyStore.getEntry(str, null);
        } catch (IOException e10) {
            b.b(f62886a, "IOException: " + e10.getMessage());
            return null;
        } catch (KeyStoreException e11) {
            b.b(f62886a, "KeyStoreException: " + e11.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e12) {
            b.b(f62886a, "NoSuchAlgorithmException: " + e12.getMessage());
            return null;
        } catch (UnrecoverableEntryException e13) {
            b.b(f62886a, "UnrecoverableEntryException: " + e13.getMessage());
            return null;
        } catch (CertificateException e14) {
            b.b(f62886a, "CertificateException: " + e14.getMessage());
            return null;
        }
    }

    public static boolean isBuildVersionHigherThan22() {
        return true;
    }

    @Deprecated
    public static String sign(String str, String str2) {
        try {
            return Base64.encodeToString(sign(str, str2.getBytes("UTF-8")), 0);
        } catch (UnsupportedEncodingException e10) {
            Log.e(f62886a, "sign UnsupportedEncodingException : " + e10.getMessage());
            return "";
        }
    }

    @Deprecated
    public static byte[] sign(String str, byte[] bArr) {
        return a(str, bArr, false);
    }

    public static String signNew(String str, String str2) {
        try {
            return Base64.encodeToString(signNew(str, str2.getBytes("UTF-8")), 0);
        } catch (UnsupportedEncodingException e10) {
            Log.e(f62886a, "sign UnsupportedEncodingException : " + e10.getMessage());
            return "";
        }
    }

    public static byte[] signNew(String str, byte[] bArr) {
        return a(str, bArr, true);
    }

    @Deprecated
    public static boolean verifySign(String str, String str2, String str3) {
        try {
            return verifySign(str, str2.getBytes("UTF-8"), Base64.decode(str3, 0));
        } catch (UnsupportedEncodingException e10) {
            Log.e(f62886a, "verifySign UnsupportedEncodingException: " + e10.getMessage());
            return false;
        } catch (Exception e11) {
            b.b(f62886a, "base64 decode Exception" + e11.getMessage());
            return false;
        }
    }

    @Deprecated
    public static boolean verifySign(String str, byte[] bArr, byte[] bArr2) {
        return a(str, bArr, bArr2, false);
    }

    public static boolean verifySignNew(String str, String str2, String str3) {
        try {
            return verifySignNew(str, str2.getBytes("UTF-8"), Base64.decode(str3, 0));
        } catch (UnsupportedEncodingException e10) {
            Log.e(f62886a, "verifySign UnsupportedEncodingException: " + e10.getMessage());
            return false;
        } catch (Exception e11) {
            b.b(f62886a, "base64 decode Exception" + e11.getMessage());
            return false;
        }
    }

    public static boolean verifySignNew(String str, byte[] bArr, byte[] bArr2) {
        return a(str, bArr, bArr2, true);
    }
}
