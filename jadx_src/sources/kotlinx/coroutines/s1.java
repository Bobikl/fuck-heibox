package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0005*\u0010\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001B\u0002\b\t¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "d", "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/CoroutineDispatcher;", ak.aF, "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/t1;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class s1 {
    @t1
    public static /* synthetic */ void a() {
    }

    @dl.d
    public static final Executor b(@dl.d CoroutineDispatcher coroutineDispatcher) {
        Executor executor;
        ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof ExecutorCoroutineDispatcher ? (ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        return (executorCoroutineDispatcher == null || (executor = executorCoroutineDispatcher.getExecutor()) == null) ? new d1(coroutineDispatcher) : executor;
    }

    @dl.d
    @xh.h(name = "from")
    public static final CoroutineDispatcher c(@dl.d Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        d1 d1Var = executor instanceof d1 ? (d1) executor : null;
        return (d1Var == null || (coroutineDispatcher = d1Var.dispatcher) == null) ? new r1(executor) : coroutineDispatcher;
    }

    @dl.d
    @xh.h(name = "from")
    public static final ExecutorCoroutineDispatcher d(@dl.d ExecutorService executorService) {
        return new r1(executorService);
    }
}
