package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: TextFieldGestureModifiers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1", f = "TextFieldGestureModifiers.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
public final class TextFieldGestureModifiersKt$longPressDragGestureFilter$1 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f7924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ r f7925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldGestureModifiersKt$longPressDragGestureFilter$1(r rVar, kotlin.coroutines.c<? super TextFieldGestureModifiersKt$longPressDragGestureFilter$1> cVar) {
        super(2, cVar);
        this.f7925d = rVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TextFieldGestureModifiersKt$longPressDragGestureFilter$1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TextFieldGestureModifiersKt$longPressDragGestureFilter$1 textFieldGestureModifiersKt$longPressDragGestureFilter$1 = new TextFieldGestureModifiersKt$longPressDragGestureFilter$1(this.f7925d, cVar);
        textFieldGestureModifiersKt$longPressDragGestureFilter$1.f7924c = obj;
        return textFieldGestureModifiersKt$longPressDragGestureFilter$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f7923b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f7924c;
            r rVar = this.f7925d;
            this.f7923b = 1;
            if (LongPressTextDragObserverKt.d(i0Var, rVar, this) == objH) {
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
