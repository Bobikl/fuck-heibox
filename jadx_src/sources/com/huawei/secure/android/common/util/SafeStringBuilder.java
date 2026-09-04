package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class SafeStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63088a = "SafeStringBuilder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63089b = "";

    public static String substring(StringBuilder sb2, int i10) {
        if (!TextUtils.isEmpty(sb2) && sb2.length() >= i10 && i10 >= 0) {
            try {
                return sb2.substring(i10);
            } catch (Exception e10) {
                Log.e(f63088a, "substring exception: " + e10.getMessage());
            }
        }
        return "";
    }

    public static String substring(StringBuilder sb2, int i10, int i11) {
        if (!TextUtils.isEmpty(sb2) && i10 >= 0 && i11 <= sb2.length() && i11 >= i10) {
            try {
                return sb2.substring(i10, i11);
            } catch (Exception e10) {
                Log.e(f63088a, "substring: " + e10.getMessage());
            }
        }
        return "";
    }
}
