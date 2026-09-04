package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {44}, m = "fold", n = {"accumulator"}, s = {"L$0"})
public final class FlowKt__ReduceKt$fold$1<T, R> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129599d;

    FlowKt__ReduceKt$fold$1(kotlin.coroutines.c<? super FlowKt__ReduceKt$fold$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129598c = obj;
        this.f129599d |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.e(null, null, null, this);
    }
}
