package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hm;
import com.xiaomi.push.jj;

/* JADX INFO: loaded from: classes4.dex */
public class ad extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jj f107865a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f994a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(int i10, XMPushService xMPushService, jj jjVar) {
        super(i10);
        this.f994a = xMPushService;
        this.f107865a = jjVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send ack message for unrecognized new miui message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        try {
            jj jjVarA = z.a((Context) this.f994a, this.f107865a);
            jjVarA.m564a().a("miui_message_unrecognized", "1");
            ai.a(this.f994a, jjVarA);
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            this.f994a.a(10, e10);
        }
    }
}
