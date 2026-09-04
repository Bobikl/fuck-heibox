package androidx.compose.animation.core;

import androidx.compose.runtime.h2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\bR+\u0010\t\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR+\u0010\f\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR+\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/core/r0;", androidx.exifinterface.media.a.R4, "", "<set-?>", ak.av, "Landroidx/compose/runtime/a1;", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "currentState", "b", "g", "targetState", "", ak.aF, "d", "()Z", "f", "(Z)V", "isRunning", "isIdle", "initialState", "<init>", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class r0<S> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4499d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 currentState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 targetState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 isRunning = h2.g(Boolean.FALSE, null, 2, null);

    public r0(S s10) {
        this.currentState = h2.g(s10, null, 2, null);
        this.targetState = h2.g(s10, null, 2, null);
    }

    public final S a() {
        return (S) this.currentState.getValue();
    }

    public final S b() {
        return (S) this.targetState.getValue();
    }

    public final boolean c() {
        return kotlin.jvm.internal.f0.g(a(), b()) && !d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final void e(S s10) {
        this.currentState.setValue(s10);
    }

    public final void f(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }

    public final void g(S s10) {
        this.targetState.setValue(s10);
    }
}
