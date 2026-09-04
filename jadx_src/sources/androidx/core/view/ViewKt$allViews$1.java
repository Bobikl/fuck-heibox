package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {414, 416}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements yh.p<kotlin.sequences.o<? super View>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f21315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f21316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ View f21317e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewKt$allViews$1(View view, kotlin.coroutines.c<? super ViewKt$allViews$1> cVar) {
        super(2, cVar);
        this.f21317e = view;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.sequences.o<? super View> oVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((ViewKt$allViews$1) create(oVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.f21317e, cVar);
        viewKt$allViews$1.f21316d = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.sequences.o oVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f21315c;
        if (i10 != 0) {
            if (i10 == 1) {
                oVar = (kotlin.sequences.o) this.f21316d;
                kotlin.t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return kotlin.b2.f124493a;
        }
        kotlin.t0.n(obj);
        oVar = (kotlin.sequences.o) this.f21316d;
        View view = this.f21317e;
        this.f21316d = oVar;
        this.f21315c = 1;
        if (oVar.a(view, this) == objH) {
            return objH;
        }
        View view2 = this.f21317e;
        if (view2 instanceof ViewGroup) {
            kotlin.sequences.m<View> mVarF = ViewGroupKt.f((ViewGroup) view2);
            this.f21316d = null;
            this.f21315c = 2;
            if (oVar.e(mVarF, this) == objH) {
                return objH;
            }
        }
        return kotlin.b2.f124493a;
    }
}
