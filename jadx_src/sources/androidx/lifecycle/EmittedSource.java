package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.h1;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class EmittedSource implements h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final LiveData<?> f23986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final g0<?> f23987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23988d;

    /* JADX INFO: renamed from: androidx.lifecycle.EmittedSource$dispose$1, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23989b;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return EmittedSource.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f23989b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            EmittedSource.this.d();
            return b2.f124493a;
        }
    }

    public EmittedSource(@dl.d LiveData<?> source, @dl.d g0<?> mediator) {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(mediator, "mediator");
        this.f23986b = source;
        this.f23987c = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.k0
    public final void d() {
        if (this.f23988d) {
            return;
        }
        this.f23987c.t(this.f23986b);
        this.f23988d = true;
    }

    @dl.e
    public final Object b(@dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        Object objH = kotlinx.coroutines.i.h(e1.e().p0(), new EmittedSource$disposeNow$2(this, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    @Override // kotlinx.coroutines.h1
    public void dispose() {
        kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(e1.e().p0()), null, null, new AnonymousClass1(null), 3, null);
    }
}
