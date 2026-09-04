package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.a1;
import androidx.compose.ui.input.pointer.i0;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: ClickableText.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", f = "ClickableText.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class ClickableTextKt$ClickableText$pressIndicator$1$1 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f7667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a1<TextLayoutResult> f7668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.l<Integer, b2> f7669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ClickableTextKt$ClickableText$pressIndicator$1$1(a1<TextLayoutResult> a1Var, yh.l<? super Integer, b2> lVar, kotlin.coroutines.c<? super ClickableTextKt$ClickableText$pressIndicator$1$1> cVar) {
        super(2, cVar);
        this.f7668d = a1Var;
        this.f7669e = lVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ClickableTextKt$ClickableText$pressIndicator$1$1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ClickableTextKt$ClickableText$pressIndicator$1$1 clickableTextKt$ClickableText$pressIndicator$1$1 = new ClickableTextKt$ClickableText$pressIndicator$1$1(this.f7668d, this.f7669e, cVar);
        clickableTextKt$ClickableText$pressIndicator$1$1.f7667c = obj;
        return clickableTextKt$ClickableText$pressIndicator$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f7666b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f7667c;
            final a1<TextLayoutResult> a1Var = this.f7668d;
            final yh.l<Integer, b2> lVar = this.f7669e;
            yh.l<b1.f, b2> lVar2 = new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(long j10) {
                    TextLayoutResult value = a1Var.getValue();
                    if (value != null) {
                        lVar.invoke(Integer.valueOf(value.x(j10)));
                    }
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                    a(fVar.getF30368a());
                    return b2.f124493a;
                }
            };
            this.f7666b = 1;
            if (TapGestureDetectorKt.l(i0Var, null, null, null, lVar2, this, 7, null) == objH) {
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
