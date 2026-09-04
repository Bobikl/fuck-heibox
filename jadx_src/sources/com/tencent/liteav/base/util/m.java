package com.tencent.liteav.base.util;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ThreadPoolExecutor f99717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final CustomHandler f99718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<a> f99719c;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f99720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f99721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Runnable f99722c = r.a(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f99724e;

        public a(Runnable runnable, long j10) {
            this.f99720a = runnable;
            this.f99721b = q.a(this, runnable);
            this.f99724e = j10;
        }

        public final void a() {
            m.this.f99718b.postDelayed(this.f99722c, this.f99724e);
        }
    }

    public m() {
        this(60);
    }

    public m(int i10) {
        this(i10, "SequenceTaskRunner_");
    }

    public m(int i10, String str) {
        this.f99717a = new ThreadPoolExecutor(0, 1, i10, TimeUnit.SECONDS, new LinkedBlockingQueue(), n.a(str));
        this.f99718b = new CustomHandler(Looper.getMainLooper());
        this.f99719c = new ArrayList();
    }

    @Override // com.tencent.liteav.base.util.w
    public final void a(Runnable runnable) {
        this.f99717a.execute(runnable);
    }

    public final void a(Runnable runnable, long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f99717a.execute(p.a(runnable, countDownLatch));
        try {
            countDownLatch.await(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f99717a.execute(o.a(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Runnable runnable, long j10) {
        a aVar = new a(runnable, j10);
        synchronized (this) {
            this.f99719c.add(aVar);
        }
        aVar.a();
    }

    public final void c(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.f99717a.remove(runnable);
        synchronized (this) {
            Iterator<a> it = this.f99719c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null && runnable == next.f99720a) {
                    m.this.f99718b.removeCallbacks(next.f99722c);
                    m.this.f99717a.remove(next.f99721b);
                    it.remove();
                }
            }
        }
    }
}
