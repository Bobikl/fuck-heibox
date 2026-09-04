package androidx.work;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: CoroutineWorker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutineWorker$getForegroundInfoAsync$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f28682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f28683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ JobListenableFuture<h> f28684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ CoroutineWorker f28685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineWorker$getForegroundInfoAsync$1(JobListenableFuture<h> jobListenableFuture, CoroutineWorker coroutineWorker, kotlin.coroutines.c<? super CoroutineWorker$getForegroundInfoAsync$1> cVar) {
        super(2, cVar);
        this.f28684d = jobListenableFuture;
        this.f28685e = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.f28684d, this.f28685e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((CoroutineWorker$getForegroundInfoAsync$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        JobListenableFuture jobListenableFuture;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f28683c;
        if (i10 == 0) {
            t0.n(obj);
            JobListenableFuture<h> jobListenableFuture2 = this.f28684d;
            CoroutineWorker coroutineWorker = this.f28685e;
            this.f28682b = jobListenableFuture2;
            this.f28683c = 1;
            Object objB = coroutineWorker.B(this);
            if (objB == objH) {
                return objH;
            }
            jobListenableFuture = jobListenableFuture2;
            obj = objB;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jobListenableFuture = (JobListenableFuture) this.f28682b;
            t0.n(obj);
        }
        jobListenableFuture.b(obj);
        return b2.f124493a;
    }
}
