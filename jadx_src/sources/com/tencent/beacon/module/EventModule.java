package com.tencent.beacon.module;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.n0;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.b.f;
import com.tencent.beacon.a.b.g;
import com.tencent.beacon.base.net.c.e;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.b.a;
import com.tencent.beacon.event.b.b;
import com.tencent.beacon.event.b.c;
import com.tencent.beacon.event.h;
import com.tencent.beacon.event.immediate.IBeaconImmediateReport;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.qimei.sdk.Qimei;
import com.tencent.qimei.sdk.QimeiSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class EventModule implements BeaconModule, d, e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Map<String, String>> f99212a = new ConcurrentHashMap(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f99213b = new ConcurrentHashMap(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f99214c = new ConcurrentHashMap(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<c> f99215d = new ArrayList(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicInteger f99216e = new AtomicInteger(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f99217f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f99218g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private StrategyModule f99219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f99220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f99221j;

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Integer> map, Map<String, Integer> map2) {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(map.keySet());
        hashSet.addAll(map2.keySet());
        if (hashSet.isEmpty()) {
            f.e().a("702", String.format("real_logid_count=%s&normal_logid_count=%s&appkey=%s", 0, 0, com.tencent.beacon.a.c.c.d().f()));
            return;
        }
        for (String str : hashSet) {
            f.e().a("702", String.format("real_logid_count=%s&normal_logid_count=%s&appkey=%s", Integer.valueOf(map.containsKey(str) ? map.get(str).intValue() : 0), Integer.valueOf(map2.containsKey(str) ? map2.get(str).intValue() : 0), str));
        }
    }

    private String d(String str) {
        return TextUtils.isEmpty(str) ? com.tencent.beacon.a.c.c.d().f() : str;
    }

    private void e() {
        this.f99215d.add(new b());
        this.f99215d.add(new a());
        for (int i10 = 1; i10 < this.f99215d.size(); i10++) {
            this.f99215d.get(i10 - 1).a(this.f99215d.get(i10));
        }
    }

    private void f() {
        com.tencent.beacon.a.a.b.a().a(7, this);
        if (this.f99218g) {
            com.tencent.beacon.event.d dVar = new com.tencent.beacon.event.d();
            this.f99220i = dVar;
            dVar.a();
        }
    }

    private void g() {
        com.tencent.beacon.a.a.b.a().a(3, this);
        com.tencent.beacon.a.a.b.a().a(4, this);
        com.tencent.beacon.a.a.b.a().a(6, this);
        com.tencent.beacon.a.a.b.a().a(1, this);
    }

    private void h() {
        com.tencent.beacon.a.b.a.a().a(3000).postAtFrontOfQueue(new Runnable() { // from class: com.tencent.beacon.module.EventModule.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.tencent.beacon.event.a.a aVarA = com.tencent.beacon.event.a.a.a();
                    Map<String, Integer> mapB = aVarA.b("t_r_e");
                    EventModule.this.a(mapB, aVarA.b("t_n_e"));
                } catch (Throwable th2) {
                    com.tencent.beacon.base.util.c.a(th2);
                    g.e().a("204", "error while storageReport", th2);
                }
            }
        });
    }

    public EventResult a(@n0 BeaconEvent beaconEvent) {
        StrategyModule strategyModule;
        com.tencent.beacon.base.util.c.a("[EventModule]", 0, "event: %s. go in EventModule", beaconEvent.getCode());
        if (!this.f99218g) {
            com.tencent.beacon.base.util.c.a("[EventModule]", 1, "event: %s. EventModule is not enable", beaconEvent.getCode());
            return EventResult.a.a(102);
        }
        com.tencent.beacon.base.util.e.a(beaconEvent.getParams());
        StrategyModule strategyModule2 = this.f99219h;
        if (strategyModule2 != null && strategyModule2.b().a(beaconEvent.getCode())) {
            com.tencent.beacon.base.util.c.a("[EventModule]", 1, "event: %s.  is not allowed in strategy (false)", beaconEvent.getCode());
            return EventResult.a.a(100);
        }
        if (beaconEvent.isSucceed() && (strategyModule = this.f99219h) != null && !strategyModule.b().b(beaconEvent.getCode())) {
            com.tencent.beacon.base.util.c.a("[EventModule]", 1, "event: %s. is sampled by svr rate (false)", beaconEvent.getCode());
            return EventResult.a.a(101);
        }
        beaconEvent.setAppKey(d(beaconEvent.getAppKey()));
        EventBean eventBeanB = this.f99215d.get(0).b(beaconEvent);
        if (eventBeanB == null) {
            return EventResult.a.a(105);
        }
        Qimei qimei = QimeiSDK.getInstance(com.tencent.beacon.a.c.c.d().f()).getQimei();
        if (qimei == null || qimei.isEmpty()) {
            if (this.f99216e.addAndGet(1) > 64) {
                String str = String.format("qimei empty cache count over max , appKey: %s, event: %s", beaconEvent.getAppKey(), beaconEvent.getCode());
                com.tencent.beacon.base.util.c.a(str, new Object[0]);
                if (this.f99217f.compareAndSet(false, true)) {
                    g.e().a("510", str);
                }
            } else {
                com.tencent.beacon.base.util.c.a("qimei empty and add to cache , appKey: %s, event: %s", beaconEvent.getAppKey(), beaconEvent.getCode());
                BeaconEvent beaconEventBuild = BeaconEvent.newBuilder(beaconEvent).build();
                HashMap map = new HashMap();
                map.put("e_q_e_k", beaconEventBuild);
                com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(12, map));
            }
        }
        int eventType = eventBeanB.getEventType();
        if (eventType == 2 || eventType == 3) {
            IBeaconImmediateReport immediateReport = BeaconReport.getInstance().getImmediateReport();
            com.tencent.beacon.base.util.e.a("immediateReport", immediateReport);
            if (immediateReport != null) {
                return this.f99220i.a(beaconEvent.getParams().get("A100"), eventBeanB);
            }
            com.tencent.beacon.base.util.c.a("immediateReport is null!", new Object[0]);
            g.e().a("515", "immediateReport is null!");
        }
        return this.f99220i.b(beaconEvent.getParams().get("A100"), eventBeanB);
    }

    public Map<String, String> a(String str) {
        return f99212a.get(d(str));
    }

    @Override // com.tencent.beacon.base.net.c.e.a
    public void a() {
        this.f99220i.b();
    }

    @Override // com.tencent.beacon.module.BeaconModule
    public void a(Context context) {
        h();
        this.f99219h = (StrategyModule) BeaconModule.f99211a.get(ModuleName.STRATEGY);
        e();
        f();
        g();
        e.a(context, this);
        this.f99221j = true;
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        int i10 = cVar.f98739a;
        if (i10 == 1) {
            com.tencent.beacon.a.a.b.a().a(12, this);
            return;
        }
        if (i10 == 12) {
            Object obj = cVar.f98740b.get("e_q_e_k");
            if (obj instanceof BeaconEvent) {
                BeaconEvent beaconEvent = (BeaconEvent) obj;
                beaconEvent.getParams().put("A93", "Y");
                com.tencent.beacon.base.util.c.a("qimei empty cache report , appKey: %s, event: %s", beaconEvent.getAppKey(), beaconEvent.getCode());
                a(beaconEvent);
                return;
            }
            return;
        }
        if (i10 == 3) {
            a((String) cVar.f98740b.get("i_c_ak"), (HashMap) cVar.f98740b.get("i_c_ad"));
            return;
        }
        if (i10 == 4) {
            b((String) cVar.f98740b.get("i_c_ak"), (String) cVar.f98740b.get("i_c_u_i"));
            return;
        }
        if (i10 == 5) {
            a((String) cVar.f98740b.get("i_c_ak"), (String) cVar.f98740b.get("i_c_o_i"));
            return;
        }
        if (i10 != 6) {
            if (i10 != 7) {
                return;
            }
            this.f99218g = ((Boolean) cVar.f98740b.get("s_e_e")).booleanValue();
        } else {
            Object obj2 = cVar.f98740b.get("b_e");
            if (obj2 instanceof BeaconEvent) {
                a((BeaconEvent) obj2);
            }
        }
    }

    public void a(String str, String str2) {
        f99214c.put(d(str), com.tencent.beacon.event.c.d.c(str2));
    }

    public void a(String str, Map<String, String> map) {
        if (map == null || map.isEmpty() || map.size() >= 50) {
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(map == null ? 0 : map.size());
            com.tencent.beacon.base.util.c.a("setAdditionalParams error , params.size: %s", objArr);
            return;
        }
        String strD = d(str);
        Map<String, Map<String, String>> map2 = f99212a;
        Map<String, String> map3 = map2.get(strD);
        if (map3 == null) {
            map2.put(strD, new HashMap(map));
            return;
        }
        if (map3.size() + map.size() >= 50) {
            com.tencent.beacon.base.util.c.a("setAdditionalParams error , params.size: can not more than 50", new Object[0]);
            return;
        }
        HashMap map4 = new HashMap();
        map4.putAll(map3);
        map4.putAll(map);
        map2.put(strD, map4);
    }

    public void a(boolean z10) {
        h hVar = this.f99220i;
        if (hVar != null) {
            hVar.a(z10);
        }
    }

    @n0
    public String b(String str) {
        String str2;
        String strD = d(str);
        return (TextUtils.isEmpty(strD) || (str2 = f99214c.get(strD)) == null) ? "" : str2;
    }

    @Override // com.tencent.beacon.base.net.c.e.a
    public void b() {
        this.f99220i.c();
    }

    public void b(String str, String str2) {
        f99213b.put(d(str), com.tencent.beacon.event.c.d.e(str2));
    }

    public void b(boolean z10) {
        this.f99218g = z10;
    }

    public h c() {
        return this.f99220i;
    }

    @n0
    public String c(String str) {
        String str2;
        String strD = d(str);
        return (TextUtils.isEmpty(strD) || (str2 = f99213b.get(strD)) == null) ? "10000" : str2;
    }

    public boolean d() {
        return this.f99221j;
    }
}
