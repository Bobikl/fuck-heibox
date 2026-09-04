package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f106957a;

    static void a(String str) {
        a("Push-ConnectionQualityStatsHelper", str);
    }

    public static void a(String str, String str2) {
    }

    public static boolean a(Context context) {
        if (f106957a == null) {
            if (!j.m521a(context)) {
                f106957a = Boolean.FALSE;
            }
            String strM774a = com.xiaomi.push.service.v.m774a(context);
            if (TextUtils.isEmpty(strM774a) || strM774a.length() < 3) {
                f106957a = Boolean.FALSE;
            } else {
                String strSubstring = strM774a.substring(strM774a.length() - 3);
                a("shouldSampling uuid suffix = " + strSubstring);
                f106957a = Boolean.valueOf(TextUtils.equals(strSubstring, "001"));
            }
            a("shouldSampling = " + f106957a);
        }
        return f106957a.booleanValue();
    }
}
