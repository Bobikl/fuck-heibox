package com.tencent.qmsp.oaid2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f101584a;

    public static Context a() {
        Context context;
        synchronized (e.class) {
            if (f101584a == null) {
                f101584a = b();
            }
            context = f101584a;
        }
        return context;
    }

    public static String a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            return (applicationInfo == null || TextUtils.isEmpty(applicationInfo.packageName)) ? a().getPackageName() : applicationInfo.packageName;
        } catch (Exception unused) {
            return "";
        }
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
