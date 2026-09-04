package com.efs.sdk.base.core.util.b;

import com.efs.sdk.base.core.util.Log;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final IvParameterSpec f42574a = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    private static SecretKeySpec a(String str) {
        return new SecretKeySpec(str.getBytes(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
    }

    public static byte[] a(String str, String str2) {
        try {
            return b(str.getBytes("UTF-8"), str2);
        } catch (UnsupportedEncodingException e10) {
            Log.e("efs.base", "getBytes error", e10);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, String str) {
        try {
            SecretKeySpec secretKeySpecA = a(str);
            Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
            cipher.init(2, secretKeySpecA, f42574a);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
            Log.e("efs.base", "aes decrypt error", e10);
            return null;
        }
    }

    public static byte[] b(byte[] bArr, String str) {
        try {
            SecretKeySpec secretKeySpecA = a(str);
            Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
            cipher.init(1, secretKeySpecA, f42574a);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
            Log.e("efs.base", "aes encrypt error", e10);
            return null;
        }
    }
}
