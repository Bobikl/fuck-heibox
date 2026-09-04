package com.umeng.socialize.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class UMAuthUtils {
    public static String decrypt(String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return "";
        }
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        byte[] bytes = str2.getBytes();
        int length = 32;
        if (bytes.length < 16) {
            bytes = new byte[16];
            Arrays.fill(bytes, (byte) 1);
            System.arraycopy(bytes, 0, str2.getBytes(), 0, str2.length());
            length = 16;
        } else if (bytes.length <= 32) {
            length = bytes.length % 8 != 0 ? bytes.length - (bytes.length % 8) : bytes.length;
        }
        cipher.init(2, new SecretKeySpec(bytes, 0, length, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(Arrays.copyOfRange(bytes, 0, 16)));
        return new String(cipher.doFinal(Base64.decode(str, 0)));
    }

    public static String encrypt(String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return "";
        }
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        byte[] bytes = str2.getBytes();
        int length = 32;
        if (bytes.length < 16) {
            bytes = new byte[16];
            Arrays.fill(bytes, (byte) 1);
            System.arraycopy(bytes, 0, str2.getBytes(), 0, str2.length());
            length = 16;
        } else if (bytes.length <= 32) {
            length = bytes.length % 8 != 0 ? bytes.length - (bytes.length % 8) : bytes.length;
        }
        cipher.init(1, new SecretKeySpec(bytes, 0, length, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(Arrays.copyOfRange(bytes, 0, 16)));
        return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
    }
}
