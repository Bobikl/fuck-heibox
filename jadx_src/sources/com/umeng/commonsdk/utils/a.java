package com.umeng.commonsdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: compiled from: CountDownTimer.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f105497e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f105498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f105499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f105500c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HandlerThread f105502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f105503g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f105501d = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler.Callback f105504h = new Handler.Callback() { // from class: com.umeng.commonsdk.utils.a.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            synchronized (a.this) {
                if (a.this.f105501d) {
                    return true;
                }
                long jElapsedRealtime = a.this.f105500c - SystemClock.elapsedRealtime();
                if (jElapsedRealtime <= 0) {
                    a.this.c();
                    if (a.this.f105502f != null) {
                        a.this.f105502f.quit();
                    }
                } else if (jElapsedRealtime < a.this.f105499b) {
                    a.this.f105503g.sendMessageDelayed(a.this.f105503g.obtainMessage(1), jElapsedRealtime);
                } else {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    a.this.a(jElapsedRealtime);
                    long jElapsedRealtime3 = (jElapsedRealtime2 + a.this.f105499b) - SystemClock.elapsedRealtime();
                    while (jElapsedRealtime3 < 0) {
                        jElapsedRealtime3 += a.this.f105499b;
                    }
                    a.this.f105503g.sendMessageDelayed(a.this.f105503g.obtainMessage(1), jElapsedRealtime3);
                }
                return false;
            }
        }
    };

    public a(long j10, long j11) {
        this.f105498a = j10;
        this.f105499b = j11;
        if (d()) {
            this.f105503g = new Handler(this.f105504h);
            return;
        }
        HandlerThread handlerThread = new HandlerThread("CountDownTimerThread");
        this.f105502f = handlerThread;
        handlerThread.start();
        this.f105503g = new Handler(this.f105502f.getLooper(), this.f105504h);
    }

    private boolean d() {
        return Looper.getMainLooper().getThread().equals(Thread.currentThread());
    }

    public final synchronized void a() {
        this.f105501d = true;
        this.f105503g.removeMessages(1);
    }

    public abstract void a(long j10);

    public final synchronized a b() {
        this.f105501d = false;
        if (this.f105498a <= 0) {
            c();
            return this;
        }
        this.f105500c = SystemClock.elapsedRealtime() + this.f105498a;
        Handler handler = this.f105503g;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    public abstract void c();
}
