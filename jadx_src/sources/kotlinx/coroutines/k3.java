package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: compiled from: ThreadPoolDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¨\u0006\u0007"}, d2 = {"", "name", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "d", "", "nThreads", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class k3 {
    @z0
    @dl.d
    public static final ExecutorCoroutineDispatcher b(final int i10, @dl.d final String str) {
        if (i10 >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return s1.d(Executors.newScheduledThreadPool(i10, new ThreadFactory() { // from class: kotlinx.coroutines.j3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return k3.c(i10, str, atomicInteger, runnable);
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i10 + " specified").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(int i10, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i10 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    @z0
    @dl.d
    public static final ExecutorCoroutineDispatcher d(@dl.d String str) {
        return b(1, str);
    }
}
