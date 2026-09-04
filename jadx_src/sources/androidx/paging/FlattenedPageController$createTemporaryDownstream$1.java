package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u0086@"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlin/coroutines/c;", "Landroidx/paging/TemporaryDownstream;", "continuation", "createTemporaryDownstream"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0, 1, 1, 1}, l = {310, 188}, m = "createTemporaryDownstream", n = {"this", "$this$withLock$iv", "$this$withLock$iv", "snap", "index$iv"}, s = {"L$0", "L$1", "L$0", "L$2", "I$0"})
public final class FlattenedPageController$createTemporaryDownstream$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ FlattenedPageController f25524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f25525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f25526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f25527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f25528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f25529i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlattenedPageController$createTemporaryDownstream$1(FlattenedPageController flattenedPageController, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25524d = flattenedPageController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25522b = obj;
        this.f25523c |= Integer.MIN_VALUE;
        return this.f25524d.a(this);
    }
}
