package com.google.common.util.concurrent;

import com.google.common.collect.Lists;
import com.google.common.collect.a2;
import com.meituan.robust.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: MoreExecutors.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b(emulated = true)
public final class y0 {

    /* JADX INFO: compiled from: MoreExecutors.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BlockingQueue f59571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0 f59572c;

        a(BlockingQueue blockingQueue, p0 p0Var) {
            this.f59571b = blockingQueue;
            this.f59572c = p0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59571b.add(this.f59572c);
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    public class b implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f59573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.c0 f59574c;

        b(Executor executor, com.google.common.base.c0 c0Var) {
            this.f59573b = executor;
            this.f59574c = c0Var;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f59573b.execute(s.k(runnable, this.f59574c));
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    public class c extends x1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.c0 f59575c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ExecutorService executorService, com.google.common.base.c0 c0Var) {
            super(executorService);
            this.f59575c = c0Var;
        }

        @Override // com.google.common.util.concurrent.x1
        protected Runnable c(Runnable runnable) {
            return s.k(runnable, this.f59575c);
        }

        @Override // com.google.common.util.concurrent.x1
        protected <T> Callable<T> d(Callable<T> callable) {
            return s.l(callable, this.f59575c);
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    public class d extends y1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.c0 f59576d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ScheduledExecutorService scheduledExecutorService, com.google.common.base.c0 c0Var) {
            super(scheduledExecutorService);
            this.f59576d = c0Var;
        }

        @Override // com.google.common.util.concurrent.x1
        protected Runnable c(Runnable runnable) {
            return s.k(runnable, this.f59576d);
        }

        @Override // com.google.common.util.concurrent.x1
        protected <T> Callable<T> d(Callable<T> callable) {
            return s.l(callable, this.f59576d);
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    public class e implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f59577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractFuture f59578c;

        e(Executor executor, AbstractFuture abstractFuture) {
            this.f59577b = executor;
            this.f59578c = abstractFuture;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f59577b.execute(runnable);
            } catch (RejectedExecutionException e10) {
                this.f59578c.C(e10);
            }
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    @o9.c
    @o9.d
    public static class f {

        /* JADX INFO: compiled from: MoreExecutors.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ExecutorService f59579b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f59580c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ TimeUnit f59581d;

            a(f fVar, ExecutorService executorService, long j10, TimeUnit timeUnit) {
                this.f59579b = executorService;
                this.f59580c = j10;
                this.f59581d = timeUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f59579b.shutdown();
                    this.f59579b.awaitTermination(this.f59580c, this.f59581d);
                } catch (InterruptedException unused) {
                }
            }
        }

        f() {
        }

        final void a(ExecutorService executorService, long j10, TimeUnit timeUnit) {
            com.google.common.base.w.E(executorService);
            com.google.common.base.w.E(timeUnit);
            String strValueOf = String.valueOf(executorService);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
            sb2.append("DelayedShutdownHook-for-");
            sb2.append(strValueOf);
            b(y0.n(sb2.toString(), new a(this, executorService, j10, timeUnit)));
        }

        @o9.d
        void b(Thread thread) {
            Runtime.getRuntime().addShutdownHook(thread);
        }

        final ExecutorService c(ThreadPoolExecutor threadPoolExecutor) {
            return d(threadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        final ExecutorService d(ThreadPoolExecutor threadPoolExecutor, long j10, TimeUnit timeUnit) {
            y0.v(threadPoolExecutor);
            ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
            a(threadPoolExecutor, j10, timeUnit);
            return executorServiceUnconfigurableExecutorService;
        }

        final ScheduledExecutorService e(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            return f(scheduledThreadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        final ScheduledExecutorService f(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j10, TimeUnit timeUnit) {
            y0.v(scheduledThreadPoolExecutor);
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
            a(scheduledThreadPoolExecutor, j10, timeUnit);
            return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    @o9.c
    public static final class g extends com.google.common.util.concurrent.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f59582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @t9.a("lock")
        private int f59583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @t9.a("lock")
        private boolean f59584d;

        private g() {
            this.f59582b = new Object();
            this.f59583c = 0;
            this.f59584d = false;
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        private void a() {
            synchronized (this.f59582b) {
                int i10 = this.f59583c - 1;
                this.f59583c = i10;
                if (i10 == 0) {
                    this.f59582b.notifyAll();
                }
            }
        }

        private void b() {
            synchronized (this.f59582b) {
                if (this.f59584d) {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
                this.f59583c++;
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
            long nanos = timeUnit.toNanos(j10);
            synchronized (this.f59582b) {
                while (true) {
                    if (this.f59584d && this.f59583c == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long jNanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f59582b, nanos);
                    nanos -= System.nanoTime() - jNanoTime;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b();
            try {
                runnable.run();
            } finally {
                a();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            boolean z10;
            synchronized (this.f59582b) {
                z10 = this.f59584d;
            }
            return z10;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            boolean z10;
            synchronized (this.f59582b) {
                z10 = this.f59584d && this.f59583c == 0;
            }
            return z10;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            synchronized (this.f59582b) {
                this.f59584d = true;
                if (this.f59583c == 0) {
                    this.f59582b.notifyAll();
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    @o9.c
    public static class h extends com.google.common.util.concurrent.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ExecutorService f59585b;

        h(ExecutorService executorService) {
            this.f59585b = (ExecutorService) com.google.common.base.w.E(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f59585b.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f59585b.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f59585b.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f59585b.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f59585b.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f59585b.shutdownNow();
        }

        public final String toString() {
            String string = super.toString();
            String strValueOf = String.valueOf(this.f59585b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2 + strValueOf.length());
            sb2.append(string);
            sb2.append(Constants.ARRAY_TYPE);
            sb2.append(strValueOf);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: MoreExecutors.java */
    @o9.c
    public static final class i extends h implements w0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ScheduledExecutorService f59586c;

