package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/k;", "Lb1/f;", "it", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5598b;

    TapGestureDetectorKt$NoPressGesture$1(kotlin.coroutines.c<? super TapGestureDetectorKt$NoPressGesture$1> cVar) {
        super(3, cVar);
    }

    @dl.e
    public final Object a(@dl.d k kVar, long j10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return new TapGestureDetectorKt$NoPressGesture$1(cVar).invokeSuspend(b2.f124493a);
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ Object invoke(k kVar, b1.f fVar, kotlin.coroutines.c<? super b2> cVar) {
        return a(kVar, fVar.getF30368a(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f5598b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        return b2.f124493a;
    }
}
