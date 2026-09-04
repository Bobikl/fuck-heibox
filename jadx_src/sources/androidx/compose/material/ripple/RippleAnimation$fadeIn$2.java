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
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RippleAnimation$fadeIn$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super d2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f8462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ RippleAnimation f8463d;

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: RippleAnimation.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RippleAnimation f8465c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RippleAnimation rippleAnimation, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f8465c = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f8465c, cVar);
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
            int i10 = this.f8464b;
            if (i10 == 0) {
                t0.n(obj);
                Animatable animatable = this.f8465c.animatedAlpha;
                Float fE = kotlin.coroutines.jvm.internal.a.e(1.0f);
                e1 e1VarQ = androidx.compose.animation.core.i.q(75, 0, d0.c(), 2, null);
                this.f8464b = 1;
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

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: RippleAnimation.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RippleAnimation f8467c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(RippleAnimation rippleAnimation, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f8467c = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.f8467c, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f8466b;
            if (i10 == 0) {
                t0.n(obj);
                Animatable animatable = this.f8467c.animatedRadiusPercent;
                Float fE = kotlin.coroutines.jvm.internal.a.e(1.0f);
                e1 e1VarQ = androidx.compose.animation.core.i.q(bb.c.b.f30897r1, 0, d0.b(), 2, null);
                this.f8466b = 1;
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

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: RippleAnimation.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RippleAnimation f8469c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(RippleAnimation rippleAnimation, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.f8469c = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass3(this.f8469c, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f8468b;
            if (i10 == 0) {
                t0.n(obj);
                Animatable animatable = this.f8469c.animatedCenterPercent;
                Float fE = kotlin.coroutines.jvm.internal.a.e(1.0f);
                e1 e1VarQ = androidx.compose.animation.core.i.q(bb.c.b.f30897r1, 0, d0.c(), 2, null);
                this.f8468b = 1;
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
    RippleAnimation$fadeIn$2(RippleAnimation rippleAnimation, kotlin.coroutines.c<? super RippleAnimation$fadeIn$2> cVar) {
        super(2, cVar);
        this.f8463d = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        RippleAnimation$fadeIn$2 rippleAnimation$fadeIn$2 = new RippleAnimation$fadeIn$2(this.f8463d, cVar);
        rippleAnimation$fadeIn$2.f8462c = obj;
        return rippleAnimation$fadeIn$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super d2> cVar) {
        return ((RippleAnimation$fadeIn$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f8461b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        q0 q0Var = (q0) this.f8462c;
        kotlinx.coroutines.k.f(q0Var, null, null, new AnonymousClass1(this.f8463d, null), 3, null);
        kotlinx.coroutines.k.f(q0Var, null, null, new AnonymousClass2(this.f8463d, null), 3, null);
        return kotlinx.coroutines.k.f(q0Var, null, null, new AnonymousClass3(this.f8463d, null), 3, null);
    }
}
