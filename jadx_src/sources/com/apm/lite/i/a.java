package com.apm.lite.i;

import android.os.Handler;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f39968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f39969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f39970d;

    a(Handler handler, long j10, long j11) {
        this.f39968b = handler;
        this.f39969c = j10;
        this.f39970d = j11;
    }

    void a() {
        if (c() > 0) {
            this.f39968b.postDelayed(this, c());
        } else {
            this.f39968b.post(this);
        }
    }

    void b(long j10) {
        if (j10 > 0) {
            this.f39968b.postDelayed(this, j10);
        } else {
            this.f39968b.post(this);
        }
    }

    long c() {
        return this.f39969c;
    }

    long d() {
        return this.f39970d;
    }
}
