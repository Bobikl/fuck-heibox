package com.vivo.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PushClientThread.java */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f106613a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HandlerThread f106614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Handler f106615c;

    static {
        HandlerThread handlerThread = new HandlerThread("push_client_thread");
        f106614b = handlerThread;
        handlerThread.start();
        f106615c = new n(handlerThread.getLooper());
    }

    public static void a(l lVar) {
        if (lVar == null) {
            com.vivo.push.util.p.a("PushClientThread", "client thread error, task is null!");
            return;
        }
        int iA = lVar.a();
        Message message = new Message();
        message.what = iA;
        message.obj = lVar;
        f106615c.sendMessageDelayed(message, 0L);
    }

    public static void a(Runnable runnable) {
        Handler handler = f106615c;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 15000L);
    }

    public static void b(Runnable runnable) {
        f106613a.post(runnable);
    }

    public static void c(Runnable runnable) {
        Handler handler = f106615c;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
