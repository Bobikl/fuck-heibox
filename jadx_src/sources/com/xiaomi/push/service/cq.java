package com.xiaomi.push.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public class cq extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f108000a;

    cq(XMPushService xMPushService) {
        this.f108000a = xMPushService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message != null) {
            try {
                int i10 = message.what;
                if (i10 == 17) {
                    Object obj = message.obj;
                    if (obj != null) {
                        this.f108000a.onStart((Intent) obj, 1);
                    }
                } else if (i10 == 18) {
                    Message messageObtain = Message.obtain((Handler) null, 0);
                    messageObtain.what = 18;
                    Bundle bundle = new Bundle();
                    bundle.putString("xmsf_region", a.a(this.f108000a.getApplicationContext()).a());
                    messageObtain.setData(bundle);
                    message.replyTo.send(messageObtain);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
