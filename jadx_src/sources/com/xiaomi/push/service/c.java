package com.xiaomi.push.service;

import com.xiaomi.push.gq;
import com.xiaomi.push.hm;

/* JADX INFO: loaded from: classes4.dex */
public class c extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private XMPushService f107983a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private gq[] f1071a;

    public c(XMPushService xMPushService, gq[] gqVarArr) {
        super(4);
        this.f107983a = xMPushService;
        this.f1071a = gqVarArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "batch send message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        try {
            gq[] gqVarArr = this.f1071a;
            if (gqVarArr != null) {
                this.f107983a.a(gqVarArr);
            }
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            this.f107983a.a(10, e10);
        }
    }
}
