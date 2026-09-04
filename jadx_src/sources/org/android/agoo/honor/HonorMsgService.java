package org.android.agoo.honor;

import android.text.TextUtils;
import com.hihonor.push.sdk.HonorMessageService;
import com.hihonor.push.sdk.HonorPushDataMsg;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

/* JADX INFO: loaded from: classes5.dex */
public class HonorMsgService extends HonorMessageService {
    public static final String HONOR_TOKEN = "HONOR_TOKEN";
    public static final String MSG_SOURCE = "honor";
    public static final String TAG = "HonorMsgService";
    public AgooFactory agooFactory;

    @Override // com.hihonor.push.sdk.HonorMessageService
    public void onMessageReceived(HonorPushDataMsg honorPushDataMsg) {
        try {
            String data = honorPushDataMsg.getData();
            ALog.i(TAG, "onPushMsg", "content", data);
            if (data == null) {
                return;
            }
            if (this.agooFactory == null) {
                AgooFactory agooFactory = new AgooFactory();
                this.agooFactory = agooFactory;
                agooFactory.init(this, null, null);
            }
            this.agooFactory.msgRecevie(data.getBytes(), "honor");
        } catch (Throwable th2) {
            ALog.e(TAG, "onPushMsg", th2, new Object[0]);
        }
    }

    @Override // com.hihonor.push.sdk.HonorMessageService
    public void onNewToken(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ALog.i(TAG, "onToken", "token", str);
            NotifManager notifManager = new NotifManager();
            notifManager.init(getApplicationContext());
            notifManager.reportThirdPushToken(str, HONOR_TOKEN);
        } catch (Throwable th2) {
            ALog.e(TAG, "onToken", th2, new Object[0]);
        }
    }
}
