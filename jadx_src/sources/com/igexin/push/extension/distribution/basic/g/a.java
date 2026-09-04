package com.igexin.push.extension.distribution.basic.g;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f64000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f64001b;

    public static boolean a(Context context) {
        int i10 = f64001b;
        boolean zBooleanValue = false;
        if ((i10 & 1) != 0) {
            return (i10 & 2) != 0;
        }
        try {
            zBooleanValue = ((Boolean) Class.forName("com.igexin.assist.control.xiaomi.MiuiPushManager").getMethod("checkXMDevice", Context.class).invoke(null, context)).booleanValue();
            if (zBooleanValue) {
                f64001b |= 2;
            }
        } catch (Throwable unused) {
        }
        f64001b |= 1;
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        int i10 = f64000a;
        boolean zBooleanValue = false;
        if ((i10 & 1) != 0) {
            return (i10 & 2) != 0;
        }
        try {
            zBooleanValue = ((Boolean) Class.forName("com.igexin.assist.control.meizu.FlymePushManager").getMethod("checkMZDevice", Context.class).invoke(null, context)).booleanValue();
            if (zBooleanValue) {
                f64000a |= 2;
            }
        } catch (Throwable unused) {
        }
        f64000a |= 1;
        return zBooleanValue;
    }

    public static void c(Context context) {
        try {
            if (a(context)) {
                Class.forName("com.xiaomi.mipush.sdk.MiPushClient").getDeclaredMethod("clearNotification", Context.class).invoke(null, context);
                com.igexin.a.a.c.b.a("AssistUtil | cancelAllAssistNotification() XM ", new Object[0]);
            } else if (b(context)) {
                Class.forName("com.meizu.cloud.pushsdk.PushManager").getDeclaredMethod("clearNotification", Context.class).invoke(null, context);
                com.igexin.a.a.c.b.a("AssistUtil | cancelAllAssistNotification() MZ ", new Object[0]);
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("AssistUtil | cancelAllAssistNotification() err " + th2.toString(), new Object[0]);
        }
    }
}
