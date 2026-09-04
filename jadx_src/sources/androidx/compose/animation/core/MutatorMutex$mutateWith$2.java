package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.d2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: InternalMutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/q0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {bb.c.b.f30851p0, 158}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class MutatorMutex$mutateWith$2<R> extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super R>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f4206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f4207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f4208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f4209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f4210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f4211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ MutatePriority f4212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ MutatorMutex f4213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ yh.p<T, kotlin.coroutines.c<? super R>, Object> f4214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ T f4215k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, T t10, kotlin.coroutines.c<? super MutatorMutex$mutateWith$2> cVar) {
        super(2, cVar);
        this.f4212h = mutatePriority;
        this.f4213i = mutatorMutex;
        this.f4214j = pVar;
        this.f4215k = t10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.f4212h, this.f4213i, this.f4214j, this.f4215k, cVar);
        mutatorMutex$mutateWith$2.f4211g = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super R> cVar) {
        return ((MutatorMutex$mutateWith$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.c] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.sync.c cVar;
        yh.p pVar;
        Object obj2;
        MutatorMutex.a aVar;
        MutatorMutex mutatorMutex;
        MutatorMutex.a aVar2;
        Throwable th2;
        MutatorMutex mutatorMutex2;
        kotlinx.coroutines.sync.c cVar2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        ?? r10 = this.f4210f;
        try {
            try {
                if (r10 == 0) {
                    kotlin.t0.n(obj);
                    kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f4211g;
                    MutatePriority mutatePriority = this.f4212h;
                    CoroutineContext.a aVarF = q0Var.getCoroutineContext().f(d2.INSTANCE);
                    kotlin.jvm.internal.f0.m(aVarF);
                    MutatorMutex.a aVar3 = new MutatorMutex.a(mutatePriority, (d2) aVarF);
                    this.f4213i.h(aVar3);
                    cVar = this.f4213i.mutex;
                    pVar = this.f4214j;
                    Object obj3 = this.f4215k;
                    MutatorMutex mutatorMutex3 = this.f4213i;
                    this.f4211g = aVar3;
                    this.f4206b = cVar;
                    this.f4207c = pVar;
                    this.f4208d = obj3;
                    this.f4209e = mutatorMutex3;
                    this.f4210f = 1;
                    if (cVar.e(null, this) == objH) {
                        return objH;
                    }
                    obj2 = obj3;
                    aVar = aVar3;
                    mutatorMutex = mutatorMutex3;
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.f4207c;
                        cVar2 = (kotlinx.coroutines.sync.c) this.f4206b;
                        aVar2 = (MutatorMutex.a) this.f4211g;
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
                    mutatorMutex = (MutatorMutex) this.f4209e;
                    obj2 = this.f4208d;
                    pVar = (yh.p) this.f4207c;
                    kotlinx.coroutines.sync.c cVar3 = (kotlinx.coroutines.sync.c) this.f4206b;
                    aVar = (MutatorMutex.a) this.f4211g;
                    kotlin.t0.n(obj);
                    cVar = cVar3;
                }
                this.f4211g = aVar;
                this.f4206b = cVar;
                this.f4207c = mutatorMutex;
                this.f4208d = null;
                this.f4209e = null;
                this.f4210f = 2;
                Object objInvoke = pVar.invoke(obj2, this);
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
