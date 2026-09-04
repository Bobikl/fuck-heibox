package androidx.lifecycle;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.i2;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements Closeable, kotlinx.coroutines.q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final CoroutineContext f24196b;

    public e(@dl.d CoroutineContext context) {
        kotlin.jvm.internal.f0.p(context, "context");
        this.f24196b = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        i2.i(getCoroutineContext(), null, 1, null);
    }

    @Override // kotlinx.coroutines.q0
    @dl.d
    /* JADX INFO: renamed from: j0 */
    public CoroutineContext getCoroutineContext() {
        return this.f24196b;
    }
}
