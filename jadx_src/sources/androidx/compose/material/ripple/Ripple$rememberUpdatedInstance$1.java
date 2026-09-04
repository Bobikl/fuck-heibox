package androidx.compose.material.ripple;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", i = {}, l = {bb.c.b.S3}, m = "invokeSuspend", n = {}, s = {})
public final class Ripple$rememberUpdatedInstance$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f8440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.e f8441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ i f8442e;

    /* JADX INFO: compiled from: Collect.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    public static final class a implements kotlinx.coroutines.flow.f<androidx.compose.foundation.interaction.d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f8443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q0 f8444c;

        public a(i iVar, q0 q0Var) {
            this.f8443b = iVar;
            this.f8444c = q0Var;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public Object emit(androidx.compose.foundation.interaction.d dVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            androidx.compose.foundation.interaction.d dVar2 = dVar;
            if (dVar2 instanceof androidx.compose.foundation.interaction.i.b) {
                this.f8443b.e((androidx.compose.foundation.interaction.i.b) dVar2, this.f8444c);
            } else if (dVar2 instanceof androidx.compose.foundation.interaction.i.c) {
                this.f8443b.g(((androidx.compose.foundation.interaction.i.c) dVar2).getPress());
            } else if (dVar2 instanceof androidx.compose.foundation.interaction.i.a) {
                this.f8443b.g(((androidx.compose.foundation.interaction.i.a) dVar2).getPress());
            } else {
                this.f8443b.h(dVar2, this.f8444c);
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Ripple$rememberUpdatedInstance$1(androidx.compose.foundation.interaction.e eVar, i iVar, kotlin.coroutines.c<? super Ripple$rememberUpdatedInstance$1> cVar) {
        super(2, cVar);
        this.f8441d = eVar;
        this.f8442e = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.f8441d, this.f8442e, cVar);
        ripple$rememberUpdatedInstance$1.f8440c = obj;
        return ripple$rememberUpdatedInstance$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((Ripple$rememberUpdatedInstance$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8439b;
        if (i10 == 0) {
            t0.n(obj);
            q0 q0Var = (q0) this.f8440c;
            kotlinx.coroutines.flow.e<androidx.compose.foundation.interaction.d> eVarC = this.f8441d.c();
            a aVar = new a(this.f8442e, q0Var);
            this.f8439b = 1;
            if (eVarC.a(aVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
