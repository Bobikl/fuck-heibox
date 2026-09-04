package com.xiaomi.push;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class dx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f107000a = "power_consumption_stats";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f107001b = "off_up_ct";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f107002c = "off_dn_ct";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f107003d = "off_ping_ct";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f107004e = "off_pong_ct";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f107005f = "off_dur";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f107006g = "on_up_ct";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f107007h = "on_dn_ct";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f107008i = "on_ping_ct";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f107009j = "on_pong_ct";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f107010k = "on_dur";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f107011l = com.umeng.analytics.pro.d.f104709p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f107012m = com.umeng.analytics.pro.d.f104710q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f107013n = "xmsf_vc";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f107014o = "android_vc";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f107015p = "uuid";

    public void a(Context context, dw dwVar) {
        if (dwVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("off_up_ct", Integer.valueOf(dwVar.a()));
        map.put("off_dn_ct", Integer.valueOf(dwVar.b()));
        map.put("off_ping_ct", Integer.valueOf(dwVar.c()));
        map.put("off_pong_ct", Integer.valueOf(dwVar.d()));
        map.put("off_dur", Long.valueOf(dwVar.m266a()));
        map.put("on_up_ct", Integer.valueOf(dwVar.e()));
        map.put("on_dn_ct", Integer.valueOf(dwVar.f()));
        map.put("on_ping_ct", Integer.valueOf(dwVar.g()));
        map.put("on_pong_ct", Integer.valueOf(dwVar.h()));
        map.put("on_dur", Long.valueOf(dwVar.m267b()));
        map.put(com.umeng.analytics.pro.d.f104709p, Long.valueOf(dwVar.m268c()));
        map.put(com.umeng.analytics.pro.d.f104710q, Long.valueOf(dwVar.m269d()));
        map.put("xmsf_vc", Integer.valueOf(dwVar.i()));
        map.put("android_vc", Integer.valueOf(dwVar.j()));
        map.put("uuid", com.xiaomi.push.service.v.m774a(context));
        gc.a().a("power_consumption_stats", (Map<String, Object>) map);
    }
}
