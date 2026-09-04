package com.igexin.push.extension.distribution.basic.a;

import android.os.Bundle;
import android.os.Environment;
import java.net.ServerSocket;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63908a = "EXT-" + d.class.getName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static d f63909d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f63910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ServerSocket f63911c;

    private d() {
    }

    public static d a() {
        if (f63909d == null) {
            f63909d = new d();
        }
        return f63909d;
    }

    public void a(boolean z10) {
        int i10;
        JSONArray jSONArray;
        if (z10) {
            try {
                if (com.igexin.push.core.d.f63676j && com.igexin.push.core.d.f63675i) {
                    try {
                        if (this.f63911c == null) {
                            this.f63911c = new ServerSocket(51688);
                        }
                    } catch (Exception unused) {
                        com.igexin.a.a.c.b.a(f63908a + "|port 51688 has occupy by others", new Object[0]);
                    }
                    if (this.f63911c != null) {
                        if (com.igexin.push.extension.distribution.basic.c.e.f63968h < 180000) {
                            com.igexin.push.extension.distribution.basic.c.e.f63968h = 180000L;
                        }
                        if (com.igexin.push.extension.distribution.basic.c.e.f63967g < 180000) {
                            com.igexin.push.extension.distribution.basic.c.e.f63967g = 180000L;
                        }
                        if (this.f63910b == null) {
                            long jCurrentTimeMillis = System.currentTimeMillis() - com.igexin.push.extension.distribution.basic.c.e.f63969i;
                            if (jCurrentTimeMillis < com.igexin.push.extension.distribution.basic.c.e.f63968h) {
                                com.igexin.a.a.c.b.a(f63908a + "|lastReportInterval < reportCidRestartThreshold not report", new Object[0]);
                                return;
                            }
                            i10 = jCurrentTimeMillis < com.igexin.push.extension.distribution.basic.c.e.f63967g ? 2 : 0;
                        } else {
                            if (System.currentTimeMillis() - this.f63910b.longValue() < com.igexin.push.extension.distribution.basic.c.e.f63967g) {
                                com.igexin.a.a.c.b.a(f63908a + "|offline time < reportCidOfflineThreshold not report", new Object[0]);
                                return;
                            }
                            i10 = 1;
                        }
                        List<JSONObject> listA = com.igexin.push.extension.distribution.basic.g.e.a(Environment.getExternalStorageDirectory() + "/libs");
                        if (listA == null) {
                            jSONArray = new JSONArray();
                        } else if (listA.size() <= 0) {
                            return;
                        } else {
                            jSONArray = new JSONArray((Collection) listA);
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("appinfo", jSONArray);
                        jSONObject.put("deviceid", "ANDROID-" + com.igexin.push.core.d.f63691y);
                        jSONObject.put("type", i10);
                        jSONObject.put("pkg", com.igexin.push.core.d.f63671e.getPackageName());
                        jSONObject.toString();
                        Bundle bundle = new Bundle();
                        bundle.putString("action", "sendMessage");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("6T5@S_");
                        sb2.append(com.igexin.a.b.a.a(com.igexin.push.core.d.f63685s + System.currentTimeMillis()));
                        bundle.putString("taskid", sb2.toString());
                        bundle.putByteArray("extraData", jSONObject.toString().getBytes());
                        com.igexin.push.core.a.e.a().a(bundle);
                        com.igexin.push.extension.distribution.basic.d.b.a().a(System.currentTimeMillis());
                    }
                }
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.a(f63908a + "|do report exception:" + th2.toString(), new Object[0]);
                return;
            }
        }
        if (z10) {
            return;
        }
        this.f63910b = Long.valueOf(System.currentTimeMillis());
    }
}
