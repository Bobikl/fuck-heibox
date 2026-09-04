package d6;

import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f108152a = "idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#";

    public static String a() {
        String str = new String();
        for (int i10 = 0; i10 < f108152a.length() - 1; i10 += 4) {
            str = str + f108152a.charAt(i10);
        }
        return str;
    }

    public static String b(String str, String str2) {
        try {
            PBEKeySpec pBEKeySpecD = d(str);
            byte[] bytes = str2.getBytes();
            byte[] bArrF = f();
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(pBEKeySpecD).getEncoded(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArrF));
            byte[] salt = pBEKeySpecD.getSalt();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(salt.length + cipher.getOutputSize(bytes.length));
            byteBufferAllocate.put(salt);
            cipher.doFinal(ByteBuffer.wrap(bytes), byteBufferAllocate);
            return c(byteBufferAllocate.array());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b10 : bArr) {
            stringBuffer.append("0123456789ABCDEF".charAt((b10 >> 4) & 15));
            stringBuffer.append("0123456789ABCDEF".charAt(b10 & 15));
        }
        return stringBuffer.toString();
    }

    public static PBEKeySpec d(String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName(new String(a.a("amF2YS5zZWN1cml0eS5TZWN1cmVSYW5kb20=")));
        Object objNewInstance = cls.newInstance();
        byte[] bArr = new byte[16];
        Method method = cls.getMethod("nextBytes", bArr.getClass());
        method.setAccessible(true);
        method.invoke(objNewInstance, bArr);
        return new PBEKeySpec(str.toCharArray(), bArr, 10, 128);
    }

    public static String e(String str, String str2) {
        byte[] bArrDoFinal;
        try {
            PBEKeySpec pBEKeySpecD = d(str);
            int length = str2.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = Integer.valueOf(str2.substring(i11, i11 + 2), 16).byteValue();
            }
            byte[] bArrF = f();
            if (length <= 16) {
                bArrDoFinal = null;
            } else {
                SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(pBEKeySpecD.getPassword(), Arrays.copyOf(bArr, 16), 10, 128)).getEncoded(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
                Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArrF));
                bArrDoFinal = cipher.doFinal(bArr, 16, length - 16);
            }
            if (bArrDoFinal == null) {
                throw new Exception();
            }
            String str3 = new String(bArrDoFinal);
            if (e6.a.g(str3)) {
                return str3;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public static byte[] f() {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < 48; i10 += 2) {
                sb2.append("AsAgAtA5A6AdAgABABACADAfAsAdAfAsAgAaAgA3A5A6=8=0".charAt(i10));
            }
            return a.a(sb2.toString());
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
