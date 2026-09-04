package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", i = {}, l = {419}, m = "invokeSuspend", n = {}, s = {})
public final class DefaultDraggableState$drag$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ DefaultDraggableState f5138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutatePriority f5139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p<d, kotlin.coroutines.c<? super b2>, Object> f5140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DefaultDraggableState$drag$2(DefaultDraggableState defaultDraggableState, MutatePriority mutatePriority, yh.p<? super d, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super DefaultDraggableState$drag$2> cVar) {
        super(2, cVar);
        this.f5138c = defaultDraggableState;
        this.f5139d = mutatePriority;
        this.f5140e = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new DefaultDraggableState$drag$2(this.f5138c, this.f5139d, this.f5140e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((DefaultDraggableState$drag$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5137b;
        if (i10 == 0) {
            t0.n(obj);
            MutatorMutex mutatorMutex = this.f5138c.scrollMutex;
            d dVar = this.f5138c.dragScope;
            MutatePriority mutatePriority = this.f5139d;
            yh.p<d, kotlin.coroutines.c<? super b2>, Object> pVar = this.f5140e;
            this.f5137b = 1;
            if (mutatorMutex.f(dVar, mutatePriority, pVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
