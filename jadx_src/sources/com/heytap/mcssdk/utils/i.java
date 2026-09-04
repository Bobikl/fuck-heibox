package com.heytap.mcssdk.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes7.dex */
public class i {
    public static String a(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 : iArr) {
            sb2.append((char) i10);
        }
        return sb2.toString();
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            e.a("getVersionCode--Exception:" + e10.getMessage());
            return 0;
        }
    }

    public static int c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e10) {
            e.a("getVersionCode--Exception:" + e10.getMessage());
            return 0;
        }
    }

    public static String d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            e.a("getVersionName--Exception:" + e10.getMessage());
            return "0";
        }
    }

    public static String e(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e10) {
            e.a("getVersionName--Exception:" + e10.getMessage());
            return null;
        }
    }

    public static boolean f(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            e.d("isExistPackage NameNotFoundException:" + e10.getMessage());
            return false;
        }
    }

    public static boolean g(Context context, String str, String str2) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
        } catch (PackageManager.NameNotFoundException e10) {
            e.d("isSupportPush NameNotFoundException:" + e10.getMessage());
            applicationInfo = null;
        }
        return applicationInfo != null && applicationInfo.metaData.getBoolean(str2, false);
    }

    public static boolean h(Context context) {
        return com.heytap.mcssdk.d.P().g0(context);
    }

    public static int i(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e10) {
                e.d("parseInt--NumberFormatException" + e10.getMessage());
            }
        }
        return -1;
    }
}
