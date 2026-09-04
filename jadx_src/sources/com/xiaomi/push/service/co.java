package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes4.dex */
public class co implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f107998a;

    co(XMPushService xMPushService) {
        this.f107998a = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f107998a.f974a = true;
        try {
            com.xiaomi.channel.commonutils.logger.b.m62a("try to trigger the wifi digest broadcast.");
            Object systemService = this.f107998a.getApplicationContext().getSystemService("MiuiWifiService");
            if (systemService != null) {
                com.xiaomi.push.bk.b(systemService, "sendCurrentWifiDigestInfo", new Object[0]);
            }
        } catch (Throwable unused) {
        }
    }
}
