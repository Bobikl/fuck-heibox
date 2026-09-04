package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes4.dex */
public class gi extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gh f107212a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gi(gh ghVar, int i10) {
        super(i10);
        this.f107212a = ghVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "Handling bind stats";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo404a() {
        this.f107212a.c();
    }
}
