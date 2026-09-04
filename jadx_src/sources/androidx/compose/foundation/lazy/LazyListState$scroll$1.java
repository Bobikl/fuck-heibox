package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", i = {0, 0, 0}, l = {bb.c.b.f30507a2, bb.c.b.f30530b2}, m = sd.b.f139393k, n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
public final class LazyListState$scroll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f6609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f6610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f6611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f6612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ LazyListState f6613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f6614g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListState$scroll$1(LazyListState lazyListState, kotlin.coroutines.c<? super LazyListState$scroll$1> cVar) {
        super(cVar);
        this.f6613f = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f6612e = obj;
        this.f6614g |= Integer.MIN_VALUE;
        return this.f6613f.c(null, null, this);
    }
}
