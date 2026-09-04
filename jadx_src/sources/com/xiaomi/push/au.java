package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class au {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f106835a = false;

    private static void a(Class<?> cls, Context context) {
        if (f106835a) {
            return;
        }
        try {
            f106835a = true;
            cls.getDeclaredMethod("InitEntry", Context.class).invoke(cls, context);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m62a("mdid:load lib error " + th2);
        }
    }

    public static boolean a(Context context) {
        try {
            Class<?> clsA = C1339r.a(context, "com.bun.miitmdid.core.JLibrary");
            if (clsA == null) {
                return false;
            }
            a(clsA, context);
            return true;
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m62a("mdid:check error " + th2);
            return false;
        }
    }
}
