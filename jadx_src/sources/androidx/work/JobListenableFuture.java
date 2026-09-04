package androidx.work;

import com.google.common.util.concurrent.p0;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0096\u0001J\u0018\u0010\f\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ0\u0010\f\u001a\n \u0004*\u0004\u0018\u00018\u00008\u00002\u0006\u0010\u0005\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u000f0\u000fH\u0096\u0003¢\u0006\u0004\b\f\u0010\u0010J\t\u0010\u0011\u001a\u00020\nH\u0096\u0001J\t\u0010\u0012\u001a\u00020\nH\u0096\u0001J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/work/JobListenableFuture;", "R", "Lcom/google/common/util/concurrent/p0;", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lkotlin/b2;", androidx.exifinterface.media.a.X4, "", "cancel", "get", "()Ljava/lang/Object;", "", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isCancelled", "isDone", "result", "b", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/d2;", "job", "Landroidx/work/impl/utils/futures/a;", ak.aF, "Landroidx/work/impl/utils/futures/a;", "underlying", "<init>", "(Lkotlinx/coroutines/d2;Landroidx/work/impl/utils/futures/a;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1})
public final class JobListenableFuture<R> implements p0<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d2 job;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.work.impl.utils.futures.a<R> underlying;

    public JobListenableFuture(@dl.d d2 job, @dl.d androidx.work.impl.utils.futures.a<R> underlying) {
        f0.p(job, "job");
        f0.p(underlying, "underlying");
        this.job = job;
        this.underlying = underlying;
        job.K(new yh.l<Throwable, b2>(this) { // from class: androidx.work.JobListenableFuture.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ JobListenableFuture<R> f28690b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f28690b = this;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e Throwable th2) {
                if (th2 == null) {
                    if (!((JobListenableFuture) this.f28690b).underlying.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    if (th2 instanceof CancellationException) {
                        ((JobListenableFuture) this.f28690b).underlying.cancel(true);
                        return;
                    }
                    androidx.work.impl.utils.futures.a aVar = ((JobListenableFuture) this.f28690b).underlying;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    aVar.q(th2);
                }
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JobListenableFuture(d2 d2Var, androidx.work.impl.utils.futures.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        if ((i10 & 2) != 0) {
            aVar = androidx.work.impl.utils.futures.a.u();
            f0.o(aVar, "create()");
        }
        this(d2Var, aVar);
    }

    @Override // com.google.common.util.concurrent.p0
    public void V(Runnable runnable, Executor executor) {
        this.underlying.V(runnable, executor);
    }

    public final void b(R result) {
        this.underlying.p(result);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean p10) {
        return this.underlying.cancel(p10);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.underlying.get();
    }

    @Override // java.util.concurrent.Future
    public R get(long p10, TimeUnit p11) {
        return this.underlying.get(p10, p11);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.underlying.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.underlying.isDone();
    }
}
