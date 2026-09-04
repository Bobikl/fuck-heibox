package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
/* JADX INFO: compiled from: SuspendingPagingSourceFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Landroidx/paging/q0;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SuspendingPagingSourceFactory$create$2", f = "SuspendingPagingSourceFactory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SuspendingPagingSourceFactory$create$2<Key, Value> extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super q0<Key, Value>>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SuspendingPagingSourceFactory f26350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendingPagingSourceFactory$create$2(SuspendingPagingSourceFactory suspendingPagingSourceFactory, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f26350c = suspendingPagingSourceFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new SuspendingPagingSourceFactory$create$2(this.f26350c, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, Object obj) {
        return ((SuspendingPagingSourceFactory$create$2) create(q0Var, (kotlin.coroutines.c) obj)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f26349b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        return this.f26350c.f26348c.invoke();
    }
}
