package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.AndroidException;
import com.huawei.hms.base.log.a;
import com.huawei.hms.base.log.b;
import com.meituan.robust.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class HMSLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f62711a = new b();

    private static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
                return "HMS-" + packageInfo.versionName + "(" + packageInfo.versionCode + ")";
            } catch (AndroidException | RuntimeException unused) {
            }
        }
        return "HMS-[unknown-version]";
    }

    public static void d(String str, String str2) {
        f62711a.a(3, str, str2);
    }

    public static void e(String str, long j10, String str2) {
        f62711a.a(6, str, Constants.ARRAY_TYPE + j10 + "] " + str2);
    }

    public static void e(String str, long j10, String str2, Throwable th2) {
        f62711a.b(6, str, Constants.ARRAY_TYPE + j10 + "] " + str2, th2);
    }

    public static void e(String str, String str2) {
        f62711a.a(6, str, str2);
    }

    public static void e(String str, String str2, Throwable th2) {
        f62711a.b(6, str, str2, th2);
    }

    public static void i(String str, String str2) {
        f62711a.a(4, str, str2);
    }

    public static void init(Context context, int i10, String str) {
        b bVar = f62711a;
        bVar.a(context, i10, str);
        bVar.a(str, "============================================================================\n====== " + a(context) + "\n============================================================================");
    }

    public static boolean isErrorEnable() {
        return f62711a.a(6);
    }

    public static boolean isInfoEnable() {
        return f62711a.a(4);
    }

    public static boolean isWarnEnable() {
        return f62711a.a(5);
    }

    public static void setExtLogger(HMSExtLogger hMSExtLogger, boolean z10) throws IllegalArgumentException {
        if (hMSExtLogger == null) {
            throw new IllegalArgumentException("extLogger is not able to be null");
        }
        a aVar = new a(hMSExtLogger);
        if (z10) {
            f62711a.a(aVar);
        } else {
            f62711a.a().a(aVar);
        }
    }

    public static void w(String str, String str2) {
        f62711a.a(5, str, str2);
    }
}
