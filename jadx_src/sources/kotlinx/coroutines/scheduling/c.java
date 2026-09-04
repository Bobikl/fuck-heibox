package kotlinx.coroutines.scheduling;

import kotlin.Metadata;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/c;", "Lkotlinx/coroutines/scheduling/h;", "Lkotlin/b2;", "x0", "()V", "close", "", "toString", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class c extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final c f130358j = new c();

    private c() {
        super(n.f130382c, n.f130383d, n.f130384e, n.f130380a);
    }

    @Override // kotlinx.coroutines.scheduling.h, kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    public String toString() {
        return "Dispatchers.Default";
    }

    public final void x0() {
        super.close();
    }
}
