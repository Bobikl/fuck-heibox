package com.igexin.a.a.c;

import android.text.TextUtils;
import com.igexin.push.core.d;
import com.igexin.push.util.EncryptUtils;
import com.igexin.push.util.h;
import com.igexin.push.util.o;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class a {
    private static byte a(char c10) {
        return (byte) "0123456789ABCDEF".indexOf(c10);
    }

    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() < 2) {
                sb2.append(0);
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static CipherOutputStream a(File file, SecretKeySpec secretKeySpec) throws Exception {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        byte[] bArr = new byte[16];
        if (randomAccessFile.length() == 0) {
            randomAccessFile.write(b(a(secretKeySpec.getEncoded())));
            new SecureRandom().nextBytes(bArr);
            randomAccessFile.write(bArr);
        } else {
            if (randomAccessFile.length() < 144) {
                throw new IllegalArgumentException("Invalid file length (need 2 blocks for iv and data)");
            }
            if (randomAccessFile.length() % 16 != 0) {
                a(randomAccessFile);
            }
            randomAccessFile.seek(randomAccessFile.length() - 16);
            randomAccessFile.read(bArr);
        }
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
        return new CipherOutputStream(new FileOutputStream(randomAccessFile.getFD()), cipher);
    }

    public static void a() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        keyGenerator.init(128);
        d.au = keyGenerator.generateKey().getEncoded();
        o.b(d.f63671e, "logkey2", a(EncryptUtils.getBytesEncrypted(d.au)), new String[0]);
    }

    public static void a(RandomAccessFile randomAccessFile) throws Exception {
        long length = (int) (randomAccessFile.length() % 16);
        if (length >= 16 || length <= 0) {
            return;
        }
        randomAccessFile.setLength(randomAccessFile.length() - length);
    }

    public static byte[] a(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (a(charArray[i11 + 1]) | (a(charArray[i11]) << 4));
        }
        return bArr;
    }

    public static byte[] b() {
        if (d.au == null) {
            String str = (String) o.c(d.f63671e, "logkey2", "", new String[0]);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            d.au = com.igexin.a.a.a.a.c(a(str), d.C);
        }
        return d.au;
    }

    private static byte[] b(String str) throws Exception {
        RSAPublicKey rSAPublicKeyC = c("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCzbMQ22qV6umuPXYWXEOGdlpJR\nBWMP68/ArS7XG8+7GmRbWMW1HOMLOOdwuIfPFp9QiwOshG0mYXlm1ecQ/fCXhRMW\nfh+OMCoBdl7vnCpoDYPmjYQBkm9fRW6oej33UhZtlnTZjECAsyC2Eybha7jg3Lft\ngYVnwaPShTmv5+Z9SQIDAQAB");
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");
        cipher.init(1, rSAPublicKeyC);
        return cipher.doFinal(str.getBytes("UTF-8"));
    }

    private static RSAPublicKey c(String str) throws Exception {
        return (RSAPublicKey) KeyFactory.getInstance(n5.d.f132016a).generatePublic(new X509EncodedKeySpec(h.a(str, 0)));
    }
}
