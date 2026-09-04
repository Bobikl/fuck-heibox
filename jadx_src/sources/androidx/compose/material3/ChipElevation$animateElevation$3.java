package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.ChipElevation$animateElevation$3", f = "Chip.kt", i = {}, l = {bb.c.b.jr}, m = "invokeSuspend", n = {}, s = {})
public final class ChipElevation$animateElevation$3 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f9094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Animatable<s1.h, androidx.compose.animation.core.l> f9095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ChipElevation f9096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f9097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.d f9098f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChipElevation$animateElevation$3(Animatable<s1.h, androidx.compose.animation.core.l> animatable, ChipElevation chipElevation, float f10, androidx.compose.foundation.interaction.d dVar, kotlin.coroutines.c<? super ChipElevation$animateElevation$3> cVar) {
        super(2, cVar);
        this.f9095c = animatable;
        this.f9096d = chipElevation;
        this.f9097e = f10;
        this.f9098f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new ChipElevation$animateElevation$3(this.f9095c, this.f9096d, this.f9097e, this.f9098f, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((ChipElevation$animateElevation$3) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f9094b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            float fW = this.f9095c.r().w();
            androidx.compose.foundation.interaction.d bVar = null;
            if (s1.h.l(fW, this.f9096d.pressedElevation)) {
                bVar = new androidx.compose.foundation.interaction.i.b(b1.f.f30364b.e(), null);
            } else if (s1.h.l(fW, this.f9096d.hoveredElevation)) {
                bVar = new androidx.compose.foundation.interaction.c.a();
            } else if (s1.h.l(fW, this.f9096d.focusedElevation)) {
                bVar = new androidx.compose.foundation.interaction.b.a();
            } else if (s1.h.l(fW, this.f9096d.draggedElevation)) {
                bVar = new androidx.compose.foundation.interaction.a.b();
            }
            Animatable<s1.h, androidx.compose.animation.core.l> animatable = this.f9095c;
            float f10 = this.f9097e;
            androidx.compose.foundation.interaction.d dVar = this.f9098f;
            this.f9094b = 1;
            if (v.d(animatable, f10, bVar, dVar, this) == objH) {
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
