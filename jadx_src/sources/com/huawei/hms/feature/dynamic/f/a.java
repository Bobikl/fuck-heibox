package com.huawei.hms.feature.dynamic.f;

import android.util.Base64;
import com.huawei.hms.common.util.Logger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60718a = "Base64";

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            String strEncodeToString = Base64.encodeToString(bArr, 2);
            return strEncodeToString != null ? strEncodeToString : "";
        } catch (AssertionError e10) {
            Logger.e(f60718a, "An exception occurred while encoding with Base64,AssertionError:", e10);
        }
    }

    public static byte[] a(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode != null) {
                return bArrDecode;
            }
        } catch (IllegalArgumentException e10) {
            Logger.e(f60718a, "Decoding with Base64 IllegalArgumentException:", e10);
        }
        return new byte[0];
    }
}
