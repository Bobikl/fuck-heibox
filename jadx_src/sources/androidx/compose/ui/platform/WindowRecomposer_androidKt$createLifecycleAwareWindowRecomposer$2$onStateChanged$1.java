package androidx.compose.ui.platform;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {bb.c.b.B4}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f15748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f15749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<c1> f15750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Recomposer f15751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.y f15752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f15753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ View f15754h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref.ObjectRef<c1> objectRef, Recomposer recomposer, androidx.lifecycle.y yVar, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, kotlin.coroutines.c<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1> cVar) {
        super(2, cVar);
        this.f15750d = objectRef;
        this.f15751e = recomposer;
        this.f15752f = yVar;
        this.f15753g = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.f15754h = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.f15750d, this.f15751e, this.f15752f, this.f15753g, this.f15754h, cVar);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.f15749c = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.d2 d2Var;
        kotlinx.coroutines.d2 d2VarF;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f15748b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d2Var = (kotlinx.coroutines.d2) this.f15749c;
            try {
                kotlin.t0.n(obj);
                if (d2Var != null) {
                    kotlinx.coroutines.d2.a.b(d2Var, null, 1, null);
                }
                this.f15752f.getLifecycle().d(this.f15753g);
                return kotlin.b2.f124493a;
            } catch (Throwable th2) {
                th = th2;
                if (d2Var != null) {
                    kotlinx.coroutines.d2.a.b(d2Var, null, 1, null);
                }
                this.f15752f.getLifecycle().d(this.f15753g);
                throw th;
            }
        }
        kotlin.t0.n(obj);
        kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f15749c;
        try {
            c1 c1Var = this.f15750d.f124891b;
            if (c1Var != null) {
                Context applicationContext = this.f15754h.getContext().getApplicationContext();
                kotlin.jvm.internal.f0.o(applicationContext, "context.applicationContext");
                kotlinx.coroutines.flow.u uVarE = WindowRecomposer_androidKt.e(applicationContext);
                c1Var.c(((Number) uVarE.getValue()).floatValue());
                d2VarF = kotlinx.coroutines.k.f(q0Var, null, null, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(uVarE, c1Var, null), 3, null);
            } else {
                d2VarF = null;
            }
            try {
                Recomposer recomposer = this.f15751e;
                this.f15749c = d2VarF;
                this.f15748b = 1;
                if (recomposer.L0(this) == objH) {
                    return objH;
                }
                d2Var = d2VarF;
                if (d2Var != null) {
                    kotlinx.coroutines.d2.a.b(d2Var, null, 1, null);
                }
                this.f15752f.getLifecycle().d(this.f15753g);
                return kotlin.b2.f124493a;
            } catch (Throwable th3) {
                d2Var = d2VarF;
                th = th3;
                if (d2Var != null) {
                    kotlinx.coroutines.d2.a.b(d2Var, null, 1, null);
                }
                this.f15752f.getLifecycle().d(this.f15753g);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            d2Var = null;
        }
    }
}
