package com.umeng.message.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f105693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f105694b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f105696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f105697e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f105695c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f105698f = new Handler(Looper.getMainLooper()) { // from class: com.umeng.message.proguard.ah.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            synchronized (ah.this) {
                if (message.what == 1) {
                    ah ahVar = ah.this;
                    if (ahVar.f105695c) {
                        return;
                    }
                    long jElapsedRealtime = ahVar.f105694b - SystemClock.elapsedRealtime();
                    if (jElapsedRealtime <= 0) {
                        ah.this.e();
                    } else {
                        ah ahVar2 = ah.this;
                        if (jElapsedRealtime < ahVar2.f105693a) {
                            ahVar2.a(jElapsedRealtime);
                            sendMessageDelayed(obtainMessage(1), jElapsedRealtime);
                        } else {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            ah.this.a(jElapsedRealtime);
                            long jElapsedRealtime3 = (jElapsedRealtime2 + ah.this.f105693a) - SystemClock.elapsedRealtime();
                            while (jElapsedRealtime3 < 0) {
                                jElapsedRealtime3 += ah.this.f105693a;
                            }
                            sendMessageDelayed(obtainMessage(1), jElapsedRealtime3);
                        }
                    }
                }
            }
        }
    };

    public ah(long j10, long j11) {
        this.f105696d = j10;
        this.f105693a = j11;
    }

    public final synchronized void a() {
        this.f105695c = true;
        this.f105698f.removeMessages(1);
    }

    public abstract void a(long j10);

    public final synchronized ah b() {
        this.f105695c = false;
        if (this.f105696d <= 0) {
            e();
            return this;
        }
        this.f105694b = SystemClock.elapsedRealtime() + this.f105696d;
        Handler handler = this.f105698f;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    public final synchronized ah c() {
        this.f105695c = false;
        long jElapsedRealtime = this.f105694b - SystemClock.elapsedRealtime();
        this.f105697e = jElapsedRealtime;
        if (jElapsedRealtime <= 0) {
            return this;
        }
        this.f105698f.removeMessages(1);
        Handler handler = this.f105698f;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(2));
        return this;
    }

    public final synchronized ah d() {
        this.f105695c = false;
        if (this.f105697e <= 0) {
            return this;
        }
        this.f105698f.removeMessages(2);
        this.f105694b = this.f105697e + SystemClock.elapsedRealtime();
        Handler handler = this.f105698f;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(1));
        return this;
    }

    public abstract void e();
}
