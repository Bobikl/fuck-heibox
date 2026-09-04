package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AsyncPagingDataDiffer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Landroidx/paging/a0;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1", f = "AsyncPagingDataDiffer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super a0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AsyncPagingDataDiffer$differBase$1 f25394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b0 f25395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ b0 f25396e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1(AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1, b0 b0Var, b0 b0Var2, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25394c = asyncPagingDataDiffer$differBase$1;
        this.f25395d = b0Var;
        this.f25396e = b0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1(this.f25394c, this.f25395d, this.f25396e, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super a0> cVar) {
        return ((AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f25393b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        return c0.a(this.f25395d, this.f25396e, this.f25394c.f25384l.diffCallback);
    }
}
