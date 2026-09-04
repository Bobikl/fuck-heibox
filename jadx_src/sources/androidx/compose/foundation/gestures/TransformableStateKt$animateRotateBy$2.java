package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/r;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
public final class TransformableStateKt$animateRotateBy$2 extends SuspendLambda implements yh.p<r, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f5753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f5754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.core.h<Float> f5755f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animateRotateBy$2(Ref.FloatRef floatRef, float f10, androidx.compose.animation.core.h<Float> hVar, kotlin.coroutines.c<? super TransformableStateKt$animateRotateBy$2> cVar) {
        super(2, cVar);
        this.f5753d = floatRef;
        this.f5754e = f10;
        this.f5755f = hVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d r rVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TransformableStateKt$animateRotateBy$2) create(rVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TransformableStateKt$animateRotateBy$2 transformableStateKt$animateRotateBy$2 = new TransformableStateKt$animateRotateBy$2(this.f5753d, this.f5754e, this.f5755f, cVar);
        transformableStateKt$animateRotateBy$2.f5752c = obj;
        return transformableStateKt$animateRotateBy$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5751b;
        if (i10 == 0) {
            t0.n(obj);
            final r rVar = (r) this.f5752c;
            AnimationState animationStateC = androidx.compose.animation.core.k.c(this.f5753d.f124888b, 0.0f, 0L, 0L, false, 30, null);
            Float fE = kotlin.coroutines.jvm.internal.a.e(this.f5754e);
            androidx.compose.animation.core.h<Float> hVar = this.f5755f;
            final Ref.FloatRef floatRef = this.f5753d;
            yh.l<androidx.compose.animation.core.g<Float, androidx.compose.animation.core.l>, b2> lVar = new yh.l<androidx.compose.animation.core.g<Float, androidx.compose.animation.core.l>, b2>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.animation.core.g<Float, androidx.compose.animation.core.l> animateTo) {
                    f0.p(animateTo, "$this$animateTo");
                    q.a(rVar, 0.0f, 0L, animateTo.g().floatValue() - floatRef.f124888b, 3, null);
                    floatRef.f124888b = animateTo.g().floatValue();
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.animation.core.g<Float, androidx.compose.animation.core.l> gVar) {
                    a(gVar);
                    return b2.f124493a;
                }
            };
            this.f5751b = 1;
            if (SuspendAnimationKt.m(animationStateC, fE, hVar, false, lVar, this, 4, null) == objH) {
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
