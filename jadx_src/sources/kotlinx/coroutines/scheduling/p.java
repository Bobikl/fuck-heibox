package kotlinx.coroutines.scheduling;

import com.google.common.util.concurrent.r1;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, d2 = {"Lkotlinx/coroutines/scheduling/p;", "", "Lkotlinx/coroutines/scheduling/j;", "task", ak.aF, "(Lkotlinx/coroutines/scheduling/j;)Lkotlinx/coroutines/scheduling/j;", "victim", "", "blockingOnly", "", "m", "(Lkotlinx/coroutines/scheduling/p;Z)J", "Lkotlinx/coroutines/scheduling/e;", "queue", "j", "(Lkotlinx/coroutines/scheduling/e;)Z", "i", "()Lkotlinx/coroutines/scheduling/j;", "Lkotlin/b2;", "d", "(Lkotlinx/coroutines/scheduling/j;)V", RXScreenCaptureService.KEY_HEIGHT, "fair", ak.av, "(Lkotlinx/coroutines/scheduling/j;Z)Lkotlinx/coroutines/scheduling/j;", "l", "(Lkotlinx/coroutines/scheduling/p;)J", "k", "globalQueue", "g", "(Lkotlinx/coroutines/scheduling/e;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "e", "()I", "bufferSize", "f", UiKitSpanObj.TYPE_SIZE, "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f130391b = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f130392c = AtomicIntegerFieldUpdater.newUpdater(p.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f130393d = AtomicIntegerFieldUpdater.newUpdater(p.class, "consumerIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f130394e = AtomicIntegerFieldUpdater.newUpdater(p.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AtomicReferenceArray<j> buffer = new AtomicReferenceArray<>(128);

    @dl.d
    private volatile /* synthetic */ Object lastScheduledTask = null;

    @dl.d
    private volatile /* synthetic */ int producerIndex = 0;

    @dl.d
    private volatile /* synthetic */ int consumerIndex = 0;

    @dl.d
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ j b(p pVar, j jVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return pVar.a(jVar, z10);
    }

    private final j c(j task) {
        if (task.taskContext.getTaskMode() == 1) {
            f130394e.incrementAndGet(this);
        }
        if (e() == 127) {
            return task;
        }
        int i10 = this.producerIndex & 127;
        while (this.buffer.get(i10) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i10, task);
        f130392c.incrementAndGet(this);
        return null;
    }

    private final void d(j jVar) {
        if (jVar != null) {
            if (jVar.taskContext.getTaskMode() == 1) {
                f130394e.decrementAndGet(this);
            }
        }
    }

    private final j i() {
        j andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f130393d.compareAndSet(this, i10, i10 + 1) && (andSet = this.buffer.getAndSet(i11, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(e queue) {
        j jVarI = i();
        if (jVarI == null) {
            return false;
        }
        queue.a(jVarI);
        return true;
    }

    private final long m(p victim, boolean blockingOnly) {
        j jVar;
        do {
            jVar = (j) victim.lastScheduledTask;
            if (jVar == null) {
                return -2L;
            }
            if (blockingOnly) {
                if (!(jVar.taskContext.getTaskMode() == 1)) {
                    return -2L;
                }
            }
            long jA = n.f130385f.a() - jVar.submissionTime;
            long j10 = n.f130381b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.a.a(f130391b, victim, jVar, null));
        b(this, jVar, false, 2, null);
        return -1L;
    }

    @dl.e
    public final j a(@dl.d j task, boolean fair) {
        if (fair) {
            return c(task);
        }
        j jVar = (j) f130391b.getAndSet(this, task);
        if (jVar == null) {
            return null;
        }
        return c(jVar);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(@dl.d e globalQueue) {
        j jVar = (j) f130391b.getAndSet(this, null);
        if (jVar != null) {
            globalQueue.a(jVar);
        }
        while (j(globalQueue)) {
        }
    }

    @dl.e
    public final j h() {
        j jVar = (j) f130391b.getAndSet(this, null);
        return jVar == null ? i() : jVar;
    }

    public final long k(@dl.d p victim) {
        int i10 = victim.consumerIndex;
        int i11 = victim.producerIndex;
        AtomicReferenceArray<j> atomicReferenceArray = victim.buffer;
        while (true) {
            if (i10 == i11) {
                break;
            }
            int i12 = i10 & 127;
            if (victim.blockingTasksInBuffer == 0) {
                break;
            }
            j jVar = atomicReferenceArray.get(i12);
            if (jVar != null) {
                if ((jVar.taskContext.getTaskMode() == 1) && r1.a(atomicReferenceArray, i12, jVar, null)) {
                    f130394e.decrementAndGet(victim);
                    b(this, jVar, false, 2, null);
                    return -1L;
                }
            }
            i10++;
        }
        return m(victim, true);
    }

    public final long l(@dl.d p victim) {
        j jVarI = victim.i();
        if (jVarI == null) {
            return m(victim, false);
        }
        b(this, jVarI, false, 2, null);
        return -1L;
    }
}
