package com.huawei.secure.android.common.util;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class SafeString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63084a = "SafeString";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63085b = "";

    public static String replace(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (str != null && charSequence != null && charSequence2 != null) {
            try {
                return str.replace(charSequence, charSequence2);
            } catch (Exception e10) {
                Log.e(f63084a, "replace: " + e10.getMessage());
            }
        }
        return str;
    }

    public static String substring(String str, int i10) {
        if (str != null && str.length() >= i10 && i10 >= 0) {
            try {
                return str.substring(i10);
            } catch (Exception e10) {
                Log.e(f63084a, "substring exception: " + e10.getMessage());
            }
        }
        return "";
    }

    public static String substring(String str, int i10, int i11) {
        if (str != null && i10 >= 0 && i11 <= str.length() && i11 >= i10) {
            try {
                return str.substring(i10, i11);
            } catch (Exception e10) {
                Log.e(f63084a, "substring: " + e10.getMessage());
            }
        }
        return "";
    }
}
