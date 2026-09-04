package com.tencent.thumbplayer.tcmedia.g.h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f102794a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f102795b = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HandlerThread f102796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Handler f102797d;

    static {
        HandlerThread handlerThread = new HandlerThread("tmediacodec-sub");
        f102796c = handlerThread;
        handlerThread.start();
        f102797d = new Handler(handlerThread.getLooper());
    }

    public static void a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            f102795b.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static void b(Runnable runnable) {
        f102797d.post(runnable);
    }
}
