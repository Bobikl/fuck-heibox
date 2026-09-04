package com.umeng.message.proguard;

import android.text.TextUtils;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class ax {
    public static String a(String str, String str2, byte[] bArr) throws Exception {
        if (TextUtils.isEmpty(str2) || bArr == null || TextUtils.isEmpty(str)) {
            return "";
        }
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(1, new SecretKeySpec(str2.getBytes(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(bArr));
        return as.a(cipher.doFinal(str.getBytes()));
    }

    public static String b(String str, String str2, byte[] bArr) throws Exception {
        if (TextUtils.isEmpty(str2) || bArr == null || TextUtils.isEmpty(str)) {
            return "";
        }
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(2, new SecretKeySpec(str2.getBytes(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(bArr));
        return new String(cipher.doFinal(as.a(str)));
    }
}
