package androidx.lifecycle;

import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f24075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f24076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Lifecycle f24077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Lifecycle.State f24078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> f24079f;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
    @kotlin.jvm.internal.t0({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f24080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f24081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f24082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f24083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f24084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f24085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f24086h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Lifecycle f24087i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Lifecycle.State f24088j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.q0 f24089k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> f24090l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, kotlinx.coroutines.q0 q0Var, yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f24087i = lifecycle;
            this.f24088j = state;
            this.f24089k = q0Var;
            this.f24090l = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f24087i, this.f24088j, this.f24089k, this.f24090l, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
        /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            d2 d2Var;
            v vVar;
            d2 d2Var2;
            v vVar2;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f24086h;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (Ref.ObjectRef) this.f24081c;
                objectRef = (Ref.ObjectRef) this.f24080b;
                try {
                    kotlin.t0.n(obj);
                    d2Var2 = (d2) objectRef.f124891b;
                    if (d2Var2 != null) {
                        d2.a.b(d2Var2, null, 1, null);
                    }
                    vVar2 = (v) objectRef2.f124891b;
                    if (vVar2 != null) {
                        this.f24087i.d(vVar2);
                    }
                    return b2.f124493a;
                } catch (Throwable th2) {
                    th = th2;
                    d2Var = (d2) objectRef.f124891b;
                    if (d2Var != null) {
                        d2.a.b(d2Var, null, 1, null);
                    }
                    vVar = (v) objectRef2.f124891b;
                    if (vVar != null) {
                        this.f24087i.d(vVar);
                    }
                    throw th;
                }
            }
            kotlin.t0.n(obj);
            if (this.f24087i.b() == Lifecycle.State.DESTROYED) {
                return b2.f124493a;
            }
            final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            try {
                Lifecycle.State state = this.f24088j;
                Lifecycle lifecycle = this.f24087i;
                final kotlinx.coroutines.q0 q0Var = this.f24089k;
                final yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> pVar = this.f24090l;
                this.f24080b = objectRef3;
                this.f24081c = objectRef4;
                this.f24082d = state;
                this.f24083e = lifecycle;
                this.f24084f = q0Var;
                this.f24085g = pVar;
                this.f24086h = 1;
                final kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(this), 1);
                qVar.F0();
                Lifecycle.Event.a aVar = Lifecycle.Event.Companion;
                final Lifecycle.Event eventD = aVar.d(state);
                final Lifecycle.Event eventA = aVar.a(state);
                final kotlinx.coroutines.sync.c cVarB = MutexKt.b(false, 1, null);
                ?? r10 = new v() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
                    @kotlin.jvm.internal.t0({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,165:1\n107#2,10:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n*L\n109#1:166,10\n*E\n"})
                    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {bb.c.b.f30851p0, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
                    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        Object f24098b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        Object f24099c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        int f24100d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        final /* synthetic */ kotlinx.coroutines.sync.c f24101e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        final /* synthetic */ yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> f24102f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(kotlinx.coroutines.sync.c cVar, yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super AnonymousClass1> cVar2) {
                            super(2, cVar2);
                            this.f24101e = cVar;
                            this.f24102f = pVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.d
                        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass1(this.f24101e, this.f24102f, cVar);
                        }

                        @Override // yh.p
                        @dl.e
                        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.e
                        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                            kotlinx.coroutines.sync.c cVar;
                            yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> pVar;
                            kotlinx.coroutines.sync.c cVar2;
                            Throwable th2;
                            Object objH = kotlin.coroutines.intrinsics.b.h();
                            int i10 = this.f24100d;
                            try {
                                if (i10 == 0) {
                                    kotlin.t0.n(obj);
                                    cVar = this.f24101e;
                                    pVar = this.f24102f;
                                    this.f24098b = cVar;
                                    this.f24099c = pVar;
                                    this.f24100d = 1;
                                    if (cVar.e(null, this) == objH) {
                                        return objH;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        if (i10 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        cVar2 = (kotlinx.coroutines.sync.c) this.f24098b;
                                        try {
                                            kotlin.t0.n(obj);
                                            b2 b2Var = b2.f124493a;
                                            cVar2.f(null);
                                            return b2Var;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            cVar2.f(null);
                                            throw th2;
                                        }
                                    }
                                    pVar = (yh.p) this.f24099c;
                                    kotlinx.coroutines.sync.c cVar3 = (kotlinx.coroutines.sync.c) this.f24098b;
                                    kotlin.t0.n(obj);
                                    cVar = cVar3;
                                }
                                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(pVar, null);
                                this.f24098b = cVar;
                                this.f24099c = null;
                                this.f24100d = 2;
                                if (kotlinx.coroutines.r0.g(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == objH) {
                                    return objH;
                                }
                                cVar2 = cVar;
                                b2 b2Var2 = b2.f124493a;
                                cVar2.f(null);
                                return b2Var2;
                            } catch (Throwable th4) {
                                cVar2 = cVar;
                                th2 = th4;
                                cVar2.f(null);
                                throw th2;
                            }
                        }
                    }

                    /* JADX WARN: Type inference failed for: r9v5, types: [T, kotlinx.coroutines.d2] */
                    @Override // androidx.lifecycle.v
                    public final void d(@dl.d y yVar, @dl.d Lifecycle.Event event) {
                        kotlin.jvm.internal.f0.p(yVar, "<anonymous parameter 0>");
                        kotlin.jvm.internal.f0.p(event, "event");
                        if (event == eventD) {
                            objectRef3.f124891b = kotlinx.coroutines.k.f(q0Var, null, null, new AnonymousClass1(cVarB, pVar, null), 3, null);
                            return;
                        }
                        if (event == eventA) {
                            d2 d2Var3 = objectRef3.f124891b;
                            if (d2Var3 != null) {
                                d2.a.b(d2Var3, null, 1, null);
                            }
                            objectRef3.f124891b = null;
                        }
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            kotlinx.coroutines.p<b2> pVar2 = qVar;
                            Result.a aVar2 = Result.f124476c;
                            pVar2.resumeWith(Result.b(b2.f124493a));
                        }
                    }
                };
                objectRef4.f124891b = r10;
                kotlin.jvm.internal.f0.n(r10, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                lifecycle.a((v) r10);
                Object objT = qVar.t();
                if (objT == kotlin.coroutines.intrinsics.b.h()) {
                    kotlin.coroutines.jvm.internal.f.c(this);
                }
                if (objT == objH) {
                    return objH;
                }
                objectRef = objectRef3;
                objectRef2 = objectRef4;
                d2Var2 = (d2) objectRef.f124891b;
                if (d2Var2 != null) {
                    d2.a.b(d2Var2, null, 1, null);
                }
                vVar2 = (v) objectRef2.f124891b;
                if (vVar2 != null) {
                    this.f24087i.d(vVar2);
                }
                return b2.f124493a;
            } catch (Throwable th3) {
                th = th3;
                objectRef = objectRef3;
                objectRef2 = objectRef4;
                d2Var = (d2) objectRef.f124891b;
                if (d2Var != null) {
                    d2.a.b(d2Var, null, 1, null);
                }
                vVar = (v) objectRef2.f124891b;
                if (vVar != null) {
                    this.f24087i.d(vVar);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> cVar) {
        super(2, cVar);
        this.f24077d = lifecycle;
        this.f24078e = state;
        this.f24079f = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f24077d, this.f24078e, this.f24079f, cVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f24076c = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f24075b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f24076c;
            n2 n2VarT0 = e1.e().t0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24077d, this.f24078e, q0Var, this.f24079f, null);
            this.f24075b = 1;
            if (kotlinx.coroutines.i.h(n2VarT0, anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
