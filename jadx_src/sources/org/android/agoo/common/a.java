package org.android.agoo.common;

import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.tools.tar.c;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f132811a = {82, com.google.common.base.a.f56673z, c.H, 44, -16, 124, -40, -114, -87, -40, 37, com.google.common.base.a.A, -56, com.google.common.base.a.A, -33, c.N};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal<Cipher> f132812b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AlgorithmParameterSpec f132813c = new IvParameterSpec(f132811a);

    private static final Cipher a() {
        Cipher cipher = f132812b.get();
        if (cipher == null) {
            try {
                cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
                f132812b.set(cipher);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException("get Chipher error:" + e10.getMessage(), e10);
            } catch (NoSuchPaddingException e11) {
                throw new RuntimeException("get Chipher error:" + e11.getMessage(), e11);
            }
        }
        return cipher;
    }

    private static final Cipher a(SecretKeySpec secretKeySpec, byte[] bArr, int i10) {
        Cipher cipherA = a();
        try {
            cipherA.init(i10, secretKeySpec, new IvParameterSpec(bArr));
            return cipherA;
        } catch (IllegalArgumentException e10) {
            throw new RuntimeException("init Chipher error:" + e10.getMessage(), e10);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new RuntimeException("init Chipher error:" + e11.getMessage(), e11);
        } catch (InvalidKeyException e12) {
            throw new RuntimeException("init Chipher error:" + e12.getMessage(), e12);
        }
    }

    public static final byte[] a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable th2) {
            throw new RuntimeException("md5 value Throwable", th2);
        }
    }

    public static final byte[] a(byte[] bArr, SecretKeySpec secretKeySpec, byte[] bArr2) throws IllegalArgumentException {
        try {
            return a(secretKeySpec, bArr2, 2).doFinal(bArr);
        } catch (BadPaddingException e10) {
            throw new IllegalArgumentException("AES decrypt error:" + e10.getMessage(), e10);
        } catch (IllegalBlockSizeException e11) {
            throw new IllegalArgumentException("AES decrypt error:" + e11.getMessage(), e11);
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA1");
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            return mac.doFinal(bArr2);
        } catch (Throwable th2) {
            throw new RuntimeException("HmacSHA1 Throwable", th2);
        }
    }
}
