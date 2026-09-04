package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", i = {}, l = {bb.c.b.f30973ub}, m = "invokeSuspend", n = {}, s = {})
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Transition<EnterExitState> f3870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a1<Boolean> f3871d;

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements kotlinx.coroutines.flow.f<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1<Boolean> f3873b;

        a(a1<Boolean> a1Var) {
            this.f3873b = a1Var;
        }

        @dl.e
        public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            this.f3873b.setValue(kotlin.coroutines.jvm.internal.a.a(z10));
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
            return a(bool.booleanValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(Transition<EnterExitState> transition, a1<Boolean> a1Var, kotlin.coroutines.c<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1> cVar) {
        super(2, cVar);
        this.f3870c = transition;
        this.f3871d = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(this.f3870c, this.f3871d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f3869b;
        if (i10 == 0) {
            t0.n(obj);
            final Transition<EnterExitState> transition = this.f3870c;
            kotlinx.coroutines.flow.e eVarV = e2.v(new yh.a<Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    EnterExitState enterExitStateH = transition.h();
                    EnterExitState enterExitState = EnterExitState.Visible;
                    return Boolean.valueOf(enterExitStateH == enterExitState || transition.o() == enterExitState);
                }
            });
            a aVar = new a(this.f3871d);
            this.f3869b = 1;
            if (eVarV.a(aVar, this) == objH) {
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
