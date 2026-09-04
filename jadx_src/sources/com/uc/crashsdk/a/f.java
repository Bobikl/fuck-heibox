package com.uc.crashsdk.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f104173a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile HandlerThread f104174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile HandlerThread f104175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile HandlerThread f104176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Handler f104177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Handler f104178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Handler f104179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Handler f104180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final HashMap<Object, Object[]> f104181i = new HashMap<>();

    public static Handler a(int i10) {
        if (i10 == 0) {
            if (f104174b == null) {
                a();
            }
            return f104177e;
        }
        if (i10 == 1) {
            if (f104175c == null) {
                b();
            }
            return f104178f;
        }
        if (i10 == 2) {
            if (f104179g == null) {
                f104179g = new Handler(Looper.getMainLooper());
            }
            return f104179g;
        }
        if (i10 == 3) {
            if (f104180h == null) {
                c();
            }
            return f104180h;
        }
        throw new RuntimeException("unknown thread type: " + i10);
    }

    private static synchronized void a() {
        if (f104174b == null) {
            HandlerThread handlerThread = new HandlerThread("CrashSDKBkgdHandler", 10);
            f104174b = handlerThread;
            handlerThread.start();
            f104177e = new Handler(f104174b.getLooper());
        }
    }

    public static void a(int i10, Object[] objArr) {
        if (i10 != 10) {
            if (!f104173a) {
                throw new AssertionError();
            }
        } else {
            if (!f104173a && objArr == null) {
                throw new AssertionError();
            }
            Runnable runnable = (Runnable) objArr[0];
            HashMap<Object, Object[]> map = f104181i;
            synchronized (map) {
                if (map.get(runnable) != null) {
                    map.remove(runnable);
                }
            }
            runnable.run();
        }
    }

    public static void a(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return;
        }
        HashMap<Object, Object[]> map = f104181i;
        synchronized (map) {
            objArr = map.get(runnable);
        }
        if (objArr == null) {
            return;
        }
        int iIntValue = ((Integer) objArr[1]).intValue();
        Handler handler = null;
        if (iIntValue == 0) {
            handler = f104177e;
        } else if (iIntValue == 1) {
            handler = f104178f;
        } else if (iIntValue == 2) {
            handler = f104179g;
        }
        if (handler != null) {
            handler.removeCallbacks((Runnable) objArr[0]);
        }
        synchronized (map) {
            if (map.get(runnable) != null) {
                map.remove(runnable);
            }
        }
    }

    public static boolean a(int i10, Runnable runnable) {
        return a(i10, runnable, 0L);
    }

    public static boolean a(int i10, Runnable runnable, long j10) {
        Handler handlerA;
        if (runnable == null || (handlerA = a(i10)) == null) {
            return false;
        }
        e eVar = new e(10, new Object[]{runnable});
        HashMap<Object, Object[]> map = f104181i;
        synchronized (map) {
            map.put(runnable, new Object[]{eVar, Integer.valueOf(i10)});
        }
        return handlerA.postDelayed(eVar, j10);
    }

    private static synchronized void b() {
        if (f104175c == null) {
            HandlerThread handlerThread = new HandlerThread("CrashSDKNormalHandler", 0);
            f104175c = handlerThread;
            handlerThread.start();
            f104178f = new Handler(f104175c.getLooper());
        }
    }

    public static boolean b(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return false;
        }
        HashMap<Object, Object[]> map = f104181i;
        synchronized (map) {
            objArr = map.get(runnable);
        }
        return objArr != null;
    }

    private static synchronized void c() {
        if (f104176d == null) {
            HandlerThread handlerThread = new HandlerThread("CrashSDKAnrHandler", 0);
            f104176d = handlerThread;
            handlerThread.start();
            f104180h = new Handler(f104176d.getLooper());
        }
    }
}
