package com.tencent.thumbplayer.tcmedia.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile HandlerThread f103170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f103171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f103172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile ExecutorService f103173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile ExecutorService f103174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile ScheduledExecutorService f103175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile o f103176g;

    private o() {
    }

    public static o a() {
        if (f103176g == null) {
            synchronized (o.class) {
                if (f103176g == null) {
                    f103176g = new o();
                }
            }
        }
        return f103176g;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027 A[Catch: all -> 0x003a, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0010, B:11:0x001f, B:13:0x0027, B:14:0x0038, B:8:0x0014, B:10:0x001c), top: B:19:0x0003 }] */
    private static void f() {
        HandlerThread handlerThread;
        synchronized (o.class) {
            if (f103170a == null) {
                handlerThread = new HandlerThread("TP-ShareThreadPool");
                f103170a = handlerThread;
            } else {
                if (!f103170a.isAlive()) {
                    handlerThread = f103170a;
                }
                if (f103170a.getLooper() == null) {
                    f103170a.quit();
                    HandlerThread handlerThread2 = new HandlerThread("TP-ShareThreadPool");
                    f103170a = handlerThread2;
                    handlerThread2.start();
                }
            }
            handlerThread.start();
            if (f103170a.getLooper() == null) {
                f103170a.quit();
                HandlerThread handlerThread3 = new HandlerThread("TP-ShareThreadPool");
                f103170a = handlerThread3;
                handlerThread3.start();
            }
        }
    }

    public HandlerThread a(String str) {
        return a(str, 0);
    }

    public HandlerThread a(String str, int i10) {
        if (i10 >= 19 || i10 <= -19) {
            i10 = 0;
        }
        if (TextUtils.isEmpty(str)) {
            str = "TP-HandlerThread";
        }
        HandlerThread handlerThread = new HandlerThread(str, i10);
        handlerThread.start();
        return handlerThread;
    }

    public void a(HandlerThread handlerThread, Handler handler) {
        if (handlerThread == null) {
            return;
        }
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (!handlerThread.equals(f103170a)) {
            handlerThread.quit();
            return;
        }
        synchronized (o.class) {
            f103172c--;
            TPLogUtil.i("TPPlayer[TPThreadPool]", "handlerThread recycle mShareThreadCount:" + f103172c);
        }
    }

    public HandlerThread b() {
        HandlerThread handlerThread;
        f();
        synchronized (o.class) {
            f103172c++;
            TPLogUtil.i("TPPlayer[TPThreadPool]", "handlerThread obtainShareThread mShareThreadCount:" + f103172c);
            handlerThread = f103170a;
        }
        return handlerThread;
    }

    public ExecutorService c() {
        if (f103173d == null) {
            synchronized (o.class) {
                if (f103173d == null) {
                    f103173d = Executors.newSingleThreadExecutor();
                }
            }
        }
        return f103173d;
    }

    public ExecutorService d() {
        if (f103174e == null) {
            synchronized (o.class) {
                if (f103174e == null) {
                    f103174e = p.a(4, 20);
                }
            }
        }
        return f103174e;
    }

    public ScheduledExecutorService e() {
        if (f103175f == null) {
            synchronized (o.class) {
                if (f103175f == null) {
                    f103175f = Executors.newScheduledThreadPool(4);
                }
            }
        }
        return f103175f;
    }
}
