package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", f = "TextFieldSelectionManager.kt", i = {}, l = {bb.c.b.Rc}, m = "invokeSuspend", n = {}, s = {})
public final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$1 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f8308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.text.r f8309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(androidx.compose.foundation.text.r rVar, kotlin.coroutines.c<? super TextFieldSelectionManagerKt$TextFieldSelectionHandle$1> cVar) {
        super(2, cVar);
        this.f8309d = rVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TextFieldSelectionManagerKt$TextFieldSelectionHandle$1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TextFieldSelectionManagerKt$TextFieldSelectionHandle$1 textFieldSelectionManagerKt$TextFieldSelectionHandle$1 = new TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(this.f8309d, cVar);
        textFieldSelectionManagerKt$TextFieldSelectionHandle$1.f8308c = obj;
        return textFieldSelectionManagerKt$TextFieldSelectionHandle$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8307b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f8308c;
            androidx.compose.foundation.text.r rVar = this.f8309d;
            this.f8307b = 1;
            if (LongPressTextDragObserverKt.c(i0Var, rVar, this) == objH) {
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
