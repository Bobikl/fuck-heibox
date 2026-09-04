package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.xiaomi.push.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1339r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f107825a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f942a;

    public static int a() {
        try {
            Class<?> clsA = a(null, "miui.os.Build");
            if (clsA.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return clsA.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Context m655a() {
        return f107825a;
    }

    public static Class<?> a(Context context, String str) throws ClassNotFoundException {
        if (str == null || str.trim().length() == 0) {
            throw new ClassNotFoundException("class is empty");
        }
        boolean z10 = context != null;
        if (z10 && Build.VERSION.SDK_INT >= 29) {
            try {
                return context.getClassLoader().loadClass(str);
            } catch (Throwable unused) {
            }
        }
        try {
            return Class.forName(str);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m62a(String.format("loadClass fail hasContext= %s, errMsg = %s", Boolean.valueOf(z10), th2.getLocalizedMessage()));
            throw new ClassNotFoundException("loadClass fail ", th2);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static synchronized String m656a() {
        String str = f942a;
        if (str != null) {
            return str;
        }
        String strValueOf = Build.VERSION.INCREMENTAL;
        if (a() <= 0) {
            String strB = b();
            if (TextUtils.isEmpty(strB)) {
                strB = c();
                if (TextUtils.isEmpty(strB)) {
                    strB = d();
                    if (TextUtils.isEmpty(strB)) {
                        strValueOf = String.valueOf(q.a("ro.product.brand", "Android") + lg.a.f131412e + strValueOf);
                    }
                }
                strValueOf = strB;
            } else {
                strValueOf = strB;
            }
        }
        f942a = strValueOf;
        return strValueOf;
    }

    public static void a(Context context) {
        f107825a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m657a() {
        return TextUtils.equals((String) bk.a("android.os.SystemProperties", "get", "sys.boot_completed"), "1");
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m658a(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return false;
        }
    }

    private static String b() {
        String strA = q.a(r4.a.f138781a, "");
        f942a = strA;
        return strA;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static boolean m659b() {
        try {
            return a(null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(Boolean.FALSE);
        } catch (ClassNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.b.d("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return false;
        }
    }

    private static String c() {
        String strA = q.a("ro.build.version.opporom", "");
        if (!TextUtils.isEmpty(strA) && !strA.startsWith("ColorOS_")) {
            f942a = "ColorOS_" + strA;
        }
        return f942a;
    }

    private static String d() {
        String strA = q.a("ro.vivo.os.version", "");
        if (!TextUtils.isEmpty(strA) && !strA.startsWith("FuntouchOS_")) {
            f942a = "FuntouchOS_" + strA;
        }
        return f942a;
    }
}
