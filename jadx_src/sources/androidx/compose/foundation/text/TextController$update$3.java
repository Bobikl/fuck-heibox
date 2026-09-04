package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: CoreText.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.TextController$update$3", f = "CoreText.kt", i = {}, l = {bb.c.b.f31008w2}, m = "invokeSuspend", n = {}, s = {})
public final class TextController$update$3 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f7903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TextController.b f7904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextController$update$3(TextController.b bVar, kotlin.coroutines.c<? super TextController$update$3> cVar) {
        super(2, cVar);
        this.f7904d = bVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TextController$update$3) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TextController$update$3 textController$update$3 = new TextController$update$3(this.f7904d, cVar);
        textController$update$3.f7903c = obj;
        return textController$update$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f7902b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f7903c;
            TextController.b bVar = this.f7904d;
            this.f7902b = 1;
            if (TextSelectionMouseDetectorKt.c(i0Var, bVar, this) == objH) {
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
