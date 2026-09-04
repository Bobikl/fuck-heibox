package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H&R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "Lkotlin/b2;", "close", "Ljava/util/concurrent/Executor;", "p0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "d", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    @dl.d
    /* JADX INFO: renamed from: p0 */
    public abstract Executor getExecutor();
}
