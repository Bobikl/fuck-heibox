package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes5.dex */
@z0
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/v1;", "Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/CoroutineContext;", "j0", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class v1 implements q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final v1 f130503b = new v1();

    private v1() {
    }

    @Override // kotlinx.coroutines.q0
    @dl.d
    /* JADX INFO: renamed from: j0 */
    public CoroutineContext getCoroutineContext() {
        return EmptyCoroutineContext.f124694b;
    }
}
