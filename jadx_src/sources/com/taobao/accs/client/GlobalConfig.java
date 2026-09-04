package com.taobao.accs.client;

import android.content.Context;
import com.taobao.accs.ChannelService;
import com.taobao.accs.IProcessName;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.t;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class GlobalConfig {
    public static AccsConfig.ACCS_GROUP mGroup = AccsConfig.ACCS_GROUP.OPEN;
    public static boolean enableCookie = true;
    private static boolean enableJobHeartbeat = false;
    private static boolean enableAlarmHeartbeat = false;

    public static boolean isAlarmHeartbeatEnable() {
        return enableAlarmHeartbeat;
    }

    public static boolean isJobHeartbeatEnable() {
        return enableJobHeartbeat;
    }

    public static void setAlarmHeartbeatEnable(boolean z10) {
        ALog.d("GlobalConfig", "setAlarmHeartbeatEnable", "enable", Boolean.valueOf(z10));
        enableAlarmHeartbeat = z10;
    }

    public static void setChannelProcessName(String str) {
        a.f98188d = str;
    }

    public static void setChannelReuse(boolean z10, AccsConfig.ACCS_GROUP accs_group) {
        GlobalClientInfo.f98174d = z10;
        mGroup = accs_group;
    }

    public static void setControlFrameMaxRetry(int i10) {
        Message.CONTROL_MAX_RETRY_TIMES = i10;
    }

    public static void setCurrProcessNameImpl(IProcessName iProcessName) {
        a.f98189e = iProcessName;
    }

    public static void setEnableForeground(Context context, boolean z10) {
        ALog.i("GlobalConfig", "setEnableForeground", "enable", Boolean.valueOf(z10));
        t.a(context, ChannelService.SUPPORT_FOREGROUND_VERSION_KEY, z10 ? 21 : 0);
    }

    public static void setJobHeartbeatEnable(boolean z10) {
        ALog.d("GlobalConfig", "setJobHeartBeatEnable", "enable", Boolean.valueOf(z10));
        enableJobHeartbeat = z10;
    }

    public static void setMainProcessName(String str) {
        a.f98187c = str;
    }
}
