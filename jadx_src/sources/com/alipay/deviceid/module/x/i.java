package com.alipay.deviceid.module.x;

import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: SecurityUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f38343a = new String("idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#");

    public static String a() {
        String str = new String();
        for (int i10 = 0; i10 < f38343a.length() - 1; i10 += 4) {
            str = str + f38343a.charAt(i10);
        }
        return str;
    }

    public static String a(String str, String str2) {
        try {
            try {
                PBEKeySpec pBEKeySpecA = a(str);
                byte[] bytes = str2.getBytes();
                SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(pBEKeySpecA).getEncoded(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
                Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
                cipher.init(1, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
                byte[] salt = pBEKeySpecA.getSalt();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(salt.length + cipher.getOutputSize(bytes.length));
                byteBufferAllocate.put(salt);
                cipher.doFinal(ByteBuffer.wrap(bytes), byteBufferAllocate);
                return b(byteBufferAllocate.array());
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            byte[] bArrA = a(str.getBytes());
            byte[] bytes2 = str2.getBytes();
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArrA, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            Cipher cipher2 = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
            cipher2.init(1, secretKeySpec2, new IvParameterSpec(new byte[cipher2.getBlockSize()]));
            return b(cipher2.doFinal(bytes2));
        }
    }

    private static PBEKeySpec a(String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName(new String(g.a("amF2YS5zZWN1cml0eS5TZWN1cmVSYW5kb20=")));
        Object objNewInstance = cls.newInstance();
        byte[] bArr = new byte[16];
        Method method = cls.getMethod("nextBytes", bArr.getClass());
        method.setAccessible(true);
        method.invoke(objNewInstance, bArr);
        return new PBEKeySpec(str.toCharArray(), bArr, 10, 128);
    }

    private static byte[] a(byte[] bArr) throws IllegalAccessException, NoSuchMethodException, NoSuchAlgorithmException, NoSuchProviderException, InvocationTargetException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
        Method method = SecureRandom.class.getMethod("setSeed", bArr.getClass());
        method.setAccessible(true);
        method.invoke(secureRandom, bArr);
        keyGenerator.init(128, secureRandom);
        return keyGenerator.generateKey().getEncoded();
    }

    public static String b(String str, String str2) {
        byte[] bArrDoFinal;
        try {
            try {
                PBEKeySpec pBEKeySpecA = a(str);
                byte[] bArrB = b(str2);
                if (bArrB.length <= 16) {
                    bArrDoFinal = null;
                } else {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(pBEKeySpecA.getPassword(), Arrays.copyOf(bArrB, 16), 10, 128)).getEncoded(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
                    Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
                    cipher.init(2, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
                    bArrDoFinal = cipher.doFinal(bArrB, 16, bArrB.length - 16);
                }
                if (bArrDoFinal != null) {
                    return new String(bArrDoFinal);
                }
                throw new Exception();
            } catch (Exception unused) {
                byte[] bArrA = a(str.getBytes());
                byte[] bArrB2 = b(str2);
                SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArrA, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
                Cipher cipher2 = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
                cipher2.init(2, secretKeySpec2, new IvParameterSpec(new byte[cipher2.getBlockSize()]));
                return new String(cipher2.doFinal(bArrB2));
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private static String b(byte[] bArr) {
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

    private static byte[] b(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = Integer.valueOf(str.substring(i11, i11 + 2), 16).byteValue();
        }
        return bArr;
    }
}
