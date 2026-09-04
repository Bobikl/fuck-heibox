package com.tencent.beacon.event;

import com.tencent.beacon.event.immediate.BeaconImmediateReportCallback;
import com.tencent.beacon.event.open.BeaconReport;

/* JADX INFO: compiled from: EventManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EventBean f99060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f99061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f99062c;

    b(d dVar, EventBean eventBean, String str) {
        this.f99062c = dVar;
        this.f99060a = eventBean;
        this.f99061b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            BeaconReport.getInstance().getImmediateReport().reportImmediate(this.f99062c.a(com.tencent.beacon.event.c.d.a(this.f99060a).toByteArray(), this.f99060a.getEventType()), new BeaconImmediateReportCallback(this.f99062c, this.f99060a, this.f99061b));
        } catch (Throwable th2) {
            com.tencent.beacon.base.util.c.b("[immediate] report error!", new Object[0]);
            com.tencent.beacon.base.util.c.a(th2);
            this.f99062c.a(this.f99060a, this.f99061b);
            com.tencent.beacon.a.b.g.e().a("515", "immediate report error!", th2);
        }
    }
}
