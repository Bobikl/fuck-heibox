package com.taobao.accs.net;

import com.taobao.accs.ACCSManager;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import java.util.UUID;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f98347a;

    l(k kVar) {
        this.f98347a = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ALog.d(this.f98347a.d(), "sendAccsHeartbeatMessage", new Object[0]);
        try {
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, null, new com.taobao.accs.utl.p.a().a("dataType", "pingreq").a("timeInterval", Long.valueOf(this.f98347a.f98336p)).a().toString().getBytes("utf-8"), UUID.randomUUID().toString());
            accsRequest.setTarget("accs-iot");
            accsRequest.setTargetServiceName("sal");
            k kVar = this.f98347a;
            this.f98347a.a(Message.buildRequest(kVar.f98300d, kVar.b((String) null), this.f98347a.d(), this.f98347a.f98305i.getStoreId(), this.f98347a.f98300d.getPackageName(), Constants.TARGET_SERVICE, accsRequest, true), true);
        } catch (Exception e10) {
            ALog.e(this.f98347a.d(), "send accs heartbeat message", e10, new Object[0]);
        }
    }
}
