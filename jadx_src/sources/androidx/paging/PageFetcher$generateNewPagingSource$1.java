package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PageFetcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0005H\u0082@"}, d2 = {"", "Key", "Value", "Landroidx/paging/q0;", "previousPagingSource", "Lkotlin/coroutines/c;", "continuation", "generateNewPagingSource"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", i = {0, 0}, l = {211}, m = "generateNewPagingSource", n = {"this", "previousPagingSource"}, s = {"L$0", "L$1"})
public final class PageFetcher$generateNewPagingSource$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PageFetcher f25748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f25749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f25750f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcher$generateNewPagingSource$1(PageFetcher pageFetcher, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25748d = pageFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25746b = obj;
        this.f25747c |= Integer.MIN_VALUE;
        return this.f25748d.h(null, this);
    }
}
