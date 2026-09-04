package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
public final class SizeAnimationModifier$animateTo$data$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f4075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SizeAnimationModifier.AnimData f4076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f4077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ SizeAnimationModifier f4078e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SizeAnimationModifier$animateTo$data$1$1(SizeAnimationModifier.AnimData aVar, long j10, SizeAnimationModifier sizeAnimationModifier, kotlin.coroutines.c<? super SizeAnimationModifier$animateTo$data$1$1> cVar) {
        super(2, cVar);
        this.f4076c = aVar;
        this.f4077d = j10;
        this.f4078e = sizeAnimationModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new SizeAnimationModifier$animateTo$data$1$1(this.f4076c, this.f4077d, this.f4078e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SizeAnimationModifier$animateTo$data$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        yh.p<s1.r, s1.r, b2> pVarE;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f4075b;
        if (i10 == 0) {
            t0.n(obj);
            Animatable<s1.r, androidx.compose.animation.core.m> animatableE = this.f4076c.e();
            s1.r rVarB = s1.r.b(this.f4077d);
            androidx.compose.animation.core.h<s1.r> hVarD = this.f4078e.d();
            this.f4075b = 1;
            obj = Animatable.i(animatableE, rVarB, hVarD, null, null, this, 12, null);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.Finished && (pVarE = this.f4078e.e()) != 0) {
            pVarE.invoke(s1.r.b(this.f4076c.f()), animationResult.b().getValue());
        }
        return b2.f124493a;
    }
}
