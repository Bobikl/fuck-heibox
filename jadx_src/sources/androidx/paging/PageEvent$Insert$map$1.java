package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PageEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0001*\u00020\u00002\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u0003H\u0096@"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "transform", "Landroidx/paging/PageEvent;", "continuation", "map"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0}, l = {74}, m = "map", n = {"transform", "this_$iv$iv", "destination$iv$iv$iv", "it", "destination$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$5", "L$7"})
public final class PageEvent$Insert$map$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PageEvent.Insert f25695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f25696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f25697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f25698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f25699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Object f25700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Object f25701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Object f25702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Object f25703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Object f25704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f25705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Object f25706o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageEvent$Insert$map$1(PageEvent.Insert insert, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25695d = insert;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25693b = obj;
        this.f25694c |= Integer.MIN_VALUE;
        return this.f25695d.e(null, this);
    }
}
