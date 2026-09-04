package com.tencent.beacon.event;

/* JADX INFO: compiled from: EventManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EventBean f99043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f99044b;

    a(d dVar, EventBean eventBean) {
        this.f99044b = dVar;
        this.f99043a = eventBean;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f99044b.f99104b.a(this.f99043a.getEventType())) {
            boolean zA = this.f99044b.f99104b.a(this.f99043a);
            com.tencent.beacon.base.util.c.a("[EventModule]", 2, "event: %s. insert to DB %s", this.f99043a.getEventCode(), Boolean.valueOf(zA));
            if (zA) {
                this.f99044b.b();
                return;
            }
            return;
        }
        com.tencent.beacon.a.b.g.e().a("602", "type: " + com.tencent.beacon.event.c.d.a(this.f99043a.getEventType()) + " max db count!");
        com.tencent.beacon.base.util.c.a("[EventModule]", 2, "event: %s. insert to DB false. reason: DB count max!", this.f99043a.getEventCode());
    }
}
