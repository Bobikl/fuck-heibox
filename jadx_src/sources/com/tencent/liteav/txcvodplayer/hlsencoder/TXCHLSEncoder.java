package com.tencent.liteav.txcvodplayer.hlsencoder;

import android.text.TextUtils;
import android.util.Base64;
import com.tencent.liteav.base.util.LiteavLog;
import java.nio.charset.Charset;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class TXCHLSEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f100144a = "com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f100145b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f100146c = "0123456789ABCDEF".toCharArray();

    public static String a() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 32; i10++) {
            char[] cArr = f100146c;
            sb2.append(cArr[new Random().nextInt(cArr.length)]);
        }
        return sb2.toString();
    }

    public static String a(int i10, String str, String str2, int i11) {
        if (TextUtils.isEmpty(str)) {
            str = "default";
        }
        if (!TextUtils.isEmpty(str2)) {
            return md5(i10, str, str2, i11);
        }
        LiteavLog.w(f100144a, "genSecretKey input exception!");
        return null;
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return rsaEncrypt(str);
        }
        LiteavLog.w(f100144a, "encryptKey input exception!");
        return null;
    }

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return Base64.encodeToString(aesEncrypt(str, str2.getBytes(f100145b)), 2);
        }
        LiteavLog.w(f100144a, "encryptWithSecretKey input exception!");
        return null;
    }

    private static native byte[] aesDecrypt(String str, byte[] bArr);

    private static native byte[] aesEncrypt(String str, byte[] bArr);

    public static String b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new String(aesDecrypt(str, Base64.decode(str2, 2)), f100145b);
        }
        LiteavLog.w(f100144a, "decryptWithSecretKey input exception!");
        return null;
    }

    private static native String md5(int i10, String str, String str2, int i11);

    private static native String rsaEncrypt(String str);
}
