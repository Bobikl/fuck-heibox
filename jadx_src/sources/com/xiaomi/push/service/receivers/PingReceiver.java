package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.fu;
import com.xiaomi.push.service.ServiceClient;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bj;

/* JADX INFO: loaded from: classes4.dex */
public class PingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        b.c(intent.getPackage() + " is the package name");
        if (XMPushService.m673e()) {
            return;
        }
        if (!bj.f107947q.equals(intent.getAction())) {
            b.m62a("cancel the old ping timer");
            fu.a();
        } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
            b.c("Ping XMChannelService on timer");
            try {
                Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                intent2.putExtra("time_stamp", System.currentTimeMillis());
                intent2.setAction("com.xiaomi.push.timer");
                ServiceClient.getInstance(context).startServiceSafely(intent2);
            } catch (Exception e10) {
                b.a(e10);
            }
        }
    }
}
