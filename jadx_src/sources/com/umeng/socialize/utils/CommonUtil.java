package com.umeng.socialize.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CommonUtil {
    public static boolean checkAndroidManifest(Context context, String str) {
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), str), 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean checkIntentFilterData(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse("tencent" + str + ":"));
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        if (listQueryIntentActivities.size() > 0) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String checkKeyHash(Context context) {
        return "";
    }

    public static String checkMD5Sign(Context context) {
        return "";
    }

    public static boolean checkMetaData(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            return (applicationInfo == null || applicationInfo.metaData.get(str) == null) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean checkPath(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean checkPermission(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static boolean checkResource(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName()) > 0;
    }

    public static String checkSHA1(Context context) {
        return "";
    }

    public static boolean isSilentMode(Context context) {
        Class<?> cls;
        Method declaredMethod;
        if (context == null) {
            return false;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.UMConfigure");
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            cls = null;
        }
        if (cls == null) {
            return false;
        }
        try {
            declaredMethod = cls.getDeclaredMethod("isSilentMode", new Class[0]);
            try {
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e11) {
                e = e11;
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e12) {
            e = e12;
            declaredMethod = null;
        }
        if (declaredMethod == null) {
            return false;
        }
        try {
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke != null) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (IllegalAccessException e13) {
            e13.printStackTrace();
            return false;
        } catch (InvocationTargetException e14) {
            e14.printStackTrace();
            return false;
        }
    }
}
