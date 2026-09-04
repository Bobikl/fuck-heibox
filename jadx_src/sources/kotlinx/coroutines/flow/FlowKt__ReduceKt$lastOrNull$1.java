package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {167}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
public final class FlowKt__ReduceKt$lastOrNull$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129611d;

    FlowKt__ReduceKt$lastOrNull$1(kotlin.coroutines.c<? super FlowKt__ReduceKt$lastOrNull$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129610c = obj;
        this.f129611d |= Integer.MIN_VALUE;
        return g.T0(null, this);
    }
}
