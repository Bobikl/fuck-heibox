package androidx.compose.foundation;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.m2;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", i = {1}, l = {bb.c.b.f31033x5, bb.c.b.A5}, m = "invokeSuspend", n = {"pressInteraction"}, s = {"L$0"})
public final class ClickableKt$handlePressInteraction$2$delayJob$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f4850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f4851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ m2<yh.a<Boolean>> f4852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f4853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.g f4854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ a1<androidx.compose.foundation.interaction.i.b> f4855g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ClickableKt$handlePressInteraction$2$delayJob$1(m2<? extends yh.a<Boolean>> m2Var, long j10, androidx.compose.foundation.interaction.g gVar, a1<androidx.compose.foundation.interaction.i.b> a1Var, kotlin.coroutines.c<? super ClickableKt$handlePressInteraction$2$delayJob$1> cVar) {
        super(2, cVar);
        this.f4852d = m2Var;
        this.f4853e = j10;
        this.f4854f = gVar;
        this.f4855g = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.f4852d, this.f4853e, this.f4854f, this.f4855g, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        androidx.compose.foundation.interaction.i.b bVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f4851c;
        if (i10 != 0) {
            if (i10 == 1) {
                t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (androidx.compose.foundation.interaction.i.b) this.f4850b;
                t0.n(obj);
            }
            this.f4855g.setValue(bVar);
            return b2.f124493a;
        }
        t0.n(obj);
        if (this.f4852d.getValue().invoke().booleanValue()) {
            long jB = Clickable_androidKt.b();
            this.f4851c = 1;
            if (DelayKt.b(jB, this) == objH) {
                return objH;
            }
        }
        androidx.compose.foundation.interaction.i.b bVar2 = new androidx.compose.foundation.interaction.i.b(this.f4853e, null);
        androidx.compose.foundation.interaction.g gVar = this.f4854f;
        this.f4850b = bVar2;
        this.f4851c = 2;
        if (gVar.b(bVar2, this) == objH) {
            return objH;
        }
        bVar = bVar2;
        this.f4855g.setValue(bVar);
        return b2.f124493a;
    }
}
