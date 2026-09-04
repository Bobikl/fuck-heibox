package com.igexin.push.extension.distribution.basic.g;

import android.app.Notification;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f64002a;

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.targetSdkVersion;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String a() {
        return Build.BRAND;
    }

    private static String a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static synchronized boolean a(int i10, Notification notification) {
        try {
            if (b()) {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i10));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static synchronized boolean a(int i10, boolean z10) {
        try {
            if (com.igexin.push.core.d.f63671e == null) {
                return false;
            }
            String strA = a();
            if ("huawei".equalsIgnoreCase(strA) || "honor".equalsIgnoreCase(strA)) {
                int iIntValue = ((Integer) g.b(com.igexin.push.core.d.f63671e, "hwBadgeNum", 0)).intValue();
                if (!z10) {
                    i10 += iIntValue;
                }
                g.a(com.igexin.push.core.d.f63671e, "hwBadgeNum", Integer.valueOf(i10));
                Bundle bundle = new Bundle();
                bundle.putString("package", com.igexin.push.core.d.f63671e.getPackageName());
                bundle.putString("class", b(com.igexin.push.core.d.f63671e));
                bundle.putInt("badgenumber", i10);
                Uri uri = Uri.parse("content://com.huawei.android.launcher.settings/badge/");
                Uri uri2 = Uri.parse("content://com.hihonor.android.launcher.settings/badge/");
                if (TextUtils.isEmpty(com.igexin.push.core.d.f63671e.getContentResolver().getType(uri))) {
                    uri = uri2;
                }
                com.igexin.push.core.d.f63671e.getContentResolver().call(uri, "change_badge", (String) null, bundle);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static String b(Context context) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()), 0);
            return listQueryIntentActivities.size() > 0 ? listQueryIntentActivities.get(0).activityInfo.name : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean b() {
        try {
            if (f64002a != null) {
                return f64002a.booleanValue();
            }
            f64002a = Boolean.valueOf((!"Xiaomi".equalsIgnoreCase(Build.BRAND) && TextUtils.isEmpty(a("ro.miui.ui.version.name")) && TextUtils.isEmpty(a("ro.miui.ui.version.code"))) ? false : true);
            return f64002a.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }
}
