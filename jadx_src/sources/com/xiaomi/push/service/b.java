package com.xiaomi.push.service;

import com.xiaomi.push.in;
import com.xiaomi.push.jm;
import com.xiaomi.push.jx;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class b extends com.xiaomi.push.ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jm f107904a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private WeakReference<XMPushService> f1030a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f1031a;

    public b(jm jmVar, WeakReference<XMPushService> weakReference, boolean z10) {
        this.f107904a = jmVar;
        this.f1030a = weakReference;
        this.f1031a = z10;
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return "22";
    }

    @Override // java.lang.Runnable
    public void run() {
        XMPushService xMPushService;
        WeakReference<XMPushService> weakReference = this.f1030a;
        if (weakReference == null || this.f107904a == null || (xMPushService = weakReference.get()) == null) {
            return;
        }
        this.f107904a.a(bc.a());
        this.f107904a.a(false);
        com.xiaomi.channel.commonutils.logger.b.c("MoleInfo aw_ping : send aw_Ping msg " + this.f107904a.m579a());
        try {
            String strC = this.f107904a.c();
            xMPushService.a(strC, jx.a(ai.a(strC, this.f107904a.b(), this.f107904a, in.Notification)), this.f1031a);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.d("MoleInfo aw_ping : send help app ping error" + e10.toString());
        }
    }
}
