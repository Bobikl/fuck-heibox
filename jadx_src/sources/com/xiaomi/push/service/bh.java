package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes4.dex */
public class bh extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bf.b.c f107929a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bf.b.c cVar, int i10) {
        super(i10);
        this.f107929a = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "clear peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        bf.b.c cVar = this.f107929a;
        if (cVar.f107923a == cVar.f1050a.f1037a) {
            com.xiaomi.channel.commonutils.logger.b.b("clean peer, chid = " + this.f107929a.f1050a.f107917g);
            this.f107929a.f1050a.f1037a = null;
        }
    }
}
