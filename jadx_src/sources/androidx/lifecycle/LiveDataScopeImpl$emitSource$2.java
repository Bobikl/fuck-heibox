package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.h1;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
public final class LiveDataScopeImpl$emitSource$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super h1>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f24065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ LiveDataScopeImpl<T> f24066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ LiveData<T> f24067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveDataScopeImpl$emitSource$2(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, kotlin.coroutines.c<? super LiveDataScopeImpl$emitSource$2> cVar) {
        super(2, cVar);
        this.f24066c = liveDataScopeImpl;
        this.f24067d = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new LiveDataScopeImpl$emitSource$2(this.f24066c, this.f24067d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super h1> cVar) {
        return ((LiveDataScopeImpl$emitSource$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f24065b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            CoroutineLiveData coroutineLiveDataC = this.f24066c.c();
            Object obj2 = this.f24067d;
            this.f24065b = 1;
            obj = coroutineLiveDataC.w(obj2, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return obj;
    }
}
