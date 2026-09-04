package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", i = {}, l = {bb.c.b.f31073z1}, m = "invokeSuspend", n = {}, s = {})
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f15735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Recomposer f15736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ View f15737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(Recomposer recomposer, View view, kotlin.coroutines.c<? super WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1> cVar) {
        super(2, cVar);
        this.f15736c = recomposer;
        this.f15737d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.f15736c, this.f15737d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f15735b;
        try {
            if (i10 == 0) {
                kotlin.t0.n(obj);
                Recomposer recomposer = this.f15736c;
                this.f15735b = 1;
                if (recomposer.w0(this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            if (WindowRecomposer_androidKt.f(this.f15737d) == this.f15736c) {
                WindowRecomposer_androidKt.j(this.f15737d, null);
            }
            return kotlin.b2.f124493a;
        } catch (Throwable th2) {
            if (WindowRecomposer_androidKt.f(this.f15737d) == this.f15736c) {
                WindowRecomposer_androidKt.j(this.f15737d, null);
            }
            throw th2;
        }
    }
}
