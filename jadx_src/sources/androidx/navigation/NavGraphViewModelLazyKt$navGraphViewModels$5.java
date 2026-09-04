package androidx.navigation;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$5 extends Lambda implements yh.a<u2.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.z<NavBackStackEntry> f24915b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$5(kotlin.z<NavBackStackEntry> zVar) {
        super(0);
        this.f24915b = zVar;
    }

    @Override // yh.a
    public final u2.a invoke() {
        return NavGraphViewModelLazyKt.o(this.f24915b).getDefaultViewModelCreationExtras();
    }
}
