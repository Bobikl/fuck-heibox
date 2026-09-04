package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {bb.c.b.W8, bb.c.b.X8}, m = "invokeSuspend", n = {}, s = {})
public final class SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f14715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f14716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> f14717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(long j10, SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, kotlin.coroutines.c<? super SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1> cVar) {
        super(2, cVar);
        this.f14716c = j10;
        this.f14717d = pointerEventHandlerCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(this.f14716c, this.f14717d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.p pVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f14715b;
        if (i10 != 0) {
            if (i10 == 1) {
                t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            pVar = ((SuspendingPointerInputFilter.PointerEventHandlerCoroutine) this.f14717d).pointerAwaiter;
            if (pVar != null) {
                Result.a aVar = Result.f124476c;
                pVar.resumeWith(Result.b(t0.a(new PointerEventTimeoutCancellationException(this.f14716c))));
            }
            return b2.f124493a;
        }
        t0.n(obj);
        long j10 = this.f14716c - 1;
        this.f14715b = 1;
        if (DelayKt.b(j10, this) == objH) {
            return objH;
        }
        this.f14715b = 2;
        if (DelayKt.b(1L, this) == objH) {
            return objH;
        }
        pVar = ((SuspendingPointerInputFilter.PointerEventHandlerCoroutine) this.f14717d).pointerAwaiter;
        if (pVar != null) {
            Result.a aVar2 = Result.f124476c;
            pVar.resumeWith(Result.b(t0.a(new PointerEventTimeoutCancellationException(this.f14716c))));
        }
        return b2.f124493a;
    }
}
