package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {bb.c.b.f30717j4, bb.c.b.f30878q4, bb.c.b.f30944t4}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
public final class SharedFlowImpl$collect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f129887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f129888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f129889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f129890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ SharedFlowImpl<T> f129891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f129892h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedFlowImpl$collect$1(SharedFlowImpl<T> sharedFlowImpl, kotlin.coroutines.c<? super SharedFlowImpl$collect$1> cVar) {
        super(cVar);
        this.f129891g = sharedFlowImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129890f = obj;
        this.f129892h |= Integer.MIN_VALUE;
        return SharedFlowImpl.F(this.f129891g, null, this);
    }
}
