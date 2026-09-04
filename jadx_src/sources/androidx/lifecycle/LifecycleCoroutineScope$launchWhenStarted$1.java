package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", i = {}, l = {bb.c.b.S3}, m = "invokeSuspend", n = {}, s = {})
public final class LifecycleCoroutineScope$launchWhenStarted$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f24031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ LifecycleCoroutineScope f24032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> f24033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LifecycleCoroutineScope$launchWhenStarted$1(LifecycleCoroutineScope lifecycleCoroutineScope, yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super LifecycleCoroutineScope$launchWhenStarted$1> cVar) {
        super(2, cVar);
        this.f24032c = lifecycleCoroutineScope;
        this.f24033d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new LifecycleCoroutineScope$launchWhenStarted$1(this.f24032c, this.f24033d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((LifecycleCoroutineScope$launchWhenStarted$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f24031b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            Lifecycle lifecycleB = this.f24032c.b();
            yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> pVar = this.f24033d;
            this.f24031b = 1;
            if (PausingDispatcherKt.e(lifecycleB, pVar, this) == objH) {
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
