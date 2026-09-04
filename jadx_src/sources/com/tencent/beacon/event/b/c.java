package com.tencent.beacon.event.b;

import androidx.annotation.p0;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.open.BeaconEvent;

/* JADX INFO: compiled from: EventHandler.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f99065a;

    abstract BeaconEvent a(BeaconEvent beaconEvent);

    public void a(c cVar) {
        this.f99065a = cVar;
    }

    @p0
    public final EventBean b(BeaconEvent beaconEvent) {
        BeaconEvent beaconEventA = a(beaconEvent);
        c cVar = this.f99065a;
        return cVar != null ? cVar.b(beaconEventA) : com.tencent.beacon.event.c.a.a(beaconEventA);
    }
}
