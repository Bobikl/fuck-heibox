package io.reactivex.internal.schedulers;

import io.reactivex.h0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorScheduler extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final h0 f123611e = io.reactivex.schedulers.b.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f123612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @jh.e
    final Executor f123613d;

    public static final class DelayedRunnable extends AtomicReference<Runnable> implements Runnable, io.reactivex.disposables.b, io.reactivex.schedulers.a {
        private static final long serialVersionUID = -4101336210206799084L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SequentialDisposable f123614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SequentialDisposable f123615c;

        DelayedRunnable(Runnable runnable) {
            super(runnable);
            this.f123614b = new SequentialDisposable();
            this.f123615c = new SequentialDisposable();
        }

        @Override // io.reactivex.schedulers.a
        public Runnable a() {
            Runnable runnable = get();
            return runnable != null ? runnable : Functions.f119557b;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (getAndSet(null) != null) {
                this.f123614b.dispose();
                this.f123615c.dispose();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    this.f123614b.lazySet(DisposableHelper.DISPOSED);
                    SequentialDisposable sequentialDisposable = this.f123615c;
                } finally {
                    lazySet(null);
                    this.f123614b.lazySet(DisposableHelper.DISPOSED);
                    this.f123615c.lazySet(DisposableHelper.DISPOSED);
                }
            }
        }
    }

    public static final class ExecutorWorker extends h0.c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f123616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Executor f123617c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f123619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f123620f = new AtomicInteger();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final io.reactivex.disposables.a f123621g = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final MpscLinkedQueue<Runnable> f123618d = new MpscLinkedQueue<>();

        public static final class BooleanRunnable extends AtomicBoolean implements Runnable, io.reactivex.disposables.b {
            private static final long serialVersionUID = -2421395018820541164L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Runnable f123622b;

            BooleanRunnable(Runnable runnable) {
                this.f123622b = runnable;
            }

            @Override // io.reactivex.disposables.b
            public void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.disposables.b
            public boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f123622b.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        public static final class InterruptibleRunnable extends AtomicInteger implements Runnable, io.reactivex.disposables.b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            static final int f123623e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            static final int f123624f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            static final int f123625g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            static final int f123626h = 3;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            static final int f123627i = 4;
            private static final long serialVersionUID = -3603436687413320876L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Runnable f123628b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final io.reactivex.internal.disposables.a f123629c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            volatile Thread f123630d;

            InterruptibleRunnable(Runnable runnable, io.reactivex.internal.disposables.a aVar) {
                this.f123628b = runnable;
                this.f123629c = aVar;
            }

            void a() {
                io.reactivex.internal.disposables.a aVar = this.f123629c;
                if (aVar != null) {
                    aVar.b(this);
                }
            }

            @Override // io.reactivex.disposables.b
            public void dispose() {
                while (true) {
                    int i10 = get();
                    if (i10 >= 2) {
                        return;
                    }
                    if (i10 == 0) {
                        if (compareAndSet(0, 4)) {
                            a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f123630d;
                        if (thread != null) {
                            thread.interrupt();
                            this.f123630d = null;
                        }
                        set(4);
                        a();
                        return;
                    }
                }
            }

            @Override // io.reactivex.disposables.b
            public boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f123630d = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f123630d = null;
                        return;
                    }
                    try {
                        this.f123628b.run();
                        this.f123630d = null;
                        if (compareAndSet(1, 2)) {
                        }
                    } finally {
                        this.f123630d = null;
                        if (compareAndSet(1, 2)) {
                            a();
                        } else {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        }
                    }
                }
            }
        }

        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SequentialDisposable f123631b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Runnable f123632c;

            a(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.f123631b = sequentialDisposable;
                this.f123632c = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f123631b.a(ExecutorWorker.this.b(this.f123632c));
            }
        }

        public ExecutorWorker(Executor executor, boolean z10) {
            this.f123617c = executor;
            this.f123616b = z10;
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b b(@jh.e Runnable runnable) {
            io.reactivex.disposables.b booleanRunnable;
            if (this.f123619e) {
                return EmptyDisposable.INSTANCE;
            }
            Runnable runnableB0 = io.reactivex.plugins.a.b0(runnable);
            if (this.f123616b) {
                booleanRunnable = new InterruptibleRunnable(runnableB0, this.f123621g);
                this.f123621g.c(booleanRunnable);
            } else {
                booleanRunnable = new BooleanRunnable(runnableB0);
            }
            this.f123618d.offer(booleanRunnable);
            if (this.f123620f.getAndIncrement() == 0) {
                try {
                    this.f123617c.execute(this);
                } catch (RejectedExecutionException e10) {
                    this.f123619e = true;
                    this.f123618d.clear();
                    io.reactivex.plugins.a.Y(e10);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return booleanRunnable;
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b c(@jh.e Runnable runnable, long j10, @jh.e TimeUnit timeUnit) {
            if (j10 <= 0) {
                return b(runnable);
            }
            if (this.f123619e) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new a(sequentialDisposable2, io.reactivex.plugins.a.b0(runnable)), this.f123621g);
            this.f123621g.c(scheduledRunnable);
            Executor executor = this.f123617c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.a(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j10, timeUnit));
                } catch (RejectedExecutionException e10) {
                    this.f123619e = true;
                    io.reactivex.plugins.a.Y(e10);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.a(new b(ExecutorScheduler.f123611e.g(scheduledRunnable, j10, timeUnit)));
            }
            sequentialDisposable.a(scheduledRunnable);
            return sequentialDisposable2;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f123619e) {
                return;
            }
            this.f123619e = true;
            this.f123621g.dispose();
            if (this.f123620f.getAndIncrement() == 0) {
                this.f123618d.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123619e;
        }

        @Override // java.lang.Runnable
        public void run() {
            MpscLinkedQueue<Runnable> mpscLinkedQueue = this.f123618d;
            int iAddAndGet = 1;
            while (!this.f123619e) {
                while (true) {
                    Runnable runnablePoll = mpscLinkedQueue.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    runnablePoll.run();
                    if (this.f123619e) {
                        mpscLinkedQueue.clear();
                        return;
                    }
                }
                if (this.f123619e) {
                    mpscLinkedQueue.clear();
                    return;
                } else {
                    iAddAndGet = this.f123620f.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            mpscLinkedQueue.clear();
        }
    }

    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DelayedRunnable f123634b;

        a(DelayedRunnable delayedRunnable) {
            this.f123634b = delayedRunnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            DelayedRunnable delayedRunnable = this.f123634b;
            delayedRunnable.f123615c.a(ExecutorScheduler.this.f(delayedRunnable));
        }
    }

    public ExecutorScheduler(@jh.e Executor executor, boolean z10) {
        this.f123613d = executor;
        this.f123612c = z10;
    }

    @Override // io.reactivex.h0
    @jh.e
    public h0.c c() {
        return new ExecutorWorker(this.f123613d, this.f123612c);
    }

    @Override // io.reactivex.h0
    @jh.e
    public io.reactivex.disposables.b f(@jh.e Runnable runnable) {
        Runnable runnableB0 = io.reactivex.plugins.a.b0(runnable);
        try {
            if (this.f123613d instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnableB0);
                scheduledDirectTask.b(((ExecutorService) this.f123613d).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            if (this.f123612c) {
                ExecutorWorker.InterruptibleRunnable interruptibleRunnable = new ExecutorWorker.InterruptibleRunnable(runnableB0, null);
                this.f123613d.execute(interruptibleRunnable);
                return interruptibleRunnable;
            }
            ExecutorWorker.BooleanRunnable booleanRunnable = new ExecutorWorker.BooleanRunnable(runnableB0);
            this.f123613d.execute(booleanRunnable);
            return booleanRunnable;
        } catch (RejectedExecutionException e10) {
            io.reactivex.plugins.a.Y(e10);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.h0
    @jh.e
    public io.reactivex.disposables.b g(@jh.e Runnable runnable, long j10, TimeUnit timeUnit) {
        Runnable runnableB0 = io.reactivex.plugins.a.b0(runnable);
        if (!(this.f123613d instanceof ScheduledExecutorService)) {
            DelayedRunnable delayedRunnable = new DelayedRunnable(runnableB0);
            delayedRunnable.f123614b.a(f123611e.g(new a(delayedRunnable), j10, timeUnit));
            return delayedRunnable;
        }
        try {
            ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnableB0);
            scheduledDirectTask.b(((ScheduledExecutorService) this.f123613d).schedule(scheduledDirectTask, j10, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            io.reactivex.plugins.a.Y(e10);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.h0
    @jh.e
    public io.reactivex.disposables.b h(@jh.e Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        if (!(this.f123613d instanceof ScheduledExecutorService)) {
            return super.h(runnable, j10, j11, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(io.reactivex.plugins.a.b0(runnable));
            scheduledDirectPeriodicTask.b(((ScheduledExecutorService) this.f123613d).scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e10) {
            io.reactivex.plugins.a.Y(e10);
            return EmptyDisposable.INSTANCE;
        }
    }
}
