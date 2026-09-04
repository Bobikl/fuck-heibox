package org.android.agoo.control;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class g extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BaseIntentService f132836a;

    g(BaseIntentService baseIntentService) {
        this.f132836a = baseIntentService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message != null) {
            ALog.i("BaseIntentService", "handleMessage on receive msg", "msg", message.toString());
            Intent intent = (Intent) message.getData().getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            if (intent != null) {
                ALog.i("BaseIntentService", "handleMessage get intent success", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent.toString());
                ThreadPoolExecutorFactory.execute(new h(this, intent));
            }
        }
    }
}
