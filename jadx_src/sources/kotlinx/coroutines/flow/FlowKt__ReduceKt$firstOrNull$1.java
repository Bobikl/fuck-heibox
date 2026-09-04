package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
public final class FlowKt__ReduceKt$firstOrNull$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f129590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f129591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f129592e;

    FlowKt__ReduceKt$firstOrNull$1(kotlin.coroutines.c<? super FlowKt__ReduceKt$firstOrNull$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129591d = obj;
        this.f129592e |= Integer.MIN_VALUE;
        return g.v0(null, this);
    }
}
