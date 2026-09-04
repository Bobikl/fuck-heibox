package androidx.fragment.app;

import androidx.lifecycle.c1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$4\n*L\n1#1,222:1\n*E\n"})
public final class FragmentViewModelLazyKt$viewModels$4 extends Lambda implements yh.a<androidx.lifecycle.y0.b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Fragment f23660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.z<c1> f23661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$4(Fragment fragment, kotlin.z<? extends c1> zVar) {
        super(0);
        this.f23660b = fragment;
        this.f23661c = zVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // yh.a
    @dl.d
    public final androidx.lifecycle.y0.b invoke() {
        androidx.lifecycle.y0.b defaultViewModelProviderFactory;
        c1 c1VarO = FragmentViewModelLazyKt.o(this.f23661c);
        androidx.lifecycle.r rVar = c1VarO instanceof androidx.lifecycle.r ? (androidx.lifecycle.r) c1VarO : null;
        if (rVar != null && (defaultViewModelProviderFactory = rVar.getDefaultViewModelProviderFactory()) != null) {
            return defaultViewModelProviderFactory;
        }
        androidx.lifecycle.y0.b defaultViewModelProviderFactory2 = this.f23660b.getDefaultViewModelProviderFactory();
        kotlin.jvm.internal.f0.o(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory2;
    }
}
