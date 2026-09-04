package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f106982a;

    private static int a(Context context) {
        if (f106982a <= 0) {
            f106982a = j.b(context);
        }
        return f106982a;
    }

    private static int a(boolean z10) {
        return z10 ? 1 : 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static SharedPreferences m261a(Context context) {
        return context.getSharedPreferences("sp_disconnect_stats", 0);
    }

    private static String a(String str, int i10) {
        return a(str, String.valueOf(i10));
    }

    private static String a(String str, long j10) {
        return a(str, String.valueOf(j10));
    }

    private static String a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            str2 = "null";
        }
        if (str == null || str.length() <= 0) {
            return str2;
        }
        return str + ";" + str2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static List<dn> m262a(Context context) {
        SharedPreferences sharedPreferencesM261a = m261a(context);
        String[] strArrA = a(sharedPreferencesM261a.getString("host", null));
        if (strArrA == null || strArrA.length <= 0) {
            com.xiaomi.channel.commonutils.logger.b.m62a("DisconnectStatsSP Cached hosts data is empty,drop.");
            return null;
        }
        String[] strArrA2 = a(sharedPreferencesM261a.getString("network_state", null));
        String[] strArrA3 = a(sharedPreferencesM261a.getString("reason", null));
        String[] strArrA4 = a(sharedPreferencesM261a.getString("ping_interval", null));
        String[] strArrA5 = a(sharedPreferencesM261a.getString("network_type", null));
        String[] strArrA6 = a(sharedPreferencesM261a.getString("wifi_digest", null));
        String[] strArrA7 = a(sharedPreferencesM261a.getString("connected_network_type", null));
        String[] strArrA8 = a(sharedPreferencesM261a.getString("disconnect_time", null));
        String[] strArrA9 = a(sharedPreferencesM261a.getString("connected_time", null));
        String[] strArrA10 = a(sharedPreferencesM261a.getString("xmsf_vc", null));
        String[] strArrA11 = a(sharedPreferencesM261a.getString("android_vc", null));
        if (strArrA2 == null || strArrA3 == null || strArrA4 == null || strArrA5 == null || strArrA6 == null || strArrA7 == null || strArrA8 == null || strArrA9 == null || strArrA10 == null || strArrA11 == null || strArrA.length != strArrA2.length || strArrA.length != strArrA3.length || strArrA.length != strArrA4.length || strArrA.length != strArrA5.length || strArrA.length != strArrA6.length || strArrA.length != strArrA7.length || strArrA.length != strArrA8.length || strArrA.length != strArrA9.length || strArrA.length != strArrA10.length || strArrA.length != strArrA11.length) {
            com.xiaomi.channel.commonutils.logger.b.m62a("DisconnectStatsSP Cached data incorrect,drop.");
            return null;
        }
        ArrayList arrayList = new ArrayList(strArrA.length);
        int i10 = 0;
        while (i10 < strArrA.length) {
            dn dnVar = new dn();
            dnVar.a(1);
            dnVar.a(strArrA[i10]);
            dnVar.b(s.a(strArrA2[i10], -1));
            dnVar.c(s.a(strArrA3[i10], -1));
            String[] strArr = strArrA2;
            String[] strArr2 = strArrA;
            ArrayList arrayList2 = arrayList;
            dnVar.a(s.a(strArrA4[i10], -1L));
            dnVar.d(s.a(strArrA5[i10], -1));
            dnVar.b(strArrA6[i10]);
            dnVar.e(s.a(strArrA7[i10], -1));
            long jA = s.a(strArrA8[i10], -1L);
            long jA2 = s.a(strArrA9[i10], -1L);
            dnVar.b(jA2 - jA);
            dnVar.c(jA);
            dnVar.d(jA2);
            dnVar.f(s.a(strArrA10[i10], -1));
            dnVar.g(s.a(strArrA11[i10], -1));
            arrayList2.add(dnVar);
            i10++;
            strArrA2 = strArr;
            arrayList = arrayList2;
            strArrA4 = strArrA4;
            strArrA3 = strArrA3;
            strArrA = strArr2;
            strArrA5 = strArrA5;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static void m263a(Context context) {
        dm.a("upload");
        new Cdo().a(context, m262a(context));
        b(context);
    }

    public static void a(Context context, long j10) {
        ah.a(context).a(new dr(context, j10));
    }

    private static void a(Context context, String str, int i10, long j10, int i11, long j11, int i12, String str2, int i13) {
        dm.a(String.format(Locale.US, "recordDisconnectInfo host=%s, netState=%d, currentTimeMillis=%d, reason=%d, pingInterval=%d, netType=%d, wifiDigest=%s, connectedNetType=%d", str, Integer.valueOf(i10), Long.valueOf(j10), Integer.valueOf(i11), Long.valueOf(j11), Integer.valueOf(i12), str2, Integer.valueOf(i13)));
        SharedPreferences sharedPreferencesM261a = m261a(context);
        String string = sharedPreferencesM261a.getString("host", null);
        String string2 = sharedPreferencesM261a.getString("network_state", null);
        String string3 = sharedPreferencesM261a.getString("reason", null);
        String string4 = sharedPreferencesM261a.getString("ping_interval", null);
        String string5 = sharedPreferencesM261a.getString("network_type", null);
        String string6 = sharedPreferencesM261a.getString("wifi_digest", null);
        String string7 = sharedPreferencesM261a.getString("connected_network_type", null);
        String string8 = sharedPreferencesM261a.getString("disconnect_time", null);
        String string9 = sharedPreferencesM261a.getString("xmsf_vc", null);
        String string10 = sharedPreferencesM261a.getString("android_vc", null);
        String strA = a(string, str);
        String strA2 = a(string2, i10);
        String strA3 = a(string3, i11);
        String strA4 = a(string4, j11);
        String strA5 = a(string5, i12);
        String strA6 = a(string6, str2);
        String strA7 = a(string7, i13);
        String strA8 = a(string8, j10);
        sharedPreferencesM261a.edit().putString("host", strA).putString("network_state", strA2).putString("reason", strA3).putString("ping_interval", strA4).putString("network_type", strA5).putString("wifi_digest", strA6).putString("connected_network_type", strA7).putString("disconnect_time", strA8).putString("xmsf_vc", a(string9, a(context))).putString("android_vc", a(string10, Build.VERSION.SDK_INT)).apply();
    }

    public static void a(Context context, String str, boolean z10, long j10, int i10, long j11, int i11, String str2, int i12) {
        ah.a(context).a(new dq(context, str, z10, j10, i10, j11, i11, str2, i12));
    }

    private static String[] a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(";");
    }

    private static void b(Context context) {
        dm.a("resetAfterUpload");
        m261a(context).edit().putString("host", null).putString("network_state", null).putString("reason", null).putString("ping_interval", null).putString("network_type", null).putString("wifi_digest", null).putString("connected_network_type", null).putString("disconnect_time", null).putString("connected_time", null).putLong("last_discnt_time", 0L).putInt("discnt_count", 0).putInt("cnt_count", 0).putString("xmsf_vc", null).putString("android_vc", null).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(Context context, long j10) {
        SharedPreferences sharedPreferencesM261a = m261a(context);
        long j11 = sharedPreferencesM261a.getLong("start_time_for_day", 0L);
        if (j11 == 0) {
            sharedPreferencesM261a.edit().putLong("start_time_for_day", j10).putLong("last_discnt_time", 0L).putInt("discnt_count_in_day", 0).putInt("discnt_count", 0).putInt("cnt_count", 0).apply();
            return;
        }
        int i10 = sharedPreferencesM261a.getInt("discnt_count", 0);
        int i11 = sharedPreferencesM261a.getInt("cnt_count", 0);
        if (i10 > i11) {
            sharedPreferencesM261a.edit().putInt("cnt_count", i11 + 1).putString("connected_time", a(sharedPreferencesM261a.getString("connected_time", null), j10)).apply();
        }
        if (j10 - j11 >= 86400000) {
            sharedPreferencesM261a.edit().putLong("start_time_for_day", j10).putInt("discnt_count_in_day", 0).apply();
            m263a(context);
        } else if (i10 >= 10) {
            m263a(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(Context context, String str, boolean z10, long j10, int i10, long j11, int i11, String str2, int i12) {
        SharedPreferences sharedPreferencesM261a = m261a(context);
        long j12 = sharedPreferencesM261a.getLong("start_time_for_day", 0L);
        if (j12 == 0) {
            dm.a("recordDisconnection not initialized");
            return;
        }
        if (j10 - sharedPreferencesM261a.getLong("last_discnt_time", 0L) < 60000) {
            dm.a("recordDisconnection anti-shake");
            return;
        }
        if (j10 - j12 < 86400000) {
            int i13 = sharedPreferencesM261a.getInt("discnt_count_in_day", 0);
            if (i13 > 100) {
                dm.a("recordDisconnection count > 100 in 24H cycle,abandon.");
                return;
            } else {
                sharedPreferencesM261a.edit().putInt("discnt_count_in_day", i13 + 1).apply();
            }
        } else {
            dm.a("recordDisconnection with the current time exceeds 24H cycle, go on.");
        }
        int i14 = sharedPreferencesM261a.getInt("discnt_count", 0);
        if (i14 == sharedPreferencesM261a.getInt("cnt_count", 0)) {
            a(context, str, a(z10), j10, i10, j11, i11, str2, i12);
            sharedPreferencesM261a.edit().putLong("last_discnt_time", j10).putInt("discnt_count", i14 + 1).apply();
        }
        dm.a("recordDisconnection complete");
    }
}
