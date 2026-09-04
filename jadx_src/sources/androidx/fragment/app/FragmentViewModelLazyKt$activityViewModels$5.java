package androidx.fragment.app;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$5\n*L\n1#1,222:1\n*E\n"})
public final class FragmentViewModelLazyKt$activityViewModels$5 extends Lambda implements yh.a<u2.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.a<u2.a> f23651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Fragment f23652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$activityViewModels$5(yh.a<? extends u2.a> aVar, Fragment fragment) {
        super(0);
        this.f23651b = aVar;
        this.f23652c = fragment;
    }

    @Override // yh.a
    @dl.d
    public final u2.a invoke() {
        u2.a aVarInvoke;
        yh.a<u2.a> aVar = this.f23651b;
        if (aVar != null && (aVarInvoke = aVar.invoke()) != null) {
            return aVarInvoke;
        }
        u2.a defaultViewModelCreationExtras = this.f23652c.requireActivity().getDefaultViewModelCreationExtras();
        kotlin.jvm.internal.f0.o(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
        return defaultViewModelCreationExtras;
    }
}
