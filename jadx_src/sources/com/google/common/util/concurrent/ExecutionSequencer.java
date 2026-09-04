package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@u
public final class ExecutionSequencer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<p0<Void>> f59300a = new AtomicReference<>(j0.n());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f59301b = new c(null);

    public enum RunningState {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    public static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        ExecutionSequencer f59302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        Executor f59303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        Runnable f59304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        Thread f59305e;

        private TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer) {
            super(RunningState.NOT_RUN);
            this.f59303c = executor;
            this.f59302b = executionSequencer;
        }

        /* synthetic */ TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer, a aVar) {
            this(executor, executionSequencer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.CANCELLED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.STARTED);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (get() == RunningState.CANCELLED) {
                this.f59303c = null;
                this.f59302b = null;
                return;
            }
            this.f59305e = Thread.currentThread();
            try {
                ExecutionSequencer executionSequencer = this.f59302b;
                Objects.requireNonNull(executionSequencer);
                c cVar = executionSequencer.f59301b;
                if (cVar.f59309a == this.f59305e) {
                    this.f59302b = null;
                    com.google.common.base.w.g0(cVar.f59310b == null);
                    cVar.f59310b = runnable;
                    Executor executor = this.f59303c;
                    Objects.requireNonNull(executor);
                    cVar.f59311c = executor;
                    this.f59303c = null;
                } else {
                    Executor executor2 = this.f59303c;
                    Objects.requireNonNull(executor2);
                    this.f59303c = null;
                    this.f59304d = runnable;
                    executor2.execute(this);
                }
            } finally {
                this.f59305e = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = null;
            if (threadCurrentThread != this.f59305e) {
                Runnable runnable = this.f59304d;
                Objects.requireNonNull(runnable);
                this.f59304d = null;
                runnable.run();
                return;
            }
            c cVar = new c(aVar);
            cVar.f59309a = threadCurrentThread;
            ExecutionSequencer executionSequencer = this.f59302b;
            Objects.requireNonNull(executionSequencer);
            executionSequencer.f59301b = cVar;
            this.f59302b = null;
            try {
                Runnable runnable2 = this.f59304d;
                Objects.requireNonNull(runnable2);
                this.f59304d = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = cVar.f59310b;
                    if (runnable3 == null || (executor = cVar.f59311c) == null) {
                        break;
                    }
                    cVar.f59310b = null;
                    cVar.f59311c = null;
                    executor.execute(runnable3);
                }
                cVar.f59309a = null;
            } catch (Throwable th2) {
                cVar.f59309a = null;
                throw th2;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements l<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f59306a;

        a(ExecutionSequencer executionSequencer, Callable callable) {
            this.f59306a = callable;
        }

        @Override // com.google.common.util.concurrent.l
        public p0<T> call() throws Exception {
            return j0.m(this.f59306a.call());
        }

        public String toString() {
            return this.f59306a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements l<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TaskNonReentrantExecutor f59307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f59308b;

        b(ExecutionSequencer executionSequencer, TaskNonReentrantExecutor taskNonReentrantExecutor, l lVar) {
            this.f59307a = taskNonReentrantExecutor;
            this.f59308b = lVar;
        }

        @Override // com.google.common.util.concurrent.l
        public p0<T> call() throws Exception {
            return !this.f59307a.d() ? j0.k() : this.f59308b.call();
        }

        public String toString() {
            return this.f59308b.toString();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        Thread f59309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        Runnable f59310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        Executor f59311c;

        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    private ExecutionSequencer() {
    }

    public static ExecutionSequencer d() {
        return new ExecutionSequencer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(TrustedListenableFutureTask trustedListenableFutureTask, h1 h1Var, p0 p0Var, p0 p0Var2, TaskNonReentrantExecutor taskNonReentrantExecutor) {
        if (trustedListenableFutureTask.isDone()) {
            h1Var.D(p0Var);
        } else if (p0Var2.isCancelled() && taskNonReentrantExecutor.c()) {
            trustedListenableFutureTask.cancel(false);
        }
    }

    public <T> p0<T> f(Callable<T> callable, Executor executor) {
        com.google.common.base.w.E(callable);
        com.google.common.base.w.E(executor);
        return g(new a(this, callable), executor);
    }

    public <T> p0<T> g(l<T> lVar, Executor executor) {
        com.google.common.base.w.E(lVar);
        com.google.common.base.w.E(executor);
        final TaskNonReentrantExecutor taskNonReentrantExecutor = new TaskNonReentrantExecutor(executor, this, null);
        b bVar = new b(this, taskNonReentrantExecutor, lVar);
        final h1 h1VarF = h1.F();
        final p0<Void> andSet = this.f59300a.getAndSet(h1VarF);
        final TrustedListenableFutureTask trustedListenableFutureTaskN = TrustedListenableFutureTask.N(bVar);
        andSet.V(trustedListenableFutureTaskN, taskNonReentrantExecutor);
        final p0<T> p0VarQ = j0.q(trustedListenableFutureTaskN);
        Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.w
            @Override // java.lang.Runnable
            public final void run() {
                ExecutionSequencer.e(trustedListenableFutureTaskN, h1VarF, andSet, p0VarQ, taskNonReentrantExecutor);
            }
        };
        p0VarQ.V(runnable, y0.c());
        trustedListenableFutureTaskN.V(runnable, y0.c());
        return p0VarQ;
    }
}
