package com.umeng.commonsdk.statistics.common;

import android.util.Base64;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class DataHelper {
    public static long ENVELOPE_ENTITY_RAW_LENGTH_MAX = 2097152;
    public static long ENVELOPE_EXTRA_LENGTH = 614400;
    public static long ENVELOPE_LENGTH_MAX = 204800;
    private static String UMENG_PLUS = "umeng+0123456789";

    public static String assembleStatelessURL(String str) {
        return "https://" + str;
    }

    public static String assembleURL(String str) {
        return "https://" + str;
    }

    static String bytes2Hex(byte[] bArr) {
        String str = "";
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                str = str + "0";
            }
            str = str + hexString;
        }
        return str;
    }

    public static String convertExceptionToString(Throwable th2) {
        String string = null;
        if (th2 == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th2.printStackTrace(printWriter);
            for (Throwable cause = th2.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            string = stringWriter.toString();
            printWriter.close();
            stringWriter.close();
            return string;
        } catch (Exception unused) {
            return string;
        }
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, new SecretKeySpec(bArr2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(UMUtils.genIv()));
        return cipher.doFinal(bArr);
    }

    public static String decryptEx(String str) {
        try {
            return new String(decrypt(Base64.decode(str.getBytes(), 0), UMENG_PLUS.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, new SecretKeySpec(bArr2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(UMUtils.genIv()));
        return cipher.doFinal(bArr);
    }

    public static String encryptBySHA1(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(bytes);
            return bytes2Hex(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String encryptEx(String str) {
        try {
            return Base64.encodeToString(encrypt(str.getBytes(), UMENG_PLUS.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] hash(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean largeThanMaxSize(long j10, long j11) {
        return j10 > j11;
    }

    public static int random(int i10, String str) {
        if (new Random().nextFloat() < 0.001d) {
            int i11 = 0;
            if (str == null) {
                MLog.e("--->", "null signature..");
            }
            try {
                i11 = Integer.parseInt(str.substring(9, 11), 16);
            } catch (Exception unused) {
            }
            return (i11 | 128) * 1000;
        }
        int iNextInt = new Random().nextInt(i10);
        if (iNextInt > 255000 || iNextInt < 128000) {
            return iNextInt;
        }
        return 127000;
    }

    public static byte[] reverseHexString(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length % 2 != 0) {
            return null;
        }
        byte[] bArr = new byte[length / 2];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 2;
            bArr[i10 / 2] = (byte) Integer.valueOf(str.substring(i10, i11), 16).intValue();
            i10 = i11;
        }
        return bArr;
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(b10)));
        }
        return stringBuffer.toString().toLowerCase(Locale.US);
    }
}
