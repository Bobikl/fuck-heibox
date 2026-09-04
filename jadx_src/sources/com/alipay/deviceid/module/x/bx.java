package com.alipay.deviceid.module.x;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: compiled from: SettingsStorage.java */
/* JADX INFO: loaded from: classes6.dex */
public final class bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f38332a = "";

    public static void a(Context context, String str) {
        a(context, "webrtcurl", str);
    }

    public static void a(Context context, String str, long j10) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("alipay_device_id_settings", 0).edit();
            if (editorEdit != null) {
                editorEdit.putString("vkey_valid" + str, i.a(i.a(), String.valueOf(j10)));
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(Context context, String str, String str2) {
        bz.a(context, "alipay_device_id_settings", str, str2);
    }

    public static void a(Context context, boolean z10) {
        a(context, "log_switch", z10 ? "1" : "0");
    }

    public static boolean a(Context context) {
        String strA = bz.a(context, "alipay_device_id_settings", "log_switch");
        return strA != null && "1".equals(strA);
    }

    public static long b(Context context, String str) {
        try {
            String string = context.getSharedPreferences("alipay_device_id_settings", 0).getString("vkey_valid" + str, "");
            if (e.a(string)) {
                return 0L;
            }
            String strB = i.b(i.a(), string);
            if (e.a(strB)) {
                return 0L;
            }
            return Long.parseLong(strB);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static synchronized String b(Context context) {
        SharedPreferences.Editor editorEdit;
        if (e.a(f38332a)) {
            String strA = t.a(context, "alipay_device_id_tags", "random", "");
            f38332a = strA;
            if (e.a(strA)) {
                String strA2 = h.a(UUID.randomUUID().toString());
                f38332a = strA2;
                if (strA2 != null && (editorEdit = context.getSharedPreferences("alipay_device_id_tags", 0).edit()) != null) {
                    editorEdit.putString("random", strA2);
                    editorEdit.commit();
                }
            }
        }
        return f38332a;
    }
}
