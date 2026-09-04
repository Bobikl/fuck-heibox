package com.xiaomi.push.service;

import com.xiaomi.push.hm;
import com.xiaomi.push.jj;

/* JADX INFO: loaded from: classes4.dex */
public class aa extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jj f107862a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f991a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(int i10, XMPushService xMPushService, jj jjVar) {
        super(i10);
        this.f991a = xMPushService;
        this.f107862a = jjVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send app absent message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        try {
            ai.a(this.f991a, ai.a(this.f107862a.b(), this.f107862a.m565a()));
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            this.f991a.a(10, e10);
        }
    }
}
