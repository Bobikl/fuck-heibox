package com.igexin.push.extension.distribution.basic.g;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static boolean a() {
        try {
            Class.forName("com.igexin.push.util.EncryptUtils");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Intent intent, Context context) {
        if (intent == null || context == null) {
            return false;
        }
        try {
            return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(String str) {
        try {
            com.igexin.push.core.d.f63671e.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b() {
        return b(com.igexin.push.extension.distribution.basic.c.e.f63966f);
    }

    private static boolean b(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                if (str2.contains("|") && str2.contains(Constants.WAVE_SEPARATOR)) {
                    String strSubstring = str2.substring(0, str2.indexOf("|"));
                    String[] strArrSplit = str2.substring(str2.indexOf("|") + 1).split(Constants.WAVE_SEPARATOR);
                    if (strArrSplit.length == 2) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        if (Build.BRAND.equalsIgnoreCase(strSubstring) && (i10 = Build.VERSION.SDK_INT) >= i11 && i10 <= i12) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
