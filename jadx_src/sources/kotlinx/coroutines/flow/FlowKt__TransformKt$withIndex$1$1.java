package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.h0;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class FlowKt__TransformKt$withIndex$1$1<T> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f<h0<? extends T>> f129746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Ref.IntRef f129747c;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$withIndex$1$1(f<? super h0<? extends T>> fVar, Ref.IntRef intRef) {
        this.f129746b = fVar;
        this.f129747c = intRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1;
        if (cVar instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) {
            flowKt__TransformKt$withIndex$1$1$emit$1 = (FlowKt__TransformKt$withIndex$1$1$emit$1) cVar;
            int i10 = flowKt__TransformKt$withIndex$1$1$emit$1.f129750d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$withIndex$1$1$emit$1.f129750d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, cVar);
            }
        } else {
            flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, cVar);
        }
        Object obj = flowKt__TransformKt$withIndex$1$1$emit$1.f129748b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__TransformKt$withIndex$1$1$emit$1.f129750d;
        if (i11 == 0) {
            t0.n(obj);
            f<h0<? extends T>> fVar = this.f129746b;
            Ref.IntRef intRef = this.f129747c;
            int i12 = intRef.f124889b;
            intRef.f124889b = i12 + 1;
            if (i12 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            h0<? extends T> h0Var = new h0<>(i12, t10);
            flowKt__TransformKt$withIndex$1$1$emit$1.f129750d = 1;
            if (fVar.emit(h0Var, flowKt__TransformKt$withIndex$1$1$emit$1) == objH) {
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
