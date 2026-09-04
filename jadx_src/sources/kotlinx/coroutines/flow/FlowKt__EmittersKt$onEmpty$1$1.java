package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "it", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class FlowKt__EmittersKt$onEmpty$1$1<T> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Ref.BooleanRef f129388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f<T> f129389c;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__EmittersKt$onEmpty$1$1(Ref.BooleanRef booleanRef, f<? super T> fVar) {
        this.f129388b = booleanRef;
        this.f129389c = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        FlowKt__EmittersKt$onEmpty$1$1$emit$1 flowKt__EmittersKt$onEmpty$1$1$emit$1;
        if (cVar instanceof FlowKt__EmittersKt$onEmpty$1$1$emit$1) {
            flowKt__EmittersKt$onEmpty$1$1$emit$1 = (FlowKt__EmittersKt$onEmpty$1$1$emit$1) cVar;
            int i10 = flowKt__EmittersKt$onEmpty$1$1$emit$1.f129392d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$onEmpty$1$1$emit$1.f129392d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$onEmpty$1$1$emit$1 = new FlowKt__EmittersKt$onEmpty$1$1$emit$1(this, cVar);
            }
        } else {
            flowKt__EmittersKt$onEmpty$1$1$emit$1 = new FlowKt__EmittersKt$onEmpty$1$1$emit$1(this, cVar);
        }
        Object obj = flowKt__EmittersKt$onEmpty$1$1$emit$1.f129390b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__EmittersKt$onEmpty$1$1$emit$1.f129392d;
        if (i11 == 0) {
            t0.n(obj);
            this.f129388b.f124884b = false;
            f<T> fVar = this.f129389c;
            flowKt__EmittersKt$onEmpty$1$1$emit$1.f129392d = 1;
            if (fVar.emit(t10, flowKt__EmittersKt$onEmpty$1$1$emit$1) == objH) {
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
