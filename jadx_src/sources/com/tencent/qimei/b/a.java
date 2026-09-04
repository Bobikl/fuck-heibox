package com.tencent.qimei.b;

import android.util.Base64;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import com.tencent.qimei.beaconid.U;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: AESUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static String a(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        for (int length = sb2.length(); length < 16; length++) {
            sb2.append("0");
        }
        return sb2.toString().substring(0, 16);
    }

    public static String a(String str, String str2) throws Exception {
        return new String(a(Base64.decode(str, 2), str2.getBytes("UTF-8")), "UTF-8").trim();
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) throws Exception {
        return a(bArr, bArr2, 2);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, int i10) throws Exception {
        byte[] bArrB = U.b(i10, bArr2, bArr2, bArr);
        if (bArrB != null) {
            return bArrB;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(i10, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    public static String b(String str, String str2) throws Exception {
        return Base64.encodeToString(b(str.getBytes("UTF-8"), str2.getBytes("UTF-8")), 2);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) throws Exception {
        return a(bArr, bArr2, 1);
    }
}
