package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.d2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: InternalMutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/q0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {bb.c.b.f30851p0, 119}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class MutatorMutex$mutate$2<R> extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super R>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f4198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f4199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f4200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f4201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f4202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ MutatePriority f4203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ MutatorMutex f4204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ yh.l<kotlin.coroutines.c<? super R>, Object> f4205i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, yh.l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar, kotlin.coroutines.c<? super MutatorMutex$mutate$2> cVar) {
        super(2, cVar);
        this.f4203g = mutatePriority;
        this.f4204h = mutatorMutex;
        this.f4205i = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.f4203g, this.f4204h, this.f4205i, cVar);
        mutatorMutex$mutate$2.f4202f = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super R> cVar) {
        return ((MutatorMutex$mutate$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.c] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.sync.c cVar;
        yh.l<kotlin.coroutines.c<? super R>, Object> lVar;
        MutatorMutex.a aVar;
        MutatorMutex mutatorMutex;
        MutatorMutex.a aVar2;
        Throwable th2;
        MutatorMutex mutatorMutex2;
        kotlinx.coroutines.sync.c cVar2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        ?? r10 = this.f4201e;
        try {
            try {
                if (r10 == 0) {
                    kotlin.t0.n(obj);
                    kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f4202f;
                    MutatePriority mutatePriority = this.f4203g;
                    CoroutineContext.a aVarF = q0Var.getCoroutineContext().f(d2.INSTANCE);
                    kotlin.jvm.internal.f0.m(aVarF);
                    MutatorMutex.a aVar3 = new MutatorMutex.a(mutatePriority, (d2) aVarF);
                    this.f4204h.h(aVar3);
                    cVar = this.f4204h.mutex;
                    yh.l<kotlin.coroutines.c<? super R>, Object> lVar2 = this.f4205i;
                    MutatorMutex mutatorMutex3 = this.f4204h;
                    this.f4202f = aVar3;
                    this.f4198b = cVar;
                    this.f4199c = lVar2;
                    this.f4200d = mutatorMutex3;
                    this.f4201e = 1;
                    if (cVar.e(null, this) == objH) {
                        return objH;
                    }
                    lVar = lVar2;
                    aVar = aVar3;
                    mutatorMutex = mutatorMutex3;
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.f4199c;
                        cVar2 = (kotlinx.coroutines.sync.c) this.f4198b;
                        aVar2 = (MutatorMutex.a) this.f4202f;
                        try {
                            kotlin.t0.n(obj);
                            s0.a(mutatorMutex2.currentMutator, aVar2, null);
                            cVar2.f(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            s0.a(mutatorMutex2.currentMutator, aVar2, null);
                            throw th2;
                        }
                    }
                    mutatorMutex = (MutatorMutex) this.f4200d;
                    lVar = (yh.l) this.f4199c;
                    kotlinx.coroutines.sync.c cVar3 = (kotlinx.coroutines.sync.c) this.f4198b;
                    aVar = (MutatorMutex.a) this.f4202f;
                    kotlin.t0.n(obj);
                    cVar = cVar3;
                }
                this.f4202f = aVar;
                this.f4198b = cVar;
                this.f4199c = mutatorMutex;
                this.f4200d = null;
                this.f4201e = 2;
                Object objInvoke = lVar.invoke(this);
                if (objInvoke == objH) {
                    return objH;
                }
                mutatorMutex2 = mutatorMutex;
                cVar2 = cVar;
                obj = objInvoke;
                aVar2 = aVar;
                s0.a(mutatorMutex2.currentMutator, aVar2, null);
                cVar2.f(null);
                return obj;
            } catch (Throwable th4) {
                aVar2 = aVar;
                th2 = th4;
                mutatorMutex2 = mutatorMutex;
                s0.a(mutatorMutex2.currentMutator, aVar2, null);
                throw th2;
            }
        } catch (Throwable th5) {
            r10.f(null);
            throw th5;
        }
    }
}
