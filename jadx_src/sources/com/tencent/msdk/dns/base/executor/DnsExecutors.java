package com.tencent.msdk.dns.base.executor;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsExecutors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f100944a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.b f100945b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Executor f100946c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ExecutorSupplier f100947d = null;

    public interface ExecutorSupplier {
        Executor get();
    }

    public static class a implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HandlerThread f100948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f100949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<Runnable, Runnable> f100950c = new ConcurrentHashMap();

        public a() {
            HandlerThread handlerThread = new HandlerThread("dns-main");
            this.f100948a = handlerThread;
            handlerThread.start();
            this.f100949b = new Handler(handlerThread.getLooper());
        }

        public void a(Runnable runnable) {
            Runnable runnable2;
            if (runnable == null || (runnable2 = this.f100950c.get(runnable)) == null) {
                return;
            }
            this.f100949b.removeCallbacks(runnable2);
        }

        public void a(Runnable runnable, long j10) {
            c.a aVar = new c.a(runnable);
            if (0 >= j10) {
                execute(aVar);
            } else {
                this.f100950c.put(runnable, aVar);
                this.f100949b.postDelayed(aVar, j10);
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (runnable != null) {
                this.f100949b.post(new c.a(runnable));
            }
        }
    }

    public static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f100951a;

        public b() {
            ExecutorSupplier executorSupplier = DnsExecutors.f100947d;
            Executor executor = executorSupplier != null ? executorSupplier.get() : null;
            this.f100951a = executor == null ? AsyncTask.THREAD_POOL_EXECUTOR : executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (runnable != null) {
                this.f100951a.execute(new c.a(runnable));
            }
        }
    }
}
