package com.alibaba.sdk.android.httpdns.probe;

import com.alibaba.sdk.android.httpdns.i;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public class e implements IPProbeService {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private AtomicLong f48a = new AtomicLong(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f38002c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f38000a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f38001b = new f() { // from class: com.alibaba.sdk.android.httpdns.probe.e.1
        @Override // com.alibaba.sdk.android.httpdns.probe.f
        public void a(long j10, c cVar) {
            if (cVar != null) {
                try {
                    if (!e.this.f38002c.containsKey(cVar.getHostName()) || ((Long) e.this.f38002c.get(cVar.getHostName())).longValue() != j10) {
                        i.d("corresponding tasknumber not exists, drop the result");
                    } else if (cVar.getIps() != null && cVar.j() != null && cVar.k() != null && cVar.getHostName() != null) {
                        i.e("defultId:" + cVar.j() + ", selectedIp:" + cVar.k() + ", promote:" + (cVar.c() - cVar.d()));
                        e.this.a(cVar.getHostName(), cVar.j(), cVar.k(), cVar.c(), cVar.d(), cVar.getIps().length);
                        e.this.f38000a.a(cVar.getHostName(), cVar.getIps());
                        e.this.f38002c.remove(cVar.getHostName());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, long j10, long j11, int i10) {
        com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
        if (bVarA != null) {
            bVarA.a(str, str2, str3, j10, j11, i10);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public IPProbeService.a getProbeStatus(String str) {
        return this.f38002c.containsKey(str) ? IPProbeService.a.PROBING : IPProbeService.a.NO_PROBING;
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public void launchIPProbeTask(String str, int i10, String[] strArr) {
        if (!com.alibaba.sdk.android.httpdns.a.a.a().f()) {
            i.f("ip probe is forbidden");
        } else {
            if (getProbeStatus(str) != IPProbeService.a.NO_PROBING) {
                i.f("already launch the same task, drop the task");
                return;
            }
            long jAddAndGet = this.f48a.addAndGet(1L);
            this.f38002c.put(str, Long.valueOf(jAddAndGet));
            com.alibaba.sdk.android.httpdns.c.a().execute(new a(jAddAndGet, str, strArr, i10, this.f38001b));
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public void setIPListUpdateCallback(b bVar) {
        this.f38000a = bVar;
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public boolean stopIPProbeTask(String str) {
        if (!this.f38002c.containsKey(str)) {
            return false;
        }
        i.d("stop ip probe task for host:" + str);
        this.f38002c.remove(str);
        return true;
    }
}
