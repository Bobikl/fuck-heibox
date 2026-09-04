package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SnackbarHostKt$animatedScale$1", f = "SnackbarHost.kt", i = {}, l = {bb.c.b.F5}, m = "invokeSuspend", n = {}, s = {})
public final class SnackbarHostKt$animatedScale$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Animatable<Float, androidx.compose.animation.core.l> f10853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f10854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.core.h<Float> f10855e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$animatedScale$1(Animatable<Float, androidx.compose.animation.core.l> animatable, boolean z10, androidx.compose.animation.core.h<Float> hVar, kotlin.coroutines.c<? super SnackbarHostKt$animatedScale$1> cVar) {
        super(2, cVar);
        this.f10853c = animatable;
        this.f10854d = z10;
        this.f10855e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new SnackbarHostKt$animatedScale$1(this.f10853c, this.f10854d, this.f10855e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SnackbarHostKt$animatedScale$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f10852b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            Animatable<Float, androidx.compose.animation.core.l> animatable = this.f10853c;
            Float fE = kotlin.coroutines.jvm.internal.a.e(this.f10854d ? 1.0f : 0.8f);
            androidx.compose.animation.core.h<Float> hVar = this.f10855e;
            this.f10852b = 1;
            if (Animatable.i(animatable, fE, hVar, null, null, this, 12, null) == objH) {
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
