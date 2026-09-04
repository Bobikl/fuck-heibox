package com.billy.android.swipe.internal;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import com.billy.android.swipe.SmartSwipeWrapper;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: ActivityTranslucentUtil.java */
/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"PrivateApi"})
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Class f40453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f40454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Method f40455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Method f40456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f40457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f40458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static WeakReference<Activity> f40459k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f40460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MessageQueue.IdleHandler f40462c = new C0320a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f40463d;

    /* JADX INFO: renamed from: com.billy.android.swipe.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityTranslucentUtil.java */
    public class C0320a implements MessageQueue.IdleHandler {
        C0320a() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            a.this.f();
            return false;
        }
    }

    /* JADX INFO: compiled from: ActivityTranslucentUtil.java */
    public class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f40465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f40466b;

        b(long j10, boolean z10) {
            this.f40465a = j10;
            this.f40466b = z10;
        }

        @Override // com.billy.android.swipe.internal.a.d
        public void a(boolean z10) {
            if (this.f40465a == a.this.f40463d) {
                if (!this.f40466b || z10) {
                    a.this.l(z10);
                } else {
                    a.this.h(false);
                }
            }
        }
    }

    /* JADX INFO: compiled from: ActivityTranslucentUtil.java */
    public static final class c implements InvocationHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f40468b;

        c(d dVar) {
            this.f40468b = dVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            boolean zBooleanValue = false;
            if (objArr != null && objArr.length == 1) {
                zBooleanValue = ((Boolean) objArr[0]).booleanValue();
            }
            a.i(this.f40468b, zBooleanValue);
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityTranslucentUtil.java */
    public interface d {
        void a(boolean z10);
    }

    public a(Activity activity) {
        this.f40460a = activity;
    }

    public static void e(Activity activity) {
        if (activity == null) {
            return;
        }
        WeakReference<Activity> weakReference = f40459k;
        if (weakReference != null && weakReference.get() == activity) {
            f40459k = null;
        }
        try {
            if (f40454f == null) {
                if (f40458j) {
                    return;
                }
                f40458j = true;
                Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
                declaredMethod.setAccessible(true);
                f40454f = declaredMethod;
            }
            f40454f.invoke(activity, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    public static void g(Activity activity, d dVar) {
        f40459k = new WeakReference<>(activity);
        try {
            if (f40453e == null) {
                for (Class<?> cls : Activity.class.getDeclaredClasses()) {
                    if (cls.getSimpleName().contains("TranslucentConversionListener")) {
                        f40453e = cls;
                    }
                }
            }
            Object objNewProxyInstance = f40453e != null ? Proxy.newProxyInstance(f40453e.getClassLoader(), new Class[]{f40453e}, new c(dVar)) : null;
            if (f40455g == null && f40457i) {
                i(dVar, false);
                return;
            }
            if (f40455g == null) {
                f40457i = true;
                Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
                declaredMethod.setAccessible(true);
                f40456h = declaredMethod;
                Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", f40453e, ActivityOptions.class);
                declaredMethod2.setAccessible(true);
                f40455g = declaredMethod2;
            }
            f40455g.invoke(activity, objNewProxyInstance, f40456h.invoke(activity, new Object[0]));
            if (objNewProxyInstance == null) {
                i(dVar, false);
            }
        } catch (Throwable unused) {
            i(dVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(d dVar, boolean z10) {
        if (dVar != null) {
            dVar.a(z10);
        }
        f40459k = null;
    }

    public static void j(Activity activity) {
        if (activity != null) {
            View viewFindViewById = activity.findViewById(R.id.content);
            if (viewFindViewById.getBackground() == null) {
                TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{R.attr.windowBackground});
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                typedArrayObtainStyledAttributes.recycle();
                if (resourceId != 0) {
                    viewFindViewById.setBackgroundResource(resourceId);
                }
            }
            Window window = activity.getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.getDecorView().setBackgroundDrawable(null);
            SmartSwipeWrapper smartSwipeWrapperH = com.billy.android.swipe.b.h(activity);
            if (smartSwipeWrapperH != null) {
                smartSwipeWrapperH.setBackgroundColor(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(boolean z10) {
        this.f40461b = z10;
    }

    public void d() {
        this.f40463d = SystemClock.elapsedRealtime();
        e(this.f40460a);
        l(false);
    }

    public void f() {
        h(true);
    }

    public void h(boolean z10) {
        if (this.f40461b || this.f40460a == null) {
            return;
        }
        if (f40459k != null) {
            Looper.myQueue().addIdleHandler(this.f40462c);
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f40463d = jElapsedRealtime;
        g(this.f40460a, new b(jElapsedRealtime, z10));
    }

    public boolean k() {
        return this.f40461b;
    }
}
