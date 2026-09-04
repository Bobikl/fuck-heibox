package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Landroidx/paging/q0;", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Pager$flow$2<Key, Value> extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super q0<Key, Value>>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.a f26005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pager$flow$2(yh.a aVar, kotlin.coroutines.c cVar) {
        super(1, cVar);
        this.f26005c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new Pager$flow$2(this.f26005c, completion);
    }

    @Override // yh.l
    public final Object invoke(Object obj) {
        return ((Pager$flow$2) create((kotlin.coroutines.c) obj)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f26004b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        return this.f26005c.invoke();
    }
}
