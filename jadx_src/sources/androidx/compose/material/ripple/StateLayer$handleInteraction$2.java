package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", i = {}, l = {bb.c.b.K2}, m = "invokeSuspend", n = {}, s = {})
public final class StateLayer$handleInteraction$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ StateLayer f8505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.core.h<Float> f8506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StateLayer$handleInteraction$2(StateLayer stateLayer, androidx.compose.animation.core.h<Float> hVar, kotlin.coroutines.c<? super StateLayer$handleInteraction$2> cVar) {
        super(2, cVar);
        this.f8505c = stateLayer;
        this.f8506d = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new StateLayer$handleInteraction$2(this.f8505c, this.f8506d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((StateLayer$handleInteraction$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8504b;
        if (i10 == 0) {
            t0.n(obj);
            Animatable animatable = this.f8505c.animatedAlpha;
            Float fE = kotlin.coroutines.jvm.internal.a.e(0.0f);
            androidx.compose.animation.core.h<Float> hVar = this.f8506d;
            this.f8504b = 1;
            if (Animatable.i(animatable, fE, hVar, null, null, this, 12, null) == objH) {
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
