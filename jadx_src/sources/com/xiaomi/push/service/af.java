package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hm;
import com.xiaomi.push.jj;

/* JADX INFO: loaded from: classes4.dex */
public class af extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jj f107867a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f997a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f107868b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(int i10, XMPushService xMPushService, jj jjVar, String str, String str2) {
        super(i10);
        this.f997a = xMPushService;
        this.f107867a = jjVar;
        this.f998a = str;
        this.f107868b = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send wrong message ack for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        try {
            jj jjVarA = z.a((Context) this.f997a, this.f107867a);
            jjVarA.f745a.a("error", this.f998a);
            jjVarA.f745a.a("reason", this.f107868b);
            ai.a(this.f997a, jjVarA);
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            this.f997a.a(10, e10);
        }
    }
}
