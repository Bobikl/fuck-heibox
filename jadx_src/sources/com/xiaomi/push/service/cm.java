package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes4.dex */
public class cm extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f107996a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cm(XMPushService xMPushService, int i10) {
        super(i10);
        this.f107996a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "disconnect for service destroy.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        if (this.f107996a.f958a != null) {
            this.f107996a.f958a.b(15, (Exception) null);
            this.f107996a.f958a = null;
        }
    }
}
