package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.w0;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ProcessCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: compiled from: ProcessCompat.java */
    @w0(16)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Object f20958a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f20959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static boolean f20960c;

        private a() {
        }

        @SuppressLint({"PrivateApi"})
        static boolean a(int i10) {
            try {
                synchronized (f20958a) {
                    if (!f20960c) {
                        f20960c = true;
                        f20959b = Class.forName("android.os.UserId").getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f20959b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i10));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: ProcessCompat.java */
    @w0(17)
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Object f20961a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f20962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static boolean f20963c;

        private b() {
        }

        @SuppressLint({"DiscouragedPrivateApi"})
        static boolean a(int i10) {
            try {
                synchronized (f20961a) {
                    if (!f20963c) {
                        f20963c = true;
                        f20962b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f20962b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i10));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: ProcessCompat.java */
    @w0(24)
    public static class c {
        private c() {
        }

        static boolean a(int i10) {
            return Process.isApplicationUid(i10);
        }
    }

    private c0() {
    }

    public static boolean a(int i10) {
        return Build.VERSION.SDK_INT >= 24 ? c.a(i10) : b.a(i10);
    }
}
