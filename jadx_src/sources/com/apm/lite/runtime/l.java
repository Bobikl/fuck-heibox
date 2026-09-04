package com.apm.lite.runtime;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.apm.lite.CrashType;
import com.apm.lite.ICrashCallback;
import com.apm.lite.IOOMCallback;
import com.apm.lite.nativecrash.NativeImpl;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f40192a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f40193b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f40194c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f40195d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static c f40196e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f40197f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f40198g = false;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f40199b;

        /* JADX INFO: renamed from: com.apm.lite.runtime.l$a$a, reason: collision with other inner class name */
        public class RunnableC0315a implements Runnable {
            RunnableC0315a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean unused = l.f40197f = true;
                NativeImpl.registerSignalMainThread();
            }
        }

        a(boolean z10) {
            this.f40199b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40199b && !l.f40197f) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0315a());
            }
            l.v(this.f40199b);
        }
    }

    public static boolean A() {
        return f40198g;
    }

    public static void B() {
        f40198g = true;
    }

    private static boolean D() {
        return false;
    }

    public static c a() {
        return f40196e;
    }

    public static synchronized void b(Application application, Context context, boolean z10, boolean z11, boolean z12, boolean z13, long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (f40192a) {
            return;
        }
        f40192a = true;
        if (context == null || application == null) {
            throw new IllegalArgumentException("context or Application must be not null.");
        }
        if (com.apm.lite.e.x() && (h(application) || l(application) || D())) {
            Log.e("apminsight", "Inner npth checked.");
            return;
        }
        com.apm.lite.e.c(application, context);
        if (z10 || z11) {
            com.apm.lite.e.a aVarC = com.apm.lite.e.a.c();
            if (z11) {
                aVarC.g(new com.apm.lite.g.b(context));
            }
            if (z10) {
                aVarC.m(new com.apm.lite.e.d(context));
            }
            f40193b = true;
        }
        NativeImpl.loadLibrary();
        if (z12) {
            f40195d = NativeImpl.startMonitorNativeCrash(context);
        }
        if (z13 && Looper.myLooper() == Looper.getMainLooper()) {
            f40197f = true;
            NativeImpl.registerSignalMainThread();
        }
        t(z13);
        com.apm.lite.k.q.a("Npth.init takes " + (SystemClock.uptimeMillis() - jUptimeMillis) + " ms.");
    }

    public static synchronized void c(Context context, boolean z10, boolean z11, boolean z12, boolean z13, long j10) {
        Application applicationN;
        if (com.apm.lite.e.n() != null) {
            applicationN = com.apm.lite.e.n();
        } else if (context instanceof Application) {
            applicationN = (Application) context;
            if (applicationN.getBaseContext() == null) {
                throw new IllegalArgumentException("Application not attach.");
            }
        } else {
            try {
                applicationN = (Application) context.getApplicationContext();
                if (applicationN == null) {
                    throw new IllegalArgumentException("no Application.");
                }
                if (applicationN.getBaseContext() != null) {
                    context = applicationN.getBaseContext();
                }
            } catch (Throwable unused) {
                throw new IllegalArgumentException("no Application.");
            }
        }
        b(applicationN, context, z10, z11, z12, z13, j10);
    }

    public static void d(ICrashCallback iCrashCallback, CrashType crashType) {
        a().b(iCrashCallback, crashType);
    }

    public static void e(IOOMCallback iOOMCallback) {
        a().c(iOOMCallback);
    }

    public static void f(IOOMCallback iOOMCallback, CrashType crashType) {
        a().f(iOOMCallback);
    }

    public static void g(boolean z10) {
        com.apm.lite.e.e(z10);
    }

    private static boolean h(Context context) {
        try {
            return new File(com.apm.lite.k.o.E(context), "npth").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void i(ICrashCallback iCrashCallback, CrashType crashType) {
        a().e(iCrashCallback, crashType);
    }

    public static void j(boolean z10) {
        com.apm.lite.e.g(z10);
    }

    public static boolean k() {
        return f40193b;
    }

    private static boolean l(Context context) {
        try {
            return new File(context.getApplicationInfo().nativeLibraryDir, "libnpth.so").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void m(boolean z10) {
        com.apm.lite.e.i(z10);
    }

    public static boolean n() {
        return f40194c;
    }

    public static boolean o() {
        return f40195d;
    }

    public static boolean r() {
        return f40192a;
    }

    public static void s() {
        if (!f40192a || f40193b) {
            return;
        }
        Context contextM = com.apm.lite.e.m();
        com.apm.lite.e.a aVarC = com.apm.lite.e.a.c();
        aVarC.g(new com.apm.lite.g.b(contextM));
        aVarC.m(new com.apm.lite.e.d(contextM));
    }

    private static void t(boolean z10) {
        m.b().f(new a(z10), 0L);
    }

    public static void u() {
        if (f40192a) {
            com.apm.lite.b.d.a(com.apm.lite.e.m()).d();
            f40194c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(boolean z10) {
        Context contextM = com.apm.lite.e.m();
        com.apm.lite.runtime.a.e.d();
        NativeImpl.createCallbackThread();
        o6.a.a().b(contextM);
        com.apm.lite.j.h.a(contextM);
        if (z10) {
            com.apm.lite.b.d.a(contextM).d();
            f40194c = z10;
            NativeImpl.startThreadForAnrMonitor();
        }
        com.apm.lite.j.j.g();
        NativeImpl.initPThreadDump();
        o.d("afterNpthInitAsync", "noValue");
    }

    public static boolean w() {
        if (f40192a && !f40195d) {
            f40195d = NativeImpl.startMonitorNativeCrash(com.apm.lite.e.m());
        }
        return f40195d;
    }

    public static boolean x() {
        return com.apm.lite.e.a.n() || NativeImpl.duringNativeCrash();
    }

    public static boolean y() {
        return com.apm.lite.e.a.t() || NativeImpl.duringNativeCrash();
    }

    public static boolean z() {
        return com.apm.lite.e.a.n();
    }
}
