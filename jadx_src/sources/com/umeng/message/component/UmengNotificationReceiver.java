package com.umeng.message.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.message.PushAgent;
import com.umeng.message.UTrack;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.ac;
import com.umeng.message.proguard.am;
import com.umeng.message.proguard.b;
import com.umeng.message.proguard.w;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class UmengNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        b.c(new Runnable() { // from class: com.umeng.message.component.UmengNotificationReceiver.1
            @Override // java.lang.Runnable
            public final void run() {
                String stringExtra;
                try {
                    Intent intent2 = intent;
                    if (intent2 == null || (stringExtra = intent2.getStringExtra("MSG")) == null) {
                        return;
                    }
                    int intExtra = intent.getIntExtra("ACTION", -1);
                    UPLog.i("NotificationProxy", String.format(Locale.getDefault(), "onReceive[msg=%s, action=%d]", stringExtra, Integer.valueOf(intExtra)));
                    UMessage uMessage = new UMessage(new JSONObject(stringExtra));
                    if (intExtra == 11) {
                        UPLog.i("NotificationProxy", "notification ignored!");
                        if (!TextUtils.isEmpty(uMessage.getMsgId())) {
                            UTrack.getInstance().trackMsgDismissed(uMessage);
                        }
                        uMessage.dismiss = true;
                        UPushMessageHandler notificationClickHandler = PushAgent.getInstance(context).getNotificationClickHandler();
                        if (notificationClickHandler != null) {
                            notificationClickHandler.handleMessage(context, uMessage);
                        }
                    }
                    w wVarA = w.a();
                    ac acVarA = wVarA.a(uMessage.getMsgId());
                    if (acVarA != null) {
                        wVarA.b(acVarA);
                        am.a(acVarA);
                    }
                } catch (Throwable th2) {
                    UPLog.e("NotificationProxy", th2);
                }
            }
        });
    }
}
