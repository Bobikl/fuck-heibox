package n5;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f132017a = "DESede/CBC/PKCS5Padding";

    public static String a(String str, String str2, String str3) {
        try {
            return new String(b(str, a.d(str2), str3));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(String str, byte[] bArr, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher cipher = Cipher.getInstance(f132017a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(c.a(cipher, str2)));
            return cipher.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(String str, String str2, String str3) {
        try {
            return a.b(d(str, str2.getBytes(), str3));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] d(String str, byte[] bArr, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher cipher = Cipher.getInstance(f132017a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(c.a(cipher, str2)));
            return cipher.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
