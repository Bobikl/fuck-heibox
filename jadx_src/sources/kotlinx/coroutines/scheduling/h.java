package kotlinx.coroutines.scheduling;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010!\u001a\u00020\u0014\u0012\b\b\u0002\u0010%\u001a\u00020\"¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J+\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\tH\u0016J\u000f\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lkotlinx/coroutines/scheduling/h;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "s0", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/b2;", "O", "R", "Lkotlinx/coroutines/scheduling/k;", "", "tailDispatch", "t0", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/k;Z)V", "close", "w0", "()V", "", l5.a.f130839h0, "v0", "(J)V", "u0", "", "e", "I", "corePoolSize", "f", "maxPoolSize", "g", "J", "idleWorkerKeepAliveNs", "", RXScreenCaptureService.KEY_HEIGHT, "Ljava/lang/String;", "schedulerName", "i", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "p0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class h extends ExecutorCoroutineDispatcher {

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

    public h() {
        this(0, 0, 0L, null, 15, null);
    }

    public h(int i10, int i11, long j10, @dl.d String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
        this.coroutineScheduler = s0();
    }

    public /* synthetic */ h(int i10, int i11, long j10, String str, int i12, u uVar) {
        this((i12 & 1) != 0 ? n.f130382c : i10, (i12 & 2) != 0 ? n.f130383d : i11, (i12 & 4) != 0 ? n.f130384e : j10, (i12 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    private final CoroutineScheduler s0() {
        return new CoroutineScheduler(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void O(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        CoroutineScheduler.n(this.coroutineScheduler, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void R(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        CoroutineScheduler.n(this.coroutineScheduler, runnable, null, true, 2, null);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.coroutineScheduler.close();
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @dl.d
    public Executor p0() {
        return this.coroutineScheduler;
    }

    public final void t0(@dl.d Runnable block, @dl.d k context, boolean tailDispatch) {
        this.coroutineScheduler.m(block, context, tailDispatch);
    }

    public final void u0() {
        w0();
    }

    public final synchronized void v0(long timeout) {
        this.coroutineScheduler.I(timeout);
    }

    public final synchronized void w0() {
        this.coroutineScheduler.I(1000L);
        this.coroutineScheduler = s0();
    }
}
