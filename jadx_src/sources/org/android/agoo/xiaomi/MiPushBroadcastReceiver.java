package org.android.agoo.xiaomi;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.util.List;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

/* JADX INFO: loaded from: classes5.dex */
public class MiPushBroadcastReceiver extends PushMessageReceiver {
    public static final String MI_TOKEN = "MI_TOKEN";
    public static final String TAG = "MiPushBroadcastReceiver";
    public AgooFactory agooFactory;

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        try {
            String content = miPushMessage.getContent();
            ALog.i(TAG, "onReceivePassThroughMessage", "msg", content);
            if (this.agooFactory == null) {
                AgooFactory agooFactory = new AgooFactory();
                this.agooFactory = agooFactory;
                agooFactory.init(context, null, null);
            }
            this.agooFactory.msgRecevie(content.getBytes("UTF-8"), "xiaomi");
        } catch (Throwable th2) {
            ALog.e(TAG, "onReceivePassThroughMessage", th2, new Object[0]);
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        try {
            String command = miPushCommandMessage.getCommand();
            List<String> commandArguments = miPushCommandMessage.getCommandArguments();
            String str = null;
            String str2 = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
            if ("register".equals(command) && miPushCommandMessage.getResultCode() == 0) {
                str = str2;
            }
            ALog.i(TAG, "onReceiveRegisterResult", "regId", str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            NotifManager notifManager = new NotifManager();
            notifManager.init(context.getApplicationContext());
            notifManager.reportThirdPushToken(str, MI_TOKEN);
        } catch (Exception e10) {
            ALog.e(TAG, "onReceiveRegisterResult", e10, new Object[0]);
        }
    }
}
