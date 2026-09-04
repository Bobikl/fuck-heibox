package com.igexin.push.util;

import android.text.TextUtils;
import android.util.Base64;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.security.MessageDigest;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class EncryptUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f64033a = "com.igexin.push.util.EncryptUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f64034b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f64035c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static byte[] f64036d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f64037e = null;
    public static String errorMsg = "";
    public static String rsaKeyId = "69d747c4b9f641baf4004be4297e9f3b";
    public static String rsaPublicKey = "MHwwDQYJKoZIhvcNAQEBBQADawAwaAJhAJp1rROuvBF7sBSnvLaesj2iFhMcY8aXyLvpnNLKs2wjL3JmEnyr++SlVa35liUlzi83tnAFkn3A9GB7pHBNzawyUkBh8WUhq5bnFIkk2RaDa6+5MpG84DEv52p7RR+aWwIDAQAB";

    static {
        try {
            f64036d = initSocketAESKey();
            byte[] bArrInitHttpAESKey = initHttpAESKey();
            f64037e = bArrInitHttpAESKey;
            f64034b = (f64036d == null || bArrInitHttpAESKey == null || getRSAKeyId() == null) ? false : true;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f64033a + "|load key error = " + th2.toString(), new Object[0]);
            f64034b = false;
            errorMsg = th2.getMessage();
        }
        if (f64034b) {
            com.igexin.a.a.c.b.a(f64033a + "|load  Encrypt key success ~~~~~~~", new Object[0]);
            return;
        }
        com.igexin.a.a.c.b.a(f64033a + "|load key error ++++++++", new Object[0]);
        if (TextUtils.isEmpty(errorMsg)) {
            errorMsg = "value = null, normal error";
        }
    }

    public static byte[] aesDecHttp(byte[] bArr, byte[] bArr2) {
        try {
            return c.b("AES/CFB/NoPadding", new SecretKeySpec(f64037e, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(bArr2), bArr);
        } catch (Throwable unused) {
            com.igexin.a.a.c.b.a(f64033a + "| httpId decrypt  http data  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    public static byte[] aesDecSocket(byte[] bArr, byte[] bArr2) {
        try {
            return c.b("AES/CFB/NoPadding", new SecretKeySpec(f64036d, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(bArr2), bArr);
        } catch (Throwable unused) {
            com.igexin.a.a.c.b.a(f64033a + "| sockeId encrypt  http data  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    public static byte[] aesEncHttp(byte[] bArr, byte[] bArr2) {
        try {
            return c.a("AES/CFB/NoPadding", new SecretKeySpec(f64037e, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(bArr2), bArr);
        } catch (Throwable unused) {
            com.igexin.a.a.c.b.a(f64033a + "| httpId encrypt  http data  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    public static byte[] aesEncSocket(byte[] bArr, byte[] bArr2) {
        try {
            return c.a("AES/CFB/NoPadding", new SecretKeySpec(f64036d, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(bArr2), bArr);
        } catch (Throwable unused) {
            com.igexin.a.a.c.b.a(f64033a + "| sockeId encrypt  http data  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    public static byte[] altAesDecSocket(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bytes = rsaKeyId.getBytes();
            byte[] bArr3 = new byte[bytes.length];
            for (int i10 = 0; i10 < bytes.length; i10++) {
                bArr3[i10] = (byte) (~(bytes[(bytes.length - i10) - 1] & 255));
            }
            return c.b("AES/CFB/NoPadding", new SecretKeySpec(md5(bArr3), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(md5(bArr2)), bArr);
        } catch (Throwable th2) {
            String str = f64033a;
            com.igexin.a.a.c.b.c(str, th2.getMessage());
            com.igexin.a.a.c.b.a(str + "| altAesDecSocket  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    public static byte[] altAesEncSocket(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bytes = rsaKeyId.getBytes();
            byte[] bArr3 = new byte[bytes.length];
            for (int i10 = 0; i10 < bytes.length; i10++) {
                bArr3[i10] = (byte) (~(bytes[(bytes.length - i10) - 1] & 255));
            }
            return c.a("AES/CFB/NoPadding", new SecretKeySpec(md5(bArr3), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(md5(bArr2)), bArr);
        } catch (Throwable unused) {
            com.igexin.a.a.c.b.a(f64033a + "| altAesEncSocket  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    public static byte[] getBytesEncrypted(byte[] bArr) {
        return com.igexin.a.a.a.a.d(bArr, com.igexin.push.core.d.C);
    }

    public static byte[] getHttpAESKey() {
        try {
            byte[] bArr = f64037e;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return c.a("RSA/NONE/OAEPWithSHA1AndMGF1Padding", c.a(n5.d.f132016a, rsaPublicKey), bArr2);
        } catch (Throwable unused) {
            com.igexin.a.a.c.b.a(f64033a + "| getHttpAESKey  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    public static String getHttpGTCV() {
        byte[] httpAESKey = getHttpAESKey();
        byte[] bytes = p.a(16).getBytes();
        byte[] bArr = new byte[bytes.length + httpAESKey.length];
        com.igexin.a.a.b.e.a(httpAESKey, 0, bArr, com.igexin.a.a.b.e.a(bytes, 0, bArr, 0, bytes.length), httpAESKey.length);
        return Base64.encodeToString(bArr, 2);
    }

    public static String getHttpSignature(String str, byte[] bArr) throws Exception {
        byte[] bytes = str.getBytes();
        byte[] bArr2 = new byte[bytes.length + bArr.length];
        int iA = com.igexin.a.a.b.e.a(bytes, 0, bArr2, 0, bytes.length);
        if (bArr.length > 0) {
            com.igexin.a.a.b.e.a(bArr, 0, bArr2, iA, bArr.length);
        }
        return Base64.encodeToString(sha1(bArr2), 2);
    }

    public static byte[] getIV(byte[] bArr) {
        return md5(bArr);
    }

    public static int getPacketId() {
        int i10 = f64035c;
        f64035c = i10 + 1;
        return i10;
    }

    public static byte[] getRSAKeyId() {
        return rsaKeyId.getBytes();
    }

    public static byte[] getSocketAESKey() {
        if (!f64034b) {
            return new byte[0];
        }
        try {
            byte[] bArr = f64036d;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return c.a("RSA/NONE/OAEPWithSHA1AndMGF1Padding", c.a(n5.d.f132016a, rsaPublicKey), bArr2);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f64033a + "| getSocketAESKey  fail ~~~~~~~" + th2.getMessage(), new Object[0]);
            return new byte[0];
        }
    }

    public static byte[] getSocketSignature(com.igexin.push.d.c.a aVar, int i10, int i11) {
        byte[] bArr = new byte[aVar.f63812a + 11];
        int iA = com.igexin.a.a.b.e.a(i10, bArr, 0);
        int iA2 = iA + com.igexin.a.a.b.e.a(i11, bArr, iA);
        int iB = iA2 + com.igexin.a.a.b.e.b((short) aVar.f63812a, bArr, iA2);
        com.igexin.a.a.b.e.a(aVar.f63816e, 0, bArr, iB + com.igexin.a.a.b.e.c(aVar.f63813b, bArr, iB), aVar.f63812a);
        return sha1(bArr);
    }

    public static byte[] initHttpAESKey() {
        try {
            return c.a(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, 128).getEncoded();
        } catch (Throwable unused) {
            com.igexin.a.a.c.b.a(f64033a + "|generate  http key fail ~~~~~~~", new Object[0]);
            return null;
        }
    }

    public static byte[] initSocketAESKey() {
        try {
            return c.a(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, 128).getEncoded();
        } catch (Throwable unused) {
            com.igexin.a.a.c.b.a(f64033a + "|generate  socket key fail ~~~~~~~", new Object[0]);
            return null;
        }
    }

    public static boolean isLoadSuccess() {
        return f64034b;
    }

    public static byte[] md5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean reset() {
        try {
            f64036d = initSocketAESKey();
            byte[] bArrInitHttpAESKey = initHttpAESKey();
            f64037e = bArrInitHttpAESKey;
            f64034b = (f64036d == null || bArrInitHttpAESKey == null || getRSAKeyId() == null) ? false : true;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f64033a + "|load key error = " + th2.toString(), new Object[0]);
            f64034b = false;
        }
        if (f64034b) {
            com.igexin.a.a.c.b.a(f64033a + "|load key success ~~~~~~~", new Object[0]);
        } else {
            com.igexin.a.a.c.b.a(f64033a + "|load key error ++++++++", new Object[0]);
        }
        return f64034b;
    }

    public static byte[] rsaEnc(byte[] bArr) {
        return new byte[0];
    }

    public static byte[] sha1(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-1").digest(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
