package com.tencent.beacon.event.b;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.f;
import com.tencent.beacon.a.c.j;
import com.tencent.beacon.event.c.g;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.EventType;
import com.tencent.beacon.module.EventModule;
import com.tencent.beacon.module.ModuleName;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DefEventHandler.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends c implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f99063b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f99064c;

    public b() {
        com.tencent.beacon.a.a.b.a().a(2, this);
    }

    private boolean c(BeaconEvent beaconEvent) {
        return beaconEvent.getType() == EventType.IMMEDIATE_WNS || beaconEvent.getType() == EventType.IMMEDIATE_MSF;
    }

    @Override // com.tencent.beacon.event.b.c
    BeaconEvent a(BeaconEvent beaconEvent) {
        if (this.f99063b && !com.tencent.beacon.base.util.b.a(beaconEvent.getCode())) {
            return beaconEvent;
        }
        com.tencent.beacon.a.c.c cVarD = com.tencent.beacon.a.c.c.d();
        Context contextC = cVarD.c();
        Map<String, String> params = beaconEvent.getParams();
        params.put("A3", j.c());
        params.put("A153", j.d());
        params.put("A157", j.f());
        params.put("A143", com.tencent.beacon.a.c.c.d().g());
        params.put("A144", f.e().i());
        params.put("A19", e.l().q());
        params.put(Constants.SOURCE_QQ, com.tencent.beacon.a.c.b.c());
        params.put("A95", "" + com.tencent.beacon.a.c.b.a());
        params.put("A141", j.g());
        params.put("A23", cVarD.a());
        params.put("A48", com.tencent.beacon.a.c.c.d().e());
        String appKey = beaconEvent.getAppKey();
        EventModule eventModule = (EventModule) cVarD.a(ModuleName.EVENT);
        params.put("A1", eventModule.c(appKey));
        params.put("A8", eventModule.b(appKey));
        params.put("A99", beaconEvent.getLogidPrefix());
        params.put("A72", cVarD.j());
        params.put("A159", e.l().E());
        params.put("A34", String.valueOf(com.tencent.beacon.base.util.b.c()));
        params.put("A156", c(beaconEvent) ? "Y" : "N");
        if (!params.containsKey("A88")) {
            if (TextUtils.isEmpty(this.f99064c)) {
                this.f99064c = com.tencent.beacon.a.c.b.a(contextC);
            }
            params.put("A88", this.f99064c);
        }
        params.put("A100", g.a(contextC, appKey).a(beaconEvent.getCode(), beaconEvent.getType()));
        Map<String, String> mapA = eventModule.a(appKey);
        if (mapA != null) {
            params.putAll(mapA);
        }
        beaconEvent.setParams(params);
        return beaconEvent;
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        HashMap map;
        if (cVar.f98739a == 2 && (map = (HashMap) cVar.f98740b.get("d_m")) != null) {
            this.f99063b = com.tencent.beacon.base.util.b.a((String) map.get("tidyEF"), this.f99063b);
        }
    }
}
