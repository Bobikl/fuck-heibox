package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ActualAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DefaultChoreographerFrameClock$choreographer$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super Choreographer>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f12359b;

    DefaultChoreographerFrameClock$choreographer$1(kotlin.coroutines.c<? super DefaultChoreographerFrameClock$choreographer$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new DefaultChoreographerFrameClock$choreographer$1(cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super Choreographer> cVar) {
        return ((DefaultChoreographerFrameClock$choreographer$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f12359b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        return Choreographer.getInstance();
    }
}
