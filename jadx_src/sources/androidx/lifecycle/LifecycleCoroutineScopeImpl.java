package androidx.lifecycle;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i2;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Lifecycle f24034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final CoroutineContext f24035c;

    public LifecycleCoroutineScopeImpl(@dl.d Lifecycle lifecycle, @dl.d CoroutineContext coroutineContext) {
        kotlin.jvm.internal.f0.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.f0.p(coroutineContext, "coroutineContext");
        this.f24034b = lifecycle;
        this.f24035c = coroutineContext;
        if (b().b() == Lifecycle.State.DESTROYED) {
            i2.i(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    @dl.d
    public Lifecycle b() {
        return this.f24034b;
    }

    @Override // androidx.lifecycle.v
    public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(event, "event");
        if (b().b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            b().d(this);
            i2.i(getCoroutineContext(), null, 1, null);
        }
    }

    public final void h() {
        kotlinx.coroutines.k.f(this, e1.e().t0(), null, new LifecycleCoroutineScopeImpl$register$1(this, null), 2, null);
    }

    @Override // kotlinx.coroutines.q0
    @dl.d
    /* JADX INFO: renamed from: j0 */
    public CoroutineContext getCoroutineContext() {
        return this.f24035c;
    }
}
