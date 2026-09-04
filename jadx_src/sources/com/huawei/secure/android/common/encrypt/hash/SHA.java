package com.huawei.secure.android.common.encrypt.hash;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public final class SHA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62862a = "SHA";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62864c = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62863b = "SHA-256";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f62865d = {f62863b, "SHA-384", "SHA-512"};

    private SHA() {
    }

    private static boolean a(String str) {
        for (String str2 : f62865d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String sha256Encrypt(String str) {
        return shaEncrypt(str, f62863b);
    }

    public static String shaEncrypt(String str, String str2) {
        byte[] bytes;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            b.b(f62862a, "content or algorithm is null.");
            return "";
        }
        if (!a(str2)) {
            b.b(f62862a, "algorithm is not safe or legal");
            return "";
        }
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = new byte[0];
            b.b(f62862a, "Error in generate SHA UnsupportedEncodingException");
        }
        return HexUtil.byteArray2HexStr(shaEncryptByte(bytes, str2));
    }

    public static byte[] shaEncryptByte(byte[] bArr, String str) {
        if (bArr == null || TextUtils.isEmpty(str)) {
            b.b(f62862a, "content or algorithm is null.");
            return new byte[0];
        }
        if (!a(str)) {
            b.b(f62862a, "algorithm is not safe or legal");
            return new byte[0];
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            b.b(f62862a, "Error in generate SHA NoSuchAlgorithmException");
            return new byte[0];
        }
    }

    public static boolean validateSHA(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        return str2.equals(shaEncrypt(str, str3));
    }

    public static boolean validateSHA256(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(sha256Encrypt(str));
    }
}
