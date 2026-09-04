package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/g1;", "Lkotlinx/coroutines/h1;", "Lkotlin/b2;", "dispose", "", "toString", "Ljava/util/concurrent/Future;", "b", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class g1 implements h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Future<?> future;

    public g1(@dl.d Future<?> future) {
        this.future = future;
    }

    @Override // kotlinx.coroutines.h1
    public void dispose() {
        this.future.cancel(false);
    }

    @dl.d
    public String toString() {
        return "DisposableFutureHandle[" + this.future + ']';
    }
}
