package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public class ad extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ NotificationClickedActivity f106745a;

    ad(NotificationClickedActivity notificationClickedActivity) {
        this.f106745a = notificationClickedActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.xiaomi.channel.commonutils.logger.b.b("clicked activity finish by normal.");
        this.f106745a.finish();
    }
}
