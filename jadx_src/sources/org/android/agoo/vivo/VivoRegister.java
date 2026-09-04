package org.android.agoo.vivo;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.MiPushClient;
import org.android.agoo.control.NotifManager;

/* JADX INFO: loaded from: classes5.dex */
public class VivoRegister {
    public static final String TAG = "VivoRegister";
    public static final String VERSION = "2.0.0";

    public class a implements IPushActionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f132856a;

        public a(Context context) {
            this.f132856a = context;
        }

        @Override // com.vivo.push.IPushActionListener
        public void onStateChanged(int i10) {
            ALog.i(VivoRegister.TAG, "turnOnPush", "state", Integer.valueOf(i10));
            if (i10 == 0) {
                try {
                    String token = VivoRegister.getToken(this.f132856a);
                    if (TextUtils.isEmpty(token)) {
                        return;
                    }
                    NotifManager notifManager = new NotifManager();
                    notifManager.init(this.f132856a);
                    notifManager.reportThirdPushToken(token, PushMessageReceiverImpl.VIVO_TOKEN, "1.1.5", true);
                } catch (Throwable th2) {
                    ALog.e(VivoRegister.TAG, "report token failed:", th2, new Object[0]);
                }
            }
        }
    }

    public class b implements IPushActionListener {
        @Override // com.vivo.push.IPushActionListener
        public void onStateChanged(int i10) {
            ALog.i(VivoRegister.TAG, "turnOffPush", "state", Integer.valueOf(i10));
        }
    }

    public static String getToken(Context context) {
        try {
            return PushClient.getInstance(context).getRegId();
        } catch (Throwable th2) {
            ALog.e(TAG, "getToken failed:", th2, new Object[0]);
            return null;
        }
    }

    public static void register(Context context) {
        if (context == null) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (!UtilityImpl.isMainProcess(applicationContext)) {
                ALog.i(TAG, "not in main process, skipped.", new Object[0]);
                return;
            }
            if (!PushClient.getInstance(applicationContext).isSupport()) {
                ALog.i(TAG, "device check, skipped.", new Object[0]);
                return;
            }
            ALog.i(TAG, "ver:", "2.0.0");
            ALog.i(TAG, "register start", new Object[0]);
            BaseNotifyClickActivity.addNotifyListener(new VivoMsgParseImpl());
            PushClient.getInstance(applicationContext).initialize();
            PushClient.getInstance(applicationContext).turnOnPush(new a(applicationContext));
        } catch (Throwable th2) {
            ALog.e(TAG, "register failed:", th2, new Object[0]);
        }
    }

    public static void unregister(Context context) {
        try {
            ALog.i(TAG, MiPushClient.COMMAND_UNREGISTER, new Object[0]);
            PushClient.getInstance(context).turnOffPush(new b());
        } catch (Throwable th2) {
            ALog.e(TAG, "unregister failed:", th2, new Object[0]);
        }
    }
}
