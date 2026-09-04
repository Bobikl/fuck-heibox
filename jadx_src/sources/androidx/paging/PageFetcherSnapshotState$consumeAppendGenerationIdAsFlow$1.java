package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PageFetcherSnapshotState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/flow/f;", "", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.flow.f<? super Integer>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshotState f25924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(PageFetcherSnapshotState pageFetcherSnapshotState, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25924c = pageFetcherSnapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(this.f25924c, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.flow.f<? super Integer> fVar, kotlin.coroutines.c<? super b2> cVar) {
        return ((PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f25923b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        this.f25924c.appendGenerationIdCh.offer(kotlin.coroutines.jvm.internal.a.f(this.f25924c.appendGenerationId));
        return b2.f124493a;
    }
}
