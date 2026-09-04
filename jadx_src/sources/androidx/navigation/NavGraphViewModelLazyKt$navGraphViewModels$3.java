package androidx.navigation;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$3 extends Lambda implements yh.a<u2.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.a<u2.a> f24912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.z<NavBackStackEntry> f24913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavGraphViewModelLazyKt$navGraphViewModels$3(yh.a<? extends u2.a> aVar, kotlin.z<NavBackStackEntry> zVar) {
        super(0);
        this.f24912b = aVar;
        this.f24913c = zVar;
    }

    @Override // yh.a
    public final u2.a invoke() {
        u2.a aVarInvoke;
        yh.a<u2.a> aVar = this.f24912b;
        return (aVar == null || (aVarInvoke = aVar.invoke()) == null) ? NavGraphViewModelLazyKt.n(this.f24913c).getDefaultViewModelCreationExtras() : aVarInvoke;
    }
}
