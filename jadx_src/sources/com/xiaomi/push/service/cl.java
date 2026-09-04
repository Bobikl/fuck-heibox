package com.xiaomi.push.service;

import com.xiaomi.push.hm;

/* JADX INFO: loaded from: classes4.dex */
public class cl extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f107995a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f1082a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ byte[] f1083a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cl(XMPushService xMPushService, int i10, String str, byte[] bArr) {
        super(i10);
        this.f107995a = xMPushService;
        this.f1082a = str;
        this.f1083a = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send mi push message";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        try {
            ai.a(this.f107995a, this.f1082a, this.f1083a);
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            this.f107995a.a(10, e10);
        }
    }
}
