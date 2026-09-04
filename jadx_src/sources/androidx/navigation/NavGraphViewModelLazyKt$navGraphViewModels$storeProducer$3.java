package androidx.navigation;

import androidx.lifecycle.b1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 extends Lambda implements yh.a<b1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.z<NavBackStackEntry> f24930b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(kotlin.z<NavBackStackEntry> zVar) {
        super(0);
        this.f24930b = zVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // yh.a
    public final b1 invoke() {
        return NavGraphViewModelLazyKt.o(this.f24930b).getViewModelStore();
    }
}
