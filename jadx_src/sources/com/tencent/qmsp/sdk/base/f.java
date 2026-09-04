package com.tencent.qmsp.sdk.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f101764a;

    public static Context a() {
        Context context;
        synchronized (f.class) {
            if (f101764a == null) {
                f101764a = b();
            }
            context = f101764a;
        }
        return context;
    }

    public static String a(Context context) {
        String packageName = "";
        if (context == null) {
            return "";
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            packageName = (applicationInfo == null || TextUtils.isEmpty(applicationInfo.packageName)) ? a().getPackageName() : applicationInfo.packageName;
        } catch (Exception unused) {
        }
        return packageName;
    }

    public static Context b() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
