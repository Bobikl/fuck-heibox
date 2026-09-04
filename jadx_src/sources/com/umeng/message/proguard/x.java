package com.umeng.message.proguard;

import android.app.Application;
import android.content.Context;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.message.common.UPLog;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Application f105907a;

    public static Application a() {
        Application application = f105907a;
        if (application != null) {
            return application;
        }
        try {
            Context appContext = UMGlobalContext.getAppContext();
            if (appContext != null) {
                Application application2 = (Application) appContext.getApplicationContext();
                f105907a = application2;
                if (application2 != null) {
                    return application2;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Application application3 = (Application) cls.getMethod("getApplication", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]), new Object[0]);
            f105907a = application3;
            if (application3 != null) {
                return application3;
            }
        } catch (Exception unused2) {
        }
        UPLog.e("Core", "context null! make sure PushAgent.setup(...) be called in Application.onCreate().");
        throw new IllegalStateException("context null! make sure PushAgent.setup(...) be called in Application.onCreate().");
    }

    public static void a(Context context) {
        if (f105907a != null || context == null) {
            return;
        }
        f105907a = (Application) context.getApplicationContext();
    }
}
