package kotlinx.coroutines.scheduling;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.u;
import kotlin.r0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.u0;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@r0
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0011\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010$\u001a\u00020\r¢\u0006\u0004\b,\u0010-B'\b\u0016\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f\u0012\b\b\u0002\u0010$\u001a\u00020\r¢\u0006\u0004\b,\u0010.B\u001d\b\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b,\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ+\u0010\u0017\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lkotlinx/coroutines/scheduling/d;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "u0", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/b2;", "O", "R", "close", "", "toString", "", "parallelism", "Lkotlinx/coroutines/CoroutineDispatcher;", "s0", "w0", "Lkotlinx/coroutines/scheduling/k;", "", "tailDispatch", "v0", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/k;Z)V", "e", "I", "corePoolSize", "f", "maxPoolSize", "", "g", "J", "idleWorkerKeepAliveNs", RXScreenCaptureService.KEY_HEIGHT, "Ljava/lang/String;", "schedulerName", "i", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "p0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "(IILjava/lang/String;)V", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class d extends ExecutorCoroutineDispatcher {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int corePoolSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int maxPoolSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long idleWorkerKeepAliveNs;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String schedulerName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private CoroutineScheduler coroutineScheduler;

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ d(int i10, int i11) {
        this(i10, i11, n.f130384e, null, 8, null);
    }

    public /* synthetic */ d(int i10, int i11, int i12, u uVar) {
        this((i12 & 1) != 0 ? n.f130382c : i10, (i12 & 2) != 0 ? n.f130383d : i11);
    }

    public d(int i10, int i11, long j10, @dl.d String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
        this.coroutineScheduler = u0();
    }

    public /* synthetic */ d(int i10, int i11, long j10, String str, int i12, u uVar) {
        this(i10, i11, j10, (i12 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public d(int i10, int i11, @dl.d String str) {
        this(i10, i11, n.f130384e, str);
    }

    public /* synthetic */ d(int i10, int i11, String str, int i12, u uVar) {
        this((i12 & 1) != 0 ? n.f130382c : i10, (i12 & 2) != 0 ? n.f130383d : i11, (i12 & 4) != 0 ? n.f130380a : str);
    }

    public static /* synthetic */ CoroutineDispatcher t0(d dVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
        }
        if ((i11 & 1) != 0) {
            i10 = 16;
        }
        return dVar.s0(i10);
    }

    private final CoroutineScheduler u0() {
        return new CoroutineScheduler(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void O(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        try {
            CoroutineScheduler.n(this.coroutineScheduler, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            u0.f130491i.O(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void R(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        try {
            CoroutineScheduler.n(this.coroutineScheduler, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            u0.f130491i.R(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.coroutineScheduler.close();
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @dl.d
    /* JADX INFO: renamed from: p0 */
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    @dl.d
    public final CoroutineDispatcher s0(int parallelism) {
        if (parallelism > 0) {
            return new f(this, parallelism, null, 1);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + parallelism).toString());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    public String toString() {
        return super.toString() + "[scheduler = " + this.coroutineScheduler + ']';
    }

    public final void v0(@dl.d Runnable block, @dl.d k context, boolean tailDispatch) {
        try {
            this.coroutineScheduler.m(block, context, tailDispatch);
        } catch (RejectedExecutionException unused) {
            u0.f130491i.W0(this.coroutineScheduler.e(block, context));
        }
    }

    @dl.d
    public final CoroutineDispatcher w0(int parallelism) {
        if (!(parallelism > 0)) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but have " + parallelism).toString());
        }
        if (parallelism <= this.corePoolSize) {
            return new f(this, parallelism, null, 0);
        }
        throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.corePoolSize + "), but have " + parallelism).toString());
    }
}
