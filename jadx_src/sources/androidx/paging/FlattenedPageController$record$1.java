package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlin/collections/h0;", "Landroidx/paging/PageEvent;", androidx.core.app.o0.I0, "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "record"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {bb.c.b.L2, bb.c.b.f30918s0}, m = "record", n = {"this", androidx.core.app.o0.I0, "$this$withLock$iv", androidx.core.app.o0.I0, "$this$withLock$iv", "destination$iv$iv", "element$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$3", "L$5"})
public final class FlattenedPageController$record$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ FlattenedPageController f25532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f25533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f25534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f25535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f25536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Object f25537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Object f25538j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlattenedPageController$record$1(FlattenedPageController flattenedPageController, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25532d = flattenedPageController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25530b = obj;
        this.f25531c |= Integer.MIN_VALUE;
        return this.f25532d.b(null, this);
    }
}
