package com.xiaomi.push;

import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f107242a = {100, com.google.common.base.a.A, 84, 114, 72, 0, 4, 97, 73, 97, 2, org.apache.tools.tar.c.J, 84, 102, com.google.common.base.a.f56668u, 32};

    private static Cipher a(byte[] bArr, int i10) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f107242a);
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(i10, secretKeySpec, ivParameterSpec);
        return cipher;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        return a(bArr, 2).doFinal(bArr2);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        return a(bArr, 1).doFinal(bArr2);
    }
}
