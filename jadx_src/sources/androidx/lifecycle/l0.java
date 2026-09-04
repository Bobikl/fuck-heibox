package androidx.lifecycle;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: PausingDispatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class l0 extends CoroutineDispatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    @xh.e
    public final l f24219d = new l();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void O(@dl.d CoroutineContext context, @dl.d Runnable block) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(block, "block");
        this.f24219d.c(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean V(@dl.d CoroutineContext context) {
        kotlin.jvm.internal.f0.p(context, "context");
        if (e1.e().p0().V(context)) {
            return true;
        }
        return !this.f24219d.b();
    }
}
