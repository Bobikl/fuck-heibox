package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ContiguousPagedList.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", androidx.exifinterface.media.a.X4, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1", f = "ContiguousPagedList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ContiguousPagedList$tryDispatchBoundaryCallbacks$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ContiguousPagedList f25489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f25490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f25491e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContiguousPagedList$tryDispatchBoundaryCallbacks$1(ContiguousPagedList contiguousPagedList, boolean z10, boolean z11, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25489c = contiguousPagedList;
        this.f25490d = z10;
        this.f25491e = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new ContiguousPagedList$tryDispatchBoundaryCallbacks$1(this.f25489c, this.f25490d, this.f25491e, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((ContiguousPagedList$tryDispatchBoundaryCallbacks$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f25488b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        this.f25489c.v0(this.f25490d, this.f25491e);
        return b2.f124493a;
    }
}
