package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class FlowKt__TransformKt$runningFold$1$1<T> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<R> f129730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.q<R, T, kotlin.coroutines.c<? super R>, Object> f129731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f<R> f129732d;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningFold$1$1(Ref.ObjectRef<R> objectRef, yh.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, f<? super R> fVar) {
        this.f129730b = objectRef;
        this.f129731c = qVar;
        this.f129732d = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1;
        FlowKt__TransformKt$runningFold$1$1<T> flowKt__TransformKt$runningFold$1$1;
        Ref.ObjectRef objectRef;
        if (cVar instanceof FlowKt__TransformKt$runningFold$1$1$emit$1) {
            flowKt__TransformKt$runningFold$1$1$emit$1 = (FlowKt__TransformKt$runningFold$1$1$emit$1) cVar;
            int i10 = flowKt__TransformKt$runningFold$1$1$emit$1.f129737f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningFold$1$1$emit$1.f129737f = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$runningFold$1$1$emit$1 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, cVar);
            }
        } else {
            flowKt__TransformKt$runningFold$1$1$emit$1 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, cVar);
        }
        Object obj = flowKt__TransformKt$runningFold$1$1$emit$1.f129735d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__TransformKt$runningFold$1$1$emit$1.f129737f;
        if (i11 != 0) {
            if (i11 == 1) {
                objectRef = (Ref.ObjectRef) flowKt__TransformKt$runningFold$1$1$emit$1.f129734c;
                flowKt__TransformKt$runningFold$1$1 = (FlowKt__TransformKt$runningFold$1$1) flowKt__TransformKt$runningFold$1$1$emit$1.f129733b;
                t0.n(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        Ref.ObjectRef objectRef2 = this.f129730b;
        yh.q<R, T, kotlin.coroutines.c<? super R>, Object> qVar = this.f129731c;
        T t11 = objectRef2.f124891b;
        flowKt__TransformKt$runningFold$1$1$emit$1.f129733b = this;
        flowKt__TransformKt$runningFold$1$1$emit$1.f129734c = objectRef2;
        flowKt__TransformKt$runningFold$1$1$emit$1.f129737f = 1;
        Object objInvoke = qVar.invoke((R) t11, t10, flowKt__TransformKt$runningFold$1$1$emit$1);
        if (objInvoke == objH) {
            return objH;
        }
        flowKt__TransformKt$runningFold$1$1 = this;
        obj = (T) objInvoke;
        objectRef = objectRef2;
        objectRef.f124891b = (T) obj;
        f<R> fVar = flowKt__TransformKt$runningFold$1$1.f129732d;
        T t12 = flowKt__TransformKt$runningFold$1$1.f129730b.f124891b;
        flowKt__TransformKt$runningFold$1$1$emit$1.f129733b = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.f129734c = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.f129737f = 2;
        if (fVar.emit((R) t12, flowKt__TransformKt$runningFold$1$1$emit$1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
