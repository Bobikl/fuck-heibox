package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f106960a = -1;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ds f281a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f282a;

    private static int a(Context context) {
        String str;
        try {
            bj bjVarM172a = bg.m172a();
            if (bjVarM172a == null) {
                b(null);
                return -1;
            }
            if (bjVarM172a.a() != 0) {
                if (bjVarM172a.a() != 1 && bjVarM172a.a() != 6) {
                    b(null);
                    return -1;
                }
                b("WIFI-ID-UNKNOWN");
                return 1;
            }
            String strM184b = bjVarM172a.m184b();
            if (TextUtils.isEmpty(strM184b) || "UNKNOWN".equalsIgnoreCase(strM184b)) {
                str = null;
            } else {
                str = "M-" + strM184b;
            }
            b(str);
            return 0;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.d("DisconnectStatsHelper getNetType occurred error: " + e10.getMessage());
            b(null);
            return -1;
        }
    }

    private static synchronized String a() {
        return f282a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m253a(Context context) {
        if (!m254a(context)) {
            a("onReconnection shouldSampling = false");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        f106960a = a(context);
        dp.a(context, jCurrentTimeMillis);
        a("onReconnection connectedNetworkType = " + f106960a);
    }

    public static void a(Context context, hb hbVar) {
        if (m254a(context)) {
            if (f281a == null) {
                f281a = new ds(context);
            }
            hbVar.a(f281a);
            a("startStats");
        }
    }

    public static void a(Context context, String str) {
        if (!m254a(context)) {
            a("onWifiChanged shouldSampling = false");
            return;
        }
        a("onWifiChanged wifiDigest = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b("W-" + str);
    }

    public static void a(Context context, String str, int i10) {
        if (!m254a(context)) {
            a("onDisconnection shouldSampling = false");
            return;
        }
        dp.a(context, str, bg.c(context), System.currentTimeMillis(), i10, com.xiaomi.push.service.p.a(context).m758b(), a(context), a(), f106960a);
        a("onDisconnection");
    }

    static void a(String str) {
        dj.a("Push-DiscntStats", str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m254a(Context context) {
        return dj.a(context);
    }

    public static void b(Context context, hb hbVar) {
        ds dsVar = f281a;
        if (dsVar != null) {
            hbVar.b(dsVar);
            f281a = null;
            a("stopStats");
        }
    }

    private static synchronized void b(String str) {
        if ("WIFI-ID-UNKNOWN".equals(str)) {
            String str2 = f282a;
            if (str2 == null || !str2.startsWith("W-")) {
                f282a = null;
            }
        } else {
            f282a = str;
        }
        a("updateNetId new networkId = " + str + ", finally netId = " + f282a);
    }
}
