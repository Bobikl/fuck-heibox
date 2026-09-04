package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/w2;", "Lkotlinx/coroutines/j2;", "", "cause", "Lkotlin/b2;", "j0", "Lkotlin/coroutines/c;", "f", "Lkotlin/coroutines/c;", "continuation", "<init>", "(Lkotlin/coroutines/c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class w2 extends j2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.coroutines.c<kotlin.b2> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public w2(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        this.continuation = cVar;
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
        j0(th2);
        return kotlin.b2.f124493a;
    }

    @Override // kotlinx.coroutines.f0
    public void j0(@dl.e Throwable th2) {
        kotlin.coroutines.c<kotlin.b2> cVar = this.continuation;
        Result.a aVar = Result.f124476c;
        cVar.resumeWith(Result.b(kotlin.b2.f124493a));
    }
}
