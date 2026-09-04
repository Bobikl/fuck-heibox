package com.alipay.face.photinus;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: PhotinusHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static h f38909b = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f38910a;

    private h() {
        HandlerThread handlerThread = new HandlerThread(h.class.getSimpleName());
        handlerThread.start();
        this.f38910a = new Handler(handlerThread.getLooper());
    }

    public static h a() {
        return f38909b;
    }

    public void b(Runnable runnable) {
        this.f38910a.post(runnable);
    }
}
