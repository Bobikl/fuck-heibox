package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Callable<R> f26943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.p<R> f26944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, kotlinx.coroutines.p<? super R> pVar, kotlin.coroutines.c<? super CoroutinesRoom$Companion$execute$4$job$1> cVar) {
        super(2, cVar);
        this.f26943c = callable;
        this.f26944d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.f26943c, this.f26944d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f26942b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        try {
            Object objCall = this.f26943c.call();
            kotlin.coroutines.c cVar = this.f26944d;
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(objCall));
        } catch (Throwable th2) {
            kotlin.coroutines.c cVar2 = this.f26944d;
            Result.a aVar2 = Result.f124476c;
            cVar2.resumeWith(Result.b(kotlin.t0.a(th2)));
        }
        return kotlin.b2.f124493a;
    }
}
