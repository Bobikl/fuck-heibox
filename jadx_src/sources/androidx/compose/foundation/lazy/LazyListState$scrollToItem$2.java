package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/m;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LazyListState$scrollToItem$2 extends SuspendLambda implements yh.p<androidx.compose.foundation.gestures.m, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ LazyListState f6616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f6617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f6618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListState$scrollToItem$2(LazyListState lazyListState, int i10, int i11, kotlin.coroutines.c<? super LazyListState$scrollToItem$2> cVar) {
        super(2, cVar);
        this.f6616c = lazyListState;
        this.f6617d = i10;
        this.f6618e = i11;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.foundation.gestures.m mVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((LazyListState$scrollToItem$2) create(mVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new LazyListState$scrollToItem$2(this.f6616c, this.f6617d, this.f6618e, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f6615b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        this.f6616c.I(this.f6617d, this.f6618e);
        return b2.f124493a;
    }
}
