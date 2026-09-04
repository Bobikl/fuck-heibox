package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes4.dex */
public class cv extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f108005a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cv(XMPushService xMPushService, int i10) {
        super(i10);
        this.f108005a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "prepare the mi push account.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        ai.a(this.f108005a);
        if (com.xiaomi.push.bg.b(this.f108005a)) {
            this.f108005a.a(true);
        }
    }
}
