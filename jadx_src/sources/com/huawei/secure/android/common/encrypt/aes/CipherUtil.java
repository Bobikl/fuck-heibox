package com.huawei.secure.android.common.encrypt.aes;

import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class CipherUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62836a = "CipherUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62837b = "AES/GCM/NoPadding";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62838c = "AES/CBC/PKCS5Padding";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62839d = "AES";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f62840e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f62841f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f62842g = 12;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f62843h = 16;

    private static int a(Cipher cipher, byte[] bArr) {
        if (cipher == null || bArr == null) {
            return -1;
        }
        return cipher.getOutputSize(bArr.length);
    }

    private static Cipher a(byte[] bArr, byte[] bArr2, int i10) {
        return a(bArr, bArr2, i10, "AES/CBC/PKCS5Padding");
    }

    private static Cipher a(byte[] bArr, byte[] bArr2, int i10, String str) {
        if (bArr == null || bArr.length < 16 || bArr2 == null || bArr2.length < 12 || !AesGcm.isBuildVersionHigherThan19()) {
            b.b(f62836a, "gcm encrypt param is not right");
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(i10, secretKeySpec, f62837b.equals(str) ? AesGcm.getGcmAlgorithmParams(bArr2) : new IvParameterSpec(bArr2));
            return cipher;
        } catch (GeneralSecurityException e10) {
            b.b(f62836a, "GCM encrypt data error" + e10.getMessage());
            return null;
        }
    }

    private static Cipher b(byte[] bArr, byte[] bArr2, int i10) {
        return a(bArr, bArr2, i10, f62837b);
    }

    public static Cipher getAesCbcDecryptCipher(byte[] bArr, Cipher cipher) {
        return getAesCbcDecryptCipher(bArr, cipher.getIV());
    }

    public static Cipher getAesCbcDecryptCipher(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2, 2);
    }

    public static Cipher getAesCbcEncryptCipher(byte[] bArr) {
        return getAesCbcEncryptCipher(bArr, EncryptUtil.generateSecureRandom(16));
    }

    public static Cipher getAesCbcEncryptCipher(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2, 1);
    }

    public static int getAesCbcEncryptContentLen(byte[] bArr, byte[] bArr2) {
        return getAesCbcEncryptContentLen(bArr, bArr2, EncryptUtil.generateSecureRandom(16));
    }

    public static int getAesCbcEncryptContentLen(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return a(getAesCbcEncryptCipher(bArr2, bArr3), bArr);
    }

    public static Cipher getAesGcmDecryptCipher(byte[] bArr, Cipher cipher) {
        return getAesGcmDecryptCipher(bArr, cipher.getIV());
    }

    public static Cipher getAesGcmDecryptCipher(byte[] bArr, byte[] bArr2) {
        return b(bArr, bArr2, 2);
    }

    public static Cipher getAesGcmEncryptCipher(byte[] bArr) {
        byte[] bArrGenerateSecureRandom = EncryptUtil.generateSecureRandom(12);
        b.a(f62836a, "getEncryptCipher: iv is : " + HexUtil.byteArray2HexStr(bArrGenerateSecureRandom));
        return getAesGcmEncryptCipher(bArr, bArrGenerateSecureRandom);
    }

    public static Cipher getAesGcmEncryptCipher(byte[] bArr, byte[] bArr2) {
        return b(bArr, bArr2, 1);
    }

    public static int getAesGcmEncryptContentLen(byte[] bArr, byte[] bArr2) {
        return getAesGcmEncryptContentLen(bArr, bArr2, EncryptUtil.generateSecureRandom(12));
    }

    public static int getAesGcmEncryptContentLen(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return a(getAesGcmEncryptCipher(bArr2, bArr3), bArr);
    }

    public static int getContent(Cipher cipher, byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        if (cipher != null && bArr != null) {
            return cipher.doFinal(bArr, i10, i11, bArr2, i12);
        }
        b.b(f62836a, "getEncryptCOntent: cipher is null or content is null");
        return -1;
    }

    public static int getContent(Cipher cipher, byte[] bArr, byte[] bArr2) {
        if (cipher == null || bArr == null) {
            b.b(f62836a, "getEncryptCOntent: cipher is null or content is null");
            return -1;
        }
        try {
            return cipher.doFinal(bArr, 0, bArr.length, bArr2);
        } catch (BadPaddingException unused) {
            b.b(f62836a, "getContent: BadPaddingException");
            return -1;
        } catch (IllegalBlockSizeException unused2) {
            b.b(f62836a, "getContent: IllegalBlockSizeException");
            return -1;
        } catch (ShortBufferException unused3) {
            b.b(f62836a, "getContent: ShortBufferException");
            return -1;
        }
    }

    public static byte[] getContent(Cipher cipher, byte[] bArr) {
        if (cipher == null || bArr == null) {
            b.b(f62836a, "getEncryptCOntent: cipher is null or content is null");
            return new byte[0];
        }
        try {
            return cipher.doFinal(bArr, 0, bArr.length);
        } catch (BadPaddingException unused) {
            b.b(f62836a, "getContent: BadPaddingException");
            return new byte[0];
        } catch (IllegalBlockSizeException unused2) {
            b.b(f62836a, "getContent: IllegalBlockSizeException");
            return new byte[0];
        }
    }
}
