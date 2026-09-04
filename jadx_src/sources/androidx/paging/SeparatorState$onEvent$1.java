package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Separators.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005H\u0086@"}, d2 = {"", "R", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/PageEvent;", androidx.core.app.o0.I0, "Lkotlin/coroutines/c;", "continuation", "onEvent"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SeparatorState", f = "Separators.kt", i = {0, 1}, l = {213, 215}, m = "onEvent", n = {"this", "this"}, s = {"L$0", "L$0"})
public final class SeparatorState$onEvent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SeparatorState f26254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f26255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeparatorState$onEvent$1(SeparatorState separatorState, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f26254d = separatorState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f26252b = obj;
        this.f26253c |= Integer.MIN_VALUE;
        return this.f26254d.m(null, this);
    }
}
