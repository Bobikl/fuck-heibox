package org.android.agoo.huawei;

import android.text.TextUtils;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

/* JADX INFO: loaded from: classes5.dex */
public class HuaweiRcvService extends HmsMessageService {
    public static final String HUAWEI_TOKEN = "HW_TOKEN";
    public static final String TAG = "HuaweiPushMessageService";
    public AgooFactory agooFactory;

    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        try {
            String data = remoteMessage.getData();
            ALog.i(TAG, "onPushMsg", "content", data);
            if (this.agooFactory == null) {
                AgooFactory agooFactory = new AgooFactory();
                this.agooFactory = agooFactory;
                agooFactory.init(this, null, null);
            }
            this.agooFactory.msgRecevie(data.getBytes(), "huawei");
        } catch (Throwable th2) {
            ALog.e(TAG, "onPushMsg", th2, new Object[0]);
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onNewToken(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ALog.i(HuaWeiRegister.TAG, "onToken", "token", str);
            NotifManager notifManager = new NotifManager();
            notifManager.init(getApplicationContext());
            notifManager.reportThirdPushToken(str, HUAWEI_TOKEN);
        } catch (Throwable th2) {
            ALog.e(HuaWeiRegister.TAG, "onToken", th2, new Object[0]);
        }
    }
}
