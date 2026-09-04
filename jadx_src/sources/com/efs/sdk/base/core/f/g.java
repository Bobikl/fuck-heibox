package com.efs.sdk.base.core.f;

import com.efs.sdk.base.core.controller.ControllerCenter;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends com.efs.sdk.base.core.f.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f42552b = new ConcurrentHashMap<>(10);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f42553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f42554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f42555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        AtomicInteger f42556d = new AtomicInteger(0);

        a(String str, String str2, String str3) {
            this.f42553a = str;
            this.f42554b = str2;
            this.f42555c = str3;
        }
    }

    @Override // com.efs.sdk.base.core.f.a
    public final void a() {
        try {
            if (this.f42534a != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                Iterator<Map.Entry<String, a>> it = this.f42552b.entrySet().iterator();
                while (it.hasNext()) {
                    a value = it.next().getValue();
                    int i10 = value.f42556d.get();
                    if (i10 > 0) {
                        ControllerCenter controllerCenter = this.f42534a;
                        String str = value.f42553a;
                        String str2 = value.f42554b;
                        String str3 = value.f42555c;
                        b bVar = new b("efs_core", "req_succ_rate", f.a.f42551a.f42547a.f42541c);
                        bVar.put("rep_code", str);
                        bVar.put("px_code", str2);
                        bVar.put(FlutterActivityLaunchConfigs.EXTRA_PATH, str3);
                        bVar.put("cnt", Integer.valueOf(i10));
                        controllerCenter.send(bVar);
                        value.f42556d.addAndGet(i10 * (-1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    final void a(String str, String str2, String str3) {
        String str4 = str + lg.a.f131412e + str2 + lg.a.f131412e + str3.trim();
        if (!this.f42552b.containsKey(str4) || this.f42552b.get(str4) == null) {
            this.f42552b.putIfAbsent(str4, new a(str, str2, str3));
        }
        this.f42552b.get(str4).f42556d.incrementAndGet();
    }
}
