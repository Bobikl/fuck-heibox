package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: TextFieldGestureModifiers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$mouseDragGestureDetector$1", f = "TextFieldGestureModifiers.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class TextFieldGestureModifiersKt$mouseDragGestureDetector$1 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f7927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.text.selection.e f7928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldGestureModifiersKt$mouseDragGestureDetector$1(androidx.compose.foundation.text.selection.e eVar, kotlin.coroutines.c<? super TextFieldGestureModifiersKt$mouseDragGestureDetector$1> cVar) {
        super(2, cVar);
        this.f7928d = eVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TextFieldGestureModifiersKt$mouseDragGestureDetector$1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TextFieldGestureModifiersKt$mouseDragGestureDetector$1 textFieldGestureModifiersKt$mouseDragGestureDetector$1 = new TextFieldGestureModifiersKt$mouseDragGestureDetector$1(this.f7928d, cVar);
        textFieldGestureModifiersKt$mouseDragGestureDetector$1.f7927c = obj;
        return textFieldGestureModifiersKt$mouseDragGestureDetector$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f7926b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f7927c;
            androidx.compose.foundation.text.selection.e eVar = this.f7928d;
            this.f7926b = 1;
            if (TextSelectionMouseDetectorKt.c(i0Var, eVar, this) == objH) {
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
