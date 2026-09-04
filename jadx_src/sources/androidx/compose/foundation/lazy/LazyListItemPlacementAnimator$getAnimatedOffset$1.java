package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: LazyListItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$getAnimatedOffset$1", f = "LazyListItemPlacementAnimator.kt", i = {}, l = {bb.c.b.f30646g2}, m = "invokeSuspend", n = {}, s = {})
public final class LazyListItemPlacementAnimator$getAnimatedOffset$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c0 f6507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListItemPlacementAnimator$getAnimatedOffset$1(c0 c0Var, kotlin.coroutines.c<? super LazyListItemPlacementAnimator$getAnimatedOffset$1> cVar) {
        super(2, cVar);
        this.f6507c = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new LazyListItemPlacementAnimator$getAnimatedOffset$1(this.f6507c, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((LazyListItemPlacementAnimator$getAnimatedOffset$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f6506b;
        if (i10 == 0) {
            t0.n(obj);
            Animatable<s1.n, androidx.compose.animation.core.m> animatableA = this.f6507c.a();
            s1.n nVarB = s1.n.b(this.f6507c.getTargetOffset());
            this.f6506b = 1;
            if (animatableA.B(nVarB, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        this.f6507c.e(false);
        return b2.f124493a;
    }
}
