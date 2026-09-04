package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
public final class BlockRunner$maybeRun$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f23961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f23962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BlockRunner<T> f23963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockRunner$maybeRun$1(BlockRunner<T> blockRunner, kotlin.coroutines.c<? super BlockRunner$maybeRun$1> cVar) {
        super(2, cVar);
        this.f23963d = blockRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1(this.f23963d, cVar);
        blockRunner$maybeRun$1.f23962c = obj;
        return blockRunner$maybeRun$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((BlockRunner$maybeRun$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f23961b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(((BlockRunner) this.f23963d).f23952a, ((kotlinx.coroutines.q0) this.f23962c).getCoroutineContext());
            yh.p pVar = ((BlockRunner) this.f23963d).f23953b;
            this.f23961b = 1;
            if (pVar.invoke(liveDataScopeImpl, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        ((BlockRunner) this.f23963d).f23956e.invoke();
        return b2.f124493a;
    }
}
