package cn.fly.verify;

import android.util.Base64;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class w {
    public static String a(byte[] bArr, String str, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            return Base64.encodeToString(cipher.doFinal(str.getBytes("utf-8")), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static String b(byte[] bArr, String str, byte[] bArr2) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return new String(cipher.doFinal(bArrDecode), "utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
