package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.bk;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f106796a = -1;

    public static ag a(Context context) {
        if (m139a(context)) {
            return ag.HUAWEI;
        }
        if (c(context)) {
            return ag.OPPO;
        }
        return d(context) ? ag.VIVO : ag.OTHER;
    }

    private static boolean a() {
        try {
            String str = (String) bk.a("android.os.SystemProperties", "get", "ro.build.hw_emui_api_level", "");
            return !TextUtils.isEmpty(str) && Integer.parseInt(str) >= 9;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m139a(Context context) {
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), 128) != null && a();
        } catch (Throwable unused) {
        }
    }

    public static boolean b(Context context) {
        Object objA = bk.a(bk.a("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object objA2 = bk.a("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (objA2 == null || !(objA2 instanceof Integer)) {
            com.xiaomi.channel.commonutils.logger.b.c("google service is not avaliable");
            f106796a = 0;
            return false;
        }
        int iIntValue = ((Integer) Integer.class.cast(objA2)).intValue();
        if (objA != null) {
            if (objA instanceof Integer) {
                f106796a = ((Integer) Integer.class.cast(objA)).intValue() == iIntValue ? 1 : 0;
            } else {
                f106796a = 0;
                com.xiaomi.channel.commonutils.logger.b.c("google service is not avaliable");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("is google service can be used");
        sb2.append(f106796a > 0);
        com.xiaomi.channel.commonutils.logger.b.c(sb2.toString());
        return f106796a > 0;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue = false;
        Object objA = bk.a("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        if (objA != null && (objA instanceof Boolean)) {
            zBooleanValue = ((Boolean) Boolean.class.cast(objA)).booleanValue();
        }
        com.xiaomi.channel.commonutils.logger.b.c("color os push  is avaliable ? :" + zBooleanValue);
        return zBooleanValue;
    }

    public static boolean d(Context context) {
        boolean zBooleanValue = false;
        Object objA = bk.a("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        if (objA != null && (objA instanceof Boolean)) {
            zBooleanValue = ((Boolean) Boolean.class.cast(objA)).booleanValue();
        }
        com.xiaomi.channel.commonutils.logger.b.c("fun touch os push  is avaliable ? :" + zBooleanValue);
        return zBooleanValue;
    }
}
