package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.f0;
import androidx.annotation.j1;
import androidx.annotation.n0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: GlideExecutor.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements ExecutorService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f41093c = "source";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f41094d = "disk-cache";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f41095e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f41096f = "GlideExecutor";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f41097g = "source-unlimited";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f41098h = "animation";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f41099i = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f41100j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile int f41101k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f41102b;

    /* JADX INFO: compiled from: GlideExecutor.java */
    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final long f41103h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f41104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f41105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f41106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @n0
        private ThreadFactory f41107d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @n0
        private e f41108e = e.f41123d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f41109f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f41110g;

        b(boolean z10) {
            this.f41104a = z10;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f41109f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f41109f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f41105b, this.f41106c, this.f41110g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f41107d, this.f41109f, this.f41108e, this.f41104a));
            if (this.f41110g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f41109f = str;
            return this;
        }

        public b c(@f0(from = 1) int i10) {
            this.f41105b = i10;
            this.f41106c = i10;
            return this;
        }

        @Deprecated
        public b d(@n0 ThreadFactory threadFactory) {
            this.f41107d = threadFactory;
            return this;
        }

        public b e(long j10) {
            this.f41110g = j10;
            return this;
        }

        public b f(@n0 e eVar) {
            this.f41108e = eVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: GlideExecutor.java */
    public static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f41111b = 9;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GlideExecutor.java */
        public class C0329a extends Thread {
            C0329a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@n0 Runnable runnable) {
            return new C0329a(runnable);
        }
    }

    /* JADX INFO: compiled from: GlideExecutor.java */
    public static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ThreadFactory f41113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f41114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final e f41115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f41116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicInteger f41117f = new AtomicInteger();

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GlideExecutor.java */
        public class RunnableC0330a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f41118b;

            RunnableC0330a(Runnable runnable) {
                this.f41118b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f41116e) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f41118b.run();
                } catch (Throwable th2) {
                    d.this.f41115d.a(th2);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f41113b = threadFactory;
            this.f41114c = str;
            this.f41115d = eVar;
            this.f41116e = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@n0 Runnable runnable) {
            Thread threadNewThread = this.f41113b.newThread(new RunnableC0330a(runnable));
            threadNewThread.setName("glide-" + this.f41114c + "-thread-" + this.f41117f.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: compiled from: GlideExecutor.java */
    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f41120a = new C0331a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f41121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f41122c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f41123d;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GlideExecutor.java */
        public class C0331a implements e {
            C0331a() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.e
            public void a(Throwable th2) {
            }
        }

        /* JADX INFO: compiled from: GlideExecutor.java */
        public class b implements e {
            b() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable(a.f41096f, 6)) {
                    return;
                }
                Log.e(a.f41096f, "Request threw uncaught throwable", th2);
            }
        }

        /* JADX INFO: compiled from: GlideExecutor.java */
        public class c implements e {
            c() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f41121b = bVar;
            f41122c = new c();
            f41123d = bVar;
        }

        void a(Throwable th2);
    }

    @j1
    a(ExecutorService executorService) {
        this.f41102b = executorService;
    }

    static int a() {
        return b() >= 4 ? 2 : 1;
    }

    public static int b() {
        if (f41101k == 0) {
            f41101k = Math.min(4, com.bumptech.glide.load.engine.executor.b.a());
        }
        return f41101k;
    }

    public static b c() {
        return new b(true).c(a()).b(f41098h);
    }

    public static a d() {
        return c().a();
    }

    @Deprecated
    public static a e(int i10, e eVar) {
        return c().c(i10).f(eVar).a();
    }

    public static b f() {
        return new b(true).c(1).b(f41094d);
    }

    public static a g() {
        return f().a();
    }

    @Deprecated
    public static a h(int i10, String str, e eVar) {
        return f().c(i10).b(str).f(eVar).a();
    }

    @Deprecated
    public static a i(e eVar) {
        return f().f(eVar).a();
    }

    public static b j() {
        return new b(false).c(b()).b("source");
    }

    public static a k() {
        return j().a();
    }

    @Deprecated
    public static a l(int i10, String str, e eVar) {
        return j().c(i10).b(str).f(eVar).a();
    }

    @Deprecated
    public static a m(e eVar) {
        return j().f(eVar).a();
    }

    public static a n() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f41099i, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), f41097g, e.f41123d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, @n0 TimeUnit timeUnit) throws InterruptedException {
        return this.f41102b.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@n0 Runnable runnable) {
        this.f41102b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @n0
    public <T> List<Future<T>> invokeAll(@n0 Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f41102b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @n0
    public <T> List<Future<T>> invokeAll(@n0 Collection<? extends Callable<T>> collection, long j10, @n0 TimeUnit timeUnit) throws InterruptedException {
        return this.f41102b.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @n0
    public <T> T invokeAny(@n0 Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f41102b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@n0 Collection<? extends Callable<T>> collection, long j10, @n0 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f41102b.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f41102b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f41102b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f41102b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @n0
    public List<Runnable> shutdownNow() {
        return this.f41102b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @n0
    public Future<?> submit(@n0 Runnable runnable) {
        return this.f41102b.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @n0
    public <T> Future<T> submit(@n0 Runnable runnable, T t10) {
        return this.f41102b.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@n0 Callable<T> callable) {
        return this.f41102b.submit(callable);
    }

    public String toString() {
        return this.f41102b.toString();
    }
}
