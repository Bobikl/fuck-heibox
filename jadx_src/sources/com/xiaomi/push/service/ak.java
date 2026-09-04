package com.xiaomi.push.service;

import com.xiaomi.mipush.sdk.ErrorCode;

/* JADX INFO: loaded from: classes4.dex */
public class ak implements bf.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f107872a;

    ak(XMPushService xMPushService) {
        this.f107872a = xMPushService;
    }

    @Override // com.xiaomi.push.service.bf.b.a
    public void a(bf.c cVar, bf.c cVar2, int i10) {
        if (cVar2 == bf.c.binded) {
            y.a(this.f107872a, true);
            y.a(this.f107872a);
        } else if (cVar2 == bf.c.unbind) {
            com.xiaomi.channel.commonutils.logger.b.m62a("onChange unbind");
            y.a(this.f107872a, ErrorCode.ERROR_SERVICE_UNAVAILABLE, " the push is not connected.");
        }
    }
}
