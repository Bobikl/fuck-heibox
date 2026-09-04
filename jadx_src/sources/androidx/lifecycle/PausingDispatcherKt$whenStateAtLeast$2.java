package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.d2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: PausingDispatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
public final class PausingDispatcherKt$whenStateAtLeast$2<T> extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super T>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f24068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f24069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Lifecycle f24070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Lifecycle.State f24071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super T>, Object> f24072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, kotlin.coroutines.c<? super PausingDispatcherKt$whenStateAtLeast$2> cVar) {
        super(2, cVar);
        this.f24070d = lifecycle;
        this.f24071e = state;
        this.f24072f = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.f24070d, this.f24071e, this.f24072f, cVar);
        pausingDispatcherKt$whenStateAtLeast$2.f24069c = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super T> cVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        t tVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f24068b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = (t) this.f24069c;
            try {
                kotlin.t0.n(obj);
                tVar.b();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                tVar.b();
                throw th;
            }
        }
        kotlin.t0.n(obj);
        d2 d2Var = (d2) ((kotlinx.coroutines.q0) this.f24069c).getCoroutineContext().f(d2.INSTANCE);
        if (d2Var == null) {
            throw new IllegalStateException("when[State] methods should have a parent job".toString());
        }
        l0 l0Var = new l0();
        t tVar2 = new t(this.f24070d, this.f24071e, l0Var.f24219d, d2Var);
        try {
            yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super T>, Object> pVar = this.f24072f;
            this.f24069c = tVar2;
            this.f24068b = 1;
            obj = kotlinx.coroutines.i.h(l0Var, pVar, this);
            if (obj == objH) {
                return objH;
            }
            tVar = tVar2;
            tVar.b();
            return obj;
        } catch (Throwable th3) {
            th = th3;
            tVar = tVar2;
            tVar.b();
            throw th;
        }
    }
}
