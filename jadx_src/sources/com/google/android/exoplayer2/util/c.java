package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: BundleUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f51374a = "BundleUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private static Method f51375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private static Method f51376c;

    private c() {
    }

    @androidx.annotation.p0
    public static IBinder a(Bundle bundle, @androidx.annotation.p0 String str) {
        return u0.f51536a >= 18 ? bundle.getBinder(str) : b(bundle, str);
    }

    @androidx.annotation.p0
    private static IBinder b(Bundle bundle, @androidx.annotation.p0 String str) {
        Method method = f51375b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f51375b = method2;
                method2.setAccessible(true);
                method = f51375b;
            } catch (NoSuchMethodException e10) {
                u.i(f51374a, "Failed to retrieve getIBinder method", e10);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            u.i(f51374a, "Failed to invoke getIBinder via reflection", e11);
            return null;
        }
    }

    public static void c(Bundle bundle, @androidx.annotation.p0 String str, @androidx.annotation.p0 IBinder iBinder) {
        if (u0.f51536a >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            d(bundle, str, iBinder);
        }
    }

    private static void d(Bundle bundle, @androidx.annotation.p0 String str, @androidx.annotation.p0 IBinder iBinder) {
        Method method = f51376c;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f51376c = method2;
                method2.setAccessible(true);
                method = f51376c;
            } catch (NoSuchMethodException e10) {
                u.i(f51374a, "Failed to retrieve putIBinder method", e10);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            u.i(f51374a, "Failed to invoke putIBinder via reflection", e11);
        }
    }
}
