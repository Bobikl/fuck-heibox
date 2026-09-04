package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/h;", "Lkotlinx/coroutines/m1;", "Ljava/lang/Thread;", "i", "Ljava/lang/Thread;", "H0", "()Ljava/lang/Thread;", "thread", "<init>", "(Ljava/lang/Thread;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class h extends m1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Thread thread;

    public h(@dl.d Thread thread) {
        this.thread = thread;
    }

    @Override // kotlinx.coroutines.n1
    @dl.d
    /* JADX INFO: renamed from: H0, reason: from getter */
    protected Thread getThread() {
        return this.thread;
    }
}
