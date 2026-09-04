package org.android.agoo.intent;

import android.content.Context;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public final class IntentUtil {
    private static final String INTENT_FROM_AGOO_COMMAND = ".intent.action.COMMAND";
    private static final String INTENT_FROM_THIRDPUSH_COMMAND = ".intent.thirdPush.action.COMMAND";
    private static final String TAG = "IntentUtil";

    public static final String getAgooCommand(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName() + INTENT_FROM_AGOO_COMMAND;
        } catch (Throwable th2) {
            ALog.w(TAG, "getAgooCommand", th2, new Object[0]);
            return null;
        }
    }

    public static final String getThirdPushCommand(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName() + INTENT_FROM_THIRDPUSH_COMMAND;
        } catch (Throwable th2) {
            ALog.w(TAG, "getAgooCommand", th2, new Object[0]);
            return null;
        }
    }
}
