package com.huawei.hms.opendevice;

import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HEX;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: SHACoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n {
    public static String a(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (TextUtils.isEmpty(str2)) {
                str2 = "SHA-256";
            }
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes);
            return HEX.encodeHexString(messageDigest.digest(), false);
        } catch (UnsupportedEncodingException unused) {
            HMSLog.e("SHACoder", "trans failed .");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            HMSLog.e("SHACoder", "encrypt failed .");
            return null;
        }
    }
}
