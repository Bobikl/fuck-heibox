package com.xiaomi.push.service;

import android.os.SystemClock;
import com.xiaomi.push.gq;
import com.xiaomi.push.hg;
import com.xiaomi.push.hs;
import com.xiaomi.push.service.XMPushService.d;
import com.xiaomi.push.service.XMPushService.m;

/* JADX INFO: loaded from: classes4.dex */
public class cj implements hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f107992a;

    cj(XMPushService xMPushService) {
        this.f107992a = xMPushService;
    }

    @Override // com.xiaomi.push.hg
    public void a(gq gqVar) {
        if (e.a(gqVar)) {
            bq.a().a(gqVar.e(), SystemClock.elapsedRealtime(), this.f107992a.m678a());
        }
        XMPushService xMPushService = this.f107992a;
        xMPushService.a(xMPushService.new d(gqVar));
    }

    @Override // com.xiaomi.push.hg
    public void a(hs hsVar) {
        XMPushService xMPushService = this.f107992a;
        xMPushService.a(xMPushService.new m(hsVar));
    }
}
