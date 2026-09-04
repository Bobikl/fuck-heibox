package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes4.dex */
public class hk extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ hi f107269a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Exception f542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f107270b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hk(hi hiVar, int i10, int i11, Exception exc) {
        super(i10);
        this.f107269a = hiVar;
        this.f107270b = i11;
        this.f542a = exc;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "shutdown the connection. " + this.f107270b + ", " + this.f542a;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        this.f107269a.f107260b.a(this.f107270b, this.f542a);
    }
}
