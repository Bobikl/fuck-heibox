package androidx.navigation;

import androidx.lifecycle.y0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$8 extends Lambda implements yh.a<y0.b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.z<NavBackStackEntry> f24919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$8(kotlin.z<NavBackStackEntry> zVar) {
        super(0);
        this.f24919b = zVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // yh.a
    public final y0.b invoke() {
        return NavGraphViewModelLazyKt.p(this.f24919b).getDefaultViewModelProviderFactory();
    }
}
