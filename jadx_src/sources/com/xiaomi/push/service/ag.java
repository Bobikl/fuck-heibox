package com.xiaomi.push.service;

import com.xiaomi.push.hm;
import com.xiaomi.push.in;
import com.xiaomi.push.ix;
import com.xiaomi.push.je;
import com.xiaomi.push.jj;
import com.xiaomi.push.jm;

/* JADX INFO: loaded from: classes4.dex */
public class ag extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jj f107869a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ jm f999a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f1000a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(int i10, jm jmVar, jj jjVar, XMPushService xMPushService) {
        super(i10);
        this.f999a = jmVar;
        this.f107869a = jjVar;
        this.f1000a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send ack message for clear push message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        try {
            je jeVar = new je();
            jeVar.c(ix.CancelPushMessageACK.f623a);
            jeVar.a(this.f999a.m579a());
            jeVar.a(this.f999a.a());
            jeVar.b(this.f999a.b());
            jeVar.e(this.f999a.c());
            jeVar.a(0L);
            jeVar.d("success clear push message.");
            ai.a(this.f1000a, ai.b(this.f107869a.b(), this.f107869a.m565a(), jeVar, in.Notification));
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.d("clear push message. " + e10);
            this.f1000a.a(10, e10);
        }
    }
}
