package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService.g;

/* JADX INFO: loaded from: classes4.dex */
public class cs implements bf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f108002a;

    cs(XMPushService xMPushService) {
        this.f108002a = xMPushService;
    }

    @Override // com.xiaomi.push.service.bf.a
    public void a() {
        this.f108002a.e();
        if (bf.a().m724a() <= 0) {
            XMPushService xMPushService = this.f108002a;
            xMPushService.a(xMPushService.new g(12, null));
        }
    }
}
