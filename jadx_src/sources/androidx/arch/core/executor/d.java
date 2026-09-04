package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: DefaultTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3000a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f3001b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private volatile Handler f3002c;

    /* JADX INFO: compiled from: DefaultTaskExecutor.java */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f3003d = "arch_disk_io_";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f3004b = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(f3003d + this.f3004b.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: compiled from: DefaultTaskExecutor.java */
    @w0(28)
    public static class b {
        private b() {
        }

        @n0
        public static Handler a(@n0 Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @n0
    private static Handler e(@n0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // androidx.arch.core.executor.f
    public void a(@n0 Runnable runnable) {
        this.f3001b.execute(runnable);
    }

    @Override // androidx.arch.core.executor.f
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // androidx.arch.core.executor.f
    public void d(@n0 Runnable runnable) {
        if (this.f3002c == null) {
            synchronized (this.f3000a) {
                if (this.f3002c == null) {
                    this.f3002c = e(Looper.getMainLooper());
                }
            }
        }
        this.f3002c.post(runnable);
    }
}
