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
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
public final class TransformableStateKt$animateZoomBy$3 extends SuspendLambda implements yh.p<r, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f5760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f5761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.core.h<Float> f5762f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animateZoomBy$3(Ref.FloatRef floatRef, float f10, androidx.compose.animation.core.h<Float> hVar, kotlin.coroutines.c<? super TransformableStateKt$animateZoomBy$3> cVar) {
        super(2, cVar);
        this.f5760d = floatRef;
        this.f5761e = f10;
        this.f5762f = hVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d r rVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TransformableStateKt$animateZoomBy$3) create(rVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TransformableStateKt$animateZoomBy$3 transformableStateKt$animateZoomBy$3 = new TransformableStateKt$animateZoomBy$3(this.f5760d, this.f5761e, this.f5762f, cVar);
        transformableStateKt$animateZoomBy$3.f5759c = obj;
        return transformableStateKt$animateZoomBy$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5758b;
        if (i10 == 0) {
            t0.n(obj);
            final r rVar = (r) this.f5759c;
            AnimationState animationStateC = androidx.compose.animation.core.k.c(this.f5760d.f124888b, 0.0f, 0L, 0L, false, 30, null);
            Float fE = kotlin.coroutines.jvm.internal.a.e(this.f5761e);
            androidx.compose.animation.core.h<Float> hVar = this.f5762f;
            final Ref.FloatRef floatRef = this.f5760d;
            yh.l<androidx.compose.animation.core.g<Float, androidx.compose.animation.core.l>, b2> lVar = new yh.l<androidx.compose.animation.core.g<Float, androidx.compose.animation.core.l>, b2>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.animation.core.g<Float, androidx.compose.animation.core.l> animateTo) {
                    f0.p(animateTo, "$this$animateTo");
                    q.a(rVar, (floatRef.f124888b > 0.0f ? 1 : (floatRef.f124888b == 0.0f ? 0 : -1)) == 0 ? 1.0f : animateTo.g().floatValue() / floatRef.f124888b, 0L, 0.0f, 6, null);
                    floatRef.f124888b = animateTo.g().floatValue();
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.animation.core.g<Float, androidx.compose.animation.core.l> gVar) {
                    a(gVar);
                    return b2.f124493a;
                }
            };
            this.f5758b = 1;
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
