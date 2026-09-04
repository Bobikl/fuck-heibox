package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1", f = "Recomposer.kt", i = {}, l = {bb.c.b.f30516ab}, m = "invokeSuspend", n = {}, s = {})
public final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f12527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Recomposer f12528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ w0 f12529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ h1 f12530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(Recomposer recomposer, w0 w0Var, h1 h1Var, kotlin.coroutines.c<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1> cVar) {
        super(2, cVar);
        this.f12528c = recomposer;
        this.f12529d = w0Var;
        this.f12530e = h1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.f12528c, this.f12529d, this.f12530e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f12527b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            Recomposer recomposer = this.f12528c;
            w0 w0Var = this.f12529d;
            h1 h1Var = this.f12530e;
            this.f12527b = 1;
            if (recomposer.K0(w0Var, h1Var, this) == objH) {
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
