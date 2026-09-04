package com.heytap.mcssdk.utils;

import android.text.TextUtils;
import com.heytap.msp.push.encrypt.AESEncrypt;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: CryptoUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f59954a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f59955b = "Y29tLm5lYXJtZS5tY3M=";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f59956c = "";

    public static String a(String str) {
        boolean z10;
        String strA = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            strA = AESEncrypt.decrypt(AESEncrypt.SDK_APP_SECRET, str);
            e.a("sdkDecrypt aesDecrypt aes data " + strA);
            z10 = true;
        } catch (Exception e10) {
            e.a("sdkDecrypt AES excepiton " + e10.toString());
            z10 = false;
        }
        if (TextUtils.isEmpty(strA) ? false : z10) {
            return strA;
        }
        try {
            strA = c.a(str, c());
            f59954a = "DES";
            f.b().l(f59954a);
            e.a("sdkDecrypt aesDecrypt des data " + strA);
            return strA;
        } catch (Exception e11) {
            e.a("sdkDecrypt DES excepiton " + e11.toString());
            return strA;
        }
    }

    public static String b(String str) {
        boolean z10;
        String strDecrypt = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            strDecrypt = c.a(str, c());
            e.a("sdkDecrypt desDecrypt des data " + strDecrypt);
            z10 = true;
        } catch (Exception e10) {
            e.a("sdkDecrypt DES excepiton " + e10.toString());
            z10 = false;
        }
        if (TextUtils.isEmpty(strDecrypt) ? false : z10) {
            return strDecrypt;
        }
        try {
            strDecrypt = AESEncrypt.decrypt(AESEncrypt.SDK_APP_SECRET, str);
            f59954a = JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM;
            f.b().l(f59954a);
            e.a("sdkDecrypt desDecrypt aes data " + strDecrypt);
            return strDecrypt;
        } catch (Exception e11) {
            e.a("sdkDecrypt AES excepiton " + e11.toString());
            return strDecrypt;
        }
    }

    private static String c() {
        if (TextUtils.isEmpty(f59956c)) {
            f59956c = new String(com.heytap.mcssdk.base.a.t(f59955b));
        }
        byte[] bArrF = f(d(f59956c));
        return bArrF != null ? new String(bArrF, Charset.forName("UTF-8")) : "";
    }

    public static byte[] d(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    public static String e(String str) {
        e.a("sdkDecrypt start data " + str);
        if (TextUtils.isEmpty(f59954a)) {
            f59954a = f.b().a();
        }
        if ("DES".equals(f59954a)) {
            e.a("sdkDecrypt start DES");
            return b(str);
        }
        e.a("sdkDecrypt start AES");
        return a(str);
    }

    public static byte[] f(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i10 = 0; i10 < length; i10 += 2) {
            byte b10 = bArr[i10];
            int i11 = i10 + 1;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }
}
