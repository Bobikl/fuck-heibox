package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/k;", "previous", "next", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$3 extends SuspendLambda implements yh.q<GenerationalViewportHint, GenerationalViewportHint, kotlin.coroutines.c<? super GenerationalViewportHint>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f25810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f25811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ LoadType f25812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$collectAsGenerationalViewportHints$3(LoadType loadType, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.f25812e = loadType;
    }

    @dl.d
    public final kotlin.coroutines.c<b2> a(@dl.d GenerationalViewportHint previous, @dl.d GenerationalViewportHint next, @dl.d kotlin.coroutines.c<? super GenerationalViewportHint> continuation) {
        kotlin.jvm.internal.f0.p(previous, "previous");
        kotlin.jvm.internal.f0.p(next, "next");
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(this.f25812e, continuation);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.f25809b = previous;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.f25810c = next;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$3;
    }

    @Override // yh.q
    public final Object invoke(GenerationalViewportHint generationalViewportHint, GenerationalViewportHint generationalViewportHint2, kotlin.coroutines.c<? super GenerationalViewportHint> cVar) {
        return ((PageFetcherSnapshot$collectAsGenerationalViewportHints$3) a(generationalViewportHint, generationalViewportHint2, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f25811d != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) this.f25809b;
        GenerationalViewportHint generationalViewportHint2 = (GenerationalViewportHint) this.f25810c;
        return g0.a(generationalViewportHint2, generationalViewportHint, this.f25812e) ? generationalViewportHint2 : generationalViewportHint;
    }
}
