package com.huawei.secure.android.common.encrypt.utils;

import android.annotation.SuppressLint;
import android.os.Build;

/* JADX INFO: loaded from: classes7.dex */
public class RootKeyUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62915b = "RootKeyUtil";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f62916a = null;

    private RootKeyUtil() {
    }

    private void a(String str, String str2, String str3, String str4) {
        a(str, str2, str3, HexUtil.hexStr2ByteArray(str4));
    }

    @SuppressLint({"NewApi"})
    private void a(String str, String str2, String str3, byte[] bArr) {
        if (Build.VERSION.SDK_INT < 26) {
            b.c(f62915b, "initRootKey: sha1");
            this.f62916a = BaseKeyUtil.exportRootKey(str, str2, str3, bArr, false);
        } else {
            b.c(f62915b, "initRootKey: sha256");
            this.f62916a = BaseKeyUtil.exportRootKey(str, str2, str3, bArr, true);
        }
    }

    public static RootKeyUtil newInstance(String str, String str2, String str3, String str4) {
        RootKeyUtil rootKeyUtil = new RootKeyUtil();
        rootKeyUtil.a(str, str2, str3, str4);
        return rootKeyUtil;
    }

    public static RootKeyUtil newInstance(String str, String str2, String str3, byte[] bArr) {
        RootKeyUtil rootKeyUtil = new RootKeyUtil();
        rootKeyUtil.a(str, str2, str3, bArr);
        return rootKeyUtil;
    }

    public byte[] getRootKey() {
        return (byte[]) this.f62916a.clone();
    }

    public String getRootKeyHex() {
        return HexUtil.byteArray2HexStr(this.f62916a);
    }
}
