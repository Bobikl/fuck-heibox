package com.xiaomi.push;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.push.do, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class Cdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106968a = "disconnection_event";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106969b = "count";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f106970c = "host";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f106971d = "network_state";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f106972e = "reason";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f106973f = "ping_interval";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f106974g = "network_type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f106975h = "wifi_digest";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f106976i = "duration";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f106977j = "disconnect_time";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f106978k = "connect_time";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f106979l = "xmsf_vc";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f106980m = "android_vc";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f106981n = "uuid";

    public void a(Context context, List<dn> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        dm.a("upload size = " + list.size());
        String strM774a = com.xiaomi.push.service.v.m774a(context);
        for (dn dnVar : list) {
            HashMap map = new HashMap();
            map.put("count", Integer.valueOf(dnVar.a()));
            map.put("host", dnVar.m256a());
            map.put("network_state", Integer.valueOf(dnVar.b()));
            map.put("reason", Integer.valueOf(dnVar.c()));
            map.put("ping_interval", Long.valueOf(dnVar.m255a()));
            map.put("network_type", Integer.valueOf(dnVar.d()));
            map.put("wifi_digest", dnVar.m258b());
            map.put("connected_network_type", Integer.valueOf(dnVar.e()));
            map.put("duration", Long.valueOf(dnVar.m257b()));
            map.put("disconnect_time", Long.valueOf(dnVar.m259c()));
            map.put("connect_time", Long.valueOf(dnVar.m260d()));
            map.put("xmsf_vc", Integer.valueOf(dnVar.f()));
            map.put("android_vc", Integer.valueOf(dnVar.g()));
            map.put("uuid", strM774a);
            gc.a().a("disconnection_event", (Map<String, Object>) map);
        }
    }
}
