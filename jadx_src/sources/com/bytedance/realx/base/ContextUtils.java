package com.bytedance.realx.base;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;

/* JADX INFO: loaded from: classes6.dex */
public class ContextUtils {
    private static final String TAG = "ContextUtils";
    private static Context applicationContext;

    @CalledByNative
    public static String getAppLibPath(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String strFindLibrary = ((BaseDexClassLoader) applicationContext.getClassLoader()).findLibrary(str);
            return strFindLibrary == null ? "" : strFindLibrary;
        } catch (Exception e10) {
            RXLogging.e("realx Utils", "getAppLibPath Exception : " + e10.getMessage());
            Log.e("realx Utils", "getAppLibPath Exception : " + e10.getMessage());
            throw e10;
        }
    }

    @CalledByNative
    public static String getAppPath() {
        return applicationContext.getExternalFilesDir("").toString();
    }

    @Deprecated
    public static Context getApplicationContext() {
        return applicationContext;
    }

    @CalledByNative
    public static void initialize(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
        }
        applicationContext = context;
    }
}
