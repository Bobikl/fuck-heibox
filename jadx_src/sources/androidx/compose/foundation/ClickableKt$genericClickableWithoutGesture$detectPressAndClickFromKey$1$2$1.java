package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1", f = "Clickable.kt", i = {}, l = {bb.c.b.D7}, m = "invokeSuspend", n = {}, s = {})
public final class ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f4839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.g f4840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.i.b f4841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(androidx.compose.foundation.interaction.g gVar, androidx.compose.foundation.interaction.i.b bVar, kotlin.coroutines.c<? super ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1> cVar) {
        super(2, cVar);
        this.f4840c = gVar;
        this.f4841d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(this.f4840c, this.f4841d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f4839b;
        if (i10 == 0) {
            t0.n(obj);
            androidx.compose.foundation.interaction.g gVar = this.f4840c;
            androidx.compose.foundation.interaction.i.c cVar = new androidx.compose.foundation.interaction.i.c(this.f4841d);
            this.f4839b = 1;
            if (gVar.b(cVar, this) == objH) {
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
