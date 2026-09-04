package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.push.fo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PushMessageReceiver extends BroadcastReceiver {
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
    }

    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            com.xiaomi.channel.commonutils.logger.b.e("[CRcv] receive a msg broadcast: " + intent.getAction());
        }
        MessageHandleService.addJob(context.getApplicationContext(), new MessageHandleService.a(intent, this));
        try {
            int intExtra = intent.getIntExtra("eventMessageType", -1);
            if (intExtra == 2000) {
                fo.a(context.getApplicationContext()).a(context.getPackageName(), intent, 2003, (String) null);
            } else if (intExtra == 6000) {
                fo.a(context.getApplicationContext()).a(context.getPackageName(), intent, 6005, (String) null);
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.d("meet error in PushMessageReceiver. " + e10);
        }
    }

    @Deprecated
    public void onReceiveMessage(Context context, MiPushMessage miPushMessage) {
    }

    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
    }

    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public void onRequirePermissions(Context context, String[] strArr) {
    }
}
