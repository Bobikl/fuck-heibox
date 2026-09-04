package com.xiaomi.push.service;

import com.xiaomi.push.in;
import com.xiaomi.push.jm;
import com.xiaomi.push.jx;

/* JADX INFO: loaded from: classes4.dex */
public class ci implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jm f107991a;

    ci(jm jmVar) {
        this.f107991a = jmVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArrA = jx.a(ai.a(this.f107991a.c(), this.f107991a.b(), this.f107991a, in.Notification));
        if (ch.f107990a instanceof XMPushService) {
            ((XMPushService) ch.f107990a).a(this.f107991a.c(), bArrA, true);
        } else {
            com.xiaomi.channel.commonutils.logger.b.m62a("UNDatas UploadNotificationDatas failed because not xmsf");
        }
    }
}
