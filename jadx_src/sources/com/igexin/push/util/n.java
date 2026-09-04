package com.igexin.push.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static PackageInfo f64069a;

    public static int a(Context context) {
        try {
            return b(context).applicationInfo.targetSdkVersion;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String a() {
        return Build.BRAND;
    }

    public static PackageInfo b(Context context) throws PackageManager.NameNotFoundException {
        if (f64069a != null) {
            com.igexin.a.a.c.b.a("PhoneInfoUtils｜getSelfPackageInfo cache", new Object[0]);
            return f64069a;
        }
        synchronized (n.class) {
            if (f64069a == null) {
                f64069a = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
                com.igexin.a.a.c.b.a("PhoneInfoUtils｜ getSelfPackageInfo", new Object[0]);
            }
        }
        return f64069a;
    }

    public static boolean b() {
        if (androidx.webkit.b.f28327e.equals(com.igexin.push.config.l.B)) {
            return true;
        }
        try {
            return Arrays.asList(com.igexin.push.config.l.B.toUpperCase().split(Constants.ACCEPT_TIME_SEPARATOR_SP)).contains(Build.BRAND.toUpperCase());
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a("PhoneInfoUtils|delAlarm " + com.igexin.push.config.l.B + " err " + e10.toString(), new Object[0]);
            return false;
        }
    }

    public static ServiceInfo[] c(Context context) {
        try {
            return b(context).services;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
