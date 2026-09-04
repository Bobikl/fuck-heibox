package androidx.fragment.app;

import androidx.lifecycle.c1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$7\n*L\n1#1,222:1\n*E\n"})
public final class FragmentViewModelLazyKt$viewModels$7 extends Lambda implements yh.a<u2.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.a<u2.a> f23664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.z<c1> f23665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$7(yh.a<? extends u2.a> aVar, kotlin.z<? extends c1> zVar) {
        super(0);
        this.f23664b = aVar;
        this.f23665c = zVar;
    }

    @Override // yh.a
    @dl.d
    public final u2.a invoke() {
        u2.a aVarInvoke;
        yh.a<u2.a> aVar = this.f23664b;
        if (aVar != null && (aVarInvoke = aVar.invoke()) != null) {
            return aVarInvoke;
        }
        c1 c1VarP = FragmentViewModelLazyKt.p(this.f23665c);
        androidx.lifecycle.r rVar = c1VarP instanceof androidx.lifecycle.r ? (androidx.lifecycle.r) c1VarP : null;
        return rVar != null ? rVar.getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b;
    }
}
