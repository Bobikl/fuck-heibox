package cn.fly.verify;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class ep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36338a = "M-" + ei.a("0022fkhk");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36339b = "M-" + ei.a("003[glfehk");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadPoolExecutor f36340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadPoolExecutor f36341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ExecutorService f36342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ExecutorService f36343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ExecutorService f36344g;

    public static class a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                bq.a().d(500L, runnable);
            } catch (Throwable unused) {
            }
        }
    }

    public static class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AtomicInteger f36345a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ThreadGroup f36346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f36347c = new AtomicInteger(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f36348d;

        b(int i10) {
            String str;
            SecurityManager securityManager = System.getSecurityManager();
            this.f36346b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            if (TextUtils.isEmpty("M-")) {
                str = ei.a("005jOdkdk1g6hk") + f36345a.getAndIncrement() + ei.a("008Khk-ih<djMfdCdchk");
            } else {
                str = ep.f36339b + i10 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + f36345a.getAndIncrement() + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            }
            this.f36348d = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f36346b, runnable, this.f36348d + this.f36347c.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    static {
        int iMax = Math.max(2, 5);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f36340c = new ThreadPoolExecutor(2, iMax, 60L, timeUnit, new SynchronousQueue(), new b(0), new a());
        f36341d = new ThreadPoolExecutor(1, 1, 120L, timeUnit, new LinkedBlockingQueue(), new b(1));
        f36342e = Executors.newCachedThreadPool(new b(2));
        f36343f = Executors.newCachedThreadPool(new b(3));
        f36344g = Executors.newCachedThreadPool(new b(4));
    }
}
