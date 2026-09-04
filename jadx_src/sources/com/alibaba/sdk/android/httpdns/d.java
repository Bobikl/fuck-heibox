package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import com.alibaba.sdk.android.httpdns.probe.IPProbeService;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f37917a = new d();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static IPProbeService f24a = com.alibaba.sdk.android.httpdns.probe.d.a(new com.alibaba.sdk.android.httpdns.probe.b() { // from class: com.alibaba.sdk.android.httpdns.d.1
        @Override // com.alibaba.sdk.android.httpdns.probe.b
        public void a(String str, String[] strArr) {
            e eVar;
            if (str == null || strArr == null || strArr.length == 0 || (eVar = (e) d.f25a.get(str)) == null) {
                return;
            }
            e eVar2 = new e(str, strArr, eVar.a(), eVar.b(), eVar.m23a(), eVar.getCacheKey());
            d.f25a.put(str, eVar2);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < eVar2.getIps().length; i10++) {
                sb2.append(eVar2.getIps()[i10] + Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            i.f("optimized host:" + str + ", ip:" + sb2.toString());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ConcurrentMap<String, e> f25a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ConcurrentSkipListSet<String> f26a;

    private d() {
        f25a = new ConcurrentHashMap();
        f26a = new ConcurrentSkipListSet<>();
    }

    static d a() {
        return f37917a;
    }

    private IPProbeItem a(String str) {
        List<IPProbeItem> list = f.f31a;
        if (list == null) {
            return null;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (str.equals(list.get(i10).getHostName())) {
                return list.get(i10);
            }
        }
        return null;
    }

    private boolean a(com.alibaba.sdk.android.httpdns.b.e eVar) {
        return (System.currentTimeMillis() / 1000) - com.alibaba.sdk.android.httpdns.b.c.a(eVar.f37908n) > 604800;
    }

    private boolean a(String str, e eVar) {
        IPProbeItem iPProbeItemA;
        if (eVar == null || eVar.getIps() == null || eVar.getIps().length <= 1 || f24a == null || (iPProbeItemA = a(str)) == null) {
            return false;
        }
        if (f24a.getProbeStatus(str) == IPProbeService.a.PROBING) {
            f24a.stopIPProbeTask(str);
        }
        i.f("START PROBE");
        f24a.launchIPProbeTask(str, iPProbeItemA.getPort(), eVar.getIps());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        List<com.alibaba.sdk.android.httpdns.b.e> listA = com.alibaba.sdk.android.httpdns.b.b.a();
        String strI = com.alibaba.sdk.android.httpdns.b.b.i();
        for (com.alibaba.sdk.android.httpdns.b.e eVar : listA) {
            if (a(eVar)) {
                com.alibaba.sdk.android.httpdns.b.b.b(eVar);
            } else if (strI.equals(eVar.f37907m)) {
                eVar.f37908n = String.valueOf(System.currentTimeMillis() / 1000);
                e eVar2 = new e(eVar);
                f25a.put(eVar.host, eVar2);
                if (com.alibaba.sdk.android.httpdns.b.b.g()) {
                    com.alibaba.sdk.android.httpdns.b.b.b(eVar);
                }
                a(eVar.host, eVar2);
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    e m15a(String str) {
        return f25a.get(str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    ArrayList<String> m16a() {
        return new ArrayList<>(f25a.keySet());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    void m17a() {
        if (com.alibaba.sdk.android.httpdns.b.b.m10a()) {
            c.a().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        d.this.b();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    void m18a(String str) {
        f26a.add(str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    void m19a(String str, e eVar) {
        ArrayList<com.alibaba.sdk.android.httpdns.b.g> arrayList;
        f25a.put(str, eVar);
        if (com.alibaba.sdk.android.httpdns.b.b.m10a()) {
            com.alibaba.sdk.android.httpdns.b.e eVarM22a = eVar.m22a();
            ArrayList<com.alibaba.sdk.android.httpdns.b.g> arrayList2 = eVarM22a.f20a;
            if ((arrayList2 == null || arrayList2.size() <= 0) && ((arrayList = eVarM22a.f21b) == null || arrayList.size() <= 0)) {
                com.alibaba.sdk.android.httpdns.b.b.b(eVarM22a);
            } else {
                com.alibaba.sdk.android.httpdns.b.b.a(eVarM22a);
            }
        }
        a(str, eVar);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    boolean m20a(String str) {
        return f26a.contains(str);
    }

    void b(String str) {
        f26a.remove(str);
    }

    void clear() {
        f25a.clear();
        f26a.clear();
    }

    int count() {
        return f25a.size();
    }
}
