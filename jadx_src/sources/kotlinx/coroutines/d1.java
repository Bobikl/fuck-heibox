package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/d1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/b2;", com.tekartik.sqflite.b.f98590i, "", "toString", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class d1 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final CoroutineDispatcher dispatcher;

    public d1(@dl.d CoroutineDispatcher coroutineDispatcher) {
        this.dispatcher = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@dl.d Runnable runnable) {
        this.dispatcher.O(EmptyCoroutineContext.f124694b, runnable);
    }

    @dl.d
    public String toString() {
        return this.dispatcher.toString();
    }
}
