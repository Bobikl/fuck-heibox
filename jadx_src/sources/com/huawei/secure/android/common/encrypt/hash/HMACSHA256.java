package com.huawei.secure.android.common.encrypt.hash;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public abstract class HMACSHA256 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62849a = "HMACSHA256";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62850b = "HmacSHA256";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62851c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f62852d = 32;

    public static byte[] hmacEncrypt(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            b.b(f62849a, "content or key is null.");
            return new byte[0];
        }
        if (bArr2.length < 32) {
            b.b(f62849a, "hmac key length is not right");
            return new byte[0];
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f62850b);
            Mac mac = Mac.getInstance(secretKeySpec.getAlgorithm());
            mac.init(secretKeySpec);
            return mac.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e10) {
            b.b(f62849a, "hmacsha256 encrypt exception" + e10.getMessage());
            return new byte[0];
        }
    }

    public static String hmacSHA256Encrypt(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? "" : hmacSHA256Encrypt(str, HexUtil.hexStr2ByteArray(str2));
    }

    public static String hmacSHA256Encrypt(String str, byte[] bArr) {
        byte[] bytes;
        if (TextUtils.isEmpty(str) || bArr == null) {
            return "";
        }
        if (bArr.length < 32) {
            b.b(f62849a, "hmac key length is not right");
            return "";
        }
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            b.b(f62849a, "hmacsha256 encrypt exception" + e10.getMessage());
            bytes = new byte[0];
        }
        return HexUtil.byteArray2HexStr(hmacEncrypt(bytes, bArr));
    }
}
