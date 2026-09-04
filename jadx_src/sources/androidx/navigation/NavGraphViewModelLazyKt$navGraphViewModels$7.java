package androidx.navigation;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$7 extends Lambda implements yh.a<u2.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.a<u2.a> f24917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.z<NavBackStackEntry> f24918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavGraphViewModelLazyKt$navGraphViewModels$7(yh.a<? extends u2.a> aVar, kotlin.z<NavBackStackEntry> zVar) {
        super(0);
        this.f24917b = aVar;
        this.f24918c = zVar;
    }

    @Override // yh.a
    public final u2.a invoke() {
        u2.a aVarInvoke;
        yh.a<u2.a> aVar = this.f24917b;
        return (aVar == null || (aVarInvoke = aVar.invoke()) == null) ? NavGraphViewModelLazyKt.p(this.f24918c).getDefaultViewModelCreationExtras() : aVarInvoke;
    }
}
