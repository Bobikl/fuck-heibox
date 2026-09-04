package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6$2$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {bb.c.b.f31075z3}, m = "invokeSuspend", n = {}, s = {})
public final class SuspendingPointerInputFilterKt$pointerInput$6$2$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f14747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f14748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SuspendingPointerInputFilter f14749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p<i0, kotlin.coroutines.c<? super b2>, Object> f14750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SuspendingPointerInputFilterKt$pointerInput$6$2$1(SuspendingPointerInputFilter suspendingPointerInputFilter, yh.p<? super i0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super SuspendingPointerInputFilterKt$pointerInput$6$2$1> cVar) {
        super(2, cVar);
        this.f14749d = suspendingPointerInputFilter;
        this.f14750e = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SuspendingPointerInputFilterKt$pointerInput$6$2$1 suspendingPointerInputFilterKt$pointerInput$6$2$1 = new SuspendingPointerInputFilterKt$pointerInput$6$2$1(this.f14749d, this.f14750e, cVar);
        suspendingPointerInputFilterKt$pointerInput$6$2$1.f14748c = obj;
        return suspendingPointerInputFilterKt$pointerInput$6$2$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SuspendingPointerInputFilterKt$pointerInput$6$2$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f14747b;
        if (i10 == 0) {
            t0.n(obj);
            this.f14749d.N0((q0) this.f14748c);
            yh.p<i0, kotlin.coroutines.c<? super b2>, Object> pVar = this.f14750e;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.f14749d;
            this.f14747b = 1;
            if (pVar.invoke(suspendingPointerInputFilter, this) == objH) {
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
