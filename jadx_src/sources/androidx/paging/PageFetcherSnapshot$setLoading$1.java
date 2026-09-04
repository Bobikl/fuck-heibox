package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082@"}, d2 = {"", "Key", "Value", "Landroidx/paging/PageFetcherSnapshotState;", "Landroidx/paging/LoadType;", "loadType", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "setLoading"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {}, l = {506}, m = "setLoading", n = {}, s = {})
public final class PageFetcherSnapshot$setLoading$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshot f25878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$setLoading$1(PageFetcherSnapshot pageFetcherSnapshot, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25878d = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25876b = obj;
        this.f25877c |= Integer.MIN_VALUE;
        return this.f25878d.z(null, null, this);
    }
}
