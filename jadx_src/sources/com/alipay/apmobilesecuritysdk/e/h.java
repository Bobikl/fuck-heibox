package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f38185a = "";

    public static long a(Context context) {
        String strA = q4.a.a(context, "vkeyid_settings", "update_time_interval");
        if (!e6.a.f(strA)) {
            return 86400000L;
        }
        try {
            return Long.parseLong(strA);
        } catch (Exception unused) {
            return 86400000L;
        }
    }

    public static void a(Context context, String str) {
        a(context, "update_time_interval", str);
    }

    public static void a(Context context, String str, long j10) {
        q4.a.b(context, "vkeyid_settings", "vkey_valid" + str, String.valueOf(j10));
    }

    public static void a(Context context, String str, String str2) {
        q4.a.b(context, "vkeyid_settings", str, str2);
    }

    public static void a(Context context, boolean z10) {
        a(context, "log_switch", z10 ? "1" : "0");
    }

    public static String b(Context context) {
        return q4.a.a(context, "vkeyid_settings", "last_apdid_env");
    }

    public static void b(Context context, String str) {
        a(context, "last_machine_boot_time", str);
    }

    public static void c(Context context, String str) {
        a(context, "last_apdid_env", str);
    }

    public static boolean c(Context context) {
        String strA = q4.a.a(context, "vkeyid_settings", "log_switch");
        return strA != null && "1".equals(strA);
    }

    public static String d(Context context) {
        return q4.a.a(context, "vkeyid_settings", "dynamic_key");
    }

    public static void d(Context context, String str) {
        a(context, "agent_switch", str);
    }

    public static String e(Context context) {
        return q4.a.a(context, "vkeyid_settings", "apse_degrade");
    }

    public static void e(Context context, String str) {
        a(context, "dynamic_key", str);
    }

    public static String f(Context context) {
        String str;
        SharedPreferences.Editor editorEdit;
        synchronized (h.class) {
            if (e6.a.c(f38185a)) {
                String strA = q4.e.a(context, "alipay_vkey_random", "random", "");
                f38185a = strA;
                if (e6.a.c(strA)) {
                    String strA2 = d6.b.a(UUID.randomUUID().toString());
                    f38185a = strA2;
                    if (strA2 != null && (editorEdit = context.getSharedPreferences("alipay_vkey_random", 0).edit()) != null) {
                        editorEdit.putString("random", strA2);
                        editorEdit.commit();
                    }
                }
            }
            str = f38185a;
        }
        return str;
    }

    public static void f(Context context, String str) {
        a(context, "webrtc_url", str);
    }

    public static void g(Context context, String str) {
        a(context, "apse_degrade", str);
    }

    public static long h(Context context, String str) {
        try {
            String strA = q4.a.a(context, "vkeyid_settings", "vkey_valid" + str);
            if (e6.a.c(strA)) {
                return 0L;
            }
            return Long.parseLong(strA);
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
