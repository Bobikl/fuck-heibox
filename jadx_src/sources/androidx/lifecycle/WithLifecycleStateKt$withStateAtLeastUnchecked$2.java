package androidx.lifecycle;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: WithLifecycleState.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n*L\n1#1,206:1\n*E\n"})
public final class WithLifecycleStateKt$withStateAtLeastUnchecked$2<R> extends Lambda implements yh.a<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.a<R> f24161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WithLifecycleStateKt$withStateAtLeastUnchecked$2(yh.a<? extends R> aVar) {
        super(0);
        this.f24161b = aVar;
    }

    @Override // yh.a
    public final R invoke() {
        return this.f24161b.invoke();
    }
}
