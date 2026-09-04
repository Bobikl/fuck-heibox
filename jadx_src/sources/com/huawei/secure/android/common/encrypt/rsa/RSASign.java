package com.huawei.secure.android.common.encrypt.rsa;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public abstract class RSASign {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62898a = "SHA256WithRSA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62899b = "SHA256WithRSA/PSS";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62900c = "RSASign";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62901d = "UTF-8";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f62902e = "";

    private static String a(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            b.b(f62900c, "sign content or key is null");
            return "";
        }
        PrivateKey privateKey = EncryptUtil.getPrivateKey(str2);
        return z10 ? newSign(str, privateKey) : sign(str, privateKey);
    }

    private static String a(String str, PrivateKey privateKey, boolean z10) {
        try {
            return Base64.encodeToString(sign(str.getBytes("UTF-8"), privateKey, z10), 0);
        } catch (UnsupportedEncodingException e10) {
            b.b(f62900c, "sign UnsupportedEncodingException: " + e10.getMessage());
            return "";
        }
    }

    private static boolean a(String str, String str2, String str3, boolean z10) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            b.b(f62900c, "content or public key or sign value is null");
            return false;
        }
        RSAPublicKey publicKey = EncryptUtil.getPublicKey(str3);
        return z10 ? newVerifySign(str, str2, publicKey) : verifySign(str, str2, publicKey);
    }

    private static boolean a(String str, String str2, PublicKey publicKey, boolean z10) {
        try {
            return verifySign(str.getBytes("UTF-8"), Base64.decode(str2, 0), publicKey, z10);
        } catch (UnsupportedEncodingException e10) {
            b.b(f62900c, "verifySign UnsupportedEncodingException: " + e10.getMessage());
            return false;
        } catch (Exception e11) {
            b.b(f62900c, "base64 decode Exception : " + e11.getMessage());
            return false;
        }
    }

    public static boolean isBuildVersionHigherThan23() {
        return Build.VERSION.SDK_INT > 23;
    }

    public static String newSign(String str, String str2) {
        if (isBuildVersionHigherThan23()) {
            return a(str, str2, true);
        }
        b.b(f62900c, "sdk version is too low");
        return "";
    }

    public static String newSign(String str, PrivateKey privateKey) {
        if (isBuildVersionHigherThan23()) {
            return a(str, privateKey, true);
        }
        b.b(f62900c, "sdk version is too low");
        return "";
    }

    public static boolean newVerifySign(String str, String str2, String str3) {
        if (isBuildVersionHigherThan23()) {
            return a(str, str2, str3, true);
        }
        b.b(f62900c, "sdk version is too low");
        return false;
    }

    public static boolean newVerifySign(String str, String str2, PublicKey publicKey) {
        if (isBuildVersionHigherThan23()) {
            return a(str, str2, publicKey, true);
        }
        b.b(f62900c, "sdk version is too low");
        return false;
    }

    @Deprecated
    public static String sign(String str, String str2) {
        return a(str, str2, false);
    }

    @Deprecated
    public static String sign(String str, PrivateKey privateKey) {
        return a(str, privateKey, false);
    }

    public static byte[] sign(ByteBuffer byteBuffer, PrivateKey privateKey, boolean z10) {
        Signature signature;
        byte[] bArrSign = new byte[0];
        if (byteBuffer == null || privateKey == null || !RSAEncrypt.isPrivateKeyLengthRight((RSAPrivateKey) privateKey)) {
            b.b(f62900c, "content or privateKey is null , or length is too short");
            return bArrSign;
        }
        try {
            if (z10) {
                signature = Signature.getInstance(f62899b);
                signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
            } else {
                signature = Signature.getInstance(f62898a);
            }
            signature.initSign(privateKey);
            signature.update(byteBuffer);
            bArrSign = signature.sign();
            b.c(f62900c, "result is : " + Arrays.toString(bArrSign));
            return bArrSign;
        } catch (InvalidAlgorithmParameterException e10) {
            b.b(f62900c, "sign InvalidAlgorithmParameterException: " + e10.getMessage());
            return bArrSign;
        } catch (InvalidKeyException e11) {
            b.b(f62900c, "sign InvalidKeyException: " + e11.getMessage());
            return bArrSign;
        } catch (NoSuchAlgorithmException e12) {
            b.b(f62900c, "sign NoSuchAlgorithmException: " + e12.getMessage());
            return bArrSign;
        } catch (SignatureException e13) {
            b.b(f62900c, "sign SignatureException: " + e13.getMessage());
            return bArrSign;
        } catch (Exception e14) {
            b.b(f62900c, "sign Exception: " + e14.getMessage());
            return bArrSign;
        }
    }

    public static byte[] sign(byte[] bArr, PrivateKey privateKey, boolean z10) {
        Signature signature;
        byte[] bArr2 = new byte[0];
        if (bArr == null || privateKey == null || !RSAEncrypt.isPrivateKeyLengthRight((RSAPrivateKey) privateKey)) {
            b.b(f62900c, "content or privateKey is null , or length is too short");
            return bArr2;
        }
        try {
            if (z10) {
                signature = Signature.getInstance(f62899b);
                signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
            } else {
                signature = Signature.getInstance(f62898a);
            }
            signature.initSign(privateKey);
            signature.update(bArr);
            return signature.sign();
        } catch (InvalidAlgorithmParameterException e10) {
            b.b(f62900c, "sign InvalidAlgorithmParameterException: " + e10.getMessage());
            return bArr2;
        } catch (InvalidKeyException e11) {
            b.b(f62900c, "sign InvalidKeyException: " + e11.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e12) {
            b.b(f62900c, "sign NoSuchAlgorithmException: " + e12.getMessage());
            return bArr2;
        } catch (SignatureException e13) {
            b.b(f62900c, "sign SignatureException: " + e13.getMessage());
            return bArr2;
        } catch (Exception e14) {
            b.b(f62900c, "sign Exception: " + e14.getMessage());
            return bArr2;
        }
    }

    @Deprecated
    public static boolean verifySign(String str, String str2, String str3) {
        return a(str, str2, str3, false);
    }

    @Deprecated
    public static boolean verifySign(String str, String str2, PublicKey publicKey) {
        return a(str, str2, publicKey, false);
    }

    public static boolean verifySign(ByteBuffer byteBuffer, byte[] bArr, PublicKey publicKey, boolean z10) {
        Signature signature;
        if (byteBuffer == null || publicKey == null || bArr == null || !RSAEncrypt.isPublicKeyLengthRight((RSAPublicKey) publicKey)) {
            b.b(f62900c, "content or publicKey is null , or length is too short");
            return false;
        }
        try {
            if (z10) {
                signature = Signature.getInstance(f62899b);
                signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
            } else {
                signature = Signature.getInstance(f62898a);
            }
            signature.initVerify(publicKey);
            signature.update(byteBuffer);
            return signature.verify(bArr);
        } catch (GeneralSecurityException e10) {
            b.b(f62900c, "check sign exception: " + e10.getMessage());
            return false;
        } catch (Exception e11) {
            b.b(f62900c, "exception : " + e11.getMessage());
            return false;
        }
    }

    public static boolean verifySign(byte[] bArr, byte[] bArr2, PublicKey publicKey, boolean z10) {
        Signature signature;
        if (bArr == null || publicKey == null || bArr2 == null || !RSAEncrypt.isPublicKeyLengthRight((RSAPublicKey) publicKey)) {
            b.b(f62900c, "content or publicKey is null , or length is too short");
            return false;
        }
        try {
            if (z10) {
                signature = Signature.getInstance(f62899b);
                signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
            } else {
                signature = Signature.getInstance(f62898a);
            }
            signature.initVerify(publicKey);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (GeneralSecurityException e10) {
            b.b(f62900c, "check sign exception: " + e10.getMessage());
            return false;
        } catch (Exception e11) {
            b.b(f62900c, "exception : " + e11.getMessage());
            return false;
        }
    }
}
