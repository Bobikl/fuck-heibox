package com.huawei.secure.android.common.util;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class SafeStringBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63086a = "SafeStringBuffer";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63087b = "";

    public static String substring(StringBuffer stringBuffer, int i10) {
        if (stringBuffer != null && stringBuffer.length() >= i10 && i10 >= 0) {
            try {
                return stringBuffer.substring(i10);
            } catch (Exception e10) {
                Log.e(f63086a, "substring exception: " + e10.getMessage());
            }
        }
        return "";
    }

    public static String substring(StringBuffer stringBuffer, int i10, int i11) {
        if (stringBuffer != null && i10 >= 0 && i11 <= stringBuffer.length() && i11 >= i10) {
            try {
                return stringBuffer.substring(i10, i11);
            } catch (Exception e10) {
                Log.e(f63086a, "substring: " + e10.getMessage());
            }
        }
        return "";
    }
}
