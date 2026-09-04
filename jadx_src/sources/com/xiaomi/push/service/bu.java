package com.xiaomi.push.service;

import com.xiaomi.push.gq;
import com.xiaomi.push.hm;

/* JADX INFO: loaded from: classes4.dex */
public class bu extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gq f107976a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private XMPushService f1059a;

    public bu(XMPushService xMPushService, gq gqVar) {
        super(4);
        this.f1059a = xMPushService;
        this.f107976a = gqVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send a message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        try {
            gq gqVar = this.f107976a;
            if (gqVar != null) {
                if (e.a(gqVar)) {
                    this.f107976a.c(System.currentTimeMillis() - this.f107976a.m414a());
                }
                this.f1059a.a(this.f107976a);
            }
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            this.f1059a.a(10, e10);
        }
    }
}
