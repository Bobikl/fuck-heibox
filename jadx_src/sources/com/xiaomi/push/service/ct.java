package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes4.dex */
public class ct implements XMPushService.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f108003a;

    ct(XMPushService xMPushService) {
        this.f108003a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    /* JADX INFO: renamed from: a */
    public void mo482a() {
        com.xiaomi.push.bv.a(this.f108003a.getApplicationContext());
    }
}
