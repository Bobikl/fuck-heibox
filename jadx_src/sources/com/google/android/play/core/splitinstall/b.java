package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.os.Build;
import com.google.android.play.core.splitinstall.internal.p1;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p1 f56230a = new p1("SplitInstallHelper");

    private b() {
    }

    public static void a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str) throws UnsatisfiedLinkError {
        synchronized (b1.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e10) {
                String str2 = context.getApplicationInfo().nativeLibraryDir + "/" + System.mapLibraryName(str);
                if (!new File(str2).exists()) {
                    throw e10;
                }
                System.load(str2);
            }
        }
    }

    public static void b(@androidx.annotation.n0 Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 25 || i10 >= 28) {
            return;
        }
        p1 p1Var = f56230a;
        p1Var.d("Calling dispatchPackageBroadcast", new Object[0]);
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method method = cls.getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mAppThread");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{context.getPackageName()});
            p1Var.d("Called dispatchPackageBroadcast", new Object[0]);
        } catch (Exception e10) {
            f56230a.c(e10, "Update app info with dispatchPackageBroadcast failed!", new Object[0]);
        }
    }
}
