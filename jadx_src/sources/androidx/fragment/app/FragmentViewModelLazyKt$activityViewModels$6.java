package androidx.fragment.app;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6\n*L\n1#1,222:1\n*E\n"})
public final class FragmentViewModelLazyKt$activityViewModels$6 extends Lambda implements yh.a<androidx.lifecycle.y0.b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Fragment f23653b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$activityViewModels$6(Fragment fragment) {
        super(0);
        this.f23653b = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // yh.a
    @dl.d
    public final androidx.lifecycle.y0.b invoke() {
        androidx.lifecycle.y0.b defaultViewModelProviderFactory = this.f23653b.requireActivity().getDefaultViewModelProviderFactory();
        kotlin.jvm.internal.f0.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
