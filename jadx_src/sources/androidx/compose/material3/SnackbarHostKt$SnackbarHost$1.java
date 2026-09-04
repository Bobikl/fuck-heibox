package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", i = {}, l = {bb.c.b.f31051y1}, m = "invokeSuspend", n = {}, s = {})
public final class SnackbarHostKt$SnackbarHost$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ l1 f10838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.c f10839d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$SnackbarHost$1(l1 l1Var, androidx.compose.ui.platform.c cVar, kotlin.coroutines.c<? super SnackbarHostKt$SnackbarHost$1> cVar2) {
        super(2, cVar2);
        this.f10838c = l1Var;
        this.f10839d = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new SnackbarHostKt$SnackbarHost$1(this.f10838c, this.f10839d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SnackbarHostKt$SnackbarHost$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f10837b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            l1 l1Var = this.f10838c;
            if (l1Var != null) {
                long jH = SnackbarHostKt.h(l1Var.getVisuals().getDuration(), this.f10838c.getVisuals().getActionLabel() != null, this.f10839d);
                this.f10837b = 1;
                if (DelayKt.b(jH, this) == objH) {
                    return objH;
                }
            }
            return kotlin.b2.f124493a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        this.f10838c.dismiss();
        return kotlin.b2.f124493a;
    }
}
