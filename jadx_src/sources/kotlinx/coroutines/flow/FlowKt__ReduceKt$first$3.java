package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {183}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
public final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f129578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f129579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f129580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f129581f;

    FlowKt__ReduceKt$first$3(kotlin.coroutines.c<? super FlowKt__ReduceKt$first$3> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129580e = obj;
        this.f129581f |= Integer.MIN_VALUE;
        return g.u0(null, null, this);
    }
}
