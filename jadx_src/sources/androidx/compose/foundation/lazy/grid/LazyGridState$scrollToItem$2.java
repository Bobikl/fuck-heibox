package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: LazyGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/m;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LazyGridState$scrollToItem$2 extends SuspendLambda implements yh.p<androidx.compose.foundation.gestures.m, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ LazyGridState f6866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f6867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f6868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridState$scrollToItem$2(LazyGridState lazyGridState, int i10, int i11, kotlin.coroutines.c<? super LazyGridState$scrollToItem$2> cVar) {
        super(2, cVar);
        this.f6866c = lazyGridState;
        this.f6867d = i10;
        this.f6868e = i11;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.foundation.gestures.m mVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((LazyGridState$scrollToItem$2) create(mVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new LazyGridState$scrollToItem$2(this.f6866c, this.f6867d, this.f6868e, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f6865b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        this.f6866c.M(this.f6867d, this.f6868e);
        return b2.f124493a;
    }
}
