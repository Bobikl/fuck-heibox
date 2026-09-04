package kotlinx.coroutines.flow;

import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {57}, m = FilterGroup.TYPE_SINGLE, n = {"result"}, s = {"L$0"})
public final class FlowKt__ReduceKt$single$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129623d;

    FlowKt__ReduceKt$single$1(kotlin.coroutines.c<? super FlowKt__ReduceKt$single$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129622c = obj;
        this.f129623d |= Integer.MIN_VALUE;
        return g.H1(null, this);
    }
}
