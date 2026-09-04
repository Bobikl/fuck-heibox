package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082@"}, d2 = {"", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/k;", "generationalHint", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "doLoad"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, l = {bb.c.b.f30700ia, 696, bb.c.b.f31010w4, bb.c.b.E4, bb.c.b.Ga, 720, bb.c.b.f30989v5, bb.c.b.f30609eb, bb.c.b.O5, bb.c.b.f30834o6, bb.c.b.f30885qb}, m = "doLoad", n = {"this", "loadType", "generationalHint", "itemsLoaded", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "$this$withLock$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "generationalHint", "result", "this_$iv", "$this$withLock$iv$iv", "loadType", "generationalHint", "$this$withLock$iv$iv", "state", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "dropType", "this_$iv", "$this$withLock$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "$this$withLock$iv$iv", "state", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "$this$withLock$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "this_$iv", "$this$withLock$iv$iv", "endsPrepend", "endsAppend"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1"})
public final class PageFetcherSnapshot$doLoad$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshot f25829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f25830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f25831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f25832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f25833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Object f25834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Object f25835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Object f25836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Object f25837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Object f25838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f25839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Object f25840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f25841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f25842q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$doLoad$1(PageFetcherSnapshot pageFetcherSnapshot, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25829d = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25827b = obj;
        this.f25828c |= Integer.MIN_VALUE;
        return this.f25829d.r(null, null, this);
    }
}
