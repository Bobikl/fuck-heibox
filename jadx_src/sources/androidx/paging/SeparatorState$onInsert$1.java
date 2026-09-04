package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Separators.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005H\u0086@"}, d2 = {"", "R", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/PageEvent$Insert;", androidx.core.app.o0.I0, "Lkotlin/coroutines/c;", "continuation", "onInsert"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SeparatorState", f = "Separators.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9}, l = {303, bb.c.b.f30555c4, bb.c.b.f30832o4, bb.c.b.f30966u4, bb.c.b.G4, 405, bb.c.b.f30764l5, bb.c.b.f30967u5, bb.c.b.H5, 460}, m = "onInsert", n = {"this", androidx.core.app.o0.I0, "this", androidx.core.app.o0.I0, "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "pageAfter", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.o0.I0, "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.o0.I0, "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "lastStash", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.o0.I0, "outList", "stashOutList", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.o0.I0, "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "iterator$iv", "page", "pageBefore", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.o0.I0, "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "iterator$iv", "page", "pageBefore", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.o0.I0, "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "pageAfter", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.o0.I0, "outList", "stashOutList", "lastNonEmptyPage", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.o0.I0, "outList", "stashOutList", "pageBefore"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class SeparatorState$onInsert$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SeparatorState f26258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f26259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f26260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f26261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f26262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Object f26263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Object f26264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Object f26265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Object f26266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Object f26267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f26268n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f26269o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f26270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f26271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f26272r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeparatorState$onInsert$1(SeparatorState separatorState, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f26258d = separatorState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f26256b = obj;
        this.f26257c |= Integer.MIN_VALUE;
        return this.f26258d.n(null, this);
    }
}
