package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hm;
import com.xiaomi.push.jj;

/* JADX INFO: loaded from: classes4.dex */
public class ae extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jj f107866a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f995a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f996a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(int i10, XMPushService xMPushService, jj jjVar, String str) {
        super(i10);
        this.f995a = xMPushService;
        this.f107866a = jjVar;
        this.f996a = str;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send app absent ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        try {
            jj jjVarA = z.a((Context) this.f995a, this.f107866a);
            jjVarA.m564a().a("absent_target_package", this.f996a);
            ai.a(this.f995a, jjVarA);
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            this.f995a.a(10, e10);
        }
    }
}
