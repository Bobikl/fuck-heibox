package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.z0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: SelectionMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", f = "SelectionMagnifier.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Animatable<b1.f, androidx.compose.animation.core.m> f8214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f8215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(Animatable<b1.f, androidx.compose.animation.core.m> animatable, long j10, kotlin.coroutines.c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2> cVar) {
        super(2, cVar);
        this.f8214c = animatable;
        this.f8215d = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(this.f8214c, this.f8215d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8213b;
        if (i10 == 0) {
            t0.n(obj);
            Animatable<b1.f, androidx.compose.animation.core.m> animatable = this.f8214c;
            b1.f fVarD = b1.f.d(this.f8215d);
            z0 z0Var = SelectionMagnifierKt.f8200d;
            this.f8213b = 1;
            if (Animatable.i(animatable, fVarD, z0Var, null, null, this, 12, null) == objH) {
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
