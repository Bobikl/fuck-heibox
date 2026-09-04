package com.max.hbutils.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: HeyboxActivityManager.java */
/* JADX INFO: loaded from: classes13.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static e f73537b = new e();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f73538a;

    private e() {
    }

    public static e b() {
        return f73537b;
    }

    public static boolean c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.No, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                    return true;
                }
            }
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.G("HeyboxActivityManager isAppForeground error: " + th2.getMessage());
        }
        return false;
    }

    public Activity a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Oo, new Class[0], Activity.class);
        if (patchProxyResultProxy.isSupported) {
            return (Activity) patchProxyResultProxy.result;
        }
        WeakReference<Activity> weakReference = this.f73538a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void d(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.k.Po, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f73538a = new WeakReference<>(activity);
    }
}
