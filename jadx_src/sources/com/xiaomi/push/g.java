package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f107160a;

    public interface a {
        Map<String, String> a(Context context, String str);

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        boolean m399a(Context context, String str);

        boolean b(Context context, String str);
    }

    public enum b {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);


        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private final int f449a;

        b(int i10) {
            this.f449a = i10;
        }

        public int a() {
            return this.f449a;
        }
    }

    public static int a(Context context) {
        Bundle bundle;
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.android.systemui", 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("SupportForPushVersionCode");
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static int a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static ApplicationInfo m391a(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.b.m62a("not found app info " + str);
            return null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Drawable m392a(Context context, String str) {
        ApplicationInfo applicationInfoM391a = m391a(context, str);
        Drawable drawableLoadIcon = null;
        if (applicationInfoM391a != null) {
            try {
                drawableLoadIcon = applicationInfoM391a.loadIcon(context.getPackageManager());
                if (drawableLoadIcon == null) {
                    drawableLoadIcon = applicationInfoM391a.loadLogo(context.getPackageManager());
                }
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.m62a("get app icon drawable failed, " + e10);
            }
        }
        return drawableLoadIcon != null ? drawableLoadIcon : new ColorDrawable(0);
    }

    private static b a(Context context, ApplicationInfo applicationInfo) {
        int i10 = Build.VERSION.SDK_INT;
        if (applicationInfo == null || i10 < 24) {
            return b.UNKNOWN;
        }
        Boolean boolValueOf = null;
        try {
            if (applicationInfo.packageName.equals(context.getPackageName())) {
                boolValueOf = Boolean.valueOf(((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled());
            } else {
                Object objA = i10 >= 29 ? bk.a(context.getSystemService("notification"), "getService", new Object[0]) : context.getSystemService("security");
                if (objA != null) {
                    boolValueOf = (Boolean) bk.b(objA, "areNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid));
                }
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue() ? b.ALLOWED : b.NOT_ALLOWED;
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("are notifications enabled error " + e10);
        }
        return b.UNKNOWN;
    }

    @TargetApi(19)
    public static b a(Context context, String str, boolean z10) {
        if (context == null || TextUtils.isEmpty(str)) {
            return b.UNKNOWN;
        }
        try {
            ApplicationInfo applicationInfo = str.equals(context.getPackageName()) ? context.getApplicationInfo() : context.getPackageManager().getApplicationInfo(str, 0);
            b bVarA = a(context, applicationInfo);
            b bVar = b.UNKNOWN;
            if (bVarA != bVar) {
                return bVarA;
            }
            Integer num = (Integer) bk.a((Class<? extends Object>) AppOpsManager.class, "OP_POST_NOTIFICATION");
            if (num == null) {
                return bVar;
            }
            Integer num2 = (Integer) bk.a(context.getSystemService("appops"), "checkOpNoThrow", num, Integer.valueOf(applicationInfo.uid), str);
            int i10 = (Integer) bk.a((Class<? extends Object>) AppOpsManager.class, "MODE_ALLOWED");
            int i11 = (Integer) bk.a((Class<? extends Object>) AppOpsManager.class, "MODE_IGNORED");
            com.xiaomi.channel.commonutils.logger.b.b(String.format("get app mode %s|%s|%s", num2, i10, i11));
            if (i10 == null) {
                i10 = 0;
            }
            if (i11 == null) {
                i11 = 1;
            }
            if (num2 != null) {
                if (z10) {
                    return !num2.equals(i11) ? b.ALLOWED : b.NOT_ALLOWED;
                }
                return num2.equals(i10) ? b.ALLOWED : b.NOT_ALLOWED;
            }
            return b.UNKNOWN;
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m62a("get app op error " + th2);
        }
    }

    public static String a() {
        String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : (String) bk.a("android.app.ActivityThread", "currentProcessName", new Object[0]);
        return !TextUtils.isEmpty(processName) ? processName : "";
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m393a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Map<String, String> m394a(Context context, String str) {
        a aVar = f107160a;
        if (aVar == null) {
            return null;
        }
        return aVar.a(context, str);
    }

    public static void a(Context context, ApplicationInfo applicationInfo, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (b.ALLOWED != a(context, applicationInfo)) {
            try {
                Object objA = i10 >= 29 ? bk.a(context.getSystemService("notification"), "getService", new Object[0]) : context.getSystemService("security");
                if (objA != null) {
                    bk.b(objA, "setNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid), Boolean.valueOf(z10));
                }
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.m62a("set notifications enabled error " + e10);
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m395a(Context context) {
        String strA = a();
        if (TextUtils.isEmpty(strA) || context == null) {
            return false;
        }
        return strA.equals(context.getPackageName());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m396a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!j.m520a()) {
            return context.getPackageName().equals(str);
        }
        a aVar = f107160a;
        return aVar != null && aVar.m399a(context, str);
    }

    public static int b(Context context, String str) {
        ApplicationInfo applicationInfoM391a = m391a(context, str);
        if (applicationInfoM391a == null) {
            return 0;
        }
        int i10 = applicationInfoM391a.icon;
        return i10 == 0 ? applicationInfoM391a.logo : i10;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static String m397b(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? str : packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static boolean m398b(Context context, String str) {
        a aVar = f107160a;
        return aVar != null && aVar.b(context, str);
    }

    public static boolean c(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static boolean d(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static boolean e(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "freeform_window_state", -1) >= 0) {
                return str.equals(Settings.Secure.getString(context.getContentResolver(), "freeform_package_name"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
