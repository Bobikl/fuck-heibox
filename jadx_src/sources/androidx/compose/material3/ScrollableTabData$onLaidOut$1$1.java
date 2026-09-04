package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", i = {}, l = {bb.c.b.G5}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollableTabData$onLaidOut$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ScrollableTabData f10465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f10466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableTabData$onLaidOut$1$1(ScrollableTabData scrollableTabData, int i10, kotlin.coroutines.c<? super ScrollableTabData$onLaidOut$1$1> cVar) {
        super(2, cVar);
        this.f10465c = scrollableTabData;
        this.f10466d = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new ScrollableTabData$onLaidOut$1$1(this.f10465c, this.f10466d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((ScrollableTabData$onLaidOut$1$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f10464b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            ScrollState scrollState = this.f10465c.scrollState;
            int i11 = this.f10466d;
            androidx.compose.animation.core.h<Float> hVar = TabRowKt.f11257c;
            this.f10464b = 1;
            if (scrollState.h(i11, hVar, this) == objH) {
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
