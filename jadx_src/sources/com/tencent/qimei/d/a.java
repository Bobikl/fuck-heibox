package com.tencent.qimei.d;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.qimei.k.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: AppInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f101221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f101222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map<String, Boolean> f101223c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f101224d = null;

    public static String a() {
        if (f101221a == null) {
            f101221a = d();
        }
        return f101221a;
    }

    public static String a(Context context) {
        String str = f101224d;
        if (str != null) {
            return str;
        }
        try {
            String str2 = (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
            f101224d = str2;
            return str2;
        } catch (Throwable th2) {
            com.tencent.qimei.n.a.a(th2);
            return "";
        }
    }

    public static void a(String str) {
        b(str);
        com.tencent.qimei.n.a.b("SDK_INIT ｜ AppInfo", " 初始化完成 ", new Object[0]);
    }

    public static boolean a(Context context, String str) {
        com.tencent.qimei.n.a.a("[appInfo] end", new Object[0]);
        return false;
    }

    public static long b() {
        Context contextF = com.tencent.qimei.u.d.b().F();
        if (contextF == null) {
            return 0L;
        }
        try {
            return contextF.getPackageManager().getPackageInfo(contextF.getPackageName(), 0).firstInstallTime;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    public static void b(String str) {
        try {
            String strD = f.b(str).d("A_V");
            String strA = a();
            if (TextUtils.isEmpty(strD) || !strA.equals(strD)) {
                f101223c.put(str, Boolean.TRUE);
                f.b(str).b("A_V", strA);
                com.tencent.qimei.n.a.b("SDK_INIT ｜ QIMEI", "App为新版本", new Object[0]);
            } else {
                f101223c.put(str, Boolean.FALSE);
            }
        } catch (Exception e10) {
            com.tencent.qimei.n.a.b("[core] app version check fail!", new Object[0]);
            com.tencent.qimei.n.a.a(e10);
        }
    }

    public static boolean b(Context context) {
        return b(context, context.getPackageName());
    }

    public static boolean b(Context context, String str) {
        if (context != null && str != null && str.trim().length() > 0) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)).getRunningAppProcesses();
            if (runningAppProcesses != null && runningAppProcesses.size() != 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100) {
                        for (String str2 : runningAppProcessInfo.pkgList) {
                            if (str.equals(str2)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            com.tencent.qimei.n.a.e("[appInfo] no running proc", new Object[0]);
        }
        return false;
    }

    public static String c() {
        Context contextF = com.tencent.qimei.u.d.b().F();
        String packageName = contextF != null ? contextF.getPackageName() : null;
        return TextUtils.isEmpty(packageName) ? "" : packageName;
    }

    public static synchronized boolean c(Context context) {
        if (f101222b == null) {
            f101222b = Boolean.valueOf(c(context, "android.permission.READ_PHONE_STATE"));
        }
        com.tencent.qimei.n.a.a("[appInfo] Read phone state permission: " + f101222b, new Object[0]);
        return f101222b.booleanValue();
    }

    public static boolean c(Context context, String str) {
        boolean z10 = false;
        if (context == null || str == null) {
            com.tencent.qimei.n.a.b("[appInfo] context or permission is null.", new Object[0]);
            return false;
        }
        try {
            if (context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                z10 = true;
            }
        } catch (Exception e10) {
            com.tencent.qimei.n.a.a(e10);
        }
        return !z10 ? a(context, str) : z10;
    }

    public static boolean c(String str) {
        Boolean bool = f101223c.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static synchronized String d() {
        try {
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                return "";
            }
            try {
                PackageInfo packageInfo = com.tencent.qimei.u.d.b().F().getPackageManager().getPackageInfo(strC, 0);
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
                        com.tencent.qimei.n.a.a("[appInfo] add versionCode: %s", Integer.valueOf(i10));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strReplace);
                        sb2.append(".");
                        sb2.append(i10);
                        strReplace = sb2.toString();
                    }
                    com.tencent.qimei.n.a.a("[appInfo] final Version: %s", strReplace);
                    return strReplace;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("");
                sb3.append(i10);
                return sb3.toString();
            } catch (Exception e10) {
                com.tencent.qimei.n.a.a(e10);
                com.tencent.qimei.n.a.b(e10.toString(), new Object[0]);
                return "";
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f101221a = str;
    }

    public static String e() {
        Context contextF = com.tencent.qimei.u.d.b().F();
        return contextF == null ? "" : (String) com.tencent.qimei.l.d.a(ApplicationInfo.class.getName(), contextF.getApplicationInfo(), "nativeLibraryDir");
    }

    public static String f() {
        Context contextF = com.tencent.qimei.u.d.b().F();
        return contextF == null ? "" : (String) com.tencent.qimei.l.d.a(ApplicationInfo.class.getName(), contextF.getApplicationInfo(), "primaryCpuAbi");
    }

    public static boolean g() {
        Context contextF = com.tencent.qimei.u.d.b().F();
        if (contextF == null) {
            return false;
        }
        String strA = a(contextF);
        return TextUtils.isEmpty(strA) || strA.equals(contextF.getPackageName());
    }
}
