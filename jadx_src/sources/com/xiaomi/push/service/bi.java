package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes4.dex */
public class bi extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bf.b.c f107930a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(bf.b.c cVar, int i10) {
        super(i10);
        this.f107930a = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "check peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        bf bfVarA = bf.a();
        bf.b bVar = this.f107930a.f1050a;
        if (bfVarA.a(bVar.f107917g, bVar.f1046b).f1037a == null) {
            XMPushService xMPushService = bf.b.this.f1039a;
            bf.b bVar2 = this.f107930a.f1050a;
            xMPushService.a(bVar2.f107917g, bVar2.f1046b, 2, null, null);
        }
    }
}
