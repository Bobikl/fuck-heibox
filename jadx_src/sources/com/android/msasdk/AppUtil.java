package com.android.msasdk;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes6.dex */
public class AppUtil {
    public static native PackageInfo getAppInfo(Context context, String str);

    public static native boolean isDebuggable(Context context);

    public static native boolean isInstalled(Context context, String str);

    public static native boolean isSystemApp(Context context, String str);
}
