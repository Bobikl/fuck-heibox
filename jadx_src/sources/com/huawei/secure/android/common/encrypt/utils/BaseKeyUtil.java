package com.huawei.secure.android.common.encrypt.utils;

import android.annotation.SuppressLint;
import com.huawei.secure.android.common.encrypt.hash.PBKDF2;

/* JADX INFO: loaded from: classes7.dex */
public class BaseKeyUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62903a = "BaseKeyUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f62904b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f62905c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f62906d = 10000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f62907e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f62908f = 1;

    private static int a(int i10, int i11, int i12) {
        if (i11 < i10) {
            i10 = i11;
        }
        return i12 < i10 ? i12 : i10;
    }

    private static boolean a(int i10) {
        return i10 >= 16;
    }

    private static boolean a(int i10, byte[] bArr) {
        return a(i10) & a(bArr);
    }

    private static boolean a(byte[] bArr) {
        return bArr.length >= 16;
    }

    public static String exportHexRootKey(String str, String str2, String str3, byte[] bArr, int i10, boolean z10) {
        return HexUtil.byteArray2HexStr(exportRootKey(str, str2, str3, bArr, i10, z10));
    }

    public static byte[] exportRootKey(String str, String str2, String str3, String str4, int i10, boolean z10) {
        return exportRootKey(str, str2, str3, HexUtil.hexStr2ByteArray(str4), i10, z10);
    }

    public static byte[] exportRootKey(String str, String str2, String str3, byte[] bArr, int i10, int i11, boolean z10) {
        byte[] bArrHexStr2ByteArray = HexUtil.hexStr2ByteArray(str);
        byte[] bArrHexStr2ByteArray2 = HexUtil.hexStr2ByteArray(str2);
        byte[] bArrHexStr2ByteArray3 = HexUtil.hexStr2ByteArray(str3);
        int iA = a(bArrHexStr2ByteArray.length, bArrHexStr2ByteArray2.length, bArrHexStr2ByteArray3.length);
        if (!a(iA, bArr)) {
            throw new IllegalArgumentException("key length must be more than 128bit.");
        }
        char[] cArr = new char[iA];
        for (int i12 = 0; i12 < iA; i12++) {
            cArr[i12] = (char) ((bArrHexStr2ByteArray[i12] ^ bArrHexStr2ByteArray2[i12]) ^ bArrHexStr2ByteArray3[i12]);
        }
        if (z10) {
            b.c(f62903a, "exportRootKey: sha256");
            return PBKDF2.pbkdf2SHA256(cArr, bArr, i10, i11 * 8);
        }
        b.c(f62903a, "exportRootKey: sha1");
        return PBKDF2.pbkdf2(cArr, bArr, i10, i11 * 8);
    }

    @SuppressLint({"NewApi"})
    public static byte[] exportRootKey(String str, String str2, String str3, byte[] bArr, int i10, boolean z10) {
        return exportRootKey(str, str2, str3, bArr, 10000, i10, z10);
    }

    @SuppressLint({"NewApi"})
    public static byte[] exportRootKey(String str, String str2, String str3, byte[] bArr, boolean z10) {
        return exportRootKey(str, str2, str3, bArr, 16, z10);
    }

    public static byte[] exportRootKey32(String str, String str2, String str3, byte[] bArr, boolean z10) {
        return exportRootKey(str, str2, str3, bArr, 32, z10);
    }

    public static byte[] exportRootKey32Iteration1(String str, String str2, String str3, byte[] bArr, boolean z10) {
        return exportRootKey(str, str2, str3, bArr, 1, 32, z10);
    }

    @SuppressLint({"NewApi"})
    public static byte[] exportRootKeyIteration1(String str, String str2, String str3, byte[] bArr, boolean z10) {
        return exportRootKey(str, str2, str3, bArr, 1, 16, z10);
    }
}
