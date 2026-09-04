package kotlinx.coroutines.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b.\u0010/J#\u0010\t\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\bJ\b\u0010\u000b\u001a\u00020\nH\u0002J\u0014\u0010\f\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u001b\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0097Aø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0096\u0001J\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u001c\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0017R\u0014\u0010!\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u001e\u0010(\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010-\u001a\u00060)j\u0002`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/r;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/y0;", "block", "Lkotlin/Function0;", "Lkotlin/b2;", "dispatch", "s0", "", "t0", "p0", "", "time", "N", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", "timeMillis", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Lkotlinx/coroutines/h1;", "r", "Lkotlinx/coroutines/p;", "continuation", "o", "", "parallelism", "c0", "run", "O", "R", "d", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "e", "I", "runningWorkers", "Lkotlinx/coroutines/internal/y;", "g", "Lkotlinx/coroutines/internal/y;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", RXScreenCaptureService.KEY_HEIGHT, "Ljava/lang/Object;", "workerAllocationLock", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class r extends CoroutineDispatcher implements Runnable, kotlinx.coroutines.y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int parallelism;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.y0 f130194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final y<Runnable> queue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object workerAllocationLock;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@dl.d CoroutineDispatcher coroutineDispatcher, int i10) {
        this.dispatcher = coroutineDispatcher;
        this.parallelism = i10;
        kotlinx.coroutines.y0 y0Var = coroutineDispatcher instanceof kotlinx.coroutines.y0 ? (kotlinx.coroutines.y0) coroutineDispatcher : null;
        this.f130194f = y0Var == null ? kotlinx.coroutines.v0.a() : y0Var;
        this.queue = new y<>(false);
        this.workerAllocationLock = new Object();
    }

    private final boolean p0(Runnable block) {
        this.queue.a(block);
        return this.runningWorkers >= this.parallelism;
    }

    private final void s0(Runnable runnable, yh.a<b2> aVar) {
        if (!p0(runnable) && t0()) {
            aVar.invoke();
        }
    }

    private final boolean t0() {
        synchronized (this.workerAllocationLock) {
            if (this.runningWorkers >= this.parallelism) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // kotlinx.coroutines.y0
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @dl.e
    public Object N(long j10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return this.f130194f.N(j10, cVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void O(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        if (p0(runnable) || !t0()) {
            return;
        }
        this.dispatcher.O(this, this);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @z1
    public void R(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        if (p0(runnable) || !t0()) {
            return;
        }
        this.dispatcher.R(this, this);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    @t1
    public CoroutineDispatcher c0(int parallelism) {
        s.a(parallelism);
        return parallelism >= this.parallelism ? this : super.c0(parallelism);
    }

    @Override // kotlinx.coroutines.y0
    public void o(long j10, @dl.d kotlinx.coroutines.p<? super b2> pVar) {
        this.f130194f.o(j10, pVar);
    }

    @Override // kotlinx.coroutines.y0
    @dl.d
    public h1 r(long timeMillis, @dl.d Runnable block, @dl.d CoroutineContext context) {
        return this.f130194f.r(timeMillis, block, context);
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            int i10 = 0;
            while (true) {
                Runnable runnableG = this.queue.g();
                if (runnableG != null) {
                    try {
                        runnableG.run();
                    } catch (Throwable th2) {
                        kotlinx.coroutines.n0.b(EmptyCoroutineContext.f124694b, th2);
                    }
                    i10++;
                    if (i10 >= 16 && this.dispatcher.V(this)) {
                        this.dispatcher.O(this, this);
                        return;
                    }
                }
            }
            synchronized (this.workerAllocationLock) {
                this.runningWorkers--;
                if (this.queue.c() == 0) {
                    return;
                }
                this.runningWorkers++;
                b2 b2Var = b2.f124493a;
            }
        }
    }
}
