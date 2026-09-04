package androidx.lifecycle;

import kotlin.b2;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class LifecycleCoroutineScope implements kotlinx.coroutines.q0 {
    @dl.d
    public abstract Lifecycle b();

    @dl.d
    @kotlin.k(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    public final d2 e(@dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        return kotlinx.coroutines.k.f(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, block, null), 3, null);
    }

    @dl.d
    @kotlin.k(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    public final d2 f(@dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        return kotlinx.coroutines.k.f(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, block, null), 3, null);
    }

    @dl.d
    @kotlin.k(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    public final d2 g(@dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        return kotlinx.coroutines.k.f(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, block, null), 3, null);
    }
}
