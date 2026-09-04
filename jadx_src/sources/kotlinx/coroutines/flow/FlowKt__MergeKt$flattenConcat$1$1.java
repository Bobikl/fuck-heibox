package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.t0;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "value", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
public final class FlowKt__MergeKt$flattenConcat$1$1<T> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f<T> f129538b;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__MergeKt$flattenConcat$1$1(f<? super T> fVar) {
        this.f129538b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(@dl.d e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FlowKt__MergeKt$flattenConcat$1$1$emit$1 flowKt__MergeKt$flattenConcat$1$1$emit$1;
        if (cVar instanceof FlowKt__MergeKt$flattenConcat$1$1$emit$1) {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = (FlowKt__MergeKt$flattenConcat$1$1$emit$1) cVar;
            int i10 = flowKt__MergeKt$flattenConcat$1$1$emit$1.f129541d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__MergeKt$flattenConcat$1$1$emit$1.f129541d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__MergeKt$flattenConcat$1$1$emit$1 = new FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, cVar);
            }
        } else {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = new FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, cVar);
        }
        Object obj = flowKt__MergeKt$flattenConcat$1$1$emit$1.f129539b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__MergeKt$flattenConcat$1$1$emit$1.f129541d;
        if (i11 == 0) {
            t0.n(obj);
            f<T> fVar = this.f129538b;
            flowKt__MergeKt$flattenConcat$1$1$emit$1.f129541d = 1;
            if (g.m0(fVar, eVar, flowKt__MergeKt$flattenConcat$1$1$emit$1) == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
