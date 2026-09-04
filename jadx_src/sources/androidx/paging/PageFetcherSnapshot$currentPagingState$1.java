package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003H\u0086@"}, d2 = {"", "Key", "Value", "Lkotlin/coroutines/c;", "Landroidx/paging/t0;", "continuation", "currentPagingState"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {bb.c.b.f31036x8}, m = "currentPagingState", n = {"this", "this_$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$1", "L$2"})
public final class PageFetcherSnapshot$currentPagingState$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshot f25815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f25816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f25817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f25818g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$currentPagingState$1(PageFetcherSnapshot pageFetcherSnapshot, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25815d = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25813b = obj;
        this.f25814c |= Integer.MIN_VALUE;
        return this.f25815d.p(this);
    }
}
