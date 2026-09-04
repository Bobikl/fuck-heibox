package androidx.lifecycle;

/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "ViewModelProviderGetKt")
public final class a1 {
    @dl.d
    public static final u2.a a(@dl.d c1 owner) {
        kotlin.jvm.internal.f0.p(owner, "owner");
        return owner instanceof r ? ((r) owner).getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b;
    }

    @androidx.annotation.k0
    public static final /* synthetic */ <VM extends w0> VM b(y0 y0Var) {
        kotlin.jvm.internal.f0.p(y0Var, "<this>");
        kotlin.jvm.internal.f0.y(4, "VM");
        return (VM) y0Var.a(w0.class);
    }
}
