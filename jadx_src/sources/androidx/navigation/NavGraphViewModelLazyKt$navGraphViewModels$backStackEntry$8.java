package androidx.navigation;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8 extends Lambda implements yh.a<NavBackStackEntry> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Fragment f24926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f24927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(Fragment fragment, String str) {
        super(0);
        this.f24926b = fragment;
        this.f24927c = str;
    }

    @Override // yh.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final NavBackStackEntry invoke() {
        return androidx.navigation.fragment.e.a(this.f24926b).P(this.f24927c);
    }
}
