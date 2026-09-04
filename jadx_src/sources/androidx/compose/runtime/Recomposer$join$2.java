package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "it", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Recomposer$join$2 extends SuspendLambda implements yh.p<Recomposer.State, kotlin.coroutines.c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f12476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f12477c;

    Recomposer$join$2(kotlin.coroutines.c<? super Recomposer$join$2> cVar) {
        super(2, cVar);
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d Recomposer.State state, @dl.e kotlin.coroutines.c<? super Boolean> cVar) {
        return ((Recomposer$join$2) create(state, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(cVar);
        recomposer$join$2.f12477c = obj;
        return recomposer$join$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f12476b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        return kotlin.coroutines.jvm.internal.a.a(((Recomposer.State) this.f12477c) == Recomposer.State.ShutDown);
    }
}
