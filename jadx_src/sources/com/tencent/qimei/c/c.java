package com.tencent.qimei.c;

import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.n0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: BeaconAsyncTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f101212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f101213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f101214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f101215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray<Object> f101216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray<Handler> f101217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f101218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f101219i;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f101212b = iAvailableProcessors;
        f101213c = Math.max(2, Math.min(iAvailableProcessors - 1, 3));
        f101214d = new AtomicInteger(0);
    }

    public c() {
        this(null);
    }

    public c(ScheduledExecutorService scheduledExecutorService) {
        this.f101218h = false;
        d dVar = new d();
        this.f101219i = dVar;
        this.f101215e = scheduledExecutorService == null ? Executors.newScheduledThreadPool(f101213c, dVar) : scheduledExecutorService;
        this.f101216f = new SparseArray<>();
        this.f101217g = new SparseArray<>();
    }

    @Override // com.tencent.qimei.c.a
    public synchronized void a(long j10, @n0 Runnable runnable) {
        if (b()) {
            return;
        }
        Runnable runnableB = b(runnable);
        if (j10 <= 0) {
            j10 = 0;
        }
        this.f101215e.schedule(runnableB, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.tencent.qimei.c.a
    public synchronized void a(@n0 Runnable runnable) {
        if (b()) {
            return;
        }
        try {
            this.f101215e.execute(b(runnable));
        } catch (Exception unused) {
        }
    }

    public final Runnable b(Runnable runnable) {
        return new b(this, runnable);
    }

    public final boolean b() {
        if (!this.f101218h) {
            return false;
        }
        com.tencent.qimei.n.a.b("[task] was closed , should all stopped!", new Object[0]);
        return true;
    }
}
