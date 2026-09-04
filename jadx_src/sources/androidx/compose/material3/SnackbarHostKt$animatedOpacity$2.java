package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", i = {}, l = {bb.c.b.f30923s5}, m = "invokeSuspend", n = {}, s = {})
public final class SnackbarHostKt$animatedOpacity$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Animatable<Float, androidx.compose.animation.core.l> f10848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f10849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.core.h<Float> f10850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.a<kotlin.b2> f10851f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$animatedOpacity$2(Animatable<Float, androidx.compose.animation.core.l> animatable, boolean z10, androidx.compose.animation.core.h<Float> hVar, yh.a<kotlin.b2> aVar, kotlin.coroutines.c<? super SnackbarHostKt$animatedOpacity$2> cVar) {
        super(2, cVar);
        this.f10848c = animatable;
        this.f10849d = z10;
        this.f10850e = hVar;
        this.f10851f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new SnackbarHostKt$animatedOpacity$2(this.f10848c, this.f10849d, this.f10850e, this.f10851f, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SnackbarHostKt$animatedOpacity$2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f10847b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            Animatable<Float, androidx.compose.animation.core.l> animatable = this.f10848c;
            Float fE = kotlin.coroutines.jvm.internal.a.e(this.f10849d ? 1.0f : 0.0f);
            androidx.compose.animation.core.h<Float> hVar = this.f10850e;
            this.f10847b = 1;
            if (Animatable.i(animatable, fE, hVar, null, null, this, 12, null) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        this.f10851f.invoke();
        return kotlin.b2.f124493a;
    }
}
