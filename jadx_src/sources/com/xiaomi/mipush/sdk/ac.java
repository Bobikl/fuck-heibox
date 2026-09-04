package com.xiaomi.mipush.sdk;

/* JADX INFO: loaded from: classes4.dex */
public class ac implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ NotificationClickedActivity f106744a;

    ac(NotificationClickedActivity notificationClickedActivity) {
        this.f106744a = notificationClickedActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.channel.commonutils.logger.b.e("clicked activity finish by timeout.");
        this.f106744a.finish();
    }
}