        /* JADX INFO: compiled from: MoreExecutors.java */
        public static final class a<V> extends f0.a<V> implements r0<V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final ScheduledFuture<?> f59587c;

            public a(p0<V> p0Var, ScheduledFuture<?> scheduledFuture) {
                super(p0Var);
                this.f59587c = scheduledFuture;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f59587c.compareTo(delayed);
            }

            @Override // com.google.common.util.concurrent.e0, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                boolean zCancel = super.cancel(z10);
                if (zCancel) {
                    this.f59587c.cancel(z10);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f59587c.getDelay(timeUnit);
            }
        }

        /* JADX INFO: compiled from: MoreExecutors.java */
        @o9.c
        public static final class b extends AbstractFuture.i<Void> implements Runnable {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final Runnable f59588j;

            public b(Runnable runnable) {
                this.f59588j = (Runnable) com.google.common.base.w.E(runnable);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f59588j.run();
                } catch (Throwable th2) {
                    C(th2);
                    throw com.google.common.base.d0.q(th2);
                }
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            protected String y() {
                String strValueOf = String.valueOf(this.f59588j);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 7);
                sb2.append("task=[");
                sb2.append(strValueOf);
                sb2.append("]");
                return sb2.toString();
            }
        }

        i(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f59586c = (ScheduledExecutorService) com.google.common.base.w.E(scheduledExecutorService);
        }

        @Override // com.google.common.util.concurrent.w0, java.util.concurrent.ScheduledExecutorService
        public r0<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskO = TrustedListenableFutureTask.O(runnable, null);
            return new a(trustedListenableFutureTaskO, this.f59586c.schedule(trustedListenableFutureTaskO, j10, timeUnit));
        }

        @Override // com.google.common.util.concurrent.w0, java.util.concurrent.ScheduledExecutorService
        public <V> r0<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTaskP = TrustedListenableFutureTask.P(callable);
            return new a(trustedListenableFutureTaskP, this.f59586c.schedule(trustedListenableFutureTaskP, j10, timeUnit));
        }

        @Override // com.google.common.util.concurrent.w0, java.util.concurrent.ScheduledExecutorService
        public r0<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f59586c.scheduleAtFixedRate(bVar, j10, j11, timeUnit));
        }

        @Override // com.google.common.util.concurrent.w0, java.util.concurrent.ScheduledExecutorService
        public r0<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f59586c.scheduleWithFixedDelay(bVar, j10, j11, timeUnit));
        }
    }

    private y0() {
    }

    @o9.a
    @o9.c
    public static void b(ExecutorService executorService, long j10, TimeUnit timeUnit) {
        new f().a(executorService, j10, timeUnit);
    }

    public static Executor c() {
        return DirectExecutor.INSTANCE;
    }

    @o9.a
    @o9.c
    public static ExecutorService d(ThreadPoolExecutor threadPoolExecutor) {
        return new f().c(threadPoolExecutor);
    }

    @o9.a
    @o9.c
    public static ExecutorService e(ThreadPoolExecutor threadPoolExecutor, long j10, TimeUnit timeUnit) {
        return new f().d(threadPoolExecutor, j10, timeUnit);
    }

    @o9.a
    @o9.c
    public static ScheduledExecutorService f(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new f().e(scheduledThreadPoolExecutor);
    }

    @o9.a
    @o9.c
    public static ScheduledExecutorService g(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j10, TimeUnit timeUnit) {
        return new f().f(scheduledThreadPoolExecutor, j10, timeUnit);
    }

    @o9.c
    @b1
    static <T> T h(u0 u0Var, Collection<? extends Callable<T>> collection, boolean z10, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long jNanoTime;
        long jNanoTime2;
        com.google.common.base.w.E(u0Var);
        com.google.common.base.w.E(timeUnit);
        int size = collection.size();
        com.google.common.base.w.d(size > 0);
        ArrayList arrayListU = Lists.u(size);
        LinkedBlockingQueue linkedBlockingQueueK = a2.k();
        long nanos = timeUnit.toNanos(j10);
        if (z10) {
            try {
                jNanoTime = System.nanoTime();
            } catch (Throwable th2) {
                Iterator it = arrayListU.iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).cancel(true);
                }
                throw th2;
            }
        } else {
            jNanoTime = 0;
        }
        Iterator<? extends Callable<T>> it2 = collection.iterator();
        arrayListU.add(u(u0Var, it2.next(), linkedBlockingQueueK));
        int i10 = size - 1;
        int i11 = 1;
        ExecutionException executionException = null;
        while (true) {
            Future future = (Future) linkedBlockingQueueK.poll();
            if (future != null) {
                jNanoTime2 = jNanoTime;
            } else {
                if (i10 > 0) {
                    i10--;
                    arrayListU.add(u(u0Var, it2.next(), linkedBlockingQueueK));
                    i11++;
                } else {
                    if (i11 == 0) {
                        if (executionException == null) {
                            throw new ExecutionException((Throwable) null);
                        }
                        throw executionException;
                    }
                    if (z10) {
                        future = (Future) linkedBlockingQueueK.poll(nanos, TimeUnit.NANOSECONDS);
                        if (future == null) {
                            throw new TimeoutException();
                        }
                        jNanoTime2 = System.nanoTime();
                        nanos -= jNanoTime2 - jNanoTime;
                    } else {
                        future = (Future) linkedBlockingQueueK.take();
                    }
                }
                jNanoTime2 = jNanoTime;
            }
            long j11 = nanos;
            int i12 = i10;
            if (future != null) {
                i11--;
                try {
                    T t10 = (T) future.get();
                    Iterator it3 = arrayListU.iterator();
                    while (it3.hasNext()) {
                        ((Future) it3.next()).cancel(true);
                    }
                    return t10;
                } catch (RuntimeException e10) {
                    executionException = new ExecutionException(e10);
                    i10 = i12;
                    nanos = j11;
                    jNanoTime = jNanoTime2;
                } catch (ExecutionException e11) {
                    executionException = e11;
                    i10 = i12;
                    nanos = j11;
                    jNanoTime = jNanoTime2;
                }
            }
            i10 = i12;
            nanos = j11;
            jNanoTime = jNanoTime2;
        }
    }

    @o9.c
    private static boolean i() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
            return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    @o9.c
    public static u0 j(ExecutorService executorService) {
        if (executorService instanceof u0) {
            return (u0) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new i((ScheduledExecutorService) executorService) : new h(executorService);
    }

    @o9.c
    public static w0 k(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof w0 ? (w0) scheduledExecutorService : new i(scheduledExecutorService);
    }

    @o9.c
    public static u0 l() {
        return new g(null);
    }

    @o9.c
    public static Executor m(Executor executor) {
        return new SequentialExecutor(executor);
    }

    @o9.c
    static Thread n(String str, Runnable runnable) {
        com.google.common.base.w.E(str);
        com.google.common.base.w.E(runnable);
        Thread threadNewThread = o().newThread(runnable);
        try {
            threadNewThread.setName(str);
        } catch (SecurityException unused) {
        }
        return threadNewThread;
    }

    @o9.a
    @o9.c
    public static ThreadFactory o() {
        if (!i()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e12);
        } catch (InvocationTargetException e13) {
            throw com.google.common.base.d0.q(e13.getCause());
        }
    }

    static Executor p(Executor executor, AbstractFuture<?> abstractFuture) {
        com.google.common.base.w.E(executor);
        com.google.common.base.w.E(abstractFuture);
        return executor == c() ? executor : new e(executor, abstractFuture);
    }

    @o9.c
    static Executor q(Executor executor, com.google.common.base.c0<String> c0Var) {
        com.google.common.base.w.E(executor);
        com.google.common.base.w.E(c0Var);
        return new b(executor, c0Var);
    }

    @o9.c
    static ExecutorService r(ExecutorService executorService, com.google.common.base.c0<String> c0Var) {
        com.google.common.base.w.E(executorService);
        com.google.common.base.w.E(c0Var);
        return new c(executorService, c0Var);
    }

    @o9.c
    static ScheduledExecutorService s(ScheduledExecutorService scheduledExecutorService, com.google.common.base.c0<String> c0Var) {
        com.google.common.base.w.E(scheduledExecutorService);
        com.google.common.base.w.E(c0Var);
        return new d(scheduledExecutorService, c0Var);
    }

    @o9.a
    @s9.a
    @o9.c
    public static boolean t(ExecutorService executorService, long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10) / 2;
        executorService.shutdown();
        try {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (!executorService.awaitTermination(nanos, timeUnit2)) {
                executorService.shutdownNow();
                executorService.awaitTermination(nanos, timeUnit2);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    @o9.c
    private static <T> p0<T> u(u0 u0Var, Callable<T> callable, BlockingQueue<Future<T>> blockingQueue) {
        p0<T> p0VarSubmit = u0Var.submit((Callable) callable);
        p0VarSubmit.V(new a(blockingQueue, p0VarSubmit), c());
        return p0VarSubmit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o9.c
    public static void v(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new s1().e(true).h(threadPoolExecutor.getThreadFactory()).b());
    }
}
