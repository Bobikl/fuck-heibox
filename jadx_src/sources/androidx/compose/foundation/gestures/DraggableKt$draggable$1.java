package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lb1/f;", "it", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DraggableKt$draggable$1 extends SuspendLambda implements yh.q<q0, b1.f, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5410b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DraggableKt$draggable$1(kotlin.coroutines.c<? super DraggableKt$draggable$1> cVar) {
        super(3, cVar);
    }

    @dl.e
    public final Object a(@dl.d q0 q0Var, long j10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return new DraggableKt$draggable$1(cVar).invokeSuspend(b2.f124493a);
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, b1.f fVar, kotlin.coroutines.c<? super b2> cVar) {
        return a(q0Var, fVar.getF30368a(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f5410b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        return b2.f124493a;
    }
}
