package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.c0;
import kotlin.t0;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class FlowKt__ReduceKt$fold$2<T> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<R> f129600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.q<R, T, kotlin.coroutines.c<? super R>, Object> f129601c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$fold$2(Ref.ObjectRef<R> objectRef, yh.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        this.f129600b = objectRef;
        this.f129601c = qVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @dl.e
    public final Object a(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        c0.e(4);
        new FlowKt__ReduceKt$fold$2$emit$1(this, cVar);
        c0.e(5);
        Ref.ObjectRef<R> objectRef = this.f129600b;
        objectRef.f124891b = (T) this.f129601c.invoke((R) objectRef.f124891b, t10, (kotlin.coroutines.c<? super R>) cVar);
        return b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FlowKt__ReduceKt$fold$2$emit$1 flowKt__ReduceKt$fold$2$emit$1;
        Ref.ObjectRef objectRef;
        if (cVar instanceof FlowKt__ReduceKt$fold$2$emit$1) {
            flowKt__ReduceKt$fold$2$emit$1 = (FlowKt__ReduceKt$fold$2$emit$1) cVar;
            int i10 = flowKt__ReduceKt$fold$2$emit$1.f129605e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$fold$2$emit$1.f129605e = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, cVar);
            }
        } else {
            flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, cVar);
        }
        Object obj = flowKt__ReduceKt$fold$2$emit$1.f129603c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ReduceKt$fold$2$emit$1.f129605e;
        if (i11 == 0) {
            t0.n(obj);
            Ref.ObjectRef objectRef2 = this.f129600b;
            yh.q<R, T, kotlin.coroutines.c<? super R>, Object> qVar = this.f129601c;
            T t11 = objectRef2.f124891b;
            flowKt__ReduceKt$fold$2$emit$1.f129602b = objectRef2;
            flowKt__ReduceKt$fold$2$emit$1.f129605e = 1;
            Object objInvoke = qVar.invoke((R) t11, t10, flowKt__ReduceKt$fold$2$emit$1);
            if (objInvoke == objH) {
                return objH;
            }
            obj = (T) objInvoke;
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$fold$2$emit$1.f129602b;
            t0.n(obj);
        }
        objectRef.f124891b = (T) obj;
        return b2.f124493a;
    }
}
