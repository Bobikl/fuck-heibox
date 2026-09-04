package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: Count.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class FlowKt__CountKt$count$4<T> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.p<T, kotlin.coroutines.c<? super Boolean>, Object> f129311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Ref.IntRef f129312c;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__CountKt$count$4(yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, Ref.IntRef intRef) {
        this.f129311b = pVar;
        this.f129312c = intRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FlowKt__CountKt$count$4$emit$1 flowKt__CountKt$count$4$emit$1;
        FlowKt__CountKt$count$4<T> flowKt__CountKt$count$4;
        if (cVar instanceof FlowKt__CountKt$count$4$emit$1) {
            flowKt__CountKt$count$4$emit$1 = (FlowKt__CountKt$count$4$emit$1) cVar;
            int i10 = flowKt__CountKt$count$4$emit$1.f129316e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$4$emit$1.f129316e = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, cVar);
            }
        } else {
            flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, cVar);
        }
        Object objInvoke = flowKt__CountKt$count$4$emit$1.f129314c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__CountKt$count$4$emit$1.f129316e;
        if (i11 == 0) {
            t0.n(objInvoke);
            yh.p<T, kotlin.coroutines.c<? super Boolean>, Object> pVar = this.f129311b;
            flowKt__CountKt$count$4$emit$1.f129313b = this;
            flowKt__CountKt$count$4$emit$1.f129316e = 1;
            objInvoke = pVar.invoke(t10, flowKt__CountKt$count$4$emit$1);
            if (objInvoke == objH) {
                return objH;
            }
            flowKt__CountKt$count$4 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__CountKt$count$4 = (FlowKt__CountKt$count$4) flowKt__CountKt$count$4$emit$1.f129313b;
            t0.n(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            flowKt__CountKt$count$4.f129312c.f124889b++;
        }
        return b2.f124493a;
    }
}
