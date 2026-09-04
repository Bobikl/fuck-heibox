package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.j, reason: from toString */
/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/j;", "Lkotlinx/coroutines/q0;", "", "toString", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "j0", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", com.umeng.analytics.pro.d.R, "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class CoroutineScope implements kotlinx.coroutines.q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineContext coroutineContext;

    public CoroutineScope(@dl.d CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
    }

    @Override // kotlinx.coroutines.q0
    @dl.d
    /* JADX INFO: renamed from: j0, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @dl.d
    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
