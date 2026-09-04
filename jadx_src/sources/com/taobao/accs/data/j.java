package com.taobao.accs.data;

import android.content.Intent;
import android.os.Handler;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class j extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MsgDistributeService f98270a;

    j(MsgDistributeService msgDistributeService) {
        this.f98270a = msgDistributeService;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message != null) {
            ALog.i("MsgDistributeService", "handleMessage on receive msg", "msg", message.toString());
            Intent intent = (Intent) message.getData().getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            if (intent != null) {
                ALog.i("MsgDistributeService", "handleMessage get intent success", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent.toString());
                this.f98270a.onStartCommand(intent, 0, 0);
            }
        }
    }
}
