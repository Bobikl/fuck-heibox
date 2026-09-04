package com.xiaomi.clientreport.manager;

import android.content.Context;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.push.ah;
import com.xiaomi.push.bp;
import com.xiaomi.push.by;
import com.xiaomi.push.bz;
import com.xiaomi.push.ca;
import com.xiaomi.push.cb;
import com.xiaomi.push.ce;
import com.xiaomi.push.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f106717a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static volatile a f87a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f88a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Config f89a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private IEventProcessor f90a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private IPerfProcessor f91a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f92a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ExecutorService f94a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> f93a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> f106718b = new HashMap<>();

    static {
        f106717a = j.m520a() ? 30 : 10;
    }

    private a(Context context) {
        this.f88a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a() {
        HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> map = this.f106718b;
        if (map == null) {
            return 0;
        }
        Iterator<String> it = map.keySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.f106718b.get(it.next());
            size += arrayList != null ? arrayList.size() : 0;
        }
        return size;
    }

    public static a a(Context context) {
        if (f87a == null) {
            synchronized (a.class) {
                if (f87a == null) {
                    f87a = new a(context);
                }
            }
        }
        return f87a;
    }

    private void a(ah.a aVar, int i10) {
        ah.a(this.f88a).b(aVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> map = this.f93a;
        int i10 = 0;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, com.xiaomi.clientreport.data.a> map2 = this.f93a.get(it.next());
                if (map2 != null) {
                    Iterator<String> it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        com.xiaomi.clientreport.data.a aVar = map2.get(it2.next());
                        if (aVar instanceof PerfClientReport) {
                            i10 = (int) (((long) i10) + ((PerfClientReport) aVar).perfCounts);
                        }
                    }
                }
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(EventClientReport eventClientReport) {
        IEventProcessor iEventProcessor = this.f90a;
        if (iEventProcessor != null) {
            iEventProcessor.mo75a(eventClientReport);
            if (a() < 10) {
                a(new d(this), f106717a);
            } else {
                d();
                ah.a(this.f88a).m145a("100888");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(PerfClientReport perfClientReport) {
        IPerfProcessor iPerfProcessor = this.f91a;
        if (iPerfProcessor != null) {
            iPerfProcessor.mo75a(perfClientReport);
            if (b() < 10) {
                a(new f(this), f106717a);
            } else {
                e();
                ah.a(this.f88a).m145a("100889");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f90a.b();
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.d("we: " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.f91a.b();
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.d("wp: " + e10.getMessage());
        }
    }

    private void f() {
        if (a(this.f88a).m72a().isEventUploadSwitchOpen()) {
            by byVar = new by(this.f88a);
            int eventUploadFrequency = (int) a(this.f88a).m72a().getEventUploadFrequency();
            if (eventUploadFrequency < 1800) {
                eventUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - ce.a(this.f88a).a("sp_client_report_status", "event_last_upload_time", 0L) > eventUploadFrequency * 1000) {
                ah.a(this.f88a).a(new h(this, byVar), 10);
            }
            synchronized (a.class) {
                if (!ah.a(this.f88a).a((ah.a) byVar, eventUploadFrequency)) {
                    ah.a(this.f88a).m145a("100886");
                    ah.a(this.f88a).a((ah.a) byVar, eventUploadFrequency);
                }
            }
        }
    }

    private void g() {
        if (a(this.f88a).m72a().isPerfUploadSwitchOpen()) {
            bz bzVar = new bz(this.f88a);
            int perfUploadFrequency = (int) a(this.f88a).m72a().getPerfUploadFrequency();
            if (perfUploadFrequency < 1800) {
                perfUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - ce.a(this.f88a).a("sp_client_report_status", "perf_last_upload_time", 0L) > perfUploadFrequency * 1000) {
                ah.a(this.f88a).a(new i(this, bzVar), 15);
            }
            synchronized (a.class) {
                if (!ah.a(this.f88a).a((ah.a) bzVar, perfUploadFrequency)) {
                    ah.a(this.f88a).m145a("100887");
                    ah.a(this.f88a).a((ah.a) bzVar, perfUploadFrequency);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized Config m72a() {
        if (this.f89a == null) {
            this.f89a = Config.defaultConfig(this.f88a);
        }
        return this.f89a;
    }

    public EventClientReport a(int i10, String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.eventContent = str;
        eventClientReport.eventTime = System.currentTimeMillis();
        eventClientReport.eventType = i10;
        eventClientReport.eventId = bp.a(6);
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = "E100004";
        eventClientReport.setAppPackageName(this.f88a.getPackageName());
        eventClientReport.setSdkVersion(this.f92a);
        return eventClientReport;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m73a() {
        a(this.f88a).f();
        a(this.f88a).g();
    }

    public void a(Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        this.f89a = config;
        this.f90a = iEventProcessor;
        this.f91a = iPerfProcessor;
        iEventProcessor.setEventMap(this.f106718b);
        this.f91a.setPerfMap(this.f93a);
    }

    public void a(EventClientReport eventClientReport) {
        if (m72a().isEventUploadSwitchOpen()) {
            this.f94a.execute(new b(this, eventClientReport));
        }
    }

    public void a(PerfClientReport perfClientReport) {
        if (m72a().isPerfUploadSwitchOpen()) {
            this.f94a.execute(new c(this, perfClientReport));
        }
    }

    public void a(String str) {
        this.f92a = str;
    }

    public void a(boolean z10, boolean z11, long j10, long j11) {
        Config config = this.f89a;
        if (config != null) {
            if (z10 == config.isEventUploadSwitchOpen() && z11 == this.f89a.isPerfUploadSwitchOpen() && j10 == this.f89a.getEventUploadFrequency() && j11 == this.f89a.getPerfUploadFrequency()) {
                return;
            }
            long eventUploadFrequency = this.f89a.getEventUploadFrequency();
            long perfUploadFrequency = this.f89a.getPerfUploadFrequency();
            Config configBuild = Config.getBuilder().setAESKey(cb.a(this.f88a)).setEventEncrypted(this.f89a.isEventEncrypted()).setEventUploadSwitchOpen(z10).setEventUploadFrequency(j10).setPerfUploadSwitchOpen(z11).setPerfUploadFrequency(j11).build(this.f88a);
            this.f89a = configBuild;
            if (!configBuild.isEventUploadSwitchOpen()) {
                ah.a(this.f88a).m145a("100886");
            } else if (eventUploadFrequency != configBuild.getEventUploadFrequency()) {
                com.xiaomi.channel.commonutils.logger.b.c(this.f88a.getPackageName() + "reset event job " + configBuild.getEventUploadFrequency());
                f();
            }
            if (!this.f89a.isPerfUploadSwitchOpen()) {
                ah.a(this.f88a).m145a("100887");
                return;
            }
            if (perfUploadFrequency != configBuild.getPerfUploadFrequency()) {
                com.xiaomi.channel.commonutils.logger.b.c(this.f88a.getPackageName() + " reset perf job " + configBuild.getPerfUploadFrequency());
                g();
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m74b() {
        if (m72a().isEventUploadSwitchOpen()) {
            ca caVar = new ca();
            caVar.a(this.f88a);
            caVar.a(this.f90a);
            this.f94a.execute(caVar);
        }
    }

    public void c() {
        if (m72a().isPerfUploadSwitchOpen()) {
            ca caVar = new ca();
            caVar.a(this.f91a);
            caVar.a(this.f88a);
            this.f94a.execute(caVar);
        }
    }
}
