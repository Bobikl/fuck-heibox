package okhttp3.internal.concurrent;

import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Task.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\bR\"\u0010\u0010\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "", "", "runOnce", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/b2;", "initQueue$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "initQueue", "", "toString", "Lokhttp3/internal/concurrent/TaskQueue;", "getQueue$okhttp", "()Lokhttp3/internal/concurrent/TaskQueue;", "setQueue$okhttp", "nextExecuteNanoTime", "J", "getNextExecuteNanoTime$okhttp", "()J", "setNextExecuteNanoTime$okhttp", "(J)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "cancelable", "Z", "getCancelable", "()Z", "<init>", "(Ljava/lang/String;Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public abstract class Task {
    private final boolean cancelable;

    @d
    private final String name;
    private long nextExecuteNanoTime;

    @e
    private TaskQueue queue;

    public Task(@d String name, boolean z10) {
        f0.p(name, "name");
        this.name = name;
        this.cancelable = z10;
        this.nextExecuteNanoTime = -1L;
    }

    public /* synthetic */ Task(String str, boolean z10, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @d
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getNextExecuteNanoTime$okhttp, reason: from getter */
    public final long getNextExecuteNanoTime() {
        return this.nextExecuteNanoTime;
    }

    @e
    /* JADX INFO: renamed from: getQueue$okhttp, reason: from getter */
    public final TaskQueue getQueue() {
        return this.queue;
    }

    public final void initQueue$okhttp(@d TaskQueue queue) {
        f0.p(queue, "queue");
        TaskQueue taskQueue = this.queue;
        if (taskQueue == queue) {
            return;
        }
        if (!(taskQueue == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.queue = queue;
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j10) {
        this.nextExecuteNanoTime = j10;
    }

    public final void setQueue$okhttp(@e TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    @d
    public String toString() {
        return this.name;
    }
}
