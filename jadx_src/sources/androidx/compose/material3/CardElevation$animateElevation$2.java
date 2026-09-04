package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.CardElevation$animateElevation$2", f = "Card.kt", i = {}, l = {bb.c.b.f30631fa, bb.c.b.f30792ma}, m = "invokeSuspend", n = {}, s = {})
public final class CardElevation$animateElevation$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f8978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Animatable<s1.h, androidx.compose.animation.core.l> f8979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ CardElevation f8980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f8981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.d f8982g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardElevation$animateElevation$2(boolean z10, Animatable<s1.h, androidx.compose.animation.core.l> animatable, CardElevation cardElevation, float f10, androidx.compose.foundation.interaction.d dVar, kotlin.coroutines.c<? super CardElevation$animateElevation$2> cVar) {
        super(2, cVar);
        this.f8978c = z10;
        this.f8979d = animatable;
        this.f8980e = cardElevation;
        this.f8981f = f10;
        this.f8982g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new CardElevation$animateElevation$2(this.f8978c, this.f8979d, this.f8980e, this.f8981f, this.f8982g, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((CardElevation$animateElevation$2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8977b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            if (this.f8978c) {
                float fW = this.f8979d.r().w();
                androidx.compose.foundation.interaction.d bVar = null;
                if (s1.h.l(fW, this.f8980e.pressedElevation)) {
                    bVar = new androidx.compose.foundation.interaction.i.b(b1.f.f30364b.e(), null);
                } else if (s1.h.l(fW, this.f8980e.hoveredElevation)) {
                    bVar = new androidx.compose.foundation.interaction.c.a();
                } else if (s1.h.l(fW, this.f8980e.focusedElevation)) {
                    bVar = new androidx.compose.foundation.interaction.b.a();
                } else if (s1.h.l(fW, this.f8980e.draggedElevation)) {
                    bVar = new androidx.compose.foundation.interaction.a.b();
                }
                Animatable<s1.h, androidx.compose.animation.core.l> animatable = this.f8979d;
                float f10 = this.f8981f;
                androidx.compose.foundation.interaction.d dVar = this.f8982g;
                this.f8977b = 1;
                if (v.d(animatable, f10, bVar, dVar, this) == objH) {
                    return objH;
                }
            } else {
                Animatable<s1.h, androidx.compose.animation.core.l> animatable2 = this.f8979d;
                s1.h hVarD = s1.h.d(this.f8981f);
                this.f8977b = 2;
                if (animatable2.B(hVarD, this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return kotlin.b2.f124493a;
    }
}
