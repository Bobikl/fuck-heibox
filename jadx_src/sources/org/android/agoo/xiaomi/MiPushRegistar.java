package org.android.agoo.xiaomi;

import android.content.Context;
import android.os.Build;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.xiaomi.mipush.sdk.MiPushClient;

/* JADX INFO: loaded from: classes5.dex */
public class MiPushRegistar {
    public static final String BLACKSHARK = "blackshark";
    public static final String REDMI = "Redmi";
    public static final String TAG = "MiPushRegistar";
    public static final String VERSION = "2.0.0";
    public static final String XIAOMI = "Xiaomi";

    public static boolean checkDevice() {
        String str = Build.BRAND;
        return "Xiaomi".equalsIgnoreCase(str) || REDMI.equalsIgnoreCase(str) || BLACKSHARK.equalsIgnoreCase(str);
    }

    public static String getToken(Context context) {
        try {
            return MiPushClient.getRegId(context);
        } catch (Throwable th2) {
            ALog.e(TAG, "getToken failed:", th2, new Object[0]);
            return null;
        }
    }

    public static void register(Context context, String str, String str2) {
        register(context, str, str2, false);
    }

    public static void register(Context context, String str, String str2, boolean z10) {
        try {
            if (!UtilityImpl.isMainProcess(context)) {
                ALog.i(TAG, "not in main process, skipped.", new Object[0]);
                return;
            }
            if (!z10 && !checkDevice()) {
                ALog.i(TAG, "device check, skipped.", new Object[0]);
                return;
            }
            ALog.i(TAG, "ver:", "2.0.0");
            ALog.i(TAG, "register begin", new Object[0]);
            BaseNotifyClickActivity.addNotifyListener(new MiMsgParseImpl());
            MiPushClient.registerPush(context, str, str2);
        } catch (Throwable th2) {
            ALog.e(TAG, "register failed:", th2, new Object[0]);
        }
    }

    public static void unregister(Context context) {
        try {
            ALog.i(TAG, MiPushClient.COMMAND_UNREGISTER, new Object[0]);
            MiPushClient.unregisterPush(context);
        } catch (Throwable th2) {
            ALog.e(TAG, "unregister failed:", th2, new Object[0]);
        }
    }
}
