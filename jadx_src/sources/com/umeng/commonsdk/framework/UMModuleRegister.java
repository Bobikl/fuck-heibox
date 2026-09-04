package com.umeng.commonsdk.framework;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class UMModuleRegister {
    public static final String ANALYTICS = "analytics";
    public static final String APPSTATUS = "appstatus";
    private static final int APPSTATUS_SWITCH_HIGH = 37136;
    private static final int APPSTATUS_SWITCH_LOW = 37121;
    public static final String INNER = "internal";
    private static final int INNER_EVENT_VALUE_HIGH = 36864;
    private static final int INNER_EVENT_VALUE_LOW = 32769;
    public static final String PROCESS = "process";
    private static final int PROCESS_EVENT_VALUE_HIGH = 37120;
    private static final int PROCESS_EVENT_VALUE_LOW = 36945;
    public static final String PUSH = "push";
    private static final int PUSH_EVENT_VALUE_HIGH = 20480;
    private static final int PUSH_EVENT_VALUE_LOW = 16385;
    public static final String SHARE = "share";
    private static final int SHARE_EVENT_VALUE_HIGH = 28672;
    private static final int SHARE_EVENT_VALUE_LOW = 24577;
    private static Context mModuleAppContext;
    private static HashMap<String, UMLogDataProtocol> mModuleMap;

    public static String eventType2ModuleName(int i10) {
        String str = (i10 < PUSH_EVENT_VALUE_LOW || i10 > 20480) ? "analytics" : "push";
        if (i10 >= 24577 && i10 <= SHARE_EVENT_VALUE_HIGH) {
            str = "share";
        }
        if (i10 >= 32769 && i10 <= INNER_EVENT_VALUE_HIGH) {
            str = INNER;
        }
        if (i10 >= 36945 && i10 <= PROCESS_EVENT_VALUE_HIGH) {
            str = PROCESS;
        }
        return (i10 < APPSTATUS_SWITCH_LOW || i10 > APPSTATUS_SWITCH_HIGH) ? str : APPSTATUS;
    }

    public static Context getAppContext() {
        return mModuleAppContext;
    }

    public static UMLogDataProtocol getCallbackFromModuleName(String str) {
        if (mModuleMap.containsKey(str)) {
            return mModuleMap.get(str);
        }
        return null;
    }

    public static void registerAppContext(Context context) {
        if (mModuleAppContext == null) {
            mModuleAppContext = context.getApplicationContext();
        }
    }

    public static boolean registerCallback(int i10, UMLogDataProtocol uMLogDataProtocol) {
        if (mModuleMap == null) {
            mModuleMap = new HashMap<>();
        }
        String strEventType2ModuleName = eventType2ModuleName(i10);
        if (mModuleMap.containsKey(strEventType2ModuleName)) {
            return true;
        }
        mModuleMap.put(strEventType2ModuleName, uMLogDataProtocol);
        return true;
    }
}
