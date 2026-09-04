package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: ActivityRecreator.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20004a = "ActivityRecreator";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Class<?> f20005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f20006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Field f20007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f20008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f20009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final Method f20010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Handler f20011h = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: ActivityRecreator.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f20012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f20013c;

        a(d dVar, Object obj) {
            this.f20012b = dVar;
            this.f20013c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20012b.f20018b = this.f20013c;
        }
    }

    /* JADX INFO: compiled from: ActivityRecreator.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f20014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f20015c;

        b(Application application, d dVar) {
            this.f20014b = application;
            this.f20015c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20014b.unregisterActivityLifecycleCallbacks(this.f20015c);
        }
    }

    /* JADX INFO: compiled from: ActivityRecreator.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f20016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f20017c;

        c(Object obj, Object obj2) {
            this.f20016b = obj;
            this.f20017c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = l.f20008e;
                if (method != null) {
                    method.invoke(this.f20016b, this.f20017c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    l.f20009f.invoke(this.f20016b, this.f20017c, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e(l.f20004a, "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* JADX INFO: compiled from: ActivityRecreator.java */
    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f20018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Activity f20019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f20020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f20021e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f20022f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f20023g = false;

        d(@androidx.annotation.n0 Activity activity) {
            this.f20019c = activity;
            this.f20020d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f20019c == activity) {
                this.f20019c = null;
                this.f20022f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f20022f || this.f20023g || this.f20021e || !l.h(this.f20018b, this.f20020d, activity)) {
                return;
            }
            this.f20023g = true;
            this.f20018b = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f20019c == activity) {
                this.f20021e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f20005b = clsA;
        f20006c = b();
        f20007d = f();
        f20008e = d(clsA);
        f20009f = c(clsA);
        f20010g = e(clsA);
    }

    private l() {
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f20007d.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f20011h.postAtFrontOfQueue(new c(f20006c.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e(f20004a, "Exception while fetching field values", th2);
            return false;
        }
    }

    static boolean i(@androidx.annotation.n0 Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f20010g == null) {
            return false;
        }
        if (f20009f == null && f20008e == null) {
            return false;
        }
        try {
            Object obj2 = f20007d.get(activity);
            if (obj2 == null || (obj = f20006c.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            f20011h.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f20010g;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f20011h.post(new b(application, dVar));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
