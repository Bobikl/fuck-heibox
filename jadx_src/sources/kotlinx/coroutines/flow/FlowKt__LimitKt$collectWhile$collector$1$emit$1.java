package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {130}, m = "emit", n = {"this"}, s = {"L$0"})
public final class FlowKt__LimitKt$collectWhile$collector$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ FlowKt__LimitKt$collectWhile$collector$1 f129462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f129463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$collectWhile$collector$1$emit$1(FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1, kotlin.coroutines.c<? super FlowKt__LimitKt$collectWhile$collector$1$emit$1> cVar) {
        super(cVar);
        this.f129462d = flowKt__LimitKt$collectWhile$collector$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129461c = obj;
        this.f129463e |= Integer.MIN_VALUE;
        return this.f129462d.emit(null, this);
    }
}
