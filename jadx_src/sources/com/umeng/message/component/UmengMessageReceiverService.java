package com.umeng.message.component;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.umeng.message.common.UPLog;
import org.android.agoo.message.MessageReceiverService;

/* JADX INFO: loaded from: classes4.dex */
public final class UmengMessageReceiverService extends MessageReceiverService {
    @Override // org.android.agoo.message.MessageReceiverService
    public final String getIntentServiceClassName(Context context) {
        return UmengIntentService.class.getName();
    }

    @Override // org.android.agoo.message.MessageReceiverService, android.app.Service
    public final IBinder onBind(Intent intent) {
        try {
            return super.onBind(intent);
        } catch (Exception e10) {
            UPLog.e("MessageReceiverService", e10);
            return null;
        }
    }
}
