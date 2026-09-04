package androidx.core.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: BundleCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: compiled from: BundleCompat.java */
    @androidx.annotation.w0(18)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @androidx.annotation.u
        static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* JADX INFO: compiled from: BundleCompat.java */
    @SuppressLint({"BanUncheckedReflection"})
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f20372a = "BundleCompatBaseImpl";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f20373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static boolean f20374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static Method f20375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static boolean f20376e;

        private b() {
        }

        public static IBinder a(Bundle bundle, String str) {
            if (!f20374c) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f20373b = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i(f20372a, "Failed to retrieve getIBinder method", e10);
                }
                f20374c = true;
            }
            Method method2 = f20373b;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
                    Log.i(f20372a, "Failed to invoke getIBinder via reflection", e11);
                    f20373b = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f20376e) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f20375d = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i(f20372a, "Failed to retrieve putIBinder method", e10);
                }
                f20376e = true;
            }
            Method method2 = f20375d;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
                    Log.i(f20372a, "Failed to invoke putIBinder via reflection", e11);
                    f20375d = null;
                }
            }
        }
    }

    private r() {
    }

    @androidx.annotation.p0
    public static IBinder a(@androidx.annotation.n0 Bundle bundle, @androidx.annotation.p0 String str) {
        return a.a(bundle, str);
    }

    public static void b(@androidx.annotation.n0 Bundle bundle, @androidx.annotation.p0 String str, @androidx.annotation.p0 IBinder iBinder) {
        a.b(bundle, str, iBinder);
    }
}
