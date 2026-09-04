package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderDraggableState$drag$2", f = "Slider.kt", i = {}, l = {bb.c.b.ao}, m = "invokeSuspend", n = {}, s = {})
public final class SliderDraggableState$drag$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SliderDraggableState f10520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutatePriority f10521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p<androidx.compose.foundation.gestures.d, kotlin.coroutines.c<? super kotlin.b2>, Object> f10522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderDraggableState$drag$2(SliderDraggableState sliderDraggableState, MutatePriority mutatePriority, yh.p<? super androidx.compose.foundation.gestures.d, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> pVar, kotlin.coroutines.c<? super SliderDraggableState$drag$2> cVar) {
        super(2, cVar);
        this.f10520c = sliderDraggableState;
        this.f10521d = mutatePriority;
        this.f10522e = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new SliderDraggableState$drag$2(this.f10520c, this.f10521d, this.f10522e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SliderDraggableState$drag$2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f10519b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            this.f10520c.h(true);
            MutatorMutex mutatorMutex = this.f10520c.scrollMutex;
            androidx.compose.foundation.gestures.d dVar = this.f10520c.dragScope;
            MutatePriority mutatePriority = this.f10521d;
            yh.p<androidx.compose.foundation.gestures.d, kotlin.coroutines.c<? super kotlin.b2>, Object> pVar = this.f10522e;
            this.f10519b = 1;
            if (mutatorMutex.f(dVar, mutatePriority, pVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        this.f10520c.h(false);
        return kotlin.b2.f124493a;
    }
}
