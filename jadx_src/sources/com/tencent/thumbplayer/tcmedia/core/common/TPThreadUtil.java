package com.tencent.thumbplayer.tcmedia.core.common;

import android.os.Process;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class TPThreadUtil {
    private static final String TAG = "PlayerCore.TPThreadUtil";

    public static void setThreadName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Thread.currentThread().setName(str);
    }

    public static void setThreadPriority(int i10) {
        if (i10 < -19 || i10 > 19) {
            TPNativeLog.printLog(4, "setThreadPriority error, priority range:[-19,20], priority:".concat(String.valueOf(i10)));
            return;
        }
        try {
            if (Process.getThreadPriority(0) != i10) {
                Process.setThreadPriority(i10);
            }
            TPNativeLog.printLog(2, "setThreadPriority, priority:".concat(String.valueOf(i10)));
        } catch (Exception e10) {
            TPNativeLog.printLog(4, TAG, e10.toString());
        }
    }
}
