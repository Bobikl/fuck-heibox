package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J.\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lkotlinx/coroutines/r1;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/y0;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "t0", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Lkotlin/b2;", "s0", "O", "Lkotlinx/coroutines/p;", "continuation", "o", "Lkotlinx/coroutines/h1;", "r", "close", "", "toString", "", "other", "", "equals", "", "hashCode", "Ljava/util/concurrent/Executor;", "e", "Ljava/util/concurrent/Executor;", "p0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class r1 extends ExecutorCoroutineDispatcher implements y0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Executor executor;

    public r1(@dl.d Executor executor) {
        this.executor = executor;
        kotlinx.coroutines.internal.f.c(getExecutor());
    }

    private final void s0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        g2.f(coroutineContext, q1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> t0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            s0(coroutineContext, e10);
            return null;
        }
    }

    @Override // kotlinx.coroutines.y0
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @dl.e
    public Object N(long j10, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return y0.a.a(this, j10, cVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void O(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        Runnable runnableI;
        try {
            Executor executor = getExecutor();
            b bVarB = c.b();
            if (bVarB == null || (runnableI = bVarB.i(runnable)) == null) {
                runnableI = runnable;
            }
            executor.execute(runnableI);
        } catch (RejectedExecutionException e10) {
            b bVarB2 = c.b();
            if (bVarB2 != null) {
                bVarB2.f();
            }
            s0(coroutineContext, e10);
            e1.c().O(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = getExecutor();
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(@dl.e Object other) {
        return (other instanceof r1) && ((r1) other).getExecutor() == getExecutor();
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }

    @Override // kotlinx.coroutines.y0
    public void o(long j10, @dl.d p<? super kotlin.b2> pVar) {
        Executor executor = getExecutor();
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> scheduledFutureT0 = scheduledExecutorService != null ? t0(scheduledExecutorService, new x2(this, pVar), pVar.getCom.umeng.analytics.pro.d.R java.lang.String(), j10) : null;
        if (scheduledFutureT0 != null) {
            g2.w(pVar, scheduledFutureT0);
        } else {
            u0.f130491i.o(j10, pVar);
        }
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @dl.d
    /* JADX INFO: renamed from: p0, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    @Override // kotlinx.coroutines.y0
    @dl.d
    public h1 r(long timeMillis, @dl.d Runnable block, @dl.d CoroutineContext context) {
        Executor executor = getExecutor();
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> scheduledFutureT0 = scheduledExecutorService != null ? t0(scheduledExecutorService, block, context, timeMillis) : null;
        return scheduledFutureT0 != null ? new g1(scheduledFutureT0) : u0.f130491i.r(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    public String toString() {
        return getExecutor().toString();
    }
}
