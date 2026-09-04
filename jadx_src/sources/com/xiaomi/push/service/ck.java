package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hc;

/* JADX INFO: loaded from: classes4.dex */
public class ck extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f107993a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f1080a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ byte[] f1081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f107994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ck(XMPushService xMPushService, int i10, int i11, String str, byte[] bArr) {
        super(i10);
        this.f107993a = xMPushService;
        this.f107994b = i11;
        this.f1080a = str;
        this.f1081a = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "clear account cache.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        v.m775a((Context) this.f107993a);
        bf.a().m729a("5");
        com.xiaomi.push.aa.a(this.f107994b);
        this.f107993a.f959a.c(hc.a());
        com.xiaomi.channel.commonutils.logger.b.m62a("clear account and start registration. " + this.f1080a);
        this.f107993a.a(this.f1081a, this.f1080a);
    }
}
