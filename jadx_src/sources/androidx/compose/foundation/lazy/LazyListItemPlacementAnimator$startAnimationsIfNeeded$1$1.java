package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.f0;
import androidx.compose.animation.core.z0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: LazyListItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1", f = "LazyListItemPlacementAnimator.kt", i = {}, l = {400}, m = "invokeSuspend", n = {}, s = {})
public final class LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c0 f6509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f0<s1.n> f6510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(c0 c0Var, f0<s1.n> f0Var, kotlin.coroutines.c<? super LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1> cVar) {
        super(2, cVar);
        this.f6509c = c0Var;
        this.f6510d = f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(this.f6509c, this.f6510d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        androidx.compose.animation.core.h hVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f6508b;
        try {
            if (i10 == 0) {
                t0.n(obj);
                if (this.f6509c.a().x()) {
                    f0<s1.n> f0Var = this.f6510d;
                    hVar = f0Var instanceof z0 ? (z0) f0Var : n.f7166a;
                } else {
                    hVar = this.f6510d;
                }
                androidx.compose.animation.core.h hVar2 = hVar;
                Animatable<s1.n, androidx.compose.animation.core.m> animatableA = this.f6509c.a();
                s1.n nVarB = s1.n.b(this.f6509c.getTargetOffset());
                this.f6508b = 1;
                if (Animatable.i(animatableA, nVarB, hVar2, null, null, this, 12, null) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            this.f6509c.e(false);
        } catch (CancellationException unused) {
        }
        return b2.f124493a;
    }
}
