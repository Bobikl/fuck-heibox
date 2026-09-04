package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1<T> implements kotlinx.coroutines.flow.f<PageEvent<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ PagingDataDiffer$collectFrom$2 f26035b;

    public PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1(PagingDataDiffer$collectFrom$2 pagingDataDiffer$collectFrom$2) {
        this.f26035b = pagingDataDiffer$collectFrom$2;
    }

    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
        Object objH = kotlinx.coroutines.i.h(this.f26035b.f26033c.mainDispatcher, new PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1((PageEvent) obj, null, this), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }
}
