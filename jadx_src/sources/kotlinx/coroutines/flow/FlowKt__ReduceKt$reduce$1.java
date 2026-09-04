package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {22}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
public final class FlowKt__ReduceKt$reduce$1<S, T extends S> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129614d;

    FlowKt__ReduceKt$reduce$1(kotlin.coroutines.c<? super FlowKt__ReduceKt$reduce$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129613c = obj;
        this.f129614d |= Integer.MIN_VALUE;
        return g.s1(null, null, this);
    }
}
