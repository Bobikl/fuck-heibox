package com.huawei.secure.android.common.util;

import android.util.Base64;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class SafeBase64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63083a = "SafeBase64";

    private SafeBase64() {
    }

    public static byte[] decode(String str, int i10) {
        try {
            return Base64.decode(str, i10);
        } catch (Exception e10) {
            Log.e(f63083a, e10.getClass().getSimpleName() + " , message2 : " + e10.getMessage());
            return new byte[0];
        }
    }

    public static byte[] decode(byte[] bArr, int i10) {
        try {
            return Base64.decode(bArr, i10);
        } catch (Exception e10) {
            Log.e(f63083a, e10.getClass().getSimpleName() + " , message0 : " + e10.getMessage());
            return new byte[0];
        }
    }

    public static byte[] decode(byte[] bArr, int i10, int i11, int i12) {
        try {
            return Base64.decode(bArr, i10, i11, i12);
        } catch (Exception e10) {
            Log.e(f63083a, e10.getClass().getSimpleName() + " , message1 : " + e10.getMessage());
            return new byte[0];
        }
    }

    public static byte[] encode(byte[] bArr, int i10) {
        try {
            return Base64.encode(bArr, i10);
        } catch (Exception e10) {
            Log.e(f63083a, e10.getClass().getSimpleName() + " , message3 : " + e10.getMessage());
            return new byte[0];
        }
    }

    public static byte[] encode(byte[] bArr, int i10, int i11, int i12) {
        try {
            return Base64.encode(bArr, i10, i11, i12);
        } catch (Exception e10) {
            Log.e(f63083a, e10.getClass().getSimpleName() + " , message4 : " + e10.getMessage());
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int i10) {
        try {
            return Base64.encodeToString(bArr, i10);
        } catch (Exception e10) {
            Log.e(f63083a, e10.getClass().getSimpleName() + " , message5 : " + e10.getMessage());
            return "";
        }
    }

    public static String encodeToString(byte[] bArr, int i10, int i11, int i12) {
        try {
            return Base64.encodeToString(bArr, i10, i11, i12);
        } catch (Exception e10) {
            Log.e(f63083a, e10.getClass().getSimpleName() + " , message6 : " + e10.getMessage());
            return "";
        }
    }
}
