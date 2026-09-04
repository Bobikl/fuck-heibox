package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.f0;
import androidx.compose.animation.core.z0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: LazyGridItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1", f = "LazyGridItemPlacementAnimator.kt", i = {}, l = {bb.c.b.f31033x5}, m = "invokeSuspend", n = {}, s = {})
public final class LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d0 f6738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f0<s1.n> f6739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(d0 d0Var, f0<s1.n> f0Var, kotlin.coroutines.c<? super LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1> cVar) {
        super(2, cVar);
        this.f6738c = d0Var;
        this.f6739d = f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(this.f6738c, this.f6739d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        androidx.compose.animation.core.h hVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f6737b;
        try {
            if (i10 == 0) {
                t0.n(obj);
                if (this.f6738c.a().x()) {
                    f0<s1.n> f0Var = this.f6739d;
                    hVar = f0Var instanceof z0 ? (z0) f0Var : i.f6915a;
                } else {
                    hVar = this.f6739d;
                }
                androidx.compose.animation.core.h hVar2 = hVar;
                Animatable<s1.n, androidx.compose.animation.core.m> animatableA = this.f6738c.a();
                s1.n nVarB = s1.n.b(this.f6738c.getTargetOffset());
                this.f6737b = 1;
                if (Animatable.i(animatableA, nVarB, hVar2, null, null, this, 12, null) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            this.f6738c.e(false);
        } catch (CancellationException unused) {
        }
        return b2.f124493a;
    }
}
