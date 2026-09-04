package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PageFetcherSnapshotState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0001*\u00020\u0000\"\b\b\u0003\u0010\u0002*\u00020\u00002-\u0010\b\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00040\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00040\tH\u0086H"}, d2 = {"", "Key", "Value", "Lkotlin/Function1;", "Landroidx/paging/PageFetcherSnapshotState;", "Lkotlin/m0;", "name", "state", "block", "Lkotlin/coroutines/c;", "continuation", "withLock"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshotState$Holder", f = "PageFetcherSnapshotState.kt", i = {0, 0, 0}, l = {bb.c.b.Z4}, m = "withLock", n = {"this", "block", "$this$withLock$iv"}, s = {"L$0", "L$1", "L$2"})
public final class PageFetcherSnapshotState$Holder$withLock$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshotState.Holder f25919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f25920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f25921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f25922g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshotState$Holder$withLock$1(PageFetcherSnapshotState.Holder holder, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25919d = holder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25917b = obj;
        this.f25918c |= Integer.MIN_VALUE;
        return this.f25919d.c(null, this);
    }
}
