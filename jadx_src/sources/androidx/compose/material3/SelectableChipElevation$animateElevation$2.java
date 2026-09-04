package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2", f = "Chip.kt", i = {}, l = {bb.c.b.eu}, m = "invokeSuspend", n = {}, s = {})
public final class SelectableChipElevation$animateElevation$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Animatable<s1.h, androidx.compose.animation.core.l> f10478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f10479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectableChipElevation$animateElevation$2(Animatable<s1.h, androidx.compose.animation.core.l> animatable, float f10, kotlin.coroutines.c<? super SelectableChipElevation$animateElevation$2> cVar) {
        super(2, cVar);
        this.f10478c = animatable;
        this.f10479d = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new SelectableChipElevation$animateElevation$2(this.f10478c, this.f10479d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SelectableChipElevation$animateElevation$2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f10477b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            Animatable<s1.h, androidx.compose.animation.core.l> animatable = this.f10478c;
            s1.h hVarD = s1.h.d(this.f10479d);
            this.f10477b = 1;
            if (animatable.B(hVarD, this) == objH) {
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
