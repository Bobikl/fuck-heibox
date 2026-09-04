package androidx.compose.foundation;

import androidx.compose.runtime.a1;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2$1", f = "Hoverable.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class HoverableKt$hoverable$2$2$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f4917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f4918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a1<androidx.compose.foundation.interaction.c.a> f4919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.g f4920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoverableKt$hoverable$2$2$1(boolean z10, a1<androidx.compose.foundation.interaction.c.a> a1Var, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.c<? super HoverableKt$hoverable$2$2$1> cVar) {
        super(2, cVar);
        this.f4918c = z10;
        this.f4919d = a1Var;
        this.f4920e = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new HoverableKt$hoverable$2$2$1(this.f4918c, this.f4919d, this.f4920e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((HoverableKt$hoverable$2$2$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f4917b;
        if (i10 == 0) {
            t0.n(obj);
            if (!this.f4918c) {
                a1<androidx.compose.foundation.interaction.c.a> a1Var = this.f4919d;
                androidx.compose.foundation.interaction.g gVar = this.f4920e;
                this.f4917b = 1;
                if (HoverableKt$hoverable$2.f(a1Var, gVar, this) == objH) {
                    return objH;
                }
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
