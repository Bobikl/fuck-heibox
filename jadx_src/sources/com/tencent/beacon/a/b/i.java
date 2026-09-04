package com.tencent.beacon.a.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.annotation.n0;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: BeaconAsyncTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class i extends com.tencent.beacon.a.b.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f98762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f98763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicInteger f98764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f98765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray<a> f98766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseArray<Handler> f98767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j f98768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f98769j;

    /* JADX INFO: compiled from: BeaconAsyncTask.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f98770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f98771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f98772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TimeUnit f98773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Future<?> f98774e;

        a(Future<?> future, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            this.f98774e = future;
            this.f98770a = runnable;
            this.f98771b = j10;
            this.f98772c = j11;
            this.f98773d = timeUnit;
        }

        boolean a() {
            return this.f98774e.isCancelled();
        }

        boolean a(boolean z10) {
            return this.f98774e.cancel(z10);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f98762c = iAvailableProcessors;
        f98763d = Math.max(2, Math.min(iAvailableProcessors - 1, 3));
        f98764e = new AtomicInteger(0);
    }

    i() {
        this(null);
    }

    i(ScheduledExecutorService scheduledExecutorService) {
        this.f98769j = false;
        j jVar = new j();
        this.f98768i = jVar;
        this.f98765f = scheduledExecutorService == null ? Executors.newScheduledThreadPool(f98763d, jVar) : scheduledExecutorService;
        this.f98766g = new SparseArray<>();
        this.f98767h = new SparseArray<>();
    }

    private Runnable b(Runnable runnable) {
        return new h(this, runnable);
    }

    private boolean f() {
        if (!this.f98769j) {
            return false;
        }
        com.tencent.beacon.base.util.c.b("[task] was closed , should all stopped!", new Object[0]);
        return true;
    }

    @Override // com.tencent.beacon.a.b.a
    public synchronized Handler a(int i10) {
        Handler handler;
        handler = this.f98767h.get(i10);
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread(this.f98768i.a());
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        }
        this.f98767h.put(i10, handler);
        return handler;
    }

    @Override // com.tencent.beacon.a.b.a
    public synchronized void a(int i10, long j10, long j11, @n0 Runnable runnable) {
        if (f()) {
            return;
        }
        a aVar = this.f98766g.get(i10);
        if (aVar == null || aVar.a()) {
            Runnable runnableB = b(runnable);
            if (j10 <= 0) {
                j10 = 0;
            }
            if (j11 < 100) {
                j11 = 100;
            }
            ScheduledExecutorService scheduledExecutorService = this.f98765f;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            a aVar2 = new a(scheduledExecutorService.scheduleAtFixedRate(runnableB, j10, j11, timeUnit), runnableB, j10, j11, timeUnit);
            com.tencent.beacon.base.util.c.a("[task] add a new polling task! taskId: %d , periodTime: %d", Integer.valueOf(i10), Long.valueOf(j11));
            this.f98766g.put(i10, aVar2);
        }
    }

    @Override // com.tencent.beacon.a.b.a
    public void a(int i10, boolean z10) {
        a aVar = this.f98766g.get(i10);
        if (aVar == null || aVar.a()) {
            return;
        }
        com.tencent.beacon.base.util.c.a("[task] cancel a old pollingTaskWrapper!", new Object[0]);
        aVar.a(z10);
    }

    @Override // com.tencent.beacon.a.b.a
    public synchronized void a(long j10, @n0 Runnable runnable) {
        if (f()) {
            return;
        }
        Runnable runnableB = b(runnable);
        if (j10 <= 0) {
            j10 = 0;
        }
        this.f98765f.schedule(runnableB, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.tencent.beacon.a.b.a
    public synchronized void a(@n0 Runnable runnable) {
        if (f()) {
            return;
        }
        this.f98765f.execute(b(runnable));
    }

    @Override // com.tencent.beacon.a.b.a
    public synchronized void a(boolean z10) {
        if (f()) {
            return;
        }
        for (int i10 = 0; i10 < this.f98766g.size(); i10++) {
            a(this.f98766g.keyAt(i10), z10);
        }
        com.tencent.beacon.base.util.c.a("[task] All schedule tasks stop", new Object[0]);
    }

    @Override // com.tencent.beacon.a.b.a
    public synchronized void b(int i10) {
        if (c()) {
            a aVar = this.f98766g.get(i10);
            if (aVar != null) {
                if (!aVar.a()) {
                } else {
                    aVar.f98774e = this.f98765f.scheduleAtFixedRate(aVar.f98770a, aVar.f98771b, aVar.f98772c, aVar.f98773d);
                }
            }
        }
    }

    @Override // com.tencent.beacon.a.b.a
    public synchronized void d() {
        com.tencent.beacon.base.util.c.a("[task] Resumed all schedule task", new Object[0]);
        if (f()) {
            return;
        }
        for (int i10 = 0; i10 < this.f98766g.size(); i10++) {
            b(this.f98766g.keyAt(i10));
        }
        com.tencent.beacon.base.util.c.a("[task] Resumed all schedule task", new Object[0]);
    }
}
