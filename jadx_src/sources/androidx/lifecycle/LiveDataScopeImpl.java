package androidx.lifecycle;

import android.annotation.SuppressLint;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.h1;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class LiveDataScopeImpl<T> implements f0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private CoroutineLiveData<T> f24060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final CoroutineContext f24061b;

    /* JADX INFO: renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f24062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LiveDataScopeImpl<T> f24063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f24064d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LiveDataScopeImpl<T> liveDataScopeImpl, T t10, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f24063c = liveDataScopeImpl;
            this.f24064d = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.f24063c, this.f24064d, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f24062b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                CoroutineLiveData<T> coroutineLiveDataC = this.f24063c.c();
                this.f24062b = 1;
                if (coroutineLiveDataC.v(this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            this.f24063c.c().r(this.f24064d);
            return b2.f124493a;
        }
    }

    public LiveDataScopeImpl(@dl.d CoroutineLiveData<T> target, @dl.d CoroutineContext context) {
        kotlin.jvm.internal.f0.p(target, "target");
        kotlin.jvm.internal.f0.p(context, "context");
        this.f24060a = target;
        this.f24061b = context.I(e1.e().t0());
    }

    @Override // androidx.lifecycle.f0
    @dl.e
    public Object a(@dl.d LiveData<T> liveData, @dl.d kotlin.coroutines.c<? super h1> cVar) {
        return kotlinx.coroutines.i.h(this.f24061b, new LiveDataScopeImpl$emitSource$2(this, liveData, null), cVar);
    }

    @Override // androidx.lifecycle.f0
    @dl.e
    public T b() {
        return this.f24060a.f();
    }

    @dl.d
    public final CoroutineLiveData<T> c() {
        return this.f24060a;
    }

    public final void d(@dl.d CoroutineLiveData<T> coroutineLiveData) {
        kotlin.jvm.internal.f0.p(coroutineLiveData, "<set-?>");
        this.f24060a = coroutineLiveData;
    }

    @Override // androidx.lifecycle.f0
    @dl.e
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        Object objH = kotlinx.coroutines.i.h(this.f24061b, new AnonymousClass2(this, t10, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }
}
