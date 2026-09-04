package com.huawei.hms.hatool;

import android.content.Context;
import android.util.Pair;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class v0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f61057a = q0.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f61058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f61059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f61060d;

    public v0(String str, String str2, String str3) {
        this.f61058b = str;
        this.f61059c = str2;
        this.f61060d = str3;
    }

    private void a(String str, List<b1> list) {
        Pair<String, String> pairA = n1.a(str);
        new u(list, (String) pairA.first, (String) pairA.second, this.f61060d).a();
    }

    @Override // java.lang.Runnable
    public void run() {
        v.c("hmsSdk", "eventReportTask is running");
        boolean zA = c0.a(this.f61057a);
        if (zA) {
            v.c("hmsSdk", "workKey is refresh,begin report all data");
            this.f61059c = "alltype";
        }
        try {
            try {
                Map<String, List<b1>> mapA = c1.a(this.f61057a, this.f61058b, this.f61059c);
                if (mapA.size() == 0) {
                    v.b("hmsSdk", "no have events to report: tag:%s : type:%s", this.f61058b, this.f61059c);
                    if ("alltype".equals(this.f61059c)) {
                        d.a(this.f61057a, "stat_v2_1", new String[0]);
                        d.a(this.f61057a, "cached_v2_1", new String[0]);
                        return;
                    } else {
                        String strA = n1.a(this.f61058b, this.f61059c);
                        d.a(this.f61057a, "stat_v2_1", strA);
                        d.a(this.f61057a, "cached_v2_1", strA);
                        return;
                    }
                }
                for (Map.Entry<String, List<b1>> entry : mapA.entrySet()) {
                    a(entry.getKey(), entry.getValue());
                }
                if ("alltype".equals(this.f61059c)) {
                    d.a(this.f61057a, "stat_v2_1", new String[0]);
                    d.a(this.f61057a, "cached_v2_1", new String[0]);
                } else {
                    String strA2 = n1.a(this.f61058b, this.f61059c);
                    d.a(this.f61057a, "stat_v2_1", strA2);
                    d.a(this.f61057a, "cached_v2_1", strA2);
                }
                if (zA) {
                    v.c("hmsSdk", "refresh local key");
                    o0.d().b();
                }
            } catch (IllegalArgumentException e10) {
                v.e("hmsSdk", "readEventRecords handData IllegalArgumentException:" + e10.getMessage());
                if ("alltype".equals(this.f61059c)) {
                    d.a(this.f61057a, "stat_v2_1", new String[0]);
                    d.a(this.f61057a, "cached_v2_1", new String[0]);
                } else {
                    String strA3 = n1.a(this.f61058b, this.f61059c);
                    d.a(this.f61057a, "stat_v2_1", strA3);
                    d.a(this.f61057a, "cached_v2_1", strA3);
                }
            } catch (Exception e11) {
                v.e("hmsSdk", "readEventRecords handData Exception:" + e11.getMessage());
                if ("alltype".equals(this.f61059c)) {
                    d.a(this.f61057a, "stat_v2_1", new String[0]);
                    d.a(this.f61057a, "cached_v2_1", new String[0]);
                } else {
                    String strA4 = n1.a(this.f61058b, this.f61059c);
                    d.a(this.f61057a, "stat_v2_1", strA4);
                    d.a(this.f61057a, "cached_v2_1", strA4);
                }
            }
        } catch (Throwable th2) {
            if ("alltype".equals(this.f61059c)) {
                d.a(this.f61057a, "stat_v2_1", new String[0]);
                d.a(this.f61057a, "cached_v2_1", new String[0]);
            } else {
                String strA5 = n1.a(this.f61058b, this.f61059c);
                d.a(this.f61057a, "stat_v2_1", strA5);
                d.a(this.f61057a, "cached_v2_1", strA5);
            }
            throw th2;
        }
    }
}
