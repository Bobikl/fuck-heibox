package androidx.room;

import com.umeng.analytics.pro.ak;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: TransactionExecutor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/room/i2;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lkotlin/b2;", com.tekartik.sqflite.b.f98590i, ak.aF, "b", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "tasks", "d", "Ljava/lang/Runnable;", "active", "", "e", "Ljava/lang/Object;", "syncLock", "<init>", "(Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class i2 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Executor executor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ArrayDeque<Runnable> tasks;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Runnable active;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object syncLock;

    public i2(@dl.d Executor executor) {
        kotlin.jvm.internal.f0.p(executor, "executor");
        this.executor = executor;
        this.tasks = new ArrayDeque<>();
        this.syncLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable command, i2 this$0) {
        kotlin.jvm.internal.f0.p(command, "$command");
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.c();
        }
    }

    public final void c() {
        synchronized (this.syncLock) {
            Runnable runnablePoll = this.tasks.poll();
            Runnable runnable = runnablePoll;
            this.active = runnable;
            if (runnablePoll != null) {
                this.executor.execute(runnable);
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@dl.d final Runnable command) {
        kotlin.jvm.internal.f0.p(command, "command");
        synchronized (this.syncLock) {
            this.tasks.offer(new Runnable() { // from class: androidx.room.h2
                @Override // java.lang.Runnable
                public final void run() {
                    i2.b(command, this);
                }
            });
            if (this.active == null) {
                c();
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }
}
