package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.service.XMPushService.g;

/* JADX INFO: loaded from: classes4.dex */
public class cu extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f108004a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cu(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.f108004a = xMPushService;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        boolean zM675g = this.f108004a.m675g();
        com.xiaomi.channel.commonutils.logger.b.m62a("SuperPowerMode:" + zM675g);
        this.f108004a.e();
        if (!zM675g) {
            this.f108004a.a(true);
        } else {
            XMPushService xMPushService = this.f108004a;
            xMPushService.a(xMPushService.new g(24, null));
        }
    }
}
