package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f12524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Recomposer f12525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ z f12526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1(Recomposer recomposer, z zVar, kotlin.coroutines.c<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1> cVar) {
        super(2, cVar);
        this.f12525c = recomposer;
        this.f12526d = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1(this.f12525c, this.f12526d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.p pVarL0;
        kotlin.coroutines.intrinsics.b.h();
        if (this.f12524b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        z zVarA0 = this.f12525c.A0(this.f12526d, null);
        Object obj2 = this.f12525c.stateLock;
        Recomposer recomposer = this.f12525c;
        synchronized (obj2) {
            if (zVarA0 != null) {
                try {
                    recomposer.compositionsAwaitingApply.add(zVarA0);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            recomposer.concurrentCompositionsOutstanding--;
            pVarL0 = recomposer.l0();
        }
        if (pVarL0 != null) {
            Result.a aVar = Result.f124476c;
            pVarL0.resumeWith(Result.b(kotlin.b2.f124493a));
        }
        return kotlin.b2.f124493a;
    }
}
