package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/m;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LazyStaggeredGridState$scrollToItem$2 extends SuspendLambda implements yh.p<androidx.compose.foundation.gestures.m, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f7319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ LazyStaggeredGridState f7320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f7321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f7322f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridState$scrollToItem$2(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, kotlin.coroutines.c<? super LazyStaggeredGridState$scrollToItem$2> cVar) {
        super(2, cVar);
        this.f7320d = lazyStaggeredGridState;
        this.f7321e = i10;
        this.f7322f = i11;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.foundation.gestures.m mVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((LazyStaggeredGridState$scrollToItem$2) create(mVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        LazyStaggeredGridState$scrollToItem$2 lazyStaggeredGridState$scrollToItem$2 = new LazyStaggeredGridState$scrollToItem$2(this.f7320d, this.f7321e, this.f7322f, cVar);
        lazyStaggeredGridState$scrollToItem$2.f7319c = obj;
        return lazyStaggeredGridState$scrollToItem$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f7318b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        this.f7320d.M((androidx.compose.foundation.gestures.m) this.f7319c, this.f7321e, this.f7322f);
        return b2.f124493a;
    }
}
