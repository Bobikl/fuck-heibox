package androidx.navigation;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4 extends Lambda implements yh.a<NavBackStackEntry> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Fragment f24922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f24923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(Fragment fragment, int i10) {
        super(0);
        this.f24922b = fragment;
        this.f24923c = i10;
    }

    @Override // yh.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final NavBackStackEntry invoke() {
        return androidx.navigation.fragment.e.a(this.f24922b).N(this.f24923c);
    }
}
