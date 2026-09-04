package com.tencent.qmsp.sdk.app;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.qmsp.sdk.f.h;
import java.util.ArrayList;
import java.util.List;
import org.apache.tools.tar.c;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f101684d = {com.google.common.base.a.f56671x, 96, -116, 77, 47, c.H, 121};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f101685e = {com.google.common.base.a.f56671x, 96, -116, 100, 33, 44, 121, -15, 42, 113, -73};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static b f101686f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<HandlerThread> f101687a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f101688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f101689c;

    private b() {
        this.f101688b = null;
        this.f101689c = null;
        this.f101688b = a(h.a(f101684d));
        this.f101689c = a(h.a(f101685e));
    }

    private Handler a(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f101687a.add(handlerThread);
        return handler;
    }

    public static b e() {
        if (f101686f == null) {
            synchronized (b.class) {
                if (f101686f == null) {
                    f101686f = new b();
                }
            }
        }
        return f101686f;
    }

    public void a(Runnable runnable) {
        this.f101688b.post(runnable);
    }

    public boolean a() {
        for (HandlerThread handlerThread : this.f101687a) {
            if (handlerThread.getName().equalsIgnoreCase(h.a(f101684d))) {
                return handlerThread.isAlive();
            }
        }
        return false;
    }

    public Looper b() {
        return this.f101689c.getLooper();
    }

    public Looper c() {
        return this.f101688b.getLooper();
    }

    public void d() {
        Handler handler = this.f101688b;
        if (handler != null) {
            handler.getLooper().quit();
            this.f101688b = null;
        }
        Handler handler2 = this.f101689c;
        if (handler2 != null) {
            handler2.getLooper().quit();
            this.f101689c = null;
        }
        if (f101686f != null) {
            f101686f = null;
        }
    }
}
