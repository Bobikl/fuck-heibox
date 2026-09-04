package com.tencent.open.utils;

import android.util.Base64;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import com.tencent.open.log.SLog;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f101168a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, String str2, byte[] bArr) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e10) {
            SLog.e("DESUtils", "encryptAES", e10);
            return null;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f101168a;
            cArr[i11 + 1] = cArr2[b10 & 15];
            cArr[i11] = cArr2[((byte) (b10 >>> 4)) & 15];
        }
        return new String(cArr);
    }

    public static byte[] a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception e10) {
            SLog.e("DESUtils", "encryptSha", e10);
            return null;
        }
    }
}
