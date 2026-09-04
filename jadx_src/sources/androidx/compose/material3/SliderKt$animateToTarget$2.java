package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderKt$animateToTarget$2", f = "Slider.kt", i = {}, l = {bb.c.b.Ej}, m = "invokeSuspend", n = {}, s = {})
public final class SliderKt$animateToTarget$2 extends SuspendLambda implements yh.p<androidx.compose.foundation.gestures.d, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f10705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f10706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f10707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f10708f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$animateToTarget$2(float f10, float f11, float f12, kotlin.coroutines.c<? super SliderKt$animateToTarget$2> cVar) {
        super(2, cVar);
        this.f10706d = f10;
        this.f10707e = f11;
        this.f10708f = f12;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.foundation.gestures.d dVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SliderKt$animateToTarget$2) create(dVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.f10706d, this.f10707e, this.f10708f, cVar);
        sliderKt$animateToTarget$2.f10705c = obj;
        return sliderKt$animateToTarget$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f10704b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            final androidx.compose.foundation.gestures.d dVar = (androidx.compose.foundation.gestures.d) this.f10705c;
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            float f10 = this.f10706d;
            floatRef.f124888b = f10;
            Animatable animatableB = androidx.compose.animation.core.b.b(f10, 0.0f, 2, null);
            Float fE = kotlin.coroutines.jvm.internal.a.e(this.f10707e);
            androidx.compose.animation.core.e1 e1Var = SliderKt.f10533k;
            Float fE2 = kotlin.coroutines.jvm.internal.a.e(this.f10708f);
            yh.l<Animatable<Float, androidx.compose.animation.core.l>, kotlin.b2> lVar = new yh.l<Animatable<Float, androidx.compose.animation.core.l>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$animateToTarget$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d Animatable<Float, androidx.compose.animation.core.l> animateTo) {
                    kotlin.jvm.internal.f0.p(animateTo, "$this$animateTo");
                    dVar.c(animateTo.u().floatValue() - floatRef.f124888b);
                    floatRef.f124888b = animateTo.u().floatValue();
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Animatable<Float, androidx.compose.animation.core.l> animatable) {
                    a(animatable);
                    return kotlin.b2.f124493a;
                }
            };
            this.f10704b = 1;
            if (animatableB.h(fE, e1Var, fE2, lVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return kotlin.b2.f124493a;
    }
}
