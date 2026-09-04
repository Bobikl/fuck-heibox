package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\r\u001a\u00020\f\u0012'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e¢\u0006\u0002\b\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/t0;", "Landroidx/compose/runtime/t1;", "Lkotlin/b2;", "b", "d", ak.aF, "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/q0;", "scope", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/d2;", "job", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "task", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lyh/p;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class t0 implements t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> f13315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.q0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private kotlinx.coroutines.d2 job;

    /* JADX WARN: Multi-variable type inference failed */
    public t0(@dl.d CoroutineContext parentCoroutineContext, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> task) {
        kotlin.jvm.internal.f0.p(parentCoroutineContext, "parentCoroutineContext");
        kotlin.jvm.internal.f0.p(task, "task");
        this.f13315b = task;
        this.scope = kotlinx.coroutines.r0.a(parentCoroutineContext);
    }

    @Override // androidx.compose.runtime.t1
    public void b() {
        kotlinx.coroutines.d2 d2Var = this.job;
        if (d2Var != null) {
            kotlinx.coroutines.i2.j(d2Var, "Old job was still running!", null, 2, null);
        }
        this.job = kotlinx.coroutines.k.f(this.scope, null, null, this.f13315b, 3, null);
    }

    @Override // androidx.compose.runtime.t1
    public void c() {
        kotlinx.coroutines.d2 d2Var = this.job;
        if (d2Var != null) {
            kotlinx.coroutines.d2.a.b(d2Var, null, 1, null);
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.t1
    public void d() {
        kotlinx.coroutines.d2 d2Var = this.job;
        if (d2Var != null) {
            kotlinx.coroutines.d2.a.b(d2Var, null, 1, null);
        }
        this.job = null;
    }
}
