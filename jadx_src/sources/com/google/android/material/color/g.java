package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;
import com.google.android.material.color.utilities.b0;
import com.google.android.material.color.utilities.k6;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DynamicColors.java */
/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f53722a = {R.attr.dynamicColorThemeOverlay};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f53723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"PrivateApi"})
    private static final c f53724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, c> f53725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, c> f53726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f53727f = 0;

    /* JADX INFO: compiled from: DynamicColors.java */
    public class a implements c {
        a() {
        }

        @Override // com.google.android.material.color.g.c
        public boolean isSupported() {
            return true;
        }
    }

    /* JADX INFO: compiled from: DynamicColors.java */
    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f53728a;

        b() {
        }

        @Override // com.google.android.material.color.g.c
        public boolean isSupported() {
            if (this.f53728a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    this.f53728a = Long.valueOf(((Long) declaredMethod.invoke(null, "ro.build.version.oneui")).longValue());
                } catch (Exception unused) {
                    this.f53728a = -1L;
                }
            }
            return this.f53728a.longValue() >= 40100;
        }
    }

    /* JADX INFO: compiled from: DynamicColors.java */
    public interface c {
        boolean isSupported();
    }

    /* JADX INFO: compiled from: DynamicColors.java */
    public static class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f53729b;

        d(@n0 h hVar) {
            this.f53729b = hVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@n0 Activity activity, @p0 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@n0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@n0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@n0 Activity activity, @p0 Bundle bundle) {
            g.j(activity, this.f53729b);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@n0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@n0 Activity activity, @n0 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@n0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@n0 Activity activity) {
        }
    }

    /* JADX INFO: compiled from: DynamicColors.java */
    public interface e {
        void a(@n0 Activity activity);
    }

    /* JADX INFO: compiled from: DynamicColors.java */
    public interface f {
        boolean a(@n0 Activity activity, @e1 int i10);
    }

    static {
        a aVar = new a();
        f53723b = aVar;
        b bVar = new b();
        f53724c = bVar;
        HashMap map = new HashMap();
        map.put("fcnt", aVar);
        map.put("google", aVar);
        map.put("hmd global", aVar);
        map.put("infinix", aVar);
        map.put("infinix mobility limited", aVar);
        map.put("itel", aVar);
        map.put("kyocera", aVar);
        map.put("lenovo", aVar);
        map.put("lge", aVar);
        map.put("motorola", aVar);
        map.put("nothing", aVar);
        map.put("oneplus", aVar);
        map.put("oppo", aVar);
        map.put("realme", aVar);
        map.put("robolectric", aVar);
        map.put("samsung", bVar);
        map.put("sharp", aVar);
        map.put("sony", aVar);
        map.put("tcl", aVar);
        map.put("tecno", aVar);
        map.put("tecno mobile limited", aVar);
        map.put("vivo", aVar);
        map.put("wingtech", aVar);
        map.put("xiaomi", aVar);
        f53725d = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", aVar);
        map2.put("jio", aVar);
        f53726e = Collections.unmodifiableMap(map2);
    }

    private g() {
    }

    @Deprecated
    public static void a(@n0 Activity activity) {
        i(activity);
    }

    @Deprecated
    public static void b(@n0 Activity activity, @e1 int i10) {
        j(activity, new h.c().i(i10).e());
    }

    @Deprecated
    public static void c(@n0 Activity activity, @n0 f fVar) {
        j(activity, new h.c().h(fVar).e());
    }

    public static void d(@n0 Application application) {
        h(application, new h.c().e());
    }

    @Deprecated
    public static void e(@n0 Application application, @e1 int i10) {
        h(application, new h.c().i(i10).e());
    }

    @Deprecated
    public static void f(@n0 Application application, @e1 int i10, @n0 f fVar) {
        h(application, new h.c().i(i10).h(fVar).e());
    }

    @Deprecated
    public static void g(@n0 Application application, @n0 f fVar) {
        h(application, new h.c().h(fVar).e());
    }

    public static void h(@n0 Application application, @n0 h hVar) {
        application.registerActivityLifecycleCallbacks(new d(hVar));
    }

    public static void i(@n0 Activity activity) {
        j(activity, new h.c().e());
    }

    public static void j(@n0 Activity activity, @n0 h hVar) {
        if (l()) {
            int iK = 0;
            if (hVar.d() == null) {
                iK = hVar.g() == 0 ? k(activity) : hVar.g();
            }
            if (hVar.f().a(activity, iK)) {
                if (hVar.d() != null) {
                    k6 k6Var = new k6(b0.b(hVar.d().intValue()), !com.google.android.material.resources.b.b(activity, R.attr.isLightTheme, true), 0.0d);
                    com.google.android.material.color.d dVarA = com.google.android.material.color.c.a();
                    if (dVarA == null || !dVarA.b(activity, l.a(k6Var))) {
                        return;
                    }
                } else {
                    q.a(activity, iK);
                }
                hVar.e().a(activity);
            }
        }
    }

    private static int k(@n0 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f53722a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @SuppressLint({"DefaultLocale"})
    @androidx.annotation.k(api = 31)
    public static boolean l() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (androidx.core.os.a.k()) {
            return true;
        }
        c cVar = f53725d.get(Build.MANUFACTURER.toLowerCase());
        if (cVar == null) {
            cVar = f53726e.get(Build.BRAND.toLowerCase());
        }
        return cVar != null && cVar.isSupported();
    }

    @n0
    public static Context m(@n0 Context context) {
        return n(context, 0);
    }

    @n0
    public static Context n(@n0 Context context, @e1 int i10) {
        if (!l()) {
            return context;
        }
        if (i10 == 0) {
            i10 = k(context);
        }
        return i10 == 0 ? context : new ContextThemeWrapper(context, i10);
    }
}
