package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.i2;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f24036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f24037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ LifecycleCoroutineScopeImpl f24038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, kotlin.coroutines.c<? super LifecycleCoroutineScopeImpl$register$1> cVar) {
        super(2, cVar);
        this.f24038d = lifecycleCoroutineScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.f24038d, cVar);
        lifecycleCoroutineScopeImpl$register$1.f24037c = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((LifecycleCoroutineScopeImpl$register$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f24036b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f24037c;
        if (this.f24038d.b().b().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
            this.f24038d.b().a(this.f24038d);
        } else {
            i2.i(q0Var.getCoroutineContext(), null, 1, null);
        }
        return b2.f124493a;
    }
}
