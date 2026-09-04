package com.apm.lite.runtime;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f40187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, Long> f40188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40189c = 50;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40190d = 100;

    public h(Context context) {
        this.f40188b = null;
        this.f40187a = context;
        this.f40188b = e();
        d();
    }

    private void b(File file) {
        File fileX = com.apm.lite.k.o.x(this.f40187a);
        file.renameTo(new File(fileX, String.valueOf(System.currentTimeMillis())));
        String[] list = fileX.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(fileX, list[0]).delete();
        }
    }

    private void d() {
        this.f40189c = a.a(this.f40189c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f40190d = a.a(this.f40190d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> e() {
        File fileZ = com.apm.lite.k.o.z(this.f40187a);
        HashMap<String, Long> map = new HashMap<>();
        map.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray jSONArrayU = com.apm.lite.k.i.u(fileZ.getAbsolutePath());
            if (com.apm.lite.k.l.f(jSONArrayU)) {
                return map;
            }
            Long lDecode = Long.decode(jSONArrayU.optString(0, null));
            if (System.currentTimeMillis() - lDecode.longValue() > 86400000) {
                b(fileZ);
                return map;
            }
            map.put("time", lDecode);
            for (int i10 = 1; i10 < jSONArrayU.length(); i10++) {
                String[] strArrSplit = jSONArrayU.optString(i10, "").split(" ");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], Long.decode(strArrSplit[1]));
                }
            }
            return map;
        } catch (IOException unused) {
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
        }
    }

    public void a() throws Throwable {
        HashMap<String, Long> map = this.f40188b;
        Long lRemove = map.remove("time");
        if (lRemove == null) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lRemove);
        sb2.append('\n');
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(' ');
            sb2.append(entry.getValue());
            sb2.append('\n');
        }
        try {
            com.apm.lite.k.i.j(com.apm.lite.k.o.z(this.f40187a), sb2.toString(), false);
        } catch (IOException unused) {
        }
    }

    public boolean c(String str) {
        if (str == null) {
            str = "default";
        }
        return com.apm.lite.k.r.b(this.f40188b, str, 1L).longValue() < ((long) this.f40189c) && com.apm.lite.k.r.b(this.f40188b, "all", 1L).longValue() < ((long) this.f40190d);
    }
}
