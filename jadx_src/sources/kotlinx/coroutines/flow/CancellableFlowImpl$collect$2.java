package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.t0;
import kotlinx.coroutines.g2;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "it", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class CancellableFlowImpl$collect$2<T> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f<T> f129201b;

    /* JADX WARN: Multi-variable type inference failed */
    CancellableFlowImpl$collect$2(f<? super T> fVar) {
        this.f129201b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        CancellableFlowImpl$collect$2$emit$1 cancellableFlowImpl$collect$2$emit$1;
        if (cVar instanceof CancellableFlowImpl$collect$2$emit$1) {
            cancellableFlowImpl$collect$2$emit$1 = (CancellableFlowImpl$collect$2$emit$1) cVar;
            int i10 = cancellableFlowImpl$collect$2$emit$1.f129204d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cancellableFlowImpl$collect$2$emit$1.f129204d = i10 - Integer.MIN_VALUE;
            } else {
                cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, cVar);
            }
        } else {
            cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, cVar);
        }
        Object obj = cancellableFlowImpl$collect$2$emit$1.f129202b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = cancellableFlowImpl$collect$2$emit$1.f129204d;
        if (i11 == 0) {
            t0.n(obj);
            g2.z(cancellableFlowImpl$collect$2$emit$1.getContext());
            f<T> fVar = this.f129201b;
            cancellableFlowImpl$collect$2$emit$1.f129204d = 1;
            if (fVar.emit(t10, cancellableFlowImpl$collect$2$emit$1) == objH) {
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
