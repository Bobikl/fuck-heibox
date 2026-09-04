package com.tencent.beacon.event.b;

import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.f;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.EventType;
import java.util.Map;

/* JADX INFO: compiled from: DTEventHandler.java */
/* JADX INFO: loaded from: classes4.dex */
public class a extends c {
    @Override // com.tencent.beacon.event.b.c
    protected BeaconEvent a(BeaconEvent beaconEvent) {
        EventType type = beaconEvent.getType();
        if (type == EventType.DT_REALTIME || type == EventType.DT_NORMAL) {
            Map<String, String> params = beaconEvent.getParams();
            e eVarL = e.l();
            f fVarE = f.e();
            params.put("dt_imei2", "" + fVarE.c());
            params.put("dt_meid", "" + fVarE.g());
            params.put("dt_mf", "" + eVarL.o());
            beaconEvent.setParams(params);
        }
        return beaconEvent;
    }
}
