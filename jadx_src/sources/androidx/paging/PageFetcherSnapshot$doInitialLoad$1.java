package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@"}, d2 = {"", "Key", "Value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "doInitialLoad"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 1, 1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9}, l = {611, bb.c.b.f30784m2, bb.c.b.f30853p2, bb.c.b.Z8, bb.c.b.f30768l9, bb.c.b.f31037x9, 304, bb.c.b.J9, bb.c.b.V9, bb.c.b.f30899r3}, m = "doInitialLoad", n = {"this", "this_$iv", "$this$withLock$iv$iv", "this", "$this$withLock$iv$iv", "this", "this", "result", "this_$iv", "$this$withLock$iv$iv", "this", "result", "this_$iv", "$this$withLock$iv$iv", "insertApplied", "this", "result", "this_$iv", "$this$withLock$iv$iv", "this", "result", "$this$withLock$iv$iv", "this", "result", "this_$iv", "$this$withLock$iv$iv", "this", "result", "this_$iv", "$this$withLock$iv$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
public final class PageFetcherSnapshot$doInitialLoad$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshot f25821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f25822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f25823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f25824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f25825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f25826i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$doInitialLoad$1(PageFetcherSnapshot pageFetcherSnapshot, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25821d = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25819b = obj;
        this.f25820c |= Integer.MIN_VALUE;
        return this.f25821d.q(this);
    }
}
