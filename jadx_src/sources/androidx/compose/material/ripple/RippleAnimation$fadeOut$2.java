package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.d0;
import androidx.compose.animation.core.e1;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: RippleAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/d2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RippleAnimation$fadeOut$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super d2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f8471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ RippleAnimation f8472d;

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: RippleAnimation.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RippleAnimation f8474c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RippleAnimation rippleAnimation, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f8474c = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f8474c, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f8473b;
            if (i10 == 0) {
                t0.n(obj);
                Animatable animatable = this.f8474c.animatedAlpha;
                Float fE = kotlin.coroutines.jvm.internal.a.e(0.0f);
                e1 e1VarQ = androidx.compose.animation.core.i.q(150, 0, d0.c(), 2, null);
                this.f8473b = 1;
                if (Animatable.i(animatable, fE, e1VarQ, null, null, this, 12, null) == objH) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RippleAnimation$fadeOut$2(RippleAnimation rippleAnimation, kotlin.coroutines.c<? super RippleAnimation$fadeOut$2> cVar) {
        super(2, cVar);
        this.f8472d = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        RippleAnimation$fadeOut$2 rippleAnimation$fadeOut$2 = new RippleAnimation$fadeOut$2(this.f8472d, cVar);
        rippleAnimation$fadeOut$2.f8471c = obj;
        return rippleAnimation$fadeOut$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super d2> cVar) {
        return ((RippleAnimation$fadeOut$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f8470b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        return kotlinx.coroutines.k.f((q0) this.f8471c, null, null, new AnonymousClass1(this.f8472d, null), 3, null);
    }
}
