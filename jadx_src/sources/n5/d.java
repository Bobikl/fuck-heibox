package n5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f132016a = "RSA";

    /* JADX WARN: Code duplicated, block: B:36:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0052: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:29:0x0052 */
    public static byte[] a(String str, String str2) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        byte[] byteArray = null;
        byteArray = null;
        byteArray = null;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            try {
                try {
                    PublicKey publicKeyB = b(f132016a, str2);
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.init(1, publicKeyB);
                    byte[] bytes = str.getBytes("UTF-8");
                    int blockSize = cipher.getBlockSize();
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    for (int i10 = 0; i10 < bytes.length; i10 += blockSize) {
                        try {
                            byteArrayOutputStream.write(cipher.doFinal(bytes, i10, bytes.length - i10 < blockSize ? bytes.length - i10 : blockSize));
                        } catch (Exception e10) {
                            e = e10;
                            z5.e.d(e);
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            return byteArray;
                        }
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream3 = byteArrayOutputStream2;
                    if (byteArrayOutputStream3 != null) {
                        try {
                            byteArrayOutputStream3.close();
                        } catch (IOException e11) {
                            z5.e.d(e11);
                        }
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                if (byteArrayOutputStream3 != null) {
                    byteArrayOutputStream3.close();
                }
                throw th;
            }
        } catch (IOException e13) {
            z5.e.d(e13);
        }
        return byteArray;
    }

    public static PublicKey b(String str, String str2) throws Exception {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(a.d(str2)));
    }
}
