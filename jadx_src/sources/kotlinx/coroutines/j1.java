package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/j1;", "Lkotlinx/coroutines/j2;", "", "cause", "Lkotlin/b2;", "j0", "Lkotlinx/coroutines/h1;", "f", "Lkotlinx/coroutines/h1;", "handle", "<init>", "(Lkotlinx/coroutines/h1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class j1 extends j2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h1 handle;

    public j1(@dl.d h1 h1Var) {
        this.handle = h1Var;
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
        j0(th2);
        return kotlin.b2.f124493a;
    }

    @Override // kotlinx.coroutines.f0
    public void j0(@dl.e Throwable th2) {
        this.handle.dispose();
    }
}
