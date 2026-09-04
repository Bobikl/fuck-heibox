package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", i = {}, l = {bb.c.b.f31075z3}, m = "invokeSuspend", n = {}, s = {})
public final class LifecycleCoroutineScope$launchWhenCreated$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f24025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ LifecycleCoroutineScope f24026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> f24027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LifecycleCoroutineScope$launchWhenCreated$1(LifecycleCoroutineScope lifecycleCoroutineScope, yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super LifecycleCoroutineScope$launchWhenCreated$1> cVar) {
        super(2, cVar);
        this.f24026c = lifecycleCoroutineScope;
        this.f24027d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.f24026c, this.f24027d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((LifecycleCoroutineScope$launchWhenCreated$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f24025b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            Lifecycle lifecycleB = this.f24026c.b();
            yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> pVar = this.f24027d;
            this.f24025b = 1;
            if (PausingDispatcherKt.a(lifecycleB, pVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
