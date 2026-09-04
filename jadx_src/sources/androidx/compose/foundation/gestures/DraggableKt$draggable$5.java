package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import s1.x;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ls1/x;", "velocity", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", i = {}, l = {bb.c.b.I0}, m = "invokeSuspend", n = {}, s = {})
public final class DraggableKt$draggable$5 extends SuspendLambda implements yh.q<q0, x, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ long f5416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.q<q0, Float, kotlin.coroutines.c<? super b2>, Object> f5417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Orientation f5418f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DraggableKt$draggable$5(yh.q<? super q0, ? super Float, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, Orientation orientation, kotlin.coroutines.c<? super DraggableKt$draggable$5> cVar) {
        super(3, cVar);
        this.f5417e = qVar;
        this.f5418f = orientation;
    }

    @dl.e
    public final Object a(@dl.d q0 q0Var, long j10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        DraggableKt$draggable$5 draggableKt$draggable$5 = new DraggableKt$draggable$5(this.f5417e, this.f5418f, cVar);
        draggableKt$draggable$5.f5415c = q0Var;
        draggableKt$draggable$5.f5416d = j10;
        return draggableKt$draggable$5.invokeSuspend(b2.f124493a);
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, x xVar, kotlin.coroutines.c<? super b2> cVar) {
        return a(q0Var, xVar.getF139264a(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5414b;
        if (i10 == 0) {
            t0.n(obj);
            q0 q0Var = (q0) this.f5415c;
            long j10 = this.f5416d;
            yh.q<q0, Float, kotlin.coroutines.c<? super b2>, Object> qVar = this.f5417e;
            Float fE = kotlin.coroutines.jvm.internal.a.e(DraggableKt.n(j10, this.f5418f));
            this.f5414b = 1;
            if (qVar.invoke(q0Var, fE, this) == objH) {
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
