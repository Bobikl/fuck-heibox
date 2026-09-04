package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {73}, m = "emitAbort$FlowKt__LimitKt", n = {"$this$emitAbort"}, s = {"L$0"})
public final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129480d;

    FlowKt__LimitKt$emitAbort$1(kotlin.coroutines.c<? super FlowKt__LimitKt$emitAbort$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129479c = obj;
        this.f129480d |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.f(null, null, this);
    }
}
