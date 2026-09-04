package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {bb.c.b.f30708ij}, m = "invokeSuspend", n = {}, s = {})
public final class AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 extends SuspendLambda implements yh.q<kotlinx.coroutines.q0, Float, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ float f8839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ d2 f8840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(d2 d2Var, kotlin.coroutines.c<? super AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1> cVar) {
        super(3, cVar);
        this.f8840d = d2Var;
    }

    @dl.e
    public final Object a(@dl.d kotlinx.coroutines.q0 q0Var, float f10, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(this.f8840d, cVar);
        appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1.f8839c = f10;
        return appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1.invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, Float f10, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return a(q0Var, f10.floatValue(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8838b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            float f10 = this.f8839c;
            TopAppBarState state = this.f8840d.getState();
            androidx.compose.animation.core.x<Float> xVarD = this.f8840d.d();
            androidx.compose.animation.core.h<Float> hVarC = this.f8840d.c();
            this.f8838b = 1;
            if (AppBarKt.x(state, f10, xVarD, hVarC, this) == objH) {
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
