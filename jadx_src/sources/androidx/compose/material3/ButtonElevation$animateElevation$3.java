package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.ButtonElevation$animateElevation$3", f = "Button.kt", i = {}, l = {bb.c.b.Gd}, m = "invokeSuspend", n = {}, s = {})
public final class ButtonElevation$animateElevation$3 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Animatable<s1.h, androidx.compose.animation.core.l> f8893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ButtonElevation f8894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f8895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.d f8896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonElevation$animateElevation$3(Animatable<s1.h, androidx.compose.animation.core.l> animatable, ButtonElevation buttonElevation, float f10, androidx.compose.foundation.interaction.d dVar, kotlin.coroutines.c<? super ButtonElevation$animateElevation$3> cVar) {
        super(2, cVar);
        this.f8893c = animatable;
        this.f8894d = buttonElevation;
        this.f8895e = f10;
        this.f8896f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new ButtonElevation$animateElevation$3(this.f8893c, this.f8894d, this.f8895e, this.f8896f, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((ButtonElevation$animateElevation$3) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8892b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            float fW = this.f8893c.r().w();
            androidx.compose.foundation.interaction.d aVar = null;
            if (s1.h.l(fW, this.f8894d.pressedElevation)) {
                aVar = new androidx.compose.foundation.interaction.i.b(b1.f.f30364b.e(), null);
            } else if (s1.h.l(fW, this.f8894d.hoveredElevation)) {
                aVar = new androidx.compose.foundation.interaction.c.a();
            } else if (s1.h.l(fW, this.f8894d.focusedElevation)) {
                aVar = new androidx.compose.foundation.interaction.b.a();
            }
            Animatable<s1.h, androidx.compose.animation.core.l> animatable = this.f8893c;
            float f10 = this.f8895e;
            androidx.compose.foundation.interaction.d dVar = this.f8896f;
            this.f8892b = 1;
            if (v.d(animatable, f10, aVar, dVar, this) == objH) {
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
