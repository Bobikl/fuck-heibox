package com.ss.bytertc.engine.utils;

import android.util.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class TokenUtils {
    public static String buildToken(String str, String str2, String str3, String str4) {
        if (str == null || str.isEmpty()) {
            return "Basic " + Base64.encodeToString(String.format("%s:%s:%s", str2, str3, str4).getBytes(), 2);
        }
        if (str.contains("Basic")) {
            return str;
        }
        return "Bearer " + str;
    }
}
