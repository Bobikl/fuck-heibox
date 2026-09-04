package androidx.fragment.app;

import androidx.lifecycle.c1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$3\n*L\n1#1,222:1\n*E\n"})
public final class FragmentViewModelLazyKt$viewModels$3 extends Lambda implements yh.a<u2.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.z<c1> f23659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$3(kotlin.z<? extends c1> zVar) {
        super(0);
        this.f23659b = zVar;
    }

    @Override // yh.a
    @dl.d
    public final u2.a invoke() {
        u2.a defaultViewModelCreationExtras;
        c1 c1VarO = FragmentViewModelLazyKt.o(this.f23659b);
        androidx.lifecycle.r rVar = c1VarO instanceof androidx.lifecycle.r ? (androidx.lifecycle.r) c1VarO : null;
        return (rVar == null || (defaultViewModelCreationExtras = rVar.getDefaultViewModelCreationExtras()) == null) ? u2.a.C1270a.f140743b : defaultViewModelCreationExtras;
    }
}
