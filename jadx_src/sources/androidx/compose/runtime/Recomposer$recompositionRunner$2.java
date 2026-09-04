package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {bb.c.b.Yd}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
public final class Recomposer$recompositionRunner$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f12481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f12482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f12483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Recomposer f12484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.q<kotlinx.coroutines.q0, w0, kotlin.coroutines.c<? super kotlin.b2>, Object> f12485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ w0 f12486g;

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", i = {}, l = {bb.c.b.Zd}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f12488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.q<kotlinx.coroutines.q0, w0, kotlin.coroutines.c<? super kotlin.b2>, Object> f12489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f12490e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(yh.q<? super kotlinx.coroutines.q0, ? super w0, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> qVar, w0 w0Var, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f12489d = qVar;
            this.f12490e = w0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f12489d, this.f12490e, cVar);
            anonymousClass2.f12488c = obj;
            return anonymousClass2;
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f12487b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f12488c;
                yh.q<kotlinx.coroutines.q0, w0, kotlin.coroutines.c<? super kotlin.b2>, Object> qVar = this.f12489d;
                w0 w0Var = this.f12490e;
                this.f12487b = 1;
                if (qVar.invoke(q0Var, w0Var, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return kotlin.b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Recomposer$recompositionRunner$2(Recomposer recomposer, yh.q<? super kotlinx.coroutines.q0, ? super w0, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> qVar, w0 w0Var, kotlin.coroutines.c<? super Recomposer$recompositionRunner$2> cVar) {
        super(2, cVar);
        this.f12484e = recomposer;
        this.f12485f = qVar;
        this.f12486g = w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.f12484e, this.f12485f, this.f12486g, cVar);
        recomposer$recompositionRunner$2.f12483d = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((Recomposer$recompositionRunner$2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009b A[Catch: all -> 0x00b0, TryCatch #0 {, blocks: (B:26:0x0095, B:28:0x009b, B:29:0x009e), top: B:53:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc A[Catch: all -> 0x00df, TryCatch #4 {, blocks: (B:43:0x00c6, B:45:0x00cc, B:46:0x00cf), top: B:60:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.d2 d2VarB;
        androidx.compose.runtime.snapshots.d dVar;
        Throwable th2;
        Object obj2;
        Recomposer recomposer;
        Object obj3;
        Recomposer recomposer2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f12482c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (androidx.compose.runtime.snapshots.d) this.f12481b;
            d2VarB = (kotlinx.coroutines.d2) this.f12483d;
            try {
                kotlin.t0.n(obj);
                dVar.dispose();
                obj3 = this.f12484e.stateLock;
                recomposer2 = this.f12484e;
                synchronized (obj3) {
                    if (recomposer2.runnerJob == d2VarB) {
                        recomposer2.runnerJob = null;
                    }
                    recomposer2.l0();
                }
                Recomposer.INSTANCE.i(this.f12484e.recomposerInfo);
                return kotlin.b2.f124493a;
            } catch (Throwable th3) {
                th2 = th3;
                dVar.dispose();
                obj2 = this.f12484e.stateLock;
                recomposer = this.f12484e;
                synchronized (obj2) {
                    if (recomposer.runnerJob == d2VarB) {
                        recomposer.runnerJob = null;
                    }
                    recomposer.l0();
                    Recomposer.INSTANCE.i(this.f12484e.recomposerInfo);
                    throw th2;
                }
            }
        }
        kotlin.t0.n(obj);
        d2VarB = kotlinx.coroutines.g2.B(((kotlinx.coroutines.q0) this.f12483d).getCoroutineContext());
        this.f12484e.H0(d2VarB);
        androidx.compose.runtime.snapshots.f.Companion companion = androidx.compose.runtime.snapshots.f.INSTANCE;
        final Recomposer recomposer3 = this.f12484e;
        androidx.compose.runtime.snapshots.d dVarH = companion.h(new yh.p<Set<? extends Object>, androidx.compose.runtime.snapshots.f, kotlin.b2>() { // from class: androidx.compose.runtime.Recomposer$recompositionRunner$2$unregisterApplyObserver$1
            {
                super(2);
            }

            public final void a(@dl.d Set<? extends Object> changed, @dl.d androidx.compose.runtime.snapshots.f fVar) {
                kotlinx.coroutines.p pVarL0;
                kotlin.jvm.internal.f0.p(changed, "changed");
                kotlin.jvm.internal.f0.p(fVar, "<anonymous parameter 1>");
                Object obj4 = recomposer3.stateLock;
                Recomposer recomposer4 = recomposer3;
                synchronized (obj4) {
                    if (((Recomposer.State) recomposer4._state.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                        recomposer4.snapshotInvalidations.add(changed);
                        pVarL0 = recomposer4.l0();
                    } else {
                        pVarL0 = null;
                    }
                }
                if (pVarL0 != null) {
                    Result.a aVar = Result.f124476c;
                    pVarL0.resumeWith(Result.b(kotlin.b2.f124493a));
                }
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Set<? extends Object> set, androidx.compose.runtime.snapshots.f fVar) {
                a(set, fVar);
                return kotlin.b2.f124493a;
            }
        });
        Recomposer.INSTANCE.c(this.f12484e.recomposerInfo);
        try {
            Object obj4 = this.f12484e.stateLock;
            Recomposer recomposer4 = this.f12484e;
            synchronized (obj4) {
                List list = recomposer4.knownCompositions;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((z) list.get(i11)).w();
                }
                kotlin.b2 b2Var = kotlin.b2.f124493a;
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f12485f, this.f12486g, null);
            this.f12483d = d2VarB;
            this.f12481b = dVarH;
            this.f12482c = 1;
            if (kotlinx.coroutines.r0.g(anonymousClass2, this) == objH) {
                return objH;
            }
            dVar = dVarH;
            dVar.dispose();
            obj3 = this.f12484e.stateLock;
            recomposer2 = this.f12484e;
            synchronized (obj3) {
                if (recomposer2.runnerJob == d2VarB) {
                    recomposer2.runnerJob = null;
                }
                recomposer2.l0();
                Recomposer.INSTANCE.i(this.f12484e.recomposerInfo);
                return kotlin.b2.f124493a;
            }
        } catch (Throwable th4) {
            dVar = dVarH;
            th2 = th4;
            dVar.dispose();
            obj2 = this.f12484e.stateLock;
            recomposer = this.f12484e;
            synchronized (obj2) {
                if (recomposer.runnerJob == d2VarB) {
                    recomposer.runnerJob = null;
                }
                recomposer.l0();
            }
            Recomposer.INSTANCE.i(this.f12484e.recomposerInfo);
            throw th2;
        }
    }
}
