package com.tencent.beacon.a.c;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: AppInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f98779a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f98780b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f98781c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f98782d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f98783e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f98784f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f98785g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f98786h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f98787i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f98788j = -2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f98789k = true;

    public static String a() {
        if (f98779a == null) {
            f98779a = e();
        }
        return f98779a;
    }

    public static synchronized String a(Context context) {
        if (TextUtils.isEmpty(f98783e)) {
            String str = "on_app_first_install_time_" + c(context);
            com.tencent.beacon.a.d.a aVarA = com.tencent.beacon.a.d.a.a();
            long time = aVarA.getLong(str, 0L);
            if (time == 0) {
                time = new Date().getTime();
                com.tencent.beacon.a.b.a.a().a(new a(aVarA, str, time));
            }
            String strValueOf = String.valueOf(time);
            f98783e = strValueOf;
            com.tencent.beacon.base.util.c.a("[appInfo] process: %s, getAppFirstInstallTime: %s", str, strValueOf);
        }
        com.tencent.beacon.base.util.c.a("[appInfo] getAppFirstInstallTime: %s", f98783e);
        return f98783e;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            com.tencent.beacon.base.util.c.e("[appInfo] set qq is null !", new Object[0]);
            return;
        }
        try {
            if (Long.parseLong(str) > 10000) {
                f98785g = str;
            }
        } catch (Exception unused) {
            com.tencent.beacon.base.util.c.e("[appInfo] set qq is not available !", new Object[0]);
        }
    }

    public static boolean a(Context context, String str) {
        if (f98787i) {
            return f98789k;
        }
        if (context != null && str != null && str.trim().length() > 0) {
            if (!com.tencent.beacon.e.b.a().h()) {
                com.tencent.beacon.base.util.c.a("[DeviceInfo] current collect Process Info be refused! isCollect Process Info: %s", Boolean.FALSE);
                return true;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)).getRunningAppProcesses();
            if (runningAppProcesses != null && runningAppProcesses.size() != 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100) {
                        for (String str2 : runningAppProcessInfo.pkgList) {
                            if (str.equals(str2)) {
                                f98789k = true;
                                f98787i = true;
                                return true;
                            }
                        }
                    }
                }
                f98789k = false;
                f98787i = true;
                return false;
            }
            com.tencent.beacon.base.util.c.e("[appInfo] no running proc", new Object[0]);
        }
        return false;
    }

    public static int b(Context context) {
        if (f98786h) {
            return f98788j;
        }
        if (f98780b == 0) {
            f98780b = Process.myPid();
        }
        if (!com.tencent.beacon.e.b.a().h()) {
            com.tencent.beacon.base.util.c.a("[DeviceInfo] current collect Process Info be refused! isCollect Process Info: %s", Boolean.FALSE);
            return -2;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        if (activityManager != null && activityManager.getRunningAppProcesses() != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == f98780b) {
                    int i10 = runningAppProcessInfo.importance;
                    f98788j = i10;
                    f98786h = true;
                    return i10;
                }
            }
        }
        f98788j = 0;
        f98786h = true;
        return 0;
    }

    public static String b() {
        Context contextC = c.d().c();
        if (contextC == null) {
            return null;
        }
        String packageName = contextC.getPackageName();
        return TextUtils.isEmpty(packageName) ? "" : packageName;
    }

    public static String c() {
        return f98785g;
    }

    public static String c(Context context) {
        return com.tencent.beacon.base.util.a.a();
    }

    public static String d() {
        if (!"".equals(f98781c)) {
            return f98781c;
        }
        if (f98780b == 0) {
            f98780b = Process.myPid();
        }
        f98781c += f98780b + lg.a.f131412e;
        String str = f98781c + new Date().getTime();
        f98781c = str;
        return str;
    }

    public static boolean d(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e10) {
            com.tencent.beacon.base.util.c.a(e10);
            return false;
        }
    }

    public static synchronized String e() {
        try {
            String strB = b();
            if (TextUtils.isEmpty(strB)) {
                return null;
            }
            try {
                PackageInfo packageInfo = c.d().c().getPackageManager().getPackageInfo(strB, 0);
                String str = packageInfo.versionName;
                int i10 = packageInfo.versionCode;
                if (str != null && str.trim().length() > 0) {
                    String strReplace = str.trim().replace('\n', ' ').replace('\r', ' ').replace("|", "%7C");
                    int i11 = 0;
                    for (char c10 : strReplace.toCharArray()) {
                        if (c10 == '.') {
                            i11++;
                        }
                    }
                    if (i11 < 3) {
                        com.tencent.beacon.base.util.c.a("[appInfo] add versionCode: %s", Integer.valueOf(i10));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strReplace);
                        sb2.append(".");
                        sb2.append(i10);
                        strReplace = sb2.toString();
                    }
                    com.tencent.beacon.base.util.c.a("[appInfo] final Version: %s", strReplace);
                    return strReplace;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("");
                sb3.append(i10);
                return sb3.toString();
            } catch (Throwable th2) {
                com.tencent.beacon.base.util.c.a(th2);
                com.tencent.beacon.base.util.c.b(th2.toString(), new Object[0]);
                return "";
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static synchronized boolean e(Context context) {
        boolean z10 = false;
        try {
            if (context == null) {
                com.tencent.beacon.base.util.c.b("[appInfo] context is null", new Object[0]);
                return false;
            }
            com.tencent.beacon.a.d.a aVarA = com.tencent.beacon.a.d.a.a();
            String string = aVarA.getString("APPVER_DENGTA", "");
            String strA = a();
            if (string.isEmpty() || !string.equals(strA)) {
                z10 = true;
                com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = aVarA.edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
                    sharedPreferencesEditorC0949aEdit.putString("APPVER_DENGTA", strA);
                }
            }
            return z10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void f() {
        h();
    }

    public static boolean f(Context context) {
        return a(context, context.getPackageName());
    }

    public static synchronized boolean g() {
        boolean z10;
        z10 = false;
        com.tencent.beacon.a.d.a aVarA = com.tencent.beacon.a.d.a.a();
        String string = aVarA.getString("APPKEY_DENGTA", "");
        String strF = c.d().f();
        if (TextUtils.isEmpty(string) || !strF.equals(string)) {
            z10 = true;
            com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = aVarA.edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
                sharedPreferencesEditorC0949aEdit.putString("APPKEY_DENGTA", strF);
            }
        }
        return z10;
    }

    public static boolean g(Context context) {
        if (context == null) {
            return true;
        }
        String strC = c(context);
        return TextUtils.isEmpty(strC) || strC.equals(context.getPackageName());
    }

    private static void h() {
        try {
            com.tencent.beacon.a.d.a aVarA = com.tencent.beacon.a.d.a.a();
            String string = aVarA.getString("APPVER_DENGTA", "");
            String strA = a();
            if (TextUtils.isEmpty(string) || !strA.equals(string)) {
                f98784f = true;
                com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = aVarA.edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
                    sharedPreferencesEditorC0949aEdit.putString("APPVER_DENGTA", strA);
                }
            } else {
                f98784f = false;
            }
        } catch (Exception e10) {
            com.tencent.beacon.base.util.c.b("[core] app version check fail!", new Object[0]);
            com.tencent.beacon.base.util.c.a(e10);
        }
    }
}
