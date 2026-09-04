package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.g.d;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.h.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f60770e = "a";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<String, Map<String, Map<String, String>>> f60771f = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f60772a = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f60773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f60774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f60775d;

    public a(c cVar, c cVar2, g gVar) {
        this.f60774c = cVar2;
        this.f60773b = cVar;
        this.f60775d = gVar;
        gVar.a(this);
    }

    private void a(GrsBaseInfo grsBaseInfo, b bVar, Context context, String str) {
        Long l10 = this.f60772a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (e.a(l10)) {
            bVar.a(2);
            return;
        }
        if (e.a(l10, 300000L)) {
            this.f60775d.a(new com.huawei.hms.framework.network.grs.g.j.c(grsBaseInfo, context), null, str, this.f60774c, -1);
        }
        bVar.a(1);
    }

    private void a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (e.a(this.f60772a.get(str), 300000L)) {
            this.f60775d.a(new com.huawei.hms.framework.network.grs.g.j.c(grsBaseInfo, context), null, null, this.f60774c, -1);
        }
    }

    public c a() {
        return this.f60773b;
    }

    public Map<String, String> a(GrsBaseInfo grsBaseInfo, String str, b bVar, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        Map<String, Map<String, Map<String, String>>> map = f60771f;
        Map<String, Map<String, String>> map2 = map.get(grsParasKey);
        if (map2 != null && !map2.isEmpty()) {
            a(grsBaseInfo, bVar, context, str);
            return map2.get(str);
        }
        Logger.d(f60770e, "Cache size is: " + map.size());
        return new HashMap();
    }

    public void a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        this.f60773b.b(grsParasKey + "time", "0");
        this.f60772a.remove(grsParasKey + "time");
        Map<String, Map<String, Map<String, String>>> map = f60771f;
        map.remove(grsParasKey);
        Logger.d(f60770e, "Cache size is: " + map.size());
        this.f60775d.a(grsParasKey);
    }

    public void a(GrsBaseInfo grsBaseInfo, d dVar, Context context, com.huawei.hms.framework.network.grs.g.j.c cVar) {
        if (dVar.f() == 2) {
            Logger.w(f60770e, "update cache from server failed");
            return;
        }
        if (cVar.d().size() == 0) {
            String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
            if (dVar.m()) {
                f60771f.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(this.f60773b.a(grsParasKey, "")));
            } else {
                this.f60773b.b(grsParasKey, dVar.j());
                f60771f.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(dVar.j()));
            }
            if (!TextUtils.isEmpty(dVar.e())) {
                this.f60773b.b(grsParasKey + "ETag", dVar.e());
            }
            this.f60773b.b(grsParasKey + "time", dVar.a());
            this.f60772a.put(grsParasKey, Long.valueOf(Long.parseLong(dVar.a())));
        } else {
            this.f60773b.b("geoipCountryCode", dVar.j());
            this.f60773b.b("geoipCountryCodetime", dVar.a());
        }
        Logger.d(f60770e, "Cache size is: " + f60771f.size());
    }

    public g b() {
        return this.f60775d;
    }

    public void b(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        String strA = this.f60773b.a(grsParasKey, "");
        String strA2 = this.f60773b.a(grsParasKey + "time", "0");
        long j10 = 0;
        if (!TextUtils.isEmpty(strA2) && strA2.matches("\\d+")) {
            try {
                j10 = Long.parseLong(strA2);
            } catch (NumberFormatException e10) {
                Logger.w(f60770e, "convert urlParamKey from String to Long catch NumberFormatException.", e10);
            }
        }
        Map<String, Map<String, Map<String, String>>> map = f60771f;
        map.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(strA));
        Logger.d(f60770e, "Cache size is: " + map.size());
        this.f60772a.put(grsParasKey, Long.valueOf(j10));
        a(grsBaseInfo, grsParasKey, context);
    }

    public c c() {
        return this.f60774c;
    }
}
