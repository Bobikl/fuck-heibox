package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ConcurrencyHelpers.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f22939a = 15;

    /* JADX INFO: compiled from: ConcurrencyHelpers.java */
    @w0(28)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private c() {
    }

    @n0
    @Deprecated
    static Executor b(@n0 Handler handler) {
        Objects.requireNonNull(handler);
        return new b(handler);
    }

    static ThreadPoolExecutor c(@n0 final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return c.d(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread d(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    static Handler e() {
        return Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
