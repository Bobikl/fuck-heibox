package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "it", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "androidx/paging/FlowExtKt$simpleMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
public final class PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1<Key, Value> extends SuspendLambda implements yh.q<kotlinx.coroutines.flow.f<? super o0<Value>>, PageFetcher.a<Key, Value>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f25742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f25743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ PageFetcher$flow$1 f25744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ x0 f25745f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(kotlin.coroutines.c cVar, PageFetcher$flow$1 pageFetcher$flow$1, x0 x0Var) {
        super(3, cVar);
        this.f25744e = pageFetcher$flow$1;
        this.f25745f = x0Var;
    }

    @dl.d
    public final kotlin.coroutines.c<b2> a(@dl.d kotlinx.coroutines.flow.f<? super o0<Value>> create, PageFetcher.a<Key, Value> aVar, @dl.d kotlin.coroutines.c<? super b2> continuation) {
        kotlin.jvm.internal.f0.p(create, "$this$create");
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 = new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(continuation, this.f25744e, this.f25745f);
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.f25741b = create;
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.f25742c = aVar;
        return pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yh.q
    public final Object invoke(Object obj, Object obj2, kotlin.coroutines.c<? super b2> cVar) {
        return ((PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1) a((kotlinx.coroutines.flow.f) obj, obj2, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25743d;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.flow.f fVar = (kotlinx.coroutines.flow.f) this.f25741b;
            PageFetcher.a aVar = (PageFetcher.a) this.f25742c;
            o0 o0Var = new o0(this.f25744e.f25729d.j(aVar.a(), this.f25745f), new PageFetcher.b(this.f25744e.f25729d, aVar.a(), this.f25744e.f25729d.retryEvents));
            this.f25743d = 1;
            if (fVar.emit(o0Var, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
