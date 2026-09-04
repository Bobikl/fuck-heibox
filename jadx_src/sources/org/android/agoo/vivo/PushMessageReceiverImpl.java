package org.android.agoo.vivo;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.vivo.push.sdk.BasePushMessageReceiver;
import com.vivo.push.sdk.OpenClientPushMessageReceiver;
import org.android.agoo.control.NotifManager;

/* JADX INFO: loaded from: classes5.dex */
public class PushMessageReceiverImpl extends OpenClientPushMessageReceiver {
    public static final String VIVO_TOKEN = "VIVO_TOKEN";

    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onReceiveRegId(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return;
        }
        try {
            ALog.d(BasePushMessageReceiver.TAG, "onReceiveRegId", "token", str);
            NotifManager notifManager = new NotifManager();
            notifManager.init(context.getApplicationContext());
            notifManager.reportThirdPushToken(str, VIVO_TOKEN, "1.1.5", true);
        } catch (Throwable th2) {
            ALog.e(BasePushMessageReceiver.TAG, "report token failed:", th2, new Object[0]);
        }
    }
}
