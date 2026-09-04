package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class dy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f107016a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f301a = true;

    private static int a(Context context) {
        if (f107016a <= 0) {
            f107016a = j.b(context);
        }
        return f107016a;
    }

    private static int a(boolean z10) {
        return z10 ? 1 : 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static SharedPreferences m270a(Context context) {
        return context.getSharedPreferences("sp_power_stats", 0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static dw m271a(Context context) {
        SharedPreferences sharedPreferencesM270a = m270a(context);
        dw dwVar = new dw();
        dwVar.a(sharedPreferencesM270a.getInt("off_up_count", 0));
        dwVar.b(sharedPreferencesM270a.getInt("off_down_count", 0));
        dwVar.c(sharedPreferencesM270a.getInt("off_ping_count", 0));
        dwVar.d(sharedPreferencesM270a.getInt("off_pong_count", 0));
        dwVar.a(sharedPreferencesM270a.getLong("off_duration", 0L));
        dwVar.e(sharedPreferencesM270a.getInt("on_up_count", 0));
        dwVar.f(sharedPreferencesM270a.getInt("on_down_count", 0));
        dwVar.g(sharedPreferencesM270a.getInt("on_ping_count", 0));
        dwVar.h(sharedPreferencesM270a.getInt("on_pong_count", 0));
        dwVar.b(sharedPreferencesM270a.getLong("on_duration", 0L));
        dwVar.c(sharedPreferencesM270a.getLong(com.umeng.analytics.pro.d.f104709p, 0L));
        dwVar.d(sharedPreferencesM270a.getLong(com.umeng.analytics.pro.d.f104710q, 0L));
        dwVar.i(sharedPreferencesM270a.getInt("xmsf_vc", 0));
        dwVar.j(sharedPreferencesM270a.getInt("android_vc", 0));
        return dwVar;
    }

    private static void a(Context context, long j10, int i10) {
        dv.a("upload");
        new dx().a(context, m271a(context));
        b(context, j10, i10);
    }

    private static void a(Context context, long j10, long j11, int i10, int i11) {
        if (j10 > 0) {
            if (m272a(context) || i10 >= 1073741823 || j11 - j10 >= 86400000) {
                m270a(context).edit().putLong(com.umeng.analytics.pro.d.f104710q, j11).apply();
                a(context, j11, i11);
            }
        }
    }

    public static void a(Context context, long j10, boolean z10) {
        ah.a(context).a(new dz(context, j10, z10));
    }

    private static void a(Context context, SharedPreferences sharedPreferences, long j10, int i10) {
        dv.a("recordInit");
        sharedPreferences.edit().putLong(com.umeng.analytics.pro.d.f104709p, j10).putInt("current_screen_state", i10).putLong("current_screen_state_start_time", j10).putInt("xmsf_vc", a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m272a(Context context) {
        boolean z10 = false;
        if (f301a) {
            f301a = false;
            SharedPreferences sharedPreferencesM270a = m270a(context);
            int i10 = sharedPreferencesM270a.getInt("xmsf_vc", 0);
            int i11 = sharedPreferencesM270a.getInt("android_vc", 0);
            if (i10 != 0 && i11 != 0 && (i10 != a(context) || i11 != Build.VERSION.SDK_INT)) {
                z10 = true;
            }
        }
        dv.a("isVcChanged = " + z10);
        return z10;
    }

    private static void b(Context context, long j10, int i10) {
        dv.a("reset");
        m270a(context).edit().clear().putLong(com.umeng.analytics.pro.d.f104709p, j10).putInt("current_screen_state", i10).putLong("current_screen_state_start_time", j10).putInt("xmsf_vc", a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    public static void b(Context context, long j10, boolean z10) {
        ah.a(context).a(new ea(context, j10, z10));
    }

    public static void c(Context context, long j10, boolean z10) {
        ah.a(context).a(new eb(context, j10, z10));
    }

    public static void d(Context context, long j10, boolean z10) {
        ah.a(context).a(new ec(context, j10, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void i(Context context, long j10, boolean z10) {
        int i10;
        dv.a("recordSendMsg start");
        int iA = a(z10);
        SharedPreferences sharedPreferencesM270a = m270a(context);
        long j11 = sharedPreferencesM270a.getLong(com.umeng.analytics.pro.d.f104709p, 0L);
        if (j11 <= 0) {
            a(context, sharedPreferencesM270a, j10, iA);
        }
        if (iA == 1) {
            i10 = sharedPreferencesM270a.getInt("on_up_count", 0) + 1;
            sharedPreferencesM270a.edit().putInt("on_up_count", i10).apply();
        } else {
            i10 = sharedPreferencesM270a.getInt("off_up_count", 0) + 1;
            sharedPreferencesM270a.edit().putInt("off_up_count", i10).apply();
        }
        a(context, j11, j10, i10, iA);
        dv.a("recordSendMsg complete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void j(Context context, long j10, boolean z10) {
        int i10;
        dv.a("recordReceiveMsg start");
        int iA = a(z10);
        SharedPreferences sharedPreferencesM270a = m270a(context);
        long j11 = sharedPreferencesM270a.getLong(com.umeng.analytics.pro.d.f104709p, 0L);
        if (j11 <= 0) {
            a(context, sharedPreferencesM270a, j10, iA);
        }
        if (iA == 1) {
            i10 = sharedPreferencesM270a.getInt("on_down_count", 0) + 1;
            sharedPreferencesM270a.edit().putInt("on_down_count", i10).apply();
        } else {
            i10 = sharedPreferencesM270a.getInt("off_down_count", 0) + 1;
            sharedPreferencesM270a.edit().putInt("off_down_count", i10).apply();
        }
        a(context, j11, j10, i10, iA);
        dv.a("recordReceiveMsg complete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void k(Context context, long j10, boolean z10) {
        int i10;
        dv.a("recordPing start");
        int iA = a(z10);
        SharedPreferences sharedPreferencesM270a = m270a(context);
        long j11 = sharedPreferencesM270a.getLong(com.umeng.analytics.pro.d.f104709p, 0L);
        if (j11 <= 0) {
            a(context, sharedPreferencesM270a, j10, iA);
        }
        if (iA == 1) {
            i10 = sharedPreferencesM270a.getInt("on_ping_count", 0) + 1;
            sharedPreferencesM270a.edit().putInt("on_ping_count", i10).apply();
        } else {
            i10 = sharedPreferencesM270a.getInt("off_ping_count", 0) + 1;
            sharedPreferencesM270a.edit().putInt("off_ping_count", i10).apply();
        }
        a(context, j11, j10, i10, iA);
        dv.a("recordPing complete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void l(Context context, long j10, boolean z10) {
        int i10;
        dv.a("recordPong start");
        int iA = a(z10);
        SharedPreferences sharedPreferencesM270a = m270a(context);
        long j11 = sharedPreferencesM270a.getLong(com.umeng.analytics.pro.d.f104709p, 0L);
        if (j11 <= 0) {
            a(context, sharedPreferencesM270a, j10, iA);
        }
        if (iA == 1) {
            i10 = sharedPreferencesM270a.getInt("on_pong_count", 0) + 1;
            sharedPreferencesM270a.edit().putInt("on_pong_count", i10).apply();
        } else {
            i10 = sharedPreferencesM270a.getInt("off_pong_count", 0) + 1;
            sharedPreferencesM270a.edit().putInt("off_pong_count", i10).apply();
        }
        a(context, j11, j10, i10, iA);
        dv.a("recordPong complete");
    }
}
