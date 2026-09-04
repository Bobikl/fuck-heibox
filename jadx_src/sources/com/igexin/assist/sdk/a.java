package com.igexin.assist.sdk;

import android.content.Context;
import android.util.Log;
import com.igexin.assist.control.AbstractPushManager;
import com.igexin.push.config.l;
import com.igexin.push.core.b.i;
import com.igexin.push.core.d;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f63303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f63304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f63305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f63306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f63307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f63308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f63309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f63310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f63311i;

    static AbstractPushManager a(Context context) {
        try {
            if (d(context)) {
                Log.d("Assist_PM", "support honor device");
                com.igexin.a.a.c.b.a("Assist_PM|HoPushManager checkDevice flag = true", new Object[0]);
                return a("com.igexin.assist.control.honor.HoPushManager", context);
            }
            if (b(context) && l.C) {
                Log.d("Assist_PM", "support xm device");
                com.igexin.a.a.c.b.a("Assist_PM|MiuiPushManager checkDevice flag = true", new Object[0]);
                return a("com.igexin.assist.control.xiaomi.MiuiPushManager", context);
            }
            if (c(context) && l.D) {
                Log.d("Assist_PM", "support mz device");
                com.igexin.a.a.c.b.a("Assist_PM|FlymePushManager checkDevice flag = true", new Object[0]);
                return a("com.igexin.assist.control.meizu.FlymePushManager", context);
            }
            if (e(context) && l.E) {
                Log.d("Assist_PM", "support hw device");
                com.igexin.a.a.c.b.a("Assist_PM|HmsPushManager checkDevice flag = true", new Object[0]);
                return a("com.igexin.assist.control.huawei.HmsPushManager", context);
            }
            if (f(context) && l.F) {
                Log.d("Assist_PM", "support oppo device");
                com.igexin.a.a.c.b.a("Assist_PM|OppoPushManager checkDevice flag = true", new Object[0]);
                return a("com.igexin.assist.control.oppo.OppoPushManager", context);
            }
            if (g(context) && l.G) {
                Log.d("Assist_PM", "support vivo device");
                com.igexin.a.a.c.b.a("Assist_PM|VivoPushManager checkDevice flag = true", new Object[0]);
                return a("com.igexin.assist.control.vivo.VivoPushManager", context);
            }
            if (h(context) && com.igexin.push.util.a.f()) {
                Log.d("Assist_PM", "support smartisan device");
                com.igexin.a.a.c.b.a("Assist_PM|SmartisanPushManager checkDevice flag = true", new Object[0]);
                return a("com.igexin.assist.control.st.SmartisanPushManager", context);
            }
            if (j(context) && l.H) {
                com.igexin.a.a.c.b.a("Assist_PM|FcmPushManager checkDevice flag = true", new Object[0]);
                return a("com.igexin.assist.control.fcm.FcmPushManager", context);
            }
            com.igexin.a.a.c.b.a("Assist_PM|getPushManager = null, setToken = false", new Object[0]);
            if (!d.b().booleanValue()) {
                i.a().c("false");
            }
            com.igexin.a.a.c.b.a("Assist_PM|OtherPushManager = null", new Object[0]);
            return null;
        } catch (Throwable unused) {
        }
    }

    private static AbstractPushManager a(String str, Context context) {
        try {
            return (AbstractPushManager) Class.forName(str).getConstructor(Context.class).newInstance(context);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean b(Context context) {
        int i10 = f63307e;
        boolean zBooleanValue = false;
        if ((i10 & 1) != 0) {
            return (i10 & 2) != 0;
        }
        try {
            zBooleanValue = ((Boolean) Class.forName("com.igexin.assist.control.xiaomi.MiuiPushManager").getMethod("checkXMDevice", Context.class).invoke(null, context)).booleanValue();
            if (zBooleanValue) {
                f63307e |= 2;
            }
        } catch (Throwable unused) {
        }
        f63307e |= 1;
        return zBooleanValue;
    }

    public static boolean c(Context context) {
        int i10 = f63306d;
        boolean zBooleanValue = false;
        if ((i10 & 1) != 0) {
            return (i10 & 2) != 0;
        }
        try {
            zBooleanValue = ((Boolean) Class.forName("com.igexin.assist.control.meizu.FlymePushManager").getMethod("checkMZDevice", Context.class).invoke(null, context)).booleanValue();
            if (zBooleanValue) {
                f63306d |= 2;
            }
        } catch (Throwable unused) {
        }
        f63306d |= 1;
        return zBooleanValue;
    }

    public static boolean d(Context context) {
        int i10 = f63303a;
        boolean zBooleanValue = false;
        if ((i10 & 1) != 0) {
            return (i10 & 2) != 0;
        }
        try {
            zBooleanValue = ((Boolean) Class.forName("com.igexin.assist.control.honor.HoPushManager").getMethod("checkHWDevice", Context.class).invoke(null, context)).booleanValue();
            if (zBooleanValue) {
                f63303a |= 2;
            }
        } catch (Throwable unused) {
        }
        f63303a |= 1;
        return zBooleanValue;
    }

    public static boolean e(Context context) {
        int i10 = f63304b;
        boolean zBooleanValue = false;
        if ((i10 & 1) != 0) {
            return (i10 & 2) != 0;
        }
        try {
            zBooleanValue = ((Boolean) Class.forName("com.igexin.assist.control.huawei.HmsPushManager").getMethod("checkHWDevice", Context.class).invoke(null, context)).booleanValue();
            if (zBooleanValue) {
                f63304b |= 2;
            }
        } catch (Throwable unused) {
        }
        f63304b |= 1;
        return zBooleanValue;
    }

    public static boolean f(Context context) {
        int i10 = f63305c;
        boolean zBooleanValue = false;
        if ((i10 & 1) != 0) {
            return (i10 & 2) != 0;
        }
        try {
            zBooleanValue = ((Boolean) Class.forName("com.igexin.assist.control.oppo.OppoPushManager").getMethod("checkOppoDevice", Context.class).invoke(null, context)).booleanValue();
            if (zBooleanValue) {
                f63305c |= 2;
            }
        } catch (Throwable unused) {
        }
        f63305c |= 1;
        return zBooleanValue;
    }

    public static boolean g(Context context) {
        int i10 = f63308f;
        boolean zBooleanValue = false;
        if ((i10 & 1) != 0) {
            return (i10 & 2) != 0;
        }
        try {
            zBooleanValue = ((Boolean) Class.forName("com.igexin.assist.control.vivo.VivoPushManager").getMethod("checkVivoDevice", Context.class).invoke(null, context)).booleanValue();
            if (zBooleanValue) {
                f63308f |= 2;
            }
        } catch (Throwable unused) {
        }
        f63308f |= 1;
        return zBooleanValue;
    }

    public static boolean h(Context context) {
        int i10 = f63309g;
        boolean zBooleanValue = false;
        if ((i10 & 1) != 0) {
            return (i10 & 2) != 0;
        }
        try {
            zBooleanValue = ((Boolean) Class.forName("com.igexin.assist.control.st.SmartisanPushManager").getMethod("checkSTDevice", Context.class).invoke(null, context)).booleanValue();
            if (zBooleanValue) {
                f63309g |= 2;
            }
        } catch (Throwable unused) {
        }
        f63309g |= 1;
        return zBooleanValue;
    }

    public static boolean i(Context context) {
        int i10 = f63311i;
        if ((i10 & 1) != 0) {
            return (i10 & 2) != 0;
        }
        boolean z10 = c(context) || b(context) || e(context) || f(context) || g(context) || h(context);
        if (z10) {
            f63311i |= 2;
        }
        f63311i |= 1;
        return z10;
    }

    public static boolean j(Context context) {
        int i10 = f63310h;
        boolean zBooleanValue = false;
        if ((i10 & 1) != 0) {
            return (i10 & 2) != 0;
        }
        try {
            zBooleanValue = ((Boolean) Class.forName("com.igexin.assist.control.fcm.FcmPushManager").getMethod("checkFcmDevice", Context.class).invoke(null, context)).booleanValue();
            if (zBooleanValue) {
                f63310h |= 2;
            }
        } catch (Throwable unused) {
        }
        f63310h |= 1;
        return zBooleanValue;
    }

    public static void k(Context context) {
        try {
            if (b(context)) {
                Class.forName("com.xiaomi.mipush.sdk.MiPushClient").getDeclaredMethod("clearNotification", Context.class).invoke(null, context);
                com.igexin.a.a.c.b.a("Assist_PM | cancelAllAssistNotification() XM ", new Object[0]);
            } else if (c(context)) {
                Class.forName("com.meizu.cloud.pushsdk.PushManager").getDeclaredMethod("clearNotification", Context.class).invoke(null, context);
                com.igexin.a.a.c.b.a("Assist_PM | cancelAllAssistNotification() MZ ", new Object[0]);
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("Assist_PM | cancelAllAssistNotification() err " + th2.toString(), new Object[0]);
        }
    }
}
