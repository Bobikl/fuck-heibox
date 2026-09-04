package androidx.work;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: CoroutineWorker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutineWorker$startWork$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f28686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ CoroutineWorker f28687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineWorker$startWork$1(CoroutineWorker coroutineWorker, kotlin.coroutines.c<? super CoroutineWorker$startWork$1> cVar) {
        super(2, cVar);
        this.f28687c = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new CoroutineWorker$startWork$1(this.f28687c, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((CoroutineWorker$startWork$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f28686b;
        try {
            if (i10 == 0) {
                t0.n(obj);
                CoroutineWorker coroutineWorker = this.f28687c;
                this.f28686b = 1;
                obj = coroutineWorker.y(this);
                if (obj == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            this.f28687c.D().p((m.a) obj);
        } catch (Throwable th2) {
            this.f28687c.D().q(th2);
        }
        return b2.f124493a;
    }
}
