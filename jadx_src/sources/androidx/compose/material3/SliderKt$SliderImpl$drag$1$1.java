package androidx.compose.material3;

import androidx.compose.runtime.m2;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SliderKt$SliderImpl$drag$1$1 extends SuspendLambda implements yh.q<kotlinx.coroutines.q0, Float, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ m2<yh.a<kotlin.b2>> f10669c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$SliderImpl$drag$1$1(m2<? extends yh.a<kotlin.b2>> m2Var, kotlin.coroutines.c<? super SliderKt$SliderImpl$drag$1$1> cVar) {
        super(3, cVar);
        this.f10669c = m2Var;
    }

    @dl.e
    public final Object a(@dl.d kotlinx.coroutines.q0 q0Var, float f10, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return new SliderKt$SliderImpl$drag$1$1(this.f10669c, cVar).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, Float f10, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return a(q0Var, f10.floatValue(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f10668b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        this.f10669c.getValue().invoke();
        return kotlin.b2.f124493a;
    }
}
