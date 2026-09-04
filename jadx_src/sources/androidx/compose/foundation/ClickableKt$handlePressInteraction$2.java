package androidx.compose.foundation;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.m2;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", i = {0, 1, 2}, l = {bb.c.b.D5, bb.c.b.F5, bb.c.b.M5, bb.c.b.N5, bb.c.b.W5}, m = "invokeSuspend", n = {"delayJob", "success", "releaseInteraction"}, s = {"L$0", "Z$0", "L$0"})
public final class ClickableKt$handlePressInteraction$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f4842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f4843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f4844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.gestures.k f4845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f4846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.g f4847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ a1<androidx.compose.foundation.interaction.i.b> f4848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ m2<yh.a<Boolean>> f4849i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ClickableKt$handlePressInteraction$2(androidx.compose.foundation.gestures.k kVar, long j10, androidx.compose.foundation.interaction.g gVar, a1<androidx.compose.foundation.interaction.i.b> a1Var, m2<? extends yh.a<Boolean>> m2Var, kotlin.coroutines.c<? super ClickableKt$handlePressInteraction$2> cVar) {
        super(2, cVar);
        this.f4845e = kVar;
        this.f4846f = j10;
        this.f4847g = gVar;
        this.f4848h = a1Var;
        this.f4849i = m2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.f4845e, this.f4846f, this.f4847g, this.f4848h, this.f4849i, cVar);
        clickableKt$handlePressInteraction$2.f4844d = obj;
        return clickableKt$handlePressInteraction$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ClickableKt$handlePressInteraction$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        d2 d2VarF;
        Object objH1;
        boolean z10;
        androidx.compose.foundation.interaction.i.b bVar;
        androidx.compose.foundation.interaction.i.c cVar;
        androidx.compose.foundation.interaction.g gVar;
        androidx.compose.foundation.interaction.i.c cVar2;
        androidx.compose.foundation.interaction.g gVar2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f4843c;
        if (i10 != 0) {
            if (i10 == 1) {
                d2VarF = (d2) this.f4844d;
                t0.n(obj);
                objH1 = obj;
            } else if (i10 == 2) {
                z10 = this.f4842b;
                t0.n(obj);
                if (z10) {
                    bVar = new androidx.compose.foundation.interaction.i.b(this.f4846f, null);
                    cVar = new androidx.compose.foundation.interaction.i.c(bVar);
                    gVar = this.f4847g;
                    this.f4844d = cVar;
                    this.f4843c = 3;
                    if (gVar.b(bVar, this) == objH) {
                        return objH;
                    }
                    cVar2 = cVar;
                    gVar2 = this.f4847g;
                    this.f4844d = null;
                    this.f4843c = 4;
                    if (gVar2.b(cVar2, this) == objH) {
                        return objH;
                    }
                }
            } else if (i10 == 3) {
                cVar2 = (androidx.compose.foundation.interaction.i.c) this.f4844d;
                t0.n(obj);
                gVar2 = this.f4847g;
                this.f4844d = null;
                this.f4843c = 4;
                if (gVar2.b(cVar2, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            this.f4848h.setValue(null);
            return b2.f124493a;
        }
        t0.n(obj);
        d2VarF = kotlinx.coroutines.k.f((q0) this.f4844d, null, null, new ClickableKt$handlePressInteraction$2$delayJob$1(this.f4849i, this.f4846f, this.f4847g, this.f4848h, null), 3, null);
        androidx.compose.foundation.gestures.k kVar = this.f4845e;
        this.f4844d = d2VarF;
        this.f4843c = 1;
        objH1 = kVar.h1(this);
        if (objH1 == objH) {
            return objH;
        }
        boolean zBooleanValue = ((Boolean) objH1).booleanValue();
        if (d2VarF.isActive()) {
            this.f4844d = null;
            this.f4842b = zBooleanValue;
            this.f4843c = 2;
            if (g2.l(d2VarF, this) == objH) {
                return objH;
            }
            z10 = zBooleanValue;
            if (z10) {
                bVar = new androidx.compose.foundation.interaction.i.b(this.f4846f, null);
                cVar = new androidx.compose.foundation.interaction.i.c(bVar);
                gVar = this.f4847g;
                this.f4844d = cVar;
                this.f4843c = 3;
                if (gVar.b(bVar, this) == objH) {
                    return objH;
                }
                cVar2 = cVar;
                gVar2 = this.f4847g;
                this.f4844d = null;
                this.f4843c = 4;
                if (gVar2.b(cVar2, this) == objH) {
                    return objH;
                }
            }
        } else {
            androidx.compose.foundation.interaction.i.b value = this.f4848h.getValue();
            if (value != null) {
                androidx.compose.foundation.interaction.g gVar3 = this.f4847g;
                androidx.compose.foundation.interaction.d cVar3 = zBooleanValue ? new androidx.compose.foundation.interaction.i.c(value) : new androidx.compose.foundation.interaction.i.a(value);
                this.f4844d = null;
                this.f4843c = 5;
                if (gVar3.b(cVar3, this) == objH) {
                    return objH;
                }
            }
        }
        this.f4848h.setValue(null);
        return b2.f124493a;
    }
}
