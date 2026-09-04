package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hm;
import com.xiaomi.push.jj;

/* JADX INFO: loaded from: classes4.dex */
public class ac extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jj f107864a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f993a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(int i10, XMPushService xMPushService, jj jjVar) {
        super(i10);
        this.f993a = xMPushService;
        this.f107864a = jjVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send ack message for obsleted message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        try {
            jj jjVarA = z.a((Context) this.f993a, this.f107864a);
            jjVarA.m564a().a("message_obsleted", "1");
            ai.a(this.f993a, jjVarA);
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            this.f993a.a(10, e10);
        }
    }
}
