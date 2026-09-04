package androidx.fragment.app;

import androidx.lifecycle.c1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$2\n*L\n1#1,222:1\n*E\n"})
public final class FragmentViewModelLazyKt$viewModels$2 extends Lambda implements yh.a<androidx.lifecycle.b1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.z<c1> f23658b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$2(kotlin.z<? extends c1> zVar) {
        super(0);
        this.f23658b = zVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // yh.a
    @dl.d
    public final androidx.lifecycle.b1 invoke() {
        return FragmentViewModelLazyKt.o(this.f23658b).getViewModelStore();
    }
}
