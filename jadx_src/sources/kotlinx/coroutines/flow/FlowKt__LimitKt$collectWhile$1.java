package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {136}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
public final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129458d;

    FlowKt__LimitKt$collectWhile$1(kotlin.coroutines.c<? super FlowKt__LimitKt$collectWhile$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129457c = obj;
        this.f129458d |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.b(null, null, this);
    }
}
