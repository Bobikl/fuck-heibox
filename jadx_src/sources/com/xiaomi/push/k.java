package com.xiaomi.push;

import android.content.Context;
import android.preference.PreferenceManager;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {
    public static void a(Context context) {
    }

    public static void a(Context context, String str, boolean z10) {
        a(context);
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str, z10).commit();
    }

    public static void a(Map<String, String> map, String str, String str2) {
        if (map == null || str == null || str2 == null) {
            return;
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m636a(Context context, String str, boolean z10) {
        a(context);
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, z10);
    }
}
