package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", f = "Slider.kt", i = {}, l = {bb.c.b.Ol}, m = "invokeSuspend", n = {}, s = {})
public final class RangeSliderLogic$captureThumb$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ RangeSliderLogic f10396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f10397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.d f10398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RangeSliderLogic$captureThumb$1(RangeSliderLogic rangeSliderLogic, boolean z10, androidx.compose.foundation.interaction.d dVar, kotlin.coroutines.c<? super RangeSliderLogic$captureThumb$1> cVar) {
        super(2, cVar);
        this.f10396c = rangeSliderLogic;
        this.f10397d = z10;
        this.f10398e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new RangeSliderLogic$captureThumb$1(this.f10396c, this.f10397d, this.f10398e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((RangeSliderLogic$captureThumb$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f10395b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            androidx.compose.foundation.interaction.g gVarA = this.f10396c.a(this.f10397d);
            androidx.compose.foundation.interaction.d dVar = this.f10398e;
            this.f10395b = 1;
            if (gVarA.b(dVar, this) == objH) {
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
