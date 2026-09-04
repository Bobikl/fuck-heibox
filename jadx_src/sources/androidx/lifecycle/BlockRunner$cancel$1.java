package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
public final class BlockRunner$cancel$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f23959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BlockRunner<T> f23960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockRunner$cancel$1(BlockRunner<T> blockRunner, kotlin.coroutines.c<? super BlockRunner$cancel$1> cVar) {
        super(2, cVar);
        this.f23960c = blockRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new BlockRunner$cancel$1(this.f23960c, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((BlockRunner$cancel$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f23959b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            long j10 = ((BlockRunner) this.f23960c).f23954c;
            this.f23959b = 1;
            if (DelayKt.b(j10, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        if (!((BlockRunner) this.f23960c).f23952a.h()) {
            d2 d2Var = ((BlockRunner) this.f23960c).f23957f;
            if (d2Var != null) {
                d2.a.b(d2Var, null, 1, null);
            }
            ((BlockRunner) this.f23960c).f23957f = null;
        }
        return b2.f124493a;
    }
}
