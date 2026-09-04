package com.huawei.secure.android.common.encrypt.utils;

import android.os.Build;
import android.util.Base64;
import bb.c;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;

/* JADX INFO: loaded from: classes7.dex */
public class EncryptUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62909a = "EncryptUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62910b = "RSA";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f62911c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f62912d = true;

    private static SecureRandom a() {
        SecureRandom instanceStrong;
        b.a(f62909a, "generateSecureRandomNew ");
        try {
            instanceStrong = Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : null;
        } catch (NoSuchAlgorithmException unused) {
            b.b(f62909a, "getSecureRandomBytes: NoSuchAlgorithmException");
        }
        if (instanceStrong == null) {
            try {
                instanceStrong = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused2) {
                b.b(f62909a, "NoSuchAlgorithmException");
                return instanceStrong;
            } catch (Throwable th2) {
                if (f62912d) {
                    b.b(f62909a, "exception : " + th2.getMessage() + " , you should implementation bcprov-jdk15on library");
                    f62912d = false;
                }
                return instanceStrong;
            }
        }
        AESEngine aESEngine = new AESEngine();
        byte[] bArr = new byte[32];
        instanceStrong.nextBytes(bArr);
        return new SP800SecureRandomBuilder(instanceStrong, true).setEntropyBitsRequired(c.b.f30966u4).buildCTR(aESEngine, 256, bArr, false);
    }

    private static byte[] a(int i10) {
        SecureRandom secureRandomA = a();
        if (secureRandomA == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[i10];
        secureRandomA.nextBytes(bArr);
        return bArr;
    }

    public static SecureRandom genSecureRandom() {
        if (f62911c) {
            return a();
        }
        SecureRandom instanceStrong = null;
        try {
            instanceStrong = Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException unused) {
            b.b(f62909a, "genSecureRandom: NoSuchAlgorithmException");
        }
        return instanceStrong;
    }

    public static byte[] generateSecureRandom(int i10) {
        if (f62911c) {
            return a(i10);
        }
        byte[] bArr = new byte[i10];
        SecureRandom secureRandom = null;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                secureRandom = SecureRandom.getInstanceStrong();
            }
        } catch (NoSuchAlgorithmException unused) {
            b.b(f62909a, "getSecureRandomBytes: NoSuchAlgorithmException");
        }
        if (secureRandom == null) {
            try {
                secureRandom = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused2) {
                b.b(f62909a, "getSecureRandomBytes getInstance: NoSuchAlgorithmException");
                return new byte[0];
            } catch (Exception e10) {
                b.b(f62909a, "getSecureRandomBytes getInstance: exception : " + e10.getMessage());
                return new byte[0];
            }
        }
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public static String generateSecureRandomStr(int i10) {
        return HexUtil.byteArray2HexStr(generateSecureRandom(i10));
    }

    public static PrivateKey getPrivateKey(String str) {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 0)));
            } catch (GeneralSecurityException e10) {
                b.b(f62909a, "load Key Exception:" + e10.getMessage());
                return null;
            }
        } catch (IllegalArgumentException unused) {
            b.b(f62909a, "base64 decode IllegalArgumentException");
            return null;
        } catch (Exception e11) {
            b.b(f62909a, "base64 decode Exception" + e11.getMessage());
            return null;
        }
    }

    public static RSAPublicKey getPublicKey(String str) {
        try {
            try {
                return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            } catch (GeneralSecurityException e10) {
                b.b(f62909a, "load Key Exception:" + e10.getMessage());
                return null;
            }
        } catch (IllegalArgumentException unused) {
            b.b(f62909a, "base64 decode IllegalArgumentException");
            return null;
        } catch (Exception e11) {
            b.b(f62909a, "base64 decode Exception" + e11.getMessage());
            return null;
        }
    }

    public static boolean isBouncycastleFlag() {
        return f62911c;
    }

    public static void setBouncycastleFlag(boolean z10) {
        b.c(f62909a, "setBouncycastleFlag: " + z10);
        f62911c = z10;
    }
}
