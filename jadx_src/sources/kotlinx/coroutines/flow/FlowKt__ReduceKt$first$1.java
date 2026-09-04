package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
public final class FlowKt__ReduceKt$first$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f129574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f129575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f129576e;

    FlowKt__ReduceKt$first$1(kotlin.coroutines.c<? super FlowKt__ReduceKt$first$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129575d = obj;
        this.f129576e |= Integer.MIN_VALUE;
        return g.t0(null, this);
    }
}
