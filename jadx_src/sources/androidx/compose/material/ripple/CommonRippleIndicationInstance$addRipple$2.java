package androidx.compose.material.ripple;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: CommonRipple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
public final class CommonRippleIndicationInstance$addRipple$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ RippleAnimation f8433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ CommonRippleIndicationInstance f8434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.i.b f8435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonRippleIndicationInstance$addRipple$2(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, androidx.compose.foundation.interaction.i.b bVar, kotlin.coroutines.c<? super CommonRippleIndicationInstance$addRipple$2> cVar) {
        super(2, cVar);
        this.f8433c = rippleAnimation;
        this.f8434d = commonRippleIndicationInstance;
        this.f8435e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new CommonRippleIndicationInstance$addRipple$2(this.f8433c, this.f8434d, this.f8435e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((CommonRippleIndicationInstance$addRipple$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8432b;
        try {
            if (i10 == 0) {
                t0.n(obj);
                RippleAnimation rippleAnimation = this.f8433c;
                this.f8432b = 1;
                if (rippleAnimation.f(this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            this.f8434d.ripples.remove(this.f8435e);
            return b2.f124493a;
        } catch (Throwable th2) {
            this.f8434d.ripples.remove(this.f8435e);
            throw th2;
        }
    }
}
