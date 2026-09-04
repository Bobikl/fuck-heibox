package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/v2;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/j2;", "", "cause", "Lkotlin/b2;", "j0", "Lkotlinx/coroutines/q;", "f", "Lkotlinx/coroutines/q;", "continuation", "<init>", "(Lkotlinx/coroutines/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class v2<T> extends j2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public v2(@dl.d q<? super T> qVar) {
        this.continuation = qVar;
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
        j0(th2);
        return kotlin.b2.f124493a;
    }

    @Override // kotlinx.coroutines.f0
    public void j0(@dl.e Throwable th2) {
        Object objT0 = k0().T0();
        if (objT0 instanceof d0) {
            q<T> qVar = this.continuation;
            Result.a aVar = Result.f124476c;
            qVar.resumeWith(Result.b(kotlin.t0.a(((d0) objT0).cause)));
        } else {
            q<T> qVar2 = this.continuation;
            Result.a aVar2 = Result.f124476c;
            qVar2.resumeWith(Result.b(k2.o(objT0)));
        }
    }
}
