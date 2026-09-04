package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes4.dex */
public class hj extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f107267a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ hi f541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f107268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hj(hi hiVar, int i10, long j10, long j11) {
        super(i10);
        this.f541a = hiVar;
        this.f107267a = j10;
        this.f107268b = j11;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "check the ping-pong." + this.f107268b;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        Thread.yield();
        if (!this.f541a.m444c() || this.f541a.a(this.f107267a)) {
            return;
        }
        com.xiaomi.push.service.p.a(this.f541a.f107260b).m759b();
        this.f541a.f107260b.a(22, (Exception) null);
    }
}
