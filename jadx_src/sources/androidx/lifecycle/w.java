package androidx.lifecycle;

import kotlinx.coroutines.e1;
import kotlinx.coroutines.f3;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class w {
    @dl.d
    public static final LifecycleCoroutineScope a(@dl.d Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        kotlin.jvm.internal.f0.p(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, f3.c(null, 1, null).I(e1.e().p0()));
        } while (!androidx.compose.animation.core.s0.a(lifecycle.c(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.h();
        return lifecycleCoroutineScopeImpl;
    }
}
