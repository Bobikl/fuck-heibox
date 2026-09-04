package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/foundation/gestures/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SwipeableState$snapInternalToOffset$2 extends SuspendLambda implements yh.p<androidx.compose.foundation.gestures.d, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f11105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f11106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f11107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f11108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$snapInternalToOffset$2(float f10, SwipeableState<T> swipeableState, kotlin.coroutines.c<? super SwipeableState$snapInternalToOffset$2> cVar) {
        super(2, cVar);
        this.f11107d = f10;
        this.f11108e = swipeableState;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.foundation.gestures.d dVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SwipeableState$snapInternalToOffset$2) create(dVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new SwipeableState$snapInternalToOffset$2(this.f11107d, this.f11108e, cVar);
        swipeableState$snapInternalToOffset$2.f11106c = obj;
        return swipeableState$snapInternalToOffset$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f11105b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        ((androidx.compose.foundation.gestures.d) this.f11106c).c(this.f11107d - ((Number) ((SwipeableState) this.f11108e).absoluteOffset.getValue()).floatValue());
        return kotlin.b2.f124493a;
    }
}
