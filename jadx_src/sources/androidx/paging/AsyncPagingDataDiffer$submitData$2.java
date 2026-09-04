package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AsyncPagingDataDiffer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.AsyncPagingDataDiffer$submitData$2", f = "AsyncPagingDataDiffer.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
public final class AsyncPagingDataDiffer$submitData$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AsyncPagingDataDiffer f25398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f25399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ o0 f25400e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncPagingDataDiffer$submitData$2(AsyncPagingDataDiffer asyncPagingDataDiffer, int i10, o0 o0Var, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25398c = asyncPagingDataDiffer;
        this.f25399d = i10;
        this.f25400e = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new AsyncPagingDataDiffer$submitData$2(this.f25398c, this.f25399d, this.f25400e, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((AsyncPagingDataDiffer$submitData$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25397b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            if (this.f25398c.submitDataId.get() == this.f25399d) {
                AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = this.f25398c.differBase;
                o0 o0Var = this.f25400e;
                this.f25397b = 1;
                if (asyncPagingDataDiffer$differBase$1.q(o0Var, this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
