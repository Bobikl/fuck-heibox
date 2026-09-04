package com.heytap.msp.push.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.heytap.mcssdk.b;
import com.heytap.mcssdk.d;
import com.heytap.mcssdk.utils.e;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.DataMessage;

/* JADX INFO: loaded from: classes7.dex */
public class CompatibleDataMessageCallbackService extends Service implements IDataMessageCallBackService {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        d.P().f0(getApplicationContext());
        b.a(getApplicationContext(), intent, this);
        return 2;
    }

    @Override // com.heytap.msp.push.callback.IDataMessageCallBackService
    public void processMessage(Context context, DataMessage dataMessage) {
        e.a("Receive DataMessageCallbackService:messageTitle: " + dataMessage.getTitle() + " ------content:" + dataMessage.getContent() + "------describe:" + dataMessage.getDescription());
    }
}
