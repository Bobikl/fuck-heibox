package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/m;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", i = {}, l = {493}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollDraggableState$drag$2 extends SuspendLambda implements yh.p<m, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ScrollDraggableState f5504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p<d, kotlin.coroutines.c<? super b2>, Object> f5505e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ScrollDraggableState$drag$2(ScrollDraggableState scrollDraggableState, yh.p<? super d, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super ScrollDraggableState$drag$2> cVar) {
        super(2, cVar);
        this.f5504d = scrollDraggableState;
        this.f5505e = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d m mVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ScrollDraggableState$drag$2) create(mVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ScrollDraggableState$drag$2 scrollDraggableState$drag$2 = new ScrollDraggableState$drag$2(this.f5504d, this.f5505e, cVar);
        scrollDraggableState$drag$2.f5503c = obj;
        return scrollDraggableState$drag$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5502b;
        if (i10 == 0) {
            t0.n(obj);
            this.f5504d.f((m) this.f5503c);
            yh.p<d, kotlin.coroutines.c<? super b2>, Object> pVar = this.f5505e;
            ScrollDraggableState scrollDraggableState = this.f5504d;
            this.f5502b = 1;
            if (pVar.invoke(scrollDraggableState, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
