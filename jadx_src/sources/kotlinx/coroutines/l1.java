package kotlinx.coroutines;

import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tJ\u0010\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0011\u0010'\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010\u001e¨\u0006*"}, d2 = {"Lkotlinx/coroutines/l1;", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "unconfined", "", "t0", "D0", "E0", "G0", "Lkotlinx/coroutines/b1;", "task", "Lkotlin/b2;", "u0", "w0", "p0", "", "parallelism", "c0", "shutdown", "d", "J", "useCount", "e", "Z", "shared", "Lkotlinx/coroutines/internal/a;", "f", "Lkotlinx/coroutines/internal/a;", "unconfinedQueue", "z0", "()Z", "isEmpty", "v0", "()J", "nextTime", "isActive", "B0", "isUnconfinedLoopActive", "C0", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class l1 extends CoroutineDispatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long useCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean shared;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private kotlinx.coroutines.internal.a<b1<?>> unconfinedQueue;

    public static /* synthetic */ void s0(l1 l1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        l1Var.p0(z10);
    }

    private final long t0(boolean unconfined) {
        return unconfined ? 4294967296L : 1L;
    }

    public static /* synthetic */ void x0(l1 l1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        l1Var.w0(z10);
    }

    public final boolean B0() {
        return this.useCount >= t0(true);
    }

    public final boolean C0() {
        kotlinx.coroutines.internal.a<b1<?>> aVar = this.unconfinedQueue;
        if (aVar != null) {
            return aVar.d();
        }
        return true;
    }

    public long D0() {
        return !E0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean E0() throws IllegalAccessException, InvocationTargetException {
        b1<?> b1VarE;
        kotlinx.coroutines.internal.a<b1<?>> aVar = this.unconfinedQueue;
        if (aVar == null || (b1VarE = aVar.e()) == null) {
            return false;
        }
        b1VarE.run();
        return true;
    }

    public boolean G0() {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    public final CoroutineDispatcher c0(int parallelism) {
        kotlinx.coroutines.internal.s.a(parallelism);
        return this;
    }

    public final boolean isActive() {
        return this.useCount > 0;
    }

    public final void p0(boolean z10) {
        long jT0 = this.useCount - t0(z10);
        this.useCount = jT0;
        if (jT0 <= 0 && this.shared) {
            shutdown();
        }
    }

    public void shutdown() {
    }

    public final void u0(@dl.d b1<?> b1Var) {
        kotlinx.coroutines.internal.a<b1<?>> aVar = this.unconfinedQueue;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.unconfinedQueue = aVar;
        }
        aVar.a(b1Var);
    }

    protected long v0() {
        kotlinx.coroutines.internal.a<b1<?>> aVar = this.unconfinedQueue;
        return (aVar == null || aVar.d()) ? Long.MAX_VALUE : 0L;
    }

    public final void w0(boolean z10) {
        this.useCount += t0(z10);
        if (z10) {
            return;
        }
        this.shared = true;
    }

    protected boolean z0() {
        return C0();
    }
}
