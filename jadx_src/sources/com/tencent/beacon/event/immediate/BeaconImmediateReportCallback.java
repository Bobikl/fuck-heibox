package com.tencent.beacon.event.immediate;

import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.a.g;
import com.tencent.beacon.base.net.e;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.d;
import com.tencent.beacon.pack.ResponsePackageV2;
import com.tencent.beacon.pack.a;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class BeaconImmediateReportCallback implements g<BeaconTransferResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f99131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EventBean f99132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f99133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f99134d = new Date().getTime();

    public BeaconImmediateReportCallback(d dVar, EventBean eventBean, String str) {
        this.f99131a = dVar;
        this.f99132b = eventBean;
        this.f99133c = str;
    }

    private void a(e eVar) {
        c.a("[BeaconImmediateReportCallback]", eVar.toString(), new Object[0]);
        com.tencent.beacon.a.b.g.e().a(eVar.f98940b, eVar.f98942d, eVar.f98943e);
        this.f99131a.a(this.f99132b, this.f99133c);
    }

    public void onResponse(BeaconTransferResult beaconTransferResult) {
        if (beaconTransferResult == null) {
            a(new e(RequestType.LONG_CONNECTION.name(), "462", -1, "response fail! result is null"));
            return;
        }
        boolean z10 = beaconTransferResult.getCode() == 0 && beaconTransferResult.getBizCode() == 0;
        c.a("[BeaconImmediateReportCallback]", "result=%s, eventName=%s , logID=%s", beaconTransferResult.toString(), this.f99132b.getEventCode(), this.f99133c);
        if (!z10) {
            a(new e(RequestType.LONG_CONNECTION.name(), "463", beaconTransferResult.getCode(), c.c("response fail! result = %s", beaconTransferResult.toString())));
            return;
        }
        byte[] bizBuffer = beaconTransferResult.getBizBuffer();
        ResponsePackageV2 responsePackageV2 = new ResponsePackageV2();
        try {
            responsePackageV2.readFrom(new a(bizBuffer));
            com.tencent.beacon.base.net.c.d.a(this.f99134d, responsePackageV2.serverTime, responsePackageV2.srcGatewayIp);
        } catch (Throwable th2) {
            c.a(th2);
            a(new e(RequestType.LONG_CONNECTION.name(), "463", beaconTransferResult.getCode(), th2.getMessage(), th2));
        }
    }
}
