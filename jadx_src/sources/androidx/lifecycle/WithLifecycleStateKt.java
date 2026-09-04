package androidx.lifecycle;

import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;

/* JADX INFO: compiled from: WithLifecycleState.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,206:1\n154#1,8:207\n154#1,8:215\n154#1,8:223\n154#1,8:231\n43#1,5:239\n154#1,8:244\n43#1,5:252\n154#1,8:257\n154#1,8:265\n154#1,8:273\n154#1,8:281\n314#2,11:289\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:207,8\n58#1:215,8\n71#1:223,8\n84#1:231,8\n98#1:239,5\n98#1:244,8\n98#1:252,5\n98#1:257,8\n111#1:265,8\n124#1:273,8\n137#1:281,8\n177#1:289,11\n*E\n"})
public final class WithLifecycleStateKt {

    /* JADX INFO: compiled from: WithLifecycleState.kt */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Lifecycle f24150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f24151c;

        a(Lifecycle lifecycle, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            this.f24150b = lifecycle;
            this.f24151c = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f24150b.a(this.f24151c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, androidx.lifecycle.x] */
    @kotlin.r0
    @dl.e
    public static final <R> Object a(@dl.d final Lifecycle lifecycle, @dl.d final Lifecycle.State state, boolean z10, @dl.d final CoroutineDispatcher coroutineDispatcher, @dl.d final yh.a<? extends R> aVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        final kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        final ?? r10 = new v() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.v
            public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
                Object objB;
                kotlin.jvm.internal.f0.p(source, "source");
                kotlin.jvm.internal.f0.p(event, "event");
                if (event != Lifecycle.Event.Companion.d(state)) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.d(this);
                        kotlin.coroutines.c cVar2 = qVar;
                        Result.a aVar2 = Result.f124476c;
                        cVar2.resumeWith(Result.b(kotlin.t0.a(new LifecycleDestroyedException())));
                        return;
                    }
                    return;
                }
                lifecycle.d(this);
                kotlin.coroutines.c cVar3 = qVar;
                yh.a<R> aVar3 = aVar;
                try {
                    Result.a aVar4 = Result.f124476c;
                    objB = Result.b(aVar3.invoke());
                } catch (Throwable th2) {
                    Result.a aVar5 = Result.f124476c;
                    objB = Result.b(kotlin.t0.a(th2));
                }
                cVar3.resumeWith(objB);
            }
        };
        if (z10) {
            coroutineDispatcher.O(EmptyCoroutineContext.f124694b, new a(lifecycle, r10));
        } else {
            lifecycle.a(r10);
        }
        qVar.L(new yh.l<Throwable, b2>() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2

            /* JADX INFO: compiled from: WithLifecycleState.kt */
            public static final class a implements Runnable {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Lifecycle f24155b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f24156c;

                a(Lifecycle lifecycle, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
                    this.f24155b = lifecycle;
                    this.f24156c = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f24155b.d(this.f24156c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e Throwable th2) {
                CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f124694b;
                if (coroutineDispatcher2.V(emptyCoroutineContext)) {
                    coroutineDispatcher.O(emptyCoroutineContext, new a(lifecycle, r10));
                } else {
                    lifecycle.d(r10);
                }
            }
        });
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    @dl.e
    public static final <R> Object b(@dl.d Lifecycle lifecycle, @dl.d yh.a<? extends R> aVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        n2 n2VarT0 = e1.e().t0();
        boolean zV = n2VarT0.V(cVar.getCom.umeng.analytics.pro.d.R java.lang.String());
        if (!zV) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, state, zV, n2VarT0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @dl.e
    public static final <R> Object c(@dl.d y yVar, @dl.d yh.a<? extends R> aVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle lifecycle = yVar.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        n2 n2VarT0 = e1.e().t0();
        boolean zV = n2VarT0.V(cVar.getCom.umeng.analytics.pro.d.R java.lang.String());
        if (!zV) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, state, zV, n2VarT0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    private static final <R> Object d(Lifecycle lifecycle, yh.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        e1.e().t0();
        kotlin.jvm.internal.c0.e(3);
        throw null;
    }

    private static final <R> Object e(y yVar, yh.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        yVar.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        e1.e().t0();
        kotlin.jvm.internal.c0.e(3);
        throw null;
    }

    @dl.e
    public static final <R> Object f(@dl.d Lifecycle lifecycle, @dl.d yh.a<? extends R> aVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        n2 n2VarT0 = e1.e().t0();
        boolean zV = n2VarT0.V(cVar.getCom.umeng.analytics.pro.d.R java.lang.String());
        if (!zV) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, state, zV, n2VarT0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @dl.e
    public static final <R> Object g(@dl.d y yVar, @dl.d yh.a<? extends R> aVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle lifecycle = yVar.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        n2 n2VarT0 = e1.e().t0();
        boolean zV = n2VarT0.V(cVar.getCom.umeng.analytics.pro.d.R java.lang.String());
        if (!zV) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, state, zV, n2VarT0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    private static final <R> Object h(Lifecycle lifecycle, yh.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        e1.e().t0();
        kotlin.jvm.internal.c0.e(3);
        throw null;
    }

    private static final <R> Object i(y yVar, yh.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        yVar.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        e1.e().t0();
        kotlin.jvm.internal.c0.e(3);
        throw null;
    }

    @dl.e
    public static final <R> Object j(@dl.d Lifecycle lifecycle, @dl.d yh.a<? extends R> aVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        n2 n2VarT0 = e1.e().t0();
        boolean zV = n2VarT0.V(cVar.getCom.umeng.analytics.pro.d.R java.lang.String());
        if (!zV) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, state, zV, n2VarT0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @dl.e
    public static final <R> Object k(@dl.d y yVar, @dl.d yh.a<? extends R> aVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle lifecycle = yVar.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        n2 n2VarT0 = e1.e().t0();
        boolean zV = n2VarT0.V(cVar.getCom.umeng.analytics.pro.d.R java.lang.String());
        if (!zV) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, state, zV, n2VarT0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    private static final <R> Object l(Lifecycle lifecycle, yh.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        e1.e().t0();
        kotlin.jvm.internal.c0.e(3);
        throw null;
    }

    private static final <R> Object m(y yVar, yh.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        yVar.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        e1.e().t0();
        kotlin.jvm.internal.c0.e(3);
        throw null;
    }

    @dl.e
    public static final <R> Object n(@dl.d Lifecycle lifecycle, @dl.d Lifecycle.State state, @dl.d yh.a<? extends R> aVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        n2 n2VarT0 = e1.e().t0();
        boolean zV = n2VarT0.V(cVar.getCom.umeng.analytics.pro.d.R java.lang.String());
        if (!zV) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, state, zV, n2VarT0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @dl.e
    public static final <R> Object o(@dl.d y yVar, @dl.d Lifecycle.State state, @dl.d yh.a<? extends R> aVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle lifecycle = yVar.getLifecycle();
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        n2 n2VarT0 = e1.e().t0();
        boolean zV = n2VarT0.V(cVar.getCom.umeng.analytics.pro.d.R java.lang.String());
        if (!zV) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, state, zV, n2VarT0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    private static final <R> Object p(Lifecycle lifecycle, Lifecycle.State state, yh.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            e1.e().t0();
            kotlin.jvm.internal.c0.e(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    private static final <R> Object q(y yVar, Lifecycle.State state, yh.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        yVar.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            e1.e().t0();
            kotlin.jvm.internal.c0.e(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    @kotlin.r0
    @dl.e
    public static final <R> Object r(@dl.d Lifecycle lifecycle, @dl.d Lifecycle.State state, @dl.d yh.a<? extends R> aVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        n2 n2VarT0 = e1.e().t0();
        boolean zV = n2VarT0.V(cVar.getCom.umeng.analytics.pro.d.R java.lang.String());
        if (!zV) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, state, zV, n2VarT0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @kotlin.r0
    private static final <R> Object s(Lifecycle lifecycle, Lifecycle.State state, yh.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        e1.e().t0();
        kotlin.jvm.internal.c0.e(3);
        throw null;
    }
}
