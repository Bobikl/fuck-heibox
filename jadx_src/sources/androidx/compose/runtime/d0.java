package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/d0;", "Landroidx/compose/runtime/t1;", "Lkotlin/b2;", "b", "d", ak.aF, "Landroidx/compose/runtime/e0;", "Landroidx/compose/runtime/e0;", "onDispose", "Lkotlin/Function1;", "Landroidx/compose/runtime/f0;", "Lkotlin/t;", "effect", "<init>", "(Lyh/l;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d0 implements t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<f0, e0> f12653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private e0 onDispose;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@dl.d yh.l<? super f0, ? extends e0> effect) {
        kotlin.jvm.internal.f0.p(effect, "effect");
        this.f12653b = effect;
    }

    @Override // androidx.compose.runtime.t1
    public void b() {
        this.onDispose = this.f12653b.invoke(EffectsKt.f12373a);
    }

    @Override // androidx.compose.runtime.t1
    public void c() {
    }

    @Override // androidx.compose.runtime.t1
    public void d() {
        e0 e0Var = this.onDispose;
        if (e0Var != null) {
            e0Var.dispose();
        }
        this.onDispose = null;
    }
}
