package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/q0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", i = {0}, l = {69, 71}, m = "invokeSuspend", n = {"recomposer"}, s = {"L$0"})
public final class RecomposerKt$withRunningRecomposer$2<R> extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super R>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f12536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f12537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.q<kotlinx.coroutines.q0, Recomposer, kotlin.coroutines.c<? super R>, Object> f12538d;

    /* JADX INFO: renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Recomposer f12540c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Recomposer recomposer, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f12540c = recomposer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f12540c, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f12539b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                Recomposer recomposer = this.f12540c;
                this.f12539b = 1;
                if (recomposer.L0(this) == objH) {
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
    RecomposerKt$withRunningRecomposer$2(yh.q<? super kotlinx.coroutines.q0, ? super Recomposer, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, kotlin.coroutines.c<? super RecomposerKt$withRunningRecomposer$2> cVar) {
        super(2, cVar);
        this.f12538d = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        RecomposerKt$withRunningRecomposer$2 recomposerKt$withRunningRecomposer$2 = new RecomposerKt$withRunningRecomposer$2(this.f12538d, cVar);
        recomposerKt$withRunningRecomposer$2.f12537c = obj;
        return recomposerKt$withRunningRecomposer$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super R> cVar) {
        return ((RecomposerKt$withRunningRecomposer$2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Recomposer recomposer;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f12536b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f12537c;
            recomposer = new Recomposer(q0Var.getCoroutineContext());
            kotlinx.coroutines.k.f(q0Var, null, null, new AnonymousClass1(recomposer, null), 3, null);
            yh.q<kotlinx.coroutines.q0, Recomposer, kotlin.coroutines.c<? super R>, Object> qVar = this.f12538d;
            this.f12537c = recomposer;
            this.f12536b = 1;
            obj = qVar.invoke(q0Var, recomposer, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.f12537c;
                kotlin.t0.n(obj);
                return obj2;
            }
            recomposer = (Recomposer) this.f12537c;
            kotlin.t0.n(obj);
        }
        recomposer.j0();
        this.f12537c = obj;
        this.f12536b = 2;
        return recomposer.w0(this) == objH ? objH : obj;
    }
}
