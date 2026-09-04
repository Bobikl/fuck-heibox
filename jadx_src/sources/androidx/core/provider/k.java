package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.core.util.o;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: RequestExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: compiled from: RequestExecutor.java */
    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f21061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21062c;

        /* JADX INFO: renamed from: androidx.core.provider.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RequestExecutor.java */
        public static class C0138a extends Thread {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f21063b;

            C0138a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f21063b = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f21063b);
                super.run();
            }
        }

        a(@n0 String str, int i10) {
            this.f21061b = str;
            this.f21062c = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0138a(runnable, this.f21061b, this.f21062c);
        }
    }

    /* JADX INFO: compiled from: RequestExecutor.java */
    public static class b implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f21064b;

        b(@n0 Handler handler) {
            this.f21064b = (Handler) o.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@n0 Runnable runnable) {
            if (this.f21064b.post((Runnable) o.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f21064b + " is shutting down");
        }
    }

    /* JADX INFO: compiled from: RequestExecutor.java */
    public static class c<T> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private Callable<T> f21065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        private androidx.core.util.d<T> f21066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @n0
        private Handler f21067d;

        /* JADX INFO: compiled from: RequestExecutor.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.core.util.d f21068b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f21069c;

            a(androidx.core.util.d dVar, Object obj) {
                this.f21068b = dVar;
                this.f21069c = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f21068b.accept(this.f21069c);
            }
        }

        c(@n0 Handler handler, @n0 Callable<T> callable, @n0 androidx.core.util.d<T> dVar) {
            this.f21065b = callable;
            this.f21066c = dVar;
            this.f21067d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f21065b.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f21067d.post(new a(this.f21066c, tCall));
        }
    }

    private k() {
    }

    static ThreadPoolExecutor a(@n0 String str, int i10, @f0(from = 0) int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(@n0 Handler handler) {
        return new b(handler);
    }

    static <T> void c(@n0 Executor executor, @n0 Callable<T> callable, @n0 androidx.core.util.d<T> dVar) {
        executor.execute(new c(androidx.core.provider.b.a(), callable, dVar));
    }

    static <T> T d(@n0 ExecutorService executorService, @n0 Callable<T> callable, @f0(from = 0) int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException(l5.a.f130839h0);
        }
    }
}
