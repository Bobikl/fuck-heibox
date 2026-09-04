package k5;

import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static String a(String str) {
        byte[] bArrF;
        try {
            bArrF = f(d(), str.getBytes());
        } catch (Exception unused) {
            bArrF = null;
        }
        if (bArrF != null) {
            return b(bArrF);
        }
        return null;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b10 : bArr) {
            c(stringBuffer, b10);
        }
        return stringBuffer.toString();
    }

    public static void c(StringBuffer stringBuffer, byte b10) {
        stringBuffer.append("0123456789ABCDEF".charAt((b10 >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b10 & 15));
    }

    public static byte[] d() throws Exception {
        return e.b(new byte[]{33, org.apache.tools.tar.c.P, -50, -89, -84, -114, 80, 99, 10, Utf8.REPLACEMENT_BYTE, com.google.common.base.a.f56673z, -65, -11, com.google.common.base.a.H, 101, -118});
    }

    public static byte[] e(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = Integer.valueOf(str.substring(i11, i11 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(1, secretKeySpec, new IvParameterSpec(h()));
        return cipher.doFinal(bArr2);
    }

    public static String g(String str) {
        try {
            return new String(i(d(), e(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] h() {
        try {
            byte[] bArrA = b.a("IUQSvE6r1TfFPdPEjfklLw==".getBytes("UTF-8"), 2);
            if (bArrA != null) {
                return e.b(bArrA);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(2, secretKeySpec, new IvParameterSpec(h()));
        return cipher.doFinal(bArr2);
    }
}
