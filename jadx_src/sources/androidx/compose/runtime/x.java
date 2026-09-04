package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.r0
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/x;", "Landroidx/compose/runtime/t1;", "Lkotlin/b2;", "b", "d", ak.aF, "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/q0;", ak.av, "()Lkotlinx/coroutines/q0;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/q0;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class x implements t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.q0 coroutineScope;

    public x(@dl.d kotlinx.coroutines.q0 coroutineScope) {
        kotlin.jvm.internal.f0.p(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final kotlinx.coroutines.q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.t1
    public void b() {
    }

    @Override // androidx.compose.runtime.t1
    public void c() {
        kotlinx.coroutines.r0.f(this.coroutineScope, null, 1, null);
    }

    @Override // androidx.compose.runtime.t1
    public void d() {
        kotlinx.coroutines.r0.f(this.coroutineScope, null, 1, null);
    }
}
