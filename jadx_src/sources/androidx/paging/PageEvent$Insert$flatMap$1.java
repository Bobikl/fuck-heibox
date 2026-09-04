package androidx.paging;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PageEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0001*\u00020\u00002(\u0010\u0005\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u0003H\u0096@"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "transform", "Landroidx/paging/PageEvent;", "continuation", "flatMap"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {86}, m = "flatMap", n = {"transform", "this_$iv$iv", "destination$iv$iv$iv", "it", "originalIndices", "data", "index$iv", UCropPlusActivity.ARG_INDEX}, s = {"L$0", "L$1", "L$3", "L$5", "L$6", "L$7", "I$0", "I$1"})
public final class PageEvent$Insert$flatMap$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PageEvent.Insert f25679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f25680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f25681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f25682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f25683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Object f25684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Object f25685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Object f25686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Object f25687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Object f25688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f25689n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Object f25690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f25691p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f25692q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageEvent$Insert$flatMap$1(PageEvent.Insert insert, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25679d = insert;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25677b = obj;
        this.f25678c |= Integer.MIN_VALUE;
        return this.f25679d.c(null, this);
    }
}
