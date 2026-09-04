package kotlinx.coroutines.scheduling;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010(\u001a\u00020\u001e¢\u0006\u0004\b0\u00101J#\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\n\u0010\f\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001e\u0010,\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lkotlinx/coroutines/scheduling/f;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/scheduling/k;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "tailDispatch", "Lkotlin/b2;", "s0", "(Ljava/lang/Runnable;Z)V", "command", com.tekartik.sqflite.b.f98590i, "(Ljava/lang/Runnable;)V", "close", "()V", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "O", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "R", "", "toString", "()Ljava/lang/String;", ak.aF, "Lkotlinx/coroutines/scheduling/d;", "e", "Lkotlinx/coroutines/scheduling/d;", "dispatcher", "", "f", "I", "parallelism", "g", "Ljava/lang/String;", "name", RXScreenCaptureService.KEY_HEIGHT, "L", "()I", "taskMode", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "i", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "p0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Lkotlinx/coroutines/scheduling/d;ILjava/lang/String;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class f extends ExecutorCoroutineDispatcher implements k, Executor {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f130364j = AtomicIntegerFieldUpdater.newUpdater(f.class, "inFlightTasks");

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d dispatcher;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int parallelism;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String name;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int taskMode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ConcurrentLinkedQueue<Runnable> queue = new ConcurrentLinkedQueue<>();

    @dl.d
    private volatile /* synthetic */ int inFlightTasks = 0;

    public f(@dl.d d dVar, int i10, @dl.e String str, int i11) {
        this.dispatcher = dVar;
        this.parallelism = i10;
        this.name = str;
        this.taskMode = i11;
    }

    private final void s0(Runnable block, boolean tailDispatch) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f130364j;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.parallelism) {
                this.dispatcher.v0(block, this, tailDispatch);
                return;
            }
            this.queue.add(block);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.parallelism) {
                return;
            } else {
                block = this.queue.poll();
            }
        } while (block != null);
    }

    @Override // kotlinx.coroutines.scheduling.k
    /* JADX INFO: renamed from: L, reason: from getter */
    public int getTaskMode() {
        return this.taskMode;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void O(@dl.d CoroutineContext context, @dl.d Runnable block) {
        s0(block, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void R(@dl.d CoroutineContext context, @dl.d Runnable block) {
        s0(block, true);
    }

    @Override // kotlinx.coroutines.scheduling.k
    public void c() {
        Runnable runnablePoll = this.queue.poll();
        if (runnablePoll != null) {
            this.dispatcher.v0(runnablePoll, this, true);
            return;
        }
        f130364j.decrementAndGet(this);
        Runnable runnablePoll2 = this.queue.poll();
        if (runnablePoll2 == null) {
            return;
        }
        s0(runnablePoll2, true);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@dl.d Runnable command) {
        s0(command, false);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @dl.d
    /* JADX INFO: renamed from: p0 */
    public Executor getExecutor() {
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    public String toString() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.dispatcher + ']';
    }
}
