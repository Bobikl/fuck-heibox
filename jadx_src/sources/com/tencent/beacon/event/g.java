package com.tencent.beacon.event;

import com.tencent.beacon.base.net.a.m;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: EventReportTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class g implements Runnable, com.tencent.beacon.a.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f99118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f99119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.tencent.beacon.event.a.a f99120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<Long> f99121d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<Long> f99122e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Long> f99123f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f99124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f99125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f99126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f99127j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f99128k;

    public g(int i10, com.tencent.beacon.event.a.a aVar, boolean z10) {
        this.f99119b = i10;
        this.f99120c = aVar;
        this.f99125h = z10;
        String str = z10 ? "t_r_e" : "t_n_e";
        this.f99118a = str;
        this.f99126i = 48;
        this.f99124g = "[EventReport (" + str + ")]";
    }

    private void a(List<EventBean> list, Set<Long> set) {
        m mVarA = com.tencent.beacon.event.c.d.a(list, this.f99125h);
        com.tencent.beacon.base.util.c.a(this.f99124g, 2, "event request entity: %s", mVarA.toString());
        com.tencent.beacon.base.net.d.c().a(mVarA).a(new f(this, this.f99118a, this.f99120c, set, this.f99128k));
    }

    private List<EventBean> b() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Long> it = this.f99121d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        return this.f99120c.a(this.f99118a, sb2.length() > 0 ? sb2.substring(0, sb2.lastIndexOf(Constants.ACCEPT_TIME_SEPARATOR_SP)) : "", this.f99126i);
    }

    private void c() {
        com.tencent.beacon.a.a.b.a().a(2, this);
    }

    public int a() {
        return this.f99126i;
    }

    public void a(long j10) {
        synchronized (this.f99123f) {
            this.f99123f.add(Long.valueOf(j10));
            if (this.f99123f.size() >= 10) {
                long jLongValue = 0;
                Iterator<Long> it = this.f99123f.iterator();
                while (it.hasNext()) {
                    jLongValue += it.next().longValue();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jLongValue / ((long) this.f99123f.size()));
                sb2.append("");
                com.tencent.beacon.a.b.f.e().a("703", sb2.toString());
                this.f99123f.clear();
            }
        }
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        Map map;
        if (cVar.f98739a != 2 || (map = (Map) cVar.f98740b.get("d_m")) == null) {
            return;
        }
        if (this.f99125h) {
            this.f99126i = com.tencent.beacon.base.util.b.a((String) map.get("realtimeUploadNum"), this.f99126i, 24, 100);
        } else {
            this.f99126i = com.tencent.beacon.base.util.b.a((String) map.get("normalUploadNum"), this.f99126i, 24, 100);
        }
    }

    public void a(Set<Long> set) {
        synchronized (this.f99121d) {
            this.f99121d.removeAll(set);
            set.clear();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f99127j) {
            c();
            this.f99127j = true;
        }
        if (!com.tencent.beacon.base.net.c.d.d() || com.tencent.beacon.base.net.d.c().d()) {
            com.tencent.beacon.a.b.a.a().a(this.f99119b, false);
            return;
        }
        synchronized (this.f99121d) {
            com.tencent.beacon.base.util.c.a(this.f99124g, 0, "start read EventBean from DB.", new Object[0]);
            List<EventBean> listB = b();
            if (listB != null && !listB.isEmpty()) {
                HashMap map = new HashMap();
                for (EventBean eventBean : listB) {
                    long cid = eventBean.getCid();
                    this.f99121d.add(Long.valueOf(cid));
                    this.f99122e.add(Long.valueOf(cid));
                    Map<String, String> eventValue = eventBean.getEventValue();
                    if (eventValue != null) {
                        String appKey = eventBean.getAppKey();
                        String string = (String) map.get(appKey);
                        if (string == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(appKey);
                            sb2.append(": ");
                            string = sb2.toString();
                        }
                        String str = eventValue.get("A100");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(string);
                        sb3.append(str);
                        sb3.append(", ");
                        map.put(appKey, sb3.toString());
                    }
                }
                StringBuilder sb4 = new StringBuilder("--logID: \n");
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    sb4.append((String) ((Map.Entry) it.next()).getValue());
                    sb4.append("\n");
                }
                String string2 = sb4.toString();
                this.f99128k = string2;
                com.tencent.beacon.base.util.c.a(this.f99124g, 1, "send LogID: %s", string2);
                a(listB, this.f99122e);
                listB.clear();
                this.f99122e.clear();
                return;
            }
            com.tencent.beacon.base.util.c.a(this.f99124g, 1, "EventBean List == null. Task end!", new Object[0]);
            com.tencent.beacon.a.b.a.a().a(this.f99119b, false);
        }
    }
}
