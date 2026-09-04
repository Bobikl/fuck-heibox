package com.alipay.deviceid.module.x;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: compiled from: SharePreferenceStorage.java */
/* JADX INFO: loaded from: classes6.dex */
public final class t {
    public static String a(Context context, String str, String str2, String str3) {
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void a(Context context, String str, Map<String, String> map) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        if (editorEdit != null) {
            for (String str2 : map.keySet()) {
                editorEdit.putString(str2, map.get(str2));
            }
            editorEdit.commit();
        }
    }
}
