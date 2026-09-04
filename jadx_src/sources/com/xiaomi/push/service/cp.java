package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes4.dex */
public class cp implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f107999a;

    cp(XMPushService xMPushService) {
        this.f107999a = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageManager packageManager = this.f107999a.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(this.f107999a.getApplicationContext(), "com.xiaomi.push.service.receivers.PingReceiver");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m62a("[Alarm] disable ping receiver may be failure. " + th2);
        }
    }
}
