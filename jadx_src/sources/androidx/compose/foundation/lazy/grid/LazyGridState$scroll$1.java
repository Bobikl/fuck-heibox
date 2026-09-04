package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: LazyGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", i = {0, 0, 0}, l = {bb.c.b.f30646g2, bb.c.b.f30669h2}, m = sd.b.f139393k, n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
public final class LazyGridState$scroll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f6859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f6860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f6861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f6862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ LazyGridState f6863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f6864g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridState$scroll$1(LazyGridState lazyGridState, kotlin.coroutines.c<? super LazyGridState$scroll$1> cVar) {
        super(cVar);
        this.f6863f = lazyGridState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f6862e = obj;
        this.f6864g |= Integer.MIN_VALUE;
        return this.f6863f.c(null, null, this);
    }
}
