package anet.channel.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: anet.channel.thread.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Taobao */
    public class C0244a<V> extends FutureTask<V> implements Comparable<C0244a<V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f29997b;

        public C0244a(Runnable runnable, V v10) {
            super(runnable, v10);
            this.f29997b = runnable;
        }

        public C0244a(Callable<V> callable) {
            super(callable);
            this.f29997b = callable;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0244a<V> c0244a) {
            if (this == c0244a) {
                return 0;
            }
            if (c0244a == null) {
                return -1;
            }
            Object obj = this.f29997b;
            if (obj != null && c0244a.f29997b != null && obj.getClass().equals(c0244a.f29997b.getClass())) {
                Object obj2 = this.f29997b;
                if (obj2 instanceof Comparable) {
                    return ((Comparable) obj2).compareTo(c0244a.f29997b);
                }
            }
            return 0;
        }
    }

    public a(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t10) {
        return new C0244a(runnable, t10);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C0244a(callable);
    }
}
