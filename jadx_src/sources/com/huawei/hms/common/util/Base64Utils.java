package com.huawei.hms.common.util;

import android.util.Base64;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes7.dex */
public final class Base64Utils {
    public static byte[] decode(String str) {
        byte[] bArr = new byte[0];
        if (str != null) {
            try {
                return Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                HMSLog.e("Base64Utils", "decode failed : " + e10.getMessage());
            }
        }
        return bArr;
    }

    public static byte[] decodeUrlSafe(String str) {
        byte[] bArr = new byte[0];
        if (str != null) {
            try {
                return Base64.decode(str, 10);
            } catch (IllegalArgumentException e10) {
                HMSLog.e("Base64Utils", "decodeUrlSafe failed : " + e10.getMessage());
            }
        }
        return bArr;
    }

    public static byte[] decodeUrlSafeNoPadding(String str) {
        byte[] bArr = new byte[0];
        if (str != null) {
            try {
                return Base64.decode(str, 11);
            } catch (IllegalArgumentException e10) {
                HMSLog.e("Base64Utils", "decodeUrlSafeNoPadding failed : " + e10.getMessage());
            }
        }
        return bArr;
    }

    public static String encode(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 0);
        }
        return null;
    }

    public static String encodeUrlSafe(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 10);
        }
        return null;
    }

    public static String encodeUrlSafeNoPadding(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 11);
        }
        return null;
    }
}
