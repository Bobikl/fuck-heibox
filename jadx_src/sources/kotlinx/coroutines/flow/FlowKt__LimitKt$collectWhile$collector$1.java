package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.c0;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__LimitKt$collectWhile$collector$1<T> implements f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.p<T, kotlin.coroutines.c<? super Boolean>, Object> f129459b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$collectWhile$collector$1(yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        this.f129459b = pVar;
    }

    @dl.e
    public Object a(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        c0.e(4);
        new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, cVar);
        c0.e(5);
        if (((Boolean) this.f129459b.invoke(t10, cVar)).booleanValue()) {
            return b2.f124493a;
        }
        throw new AbortFlowException(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
        FlowKt__LimitKt$collectWhile$collector$1<T> flowKt__LimitKt$collectWhile$collector$1;
        if (cVar instanceof FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = (FlowKt__LimitKt$collectWhile$collector$1$emit$1) cVar;
            int i10 = flowKt__LimitKt$collectWhile$collector$1$emit$1.f129463e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1.f129463e = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, cVar);
            }
        } else {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, cVar);
        }
        Object objInvoke = flowKt__LimitKt$collectWhile$collector$1$emit$1.f129461c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__LimitKt$collectWhile$collector$1$emit$1.f129463e;
        if (i11 == 0) {
            t0.n(objInvoke);
            yh.p<T, kotlin.coroutines.c<? super Boolean>, Object> pVar = this.f129459b;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.f129460b = this;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.f129463e = 1;
            objInvoke = pVar.invoke(t10, flowKt__LimitKt$collectWhile$collector$1$emit$1);
            if (objInvoke == objH) {
                return objH;
            }
            flowKt__LimitKt$collectWhile$collector$1 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__LimitKt$collectWhile$collector$1 = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$collector$1$emit$1.f129460b;
            t0.n(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return b2.f124493a;
        }
        throw new AbortFlowException(flowKt__LimitKt$collectWhile$collector$1);
    }
}
