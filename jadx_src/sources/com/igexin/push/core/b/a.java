package com.igexin.push.core.b;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static String a(Context context) {
        return b(context).getString("appId", "");
    }

    private static SharedPreferences b(Context context) {
        return context.getSharedPreferences("ups_gt_appinfo", 0);
    }
}
