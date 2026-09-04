package com.huawei.secure.android.common.encrypt.hash;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PBKDF2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62853a = "PBKDF2";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62854b = "PBKDF2WithHmacSHA1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62855c = "PBKDF2WithHmacSHA256";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62856d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f62857e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f62858f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f62859g = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f62860h = 10000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f62861i = 1000;

    private static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        int length = bArr.length ^ bArr2.length;
        for (int i10 = 0; i10 < bArr.length && i10 < bArr2.length; i10++) {
            length |= bArr[i10] ^ bArr2[i10];
        }
        return length == 0;
    }

    private static byte[] a(char[] cArr, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return (z10 ? SecretKeyFactory.getInstance(f62855c) : SecretKeyFactory.getInstance(f62854b)).generateSecret(new PBEKeySpec(cArr, bArr, i10, i11)).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e10) {
            b.b(f62853a, "pbkdf exception : " + e10.getMessage());
            return new byte[0];
        }
    }

    public static byte[] pbkdf2(char[] cArr, byte[] bArr, int i10, int i11) {
        return a(cArr, bArr, i10, i11, false);
    }

    @Deprecated
    public static String pbkdf2Encrypt(String str) {
        return pbkdf2Encrypt(str, 10000);
    }

    @Deprecated
    public static String pbkdf2Encrypt(String str, int i10) {
        return pbkdf2Encrypt(str, EncryptUtil.generateSecureRandom(8), i10, 32);
    }

    @Deprecated
    public static String pbkdf2Encrypt(String str, byte[] bArr, int i10, int i11) {
        if (TextUtils.isEmpty(str)) {
            b.b(f62853a, "pwd is null.");
            return "";
        }
        if (i10 < 1000) {
            b.b(f62853a, "iterations times is not enough.");
            return "";
        }
        if (bArr == null || bArr.length < 8) {
            b.b(f62853a, "salt parameter is null or length is not enough");
            return "";
        }
        if (i11 < 32) {
            b.b(f62853a, "cipherLen length is not enough");
            return "";
        }
        return HexUtil.byteArray2HexStr(bArr) + HexUtil.byteArray2HexStr(pbkdf2(str.toCharArray(), bArr, i10, i11 * 8));
    }

    public static String pbkdf2EncryptNew(String str) {
        return pbkdf2EncryptNew(str, 10000);
    }

    public static String pbkdf2EncryptNew(String str, int i10) {
        return pbkdf2EncryptNew(str, EncryptUtil.generateSecureRandom(16), i10, 32);
    }

    public static String pbkdf2EncryptNew(String str, byte[] bArr, int i10, int i11) {
        byte[] bArrPbkdf2SHA256;
        if (TextUtils.isEmpty(str)) {
            b.b(f62853a, "pwd is null.");
            return "";
        }
        if (i10 < 1000) {
            b.b(f62853a, "iterations times is not enough.");
            return "";
        }
        if (bArr == null || bArr.length < 16) {
            b.b(f62853a, "salt parameter is null or length is not enough");
            return "";
        }
        if (i11 < 32) {
            b.b(f62853a, "cipherLen length is not enough");
            return "";
        }
        if (Build.VERSION.SDK_INT < 26) {
            b.c(f62853a, "sha 1");
            bArrPbkdf2SHA256 = pbkdf2(str.toCharArray(), bArr, i10, i11 * 8);
        } else {
            b.c(f62853a, "sha 256");
            bArrPbkdf2SHA256 = pbkdf2SHA256(str.toCharArray(), bArr, i10, i11 * 8);
        }
        return HexUtil.byteArray2HexStr(bArr) + HexUtil.byteArray2HexStr(bArrPbkdf2SHA256);
    }

    public static byte[] pbkdf2SHA256(char[] cArr, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[0];
        if (Build.VERSION.SDK_INT >= 26) {
            return a(cArr, bArr, i10, i11, true);
        }
        b.b(f62853a, "system version not high than 26");
        return bArr2;
    }

    @Deprecated
    public static boolean validatePassword(String str, String str2) {
        return validatePassword(str, str2, 10000);
    }

    @Deprecated
    public static boolean validatePassword(String str, String str2, int i10) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.length() < 16) {
            return false;
        }
        return a(pbkdf2(str.toCharArray(), HexUtil.hexStr2ByteArray(str2.substring(0, 16)), i10, 256), HexUtil.hexStr2ByteArray(str2.substring(16)));
    }

    public static boolean validatePasswordNew(String str, String str2) {
        return validatePasswordNew(str, str2, 10000);
    }

    public static boolean validatePasswordNew(String str, String str2, int i10) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.length() < 32) {
            return false;
        }
        String strSubstring = str2.substring(0, 32);
        return a(Build.VERSION.SDK_INT < 26 ? pbkdf2(str.toCharArray(), HexUtil.hexStr2ByteArray(strSubstring), i10, 256) : pbkdf2SHA256(str.toCharArray(), HexUtil.hexStr2ByteArray(strSubstring), i10, 256), HexUtil.hexStr2ByteArray(str2.substring(32)));
    }
}
