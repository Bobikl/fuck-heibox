package androidx.fragment.app;

import androidx.lifecycle.c1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$8\n*L\n1#1,222:1\n*E\n"})
public final class FragmentViewModelLazyKt$viewModels$8 extends Lambda implements yh.a<androidx.lifecycle.y0.b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Fragment f23666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.z<c1> f23667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$8(Fragment fragment, kotlin.z<? extends c1> zVar) {
        super(0);
        this.f23666b = fragment;
        this.f23667c = zVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // yh.a
    @dl.d
    public final androidx.lifecycle.y0.b invoke() {
        androidx.lifecycle.y0.b defaultViewModelProviderFactory;
        c1 c1VarP = FragmentViewModelLazyKt.p(this.f23667c);
        androidx.lifecycle.r rVar = c1VarP instanceof androidx.lifecycle.r ? (androidx.lifecycle.r) c1VarP : null;
        if (rVar != null && (defaultViewModelProviderFactory = rVar.getDefaultViewModelProviderFactory()) != null) {
            return defaultViewModelProviderFactory;
        }
        androidx.lifecycle.y0.b defaultViewModelProviderFactory2 = this.f23666b.getDefaultViewModelProviderFactory();
        kotlin.jvm.internal.f0.o(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory2;
    }
}
