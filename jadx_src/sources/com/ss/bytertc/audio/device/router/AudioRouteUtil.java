package com.ss.bytertc.audio.device.router;

import android.content.Context;
import com.bytedance.realx.base.ContextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class AudioRouteUtil {
    public static Context getContext() {
        return ContextUtils.getApplicationContext();
    }

    public static String modeString(int i10) {
        if (i10 == 0) {
            return "MODE_NORMAL";
        }
        if (i10 == 1) {
            return "MODE_RINGTONE";
        }
        if (i10 != 2) {
            return i10 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION";
        }
        return "MODE_IN_CALL";
    }
}
