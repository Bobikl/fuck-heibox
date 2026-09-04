package androidx.paging;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PageEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0001*\u00020\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0003H\u0096@"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "predicate", "Landroidx/paging/PageEvent;", "continuation", "filter"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {104}, m = "filter", n = {"predicate", "this_$iv$iv", "destination$iv$iv$iv", "it", "originalIndices", "data", "t", "index$iv", UCropPlusActivity.ARG_INDEX}, s = {"L$0", "L$1", "L$3", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1"})
public final class PageEvent$Insert$filter$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PageEvent.Insert f25663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f25664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f25665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f25666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f25667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Object f25668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Object f25669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Object f25670k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Object f25671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Object f25672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f25673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Object f25674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f25675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f25676q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageEvent$Insert$filter$1(PageEvent.Insert insert, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25663d = insert;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25661b = obj;
        this.f25662c |= Integer.MIN_VALUE;
        return this.f25663d.a(null, this);
    }
}
