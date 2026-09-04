package androidx.paging;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\b\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00158F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/paging/b;", "", "Key", "Value", "R", "Lkotlin/Function1;", "Landroidx/paging/AccessorState;", "block", "b", "(Lyh/l;)Ljava/lang/Object;", "Ljava/util/concurrent/locks/ReentrantLock;", ak.av, "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Lkotlinx/coroutines/flow/j;", "Landroidx/paging/x;", "Lkotlinx/coroutines/flow/j;", "_loadStates", ak.aF, "Landroidx/paging/AccessorState;", "internalState", "Lkotlinx/coroutines/flow/u;", "()Lkotlinx/coroutines/flow/u;", "loadStates", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class b<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock lock = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.flow.j<LoadStates> _loadStates = kotlinx.coroutines.flow.v.a(LoadStates.INSTANCE.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AccessorState<Key, Value> internalState = new AccessorState<>();

    @dl.d
    public final kotlinx.coroutines.flow.u<LoadStates> a() {
        return this._loadStates;
    }

    public final <R> R b(@dl.d yh.l<? super AccessorState<Key, Value>, ? extends R> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            R rInvoke = block.invoke(this.internalState);
            this._loadStates.setValue(this.internalState.e());
            return rInvoke;
        } finally {
            reentrantLock.unlock();
        }
    }
}
