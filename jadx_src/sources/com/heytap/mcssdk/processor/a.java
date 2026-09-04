package com.heytap.mcssdk.processor;

import android.content.Context;
import com.heytap.mcssdk.d;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.h;
import com.heytap.mcssdk.utils.i;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.BaseMode;

/* JADX INFO: compiled from: CallBackResultProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public class a implements c {

    /* JADX INFO: renamed from: com.heytap.mcssdk.processor.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallBackResultProcessor.java */
    public class RunnableC0496a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y9.b f59945b;

        RunnableC0496a(y9.b bVar) {
            this.f59945b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c(this.f59945b, d.P());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(y9.b bVar, d dVar) {
        if (bVar == null) {
            e.d("message is null , please check param of parseCommandMessage(2)");
        }
        if (dVar == null) {
            e.d("pushService is null , please check param of parseCommandMessage(2)");
            return;
        }
        if (dVar.V() == null) {
            e.d("pushService.getPushCallback() is null , please check param of parseCommandMessage(2)");
            return;
        }
        int iC = bVar.c();
        if (iC == 12287) {
            ICallBackResultService iCallBackResultServiceV = dVar.V();
            if (iCallBackResultServiceV != null) {
                iCallBackResultServiceV.onError(bVar.e(), bVar.getContent());
                return;
            }
            return;
        }
        if (iC == 12298) {
            dVar.V().onSetPushTime(bVar.e(), bVar.getContent());
            return;
        }
        if (iC == 12306) {
            dVar.V().onGetPushStatus(bVar.e(), i.i(bVar.getContent()));
            return;
        }
        if (iC == 12309) {
            dVar.V().onGetNotificationStatus(bVar.e(), i.i(bVar.getContent()));
            return;
        }
        if (iC == 12289) {
            if (bVar.e() == 0) {
                dVar.y(bVar.getContent());
            }
            dVar.V().onRegister(bVar.e(), bVar.getContent());
            return;
        }
        if (iC == 12290) {
            dVar.V().onUnRegister(bVar.e());
            return;
        }
        switch (iC) {
            case 12316:
            case 12317:
                ISetAppNotificationCallBackService iSetAppNotificationCallBackServiceX = dVar.X();
                if (iSetAppNotificationCallBackServiceX != null) {
                    iSetAppNotificationCallBackServiceX.onSetAppNotificationSwitch(bVar.e());
                }
                break;
            case 12318:
                int i10 = 0;
                try {
                    i10 = Integer.parseInt(bVar.getContent());
                    break;
                } catch (Exception unused) {
                }
                IGetAppNotificationCallBackService iGetAppNotificationCallBackServiceW = dVar.W();
                if (iGetAppNotificationCallBackServiceW != null) {
                    iGetAppNotificationCallBackServiceW.onGetAppNotificationSwitch(bVar.e(), i10);
                }
                break;
        }
    }

    @Override // com.heytap.mcssdk.processor.c
    public void a(Context context, BaseMode baseMode, IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4105) {
            y9.b bVar = (y9.b) baseMode;
            e.a("mcssdk-CallBackResultProcessor:" + bVar.toString());
            h.b(new RunnableC0496a(bVar));
        }
    }
}
