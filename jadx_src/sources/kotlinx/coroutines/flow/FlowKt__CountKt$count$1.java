package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Count.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {18}, m = "count", n = {"i"}, s = {"L$0"})
public final class FlowKt__CountKt$count$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129307d;

    FlowKt__CountKt$count$1(kotlin.coroutines.c<? super FlowKt__CountKt$count$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129306c = obj;
        this.f129307d |= Integer.MIN_VALUE;
        return g.Y(null, this);
    }
}
