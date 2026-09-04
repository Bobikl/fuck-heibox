package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AsyncPagingDataDiffer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\fH\u0096@"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/b0;", "previousList", "newList", "Landroidx/paging/d;", "newCombinedLoadStates", "", "lastAccessedIndex", "Lkotlin/Function0;", "Lkotlin/b2;", "onListPresentable", "Lkotlin/coroutines/c;", "continuation", "presentNewList"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1", f = "AsyncPagingDataDiffer.kt", i = {0, 0, 0, 0, 0}, l = {99}, m = "presentNewList", n = {"this", "previousList", "newList", "onListPresentable", "lastAccessedIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
public final class AsyncPagingDataDiffer$differBase$1$presentNewList$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AsyncPagingDataDiffer$differBase$1 f25387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f25388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f25389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f25390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f25391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f25392i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncPagingDataDiffer$differBase$1$presentNewList$1(AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25387d = asyncPagingDataDiffer$differBase$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25385b = obj;
        this.f25386c |= Integer.MIN_VALUE;
        return this.f25387d.x(null, null, null, 0, null, this);
    }
}
