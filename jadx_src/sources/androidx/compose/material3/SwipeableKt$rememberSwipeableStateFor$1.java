package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SwipeableKt$rememberSwipeableStateFor$1", f = "Swipeable.kt", i = {}, l = {512}, m = "invokeSuspend", n = {}, s = {})
public final class SwipeableKt$rememberSwipeableStateFor$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f11015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ T f11016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f11017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableKt$rememberSwipeableStateFor$1(T t10, SwipeableState<T> swipeableState, kotlin.coroutines.c<? super SwipeableKt$rememberSwipeableStateFor$1> cVar) {
        super(2, cVar);
        this.f11016c = t10;
        this.f11017d = swipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new SwipeableKt$rememberSwipeableStateFor$1(this.f11016c, this.f11017d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SwipeableKt$rememberSwipeableStateFor$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f11015b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            if (!kotlin.jvm.internal.f0.g(this.f11016c, this.f11017d.p())) {
                SwipeableState<T> swipeableState = this.f11017d;
                T t10 = this.f11016c;
                this.f11015b = 1;
                if (SwipeableState.k(swipeableState, t10, null, this, 2, null) == objH) {
                    return objH;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return kotlin.b2.f124493a;
    }
}
