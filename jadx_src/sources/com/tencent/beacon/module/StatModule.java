package com.tencent.beacon.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.f;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.e.b;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class StatModule implements BeaconModule, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f99228a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f99231d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f99229b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f99230c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f99232e = 0;

    /* JADX INFO: renamed from: com.tencent.beacon.module.StatModule$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f99242a;

        @Override // java.lang.Runnable
        public void run() {
            BeaconReport.getInstance().report(BeaconEvent.builder().withCode("rqd_sensor").withParams(this.f99242a).build());
        }
    }

    private void c() {
        ((Application) this.f99228a).registerActivityLifecycleCallbacks(new com.tencent.beacon.d.a.d(this));
    }

    private void d() {
        a aVarA = a.a();
        if (com.tencent.beacon.base.util.b.d().equals(aVarA.getString("rqd_model", ""))) {
            return;
        }
        com.tencent.beacon.a.b.a.a().a(50000L, new Runnable() { // from class: com.tencent.beacon.module.StatModule.1
            @Override // java.lang.Runnable
            public void run() {
                e eVarL = e.l();
                f fVarE = f.e();
                BeaconReport.getInstance().report(BeaconEvent.builder().withParams("A9", Build.BRAND).withParams("A10", fVarE.h()).withParams("A11", eVarL.g()).withParams("A12", eVarL.n()).withParams("A13", eVarL.z()).withParams("A14", eVarL.w() + "m").withParams("A15", eVarL.t() + "m").withParams("A16", eVarL.h()).withParams("A17", eVarL.u()).withParams("A18", "").withParams("A20", fVarE.j()).withParams("A30", eVarL.x() + "m").withParams("A19", eVarL.q()).withParams("A52", "" + eVarL.y()).withParams("A53", "" + eVarL.e() + "m").withParams("A54", "" + eVarL.r()).withParams("A55", eVarL.f()).withParams("A56", eVarL.D() ? "Y" : "N").withParams("A57", eVarL.A()).withParams("A58", eVarL.m() ? "Y" : "N").withParams("A59", eVarL.k() + "m").withParams("A69", fVarE.k()).withParams("A82", eVarL.v()).withType(EventType.REALTIME).withCode("rqd_model").build());
            }
        });
        a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = aVarA.edit();
        if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
            sharedPreferencesEditorC0949aEdit.putString("rqd_model", com.tencent.beacon.base.util.b.d());
        }
    }

    private void e() {
        if (this.f99231d.f()) {
            if (com.tencent.beacon.base.util.b.d().equals(a.a().getString("LAUEVE_DENGTA", ""))) {
                c.d("[event] APP_LAUNCHED_EVENT has been uploaded!", new Object[0]);
                return;
            }
        }
        e eVarL = e.l();
        HashMap map = new HashMap();
        map.put("A19", eVarL.q());
        map.put("A63", "Y");
        map.put("A21", com.tencent.beacon.a.c.b.g() ? "Y" : "N");
        map.put("A45", com.tencent.beacon.a.c.b.e(this.f99228a) ? "Y" : "N");
        map.put("A66", com.tencent.beacon.a.c.b.f(this.f99228a) ? "F" : "B");
        map.put("A68", "" + com.tencent.beacon.a.c.b.b(this.f99228a));
        map.put("A85", com.tencent.beacon.a.c.b.f98782d ? "Y" : "N");
        map.put("A9", Build.BRAND);
        map.put("A14", eVarL.w());
        f fVarE = f.e();
        map.put("A20", fVarE.j());
        map.put("A69", fVarE.k());
        if (b(map)) {
            a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = a.a().edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
                sharedPreferencesEditorC0949aEdit.putString("LAUEVE_DENGTA", com.tencent.beacon.base.util.b.d());
            }
        }
    }

    public void a() {
    }

    @Override // com.tencent.beacon.module.BeaconModule
    public void a(Context context) {
        this.f99228a = context;
        if (!com.tencent.beacon.a.c.b.g(context)) {
            c.a("non-main process. do not report rqd event", new Object[0]);
            return;
        }
        b bVarB = ((StrategyModule) BeaconModule.f99211a.get(ModuleName.STRATEGY)).b();
        this.f99231d = bVarB;
        this.f99230c = bVarB.g();
        ((Application) this.f99228a).registerActivityLifecycleCallbacks(new com.tencent.beacon.d.a.c(this));
        com.tencent.beacon.a.a.b.a().a(2, this);
        com.tencent.beacon.a.a.b.a().a(10, this);
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        int i10 = cVar.f98739a;
        if (i10 == 2) {
            Map map = (Map) cVar.f98740b.get("d_m");
            if (map != null) {
                this.f99229b = com.tencent.beacon.base.util.b.a((String) map.get("modelEventUsable"), this.f99229b);
                this.f99230c = com.tencent.beacon.base.util.b.a((String) map.get("isPagePath"), this.f99230c);
                return;
            }
            return;
        }
        if (i10 != 10) {
            return;
        }
        e();
        if (com.tencent.beacon.a.c.b.g(this.f99228a)) {
            new com.tencent.beacon.d.c(this.f99228a).a(this.f99231d);
        }
        if (this.f99229b) {
            d();
        }
        if (this.f99230c) {
            c();
        }
    }

    public void a(final String str, final long j10, final long j11) {
        com.tencent.beacon.a.b.a.a().a(new Runnable() { // from class: com.tencent.beacon.module.StatModule.2
            @Override // java.lang.Runnable
            public void run() {
                BeaconReport.getInstance().report(BeaconEvent.builder().withParams("A110", String.valueOf(j11)).withParams("A111", str).withParams("A112", String.valueOf(j10)).withCode("rqd_page_fgt").withType(EventType.REALTIME).build());
            }
        });
    }

    public void a(final Map<String, String> map) {
        com.tencent.beacon.a.b.a.a().a(new Runnable() { // from class: com.tencent.beacon.module.StatModule.5
            @Override // java.lang.Runnable
            public void run() {
                BeaconReport.getInstance().report(BeaconEvent.builder().withCode("rqd_appresumed").withIsSucceed(true).withParams(map).withType(EventType.REALTIME).build());
            }
        });
    }

    public void b() {
    }

    public void b(final String str, final long j10, final long j11) {
        com.tencent.beacon.a.b.a.a().a(new Runnable() { // from class: com.tencent.beacon.module.StatModule.3
            @Override // java.lang.Runnable
            public void run() {
                BeaconReport.getInstance().report(BeaconEvent.builder().withParams("A110", String.valueOf(j11)).withParams("A111", str).withParams("A112", String.valueOf(j10)).withCode("rqd_page").withType(EventType.NORMAL).build());
                StatModule.this.f99232e += j10;
                if (StatModule.this.f99232e >= 15000) {
                    StatModule.this.f99232e = 0L;
                }
            }
        });
    }

    public boolean b(Map<String, String> map) {
        return BeaconReport.getInstance().report(BeaconEvent.builder().withCode("rqd_applaunched").withParams(map).withType(EventType.REALTIME).build()).isSuccess();
    }

    public boolean c(Map<String, String> map) {
        return BeaconReport.getInstance().report(BeaconEvent.builder().withParams(map).withCode("rqd_heartbeat").withType(EventType.REALTIME).build()).isSuccess();
    }
}
